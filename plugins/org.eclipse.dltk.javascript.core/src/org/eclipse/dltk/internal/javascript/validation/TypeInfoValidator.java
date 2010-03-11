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

import java.util.IdentityHashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.compiler.problem.DefaultProblem;
import org.eclipse.dltk.compiler.problem.IProblemReporter;
import org.eclipse.dltk.compiler.problem.ProblemSeverities;
import org.eclipse.dltk.core.builder.IBuildContext;
import org.eclipse.dltk.core.builder.IBuildParticipant;
import org.eclipse.dltk.core.builder.ISourceLineTracker;
import org.eclipse.dltk.internal.javascript.ti.GetMode;
import org.eclipse.dltk.internal.javascript.ti.IMethodValueReference;
import org.eclipse.dltk.internal.javascript.ti.IPropertyValueReference;
import org.eclipse.dltk.internal.javascript.ti.ITypeInferenceContext;
import org.eclipse.dltk.internal.javascript.ti.IValueReference;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencer2;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencerVisitor;
import org.eclipse.dltk.javascript.ast.CallExpression;
import org.eclipse.dltk.javascript.ast.Expression;
import org.eclipse.dltk.javascript.ast.PropertyExpression;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.core.JavaScriptProblems;
import org.eclipse.dltk.javascript.typeinfo.model.Method;
import org.eclipse.dltk.javascript.typeinfo.model.Property;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeKind;
import org.eclipse.osgi.util.NLS;

public class TypeInfoValidator implements IBuildParticipant, JavaScriptProblems {

	public void build(IBuildContext context) throws CoreException {
		final Script script = JavaScriptValidations.parse(context);
		TypeInferencer2 inferencer = new TypeInferencer2();
		inferencer.setVisitor(new ValidationVisitor(inferencer, context
				.getProblemReporter(), context.getLineTracker()));
		inferencer.doInferencing(script);
	}

	private static enum VisitorMode {
		NORMAL, CALL
	}

	private static class ValidationVisitor extends TypeInferencerVisitor {

		private final IProblemReporter reporter;
		private final ISourceLineTracker lineTracker;

		public ValidationVisitor(ITypeInferenceContext context,
				IProblemReporter reporter, ISourceLineTracker lineTracker) {
			super(context);
			this.reporter = reporter;
			this.lineTracker = lineTracker;
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
				if (reference instanceof IMethodValueReference) {
					final Method method = ((IMethodValueReference) reference)
							.getMethod();
					// TODO how overloaded methods should be handled?
					if (method.getParameters().size() != callArgs.size()) {
						// TODO check optional parameters
						reportProblem(JavaScriptProblems.WRONG_PARAMETER_COUNT,
								NLS.bind(ValidationMessages.WrongParamCount,
										method.getDeclaringType().getName(),
										reference.getName()), methodNode
										.sourceStart(), methodNode.sourceEnd());
					}
					if (method.isDeprecated()) {
						reportProblem(JavaScriptProblems.DEPRECATED_METHOD, NLS
								.bind(ValidationMessages.DeprecatedMethod,
										reference.getName(), method
												.getDeclaringType().getName()),
								methodNode.sourceStart(), methodNode
										.sourceEnd());
					}
				} else {
					final Type type = JavaScriptValidations.typeOf(reference
							.getParent());
					if (type != null && type.getKind() == TypeKind.JAVA) {
						reportProblem(JavaScriptProblems.UNDEFINED_METHOD, NLS
								.bind(ValidationMessages.UndefinedMethod,
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

		@Override
		public IValueReference visitPropertyExpression(PropertyExpression node) {
			final IValueReference object = visit(node.getObject());
			final Expression propName = node.getProperty();
			final String name = extractName(propName);
			if (object != null && name != null) {
				final IValueReference result = object.getChild(name,
						GetMode.CREATE_LAZY);
				if (currentMode() != VisitorMode.CALL) {
					validateProperty(result, propName);
				}
				return result;
			} else {
				return null;
			}
		}

		private void validateProperty(IValueReference result,
				Expression propName) {
			if (result instanceof IPropertyValueReference) {
				final Property property = ((IPropertyValueReference) result)
						.getProperty();
				if (property.isDeprecated()) {
					reportProblem(JavaScriptProblems.DEPRECATED_PROPERTY, NLS
							.bind(ValidationMessages.DeprecatedProperty, result
									.getName(), property.getDeclaringType()
									.getName()), propName.sourceStart(),
							propName.sourceEnd());
				}
			} else if (!(result instanceof IMethodValueReference)) {
				final Type type = JavaScriptValidations.typeOf(result
						.getParent());
				if (type != null && type.getKind() == TypeKind.JAVA) {
					reportProblem(JavaScriptProblems.UNDEFINED_PROPERTY, NLS
							.bind(ValidationMessages.UndefinedProperty, result
									.getName(), type.getName()), propName
							.sourceStart(), propName.sourceEnd());
				}
			}
		}

		@Override
		protected Type resolveType(org.eclipse.dltk.javascript.ast.Type type) {
			final Type result = super.resolveType(type);
			if (result != null) {
				if (result.getKind() == TypeKind.UNKNOWN) {
					reportProblem(JavaScriptProblems.UNKNOWN_TYPE, NLS.bind(
							ValidationMessages.UnknownType, type.getName()),
							type.sourceStart(), type.sourceEnd());
				} else if (result.isDeprecated()) {
					reportProblem(JavaScriptProblems.DEPRECATED_TYPE, NLS.bind(
							ValidationMessages.DeprecatedType, type.getName()),
							type.sourceStart(), type.sourceEnd());
				}
			}
			return result;
		}

		private void reportProblem(int id, String message, int start, int end) {
			reporter.reportProblem(new DefaultProblem(message, id, null,
					ProblemSeverities.Warning, start, end, lineTracker
							.getLineNumberOfOffset(start)));
		}
	}

}
