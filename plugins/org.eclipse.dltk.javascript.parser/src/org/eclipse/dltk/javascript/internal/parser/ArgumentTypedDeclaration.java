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
package org.eclipse.dltk.javascript.internal.parser;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.javascript.ast.Argument;
import org.eclipse.dltk.javascript.ast.Type;

public class ArgumentTypedDeclaration implements ITypedDeclaration {

	private final Argument argument;

	public ArgumentTypedDeclaration(Argument argument) {
		this.argument = argument;
	}

	public ASTNode getNode() {
		return argument;
	}

	public void setColonPosition(int colonPosition) {
		argument.setColonPosition(colonPosition);
	}

	public void setType(Type type) {
		argument.setType(type);
	}

}
