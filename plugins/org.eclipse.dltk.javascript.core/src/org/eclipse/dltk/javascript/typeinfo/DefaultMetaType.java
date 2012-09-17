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

public enum DefaultMetaType implements MetaType {

	DEFAULT;

	public String getId() {
		return MetaType.class.getName() + "." + name();
	}

	public IRType toRType(ITypeSystem typeSystem, Type type) {
		// TODO (alex) compatibility
		for (IRTypeFactory factory : TypeInfoManager.getRTypeFactories()) {
			final IRType runtimeType = factory.create(type);
			if (runtimeType != null) {
				return runtimeType;
			}
		}
		return new RSimpleType(type);
	}

}
