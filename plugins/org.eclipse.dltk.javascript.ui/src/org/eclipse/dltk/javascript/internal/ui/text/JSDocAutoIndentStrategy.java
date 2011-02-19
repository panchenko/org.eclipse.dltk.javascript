/*******************************************************************************
 * Copyright (c) 2011 NumberFour AG
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     NumberFour AG - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.internal.ui.text;

import static org.eclipse.dltk.javascript.ast.MultiLineComment.JSDOC_PREFIX;
import static org.eclipse.dltk.javascript.internal.ui.text.JavascriptAutoEditStrategy.C_END;

import org.eclipse.core.runtime.Assert;
import org.eclipse.dltk.core.IMethod;
import org.eclipse.dltk.javascript.internal.corext.codemanipulation.JSCodeGeneration;
import org.eclipse.dltk.javascript.ui.text.IJavaScriptPartitions;
import org.eclipse.dltk.ui.text.ScriptDefaultIndentLineAutoEditStrategy;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DocumentCommand;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITypedRegion;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.TextUtilities;

public class JSDocAutoIndentStrategy extends
		ScriptDefaultIndentLineAutoEditStrategy {

	public JSDocAutoIndentStrategy(IPreferenceStore fPreferenceStore) {
		super(fPreferenceStore);
	}

	@Override
	public void customizeDocumentCommand(IDocument document,
			DocumentCommand command) {
		if (command.doit == false) {
			return;
		}
		// TODO check smart mode
		if (command.length == 0 && command.text != null) {
			if (isLineDelimiter(document, command.text)) {
				indentAfterNewLine(document, command);
			} else if (command.text.equals("/")) { //$NON-NLS-1$
				indentAfterCommentEnd(document, command);
			}
		}
	}

	private boolean isCloseDocs() {
		// TODO introduce preference
		return true;
	}

	private void indentAfterNewLine(IDocument d, DocumentCommand c) {
		int offset = c.offset;
		if (offset == -1 || d.getLength() == 0)
			return;
		try {
			int p = (offset == d.getLength() ? offset - 1 : offset);
			IRegion line = d.getLineInformationOfOffset(p);

			int lineOffset = line.getOffset();
			int firstNonWS = findEndOfWhiteSpace(d, lineOffset, offset);
			Assert.isTrue(firstNonWS >= lineOffset,
					"indentation must not be negative"); //$NON-NLS-1$

			StringBuilder buf = new StringBuilder(c.text);
			IRegion prefix = findPrefixRange(d, line);
			String indentation = d.get(prefix.getOffset(), prefix.getLength());
			int lengthToAdd = Math.min(offset - prefix.getOffset(),
					prefix.getLength());

			buf.append(indentation.substring(0, lengthToAdd));

			if (firstNonWS < offset) {
				if (d.getChar(firstNonWS) == '/') {
					// Javadoc started on this line
					buf.append(" * "); //$NON-NLS-1$

					if (isCloseDocs() && isNewComment(d, offset)) {
						c.shiftsCaret = false;
						c.caretOffset = c.offset + buf.length();
						String lineDelimiter = TextUtilities
								.getDefaultLineDelimiter(d);

						int eolOffset = lineOffset + line.getLength();
						int replacementLength = eolOffset - p;
						String restOfLine = d.get(p, replacementLength);
						String endTag = lineDelimiter + indentation + " */"; //$NON-NLS-1$
						if (isGenerateStub()) {
							d.replace(offset, replacementLength, endTag);
							final IMethod method = JavascriptAutoEditStrategy
									.findMethod(d, offset - replacementLength
											+ endTag.length(), true);
							if (method != null) {
								buf.append(restOfLine);
								String string = JSCodeGeneration
										.getMethodComment(method, null,
												lineDelimiter);
								if (string != null) {
									string = normalizeGeneratedDoc(string);
									/*
									 * only add tags if they are non-empty - the
									 * empty line has already been added above.
									 */
									if (string.length() != 0)//$NON-NLS-1$
										buf.append(string);
								}
							}
						} else {
							c.length = replacementLength;
							buf.append(restOfLine);
							buf.append(endTag);
						}
					}
				}
			}
			// move the caret behind the prefix, even if we do not have to
			// insert it.
			if (lengthToAdd < prefix.getLength())
				c.caretOffset = offset + prefix.getLength() - lengthToAdd;
			c.text = buf.toString();
		} catch (BadLocationException excp) {
			// stop work
		}
	}

	static String normalizeGeneratedDoc(String string) {
		string = string.trim();
		if (string.startsWith(JSDOC_PREFIX)) {
			string = string.substring(JSDOC_PREFIX.length());
		}
		if (string.endsWith(C_END)) {
			string = string.substring(0, string.length() - C_END.length());
		}
		string = string.trim();
		if (string.startsWith("*")) {
			string = string.substring(1).trim();
		}
		return string;
	}

	static boolean isGenerateStub() {
		return true;
	}

	private IRegion findPrefixRange(IDocument document, IRegion line)
			throws BadLocationException {
		int lineOffset = line.getOffset();
		int lineEnd = lineOffset + line.getLength();
		int indentEnd = findEndOfWhiteSpace(document, lineOffset, lineEnd);
		if (indentEnd < lineEnd && document.getChar(indentEnd) == '*') {
			indentEnd++;
			while (indentEnd < lineEnd && document.getChar(indentEnd) == ' ')
				indentEnd++;
		}
		return new Region(lineOffset, indentEnd - lineOffset);
	}

	private boolean isNewComment(IDocument document, int commandOffset) {
		try {
			int lineIndex = document.getLineOfOffset(commandOffset) + 1;
			if (lineIndex >= document.getNumberOfLines())
				return true;
			IRegion line = document.getLineInformation(lineIndex);
			ITypedRegion partition = TextUtilities
					.getPartition(document,
							IJavaScriptPartitions.JS_PARTITIONING,
							commandOffset, false);
			int partitionEnd = partition.getOffset() + partition.getLength();
			if (line.getOffset() >= partitionEnd)
				return false;
			if (document.getLength() == partitionEnd)
				return true; // partition goes to end of document - probably a
								// new comment
			String comment = document.get(partition.getOffset(),
					partition.getLength());
			if (comment.indexOf("/*", 2) != -1) //$NON-NLS-1$
				return true; // enclosed another comment -> probably a new
								// comment
			return false;
		} catch (BadLocationException e) {
			return false;
		}
	}

	private void indentAfterCommentEnd(IDocument document,
			DocumentCommand command) {
		if (command.offset < 2 || document.getLength() == 0) {
			return;
		}
		try {
			if ("* ".equals(document.get(command.offset - 2, 2))) { //$NON-NLS-1$
				// modify document command
				command.length++;
				command.offset--;
			}
		} catch (BadLocationException excp) {
			// stop work
		}
	}

}