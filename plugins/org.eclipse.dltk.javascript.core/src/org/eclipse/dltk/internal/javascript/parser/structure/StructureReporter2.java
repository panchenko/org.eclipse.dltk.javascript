package org.eclipse.dltk.internal.javascript.parser.structure;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.compiler.IElementRequestor.FieldInfo;
import org.eclipse.dltk.compiler.IElementRequestor.MethodInfo;
import org.eclipse.dltk.compiler.ISourceElementRequestor;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.search.indexing.IIndexRequestor;
import org.eclipse.dltk.internal.javascript.parser.JSModifiers;
import org.eclipse.dltk.internal.javascript.ti.IReferenceAttributes;
import org.eclipse.dltk.internal.javascript.ti.ITypeInferenceContext;
import org.eclipse.dltk.internal.javascript.ti.JSMethod;
import org.eclipse.dltk.internal.javascript.ti.JSVariable;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencer2;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencerVisitor;
import org.eclipse.dltk.internal.javascript.validation.AbstractNavigationVisitor;
import org.eclipse.dltk.javascript.ast.Argument;
import org.eclipse.dltk.javascript.ast.BinaryOperation;
import org.eclipse.dltk.javascript.ast.CallExpression;
import org.eclipse.dltk.javascript.ast.Expression;
import org.eclipse.dltk.javascript.ast.FunctionStatement;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.ast.ObjectInitializer;
import org.eclipse.dltk.javascript.ast.PropertyExpression;
import org.eclipse.dltk.javascript.ast.PropertyInitializer;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.ast.StringLiteral;
import org.eclipse.dltk.javascript.ast.ThisExpression;
import org.eclipse.dltk.javascript.ast.VariableDeclaration;
import org.eclipse.dltk.javascript.ast.VariableStatement;
import org.eclipse.dltk.javascript.ast.XmlAttributeIdentifier;
import org.eclipse.dltk.javascript.parser.JSParser;
import org.eclipse.dltk.javascript.parser.PropertyExpressionUtils;
import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinference.ReferenceKind;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IMethod;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IParameter;
import org.eclipse.dltk.javascript.typeinfo.TypeInfoManager;

public class StructureReporter2 extends AbstractNavigationVisitor<Object> {

	private final ISourceElementRequestor fRequestor;

	private boolean inFunction = false;

	private final boolean indexer;

	private Script script;

	private Map<Identifier, Integer> resolvedIdentifiers;

	public StructureReporter2(ISourceElementRequestor fRequestor) {
		this.fRequestor = fRequestor;
		indexer = fRequestor instanceof IIndexRequestor;
	}

	public void beginReporting(Script script, IModelElement element) {
		this.script = script;
		inFunction = false;
		fRequestor.enterModule();
		if (indexer) {
			final TypeInferencer2 inferencer = new TypeInferencer2();
			inferencer.setModelElement(element);
			IdentifierLookupVisitor visitor = new IdentifierLookupVisitor(inferencer);
			inferencer.setVisitor(visitor);
			inferencer.doInferencing(script);
			visitor.processUnknowReferences();

			resolvedIdentifiers = visitor
					.getResolvedIdentifiers();
		}
	}

	public void endReporting() {
		fRequestor.exitModule(script.sourceEnd());
	}

	@Override
	public Object visitIdentifier(Identifier node) {
		if (indexer) {
			Integer argCount = resolvedIdentifiers.get(node);
			if (argCount != null) {
				// ignore locals.
				if (argCount != -2) {
					// report fields.
					if (argCount == -1) {
						fRequestor.acceptFieldReference(node.getName(),
								node.sourceStart());
					} else {
						// else methods.
						fRequestor.acceptMethodReference(node.getName(),
								argCount.intValue(), node.sourceStart(),
								node.sourceEnd() - 1);
					}
				}
			} else {
				ASTNode parent = node.getParent();
				if (parent instanceof PropertyExpression
						&& ((PropertyExpression) parent).getProperty() == node) {
					while (parent instanceof PropertyExpression) {
						parent = ((PropertyExpression) parent).getParent();
					}
				}
				if (parent instanceof CallExpression) {
					// it was a none resolved function call, do report it so
					// that searches will be able to find them.
					fRequestor.acceptMethodReference(node.getName(),
							((CallExpression) parent).getArguments().size(),
							node.sourceStart(), node.sourceEnd() - 1);
				} else if (!(parent instanceof PropertyInitializer)) {
					// else it is a not resolved field reference, also report
					// this one.
					// that searches will be able to find them.
					fRequestor.acceptFieldReference(node.getName(),
							node.sourceStart());
				}
			}
		}
		return super.visitIdentifier(node);
	}


	@Override
	public Object visitFunctionStatement(FunctionStatement node) {
		boolean isInFunction = inFunction;
		inFunction = true;
		MethodInfo methodInfo = new MethodInfo();
		try {
			methodInfo.declarationStart = node.sourceStart();
			final JSMethod method = new JSMethod();
			Identifier thisIdentifier;
			if (node.getName() != null) {
				setNameProperties(node.getName(), methodInfo, method);
			} else if (node.getParent() instanceof PropertyInitializer
					&& ((PropertyInitializer) node.getParent()).getName() instanceof Identifier) {
				setNameProperties(
						(Identifier) ((PropertyInitializer) node
						.getParent())
								.getName(),
						methodInfo, method);

			} else if (node.getParent() instanceof VariableDeclaration
					&& ((VariableDeclaration) node.getParent()).getIdentifier() != null) {
				setNameProperties(
						((VariableDeclaration) node.getParent())
								.getIdentifier(),
						methodInfo, method);
			} else if ((thisIdentifier = getThisIdentifier(node)) != null) {
				setNameProperties(thisIdentifier, methodInfo, method);

			} else if (node.getParent() instanceof BinaryOperation
					&& ((BinaryOperation) node.getParent()).getOperation() == JSParser.ASSIGN
					&& ((BinaryOperation) node.getParent()).getLeftExpression() instanceof PropertyExpression) {
				Expression expression = ((BinaryOperation) node.getParent())
						.getLeftExpression();
				method.setName(PropertyExpressionUtils.getPath(expression));
				methodInfo.nameSourceStart = expression.sourceStart();
				methodInfo.nameSourceEnd = expression.sourceEnd() - 1;
			}
			else {
				method.setName("");
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

	/**
	 * @param node
	 * @return
	 */
	private Identifier getThisIdentifier(FunctionStatement fs) {
		ASTNode node = fs.getParent();
		if (node instanceof BinaryOperation) {
			node = ((BinaryOperation) node).getLeftExpression();
			if (node instanceof PropertyExpression) {
				Expression property = ((PropertyExpression) node).getProperty();
				node = ((PropertyExpression) node).getObject();
				if (node instanceof ThisExpression
						&& property instanceof Identifier) {
					return (Identifier) property;
				}
			}
		}
		return null;
	}

	/**
	 * @param node
	 * @param methodInfo
	 * @param method
	 */
	private void setNameProperties(Identifier node,
			MethodInfo methodInfo, final JSMethod method) {
		method.setName(node.getName());
		methodInfo.nameSourceStart = node.sourceStart();
		methodInfo.nameSourceEnd = node.sourceEnd() - 1;
	}

	@Override
	public Object visitObjectInitializer(ObjectInitializer node) {
		FieldInfo info = null;
		if (inFunction) {
			if (node.getParent() instanceof VariableDeclaration
					&& ((VariableDeclaration) node.getParent()).getIdentifier() != null) {
				Identifier identifier = ((VariableDeclaration) node.getParent())
						.getIdentifier();
				info = new FieldInfo();
				info.name = identifier.getName();
				info.nameSourceStart = identifier.sourceStart();
				info.nameSourceEnd = identifier.sourceEnd() - 1;
				info.declarationStart = node.sourceStart();
			} else if (node.getParent() instanceof PropertyInitializer
					&& ((PropertyInitializer) node.getParent()).getName() instanceof Identifier) {
				Identifier identifier = (Identifier) ((PropertyInitializer) node
						.getParent()).getName();
				info = new FieldInfo();
				info.name = identifier.getName();
				info.nameSourceStart = identifier.sourceStart();
				info.nameSourceEnd = identifier.sourceEnd() - 1;
			}
			if (info != null) {
				info.declarationStart = node.sourceStart();
				fRequestor.enterField(info);
			}
		}
		try {
			return super.visitObjectInitializer(node);
		} finally {
			if (inFunction && info != null) {
				fRequestor.exitField(node.sourceEnd());
			}
		}
	}

	@Override
	public Object visitVariableStatment(VariableStatement node) {
		if (!inFunction) {
			List<VariableDeclaration> variables = node.getVariables();
			for (VariableDeclaration variableDeclaration : variables) {
				
				if (variableDeclaration.getInitializer() instanceof FunctionStatement) {
					visit(variableDeclaration.getInitializer());
					continue;
				}
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
		ASTNode parent = node.getParent();
		if (node.getObject() instanceof ThisExpression
				&& !(parent instanceof CallExpression)
				&& (!(parent instanceof BinaryOperation) || (parent instanceof BinaryOperation && !(((BinaryOperation) parent)
						.getRightExpression() instanceof FunctionStatement)))) {
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

	private static class IdentifierLookupVisitor extends TypeInferencerVisitor {

		private HashMap<Identifier, IValueReference> unknownKinds = new HashMap<Identifier, IValueReference>();

		private Map<Identifier, Integer> resolvedIdentifiers = new HashMap<Identifier, Integer>();

		public IdentifierLookupVisitor(ITypeInferenceContext context) {
			super(context);
		}

		public Map<Identifier, Integer> getResolvedIdentifiers() {
			return resolvedIdentifiers;
		}

		public void processUnknowReferences() {
			for (Map.Entry<Identifier, IValueReference> references : unknownKinds
					.entrySet()) {
				reportIdentifer(references.getKey(), references.getValue(),
						false);
			}
		}

		private void reportIdentifer(Identifier node,
				IValueReference reference, boolean reportUnknown) {
			if (reference == null)
				return;

			ReferenceKind kind = reference.getKind();
			if (kind == ReferenceKind.ARGUMENT || kind == ReferenceKind.LOCAL) {
				resolvedIdentifiers.put(node, Integer.valueOf(-2));
			} else if (kind == ReferenceKind.FIELD
					|| kind == ReferenceKind.GLOBAL) {
				resolvedIdentifiers.put(node, Integer.valueOf(-1));
			} else if (kind == ReferenceKind.FUNCTION) {
				IMethod method = (IMethod) reference
						.getAttribute(IReferenceAttributes.PARAMETERS);
				resolvedIdentifiers.put(node,
						Integer.valueOf(method.getParameterCount()));
			} else if (reportUnknown && kind == ReferenceKind.UNKNOWN) {
				unknownKinds.put(node, reference);
			}
		}

		@Override
		public IValueReference visitIdentifier(Identifier node) {
			IValueReference reference = super.visitIdentifier(node);
			reportIdentifer(node, reference, true);
			return reference;
		}

		@Override
		public IValueReference visitPropertyExpression(PropertyExpression node) {
			IValueReference reference = super.visitPropertyExpression(node);
			if (node.getProperty() instanceof Identifier) {
				reportIdentifer((Identifier) node.getProperty(), reference,
						true);
			}
			return reference;
		}
	}
}
