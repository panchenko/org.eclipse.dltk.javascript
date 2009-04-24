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

public class CaseClause extends Statement {

	private Keyword caseKeyword;
	private Expression condition;
	private StatementList statements;
	private int colon;

	public CaseClause(ASTNode parent) {
		super(parent);
	}

	public Expression getCondition() {
		return this.condition;
	}

	public void setCondition(Expression condition) {
		this.condition = condition;
	}

	public StatementList getStatements() {
		return this.statements;
	}

	public void setStatements(StatementList statements) {
		this.statements = statements;
	}

	public Keyword getCaseKeyword() {
		return this.caseKeyword;
	}

	public void setCaseKeyword(Keyword keyword) {
		this.caseKeyword = keyword;
	}

	public int getColonPosition() {
		return this.colon;
	}

	public void setColonPosition(int colon) {
		this.colon = colon;
	}

	public String toSourceString(String indentationString) {

		Assert.isTrue(sourceStart() > 0);
		Assert.isTrue(sourceEnd() > 0);
		Assert.isTrue(colon > 0);

		StringBuffer buffer = new StringBuffer();

		buffer.append(indentationString);

		buffer.append(Keywords.CASE);
		buffer.append(" ");
		buffer.append(this.getCondition().toSourceString(indentationString));
		buffer.append(":\n");

		buffer.append(this.getStatements().toSourceString(
				indentationString + "    "));

		return buffer.toString();
	}

	public boolean isBlock() {
		return true;
	}
}
