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

public class GetLocalNameExpression extends Expression {

	private Expression namespace;
	private Expression localName;
	private int coloncolon = -1;

	public GetLocalNameExpression(ASTNode parent) {
		super(parent);
	}

	public Expression getNamespace() {
		return this.namespace;
	}

	public void setNamespace(Expression object) {
		this.namespace = object;
	}

	public Expression getLocalName() {
		return this.localName;
	}

	public void setLocalName(Expression localName) {
		this.localName = localName;
	}

	public int getColonColonPosition() {
		return this.coloncolon;
	}

	public void setColonColonPosition(int coloncolon) {
		this.coloncolon = coloncolon;
	}

	public String toSourceString(String indentationString) {

		Assert.isTrue(sourceStart() >= 0);
		Assert.isTrue(sourceEnd() > 0);
		Assert.isTrue(coloncolon > 0);

		StringBuffer buffer = new StringBuffer();

		buffer.append(namespace.toSourceString(indentationString));
		buffer.append("::");
		buffer.append(localName.toSourceString(indentationString));

		return buffer.toString();
	}

	public boolean isBlock() {
		return false;
	}

}
