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

public class DoWhileStatement extends WhileStatement implements ISemicolonStatement {

	private Keyword doKeyword;
	private Keyword whileKeyword;
	private int LP = -1;
	private int RP = -1;
	private int semic = -1;

	public DoWhileStatement(ASTNode parent) {
		super(parent);
	}

	public Keyword getDoKeyword() {
		return this.doKeyword;
	}

	public void setDoKeyword(Keyword keyword) {
		this.doKeyword = keyword;
	}

	public Keyword getWhileKeyword() {
		return this.whileKeyword;
	}

	public void setWhileKeyword(Keyword keyword) {
		this.whileKeyword = keyword;
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

	public int getSemicolonPosition() {
		return this.semic;
	}

	public void setSemicolonPosition(int semic) {
		this.semic = semic;
	}

	public String toSourceString(String indentationString) {

		Assert.isTrue(sourceStart() >= 0);
		Assert.isTrue(sourceEnd() > 0);
		Assert.isTrue(LP > 0);
		Assert.isTrue(RP > 0);
		Assert.isTrue(semic > 0);

		StringBuffer buffer = new StringBuffer();

		buffer.append(indentationString);
		buffer.append(Keywords.DO);
		buffer.append("\n");
		buffer.append(getBody().toSourceString(indentationString));
		buffer.append(indentationString);
		buffer.append(Keywords.WHILE);
		buffer.append(" (");
		buffer.append(getCondition().toSourceString(indentationString));
		buffer.append(");\n");

		return buffer.toString();
	}

	public boolean isBlock() {
		return false;
	}

}
