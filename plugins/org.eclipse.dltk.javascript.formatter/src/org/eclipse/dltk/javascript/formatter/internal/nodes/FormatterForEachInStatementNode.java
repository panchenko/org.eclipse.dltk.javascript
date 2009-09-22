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
import org.eclipse.dltk.formatter.IFormatterNode;
import org.eclipse.dltk.javascript.formatter.JavaScriptFormatterConstants;

public class FormatterForEachInStatementNode extends
		FormatterBlockWithParensNode {

	private IFormatterNode eachKeyword;

	public FormatterForEachInStatementNode(IFormatterDocument document) {
		super(document,true);
	}

	public IFormatterNode getEachKeyword() {
		return this.eachKeyword;
	}

	public void setEachKeyword(IFormatterNode node) {
		this.eachKeyword = node;
		getBody().add(node);
	}

	protected boolean isIndenting() {
		return getDocument().getBoolean(
				JavaScriptFormatterConstants.INDENT_BLOCK);
	}

	protected boolean insertNewLineAfterRP() {
		String option = getDocument().getString(
				JavaScriptFormatterConstants.BRACE_BLOCK);

		return JavaScriptFormatterConstants.BRACE_NEXT_LINE.equals(option)
				|| JavaScriptFormatterConstants.BRACE_NEXT_LINE_INDENTED
						.equals(option);
	}

	public boolean isDoubleIndentingBlock() {
		String option = getDocument().getString(
				JavaScriptFormatterConstants.BRACE_BLOCK);

		return JavaScriptFormatterConstants.BRACE_NEXT_LINE_INDENTED
				.equals(option);
	}

	protected boolean insertSpaceAfterLP() {
		return true;
	}

	protected boolean insertSpaceBeforeLP() {
		return true;
	}

	protected boolean insertSpaceBeforeRP() {
		return true;
	}

}
