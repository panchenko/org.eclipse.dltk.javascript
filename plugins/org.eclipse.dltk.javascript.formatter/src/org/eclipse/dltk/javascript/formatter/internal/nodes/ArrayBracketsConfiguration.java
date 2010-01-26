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
import org.eclipse.dltk.javascript.ast.JSNode;
import org.eclipse.dltk.javascript.ast.ReturnStatement;
import org.eclipse.dltk.javascript.formatter.JavaScriptFormatterConstants;

public class ArrayBracketsConfiguration implements IBracketsConfiguration,
		IPunctuationConfiguration {

	private IFormatterDocument document;
	private final JSNode node;

	public ArrayBracketsConfiguration(IFormatterDocument document, JSNode node) {
		this.document = document;
		this.node = node;
	}

	protected IFormatterDocument getDocument() {
		return this.document;
	}

	public boolean isBeginLineBreaking() {
		if (!canBreak()) {
			return false;
		}
		String value = document
				.getString(JavaScriptFormatterConstants.BRACE_ARRAY);

		return JavaScriptFormatterConstants.BRACE_NEXT_LINE.equals(value)
				|| JavaScriptFormatterConstants.BRACE_NEXT_LINE_INDENTED
						.equals(value);
	}

	private boolean canBreak() {
		if (node.getParent() instanceof ReturnStatement) {
			return false;
		}
		return true;
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

	public boolean insertSpaceAfter() {
		// TODO introduce option for it?
		return true;
	}

	public boolean insertSpaceBefore() {
		// TODO introduce option for it?
		return false;
	}

}
