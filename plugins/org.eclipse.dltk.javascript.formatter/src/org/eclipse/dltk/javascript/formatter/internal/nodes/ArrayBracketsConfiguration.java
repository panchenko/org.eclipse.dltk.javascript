/*******************************************************************************
 * Copyright (c) 2009 xored software, Inc.  
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html  
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Vladimir Belov)
 *******************************************************************************/

package org.eclipse.dltk.javascript.formatter.internal.nodes;

import org.eclipse.dltk.formatter.IFormatterDocument;
import org.eclipse.dltk.javascript.formatter.JavaScriptFormatterConstants;

public class ArrayBracketsConfiguration implements IBracketsConfiguration {

	private IFormatterDocument document;

	public ArrayBracketsConfiguration(IFormatterDocument document) {
		this.document = document;
	}

	protected IFormatterDocument getDocument() {
		return this.document;
	}

	public boolean isBeginLineBreaking() {
		String value = document
				.getString(JavaScriptFormatterConstants.BRACE_ARRAY);

		return JavaScriptFormatterConstants.BRACE_NEXT_LINE.equals(value)
				|| JavaScriptFormatterConstants.BRACE_NEXT_LINE_INDENTED
						.equals(value);
	}

	public boolean isBracketsIndenting() {
		return JavaScriptFormatterConstants.BRACE_NEXT_LINE_INDENTED
				.equals(document
						.getString(JavaScriptFormatterConstants.BRACE_ARRAY));
	}

	public boolean isEndLineBreaking() {
		return false;
	}

	public boolean isIndenting() {
		String value = document
				.getString(JavaScriptFormatterConstants.BRACE_ARRAY);

		return JavaScriptFormatterConstants.BRACE_NEXT_LINE.equals(value)
				|| JavaScriptFormatterConstants.BRACE_NEXT_LINE_INDENTED
						.equals(value);
	}

}
