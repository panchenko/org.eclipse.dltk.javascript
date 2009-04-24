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

package org.eclipse.dltk.javascript.ast;

import org.eclipse.core.runtime.Assert;
import org.eclipse.dltk.ast.ASTNode;

public class ContinueStatement extends Statement {

	private Keyword continueKeyword;
	private Label label;
	private int semic;

	public ContinueStatement(ASTNode parent) {
		super(parent);
	}

	public Keyword getContinueKeyword() {
		return continueKeyword;
	}

	public void setContinueKeyword(Keyword keyword) {
		continueKeyword = keyword;
	}

	public Label getLabel() {
		return this.label;
	}

	public void setLabel(Label label) {
		this.label = label;
	}

	public int getSemicolonPosition() {
		return this.semic;
	}

	public void setSemicolonPosition(int semic) {
		this.semic = semic;
	}

	public String toSourceString(String indentationString) {

		Assert.isTrue(sourceStart() > 0);
		Assert.isTrue(sourceEnd() > 0);

		StringBuffer buffer = new StringBuffer();

		buffer.append(indentationString);
		buffer.append(Keywords.CONTINUE);

		if (this.getLabel() != null) {
			buffer.append(' ');
			buffer.append(this.getLabel().getText());
		}

		buffer.append(";\n");

		return buffer.toString();
	}

	public boolean isBlock() {
		return false;
	}

}
