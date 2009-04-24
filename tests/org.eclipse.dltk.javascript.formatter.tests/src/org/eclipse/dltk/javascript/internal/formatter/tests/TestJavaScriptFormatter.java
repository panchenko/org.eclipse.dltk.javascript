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
package org.eclipse.dltk.javascript.internal.formatter.tests;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.dltk.compiler.util.Util;
import org.eclipse.dltk.javascript.formatter.JavaScriptFormatter;
import org.eclipse.dltk.javascript.formatter.JavaScriptFormatterConstants;

public class TestJavaScriptFormatter extends JavaScriptFormatter {

	public TestJavaScriptFormatter() {
		super(Util.LINE_SEPARATOR, createTestingPreferences());
	}

	public TestJavaScriptFormatter(String lineDelimiter, Map preferences) {
		super(lineDelimiter, preferences);
	}

	protected boolean isValidation() {
		return false;
	}

	public static Map createTestingPreferences() {
		final Map result = new HashMap();

		String[] options = JavaScriptFormatterConstants.getNames();
		for (int i = 0; i < options.length; i++) {
			String name = options[i];
			result
					.put(name, JavaScriptFormatterConstants
							.getDefaultValue(name));
		}
		return result;
	}
}
