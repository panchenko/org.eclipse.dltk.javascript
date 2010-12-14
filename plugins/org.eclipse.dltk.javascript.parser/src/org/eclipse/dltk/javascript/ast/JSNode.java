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

import java.util.Collection;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.javascript.internal.parser.JSLiterals;

public abstract class JSNode extends ASTNode {

	/**
	 * @since 2.0
	 */
	protected static void toSourceString(Collection<Statement> statements,
			StringBuffer buffer, String indentationString) {
		for (Statement statement : statements) {
			buffer.append(statement.toSourceString(indentationString));
		}
	}

	private final ASTNode parent;

	public JSNode(ASTNode parent) {
		this.parent = parent;
		setStart(0);
		setEnd(0);
	}

	public ASTNode getParent() {
		return this.parent;
	}

	public Comment getDocumentation() {
		return null;
	}

	@Override
	public String toString() {
		return toSourceString(JSLiterals.EMPTY);
	}

	public abstract String toSourceString(String indentationString);

}
