/*******************************************************************************
 * Copyright (c) 2008 xored software, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.internal.javascript.parser;

import org.eclipse.dltk.compiler.problem.DefaultProblem;
import org.eclipse.dltk.compiler.problem.IProblemReporter;
import org.eclipse.dltk.compiler.problem.ProblemSeverities;

import com.xored.org.mozilla.javascript.ErrorReporter;
import com.xored.org.mozilla.javascript.EvaluatorException;

public class JavaScriptErrorReporter implements ErrorReporter {

	private final IProblemReporter fReporter;

	public JavaScriptErrorReporter(IProblemReporter reporter) {
		fReporter = reporter;
	}

	public void error(String arg0, String arg1, int arg2, String arg3, int arg4) {
		if (fReporter != null)
			fReporter.reportProblem(new DefaultProblem(arg1, arg0, 0,
					new String[] {}, ProblemSeverities.Error, arg4
							- (arg3 != null ? arg3.length() : 0), arg4, arg2));
	}

	public EvaluatorException runtimeError(String arg0, String arg1, int arg2,
			String arg3, int arg4) {
		// should never happen;
		return null;
	}

	public void warning(String arg0, String arg1, int arg2, String arg3,
			int arg4) {
		if (fReporter != null)
			fReporter.reportProblem(new DefaultProblem(arg1, arg0, 0,
					new String[] {}, ProblemSeverities.Warning, arg4, arg4 + 1,
					arg2));
	}
}
