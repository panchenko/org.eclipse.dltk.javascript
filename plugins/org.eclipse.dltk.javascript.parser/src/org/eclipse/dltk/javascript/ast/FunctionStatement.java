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

public class FunctionStatement extends Expression {

	private Keyword functionKeyword;
	private Identifier name;
	private List arguments;
	private StatementBlock body;
	private int LP;
	private int RP;
	private List commas;

	public FunctionStatement(ASTNode parent) {
		super(parent);
	}

	public Keyword getFunctionKeyword() {
		return this.functionKeyword;
	}

	public void setFunctionKeyword(Keyword keyword) {
		this.functionKeyword = keyword;
	}

	public Identifier getName() {
		return this.name;
	}

	public void setName(Identifier name) {
		this.name = name;
		// this.name.setParent(this);
	}

	public List getArguments() {
		return this.arguments;
	}

	public void setArguments(List arguments) {
		this.arguments = arguments;
		// if (arguments != null) {
		// for (int i = 0; i < arguments.size(); i++) {
		// this.arguments.get(i).setParent(this);
		// }
		// }
	}

	public StatementBlock getBody() {
		return this.body;
	}

	public void setBody(StatementBlock body) {
		this.body = body;
		// this.body.setParent(this);
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

	public List getArgumentCommas() {
		return this.commas;
	}

	public void setArgumentCommas(List commas) {
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

		buffer.append(indentationString);
		buffer.append(Keywords.FUNCTION);
		buffer.append(" ");

		if (getName() != null) {
			buffer.append(getName().toSourceString(indentationString));
		}

		buffer.append(" (");

		for (int i = 0; i < getArguments().size(); i++) {
			if (i > 0)
				buffer.append(", ");

			buffer.append(((ISourceable) getArguments().get(i))
					.toSourceString(indentationString));
		}

		buffer.append(")\n");
		buffer.append(getBody().toSourceString(indentationString));

		return buffer.toString();
	}

	public boolean isBlock() {
		return true;
	}
}
