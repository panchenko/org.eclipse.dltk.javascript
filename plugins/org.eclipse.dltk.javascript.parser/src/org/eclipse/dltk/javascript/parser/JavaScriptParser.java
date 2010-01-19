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
import org.antlr.runtime.BitSet;
import org.antlr.runtime.CharStream;
import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.IntStream;
import org.antlr.runtime.MismatchedSetException;
import org.antlr.runtime.MismatchedTokenException;
import org.antlr.runtime.NoViableAltException;
import org.antlr.runtime.RecognitionException;
import org.antlr.runtime.RuleReturnScope;
import org.antlr.runtime.Token;
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
				RecognitionException re) {
			if (reporter == null)
				return;
			String message;
			int start;
			int stop;
			if (re instanceof NoViableAltException) {
				start = convert(re.token);
				stop = start + length(re.token);
				message = "Unexpected " + getTokenErrorDisplay(re.token);
			} else if (re instanceof MismatchedTokenException) {
				MismatchedTokenException mte = (MismatchedTokenException) re;
				if (re.token == Token.EOF_TOKEN) {
					message = tokenNames[mte.expecting] + " expected";
					TokenStream stream = getTokenStream();
					int index = stream.index();
					Token prevToken;
					for (;;) {
						--index;
						prevToken = stream.get(index);
						if (prevToken.getType() != JSParser.WhiteSpace
								&& prevToken.getType() != JSParser.EOL) {
							break;
						}
					}
					start = convert(prevToken);
					stop = start + length(prevToken);
				} else {
					message = "Mismatched input "
							+ getTokenErrorDisplay(re.token) + ", "
							+ tokenNames[mte.expecting] + " expected";
					start = convert(re.token);
					stop = start + length(re.token);
				}
				if (stop >= inputLength()) {
					stop = inputLength() - 1;
					start -= 2;
				}
			} else if (re instanceof MismatchedSetException) {
				MismatchedSetException mse = (MismatchedSetException) re;
				message = "Mismatched input " + getTokenErrorDisplay(re.token);
				if (mse.expecting != null) {
					message += " expecting set " + mse.expecting;
				}
				start = convert(re.token);
				stop = start + length(re.token);
			} else {
				message = "Syntax Error:" + re.getMessage();
				start = convert(re.token);
				stop = start + 1;
			}
			reporter.reportProblem(new DefaultProblem(message, 0, null,
					ProblemSeverities.Error, start, stop, re.line - 1));
		}

		private int convert(Token token) {
			return lineTracker.getLineOffset(token.getLine() - 1)
					+ Math.max(token.getCharPositionInLine(), 0);
		}

		private int length(Token token) {
			String sm = token.getText();
			return sm != null ? sm.length() : 1;
		}

		private int inputLength() {
			return lineTracker.getLength();
		}

		/*
		 * Standard implementation contains forgotten debug System.err.println()
		 * and we don't need it at all.
		 */
		@Override
		public void recoverFromMismatchedToken(IntStream input,
				RecognitionException e, int ttype, BitSet follow)
				throws RecognitionException {
			// if next token is what we are looking for then "delete" this token
			if (input.LA(2) == ttype) {
				reportError(e);
				beginResync();
				input.consume(); // simply delete extra token
				endResync();
				input.consume(); // move past ttype token as if all were ok
				return;
			}
			// insert "}" if expected
			if (ttype == JSParser.RBRACE) {
				displayRecognitionError(getTokenNames(), e);
				return;
			}
			if (!recoverFromMismatchedElement(input, e, follow)) {
				throw e;
			}
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
			// create empty output
			Script script = new Script();
			script.setStart(0);
			script.setEnd(source.length);
			return script;
		}
	}

}
