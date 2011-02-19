/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.javascript.ui.text;

import org.eclipse.jface.text.IDocument;

public interface IJavaScriptPartitions {

	public final static String JS_PARTITIONING = "__javascript_partitioning"; //$NON-NLS-1$

	/**
	 * @since 3.0
	 */
	public final static String JS_MULTI_LINE_COMMENT = "__javascript_comment"; //$NON-NLS-1$

	/**
	 * @since 3.0
	 */
	public final static String JS_SINGLE_LINE_COMMENT = "__javascript_single_line_comment"; //$NON-NLS-1$

	/**
	 * @since 2.0
	 */
	public final static String JS_STRING_SINGLE = "__javascript_string_single"; //$NON-NLS-1$

	public final static String JS_STRING = "__javascript_string_double";//$NON-NLS-1$
	public final static String JS_DOC = "__javascript_doc"; //$NON-NLS-1$

	public final static String[] JS_PARTITION_TYPES = new String[] {
			IDocument.DEFAULT_CONTENT_TYPE, JS_STRING, JS_STRING_SINGLE,
			JS_SINGLE_LINE_COMMENT, JS_MULTI_LINE_COMMENT, JS_DOC };

	public final static String[] LEGAL_CONTENT_TYPES = new String[] { JS_DOC,
			JS_SINGLE_LINE_COMMENT, JS_MULTI_LINE_COMMENT, JS_STRING,
			JS_STRING_SINGLE };
}
