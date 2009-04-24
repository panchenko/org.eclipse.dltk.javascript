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
import org.eclipse.dltk.ast.ASTVisitor;

public class Keyword extends ASTNode {

	private String keyword;
	private ASTNode parent;

	public Keyword(ASTNode parent, String keyword) {
		this.parent = parent;
		this.keyword = keyword;
		setStart(-1);
		setEnd(-1);
	}

	public ASTNode getParent() {
		return this.parent;
	}

	public String getKeyword() {

		Assert.isTrue(sourceStart() >= 0);
		Assert.isTrue(sourceEnd() > 0);

		return this.keyword;
	}

	public String toString() {
		return toSourceString("");
	}

	public String toSourceString(String indentationString) {

		Assert.isTrue(sourceStart() > 0);
		Assert.isTrue(sourceEnd() > 0);

		return keyword;
	}

	public void traverse(ASTVisitor visitor) throws Exception {
	}

}
