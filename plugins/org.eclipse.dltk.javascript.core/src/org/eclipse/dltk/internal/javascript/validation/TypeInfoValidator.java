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

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.compiler.problem.DefaultProblem;
import org.eclipse.dltk.compiler.problem.IProblemReporter;
import org.eclipse.dltk.compiler.problem.ProblemSeverities;
import org.eclipse.dltk.core.builder.IBuildContext;
import org.eclipse.dltk.core.builder.IBuildParticipant;
import org.eclipse.dltk.core.builder.ISourceLineTracker;
import org.eclipse.dltk.internal.javascript.ti.IMethodValueReference;
import org.eclipse.dltk.internal.javascript.ti.ITypeInferenceContext;
import org.eclipse.dltk.internal.javascript.ti.IValueReference;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencer2;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencerVisitor;
import org.eclipse.dltk.javascript.ast.CallExpression;
import org.eclipse.dltk.javascript.ast.PropertyExpression;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.core.JavaScriptProblems;
import org.eclipse.dltk.javascript.typeinfo.model.Method;
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

	private static class ValidationVisitor extends TypeInferencerVisitor {

		private final IProblemReporter reporter;
		private final ISourceLineTracker lineTracker;

		public ValidationVisitor(ITypeInferenceContext context,
				IProblemReporter reporter, ISourceLineTracker lineTracker) {
			super(context);
			this.reporter = reporter;
			this.lineTracker = lineTracker;
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
			final IValueReference reference = visit(expression);
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
										reference.getName()),
								ProblemSeverities.Warning, methodNode
										.sourceStart(), methodNode.sourceEnd());
					}
					if (method.isDeprecated()) {
						reportProblem(JavaScriptProblems.DEPRECATED_METHOD, NLS
								.bind(ValidationMessages.DeprecatedMethod,
										reference.getName(), method
												.getDeclaringType().getName()),
								ProblemSeverities.Warning, methodNode
										.sourceStart(), methodNode.sourceEnd());
					}
				} else {
					final Type type = JavaScriptValidations.typeOf(reference
							.getParent());
					if (type != null && type.getKind() == TypeKind.JAVA) {
						reportProblem(JavaScriptProblems.UNDEFINED_METHOD, NLS
								.bind(ValidationMessages.UndefinedMethod,
										reference.getName(), type.getName()),
								ProblemSeverities.Warning, methodNode
										.sourceStart(), methodNode.sourceEnd());
					}
				}
				return reference.getChild(IValueReference.FUNCTION_OP);
			} else {
				return null;
			}
		}

		@Override
		protected Type resolveType(org.eclipse.dltk.javascript.ast.Type type) {
			final Type result = super.resolveType(type);
			if (result != null) {
				if (result.getKind() == TypeKind.UNKNOWN) {
					reportProblem(JavaScriptProblems.UNKNOWN_TYPE, NLS.bind(
							ValidationMessages.UnknownType, type.getName()),
							ProblemSeverities.Warning, type.sourceStart(), type
									.sourceEnd());
				} else if (result.isDeprecated()) {
					reportProblem(JavaScriptProblems.DEPRECATED_TYPE, NLS.bind(
							ValidationMessages.DeprecatedType, type.getName()),
							ProblemSeverities.Warning, type.sourceStart(), type
									.sourceEnd());
				}
			}
			return result;
		}

		private void reportProblem(int id, String message, int severity,
				int start, int end) {
			reporter.reportProblem(new DefaultProblem(message, id, null,
					severity, start, end, lineTracker
							.getLineNumberOfOffset(start)));
		}
	}

}
