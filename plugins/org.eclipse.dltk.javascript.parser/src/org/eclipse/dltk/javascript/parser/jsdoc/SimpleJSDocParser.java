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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.dltk.javascript.ast.MultiLineComment;
import org.eclipse.dltk.utils.IntList;

public class SimpleJSDocParser {

	private static final char FORM_FEED = '\u000c';
	private static final char CR = '\r';
	private static final char LF = '\n';
	private static final char TAB = '\t';
	private static final char SPACE = ' ';

	private char buffer[];
	private int index;
	private int end;
	private final StringBuilder value = new StringBuilder();
	private final IntList ends = new IntList();

	public JSDocTags parse(String content, int offset) {
		List<JSDocTag> tags = null;
		index = MultiLineComment.JSDOC_PREFIX.length();
		buffer = content.toCharArray();
		end = buffer.length;
		if (index + 2 <= end && buffer[end - 2] == '*'
				&& buffer[end - 1] == '/') {
			end -= 2;
		}
		while (index < end) {
			switch (readChar()) {
			case '*':
			case SPACE:
			case TAB:
			case FORM_FEED:
				continue;
			case LF:
				skipChar(CR);
				continue;
			case CR:
				skipChar(LF);
				continue;
			case '@':
				final JSDocTag tag = parseTag(offset);
				if (tag != null) {
					if (tags == null) {
						tags = new ArrayList<JSDocTag>();
					}
					tags.add(tag);
				} else {
					skipEndOfLine();
				}
				break;
			default:
				skipEndOfLine();
				continue;
			}
		}
		if (tags != null) {
			return new JSDocTags(tags.toArray(new JSDocTag[tags.size()]));
		} else {
			return JSDocTags.EMPTY;
		}
	}

	private JSDocTag parseTag(int offset) {
		final int tagStart = index - 1;
		while (index < end
				&& (buffer[index] == '.' || buffer[index] == '-' || Character
						.isLetter(buffer[index]))) {
			++index;
		}
		if (index == tagStart + 1) {
			return null;
		}
		final String tag = new String(buffer, tagStart, index - tagStart);
		final int valueStart = index;
		value.setLength(0);
		ends.clear();
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
				ends.add(index);
				break;
			case CR:
				skipChar(LF);
				lineStart = true;
				skipSpaces();
				if (skipAll('*') && skipChar('/')) {
					// end of comment
					break VALUE_LOOP;
				}
				break;
			case LF:
				skipChar(CR);
				lineStart = true;
				skipSpaces();
				if (skipAll('*') && skipChar('/')) {
					// end of comment
					break VALUE_LOOP;
				}
				break;
			case SPACE:
			case TAB:
			case FORM_FEED:
				value.append(c);
				ends.add(index);
				break;
			default:
				lineStart = false;
				value.append(c);
				ends.add(index);
				break;
			}
		}
		int len = value.length();
		while (len > 0 && Character.isWhitespace(value.charAt(len - 1))) {
			--len;
		}
		if (len != value.length()) {
			value.setLength(len);
			ends.setSize(len);
		}
		return new JSDocTag(tag, value.toString(), offset + tagStart, offset
				+ (ends.isEmpty() ? valueStart : ends.get(ends.size() - 1)));
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
		while (index < end && (buffer[index] == ' ' || buffer[index] == '\t')) {
			++index;
		}
	}

	private void skipEndOfLine() {
		LOOP: while (index < end) {
			switch (readChar()) {
			case CR:
				skipChar(LF);
				break LOOP;
			case LF:
				skipChar(CR);
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
