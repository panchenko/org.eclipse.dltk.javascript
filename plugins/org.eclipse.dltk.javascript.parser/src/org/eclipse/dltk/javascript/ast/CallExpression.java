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

public class CallExpression extends Expression {

	private ASTNode expression;
	private List arguments;
	private List commas;
	private int LP;
	private int RP;

	public CallExpression(ASTNode parent) {
		super(parent);
	}

	public ASTNode getExpression() {
		return this.expression;
	}

	public void setExpression(ASTNode expression) {
		this.expression = expression;
	}

	public List getArguments() {
		return this.arguments;
	}

	public void setArguments(List arguments) {
		this.arguments = arguments;
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

	public List getCommas() {
		return this.commas;
	}

	public void setCommas(List commas) {
		this.commas = commas;
	}

	public String toSourceString(String indentationString) {

		Assert.isTrue(sourceStart() >= 0);
		Assert.isTrue(sourceEnd() > 0);
		Assert.isTrue(LP > 0);
		Assert.isTrue(RP > 0);
		Assert.isTrue(arguments.size() == 0
				|| commas.size() == arguments.size() - 1);

		StringBuffer buffer = new StringBuffer();

		buffer.append(((ISourceable) expression)
				.toSourceString(indentationString));

		buffer.append('(');

		for (int i = 0; i < arguments.size(); i++) {
			if (i > 0)
				buffer.append(", ");

			ISourceable item = (ISourceable) arguments.get(i);
			buffer.append(item.toSourceString(indentationString));
		}

		buffer.append(')');

		return buffer.toString();
	}

	public boolean isBlock() {
		return false;
	}
}
