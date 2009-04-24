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

public class NewExpression extends Expression {

	private Keyword newKeyword;
	private Identifier objectClass;

	public NewExpression(ASTNode parent) {
		super(parent);
	}

	public Identifier getObjectClass() {
		return this.objectClass;
	}

	public void setObjectClass(Identifier objectClass) {
		this.objectClass = objectClass;
	}

	public Keyword getNewKeyword() {
		return this.newKeyword;
	}

	public void setNewKeyword(Keyword keyword) {
		this.newKeyword = keyword;
	}

	public String toSourceString(String indentationString) {

		Assert.isTrue(sourceStart() > 0);
		Assert.isTrue(sourceEnd() > 0);

		StringBuffer buffer = new StringBuffer();

		buffer.append(Keywords.NEW);
		buffer.append(" ");
		buffer.append(objectClass.toSourceString(indentationString));

		return buffer.toString();
	}

	public boolean isBlock() {
		return false;
	}
}
