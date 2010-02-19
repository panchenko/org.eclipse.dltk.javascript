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

public class ForStatement extends LoopStatement implements ISemicolonStatement {

	private Keyword forKeyword;
	private Expression initial;
	private Expression condition;
	private Expression step;
	private int LP = -1;
	private int RP = -1;
	private int initialSemic = -1;
	private int conditionSemic = -1;
	private int trailingSemic = -1;

	public ForStatement(ASTNode parent) {
		super(parent);
	}
	
	/**
	 * @see org.eclipse.dltk.javascript.ast.Statement#traverse(org.eclipse.dltk.ast.ASTVisitor)
	 */
	@Override
	public void traverse(ASTVisitor visitor) throws Exception
	{
		if (visitor.visit(this))
		{
			if (forKeyword != null) forKeyword.traverse(visitor);
			if (initial != null) initial.traverse(visitor);
			if (condition != null) condition.traverse(visitor);
			if (step != null) step.traverse(visitor);

			Statement body = getBody();
			if (body != null)
			{
				body.traverse(visitor);
			}
			visitor.endvisit(this);
		}
	}

	public Expression getInitial() {
		return this.initial;
	}

	public Expression getCondition() {
		return this.condition;
	}

	public Expression getStep() {
		return this.step;
	}

	public void setInitial(Expression initial) {
		this.initial = initial;
	}

	public void setCondition(Expression condition) {
		this.condition = condition;
	}

	public void setStep(Expression step) {
		this.step = step;
	}

	public Keyword getForKeyword() {
		return this.forKeyword;
	}

	public void setForKeyword(Keyword keyword) {
		this.forKeyword = keyword;
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

	public int getConditionalSemicolonPosition() {
		return this.conditionSemic;
	}

	public void setConditionalSemicolonPosition(int semic) {
		this.conditionSemic = semic;
	}

	public int getInitialSemicolonPosition() {
		return this.initialSemic;
	}

	public void setInitialSemicolonPosition(int semic) {
		this.initialSemic = semic;
	}

	public int getSemicolonPosition() {
		return this.trailingSemic;
	}

	public void setSemicolonPosition(int semic) {
		this.trailingSemic = semic;
	}

	@Override
	public String toSourceString(String indentationString) {

		Assert.isTrue(sourceStart() >= 0);
		Assert.isTrue(sourceEnd() > 0);
		Assert.isTrue(LP > 0);
		Assert.isTrue(RP > 0);
		Assert.isTrue(initialSemic > 0);
		Assert.isTrue(conditionSemic > 0);
		Assert.isTrue((getBody() != null && trailingSemic < 0)
				|| (getBody() == null && trailingSemic > 0));

		StringBuffer buffer = new StringBuffer();

		buffer.append(indentationString);
		buffer.append(Keywords.FOR);
		buffer.append(" (");
		if (getInitial() != null)
			buffer.append(getInitial().toSourceString(indentationString));
		buffer.append("; ");
		if (getCondition() != null)
			buffer.append(getCondition().toSourceString(indentationString));
		buffer.append("; ");
		if (getStep() != null)
			buffer.append(getStep().toSourceString(indentationString));
		buffer.append(")");
		if (getBody() != null) {
			buffer.append("\n");
			buffer.append(getBody().toSourceString(indentationString));
		} else {
			buffer.append(";\n");
		}

		return buffer.toString();
	}

}
