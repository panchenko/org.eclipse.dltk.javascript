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

public class CommaExpression extends Expression {

	private List items;
	private List commas;

	public CommaExpression(ASTNode parent) {
		super(parent);
	}

	public List getItems() {
		return this.items;
	}

	public void setItems(List items) {
		this.items = items;
	}

	public List getCommas() {
		return this.commas;
	}

	public void setCommas(List commas) {
		this.commas = commas;
	}

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

	public boolean isBlock() {
		return false;
	}

}
