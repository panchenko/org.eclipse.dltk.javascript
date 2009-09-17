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

public class CallExpression extends Expression {

	private ASTNode expression;
	private List<ASTNode>  arguments;
	private List<Integer> commas;
	private int LP = -1;
	private int RP = -1;

	public CallExpression(ASTNode parent) {
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
			if (expression != null) expression.traverse(visitor);
			
			if (arguments != null)
			{
				for (ASTNode node : arguments)
				{
					node.traverse(visitor);
				}
			}
			visitor.endvisit(this);
		}
	}


	public ASTNode getExpression() {
		return this.expression;
	}

	public void setExpression(ASTNode expression) {
		this.expression = expression;
	}

	public List<ASTNode>  getArguments() {
		return this.arguments;
	}

	public void setArguments(List<ASTNode>  arguments) {
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

	public List<Integer> getCommas() {
		return this.commas;
	}

	public void setCommas(List<Integer> commas) {
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
