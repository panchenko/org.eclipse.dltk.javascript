/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.javascript.ui.text;

import org.eclipse.dltk.javascript.core.IJavaScriptConstants;
import org.eclipse.jface.text.IDocument;

public interface IJavaScriptPartitions {

	public final static String JS_PARTITIONING = IJavaScriptConstants.JS_PARTITIONING;

	public final static String JS_COMMENT = "__javascript_comment"; //$NON-NLS-1$
	public final static String JS_STRING_SINGLE = "__javascript_string_single"; //$NON-NLS-1$
	public final static String JS_STRING = "__javascript_string_double";//$NON-NLS-1$
	public final static String JS_DOC = "__javascript_doc"; //$NON-NLS-1$
	public final static String JS_REGEXP = "__javascript_quoteRegExp"; //$NON-NLS-1$

	public final static String[] JS_PARTITION_TYPES = new String[] {
			IDocument.DEFAULT_CONTENT_TYPE, IJavaScriptPartitions.JS_STRING,
			IJavaScriptPartitions.JS_STRING_SINGLE,
			IJavaScriptPartitions.JS_COMMENT, IJavaScriptPartitions.JS_DOC,
			JS_REGEXP };

	public final static String[] LEGAL_CONTENT_TYPES = new String[] {
			IJavaScriptPartitions.JS_REGEXP, IJavaScriptPartitions.JS_DOC,
			IJavaScriptPartitions.JS_COMMENT,
			IJavaScriptPartitions.JS_PARTITIONING,
			IJavaScriptPartitions.JS_STRING,
			IJavaScriptPartitions.JS_STRING_SINGLE,
			IDocument.DEFAULT_CONTENT_TYPE };

}
