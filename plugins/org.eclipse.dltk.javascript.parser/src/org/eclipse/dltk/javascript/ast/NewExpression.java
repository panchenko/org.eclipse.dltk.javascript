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

import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.javascript.internal.parser.JSLiterals;

public class NewExpression extends Expression {

	private Keyword newKeyword;
	private Expression objectClass;

	public NewExpression(JSNode parent) {
		super(parent);
	}

	/**
	 * @see org.eclipse.dltk.ast.ASTNode#traverse(org.eclipse.dltk.ast.ASTVisitor)
	 */
	@Override
	public void traverse(ASTVisitor visitor) throws Exception {
		if (visitor.visit(this)) {
			if (newKeyword != null)
				newKeyword.traverse(visitor);
			if (objectClass != null)
				objectClass.traverse(visitor);
			visitor.endvisit(this);
		}
	}

	/**
	 * @since 2.0
	 */
	public Expression getObjectClass() {
		return this.objectClass;
	}

	/**
	 * @since 2.0
	 */
	public void setObjectClass(Expression objectClass) {
		this.objectClass = objectClass;
	}

	public Keyword getNewKeyword() {
		return this.newKeyword;
	}

	public void setNewKeyword(Keyword keyword) {
		this.newKeyword = keyword;
	}

	@Override
	public String toSourceString(String indentationString) {
		return Keywords.NEW + JSLiterals.SPACE
				+ toSourceString(objectClass, indentationString);
	}

}
