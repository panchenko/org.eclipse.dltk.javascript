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
package org.eclipse.dltk.javascript.typeinfo;

import org.eclipse.dltk.javascript.typeinfo.model.Type;

public abstract class DefaultMetaType implements MetaType {

	public static final MetaType DEFAULT = new Instance();

	static class Instance extends DefaultMetaType {
		public String getId() {
			return MetaType.class.getName() + ".DEFAULT";
		}
	}

	public IRType toRType(ITypeSystem typeSystem, Type type) {
		return new RSimpleType(typeSystem, type);
	}

	public IRType toRType(ITypeSystem typeSystem, IRTypeDeclaration declaration) {
		return new RSimpleType(typeSystem, declaration);
	}

	@Override
	public String toString() {
		return getId();
	}

}
