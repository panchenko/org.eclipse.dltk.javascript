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

public class IfStatement extends Statement implements ISourceableBlock {

	private Keyword ifKeyword;
	private Keyword elseKeyword;
	private Expression condition;
	private Statement thenStatement;
	private Statement elseStatement = null;
	private int LP = -1;
	private int RP = -1;

	public IfStatement(ASTNode parent) {
		super(parent);
	}

	/**
	 * @see org.eclipse.dltk.javascript.ast.Statement#traverse(org.eclipse.dltk.ast.ASTVisitor)
	 */
	@Override
	public void traverse(ASTVisitor visitor) throws Exception {
		if (visitor.visit(this)) {
			if (ifKeyword != null)
				ifKeyword.traverse(visitor);
			if (elseKeyword != null)
				elseKeyword.traverse(visitor);
			if (condition != null)
				condition.traverse(visitor);
			if (thenStatement != null)
				thenStatement.traverse(visitor);
			if (elseStatement != null)
				elseStatement.traverse(visitor);
			visitor.endvisit(this);
		}
	}

	public Expression getCondition() {
		return this.condition;
	}

	public void setCondition(Expression condition) {
		this.condition = condition;
	}

	public Statement getThenStatement() {
		return this.thenStatement;
	}

	public void setThenStatement(Statement thenStatement) {
		this.thenStatement = thenStatement;
	}

	public Statement getElseStatement() {
		return this.elseStatement;
	}

	public void setElseStatement(Statement elseStatement) {
		this.elseStatement = elseStatement;
	}

	public Keyword getIfKeyword() {
		return this.ifKeyword;
	}

	public void setIfKeyword(Keyword keyword) {
		this.ifKeyword = keyword;
	}

	public Keyword getElseKeyword() {
		return this.elseKeyword;
	}

	public void setElseKeyword(Keyword keyword) {
		this.elseKeyword = keyword;
	}

	public int getLP() {
		return this.LP;
	}

	public void setLP(int LP) {
		this.LP = LP;
	}

	public int getRP() {
		return this.RP;
	}

	public void setRP(int RP) {
		this.RP = RP;
	}

	@Override
	public String toSourceString(String indentationString) {

		Assert.isTrue(sourceStart() >= 0);
		Assert.isTrue(sourceEnd() > 0);
		Assert.isTrue(LP > 0);
		Assert.isTrue(RP > 0);

		StringBuffer buffer = new StringBuffer();

		buffer.append(indentationString);
		buffer.append(Keywords.IF);
		buffer.append(" (");
		buffer.append(getCondition().toSourceString(indentationString));
		buffer.append(")\n");

		buffer.append(getThenStatement().toSourceString(
				isBlock(getThenStatement()) ? indentationString
						: indentationString + INDENT));

		if (getElseStatement() != null) {
			buffer.append(indentationString);
			buffer.append(Keywords.ELSE);
			buffer.append("\n");
			buffer.append(getElseStatement().toSourceString(
					isBlock(getElseStatement()) ? indentationString
							: indentationString + INDENT));
		}

		return buffer.toString();
	}

	private static boolean isBlock(ASTNode node) {
		return (node instanceof ISourceableBlock)
				&& ((ISourceableBlock) node).isBlock();
	}

	public boolean isBlock() {
		return true;
	}

}
