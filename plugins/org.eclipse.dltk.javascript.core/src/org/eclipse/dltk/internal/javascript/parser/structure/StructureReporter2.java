package org.eclipse.dltk.internal.javascript.parser.structure;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.compiler.IElementRequestor.FieldInfo;
import org.eclipse.dltk.compiler.IElementRequestor.MethodInfo;
import org.eclipse.dltk.internal.javascript.parser.JSModifiers;
import org.eclipse.dltk.internal.javascript.ti.IReferenceAttributes;
import org.eclipse.dltk.internal.javascript.ti.ITypeInferenceContext;
import org.eclipse.dltk.internal.javascript.ti.JSMethod;
import org.eclipse.dltk.internal.javascript.ti.JSVariable;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencerVisitor;
import org.eclipse.dltk.javascript.ast.Argument;
import org.eclipse.dltk.javascript.ast.BinaryOperation;
import org.eclipse.dltk.javascript.ast.CallExpression;
import org.eclipse.dltk.javascript.ast.Expression;
import org.eclipse.dltk.javascript.ast.FunctionStatement;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.ast.ObjectInitializer;
import org.eclipse.dltk.javascript.ast.ObjectInitializerPart;
import org.eclipse.dltk.javascript.ast.PropertyExpression;
import org.eclipse.dltk.javascript.ast.PropertyInitializer;
import org.eclipse.dltk.javascript.ast.ThisExpression;
import org.eclipse.dltk.javascript.ast.VariableDeclaration;
import org.eclipse.dltk.javascript.ast.VariableStatement;
import org.eclipse.dltk.javascript.parser.JSParser;
import org.eclipse.dltk.javascript.parser.PropertyExpressionUtils;
import org.eclipse.dltk.javascript.typeinference.IValueCollection;
import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinference.ReferenceKind;
import org.eclipse.dltk.javascript.typeinference.ReferenceLocation;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IMethod;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IParameter;
import org.eclipse.dltk.javascript.typeinfo.TypeInfoManager;

public class StructureReporter2 extends TypeInferencerVisitor {

	private static final Integer IDKIND_UNKNOWN = new Integer(-3);

	private static final Integer IDKIND_LOCAL = new Integer(-2);

	private static final Integer IDKIND_GLOBAL = new Integer(-1);

	private final IStructureRequestor fRequestor;

	public StructureReporter2(ITypeInferenceContext context,
			IStructureRequestor fRequestor) {
		super(context);
		this.fRequestor = fRequestor;
	}

	@Override
	public IValueReference visitIdentifier(Identifier node) {
		IValueReference reference = super.visitIdentifier(node);
		checkIdentifier(node, reference);
		return reference;
	}

	/**
	 * @param node
	 * @param reference
	 * @return
	 */
	private void checkIdentifier(Identifier node, IValueReference reference) {
		// if this is a function declaration, skip this, will be
		// reported by visit functionStatement
		if (isFunctionDeclaration(node))
			return;

		int argCount = checkIdentiferReferenceKind(node, reference);
		if (argCount != IDKIND_UNKNOWN) {
			// ignore locals.
			if (argCount == IDKIND_LOCAL) {
				// report fields.
				fRequestor.acceptLocalReference(node, reference);
			} else if (argCount == IDKIND_GLOBAL) {
				fRequestor.acceptFieldReference(node, reference);
			} else {
				// else methods.
				fRequestor.acceptMethodReference(node, argCount, reference);
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
				fRequestor.acceptMethodReference(node,
						((CallExpression) parent).getArguments().size(),
						reference);
			} else if (!(parent instanceof PropertyInitializer)) {
				// else it is a not resolved field reference, also report
				// this one.
				// that searches will be able to find them.
				fRequestor.acceptFieldReference(node, reference);
			}
		}
		return;
	}

	private int checkIdentiferReferenceKind(Identifier node,
			IValueReference reference) {
		if (reference == null)
			return IDKIND_UNKNOWN;

		ReferenceKind kind = reference.getKind();
		if (kind == ReferenceKind.ARGUMENT || kind == ReferenceKind.LOCAL) {
			return IDKIND_LOCAL;
		} else if (kind == ReferenceKind.FIELD || kind == ReferenceKind.GLOBAL) {
			return IDKIND_GLOBAL;
		} else if (kind == ReferenceKind.FUNCTION) {
			IMethod method = (IMethod) reference
					.getAttribute(IReferenceAttributes.PARAMETERS);
			if (method == null)
				return IDKIND_UNKNOWN;
			else
				return method.getParameterCount();
		}
		return IDKIND_UNKNOWN;
	}

	@Override
	public IValueReference visitFunctionStatement(FunctionStatement node) {
		MethodInfo methodInfo = new MethodInfo();
		MethodInfo thisMethod = null;
		methodInfo.declarationStart = node.sourceStart();
		final JSMethod method = generateJSMethod(node);
		Identifier thisIdentifier = null;
		Identifier identifier = null;
		if (node.getName() != null) {
			identifier = setNameProperties(node.getName(), methodInfo, method);
			if ((thisIdentifier = getThisIdentifier(node)) != null) {
				// this is a function that has a name and an assignment to
				// the this property.
				// also a field should be created.
				thisMethod = new MethodInfo();
				thisMethod.nameSourceStart = thisIdentifier.sourceStart();
				thisMethod.nameSourceEnd = thisIdentifier.sourceEnd() - 1;
				thisMethod.declarationStart = thisIdentifier.getParent()
						.sourceStart();
				thisMethod.name = thisIdentifier.getName();
			}

		} else if (node.getParent() instanceof PropertyInitializer
				&& ((PropertyInitializer) node.getParent()).getName() instanceof Identifier) {
			identifier = setNameProperties(
					(Identifier) ((PropertyInitializer) node.getParent())
							.getName(),
					methodInfo, method);

		} else if (node.getParent() instanceof VariableDeclaration
				&& ((VariableDeclaration) node.getParent()).getIdentifier() != null) {
			identifier = setNameProperties(
					((VariableDeclaration) node.getParent()).getIdentifier(),
					methodInfo, method);
		} else if ((thisIdentifier = getThisIdentifier(node)) != null) {
			identifier = setNameProperties(thisIdentifier, methodInfo, method);

		} else if (node.getParent() instanceof BinaryOperation
				&& ((BinaryOperation) node.getParent()).getOperation() == JSParser.ASSIGN
				&& ((BinaryOperation) node.getParent()).getLeftExpression() instanceof PropertyExpression) {
			Expression expression = ((BinaryOperation) node.getParent())
					.getLeftExpression();
			identifier = PropertyExpressionUtils.getIdentifier(expression);
			method.setName(PropertyExpressionUtils.getPath(expression));
			if (method.getName() == null) {
				method.setName("");
			}
			methodInfo.nameSourceStart = expression.sourceStart();
			methodInfo.nameSourceEnd = expression.sourceEnd() - 1;
		} else {
			method.setName("");
			methodInfo.nameSourceStart = node.getFunctionKeyword()
					.sourceStart();
			methodInfo.nameSourceEnd = node.getFunctionKeyword().sourceEnd() - 1;
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
			Map<String, Argument> arguments = new HashMap<String, Argument>();
			for (Argument argument : node.getArguments()) {
				arguments.put(argument.getIdentifier().getName(), argument);
			}
			String[] paramNames = new String[parameters.size()];
			String[] paramTypes = new String[parameters.size()];
			for (int i = 0; i < parameters.size(); i++) {
				IParameter parameter = parameters.get(i);
				paramNames[i] = parameter.getName();
				paramTypes[i] = parameter.getType();

				fRequestor.acceptArgumentDeclaration(arguments.get(parameter
						.getName()), getSource().getSourceModule(), parameter
						.getType());
			}
			methodInfo.parameterNames = paramNames;
			methodInfo.parameterTypes = paramTypes;
		}

		if (thisMethod != null) {
			thisMethod.isConstructor = methodInfo.isConstructor;
			thisMethod.returnType = methodInfo.returnType;
			thisMethod.modifiers = methodInfo.modifiers;
			thisMethod.parameterNames = methodInfo.parameterNames;
			thisMethod.parameterTypes = methodInfo.parameterTypes;
			fRequestor.enterMethod(thisMethod, thisIdentifier, method);
			fRequestor.exitMethod(node.sourceEnd());
		}

		fRequestor.enterMethod(methodInfo, identifier, method);
		IValueReference reference = super.visitFunctionStatement(node);
		fRequestor.exitMethod(node.sourceEnd());
		return reference;
	}

	/**
	 * @param node
	 * @return
	 */
	public static Identifier getThisIdentifier(FunctionStatement fs) {
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
	private Identifier setNameProperties(Identifier node,
			MethodInfo methodInfo, final JSMethod method) {
		method.setName(node.getName());
		methodInfo.nameSourceStart = node.sourceStart();
		methodInfo.nameSourceEnd = node.sourceEnd() - 1;
		if (methodInfo.declarationStart > methodInfo.nameSourceStart)
			methodInfo.declarationStart = methodInfo.nameSourceStart;
		return node;
	}

	@Override
	public IValueReference visitObjectInitializer(ObjectInitializer node) {
		Identifier fieldIdentifer = null;
		if (inFunction()) {
			if (node.getParent() instanceof VariableDeclaration
					&& ((VariableDeclaration) node.getParent()).getIdentifier() != null) {
				fieldIdentifer = ((VariableDeclaration) node.getParent())
						.getIdentifier();
			} else if (node.getParent() instanceof PropertyInitializer
					&& ((PropertyInitializer) node.getParent()).getName() instanceof Identifier) {
				fieldIdentifer = (Identifier) ((PropertyInitializer) node
						.getParent()).getName();
			}
			if (fieldIdentifer != null) {
				fRequestor.enterField(
						createFieldInfo(fieldIdentifer, node.sourceStart(),
								null), fieldIdentifer);
			}
		}
		for (ObjectInitializerPart part : node.getInitializers()) {
			if (part instanceof PropertyInitializer) {
				final PropertyInitializer pi = (PropertyInitializer) part;
				// function statements will be reported in the
				// visitFunctionStatement
				if (pi.getValue() instanceof FunctionStatement)
					continue;
				if (pi.getName() instanceof Identifier) {
					Identifier identifier = (Identifier) pi.getName();
					fRequestor
							.enterField(
									createFieldInfo(identifier,
											pi.sourceStart(), null), identifier);
					fRequestor.exitField(pi.sourceEnd());
				}

			}
		}
		IValueReference reference = super.visitObjectInitializer(node);
		if (fieldIdentifer != null) {
			fRequestor.exitField(node.sourceEnd());
		}
		return reference;
	}

	private FieldInfo createFieldInfo(Identifier identifer, int sourceStart,
			JSVariable variable) {
		FieldInfo fieldInfo = new FieldInfo();
		fieldInfo.declarationStart = sourceStart;
		fieldInfo.name = identifer.getName();
		fieldInfo.nameSourceStart = identifer.sourceStart();
		fieldInfo.nameSourceEnd = identifer.sourceEnd() - 1;
		if (variable != null) {
			if (variable.isDeprecated()) {
				fieldInfo.modifiers |= JSModifiers.DEPRECATED;
			}
			if (variable.isPrivate()) {
				fieldInfo.modifiers |= JSModifiers.PRIVATE;
			}
			fieldInfo.type = variable.getType();
		}
		return fieldInfo;
	}

	protected IValueReference createVariable(IValueCollection context,
			VariableDeclaration declaration) {
		if (!(declaration.getInitializer() instanceof FunctionStatement)) {
			final Identifier identifier = declaration.getIdentifier();
			final String varName = identifier.getName();
			final JSVariable variable = new JSVariable();
			final IValueReference reference = context.createChild(varName);
			final org.eclipse.dltk.javascript.ast.Type varType = declaration
					.getType();
			if (varType != null) {
				reference.setDeclaredType(resolveType(varType));
				variable.setType(varType.getName());
			}
			if (declaration.getParent() instanceof VariableStatement) {
				variable.setName(declaration.getVariableName());
				for (IModelBuilder extension : TypeInfoManager
						.getModelBuilders()) {
					extension.processVariable(
							(VariableStatement) declaration.getParent(),
							variable);
				}
			}

			reference.setKind(inFunction() ? ReferenceKind.LOCAL
					: ReferenceKind.GLOBAL);
			reference.setLocation(ReferenceLocation.create(getSource(),
					declaration.sourceStart(), declaration.sourceEnd(),
					identifier.sourceStart(), identifier.sourceEnd()));
			if (inFunction())
				fRequestor.enterLocal(identifier,
						getSource().getSourceModule(), variable.getType());
			else
				fRequestor.enterField(
						createFieldInfo(identifier, declaration.sourceStart(),
								variable), identifier);

			if (declaration.getInitializer() != null) {
				IValueReference assignment = visit(declaration.getInitializer());
				if (assignment != null) {
					assign(reference, assignment);
					if (assignment.getKind() == ReferenceKind.FUNCTION
							&& reference
									.getAttribute(IReferenceAttributes.PARAMETERS) != null)
						reference.setKind(ReferenceKind.FUNCTION);
				}
			}
			if (inFunction())
				fRequestor.exitLocal(declaration.sourceEnd());
			else
				fRequestor.exitField(declaration.sourceEnd());

			return reference;
		}
		return super.createVariable(context, declaration);
	}

	@Override
	public IValueReference visitPropertyExpression(PropertyExpression node) {
		ASTNode parent = node.getParent();
		if (node.getObject() instanceof ThisExpression
				&& !(parent instanceof CallExpression)
				&& (!(parent instanceof BinaryOperation) || (parent instanceof BinaryOperation && !(((BinaryOperation) parent)
						.getRightExpression() instanceof FunctionStatement)))) {
			Expression name = node.getProperty();
			Identifier identifier = null;
			if (name instanceof Identifier) {
				identifier = (Identifier) name;
			}
			// String nameStr = null;
			// if (name instanceof Identifier) {
			// nameStr = ((Identifier) name).getName();
			// } else if (name instanceof StringLiteral) {
			// nameStr = ((StringLiteral) name).getValue();
			// } else if (name instanceof XmlAttributeIdentifier) {
			// nameStr = ((XmlAttributeIdentifier) name).getAttributeName();
			// }
			if (identifier != null) {
				IValueReference reference = super.visitPropertyExpression(node);
				if (fRequestor.enterFieldCheckDuplicates(
						createFieldInfo(identifier, name.sourceStart(), null),
						identifier)) {
					reference = super.visitPropertyExpression(node);
					fRequestor.exitField(node.sourceEnd());
					return reference;
				}
			}
		}
		IValueReference reference = super.visitPropertyExpression(node);
		if (node.getProperty() instanceof Identifier) {
			checkIdentifier((Identifier) node.getProperty(), reference);
		}
		return reference;
	}
}
