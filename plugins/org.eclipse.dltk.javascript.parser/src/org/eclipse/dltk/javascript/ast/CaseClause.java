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

import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.javascript.internal.parser.JSLiterals;

public class CaseClause extends SwitchComponent {

	private Keyword caseKeyword;
	private Expression condition;

	public CaseClause(ASTNode parent) {
		super(parent);
	}

	/**
	 * @see org.eclipse.dltk.ast.ASTNode#traverse(org.eclipse.dltk.ast.ASTVisitor)
	 */
	@Override
	public void traverse(ASTVisitor visitor) throws Exception {
		if (visitor.visit(this)) {
			if (caseKeyword != null)
				caseKeyword.traverse(visitor);
			if (condition != null)
				condition.traverse(visitor);

			List<Statement> statements = getStatements();
			if (statements != null) {
				for (Statement statement : statements) {
					statement.traverse(visitor);
				}
			}
			visitor.endvisit(this);
		}
	}

	public Expression getCondition() {
		return this.condition;
	}

	public void setCondition(Expression condition) {
		this.condition = condition;
	}

	public Keyword getCaseKeyword() {
		return this.caseKeyword;
	}

	public void setCaseKeyword(Keyword keyword) {
		this.caseKeyword = keyword;
	}

	@Override
	public String toSourceString(String indentationString) {

		Assert.isTrue(sourceStart() > 0);
		Assert.isTrue(sourceEnd() > 0);
		// Assert.isTrue(colon > 0);

		StringBuffer buffer = new StringBuffer();

		buffer.append(indentationString);

		buffer.append(Keywords.CASE);
		buffer.append(JSLiterals.SPACE);
		buffer.append(this.getCondition().toSourceString(indentationString));
		buffer.append(":\n");

		toSourceString(getStatements(), buffer, indentationString
				+ Statement.INDENT);

		return buffer.toString();
	}

	@Override
	public Keyword getKeyword() {
		return getCaseKeyword();
	}
}
