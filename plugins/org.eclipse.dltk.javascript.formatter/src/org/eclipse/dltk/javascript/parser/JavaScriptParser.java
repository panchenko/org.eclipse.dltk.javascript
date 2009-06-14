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

package org.eclipse.dltk.javascript.parser;

import java.io.CharArrayReader;
import java.io.IOException;
import java.util.List;

import org.antlr.runtime.ANTLRFileStream;
import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RuleReturnScope;
import org.antlr.runtime.TokenStream;
import org.eclipse.dltk.ast.declarations.ModuleDeclaration;
import org.eclipse.dltk.ast.parser.AbstractSourceParser;
import org.eclipse.dltk.compiler.problem.IProblem;
import org.eclipse.dltk.compiler.problem.IProblemReporter;
import org.eclipse.dltk.compiler.problem.ProblemReporterProxy;
import org.eclipse.dltk.core.DLTKCore;

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
				reportProblem(e, reporter);
			}
		}

		public void emitErrorMessage(String msg) {
			if (DLTKCore.DEBUG)
				System.err.println(msg);
		}
	}

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

			TokenStream stream = new JavaScriptTokenStream(lexer);
			// TokenStream stream = new CommonTokenStream(lexer);

			JSParser parser = new JSInternalParser(stream, reporterProxy);

			RuleReturnScope root = parser.program();

			if (reporterProxy.isErrorReported())
				return null;

			CharStream charStream2 = getCharStream();
			JSLexer lexer2 = new JSLexer(charStream2);
			List tokens = new JavaScriptTokenStream(lexer2).getTokens();

			return new JSTransformer(root, tokens).transform();

		} catch (Exception e) {
			if (DLTKCore.DEBUG)
				e.printStackTrace();
			reportProblem(e, reporterProxy);
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

	private class JSInternalProblem implements IProblem {

		private Exception exception;

		public JSInternalProblem(Exception exception) {
			this.exception = exception;
		}

		public String[] getArguments() {
			return null;
		}

		public int getID() {
			return 0;
		}

		public String getMessage() {
			return exception.getMessage();
		}

		public String getOriginatingFileName() {
			return null;
		}

		public int getSourceEnd() {
			return 0;
		}

		public int getSourceLineNumber() {
			if (exception instanceof RecognitionException)
				return ((RecognitionException) exception).line;
			return 0;
		}

		public int getSourceStart() {
			return 0;
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

	}

	private void reportProblem(final Exception e, IProblemReporter reporter) {
		reporter.reportProblem(new JSInternalProblem(e));
	}

}
