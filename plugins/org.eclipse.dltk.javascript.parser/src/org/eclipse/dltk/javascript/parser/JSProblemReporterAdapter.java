/*******************************************************************************
 * Copyright (c) 2014 Alex Panchenko
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Alex Panchenko - initial API and Implementation
 *******************************************************************************/
package org.eclipse.dltk.javascript.parser;

import java.util.Collection;

import org.eclipse.dltk.compiler.problem.IProblem;
import org.eclipse.dltk.compiler.problem.IProblemIdentifier;

public abstract class JSProblemReporterAdapter implements JSProblemReporter {

	public void reportProblem(IProblemIdentifier identifier, String message,
			int start, int end) {
	}

	public void reportProblem(IProblem problem) {
	}

	public void pushSuppressWarnings(Collection<IProblemIdentifier> suppressed) {
	}

	public void popSuppressWarnings() {
	}

	public ISuppressWarningsState getSuppressWarnings() {
		return null;
	}

	public void restoreSuppressWarnings(ISuppressWarningsState state) {
	}
}
