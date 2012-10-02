/*******************************************************************************
 * Copyright (c) 2012 NumberFour AG
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

import org.eclipse.dltk.javascript.ui.text.IJavaScriptPartitions;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITypedRegion;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.TextUtilities;

public class JSDocTextUtils {

	/**
	 * Returns the region of the line containing the specified offset. If line
	 * starts/ends in other partition, then only part of the line belonging to
	 * the same partition is returned.
	 * 
	 * @throws BadLocationException
	 */
	public static IRegion getLineRegion(IDocument document, int offset)
			throws BadLocationException {
		final IRegion region = document.getLineInformationOfOffset(offset);
		final ITypedRegion partition = TextUtilities.getPartition(document,
				IJavaScriptPartitions.JS_PARTITIONING, offset, false);
		if (partition.getOffset() > region.getOffset()
				|| partition.getOffset() + partition.getLength() < region
						.getOffset() + region.getLength()) {
			final int newOffset = Math.max(partition.getOffset(),
					region.getOffset());
			final int newEnd = Math.min(
					partition.getOffset() + partition.getLength(),
					region.getOffset() + region.getLength());
			return new Region(newOffset, newEnd - newOffset);
		}
		return region;
	}

	/**
	 * Detects tag name from the beginning of the specified line or
	 * <code>null</code>.
	 */
	public static TypeNameNode getTag(char[] line, int begin, int end) {
		int index = begin;
		while (index < end && Character.isWhitespace(line[index])) {
			++index;
		}
		if (index < end && line[index] == '/') {
			++index;
		}
		while (index < end && line[index] == '*') {
			++index;
		}
		while (index < end && Character.isWhitespace(line[index])) {
			++index;
		}
		if (index < end && line[index] == '@') {
			final int tagStart = index;
			++index;
			if (index < end && Character.isJavaIdentifierStart(line[index])) {
				++index;
				while (index < end
						&& (Character.isJavaIdentifierPart(line[index])
								|| line[index] == '.' || line[index] == '-')) {
					++index;
				}
			}
			return new TypeNameNode(
					new String(line, tagStart, index - tagStart), tagStart,
					index);
		}
		return null;
	}

}
