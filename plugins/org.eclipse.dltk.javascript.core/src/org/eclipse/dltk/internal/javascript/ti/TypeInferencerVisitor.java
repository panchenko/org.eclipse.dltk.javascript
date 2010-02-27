/*******************************************************************************
 * Copyright (c) 2010 xored software, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.internal.javascript.ti;

import java.util.List;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.javascript.ast.Argument;
import org.eclipse.dltk.javascript.ast.ArrayInitializer;
import org.eclipse.dltk.javascript.ast.AsteriskExpression;
import org.eclipse.dltk.javascript.ast.BinaryOperation;
import org.eclipse.dltk.javascript.ast.BooleanLiteral;
import org.eclipse.dltk.javascript.ast.BreakStatement;
import org.eclipse.dltk.javascript.ast.CallExpression;
import org.eclipse.dltk.javascript.ast.CaseClause;
import org.eclipse.dltk.javascript.ast.CommaExpression;
import org.eclipse.dltk.javascript.ast.ConditionalOperator;
import org.eclipse.dltk.javascript.ast.ConstStatement;
import org.eclipse.dltk.javascript.ast.ContinueStatement;
import org.eclipse.dltk.javascript.ast.DecimalLiteral;
import org.eclipse.dltk.javascript.ast.DefaultXmlNamespaceStatement;
import org.eclipse.dltk.javascript.ast.DeleteStatement;
import org.eclipse.dltk.javascript.ast.DoWhileStatement;
import org.eclipse.dltk.javascript.ast.EmptyExpression;
import org.eclipse.dltk.javascript.ast.Expression;
import org.eclipse.dltk.javascript.ast.ForEachInStatement;
import org.eclipse.dltk.javascript.ast.ForInStatement;
import org.eclipse.dltk.javascript.ast.ForStatement;
import org.eclipse.dltk.javascript.ast.FunctionStatement;
import org.eclipse.dltk.javascript.ast.GetAllChildrenExpression;
import org.eclipse.dltk.javascript.ast.GetArrayItemExpression;
import org.eclipse.dltk.javascript.ast.GetLocalNameExpression;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.ast.IfStatement;
import org.eclipse.dltk.javascript.ast.Keyword;
import org.eclipse.dltk.javascript.ast.LabelledStatement;
import org.eclipse.dltk.javascript.ast.NewExpression;
import org.eclipse.dltk.javascript.ast.NullExpression;
import org.eclipse.dltk.javascript.ast.ObjectInitializer;
import org.eclipse.dltk.javascript.ast.ObjectInitializerPart;
import org.eclipse.dltk.javascript.ast.ParenthesizedExpression;
import org.eclipse.dltk.javascript.ast.PropertyExpression;
import org.eclipse.dltk.javascript.ast.PropertyInitializer;
import org.eclipse.dltk.javascript.ast.RegExpLiteral;
import org.eclipse.dltk.javascript.ast.ReturnStatement;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.ast.SimpleType;
import org.eclipse.dltk.javascript.ast.Statement;
import org.eclipse.dltk.javascript.ast.StatementBlock;
import org.eclipse.dltk.javascript.ast.StringLiteral;
import org.eclipse.dltk.javascript.ast.SwitchComponent;
import org.eclipse.dltk.javascript.ast.SwitchStatement;
import org.eclipse.dltk.javascript.ast.ThisExpression;
import org.eclipse.dltk.javascript.ast.ThrowStatement;
import org.eclipse.dltk.javascript.ast.TryStatement;
import org.eclipse.dltk.javascript.ast.TypeOfExpression;
import org.eclipse.dltk.javascript.ast.UnaryOperation;
import org.eclipse.dltk.javascript.ast.VariableDeclaration;
import org.eclipse.dltk.javascript.ast.VariableStatement;
import org.eclipse.dltk.javascript.ast.VoidExpression;
import org.eclipse.dltk.javascript.ast.VoidOperator;
import org.eclipse.dltk.javascript.ast.WhileStatement;
import org.eclipse.dltk.javascript.ast.WithStatement;
import org.eclipse.dltk.javascript.ast.XmlAttributeIdentifier;
import org.eclipse.dltk.javascript.ast.XmlLiteral;
import org.eclipse.dltk.javascript.ast.YieldOperator;
import org.eclipse.dltk.javascript.internal.model.references.Type;
import org.eclipse.dltk.javascript.parser.JSParser;

public class TypeInferencerVisitor extends TypeInferencerVisitorBase {

	@Override
	public IValueReference visitArrayInitializer(ArrayInitializer node) {
		return IValueTypeFactory.INSTANCE.createArray();
	}

	@Override
	public IValueReference visitAsteriskExpression(AsteriskExpression node) {
		return IValueTypeFactory.INSTANCE.createXML();
	}

	@Override
	public IValueReference visitBinaryOperation(BinaryOperation node) {
		final IValueReference left = visit(node.getLeftExpression());
		final IValueReference right = visit(node.getRightExpression());
		if (JSParser.ASSIGN == node.getOperation()) {
			if (left != null)
				left.addValue(right);
		}
		// TODO handle other operations
		return right;
	}

	@Override
	public IValueReference visitBooleanLiteral(BooleanLiteral node) {
		return IValueTypeFactory.INSTANCE.createBoolean();
	}

	@Override
	public IValueReference visitBreakStatement(BreakStatement node) {
		return null;
	}

	@Override
	public IValueReference visitCallExpression(CallExpression node) {
		final IValueReference reference = visit(node.getExpression());
		for (ASTNode argument : node.getArguments()) {
			visit(argument);
		}
		if (reference != null) {
			return reference.getChild(IValueReference.FUNCTION_OP);
		} else {
			return null;
		}
	}

	@Override
	public IValueReference visitCommaExpression(CommaExpression node) {
		return visit(node.getItems());
	}

	@Override
	public IValueReference visitConditionalOperator(ConditionalOperator node) {
		visit(node.getCondition());
		return merge(visit(node.getTrueValue()), visit(node.getFalseValue()));
	}

	@Override
	public IValueReference visitConstDeclaration(ConstStatement node) {
		final IValueCollection context = peekContext();
		for (VariableDeclaration declaration : node.getVariables()) {
			createVariable(context, declaration);
		}
		return null;
	}

	private IValueReference createVariable(IValueCollection context,
			VariableDeclaration declaration) {
		final Identifier identifier = declaration.getIdentifier();
		final String varName = identifier.getName();
		final IValueReference reference = context.getChild(varName,
				GetMode.CREATE);
		if (declaration.getType() != null) {
			final Type type = IValueTypeFactory.INSTANCE.get(declaration
					.getType().getName());
			if (type != null) {
				reference.setDeclaredType(type);
			}
		}
		reference.setKind(ReferenceKind.LOCAL);
		reference.setLocation(ReferenceLocation.create(declaration
				.sourceStart(), declaration.sourceEnd(), identifier
				.sourceStart(), identifier.sourceEnd()));
		if (declaration.getInitializer() != null) {
			reference.addValue(visit(declaration.getInitializer()));
		}
		return reference;
	}

	@Override
	public IValueReference visitContinueStatement(ContinueStatement node) {
		return null;
	}

	@Override
	public IValueReference visitDecimalLiteral(DecimalLiteral node) {
		return IValueTypeFactory.INSTANCE.createNumber();
	}

	@Override
	public IValueReference visitDefaultXmlNamespace(
			DefaultXmlNamespaceStatement node) {
		visit(node.getValue());
		return null;
	}

	@Override
	public IValueReference visitDeleteStatement(DeleteStatement node) {
		IValueReference value = visit(node.getExpression());
		if (value != null && value.getParent() != null) {
			value.getParent().deleteChild(value.getName());
		}
		return IValueTypeFactory.INSTANCE.createBoolean();
	}

	@Override
	public IValueReference visitDoWhileStatement(DoWhileStatement node) {
		visit(node.getCondition());
		visit(node.getBody());
		return null;
	}

	@Override
	public IValueReference visitEmptyExpression(EmptyExpression node) {
		return null;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.eclipse.dltk.javascript.ast.ASTVisitor#visitForEachInStatement(org
	 * .eclipse.dltk.javascript.ast.ForEachInStatement)
	 */
	@Override
	public IValueReference visitForEachInStatement(ForEachInStatement node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IValueReference visitForInStatement(ForInStatement node) {
		final IValueReference item = visit(node.getItem());
		if (item != null) {
			item.addValue(IValueTypeFactory.INSTANCE.createString());
		}
		visit(node.getIterator());
		visit(node.getBody());
		return null;
	}

	@Override
	public IValueReference visitForStatement(ForStatement node) {
		if (node.getInitial() != null)
			visit(node.getInitial());
		if (node.getCondition() != null)
			visit(node.getCondition());
		if (node.getStep() != null)
			visit(node.getStep());
		if (node.getBody() != null)
			visit(node.getBody());
		return null;
	}

	@Override
	public IValueReference visitFunctionStatement(FunctionStatement node) {
		final IValueCollection function = new FunctionValueCollection();
		final List<Argument> arguments = node.getArguments();
		final IValueReference[] refArgs = new IValueReference[arguments.size()];
		int argIndex = 0;
		for (Argument argument : arguments) {
			final IValueReference refArg = function.getChild(argument
					.getIdentifier().getName(), GetMode.CREATE);
			refArg.setKind(ReferenceKind.ARGUMENT);
			if (argument.getType() != null) {
				refArg.setDeclaredType(IValueTypeFactory.INSTANCE.get(argument
						.getType().getName()));
			}
			refArgs[argIndex++] = refArg;
		}
		enterContext(function);
		visit(node.getBody());
		leaveContext();
		final IValueReference result;
		final Identifier name = node.getName();
		if (name != null) {
			result = peekContext().getChild(name.getName(), GetMode.CREATE);
			result.setLocation(ReferenceLocation.create(node.sourceStart(),
					node.sourceEnd(), name.sourceStart(), name.sourceEnd()));
		} else {
			result = new ValueReference();
			final Keyword kw = node.getFunctionKeyword();
			result.setLocation(ReferenceLocation.create(node.sourceStart(),
					node.sourceEnd(), kw.sourceStart(), kw.sourceEnd()));
		}
		result.setKind(ReferenceKind.FUNCTION);
		result.setAttribute(IReferenceAttributes.PARAMETERS, refArgs);
		result.setAttribute(IReferenceAttributes.FUNCTION_SCOPE, function);
		result.getChild(IValueReference.FUNCTION_OP, GetMode.CREATE).addValue(
				function.getReturnValue());
		return result;
	}

	@Override
	public IValueReference visitGetAllChildrenExpression(
			GetAllChildrenExpression node) {
		return IValueTypeFactory.INSTANCE.createXML();
	}

	@Override
	public IValueReference visitGetArrayItemExpression(
			GetArrayItemExpression node) {
		final IValueReference array = visit(node.getArray());
		visit(node.getIndex());
		if (array != null) {
			// TODO extract array type from result?
			if (node.getIndex() instanceof StringLiteral) {
				return array.getChild(extractName(node.getIndex()),
						GetMode.CREATE_LAZY);
			}
		}
		return null;
	}

	@Override
	public IValueReference visitGetLocalNameExpression(
			GetLocalNameExpression node) {
		return null;
	}

	@Override
	public IValueReference visitIdentifier(Identifier node) {
		return peekContext().getChild(node.getName(), GetMode.CREATE_LAZY);
	}

	@Override
	public IValueReference visitIfStatement(IfStatement node) {
		visit(node.getCondition());
		if (node.getThenStatement() != null) {
			visit(node.getThenStatement());
		}
		if (node.getElseStatement() != null) {
			visit(node.getElseStatement());
		}
		return null;
	}

	@Override
	public IValueReference visitLabelledStatement(LabelledStatement node) {
		visit(node.getStatement());
		return null;
	}

	@Override
	public IValueReference visitNewExpression(NewExpression node) {
		final IValueReference result = new ValueReference();
		final IValueReference clazz = visit(node.getObjectClass());
		final IValueReference newType = result.getChild(
				IValueReference.FUNCTION_OP, GetMode.CREATE);
		if (clazz != null) {
			final Type type = IValueTypeFactory.INSTANCE.get(clazz.getName());
			if (type != null) {
				newType.addValue(IValueTypeFactory.INSTANCE.create(type));
				return result;
			}
		}
		newType.addValue(IValueTypeFactory.INSTANCE.createObject());
		return result;
	}

	@Override
	public IValueReference visitNullExpression(NullExpression node) {
		return null;
	}

	@Override
	public IValueReference visitObjectInitializer(ObjectInitializer node) {
		final IValueReference result = new ValueReference();
		for (ObjectInitializerPart part : node.getInitializers()) {
			if (part instanceof PropertyInitializer) {
				final PropertyInitializer pi = (PropertyInitializer) part;
				final String name = extractName(pi.getName());
				final IValueReference value = visit(pi.getValue());
				if (name != null) {
					result.getChild(name, GetMode.CREATE).addValue(value);
				}
			} else {
				// TODO handle get/set methods
			}
		}
		return result;
	}

	@Override
	public IValueReference visitParenthesizedExpression(
			ParenthesizedExpression node) {
		return visit(node.getExpression());
	}

	@Override
	public IValueReference visitPropertyExpression(PropertyExpression node) {
		final IValueReference object = visit(node.getObject());
		final String name = extractName(node.getProperty());
		if (object != null && name != null) {
			return object.getChild(name, GetMode.CREATE_LAZY);
		} else {
			return null;
		}
	}

	private static String extractName(Expression name) {
		if (name instanceof Identifier) {
			return ((Identifier) name).getName();
		} else if (name instanceof StringLiteral) {
			return ((StringLiteral) name).getValue();
		} else {
			return null;
		}
	}

	@Override
	public IValueReference visitRegExpLiteral(RegExpLiteral node) {
		return IValueTypeFactory.INSTANCE.createRegExp();
	}

	@Override
	public IValueReference visitReturnStatement(ReturnStatement node) {
		if (node.getValue() != null) {
			final IValueReference value = visit(node.getValue());
			if (value != null) {
				final IValueReference returnValue = peekContext()
						.getReturnValue();
				if (returnValue != null) {
					returnValue.addValue(value);
				}
			}
		}
		return null;
	}

	@Override
	public IValueReference visitScript(Script node) {
		return visit(node.getStatements());
	}

	@Override
	public IValueReference visitSimpleType(SimpleType node) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public IValueReference visitStatementBlock(StatementBlock node) {
		for (Statement statement : node.getStatements()) {
			visit(statement);
		}
		return null;
	}

	@Override
	public IValueReference visitStringLiteral(StringLiteral node) {
		return IValueTypeFactory.INSTANCE.createString();
	}

	@Override
	public IValueReference visitSwitchStatement(SwitchStatement node) {
		if (node.getCondition() != null)
			visit(node.getCondition());
		for (SwitchComponent component : node.getCaseClauses()) {
			if (component instanceof CaseClause) {
				visit(((CaseClause) component).getCondition());
			}
			visit(component.getStatements());
		}
		return null;
	}

	@Override
	public IValueReference visitThisExpression(ThisExpression node) {
		return peekContext().getThis();
	}

	@Override
	public IValueReference visitThrowStatement(ThrowStatement node) {
		visit(node.getException());
		return null;
	}

	@Override
	public IValueReference visitTryStatement(TryStatement node) {
		// visit(node.getBody());
		return null;
	}

	@Override
	public IValueReference visitTypeOfExpression(TypeOfExpression node) {
		return IValueTypeFactory.INSTANCE.createString();
	}

	@Override
	public IValueReference visitUnaryOperation(UnaryOperation node) {
		return visit(node.getExpression());
	}

	@Override
	public IValueReference visitVariableStatment(VariableStatement node) {
		final IValueCollection context = peekContext();
		IValueReference result = null;
		for (VariableDeclaration declaration : node.getVariables()) {
			result = createVariable(context, declaration);
		}
		return result;
	}

	@Override
	public IValueReference visitVoidExpression(VoidExpression node) {
		visit(node.getExpression());
		return null;
	}

	@Override
	public IValueReference visitVoidOperator(VoidOperator node) {
		visit(node.getExpression());
		return null;
	}

	@Override
	public IValueReference visitWhileStatement(WhileStatement node) {
		if (node.getCondition() != null)
			visit(node.getCondition());
		if (node.getBody() != null)
			visit(node.getBody());
		return null;
	}

	@Override
	public IValueReference visitWithStatement(WithStatement node) {
		final IValueReference with = visit(node.getExpression());
		if (with != null) {
			final WithValueCollection withCollection = new WithValueCollection(
					peekContext(), with);
			enterContext(withCollection);
			visit(node.getStatement());
			leaveContext();
		} else {
			visit(node.getStatement());
		}
		return null;
	}

	@Override
	public IValueReference visitXmlLiteral(XmlLiteral node) {
		// TODO parse XML and extend model
		return IValueTypeFactory.INSTANCE.createXML();
	}

	@Override
	public IValueReference visitXmlPropertyIdentifier(
			XmlAttributeIdentifier node) {
		return IValueTypeFactory.INSTANCE.createXML();
	}

	@Override
	public IValueReference visitYieldOperator(YieldOperator node) {
		final IValueReference value = visit(node.getExpression());
		if (value != null) {
			final IValueReference reference = peekContext().getReturnValue();
			if (reference != null) {
				reference.addValue(value);
			}
		}
		return null;
	}

}
