/*
 [The "BSD licence"]
 Copyright (c) 2005-2006 Terence Parr
 All rights reserved.

 Redistribution and use in source and binary forms, with or without
 modification, are permitted provided that the following conditions
 are met:
 1. Redistributions of source code must retain the above copyright
    notice, this list of conditions and the following disclaimer.
 2. Redistributions in binary form must reproduce the above copyright
    notice, this list of conditions and the following disclaimer in the
    documentation and/or other materials provided with the distribution.
 3. The name of the author may not be used to endorse or promote products
    derived from this software without specific prior written permission.

 THIS SOFTWARE IS PROVIDED BY THE AUTHOR ``AS IS'' AND ANY EXPRESS OR
 IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE IMPLIED WARRANTIES
 OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED.
 IN NO EVENT SHALL THE AUTHOR BE LIABLE FOR ANY DIRECT, INDIRECT,
 INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL DAMAGES (INCLUDING, BUT
 NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE,
 DATA, OR PROFITS; OR BUSINESS INTERRUPTION) HOWEVER CAUSED AND ON ANY
 THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT
 (INCLUDING NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF
 THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.eclipse.dltk.javascript.parser;

import java.util.ArrayList;
import java.util.List;

import org.antlr.runtime.BitSet;
import org.antlr.runtime.Token;
import org.antlr.runtime.TokenSource;
import org.antlr.runtime.TokenStream;

public class DynamicTokenStream implements TokenStream, JSTokenStream {

	private static final boolean DEBUG = true;

	protected final JavaScriptTokenSource tokenSource;

	/**
	 * Record every single token pulled from the source so we can reproduce
	 * chunks of it later.
	 */
	protected List<Token> tokens;

	/**
	 * Skip tokens on any channel but this one; this is how we skip
	 * whitespace...
	 */
	protected int channel = Token.DEFAULT_CHANNEL;

	/** Track the last mark() call result value for use in rewind(). */
	protected int lastMarker;

	/**
	 * The index into the tokens list of the current token (next token to
	 * consume). p==-1 indicates that the tokens list is empty
	 */
	protected int p = -1;

	public DynamicTokenStream(JavaScriptTokenSource tokenSource) {
		tokens = new ArrayList<Token>(500);
		this.tokenSource = tokenSource;
	}

	public DynamicTokenStream(JavaScriptTokenSource tokenSource, int channel) {
		this(tokenSource);
		this.channel = channel;
	}

	private final boolean fetchToken() {
		Token t = tokenSource.nextToken();
		if (t != Token.EOF_TOKEN) {
			int index = tokens.size();
			t.setTokenIndex(index);
			tokens.add(t);
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Fill between p and n; do nothing if n is p. If p==-1 and n==0, fill in
	 * first token.
	 */
	protected void fill(int n) {
		for (int i = tokens.size(); i <= n; i++) {
			if (!fetchToken()) {
				if (DEBUG)
					System.out.println("fill(" + n + ") failed");
				break;
			}
		}
		if (p < 0) {
			p = 0; // init
		}
	}

	private void init() {
		fill(0);
	}

	private void loadAll() {
		if (DEBUG)
			System.out.println("LOAD ALL");
		while (fetchToken())
			;
		if (p < 0) {
			p = 0; // init
		}
	}

	/**
	 * Move the input pointer to the next incoming token. The stream must become
	 * active with LT(1) available. consume() simply moves the input pointer so
	 * that LT(1) points at the next input symbol. Consume at least one token.
	 * 
	 * Walk past any token not on the channel the parser is listening to.
	 */
	public void consume() {
		if (p < tokens.size()) {
			p++;
			p = skipOffTokenChannels(p); // leave p on valid token
		}
	}

	/**
	 * Given a starting index, return the index of the first on-channel token.
	 */
	protected int skipOffTokenChannels(int i) {
		int n = tokens.size();
		while (i < n && tokens.get(i).getChannel() != channel) {
			i++;
		}
		return i;
	}

	protected int skipOffTokenChannelsReverse(int i) {
		while (i >= 0 && tokens.get(i).getChannel() != channel) {
			i--;
		}
		return i;
	}

	public List<Token> getTokens() {
		loadAll();
		return tokens;
	}

	public List<Token> getTokens(int start, int stop) {
		return getTokens(start, stop, (BitSet) null);
	}

	/**
	 * Given a start and stop index, return a List of all tokens in the token
	 * type BitSet. Return null if no tokens were found. This method looks at
	 * both on and off channel tokens.
	 */
	public List<Token> getTokens(int start, int stop, BitSet types) {
		fill(stop);
		if (stop >= tokens.size()) {
			stop = tokens.size() - 1;
		}
		if (start < 0) {
			start = 0;
		}
		if (start > stop) {
			return null;
		}

		// list = tokens[start:stop]:{Token t, t.getType() in types}
		List<Token> filteredTokens = new ArrayList<Token>(stop - start + 1);
		for (int i = start; i <= stop; i++) {
			Token t = tokens.get(i);
			if (types == null || types.member(t.getType())) {
				filteredTokens.add(t);
			}
		}
		if (filteredTokens.size() == 0) {
			filteredTokens = null;
		}
		return filteredTokens;
	}

	public List<Token> getTokens(int start, int stop, List<Integer> types) {
		return getTokens(start, stop, new BitSet(types));
	}

	public List<Token> getTokens(int start, int stop, int ttype) {
		return getTokens(start, stop, BitSet.of(ttype));
	}

	/**
	 * Get the ith token from the current position 1..n where k=1 is the first
	 * symbol of lookahead.
	 */
	public Token LT(int k) {
		if (k == 0) {
			return null;
		}
		if (k < 0) {
			return LB(-k);
		}
		fill(p + k);
		int i = p;
		int n = 1;
		// find k good tokens
		while (n < k) {
			// skip off-channel tokens
			i = skipOffTokenChannels(i + 1); // leave p on valid token
			n++;
		}
		return tokens.get(i);
	}

	/** Look backwards k tokens on-channel tokens */
	protected Token LB(int k) {
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
		return tokens.get(i);
	}

	/**
	 * Return absolute token i; ignore which channel the tokens are on; that is,
	 * count all tokens not just on-channel tokens.
	 */
	public Token get(int i) {
		return tokens.get(i);
	}

	public int LA(int i) {
		return LT(i).getType();
	}

	public int mark() {
		init();
		lastMarker = index();
		return lastMarker;
	}

	public void release(int marker) {
		// no resources to release
	}

	public int size() {
		loadAll();
		return tokens.size();
	}

	public int index() {
		return p;
	}

	public void rewind(int marker) {
		seek(marker);
	}

	public void rewind() {
		seek(lastMarker);
	}

	public void seek(int index) {
		p = index;
	}

	public TokenSource getTokenSource() {
		return tokenSource;
	}

	@Override
	public String toString() {
		loadAll();
		return toString(0, tokens.size() - 1);
	}

	public String toString(int start, int stop) {
		if (start < 0 || stop < 0) {
			return null;
		}
		fill(stop);
		if (stop >= tokens.size()) {
			stop = tokens.size() - 1;
		}
		StringBuffer buf = new StringBuffer();
		for (int i = start; i <= stop; i++) {
			Token t = tokens.get(i);
			buf.append(t.getText());
		}
		return buf.toString();
	}

	public String toString(Token start, Token stop) {
		if (start != null && stop != null) {
			return toString(start.getTokenIndex(), stop.getTokenIndex());
		}
		return null;
	}
}
