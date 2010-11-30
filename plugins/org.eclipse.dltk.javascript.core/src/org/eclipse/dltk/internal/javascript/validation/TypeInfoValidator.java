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
package org.eclipse.dltk.internal.javascript.validation;

import java.util.ArrayList;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.core.builder.IBuildContext;
import org.eclipse.dltk.core.builder.IBuildParticipant;
import org.eclipse.dltk.internal.javascript.ti.ElementValue;
import org.eclipse.dltk.internal.javascript.ti.IReferenceAttributes;
import org.eclipse.dltk.internal.javascript.ti.ITypeInferenceContext;
import org.eclipse.dltk.internal.javascript.ti.JSMethod;
import org.eclipse.dltk.internal.javascript.ti.MemberPredicates;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencer2;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencerVisitor;
import org.eclipse.dltk.javascript.ast.CallExpression;
import org.eclipse.dltk.javascript.ast.Expression;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.ast.NewExpression;
import org.eclipse.dltk.javascript.ast.PropertyExpression;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.core.JavaScriptProblems;
import org.eclipse.dltk.javascript.parser.Reporter;
import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinference.ReferenceKind;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IParameter;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IVariable;
import org.eclipse.dltk.javascript.typeinfo.model.Element;
import org.eclipse.dltk.javascript.typeinfo.model.Member;
import org.eclipse.dltk.javascript.typeinfo.model.Method;
import org.eclipse.dltk.javascript.typeinfo.model.Parameter;
import org.eclipse.dltk.javascript.typeinfo.model.ParameterKind;
import org.eclipse.dltk.javascript.typeinfo.model.Property;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeKind;
import org.eclipse.emf.common.util.EList;
import org.eclipse.osgi.util.NLS;

public class TypeInfoValidator implements IBuildParticipant, JavaScriptProblems {

	public void build(IBuildContext context) throws CoreException {
		final Script script = JavaScriptValidations.parse(context);
		if (script == null) {
			return;
		}
		TypeInferencer2 inferencer = new TypeInferencer2();
		inferencer.setModelElement(context.getSourceModule());
		inferencer.setVisitor(new ValidationVisitor(inferencer,
				JavaScriptValidations.createReporter(context)));
		inferencer.doInferencing(script);
	}

	private static enum VisitorMode {
		NORMAL, CALL
	}

	private interface ExpressionValidator {
		void call();
	}

	private static class StackedExpressionValidator implements
			ExpressionValidator {

		private final List<ExpressionValidator> stacked = new ArrayList<TypeInfoValidator.ExpressionValidator>();
		private final Reporter reporter;

		public StackedExpressionValidator(Reporter reporter) {
			this.reporter = reporter;
		}
		public void call() {
			for (ExpressionValidator validator : stacked) {
				int count = reporter.getProblemCount();
				validator.call();
				if (reporter.getProblemCount() != count)
					break;
			}
		}

		public void push(ExpressionValidator expressionValidator) {
			stacked.add(expressionValidator);
		}
	}

	private static class CallExpressionValidator implements ExpressionValidator {
		private final CallExpression node;
		private final IValueReference reference;
		private final ValidationVisitor visitor;
		private final IValueReference[] arguments;

		public CallExpressionValidator(CallExpression node,
				IValueReference reference, IValueReference[] arguments,
				ValidationVisitor visitor) {
			this.node = node;
			this.reference = reference;
			this.arguments = arguments;
			this.visitor = visitor;
		}

		public void call() {
			visitor.validateCallExpression(node, reference, arguments);
		}
	}

	private static class PropertyExpressionHolder implements
			ExpressionValidator {
		private final PropertyExpression node;
		private final IValueReference reference;
		private final ValidationVisitor visitor;

		public PropertyExpressionHolder(PropertyExpression node,
				IValueReference reference, ValidationVisitor visitor) {
			this.node = node;
			this.reference = reference;
			this.visitor = visitor;
		}

		public void call() {
			visitor.validateProperty(node, reference);
		}
	}

	public static class ValidationVisitor extends TypeInferencerVisitor {

		private final Reporter reporter;

		private final List<ExpressionValidator> expressionValidators = new ArrayList<ExpressionValidator>();

		public ValidationVisitor(ITypeInferenceContext context,
				Reporter reporter) {
			super(context);
			this.reporter = reporter;
		}

		private final Map<ASTNode, VisitorMode> modes = new IdentityHashMap<ASTNode, VisitorMode>();

		private final Stack<ASTNode> visitStack = new Stack<ASTNode>();

		private StackedExpressionValidator stackedExpressionValidator;

		@Override
		public IValueReference visit(ASTNode node) {
			boolean rootNode = visitStack.isEmpty();
			visitStack.push(node);
			try {
				return super.visit(node);
			} finally {
				if (rootNode) {
					for (ExpressionValidator call : expressionValidators
							.toArray(new ExpressionValidator[expressionValidators
									.size()])) {
						call.call();
					}
				}
				visitStack.pop();
			}
		}

		private VisitorMode currentMode() {
			final VisitorMode mode = modes.get(visitStack.peek());
			return mode != null ? mode : VisitorMode.NORMAL;
		}

		@Override
		public IValueReference visitCallExpression(CallExpression node) {
			final ASTNode expression = node.getExpression();
			modes.put(expression, VisitorMode.CALL);

			boolean started = startExpressionValidator();
			try {
				final IValueReference reference = visit(expression);
				modes.remove(expression);
				if (reference == null)
					return null;
				final List<ASTNode> callArgs = node.getArguments();
				IValueReference[] arguments = new IValueReference[callArgs
						.size()];
				for (int i = 0, size = callArgs.size(); i < size; ++i) {
					arguments[i] = visit(callArgs.get(i));
				}
				pushExpressionValidator(new CallExpressionValidator(node,
						reference, arguments, this));
				return reference.getChild(IValueReference.FUNCTION_OP);
			} finally {
				if (started)
					stopExpressionValidator();
			}
		}

		private void pushExpressionValidator(
				ExpressionValidator expressionValidator) {
			if (stackedExpressionValidator != null) {
				stackedExpressionValidator.push(expressionValidator);
			} else {
				expressionValidators.add(expressionValidator);
			}

		}

		private void stopExpressionValidator() {
			if (stackedExpressionValidator != null) {
				expressionValidators.add(stackedExpressionValidator);
				stackedExpressionValidator = null;
			}

		}

		private boolean startExpressionValidator() {
			if (stackedExpressionValidator == null) {
				stackedExpressionValidator = new StackedExpressionValidator(
						reporter);
				return true;
			}
			return false;
		}

		/**
		 * @param node
		 * @param reference
		 * @return
		 */
		private void validateCallExpression(CallExpression node,
				final IValueReference reference, IValueReference[] arguments) {

			final ASTNode expression = node.getExpression();
			final ASTNode methodNode;
			if (expression instanceof PropertyExpression) {
				methodNode = ((PropertyExpression) expression).getProperty();
			} else {
				methodNode = expression;
			}

			final List<Method> methods = JavaScriptValidations
					.extractElements(reference, Method.class);
			if (methods != null) {
				final List<ASTNode> callArgs = node.getArguments();
				Method method = JavaScriptValidations.selectMethod(methods,
						arguments);
				if (method == null) {
					final Type type = JavaScriptValidations
							.typeOf(reference.getParent());
					if (type != null) {
						if (type.getKind() == TypeKind.JAVA) {
							reporter.reportProblem(
									JavaScriptProblems.WRONG_PARAMETERS,
									NLS.bind(
											ValidationMessages.MethodNotSelected,
											new String[] {
													reference.getName(),
													type.getName(),
													describeArgTypes(arguments) }),
									methodNode.sourceStart(), methodNode
											.sourceEnd());

						} else {
							// TODO also a JS error (that should be
							// configurable)
						}
					}
					return;
				}
				if (!validateParameterCount(method, callArgs)) {
					reportMethodParameterError(methodNode, arguments,
							method);
				}
				if (method.isDeprecated()) {
					reportDeprecatedMethod(methodNode, reference, method);
				}
			} else {
				Object attribute = reference.getAttribute(
						IReferenceAttributes.PARAMETERS, true);
				if (attribute instanceof JSMethod) {
					JSMethod method = (JSMethod) attribute;
					if (method.isDeprecated()) {
						reporter.reportProblem(
								JavaScriptProblems.DEPRECATED_FUNCTION,
								NLS.bind(
										ValidationMessages.DeprecatedFunction,
										reference.getName()), methodNode
										.sourceStart(), methodNode
										.sourceEnd());
					}
					if (method.isPrivate() && reference.getParent() != null) {
						reporter.reportProblem(
								JavaScriptProblems.PRIVATE_FUNCTION,
								NLS.bind(
										ValidationMessages.PrivateFunction,
										reference.getName()), methodNode
										.sourceStart(), methodNode
										.sourceEnd());
					}
					List<IParameter> parameters = method.getParameters();
					if (!validateParameters(parameters, arguments)) {
						reporter.reportProblem(
								JavaScriptProblems.WRONG_PARAMETERS,
								NLS.bind(
										ValidationMessages.MethodNotApplicableInScript,
										new String[] {
												method.getName(),
												describeParamTypes(parameters),
												describeArgTypes(arguments) }),
								methodNode.sourceStart(), methodNode
										.sourceEnd());
					}
				} else {
					final Type type = JavaScriptValidations
							.typeOf(reference.getParent());
					if (type != null) {
						if (type.getKind() == TypeKind.JAVA) {
							reporter.reportProblem(
									JavaScriptProblems.UNDEFINED_METHOD,
									NLS.bind(
											ValidationMessages.UndefinedMethod,
											reference.getName(),
											type.getName()), methodNode
											.sourceStart(), methodNode
											.sourceEnd());
						} else if (JavaScriptValidations.isStatic(reference
								.getParent())
								&& !ElementValue.findMembers(type,
										reference.getName(),
										MemberPredicates.NON_STATIC)
										.isEmpty()) {
							reporter.reportProblem(
									JavaScriptProblems.NON_STATIC_METHOD,
									NLS.bind(
											"Cannot make a static reference to the non-static method {0}() from {1}",
											reference.getName(),
											type.getName()), methodNode
											.sourceStart(), methodNode
											.sourceEnd());
						} else {
							// TODO also report a JS error (that should be
							// configurable)
							reporter.reportProblem(
									JavaScriptProblems.UNDEFINED_METHOD,
									NLS.bind(
											ValidationMessages.UndefinedMethodInScript,
											reference.getName()),
									methodNode.sourceStart(), methodNode
											.sourceEnd());
						}
					} else {
						if (expression instanceof NewExpression) {
							if (reference.getKind() == ReferenceKind.TYPE) {
								return;
							}
							Type newType = JavaScriptValidations
									.typeOf(reference);
							if (newType != null) {
								return;
							}

						}
						IValueReference parent = reference;
						while (parent != null) {
							if (parent.getName() == IValueReference.ARRAY_OP) {
								// ignore array lookup function calls
								// like: array[1](),
								// those are dynamic.
								return;
							}
							parent = parent.getParent();
						}
						if (expression instanceof NewExpression) {

							reporter.reportProblem(
									JavaScriptProblems.UNKNOWN_TYPE, NLS.bind(
											ValidationMessages.UnknownType,
											((NewExpression) expression)
													.getObjectClass()
													.toSourceString("")),
									methodNode.sourceStart(), methodNode
											.sourceEnd());

						} else {
							reporter.reportProblem(
									JavaScriptProblems.UNDEFINED_METHOD,
									NLS.bind(
											ValidationMessages.UndefinedMethodInScript,
											reference.getName()), methodNode
											.sourceStart(), methodNode
											.sourceEnd());
						}
					}
				}
			}
			return;
		}

		private void reportDeprecatedMethod(ASTNode methodNode,
				IValueReference reference, Method method) {
			if (method.getDeclaringType() != null) {
				reporter.reportProblem(
						JavaScriptProblems.DEPRECATED_METHOD,
						NLS.bind(ValidationMessages.DeprecatedMethod, reference
								.getName(), method.getDeclaringType().getName()),
						methodNode.sourceStart(), methodNode.sourceEnd());
			} else {
				reporter.reportProblem(JavaScriptProblems.DEPRECATED_METHOD,
						NLS.bind(ValidationMessages.DeprecatedTopLevelMethod,
								reference.getName()), methodNode.sourceStart(),
						methodNode.sourceEnd());
			}
		}

		private void reportMethodParameterError(ASTNode methodNode,
				IValueReference[] arguments, Method method) {
			if (method.getDeclaringType() != null) {
				reporter.reportProblem(JavaScriptProblems.WRONG_PARAMETERS, NLS
						.bind(ValidationMessages.MethodNotApplicable,
								new String[] {
										method.getName(),
										describeParamTypes(method
												.getParameters()),
										method.getDeclaringType().getName(),
										describeArgTypes(arguments) }),
						methodNode.sourceStart(), methodNode.sourceEnd());
			} else {
				reporter.reportProblem(JavaScriptProblems.WRONG_PARAMETERS, NLS
						.bind(ValidationMessages.TopLevelMethodNotApplicable,
								new String[] {
										method.getName(),
										describeParamTypes(method
												.getParameters()),
										describeArgTypes(arguments) }),
						methodNode.sourceStart(), methodNode.sourceEnd());
			}
		}

		private boolean validateParameters(List<IParameter> parameters,
				IValueReference[] arguments) {
			if (arguments.length > parameters.size())
				return false;
			int testTypesSize = parameters.size();
			if (parameters.size() != arguments.length) {
				for (int i = arguments.length; i < parameters.size(); i++) {
					if (!parameters.get(i).isOptional())
						return false;
				}
				testTypesSize = arguments.length;
			}

			for (int i = 0; i < testTypesSize; i++) {
				String param = parameters.get(i).getType();
				if (arguments[i] == null)
					continue;
				Type argumentType = arguments[i].getDeclaredType();
				if (argumentType == null) {
					if (!arguments[i].getTypes().isEmpty()) {
						argumentType = arguments[i].getTypes().iterator()
								.next();
					}
				}
				if (param != null && param != null
						&& argumentType != null
						&& !param.equals(argumentType.getName())) {
					String argumentName = argumentType.getName();
					int index = argumentName.indexOf('<');
					if (index != -1) {
						argumentName = argumentName.substring(0, index);
					}
					if (param.equals(argumentName))
						continue;
					return false;
				}
			}
			return true;
		}

		/**
		 * @param parameters
		 * @return
		 */
		private String describeParamTypes(EList<Parameter> parameters) {
			StringBuilder sb = new StringBuilder();
			for (Parameter parameter : parameters) {
				if (sb.length() != 0) {
					sb.append(',');
				}
				if (parameter.getKind() == ParameterKind.OPTIONAL)
					sb.append('[');
				if (parameter.getType() != null) {
					sb.append(parameter.getType().getName());
				} else {
					sb.append('?');
				}
				if (parameter.getKind() == ParameterKind.OPTIONAL)
					sb.append(']');
			}
			return sb.toString();
		}

		private String describeParamTypes(List<IParameter> parameters) {
			StringBuilder sb = new StringBuilder();
			for (IParameter parameter : parameters) {
				if (sb.length() != 0) {
					sb.append(',');
				}
				if (parameter.getType() != null) {
					sb.append(parameter.getType());
				} else {
					sb.append('?');
				}
			}
			return sb.toString();
		}

		/**
		 * @param arguments
		 * @return
		 */
		private String describeArgTypes(IValueReference[] arguments) {
			StringBuilder sb = new StringBuilder();
			for (IValueReference argument : arguments) {
				if (sb.length() != 0) {
					sb.append(',');
				}
				if (argument == null) {
					sb.append("null");
				} else if (argument.getDeclaredType() != null) {
					sb.append(argument.getDeclaredType().getName());
				} else {
					final Set<Type> types = argument.getTypes();
					if (types.size() == 1) {
						sb.append(types.iterator().next().getName());
					} else {
						sb.append('?');
					}
				}
			}
			return sb.toString();
		}

		private <E extends Member> E extractElement(IValueReference reference,
				Class<E> elementType) {
			final List<E> elements = JavaScriptValidations.extractElements(
					reference, elementType);
			return elements != null ? elements.get(0) : null;
		}

		/**
		 * Validates the parameter count, returns <code>true</code> if correct.
		 * 
		 * @param method
		 * @param callArgs
		 * 
		 * @return
		 */
		private boolean validateParameterCount(Method method,
				List<ASTNode> callArgs) {
			final EList<Parameter> params = method.getParameters();
			if (params.size() == callArgs.size()) {
				return true;
			}
			if (params.size() < callArgs.size()
					&& !params.isEmpty()
					&& params.get(params.size() - 1).getKind() == ParameterKind.VARARGS) {
				return true;
			}
			if (params.size() > callArgs.size()
					&& params.get(callArgs.size()).getKind() == ParameterKind.OPTIONAL) {
				return true;
			}
			return false;
		}

		@Override
		public IValueReference visitPropertyExpression(PropertyExpression node) {
			boolean started = startExpressionValidator();
			try {
				final IValueReference result = super
						.visitPropertyExpression(node);
				if (result != null) {
					if (currentMode() != VisitorMode.CALL) {
						pushExpressionValidator(new PropertyExpressionHolder(
								node, result, this));
					}
					return result;
				} else {
					return null;
				}
			} finally {
				if (started)
					stopExpressionValidator();
			}
		}

		@Override
		public IValueReference visitIdentifier(Identifier node) {
			final IValueReference result = super.visitIdentifier(node);
			final Property property = extractElement(result, Property.class);
			if (property != null && property.isDeprecated()) {
				reportDeprecatedProperty(property, null, node);
			}
			return result;
		}

		private void validateProperty(PropertyExpression propertyExpression,
				IValueReference result) {
			final Expression propName = propertyExpression.getProperty();
			final Property property = extractElement(result, Property.class);
			if (property != null) {
				if (property.isDeprecated()) {
					final Property parentProperty = extractElement(
							result.getParent(), Property.class);
					if (parentProperty != null
							&& parentProperty.getDeclaringType() == null) {
						reportDeprecatedProperty(property, parentProperty,
								propName);
					} else {
						reportDeprecatedProperty(property,
								property.getDeclaringType(), propName);
					}
				} else if (!property.isVisible()) {
					final Property parentProperty = extractElement(
							result.getParent(), Property.class);
					if (parentProperty != null
							&& parentProperty.getDeclaringType() == null) {
						reportHiddenProperty(property, parentProperty, propName);
					} else {
						reportHiddenProperty(property,
								property.getDeclaringType(), propName);
					}
				}
			} else if (JavaScriptValidations.extractElements(result,
					Method.class) == null && !result.exists()) {
				final Type type = JavaScriptValidations.typeOf(result
						.getParent());
				if (type != null && type.getKind() == TypeKind.JAVA) {
					reporter.reportProblem(
							JavaScriptProblems.UNDEFINED_PROPERTY, NLS.bind(
									ValidationMessages.UndefinedProperty,
									result.getName(), type.getName()), propName
									.sourceStart(), propName.sourceEnd());
				} else if (type != null
						&& (type.getKind() == TypeKind.JAVASCRIPT || type
								.getKind() == TypeKind.PREDEFINED)) {
					reporter.reportProblem(
							JavaScriptProblems.UNDEFINED_PROPERTY,
							NLS.bind(
									ValidationMessages.UndefinedPropertyInScriptType,
									result.getName(), type.getName()), propName
									.sourceStart(), propName.sourceEnd());
				} else {
					reporter.reportProblem(
							JavaScriptProblems.UNDEFINED_PROPERTY,
							NLS.bind(
									ValidationMessages.UndefinedPropertyInScript,
									result.getName()), propName.sourceStart(),
							propName.sourceEnd());
				}
			} else {
				IVariable variable = (IVariable) result
						.getAttribute(IReferenceAttributes.VARIABLE);
				if (variable != null) {
					if (variable.isDeprecated()) {
						reporter.reportProblem(
								JavaScriptProblems.DEPRECATED_VARIABLE,
								NLS.bind(ValidationMessages.DeprecatedVariable,
										variable.getName()), propName
										.sourceStart(), propName.sourceEnd());
					}
					if (variable.isPrivate() && result.getParent() != null) {
						reporter.reportProblem(
								JavaScriptProblems.PRIVATE_VARIABLE, NLS.bind(
										ValidationMessages.PrivateVariable,
										variable.getName()), propName
										.sourceStart(), propName.sourceEnd());
					}
				}

				final Type type = JavaScriptValidations.typeOf(result
						.getParent());
				if (type != null) {
					if (type.getKind() == TypeKind.JAVA) {
						reporter.reportProblem(
								JavaScriptProblems.UNDEFINED_PROPERTY,
								NLS.bind(ValidationMessages.UndefinedProperty,
										result.getName(), type.getName()),
								propName.sourceStart(), propName.sourceEnd());
					} else if (JavaScriptValidations.isStatic(result
							.getParent())
							&& !ElementValue.findMembers(type,
									result.getName(),
									MemberPredicates.NON_STATIC).isEmpty()) {
						reporter.reportProblem(
								JavaScriptProblems.NON_STATIC_PROPERTY,
								NLS.bind(
										"Cannot make a static reference to the non-static field {0} from {1}",
										result.getName(), type.getName()),
								propName.sourceStart(), propName.sourceEnd());
					} else {
						// TODO also report a JS error (that should be
						// configurable)
						reporter.reportProblem(
								JavaScriptProblems.UNDEFINED_PROPERTY,
								NLS.bind(
										ValidationMessages.UndefinedMethodInScript,
										result.getName()), propName
										.sourceStart(), propName.sourceEnd());
					}
				}
			}
		}

		private void reportDeprecatedProperty(Property property, Element owner,
				ASTNode node) {
			final String msg;
			if (owner instanceof Type) {
				msg = NLS.bind(ValidationMessages.DeprecatedProperty,
						property.getName(), owner.getName());
			} else if (owner instanceof Property) {
				msg = NLS.bind(ValidationMessages.DeprecatedPropertyOfInstance,
						property.getName(), owner.getName());
			} else {
				msg = NLS.bind(ValidationMessages.DeprecatedPropertyNoType,
						property.getName());
			}
			reporter.reportProblem(JavaScriptProblems.DEPRECATED_PROPERTY, msg,
					node.sourceStart(), node.sourceEnd());
		}

		private void reportHiddenProperty(Property property, Element owner,
				ASTNode node) {
			final String msg;
			if (owner instanceof Type) {
				msg = NLS.bind(ValidationMessages.HiddenProperty,
						property.getName(), owner.getName());
			} else if (owner instanceof Property) {
				msg = NLS.bind(ValidationMessages.HiddenPropertyOfInstance,
						property.getName(), owner.getName());
			} else {
				msg = NLS.bind(ValidationMessages.HiddenPropertyNoType,
						property.getName());
			}
			reporter.reportProblem(JavaScriptProblems.HIDDEN_PROPERTY, msg,
					node.sourceStart(), node.sourceEnd());
		}

		@Override
		protected Type resolveType(org.eclipse.dltk.javascript.ast.Type type) {
			final Type result = super.resolveType(type);
			if (result != null) {
				if (result.getKind() == TypeKind.UNKNOWN) {
					reporter.reportProblem(
							JavaScriptProblems.UNKNOWN_TYPE,
							NLS.bind(ValidationMessages.UnknownType,
									type.getName()), type.sourceStart(),
							type.sourceEnd());
				} else if (result.isDeprecated()) {
					reporter.reportProblem(
							JavaScriptProblems.DEPRECATED_TYPE,
							NLS.bind(ValidationMessages.DeprecatedType,
									type.getName()), type.sourceStart(),
							type.sourceEnd());
				}
			}
			return result;
		}
	}

}
