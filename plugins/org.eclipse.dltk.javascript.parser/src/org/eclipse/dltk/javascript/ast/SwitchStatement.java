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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.ASTVisitor;

public class SwitchStatement extends Statement {

	private Keyword switchKeyword;
	private Expression condition;
	private final List<SwitchComponent> caseClauses = new ArrayList<SwitchComponent>();
	private int LP = -1;
	private int RP = -1;
	private int LC = -1;
	private int RC = -1;

	public SwitchStatement(ASTNode parent) {
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
			if (switchKeyword != null) switchKeyword.traverse(visitor);
			if (condition != null) condition.traverse(visitor);
			
			if (caseClauses != null)
			{
				for (SwitchComponent comp : caseClauses)
				{
					comp.traverse(visitor);
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

	public List<SwitchComponent> getCaseClauses() {
		return this.caseClauses;
	}

	/**
	 * @param transformNode
	 */
	public void addCase(SwitchComponent component) {
		caseClauses.add(component);
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

		Assert.isTrue(sourceStart() >= 0);
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
					.toSourceString(indentationString + INDENT));
		}

		buffer.append(indentationString);
		buffer.append("}\n");

		return buffer.toString();
	}

	public boolean isBlock() {
		return true;
	}

}
