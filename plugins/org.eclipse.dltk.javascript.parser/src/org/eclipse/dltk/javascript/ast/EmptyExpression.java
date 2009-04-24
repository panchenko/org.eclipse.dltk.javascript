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

public class EmptyExpression extends Expression {

	public EmptyExpression(ASTNode parent) {
		super(parent);

		setStart(-1);
		setEnd(-1);
	}

	
	public String toSourceString(String indentationString) {
		return "";
	}

	
	public boolean isBlock() {
		return false;
	}

}
