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

public class ReturnStatement extends Statement implements ISemicolonStatement {

	private Keyword returnKeyword;
	private Expression value;
	private int semic = -1;

	public ReturnStatement(ASTNode parent) {
		super(parent);
	}

	/**
	 * @see org.eclipse.dltk.ast.ASTNode#traverse(org.eclipse.dltk.ast.ASTVisitor)
	 */
	@Override
	public void traverse(ASTVisitor visitor) throws Exception {
		if (visitor.visit(this)) {
			if (returnKeyword != null)
				returnKeyword.traverse(visitor);
			if (value != null)
				value.traverse(visitor);

			visitor.endvisit(this);
		}
	}

	public Expression getValue() {
		return this.value;
	}

	public void setValue(Expression value) {
		this.value = value;
	}

	public Keyword getReturnKeyword() {
		return this.returnKeyword;
	}

	public void setReturnKeyword(Keyword keyword) {
		this.returnKeyword = keyword;
	}

	public int getSemicolonPosition() {
		return this.semic;
	}

	public void setSemicolonPosition(int semic) {
		this.semic = semic;
	}

	@Override
	public String toSourceString(String indentationString) {

		Assert.isTrue(sourceStart() >= 0);
		Assert.isTrue(sourceEnd() > 0);

		StringBuffer buffer = new StringBuffer();

		buffer.append(indentationString);
		buffer.append(Keywords.RETURN);

		if (value != null) {
			buffer.append(' ');
			buffer.append(value.toSourceString(indentationString));
		}

		if (this.semic > -1)
			buffer.append(";");
		buffer.append("\n");

		return buffer.toString();
	}

}
