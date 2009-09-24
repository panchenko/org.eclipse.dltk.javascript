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
import org.eclipse.dltk.javascript.formatter.internal.nodes.JSLiterals;

public class DeleteStatement extends Expression {

	private Keyword deleteKeyword;
	private Expression expression;

	public DeleteStatement(ASTNode parent) {
		super(parent);
	}

	/**
	 * @see org.eclipse.dltk.ast.ASTNode#traverse(org.eclipse.dltk.ast.ASTVisitor)
	 */
	@Override
	public void traverse(ASTVisitor visitor) throws Exception {
		if (visitor.visit(this)) {
			if (deleteKeyword != null)
				deleteKeyword.traverse(visitor);
			if (expression != null)
				expression.traverse(visitor);

			visitor.endvisit(this);
		}
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

	@Override
	public String toSourceString(String indentationString) {

		Assert.isTrue(sourceStart() > 0);
		Assert.isTrue(sourceEnd() > 0);

		StringBuffer buffer = new StringBuffer();

		buffer.append(indentationString);
		buffer.append(Keywords.DELETE);
		buffer.append(JSLiterals.SPACE);
		buffer.append(expression.toSourceString(indentationString));
		buffer.append(JSLiterals.EOL);

		return buffer.toString();
	}

	public boolean isBlock() {
		return false;
	}

}
