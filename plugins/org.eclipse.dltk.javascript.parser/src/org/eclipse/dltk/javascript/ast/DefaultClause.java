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

	public DefaultClause(ASTNode parent) {
		super(parent);
	}

	public Keyword getDefaultKeyword() {
		return this.defaultKeyword;
	}

	public void setDefaultKeyword(Keyword keyword) {
		this.defaultKeyword = keyword;
	}

	public String toSourceString(String indentationString) {

		Assert.isTrue(sourceStart() > 0);
		Assert.isTrue(sourceEnd() > 0);
		// Assert.isTrue(colon > 0);

		StringBuffer buffer = new StringBuffer();

		buffer.append(indentationString);

		buffer.append(Keywords.DEFAULT);
		buffer.append(":\n");

		toSourceString(getStatements(), buffer, indentationString + INDENT);

		return buffer.toString();
	}

	public boolean isBlock() {
		return false;
	}

	@Override
	public Keyword getKeyword() {
		return getDefaultKeyword();
	}

}
