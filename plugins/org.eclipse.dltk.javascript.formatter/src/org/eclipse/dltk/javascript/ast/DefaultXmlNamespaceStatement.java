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

public class DefaultXmlNamespaceStatement extends Statement {

	private Keyword defaultKeyword;
	private Keyword xmlKeyword;
	private Keyword namespaceKeyword;
	private int assignOperation;
	private StringLiteral value;
	private int semic;

	public DefaultXmlNamespaceStatement(ASTNode parent) {
		super(parent);
	}

	public Keyword getDefaultKeyword() {
		return this.defaultKeyword;
	}

	public void setDefaultKeyword(Keyword keyword) {
		this.defaultKeyword = keyword;
	}

	public Keyword getXmlKeyword() {
		return this.xmlKeyword;
	}

	public void setXmlKeyword(Keyword keyword) {
		this.xmlKeyword = keyword;
	}

	public Keyword getNamespaceKeyword() {
		return this.namespaceKeyword;
	}

	public void setNamespaceKeyword(Keyword keyword) {
		this.namespaceKeyword = keyword;
	}

	public int getAssignOperation() {
		return this.assignOperation;
	}

	public void setAssignOperation(int operation) {
		this.assignOperation = operation;
	}

	public StringLiteral getValue() {
		return this.value;
	}

	public void setValue(StringLiteral value) {
		this.value = value;
	}

	public int getSemicolonPosition() {
		return this.semic;
	}

	public void setSemicolonPosition(int semic) {
		this.semic = semic;
	}

	public String toSourceString(String indentationString) {

		Assert.isNotNull(defaultKeyword);
		Assert.isNotNull(xmlKeyword);
		Assert.isNotNull(namespaceKeyword);
		Assert.isNotNull(value);
		Assert.isTrue(assignOperation > 0);

		StringBuffer buffer = new StringBuffer();

		buffer.append(indentationString);
		buffer.append(Keywords.DEFAULT);
		buffer.append(" ");
		buffer.append(Keywords.XML);
		buffer.append(" ");
		buffer.append(Keywords.NAMESPACE);
		buffer.append(" = ");
		buffer.append(this.value.getText());
		if (semic > 0)
			buffer.append(";");

		return buffer.toString();
	}

	public boolean isBlock() {
		return false;
	}

}
