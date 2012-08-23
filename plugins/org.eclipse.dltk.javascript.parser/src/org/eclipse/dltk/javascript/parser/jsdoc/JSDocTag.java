/*******************************************************************************
 * Copyright (c) 2011 xored software, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.parser.jsdoc;

import org.eclipse.dltk.core.ISourceNode;

public class JSDocTag implements ISourceNode {

	public static String[] getTags() {
		return new String[] { PARAM, RETURN, RETURNS, THROWS, TYPE, DEPRECATED,
				CONSTRUCTOR, PRIVATE, PROTECTED, PUBLIC, AUTHOR, VERSION, SEE,
				SINCE, EXAMPLE, SUPPRESS_WARNINGS };
	}

	public static final String PARAM = "@param"; //$NON-NLS-1$
	public static final String RETURN = "@return";
	public static final String RETURNS = "@returns";
	public static final String THROWS = "@throws";
	public static final String TYPE = "@type"; //$NON-NLS-1$
	public static final String DEPRECATED = "@deprecated"; //$NON-NLS-1$

	public static final String CONSTRUCTOR = "@constructor";
	public static final String PUBLIC = "@public";
	public static final String PROTECTED = "@protected";
	public static final String PRIVATE = "@private";

	public static final String AUTHOR = "@author";
	public static final String VERSION = "@version";
	public static final String SEE = "@see";
	public static final String SINCE = "@since";
	public static final String EXAMPLE = "@example";

	public static final String SUPPRESS_WARNINGS = "@SuppressWarnings";

	public static final String[] RETURN_TAGS = { RETURNS, RETURN, TYPE };

	private final String tag;
	private final String value;
	private final int start;
	private final int valueStart;
	private final int end;

	public JSDocTag(String tag, String value, int start, int valueStart, int end) {
		this.tag = tag;
		this.value = value;
		this.valueStart = valueStart;
		this.start = start;
		this.end = end;
	}

	public String name() {
		return tag;
	}

	public String value() {
		return value;
	}

	public int start() {
		return start;
	}

	public int valueStart() {
		return valueStart;
	}

	public int end() {
		return end;
	}

	@Deprecated
	public String getValue() {
		return value;
	}

	@Deprecated
	public int getStart() {
		return start;
	}

	@Deprecated
	public int getEnd() {
		return end;
	}

	@Override
	public String toString() {
		return value != null && value.length() != 0 ? tag + " " + value : tag;
	}

	/**
	 * Returns the last tag of two.
	 */
	public static JSDocTag last(JSDocTag first, JSDocTag second) {
		return first.start > second.start ? first : second;
	}

	/**
	 * Returns the first tag of two.
	 */
	public static JSDocTag first(JSDocTag first, JSDocTag second) {
		return first.start < second.start ? first : second;
	}
}
