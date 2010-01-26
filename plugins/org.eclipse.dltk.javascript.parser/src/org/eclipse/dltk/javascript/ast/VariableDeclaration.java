/*******************************************************************************
 * Copyright (c) 2010 xored software, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.ast;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.javascript.internal.parser.JSLiterals;

public class VariableDeclaration extends JSNode implements ISourceable {

	private Identifier identifier;
	private int colonPosition = -1;
	private Type type;
	private int assignPosition = -1;
	private Expression initializer;
	private int commaPosition = -1;

	/**
	 * @param parent
	 */
	public VariableDeclaration(ASTNode parent) {
		super(parent);
	}

	@Override
	public String toSourceString(String indentationString) {
		final StringBuilder sb = new StringBuilder();
		sb.append(identifier != null ? identifier.getName()
				: JSLiterals.ERROR_TOKEN);
		if (type != null) {
			sb.append(JSLiterals.COLON);
			sb.append(type.toSourceString(indentationString));
		}
		if (initializer != null) {
			sb.append(JSLiterals.ASSIGN);
			sb.append(initializer.toSourceString(indentationString));
		}
		return sb.toString();
	}

	@Override
	public void traverse(ASTVisitor visitor) throws Exception {
		if (visitor.visit(this)) {
			if (identifier != null) {
				identifier.traverse(visitor);
			}
			if (type != null) {
				type.traverse(visitor);
			}
			if (initializer != null) {
				initializer.traverse(visitor);
			}
			visitor.endvisit(this);
		}
	}

	public int getColonPosition() {
		return colonPosition;
	}

	public void setColonPosition(int colonPosition) {
		this.colonPosition = colonPosition;
	}

	public int getAssignPosition() {
		return assignPosition;
	}

	public void setAssignPosition(int assignPosition) {
		this.assignPosition = assignPosition;
	}

	public int getCommaPosition() {
		return commaPosition;
	}

	public void setCommaPosition(int commaPosition) {
		this.commaPosition = commaPosition;
	}

	public String getVariableName() {
		return identifier != null ? identifier.getName() : null;
	}

	public Identifier getIdentifier() {
		return identifier;
	}

	public void setIdentifier(Identifier name) {
		this.identifier = name;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	public Expression getInitializer() {
		return initializer;
	}

	public void setInitializer(Expression initializer) {
		this.initializer = initializer;
	}

}
