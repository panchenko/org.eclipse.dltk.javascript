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

public class FinallyClause extends Statement {

	private Keyword finallyKeyword;
	private Statement statement;

	public FinallyClause(ASTNode parent) {
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
			if (finallyKeyword != null) finallyKeyword.traverse(visitor);
			if (statement != null) statement.traverse(visitor);
			visitor.endvisit(this);
		}
	}

	public Statement getStatement() {
		return this.statement;
	}

	public void setStatement(Statement statement) {
		this.statement = statement;
	}

	public Keyword getFinallyKeyword() {
		return this.finallyKeyword;
	}

	public void setFinallyKeyword(Keyword keyword) {
		this.finallyKeyword = keyword;
	}

	@Override
	public String toSourceString(String indentationString) {

		Assert.isTrue(sourceStart() > 0);
		Assert.isTrue(sourceEnd() > 0);

		StringBuffer buffer = new StringBuffer();

		buffer.append(indentationString);
		buffer.append(Keywords.FINALLY);
		buffer.append(JSLiterals.EOL);
		buffer.append(statement.toSourceString(indentationString));

		return buffer.toString();
	}

	public boolean isBlock() {
		return true;
	}

}
