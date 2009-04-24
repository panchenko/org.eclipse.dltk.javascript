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

public class StatementBlock extends Statement {

	private List statements;
	private int LC;
	private int RC;

	public StatementBlock(ASTNode parent) {
		super(parent);
	}

	public List getStatements() {
		return this.statements;
	}

	public void setStatements(List statements) {
		this.statements = statements;
	}

	public int getLC() {
		return this.LC;
	}

	public void setLC(int LC) {
		this.LC = LC;
	}

	public int getRC() {
		return this.RC;
	}

	public void setRC(int RC) {
		this.RC = RC;
	}

	public String toSourceString(String indentationString) {

		Assert.isTrue(sourceStart() >= 0);
		Assert.isTrue(sourceEnd() > 0);
		Assert.isTrue(LC >= 0);
		Assert.isTrue(RC > 0);

		StringBuffer buffer = new StringBuffer();

		buffer.append(indentationString);
		buffer.append("{\n");

		for (int i = 0; i < statements.size(); i++) {
			buffer.append(((ISourceable) statements.get(i))
					.toSourceString(indentationString + "    "));
		}

		buffer.append(indentationString);
		buffer.append("}\n");

		return buffer.toString();
	}

	public boolean isBlock() {
		return true;
	}
}
