/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.javascript.internal.ui.formatting;

import java.util.Map;

import org.eclipse.dltk.javascript.internal.ui.JavaScriptUI;
import org.eclipse.dltk.javascript.internal.ui.text.JsPreferenceInterpreter;
import org.eclipse.dltk.ui.text.util.TabStyle;
import org.eclipse.text.edits.ReplaceEdit;
import org.eclipse.text.edits.TextEdit;

import com.xored.org.mozilla.javascript.CompilerEnvirons;
import com.xored.org.mozilla.javascript.Decompiler;
import com.xored.org.mozilla.javascript.ErrorReporter;
import com.xored.org.mozilla.javascript.EvaluatorException;
import com.xored.org.mozilla.javascript.Parser;
import com.xored.org.mozilla.javascript.UintMap;

public class OldCodeFormatter extends CodeFormatter {

	Map options;

	public OldCodeFormatter(Map options) {
		this.options = options;
	}

	public TextEdit format(int kind, String source, int offset, int length,
			StringBuffer computeIndentation, String lineSeparator) {
		String newText = formatString(
				source.substring(offset, offset + length), computeIndentation);
		return new ReplaceEdit(offset, length, newText);
	}

	public String formatString(String substring, StringBuffer computeIndentation) {
		Parser ps = new Parser(new CompilerEnvirons(), new ErrorReporter() {

			public void error(String message, String sourceName, int line,
					String lineSource, int offset) {
				// TODO Auto-generated method stub

			}

			public EvaluatorException runtimeError(String message,
					String sourceName, int line, String lineSource,
					int lineOffset) {
				// TODO Auto-generated method stub
				return null;
			}

			public void warning(String message, String sourceName, int line,
					String lineSource, int lineOffset) {
				// TODO Auto-generated method stub

			}

		});
		ps.parse(substring, "", 0);
		String encodedSource = ps.getEncodedSource();
		Decompiler de = new Decompiler();
		de.setIndent(computeIndentation);
		UintMap uintMap = new UintMap();
		JsPreferenceInterpreter pi = new JsPreferenceInterpreter(JavaScriptUI
				.getDefault().getPreferenceStore());
		uintMap.put(Decompiler.INDENT_GAP_PROP, pi.getIndentSize());
		TabStyle tabStyle = pi.getTabStyle();
		String retValue;
		if (tabStyle == TabStyle.TAB)
			uintMap.put(Decompiler.INDENT_USE_TAB, 1);
		else
			uintMap.put(Decompiler.INDENT_USE_TAB, 0);
		if (computeIndentation == null || computeIndentation.length() == 0)
			retValue = de.decompile(encodedSource, 0, uintMap).trim();
		else
			retValue = de.decompile(encodedSource, 0, uintMap);
		// hack because this decompiler does strange stuff when the code starts
		// with /**
		retValue = replaceAll(replaceAll(retValue, "/*/**", "/**"), "\n*",
				"\n *").toString();
		return retValue;
	}

	/**
	 * Replace all occurrences of one string replaceWith another string.
	 * 
	 * @param s
	 *            The string to process
	 * @param searchFor
	 *            The value to search for
	 * @param replaceWith
	 *            The value to searchFor replaceWith
	 * @return The resulting string with searchFor replaced with replaceWith
	 */
	public static CharSequence replaceAll(final CharSequence s,
			final CharSequence searchFor, CharSequence replaceWith) {
		if (s == null) {
			return null;
		}

		// If searchFor is null or the empty string, then there is nothing to
		// replace, so returning s is the only option here.
		if (searchFor == null || "".equals(searchFor)) {
			return s;
		}

		// If replaceWith is null, then the searchFor should be replaced with
		// nothing, which can be seen as the empty string.
		if (replaceWith == null) {
			replaceWith = "";
		}

		String searchString = searchFor.toString();
		// Look for first occurrence of searchFor
		int matchIndex = search(s, searchString, 0);
		if (matchIndex == -1) {
			// No replace operation needs to happen
			return s;
		} else {
			// Allocate a AppendingStringBuffer that will hold one replacement
			// with a
			// little extra room.
			int size = s.length();
			final int replaceWithLength = replaceWith.length();
			final int searchForLength = searchFor.length();
			if (replaceWithLength > searchForLength) {
				size += (replaceWithLength - searchForLength);
			}
			final StringBuffer buffer = new StringBuffer(size + 16);

			int pos = 0;
			do {
				// Append text up to the match`
				buffer.append(s.subSequence(pos, matchIndex));

				// Add replaceWith text
				buffer.append(replaceWith);

				// Find next occurrence, if any
				pos = matchIndex + searchForLength;
				matchIndex = search(s, searchString, pos);
			} while (matchIndex != -1);

			// Add tail of s
			buffer.append(s.subSequence(pos, s.length()));

			// Return processed buffer
			return buffer;
		}
	}

	private static int search(final CharSequence s, String searchString, int pos) {
		int matchIndex = -1;
		if (s instanceof String) {
			matchIndex = ((String) s).indexOf(searchString, pos);
		} else if (s instanceof StringBuffer) {
			matchIndex = ((StringBuffer) s).indexOf(searchString, pos);
		} else {
			matchIndex = s.toString().indexOf(searchString, pos);
		}
		return matchIndex;
	}

}
