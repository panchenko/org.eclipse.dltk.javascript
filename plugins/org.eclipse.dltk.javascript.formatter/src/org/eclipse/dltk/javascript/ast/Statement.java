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

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.ASTVisitor;

public abstract class Statement extends ASTNode implements ISourceable {

	private ASTNode parent;

	public Statement(ASTNode parent) {
		this.parent = parent;
		setStart(0);
		setEnd(0);
	}

	public ASTNode getParent() {
		return this.parent;
	}

	public void traverse(ASTVisitor visitor) throws Exception {
	}

	public String toString() {
		return toSourceString("");
	}

	public abstract String toSourceString(String indentationString);
}
