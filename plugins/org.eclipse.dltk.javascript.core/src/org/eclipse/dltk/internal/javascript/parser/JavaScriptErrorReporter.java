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

	public void error(String message, String sourceName, int line,
			String lineSource, int offset) {
		if (fReporter == null) {
			return;
		}
		int startPosition = offset;
		if (lineSource != null) {
			startPosition -= lineSource.length();
		}
		fReporter.reportProblem(new DefaultProblem(sourceName, message, 0,
				null, ProblemSeverities.Error, startPosition, offset, line));
	}

	public EvaluatorException runtimeError(String message, String sourceName,
			int line, String lineSource, int lineOffset) {
		// should never happen
		return null;
	}

	public void warning(String message, String sourceName, int line,
			String lineSource, int offset) {
		if (fReporter == null) {
			return;
		}
		fReporter.reportProblem(new DefaultProblem(sourceName, message, 0,
				null, ProblemSeverities.Warning, offset, offset + 1, line));
	}
}
