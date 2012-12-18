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

import org.eclipse.dltk.ast.ASTVisitor;

public class LabelledStatement extends Statement implements ISourceableBlock {

	private Label label;
	private int colon = -1;
	private Statement statement;

	public LabelledStatement(JSNode parent) {
		super(parent);
	}

	/**
	 * @see org.eclipse.dltk.ast.ASTNode#traverse(org.eclipse.dltk.ast.ASTVisitor)
	 */
	@Override
	public void traverse(ASTVisitor visitor) throws Exception {
		if (visitor.visit(this)) {
			if (label != null)
				label.traverse(visitor);
			if (statement != null)
				statement.traverse(visitor);

			visitor.endvisit(this);
		}
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

	@Override
	public String toSourceString(String indentationString) {
		final StringBuilder buffer = new StringBuilder();

		buffer.append(indentationString);
		buffer.append(toSourceString(label, indentationString));
		buffer.append(":\n");
		buffer.append(toSourceString(statement, indentationString + INDENT));

		return buffer.toString();
	}

	public boolean isBlock() {
		return true;
	}

}
