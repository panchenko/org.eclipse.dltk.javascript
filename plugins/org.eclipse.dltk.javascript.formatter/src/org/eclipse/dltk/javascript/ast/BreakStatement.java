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
import org.eclipse.dltk.ast.ASTVisitor;

public class BreakStatement extends Statement implements ISemicolonStatement {

	private Keyword breakKeyword;
	private Label label;
	private int semic = -1;

	public BreakStatement(ASTNode parent) {
		super(parent);
	}

	/**
	 * @see org.eclipse.dltk.ast.ASTNode#traverse(org.eclipse.dltk.ast.ASTVisitor)
	 */
	@Override
	public void traverse(ASTVisitor visitor) throws Exception {
		if (visitor.visit(this)) {
			if (breakKeyword != null)
				breakKeyword.traverse(visitor);
			if (label != null)
				label.traverse(visitor);
			visitor.endvisit(this);
		}
	}

	public Keyword getBreakKeyword() {
		return breakKeyword;
	}

	public void setBreakKeyword(Keyword keyword) {
		breakKeyword = keyword;
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

		Assert.isTrue(sourceStart() >= 0);
		Assert.isTrue(sourceEnd() > 0);

		StringBuffer buffer = new StringBuffer();

		buffer.append(indentationString);
		buffer.append(Keywords.BREAK);

		if (this.getLabel() != null) {
			buffer.append(' ');
			buffer.append(this.getLabel().getText());
		}

		buffer.append(";\n");

		return buffer.toString();
	}

}
