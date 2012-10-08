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
package org.eclipse.dltk.javascript.core.tests.typeinfo;

import org.eclipse.dltk.javascript.typeinfo.DefaultMetaType;
import org.eclipse.dltk.javascript.typeinfo.IRType;
import org.eclipse.dltk.javascript.typeinfo.IRTypeDeclaration;
import org.eclipse.dltk.javascript.typeinfo.ITypeSystem;
import org.eclipse.dltk.javascript.typeinfo.MetaType;
import org.eclipse.dltk.javascript.typeinfo.model.Type;

public enum TestMetaType implements MetaType {

	INSTANCE;

	@Override
	public String getId() {
		return getClass().getName() + "." + name();
	}

	@Override
	public IRType toRType(ITypeSystem typeSystem, Type type) {
		return DefaultMetaType.DEFAULT.toRType(typeSystem, type);
	}

	@Override
	public IRType toRType(ITypeSystem typeSystem, IRTypeDeclaration declaration) {
		return DefaultMetaType.DEFAULT.toRType(typeSystem, declaration);
	}

}
