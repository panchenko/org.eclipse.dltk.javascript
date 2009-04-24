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

package org.eclipse.dltk.javascript.ast;

import java.io.CharArrayReader;
import java.io.IOException;
import java.util.List;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RuleReturnScope;
import org.antlr.runtime.TokenStream;
import org.eclipse.dltk.ast.declarations.ModuleDeclaration;
import org.eclipse.dltk.ast.parser.AbstractSourceParser;
import org.eclipse.dltk.compiler.problem.IProblem;
import org.eclipse.dltk.compiler.problem.IProblemReporter;
import org.eclipse.dltk.compiler.problem.ProblemReporterProxy;
import org.eclipse.dltk.core.DLTKCore;
import org.eclipse.dltk.javascript.parser.JSLexer;
import org.eclipse.dltk.javascript.parser.JSParser;
import org.eclipse.dltk.javascript.parser.JSTransformer;

public class JavaScriptParser extends AbstractSourceParser {

	private class JSInternalLexer extends JSLexer {
		private IProblemReporter reporter;

		public JSInternalLexer(CharStream input, IProblemReporter reporter) {
			super(input);

			this.reporter = reporter;
		}

		public void reportError(RecognitionException e) {
			super.reportError(e);

			if (!errorRecovery) {
				// DEBUG
				// System.out.println(e + " Line: " + e.line + " Pos: "
				// + e.charPositionInLine + " Token: "
				// + getTokenText(e.token));

				reportProblem(e, reporter);
			}
		}

		public void emitErrorMessage(String msg) {
			if (DLTKCore.DEBUG)
				System.err.println(msg);
		}
	}

	private class JSInternalParser extends JSParser {

		private IProblemReporter reporter;

		public JSInternalParser(TokenStream input, IProblemReporter reporter) {
			super(input);

			this.reporter = reporter;
		}

		public void reportError(RecognitionException e) {
			super.reportError(e);

			if (!errorRecovery) {
				// DEBUG
				// System.out.println(e + " Line: " + e.line + " Pos: "
				// + e.charPositionInLine + " Token: "
				// + getTokenText(e.token));

				reportProblem(e, reporter);
			}
		}

		public void emitErrorMessage(String msg) {
			if (DLTKCore.DEBUG)
				System.err.println(msg);
		}
	}

	// // DEBUG
	// private static String getTokenText(Token token) {
	// if (token != null)
	// return token.getText();
	// else
	// return "<null>";
	// }
	//

	private class JSInternalProblemReporterProxy extends ProblemReporterProxy {

		private boolean errorReported = false;

		public JSInternalProblemReporterProxy(IProblemReporter original) {
			super(original);
		}

		public void reportProblem(IProblem problem) {
			errorReported = true;
			super.reportProblem(problem);
		}

		public boolean isErrorReported() {
			return this.errorReported;
		}
	}

	private String fileName;
	private String source;

	public ModuleDeclaration parse(char[] fileName, char[] source,
			IProblemReporter reporter) {

		// Assert.isNotNull(reporter);

		if (fileName == null && source == null)
			throw new IllegalArgumentException(
					"fileName or source argument required");

		if (fileName != null)
			this.fileName = fileName.toString();

		if (source != null)
			this.source = new String(source);

		JSInternalProblemReporterProxy reporterProxy = new JSInternalProblemReporterProxy(
				reporter);

		try {
			CharStream charStream = getCharStream();

			JSLexer lexer = new JSInternalLexer(charStream, reporterProxy);
			JSParser parser = new JSInternalParser(
					new CommonTokenStream(lexer), reporterProxy);

			// JSLexer lexer = new JSInternalLexer(charStream);
			// JSParser parser = new JSInternalParser(new
			// CommonTokenStream(lexer));

			RuleReturnScope root = parser.program();

			if (reporterProxy.isErrorReported())
				return null;

			CharStream charStream2 = getCharStream();
			JSLexer lexer2 = new JSLexer(charStream2);
			CommonTokenStream stream = new CommonTokenStream(lexer2);
			List tokens = stream.getTokens();

			return new JSTransformer(root, tokens).transform();

		} catch (Exception e) {
			if (DLTKCore.DEBUG)
				e.printStackTrace();
			reportProblem(e, reporter);
			return null;
		}
	}

	private CharStream getCharStream() throws IOException {
		if (fileName != null)
			return new ANTLRFileStream(fileName);
		else
			return new ANTLRReaderStream(new CharArrayReader(source
					.toCharArray()));
	}

	private void reportProblem(final Exception e, IProblemReporter reporter) {
		reporter.reportProblem(new IProblem() {

			public String[] getArguments() {
				return null;
			}

			public int getID() {
				return 0;
			}

			public String getMessage() {
				return e.getLocalizedMessage();
			}

			public String getOriginatingFileName() {
				return fileName;
			}

			public int getSourceEnd() {
				// if (e instanceof RecognitionException)
				// ((RecognitionException)e).
				return -1;
			}

			public int getSourceLineNumber() {
				if (e instanceof RecognitionException)
					return ((RecognitionException) e).line;

				return -1;
			}

			public int getSourceStart() {
				return -1;
			}

			public boolean isError() {
				return true;
			}

			public boolean isWarning() {
				return false;
			}

			public void setSourceEnd(int sourceEnd) {
			}

			public void setSourceLineNumber(int lineNumber) {
			}

			public void setSourceStart(int sourceStart) {
			}
		});

	}

}
