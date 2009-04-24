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

public class SwitchStatement extends Statement {

	private Keyword switchKeyword;
	private Expression condition;
	private DefaultClause defaultClause;
	private List caseClauses;
	private int LP;
	private int RP;
	private int LC;
	private int RC;

	public SwitchStatement(ASTNode parent) {
		super(parent);
	}

	public Expression getCondition() {
		return this.condition;
	}

	public void setCondition(Expression condition) {
		this.condition = condition;
	}

	public DefaultClause getDefaultClause() {
		return this.defaultClause;
	}

	public void setDefaultClause(DefaultClause defaultClause) {
		this.defaultClause = defaultClause;
	}

	public List getCaseClauses() {
		return this.caseClauses;
	}

	public void setCaseClauses(List caseClauses) {
		this.caseClauses = caseClauses;
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

	public int getLC() {
		return this.LC;
	}

	public void setLC(int LC) {
		this.LC = LC;
	}

	public int getRC() {
		return this.RC;
	}

	public void setRC(int RC) {
		this.RC = RC;
	}

	public Keyword getSwitchKeyword() {
		return this.switchKeyword;
	}

	public void setSwitchKeyword(Keyword keyword) {
		this.switchKeyword = keyword;
	}

	public String toSourceString(String indentationString) {

		Assert.isTrue(sourceStart() > 0);
		Assert.isTrue(sourceEnd() > 0);
		Assert.isTrue(LP > 0);
		Assert.isTrue(RP > 0);
		Assert.isTrue(LC > 0);
		Assert.isTrue(RC > 0);

		StringBuffer buffer = new StringBuffer();

		buffer.append(indentationString);
		buffer.append(Keywords.SWITCH);
		buffer.append(" (");
		buffer.append(condition.toSourceString(indentationString));
		buffer.append(")\n");
		buffer.append(indentationString);
		buffer.append("{\n");

		for (int i = 0; i < caseClauses.size(); i++) {
			buffer.append(((ISourceable) caseClauses.get(i))
					.toSourceString(indentationString + "    "));
		}

		if (getDefaultClause() != null) {
			buffer.append(getDefaultClause().toSourceString(
					indentationString + "    "));
		}

		buffer.append(indentationString);
		buffer.append("}\n");

		return buffer.toString();
	}

	public boolean isBlock() {
		return true;
	}
}
