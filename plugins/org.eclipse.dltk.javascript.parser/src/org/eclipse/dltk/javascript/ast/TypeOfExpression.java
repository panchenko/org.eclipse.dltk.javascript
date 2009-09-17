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

public class TypeOfExpression extends Expression {

	private Keyword typeofKeyword;
	private Expression expression;

	public TypeOfExpression(ASTNode parent) {
		super(parent);
	}
	
	/**
	 * @see org.eclipse.dltk.ast.ASTNode#traverse(org.eclipse.dltk.ast.ASTVisitor)
	 */
	@Override
	public void traverse(ASTVisitor visitor) throws Exception
	{
		if (visitor.visit(this))
		{
			if (typeofKeyword != null) typeofKeyword.traverse(visitor);
			if (expression != null) expression.traverse(visitor);
			visitor.endvisit(this);
		}
	}


	public Expression getExpression() {
		return this.expression;
	}

	public void setExpression(Expression expression) {
		this.expression = expression;
	}

	public Keyword getTypeOfKeyword() {
		return this.typeofKeyword;
	}

	public void setTypeOfKeyword(Keyword keyword) {
		this.typeofKeyword = keyword;
	}

	public String toSourceString(String indentationString) {

		Assert.isTrue(sourceStart() >= 0);
		Assert.isTrue(sourceEnd() > 0);

		StringBuffer buffer = new StringBuffer();

		buffer.append(Keywords.TYPEOF);
		buffer.append(" ");
		buffer.append(expression.toSourceString(indentationString));

		return buffer.toString();
	}

	public boolean isBlock() {
		return false;
	}

}
