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

public class ExceptionFilter extends Expression {

	private Keyword ifKeyword;
	private Expression expression;

	public ExceptionFilter(ASTNode parent) {
		super(parent);
	}

	public Expression getExpression() {
		return this.expression;
	}

	public void setExpression(Expression expression) {
		this.expression = expression;
	}

	public Keyword getIfKeyword() {
		return this.ifKeyword;
	}

	public void setIfKeyword(Keyword keyword) {
		this.ifKeyword = keyword;
	}

	public String toSourceString(String indentationString) {

		Assert.isTrue(sourceStart() > 0);
		Assert.isTrue(sourceEnd() > 0);

		StringBuffer buffer = new StringBuffer();

		buffer.append(Keywords.IF);
		buffer.append(" ");
		buffer.append(expression.toSourceString(indentationString));

		return buffer.toString();
	}

	public boolean isBlock() {
		return false;
	}

}
