/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.javascript.scriptdoc;

import org.eclipse.dltk.corext.documentation.SingleCharReader;

public abstract class JavaDocCommentReader extends SingleCharReader {

	private int fCurrPos;
	private int fStartPos;
	private int fEndPos;

	private boolean fWasNewLine;

	public JavaDocCommentReader(int start, int end) {
		fStartPos = start + 3;
		fEndPos = end - 2;

		reset();
	}

	/**
	 * @see java.io.Reader#read()
	 */
	public int read() {
		if (fCurrPos < fEndPos) {
			char ch;
			if (fWasNewLine) {
				do {
					ch = getChar(fCurrPos++);
				} while (fCurrPos < fEndPos && Character.isWhitespace(ch));
				if (ch == '*') {
					if (fCurrPos < fEndPos) {
						do {
							ch = getChar(fCurrPos++);
						} while (ch == '*');
					} else {
						return -1;
					}
				}
			} else {
				ch = getChar(fCurrPos++);
			}
			fWasNewLine = IndentManipulation.isLineDelimiterChar(ch);

			return ch;
		}
		return -1;
	}

	protected abstract char getChar(int index);

	/**
	 * @see java.io.Reader#reset()
	 */
	public void reset() {
		fCurrPos = fStartPos;
		fWasNewLine = true;
	}

	/**
	 * Returns the offset of the last read character in the passed buffer.
	 */
	public int getOffset() {
		return fCurrPos;
	}

}