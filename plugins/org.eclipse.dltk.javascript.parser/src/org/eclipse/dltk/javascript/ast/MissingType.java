/*******************************************************************************
 * Copyright (c) 2010 xored software, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.ast;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.compiler.util.Util;

public class MissingType extends Type {

	public MissingType(ASTNode parent, int offset) {
		super(parent);
		setStart(offset);
		setEnd(offset);
	}

	@Override
	public String getName() {
		return Util.EMPTY_STRING;
	}

	@Override
	public String toSourceString(String indentationString) {
		return getName();
	}

	@Override
	public void traverse(ASTVisitor visitor) throws Exception {
		if (visitor.visit(this)) {
			visitor.endvisit(this);
		}
	}

	@Override
	public String toString() {
		return getClass().getSimpleName();
	}

}
