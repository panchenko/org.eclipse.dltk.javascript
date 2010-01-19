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

import org.antlr.runtime.ANTLRReaderStream;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RuleReturnScope;
import org.antlr.runtime.TokenStream;
import org.eclipse.core.runtime.Assert;
import org.eclipse.dltk.ast.parser.AbstractSourceParser;
import org.eclipse.dltk.compiler.problem.DefaultProblem;
import org.eclipse.dltk.compiler.problem.IProblemReporter;
import org.eclipse.dltk.compiler.problem.ProblemSeverities;
import org.eclipse.dltk.core.DLTKCore;
import org.eclipse.dltk.core.builder.ISourceLineTracker;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.utils.TextUtils;

public class JavaScriptParser extends AbstractSourceParser {

	private static class JSInternalParser extends JSParser {

		private final IProblemReporter reporter;
		private final ISourceLineTracker lineTracker;

		public JSInternalParser(TokenStream input, IProblemReporter reporter,
				ISourceLineTracker lineTracker) {
			super(input);
			this.reporter = reporter;
			this.lineTracker = lineTracker;
		}

		@Override
		public void displayRecognitionError(String[] tokenNames,
				RecognitionException e) {
			if (reporter == null)
				return;
			int offset = lineTracker.getLineOffset(e.line)
					+ e.charPositionInLine;
			reporter.reportProblem(new DefaultProblem(getErrorMessage(e,
					tokenNames), 0, null, ProblemSeverities.Error, offset,
					offset, e.line));
		}

	}

	/**
	 * @since 2.0
	 */
	public Script parse(char[] fileName, char[] source,
			IProblemReporter reporter) {
		Assert.isNotNull(source);
		try {
			CharStream charStream = new ANTLRReaderStream(new CharArrayReader(
					source));
			JSLexer lexer = new JSLexer(charStream);
			CommonTokenStream stream = new CommonTokenStream(
					new JavaScriptTokenSource(lexer));
			JSInternalParser parser = new JSInternalParser(stream, reporter,
					TextUtils.createLineTracker(source));
			RuleReturnScope root = parser.program();
			// if (parser.errorCount != 0)
			// return null;
			return new JSTransformer(stream.getTokens()).transform(root);
		} catch (Exception e) {
			if (DLTKCore.DEBUG)
				e.printStackTrace();
			if (reporter != null) {
				reporter.reportProblem(new JSProblem(e));
			}
			return null;
		}
	}

}
