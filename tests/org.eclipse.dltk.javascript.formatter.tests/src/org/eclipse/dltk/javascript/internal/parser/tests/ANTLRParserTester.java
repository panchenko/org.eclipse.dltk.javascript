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

import org.antlr.runtime.ANTLRInputStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.eclipse.dltk.ast.declarations.ModuleDeclaration;
import org.eclipse.dltk.javascript.ast.ISourceable;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.formatter.JavaScriptFormatterPlugin;
import org.eclipse.dltk.javascript.formatter.tests.JavaScriptFormatterTestsPlugin;
import org.eclipse.dltk.javascript.parser.JSLexer;
import org.eclipse.dltk.javascript.parser.JSParser;
import org.eclipse.dltk.javascript.parser.JSTransformer;
import org.eclipse.dltk.javascript.parser.JavaScriptParser;
import org.eclipse.dltk.javascript.parser.JavaScriptTokenFilter;
import org.eclipse.dltk.javascript.parser.JavaScriptTokenSource;

public class ANTLRParserTester {

	public static void parsePreview(String resourceName) throws Exception {
		String fullResourceName = "org/eclipse/dltk/javascript/formatter/preferences/" + resourceName; //$NON-NLS-1$
		parseResource(JavaScriptFormatterPlugin.getDefault().getBundle()
				.getResource(fullResourceName).openStream());
	}

	public static void parse(String resourceName) throws Exception {
		String fullResourceName = "scripts.parser/" + resourceName; //$NON-NLS-1$
		parseResource(JavaScriptFormatterTestsPlugin.getDefault().getBundle()
				.getResource(fullResourceName).openStream());
	}

	private static void parseResource(InputStream resource) throws IOException,
			RecognitionException {
		JSLexer lexer = new JSLexer(new ANTLRInputStream(resource));
		CommonTokenStream stream = new CommonTokenStream(
				new JavaScriptTokenSource(lexer));
		JSParser parser = new JSParser(stream);
		ParserRuleReturnScope root = parser.program();

		final StringBuffer source = new StringBuffer();
		@SuppressWarnings("unchecked")
		List<Token> tokens = stream.getTokens();
		for (Token token : tokens) {
			source.append(token.getText());
		}

		ModuleDeclaration result = new JSTransformer(root, tokens).transform();
		Assert.assertNotNull(result);

		String formatted = ((ISourceable) result).toSourceString("");
		Assert.assertTrue(formatted != null && formatted.length() > 0);

		ANTLRTokenStreamComparer.compare(source.toString(), formatted, false);
		new ASTVerifier(result, source.toString()).verify();

		// System.out.println("-------------------------------------------");
		// System.out.println(formatted);
		// System.out.println("-------------------------------------------");

		Script script = (Script) new JavaScriptParser().parse(null, formatted
				.toCharArray(), null);

		if (script == null || script.toSourceString("").length() == 0)
			Assert.fail();

	}

}
