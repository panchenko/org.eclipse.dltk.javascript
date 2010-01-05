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
import org.eclipse.dltk.javascript.formatter.internal.nodes.JSLiterals;

public abstract class Expression extends JSNode implements ISourceable {

	public Expression(ASTNode parent) {
		super(parent);
	}

	@Override
	public String toString() {
		return toSourceString(JSLiterals.EMPTY);
	}

	public abstract String toSourceString(String indentationString);
}
