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

public class SetMethod extends Method {

	private Keyword setKeyword;
	private Identifier argument;

	public SetMethod(ASTNode parent) {
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
			if (setKeyword != null) setKeyword.traverse(visitor);
			if (getName() != null) getName().traverse(visitor);
			if (argument != null) argument.traverse(visitor);
			if (getBody() != null) getBody().traverse(visitor);
			visitor.endvisit(this);
		}
	}


	public Identifier getArgument() {
		return this.argument;
	}

	public void setArgument(Identifier argument) {
		this.argument = argument;
	}

	public Keyword getSetKeyword() {
		return this.setKeyword;
	}

	public void setSetKeyword(Keyword keyword) {
		this.setKeyword = keyword;
	}

	public String toSourceString(String indentationString) {

		Assert.isTrue(sourceStart() > 0);
		Assert.isTrue(sourceEnd() > 0);
		Assert.isTrue(getLP() > 0);
		Assert.isTrue(getRP() > 0);

		StringBuffer buffer = new StringBuffer();

		buffer.append(Keywords.SET);
		buffer.append(" ");
		buffer.append(getName().toSourceString(indentationString));
		buffer.append(" (");
		buffer.append(getArgument().toSourceString(indentationString));
		buffer.append(")\n");
		buffer.append(getBody().toSourceString(indentationString));

		return buffer.toString();
	}

}
