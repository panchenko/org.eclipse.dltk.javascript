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
import org.eclipse.dltk.ast.declarations.ModuleDeclaration;

public class Script extends ModuleDeclaration implements ISourceable {

	private List comments;

	public Script() {
		super(0);
	}

	public String toSourceString(String indentationString) {

		Assert.isTrue(sourceStart() == 0);
		Assert.isTrue(sourceEnd() > 0);

		StringBuffer buffer = new StringBuffer();

		for (int i = 0; i < this.getStatements().size(); i++) {
			Statement statement = (Statement) this.getStatements().get(i);
			buffer.append(statement.toSourceString(indentationString));
		}

		return buffer.toString();
	}

	public boolean isBlock() {
		return true;
	}

	public List getComments() {
		return this.comments;
	}

	public void setComments(List comments) {
		this.comments = comments;
	}

	public void visitAll(IASTVisitor visitor) {
		for (int i = 0; i < this.getStatements().size(); i++) {
			Statement statement = (Statement) this.getStatements().get(i);
			visitor.visit(statement);
		}
	}
}
