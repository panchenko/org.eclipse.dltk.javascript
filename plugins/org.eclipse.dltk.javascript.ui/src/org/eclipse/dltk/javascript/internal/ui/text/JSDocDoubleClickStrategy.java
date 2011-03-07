/*******************************************************************************
 * Copyright (c) 2000, 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *     NumberFour AG - select the whole type name if clicked inside {...} (Alex Panchenko)
 *******************************************************************************/

package org.eclipse.dltk.javascript.internal.ui.text;

import org.eclipse.dltk.ui.text.PartitionDoubleClickSelector;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Region;

/**
 * Provides the inherited double click behavior and allows
 * <code>@identifier</code> to be selected.
 * 
 * @since 3.0
 */
public class JSDocDoubleClickStrategy extends PartitionDoubleClickSelector {

	public JSDocDoubleClickStrategy(String partitioning) {
		super(partitioning, 0, 0);
	}

	/**
	 * Returns a region describing the word around <code>position</code>.
	 * 
	 * @param document
	 *            the document
	 * @param position
	 *            the offset around which to return the word
	 * @return the word's region, or <code>null</code> for no selection
	 */
	protected IRegion findExtendedDoubleClickSelection(IDocument document,
			int position) {
		try {
			IRegion match = super.findExtendedDoubleClickSelection(document,
					position);
			if (match != null)
				return match;

			IRegion word = findWord(document, position);

			IRegion line = document.getLineInformationOfOffset(position);
			if (position == line.getOffset() + line.getLength())
				return null;

			int start = word.getOffset();
			int end = start + word.getLength();

			if (start > 0
					&& document.getChar(start - 1) == '@'
					&& Character.isJavaIdentifierPart(document.getChar(start))
					&& (start == 1
							|| Character.isWhitespace(document
									.getChar(start - 2)) || document
							.getChar(start - 2) == '{')) {
				// double click after @ident
				start--;
			} else if (end == position && end == start + 1
					&& end < line.getOffset() + line.getLength()
					&& document.getChar(end) == '@') {
				// double click before " @ident"
				return findExtendedDoubleClickSelection(document, position + 1);
			}

			if (start == end)
				return null;
			return new Region(start, end - start);

		} catch (BadLocationException x) {
			return null;
		}
	}

	@Override
	protected IRegion findWord(IDocument document, int offset) {
		try {
			// select the whole type name if double click inside {...}
			final IRegion line = document.getLineInformationOfOffset(offset);
			final String s = document.get(line.getOffset(), line.getLength());
			final int index = offset - line.getOffset();
			int left = s.lastIndexOf('{', index);
			if (left >= 0) {
				++left;
				final int right = s.indexOf('}', index - 1);
				if (right >= 0) {
					return new Region(line.getOffset() + left, right - left);
				}
			}
		} catch (BadLocationException e) {
			// fall thru
		}
		return super.findWord(document, offset);
	}

}
