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
import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.javascript.internal.parser.JSLiterals;

public class FunctionStatement extends Expression implements ISourceableBlock {

	private Keyword functionKeyword;
	private Identifier name;
	private final List<Argument> arguments = new ArrayList<Argument>();
	private StatementBlock body;
	private int LP = -1;
	private int RP = -1;
	private int colonPosition = -1;
	private Type returnType;

	public FunctionStatement(ASTNode parent) {
		super(parent);
	}

	/**
	 * @see org.eclipse.dltk.ast.ASTNode#traverse(org.eclipse.dltk.ast.ASTVisitor)
	 */
	@Override
	public void traverse(ASTVisitor visitor) throws Exception {
		if (visitor.visit(this)) {
			if (functionKeyword != null)
				functionKeyword.traverse(visitor);
			if (name != null)
				name.traverse(visitor);

			if (arguments != null) {
				for (ASTNode node : arguments) {
					node.traverse(visitor);
				}
			}
			if (body != null)
				body.traverse(visitor);
			visitor.endvisit(this);
		}
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
	}

	public List<Argument> getArguments() {
		return this.arguments;
	}

	public void addArgument(Argument argument) {
		this.arguments.add(argument);
	}

	public StatementBlock getBody() {
		return this.body;
	}

	public void setBody(StatementBlock body) {
		this.body = body;
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

	public int getColonPosition() {
		return colonPosition;
	}

	public void setColonPosition(int colonPosition) {
		this.colonPosition = colonPosition;
	}

	public Type getReturnType() {
		return returnType;
	}

	public void setReturnType(Type returnType) {
		this.returnType = returnType;
	}

	@Override
	public String toSourceString(String indentationString) {

		Assert.isTrue(sourceStart() >= 0);
		Assert.isTrue(sourceEnd() > 0);
		Assert.isTrue(LP > 0);
		Assert.isTrue(RP > 0);

		StringBuffer buffer = new StringBuffer();

		buffer.append(indentationString);
		buffer.append(Keywords.FUNCTION);

		if (getName() != null) {
			buffer.append(" ");
			buffer.append(getName().toSourceString(indentationString));
		}

		buffer.append(" (");

		for (int i = 0; i < getArguments().size(); i++) {
			if (i > 0)
				buffer.append(", ");

			buffer.append(getArguments().get(i).toSourceString(
					indentationString));
		}

		buffer.append(")");
		if (returnType != null) {
			buffer.append(JSLiterals.COLON);
			buffer.append(returnType.toSourceString(indentationString));
		}
		buffer.append(JSLiterals.EOL);
		buffer.append(getBody().toSourceString(indentationString));

		return buffer.toString();
	}

	public boolean isBlock() {
		return true;
	}
}
