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

import org.eclipse.dltk.internal.javascript.typeinference.ReferenceFactory;
import org.eclipse.dltk.javascript.internal.model.references.ReferenceModelLoader;
import org.eclipse.dltk.javascript.internal.model.references.Type;

public class ValueTypeFactoryImpl implements IValueTypeFactory {

	private IValueReference create(String typeName) {
		return create(get(typeName));
	}

	public IValueReference create(final Type type) {
		return new ValueReference(type);
	}

	public IValueReference createObject() {
		return create(ReferenceFactory.OBJECT);
	}

	public IValueReference createArray() {
		return create(ReferenceFactory.ARRAY);
	}

	public IValueReference createBoolean() {
		return create(ReferenceFactory.BOOLEAN);
	}

	public IValueReference createNumber() {
		return create(ReferenceFactory.NUMBER);
	}

	public IValueReference createRegExp() {
		return create(ReferenceFactory.REGEXP);
	}

	public IValueReference createString() {
		return create(ReferenceFactory.STRING);
	}

	public IValueReference createXML() {
		return create(ReferenceFactory.XML);
	}

	public Type get(String name) {
		return ReferenceModelLoader.getInstance().getType(name);
	}
}
