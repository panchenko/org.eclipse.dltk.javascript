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

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.ASTVisitor;

public class StatementBlock extends Statement implements ISourceableBlock {

	private final List<Statement> statements = new ArrayList<Statement>();
	private int LC = -1;
	private int RC = -1;

	public StatementBlock(ASTNode parent) {
		super(parent);
	}

	public void traverse(ASTVisitor visitor) throws Exception {
		if (visitor.visit(this)) {
			Iterator<Statement> it = statements.iterator();
			while (it.hasNext()) {
				Statement node = it.next();
				node.traverse(visitor);
			}
			visitor.endvisit(this);
		}
	}

	public List<Statement> getStatements() {
		return this.statements;
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
		Assert.isTrue((LC >= 0 && RC > 0) || (RC == -1 && LC == -1));

		StringBuffer buffer = new StringBuffer();

		buffer.append(indentationString);
		buffer.append("{\n");

		for (int i = 0; i < statements.size(); i++) {
			buffer.append(((ISourceable) statements.get(i))
					.toSourceString(indentationString + INDENT));
		}

		buffer.append(indentationString);
		buffer.append("}\n");

		return buffer.toString();
	}

	public boolean isBlock() {
		return true;
	}
}
