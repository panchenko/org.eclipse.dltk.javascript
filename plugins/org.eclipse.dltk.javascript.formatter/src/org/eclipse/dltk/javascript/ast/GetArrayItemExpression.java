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

public class GetArrayItemExpression extends Expression {

	private Expression array;
	private Expression index;
	private int LB;
	private int RB;

	public GetArrayItemExpression(ASTNode parent) {
		super(parent);
	}

	public Expression getArray() {
		return this.array;
	}

	public void setArray(Expression array) {
		this.array = array;
	}

	public Expression getIndex() {
		return this.index;
	}

	public void setIndex(Expression index) {
		this.index = index;
	}

	public int getLB() {
		return this.LB;
	}

	public void setLB(int LB) {
		this.LB = LB;
	}

	public int getRB() {
		return this.RB;
	}

	public void setRB(int RB) {
		this.RB = RB;
	}

	public String toSourceString(String indentationString) {

		Assert.isTrue(sourceStart() >= 0);
		Assert.isTrue(sourceEnd() > 0);
		Assert.isTrue(LB > 0);
		Assert.isTrue(RB > 0);

		StringBuffer buffer = new StringBuffer();

		buffer.append(getArray().toSourceString(indentationString));
		buffer.append("[");
		buffer.append(getIndex().toSourceString(indentationString));
		buffer.append("]");

		return buffer.toString();
	}

	public boolean isBlock() {
		return false;
	}

}
