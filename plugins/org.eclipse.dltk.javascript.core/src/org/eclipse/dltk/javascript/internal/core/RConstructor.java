/*******************************************************************************
 * Copyright (c) 2012 NumberFour AG
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     NumberFour AG - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.internal.core;

import java.util.List;

import org.eclipse.dltk.javascript.typeinfo.IRConstructor;
import org.eclipse.dltk.javascript.typeinfo.IRParameter;
import org.eclipse.dltk.javascript.typeinfo.IRType;
import org.eclipse.dltk.javascript.typeinfo.IRTypeDeclaration;
import org.eclipse.dltk.javascript.typeinfo.model.Method;

public class RConstructor extends RMethod implements IRConstructor {

	public RConstructor(Method method, IRTypeDeclaration typeDeclaration) {
		super(method, typeDeclaration);
	}

	public RConstructor(Method method, IRType type,
			List<IRParameter> parameters, IRTypeDeclaration typeDeclaration) {
		super(method, type, parameters, typeDeclaration);
	}

}
