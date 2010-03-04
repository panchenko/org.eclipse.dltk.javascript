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
package org.eclipse.dltk.internal.javascript.ti;

import org.eclipse.dltk.javascript.typeinfo.ITypeNames;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelLoader;

public class ValueTypeFactoryImpl implements IValueTypeFactory, ITypeNames {

	private IValueReference create(String typeName) {
		return create(get(typeName));
	}

	public IValueReference create(final Type type) {
		return new ValueReference(type);
	}

	public IValueReference createObject() {
		return create(OBJECT);
	}

	public IValueReference createArray() {
		return create(ARRAY);
	}

	public IValueReference createBoolean() {
		return create(BOOLEAN);
	}

	public IValueReference createNumber() {
		return create(NUMBER);
	}

	public IValueReference createRegExp() {
		return create(REGEXP);
	}

	public IValueReference createString() {
		return create(STRING);
	}

	public IValueReference createXML() {
		return create(XML);
	}

	public Type get(String name) {
		return TypeInfoModelLoader.getInstance().getType(name);
	}
}
