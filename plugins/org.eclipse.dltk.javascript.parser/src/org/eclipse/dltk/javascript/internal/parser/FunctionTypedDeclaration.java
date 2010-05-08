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

import org.eclipse.dltk.javascript.ast.FunctionStatement;
import org.eclipse.dltk.javascript.ast.Type;

public class FunctionTypedDeclaration implements ITypedDeclaration {

	private final FunctionStatement function;

	public FunctionTypedDeclaration(FunctionStatement function) {
		this.function = function;
	}

	public int getColonPosition() {
		return function.getColonPosition();
	}

	public Type getType() {
		return function.getReturnType();
	}

	public void setColonPosition(int colonPosition) {
		function.setColonPosition(colonPosition);
	}

	public void setType(Type type) {
		function.setReturnType(type);
	}

}
