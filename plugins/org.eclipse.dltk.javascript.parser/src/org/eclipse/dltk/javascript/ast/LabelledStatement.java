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

public class LabelledStatement extends Statement {

	private Label label;
	private int colon = -1;
	private Statement statement;

	public LabelledStatement(ASTNode parent) {
		super(parent);
	}

	public Label getLabel() {
		return this.label;
	}

	public void setLabel(Label label) {
		this.label = label;
	}

	public Statement getStatement() {
		return this.statement;
	}

	public void setStatement(Statement statement) {
		this.statement = statement;
	}

	public int getColonPosition() {
		return this.colon;
	}

	public void setColonPosition(int colon) {
		this.colon = colon;
	}

	public String toSourceString(String indentationString) {

		Assert.isTrue(sourceStart() >= 0);
		Assert.isTrue(sourceEnd() > 0);
		Assert.isTrue(colon > 0);

		StringBuffer buffer = new StringBuffer();

		buffer.append(indentationString);
		buffer.append(getLabel().toSourceString(indentationString));
		buffer.append(":\n");

		buffer
				.append(getStatement().toSourceString(
						indentationString + INDENT));

		return buffer.toString();
	}

	public boolean isBlock() {
		return true;
	}

}
