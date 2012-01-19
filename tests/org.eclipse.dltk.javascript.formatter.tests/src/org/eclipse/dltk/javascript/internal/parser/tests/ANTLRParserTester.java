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
import java.util.List;

import junit.framework.Assert;

import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.eclipse.dltk.compiler.env.ModuleSource;
import org.eclipse.dltk.javascript.ast.ISourceable;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.formatter.tests.JavaScriptFormatterTestsPlugin;
import org.eclipse.dltk.javascript.parser.JSParser.program_return;
import org.eclipse.dltk.javascript.parser.JSTokenStream;
import org.eclipse.dltk.javascript.parser.JSTransformer;
import org.eclipse.dltk.javascript.parser.JavaScriptParser;
import org.eclipse.dltk.javascript.parser.tests.ASTVerifier;

@SuppressWarnings("nls")
public class ANTLRParserTester {

	public static void parsePreview(String resourceName) throws Exception {
		String fullResourceName = "org/eclipse/dltk/javascript/formatter/preferences/"
				+ resourceName;
		parseResource(fullResourceName, null);
	}

	public static void parse(String resourceName) throws Exception {
		parse(resourceName, null);
	}

	public static void parse(String resourceName, String enconding)
			throws Exception {
		String fullResourceName = "scripts.parser/" + resourceName;
		parseResource(fullResourceName, enconding);
	}

	/**
	 * @param fullResourceName
	 * @param encoding
	 *            encoding of the resource or <code>null</code> if default
	 *            system encoding should be used.
	 */
	private static void parseResource(String fullResourceName, String encoding)
			throws IOException, RecognitionException {
		InputStream resource = JavaScriptFormatterTestsPlugin.getDefault()
				.getBundle().getResource(fullResourceName).openStream();
		final JavaScriptParser parser = new JavaScriptParser();
		JSTokenStream stream = parser.createTokenStream(resource, encoding);
		program_return root = parser.createTreeParser(stream, null).program();

		final StringBuilder source = new StringBuilder();
		List<Token> tokens = stream.getTokens();
		for (Token token : tokens) {
			source.append(token.getText());
		}

		Script result = new JSTransformer(tokens).transformScript(root);
		Assert.assertNotNull(result);

		String formatted = ((ISourceable) result).toSourceString("");
		Assert.assertTrue(formatted.length() > 0);

		ANTLRTokenStreamComparer.compare(source.toString(), formatted, false);
		new ASTVerifier(result, source.toString()).verify();

		// System.out.println("-------------------------------------------");
		// System.out.println(formatted);
		// System.out.println("-------------------------------------------");

		Script script = parser.parse(new ModuleSource(formatted), null);

		Assert.assertNotNull(script);
		Assert.assertTrue(script.toSourceString("").length() != 0);
	}

}
