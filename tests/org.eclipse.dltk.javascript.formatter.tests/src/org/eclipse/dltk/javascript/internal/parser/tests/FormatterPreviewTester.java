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

import java.io.InputStream;

import org.eclipse.dltk.javascript.formatter.JavaScriptFormatterPlugin;
import org.eclipse.dltk.javascript.formatter.tests.JavaScriptFormatterTestsPlugin;

public class FormatterPreviewTester extends AbstractTester {

	public static void testPagePreview(String resourceName) throws Exception {
		String fullResourceName = "org/eclipse/dltk/javascript/formatter/preferences/" + resourceName; //$NON-NLS-1$
		InputStream stream = JavaScriptFormatterPlugin.getDefault().getBundle()
				.getResource(fullResourceName).openStream();

		JavaScriptParserTester.parseSource(getScriptContent(stream,
				JavaScriptFormatterTestsPlugin.CONTEXT.getCharset()));
	}

	public static void testGeneralPreview(String resourceName) throws Exception {
		String fullResourceName = "org/eclipse/dltk/javascript/formatter/" + resourceName; //$NON-NLS-1$
		InputStream stream = JavaScriptFormatterPlugin.getDefault().getBundle()
				.getResource(fullResourceName).openStream();

		JavaScriptParserTester.parseSource(getScriptContent(stream,
				JavaScriptFormatterTestsPlugin.CONTEXT.getCharset()));
	}
}
