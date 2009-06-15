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

import junit.framework.Assert;

import org.eclipse.dltk.javascript.formatter.JavaScriptFormatterConstants;
import org.eclipse.dltk.javascript.formatter.JavaScriptFormatterFactory;
import org.eclipse.dltk.javascript.formatter.tests.JavaScriptFormatterTestsPlugin;
import org.eclipse.dltk.ui.formatter.IScriptFormatter;
import org.eclipse.jface.text.Document;
import org.eclipse.text.edits.ReplaceEdit;
import org.eclipse.text.edits.TextEdit;

public class JavaScriptParserTester extends AbstractTester {

	private void parseScript(String source) throws Exception {

		JavaScriptFormatterFactory f = new JavaScriptFormatterFactory();

		IScriptFormatter formatter = f.createFormatter("\n",
				JavaScriptFormatterConstants.getDefaults());

		TextEdit textEdit = formatter.format(source, 0, source.length(), 0);

		Assert.assertNotNull(textEdit);

		String formatted = ((ReplaceEdit) textEdit).getText();

		Assert.assertTrue(
				"There are no changes in formatted document, format() fails!",
				!source.equals(formatted));

		ANTLRTokenStreamComparer.compare(source, formatted, true);

		TextEdit edit = formatter.format(formatted, 0, formatted.length(), 0);
		Document document = new Document(formatted);
		edit.apply(document);
		String reformatted = document.get();

		// Formatting formatted text MUST NOT change it again!
		Assert.assertEquals(formatted, reformatted);

	}

	public static void parse(String resourceName) throws Exception {
		parse(resourceName, JavaScriptFormatterTestsPlugin.CONTEXT.getCharset());
	}

	public static void parse(String resourceName, String charset)
			throws Exception {
		new JavaScriptParserTester().parseScript(getScriptContent(resourceName,
				charset));
	}

	public static void parseSource(String source) throws Exception {
		new JavaScriptParserTester().parseScript(source);
	}
}
