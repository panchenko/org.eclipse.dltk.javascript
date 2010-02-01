/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.javascript.internal.ui.text.folding;

import org.eclipse.core.runtime.ILog;
import org.eclipse.dltk.javascript.core.JavaScriptNature;
import org.eclipse.dltk.javascript.internal.ui.JavaScriptUI;
import org.eclipse.dltk.javascript.internal.ui.text.JavascriptPartitionScanner;
import org.eclipse.dltk.javascript.ui.text.IJavaScriptPartitions;
import org.eclipse.dltk.ui.text.folding.AbstractASTFoldingStructureProvider;
import org.eclipse.jface.text.rules.IPartitionTokenScanner;

public class JavascriptFoldingStructureProvider extends
		AbstractASTFoldingStructureProvider {

	@Override
	protected String getDocPartition() {
		return IJavaScriptPartitions.JS_DOC;
	}

	@Override
	protected String getCommentPartition() {
		return IJavaScriptPartitions.JS_COMMENT;
	}

	@Override
	protected ILog getLog() {
		return JavaScriptUI.getDefault().getLog();
	}

	@Override
	protected String getPartition() {
		return IJavaScriptPartitions.JS_PARTITIONING;
	}

	@Override
	protected IPartitionTokenScanner getPartitionScanner() {
		return new JavascriptPartitionScanner();
	}

	@Override
	protected String[] getPartitionTypes() {
		return IJavaScriptPartitions.JS_PARTITION_TYPES;
	}

	@Override
	protected String getNatureId() {
		return JavaScriptNature.NATURE_ID;
	}
}
