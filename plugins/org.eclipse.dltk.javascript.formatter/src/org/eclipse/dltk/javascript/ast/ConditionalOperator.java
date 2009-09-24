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

public class ConditionalOperator extends Expression {

	private Expression condition;
	private Expression trueValue;
	private Expression falseValue;
	private int questionPos = -1;
	private int colonPos = -1;

	public ConditionalOperator(ASTNode parent) {
		super(parent);
	}

	/**
	 * @see org.eclipse.dltk.ast.ASTNode#traverse(org.eclipse.dltk.ast.ASTVisitor)
	 */
	@Override
	public void traverse(ASTVisitor visitor) throws Exception {
		if (visitor.visit(this)) {
			if (condition != null)
				condition.traverse(visitor);
			if (trueValue != null)
				trueValue.traverse(visitor);
			if (falseValue != null)
				falseValue.traverse(visitor);
			visitor.endvisit(this);
		}
	}

	public Expression getCondition() {
		return this.condition;
	}

	public void setCondition(Expression condition) {
		this.condition = condition;
	}

	public Expression getTrueValue() {
		return this.trueValue;
	}

	public void setTrueValue(Expression value) {
		this.trueValue = value;
	}

	public Expression getFalseValue() {
		return this.falseValue;
	}

	public void setFalseValue(Expression value) {
		this.falseValue = value;
	}

	public int getQuestionPosition() {
		return this.questionPos;
	}

	public void setQuestionPosition(int questionPos) {
		this.questionPos = questionPos;
	}

	public int getColonPosition() {
		return this.colonPos;
	}

	public void setColonPosition(int colonPos) {
		this.colonPos = colonPos;
	}

	public String toSourceString(String indentationString) {

		Assert.isTrue(sourceStart() >= 0);
		Assert.isTrue(sourceEnd() > 0);
		Assert.isTrue(questionPos > 0);
		Assert.isTrue(colonPos > 0);

		StringBuffer buffer = new StringBuffer();

		buffer.append(this.getCondition().toSourceString(indentationString));
		buffer.append(" ? ");
		buffer.append(this.getTrueValue().toSourceString(indentationString));
		buffer.append(" : ");
		buffer.append(this.getFalseValue().toSourceString(indentationString));

		return buffer.toString();
	}

}
