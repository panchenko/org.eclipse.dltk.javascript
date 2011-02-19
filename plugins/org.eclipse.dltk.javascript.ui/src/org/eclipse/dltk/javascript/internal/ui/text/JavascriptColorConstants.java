/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.javascript.internal.ui.text;

import org.eclipse.dltk.ui.text.DLTKColorConstants;

public final class JavascriptColorConstants {
	private JavascriptColorConstants() {
	}

	/**
	 * The color key for string and character literals in Javascript code.
	 */
	public static final String JS_STRING = DLTKColorConstants.DLTK_STRING; //$NON-NLS-1$

	/**
	 * The color key for Javascript comments.
	 */
	public static final String JS_SINGLE_LINE_COMMENT = DLTKColorConstants.DLTK_SINGLE_LINE_COMMENT;

	/**
	 * The color key for Javascript doc.
	 */
	public static final String JS_DOC = "JS_DOC"; //$NON-NLS-1$

	/**
	 * @since 3.0
	 */
	public static final String JS_DOC_TAGS = "JS_DOC_TAGS"; //$NON-NLS-1$	

	/**
	 * The color key for Javascript numbers.
	 */
	public static final String JS_NUMBER = DLTKColorConstants.DLTK_NUMBER; //$NON-NLS-1$

	/**
	 * The color key for Javascript keywords.
	 */
	public static final String JS_KEYWORD = DLTKColorConstants.DLTK_KEYWORD; //$NON-NLS-1$

	/**
	 * The color key for Javascript keyword 'return'.
	 */
	public static final String JS_KEYWORD_RETURN = DLTKColorConstants.DLTK_KEYWORD_RETURN; //$NON-NLS-1$	

	/**
	 * The color key for Javascript code.
	 */
	public static final String JS_DEFAULT = DLTKColorConstants.DLTK_DEFAULT; //$NON-NLS-1$

	/**
	 * The color key for TO-DO tasks in comments.
	 */
	public static final String JS_TODO_TAG = DLTKColorConstants.TASK_TAG;

	/**
	 * The color key for regexps
	 */
	public static final String JS_REGEXP = "JS_REGEXP";

	/**
	 * The color key for Javascript function definition.
	 */
	public static final String JS_FUNCTION_DEFINITION = DLTKColorConstants.DLTK_FUNCTION_DEFINITION;

	public static final String JS_XML_TAG_NAME = "XML_TAG_NAME";

	public static final String JS_XML_ATTR_NAME = "XML_ATTR_NAME";

	public static final String JS_XML_COMMENT_NAME = "XML_COMMENT_NAME";

	public static final String JS_XML_ALL = "XML_ALL";

}
