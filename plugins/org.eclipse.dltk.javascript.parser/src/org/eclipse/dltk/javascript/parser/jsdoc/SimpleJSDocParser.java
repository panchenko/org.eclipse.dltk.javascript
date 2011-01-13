/*******************************************************************************
 * Copyright (c) 2011 xored software, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.parser.jsdoc;

import org.eclipse.dltk.javascript.ast.MultiLineComment;

public class SimpleJSDocParser {

	private static final char FORM_FEED = '\u000c';

	private char buffer[];
	private int index;
	private int end;
	private final StringBuilder value = new StringBuilder();

	public void parse(String content) {
		index = MultiLineComment.JSDOC_PREFIX.length();
		buffer = content.toCharArray();
		end = buffer.length;
		while (index < end) {
			switch (readChar()) {
			case '*':
			case ' ':
			case '\t':
			case FORM_FEED:
				continue;
			case '\n':
				skipChar('\r');
				continue;
			case '\r':
				skipChar('\n');
				continue;
			case '@':
				parseTag();
				break;
			default:
				skipEndOfLine();
				continue;
			}

		}
	}

	private void parseTag() {
		final int tagStart = index - 1;
		while (index < end
				&& (buffer[index] == '.' || Character.isLetter(buffer[index]))) {
			++index;
		}
		final String tag = new String(buffer, tagStart, index - tagStart);
		value.setLength(0);
		skipSpaces();
		boolean lineStart = false;
		VALUE_LOOP: while (index < end) {
			char c = readChar();
			switch (c) {
			case '@':
				if (lineStart) {
					unread();
					break VALUE_LOOP;
				}
				value.append(c);
				break;
			case '\r':
				skipChar('\n');
				lineStart = true;
				skipSpaces();
				if (skipAll('*') && skipChar('/')) {
					// end of comment
					break VALUE_LOOP;
				}
				break;
			case '\n':
				skipChar('\r');
				lineStart = true;
				skipSpaces();
				if (skipAll('*') && skipChar('/')) {
					// end of comment
					break VALUE_LOOP;
				}
				break;
			case ' ':
			case '\t':
			case FORM_FEED:
				value.append(c);
				break;
			default:
				lineStart = false;
				value.append(c);
				break;
			}
		}
		int len = value.length();
		while (len > 0 && Character.isWhitespace(value.charAt(len - 1))) {
			--len;
		}
		if (len != value.length()) {
			value.setLength(len);
		}
		processTag(tag, value.toString());
	}

	protected void processTag(String tag, String content) {
	}

	private boolean skipAll(char expected) {
		boolean result = false;
		while (index < end && buffer[index] == expected) {
			++index;
			result = true;
		}
		return result;
	}

	private void skipSpaces() {
		while (index < end && Character.isWhitespace(buffer[index])) {
			++index;
		}
	}

	private void skipEndOfLine() {
		LOOP: while (index < end) {
			switch (readChar()) {
			case '\r':
				skipChar('\n');
				break LOOP;
			case '\n':
				skipChar('\r');
				break LOOP;
			}
		}
	}

	private boolean skipChar(char expected) {
		if (index < end && buffer[index] == expected) {
			++index;
			return true;
		}
		return false;
	}

	private void unread() {
		--index;
	}

	private char readChar() {
		return buffer[index++];
	}

}
