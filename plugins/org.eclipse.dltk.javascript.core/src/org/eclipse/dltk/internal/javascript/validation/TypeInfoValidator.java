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

import org.eclipse.core.runtime.CoreException;
import org.eclipse.dltk.compiler.env.IModuleSource;
import org.eclipse.dltk.compiler.problem.DefaultProblem;
import org.eclipse.dltk.compiler.problem.IProblemReporter;
import org.eclipse.dltk.compiler.problem.ProblemSeverities;
import org.eclipse.dltk.core.builder.IBuildContext;
import org.eclipse.dltk.core.builder.IBuildParticipant;
import org.eclipse.dltk.core.builder.ISourceLineTracker;
import org.eclipse.dltk.internal.javascript.ti.ITypeInferenceContext;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencer2;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencerVisitor;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.core.IJavaScriptProblems;
import org.eclipse.dltk.javascript.parser.JavaScriptParser;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeKind;

public class TypeInfoValidator implements IBuildParticipant,
		IJavaScriptProblems {

	public void build(IBuildContext context) throws CoreException {
		// TODO use cached AST
		Script script = new JavaScriptParser().parse((IModuleSource) context
				.getSourceModule(), null);
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
		protected Type resolveType(org.eclipse.dltk.javascript.ast.Type type) {
			final Type result = super.resolveType(type);
			if (result != null && result.getKind() == TypeKind.UNKNOWN) {
				reporter.reportProblem(new DefaultProblem("Unknown type "
						+ type.getName(), IJavaScriptProblems.UNKNOWN_TYPE,
						null, ProblemSeverities.Warning, type.sourceStart(),
						type.sourceEnd(), lineTracker
								.getLineNumberOfOffset(type.sourceStart())));
			}
			return result;
		}
	}

}
