/*******************************************************************************
 * Copyright (c) 2010 xored software, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.internal.ui.text.folding;

import java.util.List;

import org.eclipse.dltk.javascript.internal.ui.text.JSPartitioningProvider;
import org.eclipse.dltk.javascript.ui.text.IJavaScriptPartitions;
import org.eclipse.dltk.ui.text.folding.IFoldingBlockKind;
import org.eclipse.dltk.ui.text.folding.IFoldingContent;
import org.eclipse.dltk.ui.text.folding.PartitioningFoldingBlockProvider;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;

public class JavaScriptCommentFoldingBlockProvider extends
		PartitioningFoldingBlockProvider {

	public JavaScriptCommentFoldingBlockProvider() {
		super(JSPartitioningProvider.getInstance());
	}

	public void computeFoldableBlocks(IFoldingContent content) {
		if (isFoldingComments()) {
			computeBlocksForPartitionType(content,
					IJavaScriptPartitions.JS_SINGLE_LINE_COMMENT,
					JavaScriptFoldingBlockKind.COMMENT, isCollapseComments());
			computeBlocksForPartitionType(content,
					IJavaScriptPartitions.JS_MULTI_LINE_COMMENT,
					JavaScriptFoldingBlockKind.COMMENT, isCollapseComments());
		}
		if (isFoldingDocs())
			computeBlocksForPartitionType(content,
					IJavaScriptPartitions.JS_DOC,
					JavaScriptFoldingBlockKind.JSDOC, isCollapseDocs());
	}

	@Override
	protected void reportRegions(Document document, List<IRegion> regions,
			IFoldingBlockKind kind, boolean collapse)
			throws BadLocationException {
		if ((kind == JavaScriptFoldingBlockKind.COMMENT || kind == JavaScriptFoldingBlockKind.JSDOC)
				&& collapse != isCollapseHeaderComment()) {
			final IRegion first = regions.get(0);
			if (first.getOffset() == 0 && isFileHeader(document, first)) {
				requestor.acceptBlock(first.getOffset(), first.getOffset()
						+ first.getLength(), kind, null /* no element */,
						isCollapseHeaderComment());
				super.reportRegions(document,
						regions.subList(1, regions.size()), kind, collapse);
				return;
			}
		}
		super.reportRegions(document, regions, kind, collapse);
	}

	private boolean isFileHeader(IDocument document, IRegion region)
			throws BadLocationException {
		int endPos = region.getOffset() + region.getLength();
		String txtAfterComment = document.get(endPos,
				Math.min(20, document.getLength() - endPos));
		int lineDelimiterCount = 0;
		for (int i = 0; i < txtAfterComment.length(); i++) {
			char c = txtAfterComment.charAt(i);
			if (c == 'f') {
				if (txtAfterComment.substring(i).startsWith("function"))
					return false;
			} else if (c == 'v') {
				if (txtAfterComment.substring(i).startsWith("var"))
					return false;
			} else if (lineDelimiterCount == 1) {
				// if after 1 line delimiter still no function
				// or var is found then it is a header.
				return true;
			} else if (c == '\n') {
				lineDelimiterCount++;
			} else if (c == '\r') {
				lineDelimiterCount++;
				if (i + 1 < txtAfterComment.length()
						&& txtAfterComment.charAt(i + 1) == '\n')
					i++; // skip \r\n
			}
			if (lineDelimiterCount == 2) {
				return true;
			}
		}
		return false;
	}
}
