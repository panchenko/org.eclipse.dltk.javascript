package org.eclipse.dltk.internal.javascript.parser.structure;

import java.util.List;

import org.eclipse.dltk.compiler.IElementRequestor.FieldInfo;
import org.eclipse.dltk.compiler.IElementRequestor.MethodInfo;
import org.eclipse.dltk.compiler.ISourceElementRequestor;
import org.eclipse.dltk.internal.javascript.validation.AbstractNavigationVisitor;
import org.eclipse.dltk.javascript.ast.Argument;
import org.eclipse.dltk.javascript.ast.Expression;
import org.eclipse.dltk.javascript.ast.FunctionStatement;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.ast.PropertyExpression;
import org.eclipse.dltk.javascript.ast.StringLiteral;
import org.eclipse.dltk.javascript.ast.ThisExpression;
import org.eclipse.dltk.javascript.ast.VariableDeclaration;
import org.eclipse.dltk.javascript.ast.VariableStatement;
import org.eclipse.dltk.javascript.ast.XmlAttributeIdentifier;

public class StructureReporter2 extends AbstractNavigationVisitor<Object> {

	private final ISourceElementRequestor fRequestor;

	private boolean inFunction = false;

	public StructureReporter2(ISourceElementRequestor fRequestor) {
		this.fRequestor = fRequestor;
	}

	@Override
	public Object visitFunctionStatement(FunctionStatement node) {
		boolean isInFunction = inFunction;
		inFunction = true;
		MethodInfo methodInfo = new MethodInfo();
		try {
			methodInfo.declarationStart = node.sourceStart();
			if (node.getName() != null) {
				methodInfo.name = node.getName().getName();
				methodInfo.nameSourceStart = node.getName().sourceStart();
				methodInfo.nameSourceEnd = node.getName().sourceEnd() - 1;
			} else {
				methodInfo.name = "anon_function";
				methodInfo.nameSourceStart = node.getFunctionKeyword()
						.sourceStart();
				methodInfo.nameSourceEnd = node.getFunctionKeyword()
						.sourceEnd() - 1;
			}

			// TODO JSDoc support for @constructor
			methodInfo.isConstructor = false;

			// TODO JSDoc support for @type
			methodInfo.returnType = node.getReturnType() != null ? node
					.getReturnType().getName() : null;

			// TODO JSDoc support for @private and @deprecated
			// methodInfo.modifiers =

			List<Argument> arguments = node.getArguments();
			if (arguments != null && arguments.size() > 0) {
				String[] paramNames = new String[arguments.size()];
				String[] paramTypes = new String[arguments.size()];
				for (int i = 0; i < arguments.size(); i++) {
					Argument argument = arguments.get(i);
					paramNames[i] = argument.getArgumentName();
					// TODO if no type set we should try to get it from JSDoc ?
					// (See JSDocSupport)
					paramTypes[i] = argument.getType() != null ? argument
							.getType().getName() : null;
				}
				methodInfo.parameterNames = paramNames;
				methodInfo.parameterTypes = paramTypes;
			}
			fRequestor.enterMethod(methodInfo);
			return super.visitFunctionStatement(node);
		} finally {
			inFunction = isInFunction;
			fRequestor.exitMethod(node.sourceEnd());
		}
	}

	@Override
	public Object visitVariableStatment(VariableStatement node) {
		if (!inFunction) {
			List<VariableDeclaration> variables = node.getVariables();
			for (VariableDeclaration variableDeclaration : variables) {
				FieldInfo info = new FieldInfo();
				info.declarationStart = node.sourceStart();
				info.name = variableDeclaration.getVariableName();
				info.nameSourceStart = variableDeclaration.sourceStart();
				info.nameSourceEnd = variableDeclaration.sourceEnd() - 1;
				info.type = variableDeclaration.getType() != null ? variableDeclaration
						.getType().getName() : null;
				fRequestor.enterField(info);
				try {
					if (variableDeclaration.getInitializer() != null) {
						visit(variableDeclaration.getInitializer());
					}
				} finally {
					fRequestor.exitField(node.sourceEnd());
				}
			}
			return null;
		} else {
			return super.visitVariableStatment(node);
		}
	}

	@Override
	public Object visitPropertyExpression(PropertyExpression node) {
		if (node.getObject() instanceof ThisExpression) {
			Expression name = node.getProperty();
			String nameStr = null;
			if (name instanceof Identifier) {
				nameStr = ((Identifier) name).getName();
			} else if (name instanceof StringLiteral) {
				nameStr = ((StringLiteral) name).getValue();
			} else if (name instanceof XmlAttributeIdentifier) {
				nameStr = ((XmlAttributeIdentifier) name).getAttributeName();
			}
			if (nameStr != null) {
				FieldInfo info = new FieldInfo();
				info.declarationStart = node.sourceStart();
				info.name = nameStr;
				info.nameSourceStart = name.sourceStart();
				info.nameSourceEnd = name.sourceEnd() - 1;
				boolean added = fRequestor.enterFieldCheckDuplicates(info);
				try {
					return super.visitPropertyExpression(node);
				} finally {
					if (added)
						fRequestor.exitField(node.sourceEnd());
				}
			}
		}

		return super.visitPropertyExpression(node);
	}
}
