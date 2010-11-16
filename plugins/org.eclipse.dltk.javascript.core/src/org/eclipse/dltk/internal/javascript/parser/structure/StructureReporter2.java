package org.eclipse.dltk.internal.javascript.parser.structure;

import java.util.List;

import org.eclipse.dltk.compiler.IElementRequestor.FieldInfo;
import org.eclipse.dltk.compiler.IElementRequestor.MethodInfo;
import org.eclipse.dltk.compiler.ISourceElementRequestor;
import org.eclipse.dltk.internal.javascript.parser.JSModifiers;
import org.eclipse.dltk.internal.javascript.ti.JSMethod;
import org.eclipse.dltk.internal.javascript.ti.JSVariable;
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
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IParameter;
import org.eclipse.dltk.javascript.typeinfo.TypeInfoManager;

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
			final JSMethod method = new JSMethod();
			if (node.getName() != null) {
				method.setName(node.getName().getName());
				methodInfo.nameSourceStart = node.getName().sourceStart();
				methodInfo.nameSourceEnd = node.getName().sourceEnd() - 1;
			} else {
				method.setName("anon_function");
				methodInfo.nameSourceStart = node.getFunctionKeyword()
						.sourceStart();
				methodInfo.nameSourceEnd = node.getFunctionKeyword()
						.sourceEnd() - 1;
			}
			
			org.eclipse.dltk.javascript.ast.Type funcType = node
					.getReturnType();
			if (funcType != null) {
				method.setType(funcType.getName());
			}
			for (Argument argument : node.getArguments()) {
				final IParameter parameter = method.createParameter();
				parameter.setName(argument.getIdentifier().getName());
				org.eclipse.dltk.javascript.ast.Type paramType = argument.getType();
				if (paramType != null) {
					parameter.setType(paramType.getName());
				}
				method.getParameters().add(parameter);
			}
			for (IModelBuilder extension : TypeInfoManager.getModelBuilders()) {
				extension.processMethod(node, method);
			}

			methodInfo.name = method.getName();

			methodInfo.isConstructor = method.isConstructor();

			methodInfo.returnType = method.getType();

			if (method.isDeprecated()) {
				methodInfo.modifiers |= JSModifiers.DEPRECATED;
			}
			if (method.isPrivate()) {
				methodInfo.modifiers |= JSModifiers.PRIVATE;
			}

			List<IParameter> parameters = method.getParameters();
			if (parameters != null && parameters.size() > 0) {
				String[] paramNames = new String[parameters.size()];
				String[] paramTypes = new String[parameters.size()];
				for (int i = 0; i < parameters.size(); i++) {
					IParameter parameter = parameters.get(i);
					paramNames[i] = parameter.getName();
					paramTypes[i] = parameter.getType();
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
				
				final JSVariable variable = new JSVariable();
				variable.setName(variableDeclaration.getVariableName());
				if (variableDeclaration.getType() != null)
					variable.setType(variableDeclaration.getType().getName());
				for (IModelBuilder extension : TypeInfoManager.getModelBuilders()) {
					extension.processVariable(node, variable);
				}

				FieldInfo info = new FieldInfo();
				info.name = variable.getName();
				info.declarationStart = node.sourceStart();
				if (variableDeclaration.getIdentifier() != null) {
					info.nameSourceStart = variableDeclaration.getIdentifier()
							.sourceStart();
					info.nameSourceEnd = variableDeclaration.getIdentifier()
							.sourceEnd() - 1;
				} else {
					info.nameSourceStart = variableDeclaration.sourceStart();
					info.nameSourceEnd = variableDeclaration.sourceEnd() - 1;
				}
				info.type = variable.getType();
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
