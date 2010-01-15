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

import java.util.Collection;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.javascript.internal.parser.JSLiterals;

public abstract class Statement extends JSNode implements ISourceable {

	public Statement(ASTNode parent) {
		super(parent);
	}

	public String toString() {
		return toSourceString(JSLiterals.EMPTY);
	}

	/**
	 * @since 2.0
	 */
	protected static void toSourceString(Collection<Statement> statements,
			StringBuffer buffer, String indentationString) {
		for (Statement statement : statements) {
			buffer.append(statement.toSourceString(indentationString));
		}
	}

	/**
	 * @since 2.0
	 */
	protected static final String INDENT = "    ";

	public abstract String toSourceString(String indentationString);
}
