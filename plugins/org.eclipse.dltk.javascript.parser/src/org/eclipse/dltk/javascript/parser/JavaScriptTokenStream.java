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

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.CommonTokenStream;
import org.antlr.runtime.Lexer;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;
import org.antlr.runtime.TokenStream;
import org.eclipse.core.runtime.Assert;
import org.eclipse.dltk.core.ISourceRange;
import org.eclipse.dltk.javascript.ast.Keywords;

public class JavaScriptTokenStream implements TokenStream {

	private int p = -1;
	private int lastMarker = -1;
	private int channel = Token.DEFAULT_CHANNEL;

	private Lexer lexer;
	private List tokens;
	private JavaScriptTokenSource tokenSource;

	public JavaScriptTokenStream(Lexer lexer) {
		this.lexer = lexer;
		fillBuffer();
	}

	private void fillBuffer() {
		transformTokens(new CommonTokenStream(lexer));
		tokenSource = new JavaScriptTokenSource(tokens);
	}

	public List getTokens() {
		return this.tokens;
	}

	private class SourceRange implements ISourceRange {
		private int length;
		private int offset;

		public SourceRange(int offset, int length) {
			this.offset = offset;
			this.length = length;
		}

		public int getLength() {
			return length;
		}

		public int getOffset() {
			return offset;
		}
	}

	private int skipBlanks(TokenStream source, int start) {

		for (int i = start; i < source.size(); i++) {
			switch (source.get(i).getType()) {

			case JSParser.WhiteSpace:
			case JSParser.SingleLineComment:
			case JSParser.MultiLineComment:
			case JSParser.EOL:
				continue;

			default:
				return i;
			}
		}

		return start;
	}

	private int skipXmlFragment(TokenStream source, int start) {

		int p = skipBlanks(source, start);

		if (p < source.size()) {
			ISourceRange fragment = getXmlFragmentRange(source, p);

			if (fragment != null)
				return p + fragment.getLength();
		}

		return start;
	}

	private int skipText(TokenStream source, int start, int closeToken) {
		for (int i = start; i < source.size(); i++) {
			if (source.get(i).getType() == closeToken)
				return i + 1;
		}
		return start;
	}

	private boolean isMinus(Token token) {
		return token.getType() == JSParser.SUB
				|| token.getType() == JSParser.NEG;
	}

	private boolean isXmlCommentOpenTag(TokenStream source, int start) {

		if (start + 3 > source.size() - 1)
			return false;

		if (source.get(start).getType() != JSParser.LT)
			return false;

		if (source.get(start + 1).getType() != JSParser.NOT)
			return false;

		if (!isMinus(source.get(start + 2)))
			return false;

		if (!isMinus(source.get(start + 3)))
			return false;

		return true;

	}

	private boolean isXmlCommentCloseTag(TokenStream source, int start) {

		if (start + 2 > source.size() - 1)
			return false;

		if (!isMinus(source.get(start)))
			return false;

		if (!isMinus(source.get(start + 1)))
			return false;

		if (source.get(start + 2).getType() != JSParser.GT)
			return false;

		return true;

	}

	private int skipText(TokenStream source, int start) {
		for (int i = start; i < source.size(); i++) {

			switch (source.get(i).getType()) {
			case JSParser.LT:
			case JSParser.XCOPEN:
				// if (isXmlCommentOpenTag(source, i))
				return i;

			case JSParser.GT:
			case JSParser.XCCLOSE:
			case JSParser.XHOPEN:
			case JSParser.XHCLOSE:
			case JSParser.XLCLOSE:
			case JSParser.XRCLOSE:
			case JSParser.CDATAOPEN:
				return i;

//			case JSParser.SUB:
//			case JSParser.NEG:
//				if (isXmlCommentCloseTag(source, i))
//					return i;

			case JSParser.RBRACK:
				if (i < source.size() - 2
						&& source.get(i + 1).getType() == JSParser.RBRACK
						&& source.get(i + 2).getType() == JSParser.GT)
					return i + 2;
			}
		}
		return start;
	}

	private ISourceRange getXmlSimpleFragmentRange(TokenStream source,
			int start, int openToken, int closeToken) {
		if (source.get(start).getType() != openToken)
			return null;

		for (int i = start + 1; i < source.size(); i++) {

			if (source.get(i).getType() == closeToken) {
				return new SourceRange(start, i - start + 1);
			}

		}

		return null;
	}

	private ISourceRange getXmlCDATARange(TokenStream source, int start) {

		if (source.get(start).getType() != JSParser.CDATAOPEN
				|| start + 5 /* CDATA, LBRACK, ..., RBRACK, RBRACK, GT */>= source
						.size())
			return null;

		if (source.get(start + 1).getType() != JSParser.CDATA)
			return null;

		if (source.get(start + 2).getType() != JSParser.LBRACK)
			return null;

		for (int i = start + 3 /* skip CDATA, LBRACK */; i < source.size() - 2 /*
																				 * ends
																				 * with
																				 * RBRACK
																				 * ,
																				 * GT
																				 */; i++) {

			if (source.get(i).getType() == JSParser.RBRACK
					&& source.get(i + 1).getType() == JSParser.RBRACK
					&& source.get(i + 2).getType() == JSParser.GT) {
				return new SourceRange(start, (i + 2) - start + 1);
			}
		}

		return null;
	}

	private boolean isXmlFragmentTagItem(Token tk) {

		if (Keywords.isKeyword(tk.getText()))
			return true;

		switch (tk.getType()) {
		case JSParser.Identifier:
		case JSParser.ASSIGN:
		case JSParser.StringLiteral:
		case JSParser.DecimalLiteral:
		case JSParser.DecimalIntegerLiteral:
		case JSParser.BOOLEAN:
		case JSParser.WhiteSpace:
		case JSParser.EOL:
			return true;
		}
		return false;
	}

	private ISourceRange getXmlContainerFragmentRange(TokenStream source,
			int start) {

		if (source.get(start).getType() != JSParser.LT)
			return null;

		for (int i = start + 1; i < source.size(); i++) {
			Token tk = source.get(i);

			if (isXmlFragmentTagItem(tk))
				continue;

			switch (tk.getType()) {

			case JSParser.XRCLOSE:
				return new SourceRange(start, i - start + 1);

			case JSParser.GT:

				// skip embedded XML tags and plain text, and find corresponded
				// </...> close tag

				int p = i + 1;
				for (;;) {
					int skipped = p;

					skipped = skipXmlFragment(source, skipped);
					skipped = skipText(source, skipped);

					if (p == skipped)
						break;

					p = skipped;
				}

				p = skipBlanks(source, p);

				if (source.get(p).getType() == JSParser.XLCLOSE) {
					p = skipText(source, p, JSParser.GT);
				}

				return new SourceRange(start, p - start);

			default:
				return null;
			}
		}

		return null;
	}

	private ISourceRange getXmlFragmentRange(TokenStream source, int start) {
		Token tk = source.get(start);

		switch (tk.getType()) {

		case JSParser.XHOPEN:
			return getXmlSimpleFragmentRange(source, start, JSParser.XHOPEN,
					JSParser.XHCLOSE);

		case JSParser.XCOPEN:
			return getXmlSimpleFragmentRange(source, start, JSParser.XCOPEN,
					JSParser.XCCLOSE);

		case JSParser.CDATAOPEN:
			return getXmlCDATARange(source, start);

		case JSParser.LT:
			return getXmlContainerFragmentRange(source, start);
		}

		return null;
	}

	private ISourceRange getXmlStringRange(TokenStream source, int start) {

		int i = start;
		int stop = -1;

		while (i < source.size()) {
			ISourceRange xmlFragment = getXmlFragmentRange(source, i);

			if (xmlFragment == null)
				break;

			stop = xmlFragment.getOffset() + xmlFragment.getLength();

			i = skipBlanks(source, stop);
			stop = i;
		}

		if (stop == -1)
			return null;

		return new SourceRange(start, stop - start);
	}

	private boolean isNotXmlStart(TokenStream source, int start) {
		for (int i = start; i >= 0; i--) {
			switch (source.get(i).getType()) {
			case JSParser.WhiteSpace:
			case JSParser.EOL:
			case JSParser.SingleLineComment:
			case JSParser.MultiLineComment:
				break;

			case JSParser.Identifier:
				// literals
			case JSParser.NULL:
			case JSParser.TRUE:
			case JSParser.FALSE:
			case JSParser.THIS:
			case JSParser.OctalIntegerLiteral:
			case JSParser.DecimalLiteral:
			case JSParser.HexIntegerLiteral:
			case JSParser.StringLiteral:
				// member access ending
			case JSParser.RBRACK:
				// function call or nested expression ending
			case JSParser.RPAREN:
				return true;

			default:
				return false;
			}

		}
		return false;
	}

	private void transformTokens(TokenStream source) {
		List ts = ((CommonTokenStream) source).getTokens();
		tokens = new ArrayList(source.size());

		int tokenIndex = 0;

		for (int i = 0; i < source.size(); i++) {
			Token tk = source.get(i);

			switch (tk.getType()) {

			case JSParser.LT:
			case JSParser.XHOPEN:
			case JSParser.XCOPEN:
			case JSParser.CDATAOPEN:

				boolean skip = false;

				if (tk.getType() == JSParser.LT) {
					skip = isNotXmlStart(source, tk.getTokenIndex() - 1);
				}

				if (!skip) {
					ISourceRange fragment = getXmlStringRange(source, i);
					if (fragment != null) {

						Token xmlToken = new JavaScriptToken();
						xmlToken.setLine(tk.getLine());
						xmlToken.setCharPositionInLine(tk
								.getCharPositionInLine());
						xmlToken.setChannel(Token.DEFAULT_CHANNEL);
						xmlToken.setTokenIndex(tokenIndex++);
						xmlToken.setType(JSParser.XMLLiteral);
						xmlToken.setText(source
								.toString(fragment.getOffset(), fragment
										.getOffset()
										+ fragment.getLength() - 1));

						tokens.add(xmlToken);
						i = fragment.getOffset() + fragment.getLength() - 1;

						continue;
					}
				}
				break;

			default:

			}

			Token newToken = new JavaScriptToken(source.get(i));
			newToken.setTokenIndex(tokenIndex++);

			tokens.add(newToken);
		}

		p = 0;
		p = skipOffTokenChannels(p);
	}

	private Token LB(int k) {
		if (p == -1) {
			fillBuffer();
		}
		if (k == 0) {
			return null;
		}
		if ((p - k) < 0) {
			return null;
		}

		int i = p;
		int n = 1;
		// find k good tokens looking backwards
		while (n <= k) {
			// skip off-channel tokens
			i = skipOffTokenChannelsReverse(i - 1); // leave p on valid token
			n++;
		}
		if (i < 0) {
			return null;
		}
		return (Token) tokens.get(i);
	}

	public Token LT(int k) {
		if (p == -1) {
			fillBuffer();
		}
		if (k == 0) {
			return null;
		}
		if (k < 0) {
			return LB(-k);
		}
		if ((p + k - 1) >= tokens.size()) {
			return Token.EOF_TOKEN;
		}
		int i = p;
		int n = 1;
		// find k good tokens
		while (n < k) {
			// skip off-channel tokens
			i = skipOffTokenChannels(i + 1); // leave p on valid token
			n++;
		}
		if (i >= tokens.size()) {
			return Token.EOF_TOKEN;
		}

		Assert.isTrue(i >= 0);
		return (Token) tokens.get(i);
	}

	public Token get(int i) {
		return (Token) tokens.get(i);
	}

	public TokenSource getTokenSource() {
		return tokenSource;
	}

	public String toString(int start, int stop) {

		StringBuffer buffer = new StringBuffer();

		for (int i = start; i <= stop; i++) {
			buffer.append(get(i).getText());
		}

		return buffer.toString();
	}

	public String toString(Token start, Token stop) {
		int startIndex = tokens.indexOf(start);
		int stopIndex = tokens.indexOf(stop);

		return toString(startIndex, stopIndex);
	}

	public int LA(int i) {
		return LT(i).getType();
	}

	public void consume() {
		if (p < tokens.size()) {
			p++;
			p = skipOffTokenChannels(p); // leave p on valid token
		}
	}

	public int index() {
		return p;
	}

	public int mark() {
		if (p == -1) {
			fillBuffer();
		}
		lastMarker = index();
		return lastMarker;
	}

	public void release(int marker) {
		throw new UnsupportedOperationException();
	}

	public void rewind() {
		seek(lastMarker);
	}

	public void rewind(int marker) {
		seek(marker);
	}

	public void seek(int index) {
		p = index;
	}

	public int size() {
		return tokens.size();
	}

	private int skipOffTokenChannels(int i) {
		int n = tokens.size();
		while (i < n && ((Token) tokens.get(i)).getChannel() != channel) {
			i++;
		}
		return i;
	}

	protected int skipOffTokenChannelsReverse(int i) {
		while (i >= 0 && ((Token) tokens.get(i)).getChannel() != channel) {
			i--;
		}
		return i;
	}

}
