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

public class JSDocTag {

	public static final String PARAM = "@param"; //$NON-NLS-1$
	public static final String RETURN = "@return";
	public static final String RETURNS = "@returns";
	public static final String TYPE = "@type"; //$NON-NLS-1$
	public static final String DEPRECATED = "@deprecated"; //$NON-NLS-1$

	public static final String CONSTRUCTOR = "@constructor";
	public static final String PRIVATE = "@private";

	private final String tag;
	private final String value;
	private final int start;
	private final int end;

	public JSDocTag(String tag, String value, int start, int end) {
		this.tag = tag;
		this.value = value;
		this.start = start;
		this.end = end;
	}

	public String getTag() {
		return tag;
	}

	public String getValue() {
		return value;
	}

	public int getStart() {
		return start;
	}

	public int getEnd() {
		return end;
	}
}
