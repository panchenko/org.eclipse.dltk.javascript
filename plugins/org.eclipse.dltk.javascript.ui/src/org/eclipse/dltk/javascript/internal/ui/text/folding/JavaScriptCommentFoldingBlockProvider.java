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

import org.eclipse.dltk.javascript.internal.ui.text.JSPartitioningProvider;
import org.eclipse.dltk.javascript.ui.text.IJavaScriptPartitions;
import org.eclipse.dltk.ui.text.folding.IFoldingContent;
import org.eclipse.dltk.ui.text.folding.PartitioningFoldingBlockProvider;

public class JavaScriptCommentFoldingBlockProvider extends
		PartitioningFoldingBlockProvider {

	public JavaScriptCommentFoldingBlockProvider() {
		super(JSPartitioningProvider.getInstance());
	}

	public void computeFoldableBlocks(IFoldingContent content) {
		if (isFoldingComments())
			computeBlocksForPartitionType(content,
					IJavaScriptPartitions.JS_COMMENT,
					JavaScriptFoldingBlockKind.COMMENT, isCollapseComments());
		if (isFoldingDocs())
			computeBlocksForPartitionType(content,
					IJavaScriptPartitions.JS_DOC,
					JavaScriptFoldingBlockKind.JSDOC, isCollapseDocs());
	}

}
