/*******************************************************************************
 * Copyright (c) 2009 xored software, Inc.  
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html  
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Vladimir Belov)
 *******************************************************************************/

package org.eclipse.dltk.javascript.internal.parser.tests;

import java.io.IOException;
import java.io.InputStream;

import org.eclipse.dltk.javascript.formatter.JavaScriptFormatter;
import org.eclipse.dltk.javascript.formatter.preferences.JavaScriptFormatterPreferenceInterpreter;
import org.eclipse.dltk.ui.formatter.FormatterException;

public class FormatterPreviewTester {

	public static void testPagePreview(String resourceName) throws IOException,
			FormatterException {

		InputStream stream = JavaScriptFormatterPreferenceInterpreter.class
				.getResourceAsStream(resourceName);

		JavaScriptParserTester.parseStream(stream);
	}

	public static void testGeneralPreview(String resourceName)
			throws IOException, FormatterException {

		InputStream stream = JavaScriptFormatter.class
				.getResourceAsStream(resourceName);

		JavaScriptParserTester.parseStream(stream);
	}
}
