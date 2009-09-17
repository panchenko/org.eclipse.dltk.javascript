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

public class ConstDeclaration extends Statement {

	private Keyword constKeyword;
	private List<ASTNode> consts;
	private List<Integer> commas;
	private int semic = -1;

	public ConstDeclaration(ASTNode parent) {
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
			if (constKeyword != null) constKeyword.traverse(visitor);
			
			if (consts != null)
			{
				for (ASTNode constNode : consts)
				{
					constNode.traverse(visitor);
				}
			}
			
			visitor.endvisit(this);
		}
	}


	public List<ASTNode> getConsts() {
		return this.consts;
	}

	public void setConsts(List<ASTNode> consts) {
		this.consts = consts;
	}

	public Keyword getConstKeyword() {
		return this.constKeyword;
	}

	public void setConstKeyword(Keyword keyword) {
		this.constKeyword = keyword;
	}

	public List<Integer> getCommas() {
		return this.commas;
	}

	public void setCommas(List<Integer> commas) {
		this.commas = commas;
	}

	public int getSemicolonPosition() {
		return this.semic;
	}

	public void setSemicolonPosition(int semic) {
		this.semic = semic;
	}

	public String toSourceString(String indentationString) {

		Assert.isTrue(sourceStart() >= 0);
		Assert.isTrue(sourceEnd() > 0);
		Assert.isTrue(consts.size() == 0 || commas.size() == consts.size() - 1);
		Assert.isTrue(semic > 0);

		StringBuffer buffer = new StringBuffer();

		buffer.append(indentationString);
		buffer.append(Keywords.CONST);
		buffer.append(" ");

		for (int i = 0; i < consts.size(); i++) {
			if (i > 0)
				buffer.append(", ");

			buffer.append(((ISourceable) consts.get(i))
					.toSourceString(indentationString));
		}
		buffer.append(";\n");

		return buffer.toString();
	}

	public boolean isBlock() {
		return false;
	}

}
