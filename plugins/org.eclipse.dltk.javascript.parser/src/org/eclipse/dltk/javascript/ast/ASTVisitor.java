/*******************************************************************************
 * Copyright (c) 2009 xored software, Inc.  
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html  
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Vladimir Belov)
 *******************************************************************************/

package org.eclipse.dltk.javascript.ast;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.dltk.ast.ASTNode;

public abstract class ASTVisitor<E> {

	public void visit(Collection<? extends ASTNode> nodes) {
		for (ASTNode node : nodes) {
			visit(node);
		}
	}

	private static interface Handler {
		<E> E handle(ASTVisitor<E> visitor, ASTNode node);
	}

	private static final Map<Class<? extends ASTNode>, Handler> HANDLERS = new HashMap<Class<? extends ASTNode>, Handler>();

	static {
		HANDLERS.put(ArrayInitializer.class, new Handler() {
			public <E> E handle(ASTVisitor<E> visitor, ASTNode node) {
				return visitor.visitArrayInitializer((ArrayInitializer) node);
			}
		});
		HANDLERS.put(BinaryOperation.class, new Handler() {
			public <E> E handle(ASTVisitor<E> visitor, ASTNode node) {
				return visitor.visitBinaryOperation((BinaryOperation) node);
			}
		});
		HANDLERS.put(BooleanLiteral.class, new Handler() {
			public <E> E handle(ASTVisitor<E> visitor, ASTNode node) {
				return visitor.visitBooleanLiteral((BooleanLiteral) node);
			}
		});
		HANDLERS.put(BreakStatement.class, new Handler() {
			public <E> E handle(ASTVisitor<E> visitor, ASTNode node) {
				return visitor.visitBreakStatement((BreakStatement) node);
			}
		});
		HANDLERS.put(CallExpression.class, new Handler() {
			public <E> E handle(ASTVisitor<E> visitor, ASTNode node) {
				return visitor.visitCallExpression((CallExpression) node);
			}
		});
		// HANDLERS.put(CaseClause.class, new Handler() {
		// public <E> E handle(ASTVisitor<E> visitor, ASTNode node) {
		// return visitor.visitCaseClause((CaseClause) node);
		// }
		// });
		HANDLERS.put(CatchClause.class, new Handler() {
			public <E> E handle(ASTVisitor<E> visitor, ASTNode node) {
				return visitor.visitCatchClause((CatchClause) node);
			}
		});
		HANDLERS.put(CommaExpression.class, new Handler() {
			public <E> E handle(ASTVisitor<E> visitor, ASTNode node) {
				return visitor.visitCommaExpression((CommaExpression) node);
			}
		});
		HANDLERS.put(ConditionalOperator.class, new Handler() {
			public <E> E handle(ASTVisitor<E> visitor, ASTNode node) {
				return visitor
						.visitConditionalOperator((ConditionalOperator) node);
			}
		});
		HANDLERS.put(ConstStatement.class, new Handler() {
			public <E> E handle(ASTVisitor<E> visitor, ASTNode node) {
				return visitor.visitConstDeclaration((ConstStatement) node);
			}
		});
		HANDLERS.put(ContinueStatement.class, new Handler() {
			public <E> E handle(ASTVisitor<E> visitor, ASTNode node) {
				return visitor.visitContinueStatement((ContinueStatement) node);
			}
		});
		HANDLERS.put(DecimalLiteral.class, new Handler() {
			public <E> E handle(ASTVisitor<E> visitor, ASTNode node) {
				return visitor.visitDecimalLiteral((DecimalLiteral) node);
			}
		});
		// HANDLERS.put(DefaultClause.class, new Handler() {
		// public <E> E handle(ASTVisitor<E> visitor, ASTNode node) {
		// return visitor.visitDefaultClause((DefaultClause) node);
		// }
		// });
		HANDLERS.put(DeleteStatement.class, new Handler() {
			public <E> E handle(ASTVisitor<E> visitor, ASTNode node) {
				return visitor.visitDeleteStatement((DeleteStatement) node);
			}
		});
		HANDLERS.put(DoWhileStatement.class, new Handler() {
			public <E> E handle(ASTVisitor<E> visitor, ASTNode node) {
				return visitor.visitDoWhileStatement((DoWhileStatement) node);
			}
		});
		HANDLERS.put(EmptyExpression.class, new Handler() {
			public <E> E handle(ASTVisitor<E> visitor, ASTNode node) {
				return visitor.visitEmptyExpression((EmptyExpression) node);
			}
		});
		HANDLERS.put(ExceptionFilter.class, new Handler() {
			public <E> E handle(ASTVisitor<E> visitor, ASTNode node) {
				return visitor.visitExceptionFilter((ExceptionFilter) node);
			}
		});
		HANDLERS.put(FinallyClause.class, new Handler() {
			public <E> E handle(ASTVisitor<E> visitor, ASTNode node) {
				return visitor.visitFinallyClause((FinallyClause) node);
			}
		});
		HANDLERS.put(ForStatement.class, new Handler() {
			public <E> E handle(ASTVisitor<E> visitor, ASTNode node) {
				return visitor.visitForStatement((ForStatement) node);
			}
		});
		// HANDLERS.put(.class, new Handler() {
		// public <E> E handle(ASTVisitor<E> visitor, ASTNode node) {
		// return visitor.(() node);
		// }
		// });
	}

	public E visit(ASTNode node) {
		final Handler handler = HANDLERS.get(node.getClass());
		if (handler != null) {
			return handler.handle(this, node);
		}

		if (node.getClass() == ForInStatement.class)
			return visitForInStatement((ForInStatement) node);

		if (node.getClass() == ForEachInStatement.class)
			return visitForEachInStatement((ForEachInStatement) node);

		if (node.getClass() == FunctionStatement.class)
			return visitFunctionStatement((FunctionStatement) node);

		if (node.getClass() == Argument.class)
			return visitArgument((Argument) node);

		if (node.getClass() == GetArrayItemExpression.class)
			return visitGetArrayItemExpression((GetArrayItemExpression) node);

		if (node.getClass() == GetMethod.class)
			return visitGetMethod((GetMethod) node);

		if (node.getClass() == Identifier.class)
			return visitIdentifier((Identifier) node);

		if (node.getClass() == SimpleType.class)
			return visitSimpleType((SimpleType) node);

		if (node.getClass() == IfStatement.class)
			return visitIfStatement((IfStatement) node);

		if (node.getClass() == Keyword.class)
			return visitKeyword((Keyword) node);

		if (node.getClass() == LabelledStatement.class)
			return visitLabelledStatement((LabelledStatement) node);

		if (node.getClass() == NewExpression.class)
			return visitNewExpression((NewExpression) node);

		if (node.getClass() == NullExpression.class)
			return visitNullExpression((NullExpression) node);

		if (node.getClass() == ObjectInitializer.class)
			return visitObjectInitializer((ObjectInitializer) node);

		if (node.getClass() == ParenthesizedExpression.class)
			return visitParenthesizedExpression((ParenthesizedExpression) node);

		if (node.getClass() == PropertyExpression.class)
			return visitPropertyExpression((PropertyExpression) node);

		if (node.getClass() == PropertyInitializer.class)
			return visitPropertyInitializer((PropertyInitializer) node);

		if (node.getClass() == RegExpLiteral.class)
			return visitRegExpLiteral((RegExpLiteral) node);

		if (node.getClass() == ReturnStatement.class)
			return visitReturnStatement((ReturnStatement) node);

		if (node.getClass() == Script.class)
			return visitScript((Script) node);

		if (node.getClass() == SetMethod.class)
			return visitSetMethod((SetMethod) node);

		if (node.getClass() == StatementBlock.class)
			return visitStatementBlock((StatementBlock) node);

		if (node.getClass() == StringLiteral.class)
			return visitStringLiteral((StringLiteral) node);

		if (node.getClass() == SwitchStatement.class)
			return visitSwitchStatement((SwitchStatement) node);

		if (node.getClass() == ThisExpression.class)
			return visitThisExpression((ThisExpression) node);

		if (node.getClass() == ThrowStatement.class)
			return visitThrowStatement((ThrowStatement) node);

		if (node.getClass() == TryStatement.class)
			return visitTryStatement((TryStatement) node);

		if (node.getClass() == TypeOfExpression.class)
			return visitTypeOfExpression((TypeOfExpression) node);

		if (node.getClass() == UnaryOperation.class)
			return visitUnaryOperation((UnaryOperation) node);

		if (node.getClass() == VariableStatement.class)
			return visitVariableStatment((VariableStatement) node);

		if (node.getClass() == VariableDeclaration.class)
			return visitVariableDeclaration((VariableDeclaration) node);

		if (node.getClass() == VoidExpression.class)
			return visitVoidExpression((VoidExpression) node);

		if (node.getClass() == WhileStatement.class)
			return visitWhileStatement((WhileStatement) node);

		if (node.getClass() == WithStatement.class)
			return visitWithStatement((WithStatement) node);

		if (node.getClass() == VoidOperator.class)
			return visitVoidOperator((VoidOperator) node);

		if (node.getClass() == XmlLiteral.class)
			return visitXmlLiteral((XmlLiteral) node);

		if (node.getClass() == DefaultXmlNamespaceStatement.class)
			return visitDefaultXmlNamespace((DefaultXmlNamespaceStatement) node);

		if (node.getClass() == XmlAttributeIdentifier.class)
			return visitXmlPropertyIdentifier((XmlAttributeIdentifier) node);

		if (node.getClass() == AsteriskExpression.class)
			return visitAsteriskExpression((AsteriskExpression) node);

		if (node.getClass() == GetAllChildrenExpression.class)
			return visitGetAllChildrenExpression((GetAllChildrenExpression) node);

		if (node.getClass() == GetLocalNameExpression.class)
			return visitGetLocalNameExpression((GetLocalNameExpression) node);

		if (node.getClass() == YieldOperator.class)
			return visitYieldOperator((YieldOperator) node);

		return visitUnknownNode(node);
	}

	public abstract E visitArrayInitializer(ArrayInitializer node);

	public abstract E visitBinaryOperation(BinaryOperation node);

	public abstract E visitBooleanLiteral(BooleanLiteral node);

	public abstract E visitBreakStatement(BreakStatement node);

	public abstract E visitCallExpression(CallExpression node);

	@Deprecated
	public final E visitCaseClause(CaseClause node) {
		return null;
	}

	public abstract E visitCatchClause(CatchClause node);

	public abstract E visitCommaExpression(CommaExpression node);

	public abstract E visitConditionalOperator(ConditionalOperator node);

	public abstract E visitConstDeclaration(ConstStatement node);

	public abstract E visitContinueStatement(ContinueStatement node);

	public abstract E visitDecimalLiteral(DecimalLiteral node);

	@Deprecated
	public final E visitDefaultClause(DefaultClause node) {
		return null;
	}

	public abstract E visitDeleteStatement(DeleteStatement node);

	public abstract E visitDoWhileStatement(DoWhileStatement node);

	public abstract E visitEmptyExpression(EmptyExpression node);

	public abstract E visitExceptionFilter(ExceptionFilter node);

	public abstract E visitFinallyClause(FinallyClause node);

	public abstract E visitForStatement(ForStatement node);

	public abstract E visitForInStatement(ForInStatement node);

	public abstract E visitForEachInStatement(ForEachInStatement node);

	public abstract E visitFunctionStatement(FunctionStatement node);

	public abstract E visitArgument(Argument argument);

	public abstract E visitGetArrayItemExpression(GetArrayItemExpression node);

	public abstract E visitGetMethod(GetMethod node);

	public abstract E visitIdentifier(Identifier node);

	public abstract E visitSimpleType(SimpleType node);

	public abstract E visitIfStatement(IfStatement node);

	public abstract E visitKeyword(Keyword node);

	@Deprecated
	public final E visitLabel(Label node) {
		return null;
	}

	public abstract E visitLabelledStatement(LabelledStatement node);

	public abstract E visitNewExpression(NewExpression node);

	public abstract E visitNullExpression(NullExpression node);

	public abstract E visitObjectInitializer(ObjectInitializer node);

	public abstract E visitParenthesizedExpression(ParenthesizedExpression node);

	public abstract E visitPropertyExpression(PropertyExpression node);

	public abstract E visitPropertyInitializer(PropertyInitializer node);

	public abstract E visitRegExpLiteral(RegExpLiteral node);

	public abstract E visitReturnStatement(ReturnStatement node);

	public abstract E visitScript(Script node);

	public abstract E visitSetMethod(SetMethod node);

	public abstract E visitStatementBlock(StatementBlock node);

	public abstract E visitStringLiteral(StringLiteral node);

	public abstract E visitSwitchStatement(SwitchStatement node);

	public abstract E visitThisExpression(ThisExpression node);

	public abstract E visitThrowStatement(ThrowStatement node);

	public abstract E visitTryStatement(TryStatement node);

	public abstract E visitTypeOfExpression(TypeOfExpression node);

	public abstract E visitUnaryOperation(UnaryOperation node);

	public abstract E visitVariableStatment(VariableStatement node);

	public abstract E visitVariableDeclaration(VariableDeclaration node);

	public abstract E visitVoidExpression(VoidExpression node);

	public abstract E visitVoidOperator(VoidOperator node);

	public abstract E visitYieldOperator(YieldOperator node);

	public abstract E visitWhileStatement(WhileStatement node);

	public abstract E visitWithStatement(WithStatement node);

	public abstract E visitXmlLiteral(XmlLiteral node);

	public abstract E visitDefaultXmlNamespace(DefaultXmlNamespaceStatement node);

	public abstract E visitXmlPropertyIdentifier(XmlAttributeIdentifier node);

	public abstract E visitAsteriskExpression(AsteriskExpression node);

	public abstract E visitGetAllChildrenExpression(
			GetAllChildrenExpression node);

	public abstract E visitGetLocalNameExpression(GetLocalNameExpression node);

	/**
	 * @since 2.0
	 */
	public E visitUnknownNode(ASTNode node) {
		throw new UnsupportedOperationException("Unknown node type: "
				+ node.getClass());
	}

}
