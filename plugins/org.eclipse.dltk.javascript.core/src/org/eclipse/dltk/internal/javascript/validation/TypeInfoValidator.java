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
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.core.builder.IBuildContext;
import org.eclipse.dltk.core.builder.IBuildParticipant;
import org.eclipse.dltk.internal.javascript.ti.IReferenceAttributes;
import org.eclipse.dltk.internal.javascript.ti.ITypeInferenceContext;
import org.eclipse.dltk.internal.javascript.ti.IValueReference;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencer2;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencerVisitor;
import org.eclipse.dltk.javascript.ast.CallExpression;
import org.eclipse.dltk.javascript.ast.Expression;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.ast.PropertyExpression;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.core.JavaScriptProblems;
import org.eclipse.dltk.javascript.parser.Reporter;
import org.eclipse.dltk.javascript.typeinfo.model.Element;
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

	public static class ValidationVisitor extends TypeInferencerVisitor {

		private final Reporter reporter;

		public ValidationVisitor(ITypeInferenceContext context,
				Reporter reporter) {
			super(context);
			this.reporter = reporter;
		}

		private final Map<ASTNode, VisitorMode> modes = new IdentityHashMap<ASTNode, VisitorMode>();

		private final Stack<ASTNode> visitStack = new Stack<ASTNode>();

		@Override
		public IValueReference visit(ASTNode node) {
			visitStack.push(node);
			try {
				return super.visit(node);
			} finally {
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
			final ASTNode methodNode;
			if (expression instanceof PropertyExpression) {
				methodNode = ((PropertyExpression) expression).getProperty();
			} else {
				methodNode = expression;
			}
			modes.put(expression, VisitorMode.CALL);
			final IValueReference reference = visit(expression);
			modes.remove(expression);
			final List<ASTNode> callArgs = node.getArguments();
			IValueReference[] arguments = new IValueReference[callArgs.size()];
			for (int i = 0, size = callArgs.size(); i < size; ++i) {
				arguments[i] = visit(callArgs.get(i));
			}
			if (reference != null) {
				final List<Method> methods = extractElements(reference,
						Method.class);
				if (methods != null) {
					Method method = selectMethod(methods, arguments);
					if (method == null) {
						final Type type = JavaScriptValidations
								.typeOf(reference.getParent());
						if (type != null && type.getKind() == TypeKind.JAVA) {
							reporter
									.reportProblem(
											JavaScriptProblems.WRONG_PARAMETERS,
											NLS
													.bind(
															ValidationMessages.MethodNotSelected,
															new String[] {
																	reference
																			.getName(),
																	type
																			.getName(),
																	describeArgTypes(arguments) }),
											methodNode.sourceStart(),
											methodNode.sourceEnd());
						}
						return null;
					}
					if (!validateParameterCount(method, callArgs)) {
						reporter.reportProblem(
								JavaScriptProblems.WRONG_PARAMETERS,
								NLS.bind(
										ValidationMessages.MethodNotApplicable,
										new String[] {
												method.getName(),
												describeParamTypes(method
														.getParameters()),
												method.getDeclaringType()
														.getName(),
												describeArgTypes(arguments) }),
								methodNode.sourceStart(), methodNode
										.sourceEnd());
					}
					if (method.isDeprecated()) {
						reporter.reportProblem(
								JavaScriptProblems.DEPRECATED_METHOD, NLS.bind(
										ValidationMessages.DeprecatedMethod,
										reference.getName(), method
												.getDeclaringType().getName()),
								methodNode.sourceStart(), methodNode
										.sourceEnd());
					}
				} else {
					final Type type = JavaScriptValidations.typeOf(reference
							.getParent());
					if (type != null && type.getKind() == TypeKind.JAVA) {
						reporter.reportProblem(
								JavaScriptProblems.UNDEFINED_METHOD, NLS.bind(
										ValidationMessages.UndefinedMethod,
										reference.getName(), type.getName()),
								methodNode.sourceStart(), methodNode
										.sourceEnd());
					}
				}
				return reference.getChild(IValueReference.FUNCTION_OP);
			} else {
				return null;
			}
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
				if (parameter.getType() != null) {
					sb.append(parameter.getType().getName());
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
				if (argument.getDeclaredType() != null) {
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

		/**
		 * @param methods
		 * @param arguments
		 * @return
		 */
		private Method selectMethod(List<Method> methods,
				IValueReference[] arguments) {
			if (methods.size() == 1) {
				return methods.get(0);
			}
			Method argCountMatches = null;
			for (Method method : methods) {
				if (method.getParameters().size() == arguments.length) {
					if (argCountMatches == null) {
						argCountMatches = method;
					} else {
						argCountMatches = null;
						break;
					}
				}
			}
			if (argCountMatches != null) {
				return argCountMatches;
			}
			// TODO implement additional checks
			return methods.get(0);
		}

		private <E extends Element> E extractElement(IValueReference reference,
				Class<E> elementType) {
			final List<E> elements = extractElements(reference, elementType);
			return elements != null ? elements.get(0) : null;
		}

		/**
		 * @param reference
		 * @param elementType
		 * @return
		 */
		@SuppressWarnings("unchecked")
		private <E extends Element> List<E> extractElements(
				IValueReference reference, Class<E> elementType) {
			final Object value = reference
					.getAttribute(IReferenceAttributes.ELEMENT);
			if (elementType.isInstance(value)) {
				return Collections.singletonList((E) value);
			} else if (value instanceof Element[]) {
				final Element[] elements = (Element[]) value;
				List<E> result = null;
				for (Element element : elements) {
					if (elementType.isInstance(element)) {
						if (result == null) {
							result = new ArrayList<E>(elements.length);
						}
						result.add((E) element);
					}
				}
				return result;
			}
			return null;
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
			final IValueReference object = visit(node.getObject());
			final Expression propName = node.getProperty();
			final String name = extractName(propName);
			if (object != null && name != null) {
				final IValueReference result = object.getChild(name);
				if (currentMode() != VisitorMode.CALL) {
					validateProperty(result, propName);
				}
				return result;
			} else {
				return null;
			}
		}

		@Override
		public IValueReference visitIdentifier(Identifier node) {
			final IValueReference result = peekContext().getChild(
					node.getName());
			final Property property = extractElement(result, Property.class);
			if (property != null && property.isDeprecated()) {
				reportDeprecatedProperty(property, null, node);
			}
			return result;
		}

		private void validateProperty(IValueReference result,
				Expression propName) {
			final Property property = extractElement(result, Property.class);
			if (property != null) {
				if (property.isDeprecated()) {
					final Property parentProperty = extractElement(result
							.getParent(), Property.class);
					if (parentProperty != null
							&& parentProperty.getDeclaringType() == null) {
						reportDeprecatedProperty(property, parentProperty,
								propName);
					} else {
						reportDeprecatedProperty(property, property
								.getDeclaringType(), propName);
					}
				}
			} else if (extractElements(result, Method.class) == null) {
				final Type type = JavaScriptValidations.typeOf(result
						.getParent());
				if (type != null && type.getKind() == TypeKind.JAVA) {
					reporter.reportProblem(
							JavaScriptProblems.UNDEFINED_PROPERTY, NLS.bind(
									ValidationMessages.UndefinedProperty,
									result.getName(), type.getName()), propName
									.sourceStart(), propName.sourceEnd());
				}
			}
		}

		private void reportDeprecatedProperty(Property property, Element owner,
				ASTNode node) {
			final String msg;
			if (owner instanceof Type) {
				msg = NLS.bind(ValidationMessages.DeprecatedProperty, property
						.getName(), owner.getName());
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

		@Override
		protected Type resolveType(org.eclipse.dltk.javascript.ast.Type type) {
			final Type result = super.resolveType(type);
			if (result != null) {
				if (result.getKind() == TypeKind.UNKNOWN) {
					reporter.reportProblem(JavaScriptProblems.UNKNOWN_TYPE, NLS
							.bind(ValidationMessages.UnknownType, type
									.getName()), type.sourceStart(), type
							.sourceEnd());
				} else if (result.isDeprecated()) {
					reporter.reportProblem(JavaScriptProblems.DEPRECATED_TYPE,
							NLS.bind(ValidationMessages.DeprecatedType, type
									.getName()), type.sourceStart(), type
									.sourceEnd());
				}
			}
			return result;
		}
	}

}
