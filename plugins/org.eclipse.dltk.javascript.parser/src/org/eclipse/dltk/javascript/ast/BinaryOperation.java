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
 *******************************************************************************/package org.eclipse.dltk.javascript.ast;

import org.eclipse.core.runtime.Assert;
import org.eclipse.dltk.ast.ASTNode;

public class BinaryOperation extends Expression {

	private int operation;
	private Expression left;
	private Expression right;
	private int operationPos;

	public BinaryOperation(ASTNode parent) {
		super(parent);
	}

	public int getOperation() {
		return this.operation;
	}

	public void setOperation(int operation) {
		this.operation = operation;
	}

	public int getOperationPosition() {
		return this.operationPos;
	}

	public void setOperationPosition(int operationPos) {
		this.operationPos = operationPos;
	}

	public String getOperationText() {
		return Keywords.fromToken(this.operation);
	}

	public Expression getLeftExpression() {
		return this.left;
	}

	public void setLeftExpression(Expression left) {
		this.left = left;
	}

	public Expression getRightExpression() {
		return this.right;
	}

	public void setRightExpression(Expression right) {
		this.right = right;
	}

	public String toSourceString(String indentionString) {

		Assert.isTrue(sourceStart() >= 0);
		Assert.isTrue(sourceEnd() > 0);
		Assert.isTrue(operationPos > 0);

		StringBuffer buffer = new StringBuffer();

		buffer.append(left.toSourceString(indentionString));
		buffer.append(' ');
		buffer.append(getOperationText());
		buffer.append(' ');
		buffer.append(right.toSourceString(indentionString));

		return buffer.toString();
	}

	public boolean isBlock() {
		return false;
	}
}
