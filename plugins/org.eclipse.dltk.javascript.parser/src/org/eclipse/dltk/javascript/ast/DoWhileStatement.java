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
import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.javascript.internal.parser.JSLiterals;

public class DoWhileStatement extends WhileStatement implements
		ISemicolonStatement {

	private Keyword doKeyword;
	private int semi = -1;

	public DoWhileStatement(JSNode parent) {
		super(parent);
	}

	/**
	 * @see org.eclipse.dltk.javascript.ast.Statement#traverse(org.eclipse.dltk.ast.ASTVisitor)
	 */
	@Override
	public void traverse(ASTVisitor visitor) throws Exception {
		if (visitor.visit(this)) {
			if (getWhileKeyword() != null)
				getWhileKeyword().traverse(visitor);
			if (getCondition() != null)
				getCondition().traverse(visitor);
			if (doKeyword != null)
				doKeyword.traverse(visitor);

			Statement body = getBody();
			if (body != null) {
				body.traverse(visitor);
			}
			visitor.endvisit(this);
		}
	}

	public Keyword getDoKeyword() {
		return this.doKeyword;
	}

	public void setDoKeyword(Keyword keyword) {
		this.doKeyword = keyword;
	}

	public int getSemicolonPosition() {
		return this.semi;
	}

	public void setSemicolonPosition(int semi) {
		this.semi = semi;
	}

	@Override
	public String toSourceString(String indentationString) {

		Assert.isTrue(sourceStart() >= 0);
		Assert.isTrue(sourceEnd() > 0);
		Assert.isTrue(getLP() > 0);
		Assert.isTrue(getRP() > 0);
		Assert.isTrue(getSemicolonPosition() > 0);

		StringBuffer buffer = new StringBuffer();

		buffer.append(indentationString);
		buffer.append(Keywords.DO);
		buffer.append(JSLiterals.EOL);
		buffer.append(getBody().toSourceString(indentationString));
		buffer.append(indentationString);
		buffer.append(Keywords.WHILE);
		buffer.append(" (");
		buffer.append(getCondition().toSourceString(indentationString));
		buffer.append(");\n");

		return buffer.toString();
	}

}
