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

public class GetMethod extends Method {

	private Keyword getKeyword;

	public GetMethod(ASTNode parent) {
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
			if (getKeyword != null) getKeyword.traverse(visitor);
			if (getName() != null) getName().traverse(visitor);
			if (getBody() != null) getBody().traverse(visitor);
			visitor.endvisit(this);
		}
	}


	public Keyword getGetKeyword() {
		return this.getKeyword;
	}

	public void setGetKeyword(Keyword keyword) {
		this.getKeyword = keyword;
	}

	@Override
	public String toSourceString(String indentationString) {

		Assert.isTrue(sourceStart() > 0);
		Assert.isTrue(sourceEnd() > 0);
		Assert.isTrue(getLP() > 0);
		Assert.isTrue(getRP() > 0);

		StringBuffer buffer = new StringBuffer();

		buffer.append(Keywords.GET);
		buffer.append(" ");
		buffer.append(getName().toSourceString(indentationString));
		buffer.append(" ()");
		buffer.append(getBody().toSourceString(indentationString));

		return buffer.toString();
	}

}
