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

public class PropertyExpression extends Expression {

	private Expression object;
	private Expression property;
	private int dot = -1;

	public PropertyExpression(ASTNode parent) {
		super(parent);
	}

	public Expression getObject() {
		return this.object;
	}

	public void setObject(Expression object) {
		this.object = object;
	}

	public Expression getProperty() {
		return this.property;
	}

	public void setProperty(Expression property) {
		this.property = property;
	}

	public int getDotPosition() {
		return this.dot;
	}

	public void setDotPosition(int dot) {
		this.dot = dot;
	}

	public String toSourceString(String indentationString) {

		Assert.isTrue(sourceStart() >= 0);
		Assert.isTrue(sourceEnd() > 0);
		Assert.isTrue(dot > 0);

		StringBuffer buffer = new StringBuffer();

		buffer.append(object.toSourceString(indentationString));
		buffer.append('.');
		buffer.append(property.toSourceString(indentationString));

		return buffer.toString();
	}

	public boolean isBlock() {
		return false;
	}
}
