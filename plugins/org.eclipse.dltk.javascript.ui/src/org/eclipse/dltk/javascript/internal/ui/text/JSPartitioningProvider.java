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
package org.eclipse.dltk.javascript.internal.ui.text;

import org.eclipse.dltk.javascript.ui.text.IJavaScriptPartitions;
import org.eclipse.dltk.ui.text.IPartitioningProvider;
import org.eclipse.jface.text.rules.IPartitionTokenScanner;

public class JSPartitioningProvider implements IPartitioningProvider {

	public static IPartitioningProvider getInstance() {
		return INSTANCE;
	}

	private static final JSPartitioningProvider INSTANCE = new JSPartitioningProvider();

	private JSPartitioningProvider() {
	}

	public IPartitionTokenScanner createPartitionScanner() {
		return new JavascriptPartitionScanner();
	}

	public String[] getPartitionContentTypes() {
		return IJavaScriptPartitions.JS_PARTITION_TYPES;
	}

	public String getPartitioning() {
		return IJavaScriptPartitions.JS_PARTITIONING;
	}

}
