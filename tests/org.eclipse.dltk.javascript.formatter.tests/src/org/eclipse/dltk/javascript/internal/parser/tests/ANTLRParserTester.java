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
import org.antlr.runtime.ParserRuleReturnScope;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.Token;
import org.eclipse.dltk.ast.declarations.ModuleDeclaration;
import org.eclipse.dltk.javascript.ast.ISourceable;
import org.eclipse.dltk.javascript.ast.JavaScriptParser;
import org.eclipse.dltk.javascript.ast.JavaScriptTokenStream;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.formatter.preferences.JavaScriptFormatterModifyDialog;
import org.eclipse.dltk.javascript.parser.JSLexer;
import org.eclipse.dltk.javascript.parser.JSParser;
import org.eclipse.dltk.javascript.parser.JSTransformer;

public class ANTLRParserTester {

	public static void parsePreview(String resourceName) throws IOException {

		parseResource(JavaScriptFormatterModifyDialog.class
				.getResourceAsStream(resourceName));

	}

	public static void parse(String resourceName) throws IOException {

		parseResource(ANTLRParserTester.class
				.getResourceAsStream("/scripts.parser/" + resourceName));

	}

	private static void parseResource(InputStream resource) throws IOException {
		JSLexer lexer = new JSLexer(new ANTLRInputStream(resource));

		JavaScriptTokenStream stream = new JavaScriptTokenStream(lexer);
		String source = "";

		List tokens = stream.getTokens();
		for (int i = 0; i < tokens.size(); i++) {
			Token token = (Token) tokens.get(i);

			source += token.getText();

			// System.out.println(new Integer(token.getTokenIndex()).toString()
			// + ". " + JSParser.tokenNames[token.getType()] + " "
			// + token.getText());
		}

		JSParser parser = new JSParser(stream);

		try {
			ParserRuleReturnScope root = parser.program();

			// new ANTLRTreeVisitor().visit(root);

			ModuleDeclaration result = new JSTransformer(root, tokens)
					.transform();

			Assert.assertNotNull(result);

			String formatted = ((ISourceable) result).toSourceString("");

			Assert.assertTrue(formatted != null && formatted.length() > 0);

			ANTLRTokenStreamComparer.compare(source, formatted, false);
			new ASTVerifier(result, source).verify();

			// System.out.println("-------------------------------------------");
			// System.out.println(formatted);
			// System.out.println("-------------------------------------------");

			Script script = (Script) new JavaScriptParser().parse(null,
					formatted.toCharArray(), null);

			if (script == null || script.toSourceString("").length() == 0)
				Assert.fail();

		} catch (RecognitionException e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}

	}

}
