/*******************************************************************************
 * Copyright (c) 2007, 2010 xored software, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation
 *******************************************************************************/
package org.eclipse.dltk.internal.javascript.parser;

import com.xored.org.mozilla.javascript.ErrorReporter;
import com.xored.org.mozilla.javascript.EvaluatorException;

public final class NullReporter implements ErrorReporter {
	public void error(String arg0, String arg1, int arg2, String arg3, int arg4) {

	}

	public EvaluatorException runtimeError(String arg0, String arg1, int arg2,
			String arg3, int arg4) {
		return null;
	}

	public void warning(String arg0, String arg1, int arg2, String arg3,
			int arg4) {

	}
}
