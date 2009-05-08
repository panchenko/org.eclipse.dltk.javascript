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

public class DeleteStatement extends Statement {

	private Keyword deleteKeyword;
	private Expression expression;
	private int semic;

	public DeleteStatement(ASTNode parent) {
		super(parent);
	}

	public Expression getExpression() {
		return this.expression;
	}

	public void setExpression(Expression expression) {
		this.expression = expression;
	}

	public Keyword getDeleteKeyword() {
		return this.deleteKeyword;
	}

	public void setDeleteKeyword(Keyword keyword) {
		this.deleteKeyword = keyword;
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
		buffer.append(Keywords.DELETE);
		buffer.append(" ");
		buffer.append(expression.toSourceString(indentationString));
		if (semic > 0)
			buffer.append(";");
		buffer.append("\n");

		return buffer.toString();
	}

	public boolean isBlock() {
		return false;
	}

}
