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

import java.io.CharArrayReader;
import java.io.IOException;
import java.util.List;

import org.antlr.runtime.ANTLRReaderStream;
import org.eclipse.core.runtime.Assert;
import org.eclipse.dltk.ast.declarations.ModuleDeclaration;
import org.eclipse.dltk.compiler.problem.IProblem;
import org.eclipse.dltk.compiler.problem.IProblemReporter;
import org.eclipse.dltk.javascript.ast.JavaScriptParser;
import org.eclipse.dltk.javascript.ast.JavaScriptTokenStream;
import org.eclipse.dltk.javascript.parser.JSLexer;

public class JavaScriptTokenStreamTester extends AbstractTester {

	public static void tokenize(String resourceName) throws IOException {

		String source = getScriptContent(resourceName);

		JSLexer lexer = new JSLexer(new ANTLRReaderStream(new CharArrayReader(
				source.toCharArray())));

		// CommonTokenStream stream = new CommonTokenStream(lexer);
		JavaScriptTokenStream stream = new JavaScriptTokenStream(lexer);

		List tokens = stream.getTokens();

		Assert.isTrue(tokens.size() > 0);

		// for (int i = 0; i < tokens.size(); i++) {
		// Token tk = (Token) tokens.get(i);
		// System.out.println(i + ". " + tk.getText());
		// }
	}

	public static void parse(String resourceName) throws IOException {
		String source = getScriptContent(resourceName);

		JavaScriptParser parser = new JavaScriptParser();

		ModuleDeclaration root = parser.parse(null, source.toCharArray(),
				new IProblemReporter() {

					public void reportProblem(IProblem problem) {
						System.out.println("Parser error: "
								+ problem.getMessage());
					}

					public Object getAdapter(Class adapter) {
						return null;
					}
				});

		Assert.isNotNull(root);

		// System.out.println(((Script) root).toSourceString(""));
	}
}
