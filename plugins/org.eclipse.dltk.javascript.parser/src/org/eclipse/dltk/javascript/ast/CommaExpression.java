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
import org.eclipse.dltk.ast.ASTVisitor;

public class CommaExpression extends Expression {

	private List<ASTNode> items;
	private List<Integer> commas;

	public CommaExpression(ASTNode parent) {
		super(parent);
	}

	/**
	 * @see org.eclipse.dltk.ast.ASTNode#traverse(org.eclipse.dltk.ast.ASTVisitor)
	 */
	@Override
	public void traverse(ASTVisitor visitor) throws Exception {
		if (visitor.visit(this)) {
			if (items != null) {
				for (ASTNode node : items) {
					node.traverse(visitor);
				}
			}
			visitor.endvisit(this);
		}
	}

	public List<ASTNode> getItems() {
		return this.items;
	}

	public void setItems(List<ASTNode> items) {
		this.items = items;
	}

	public List<Integer> getCommas() {
		return this.commas;
	}

	public void setCommas(List<Integer> commas) {
		this.commas = commas;
	}

	@Override
	public String toSourceString(String indentationString) {

		Assert.isTrue(sourceStart() > 0);
		Assert.isTrue(sourceEnd() > 0);
		Assert.isTrue(items.size() == 0 || commas.size() == items.size() - 1);

		StringBuffer buffer = new StringBuffer();

		for (int i = 0; i < items.size(); i++) {
			if (i > 0)
				buffer.append(", ");

			buffer.append(((ISourceable) items.get(i))
					.toSourceString(indentationString));
		}

		return buffer.toString();
	}

}
