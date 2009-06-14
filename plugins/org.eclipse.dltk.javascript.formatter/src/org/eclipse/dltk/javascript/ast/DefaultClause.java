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

public class DefaultClause extends SwitchComponent {

	private Keyword defaultKeyword;
	private StatementList statements;
	private int colon = -1;

	public DefaultClause(ASTNode parent) {
		super(parent);
	}

	public StatementList getStatements() {
		return this.statements;
	}

	public void setStatements(StatementList statements) {
		this.statements = statements;
	}

	public Keyword getDefaultKeyword() {
		return this.defaultKeyword;
	}

	public void setDefaultKeyword(Keyword keyword) {
		this.defaultKeyword = keyword;
	}

	public int getColonPosition() {
		return this.colon;
	}

	public void setColonPosition(int colon) {
		this.colon = colon;
	}

	public String toSourceString(String indentionString) {

		Assert.isTrue(sourceStart() > 0);
		Assert.isTrue(sourceEnd() > 0);
		Assert.isTrue(colon > 0);

		StringBuffer buffer = new StringBuffer();

		buffer.append(indentionString);

		buffer.append(Keywords.DEFAULT);
		buffer.append(":\n");

		buffer.append(this.getStatements().toSourceString(
				indentionString + "    "));

		return buffer.toString();
	}

	public boolean isBlock() {
		return false;
	}

}
