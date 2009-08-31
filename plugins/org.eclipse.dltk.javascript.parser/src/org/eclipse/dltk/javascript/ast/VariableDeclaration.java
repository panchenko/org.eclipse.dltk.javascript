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

public class VariableDeclaration extends Expression {

	private Keyword varKeyword;
	private List<ASTNode> variables;
	private List<Integer> commas;

	public VariableDeclaration(ASTNode parent) {
		super(parent);
	}

	public List<ASTNode> getVariables() {
		return this.variables;
	}

	public void setVariables(List<ASTNode> variables) {
		this.variables = variables;
	}

	public Keyword getVarKeyword() {
		return this.varKeyword;
	}

	public void setVarKeyword(Keyword keyword) {
		this.varKeyword = keyword;
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
		Assert.isTrue(variables.size() == 0
				|| commas.size() == variables.size() - 1);

		StringBuffer buffer = new StringBuffer();

		buffer.append(Keywords.VAR);
		buffer.append(" ");

		for (int i = 0; i < variables.size(); i++) {
			if (i > 0)
				buffer.append(", ");

			buffer.append(((ISourceable) variables.get(i))
					.toSourceString(indentationString));
		}

		return buffer.toString();
	}

	public boolean isBlock() {
		return false;
	}

}
