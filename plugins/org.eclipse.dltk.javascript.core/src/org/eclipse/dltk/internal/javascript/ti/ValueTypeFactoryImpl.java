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

import org.eclipse.dltk.javascript.typeinference.IValueParent;
import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinfo.ITypeInfoContext;
import org.eclipse.dltk.javascript.typeinfo.ITypeNames;
import org.eclipse.dltk.javascript.typeinfo.model.Type;

public class ValueTypeFactoryImpl implements IValueTypeFactory, ITypeNames {

	private final ITypeInfoContext context;

	ValueTypeFactoryImpl(ITypeInfoContext context) {
		this.context = context;
	}

	private IValueReference create(IValueParent parent, String typeName) {
		return create(parent, context.getType(typeName));
	}

	public IValueReference create(IValueParent parent, final Type type) {
		return new ConstantValue(type);
	}

	public IValueReference createObject(IValueParent parent) {
		return create(parent, OBJECT);
	}

	public IValueReference createArray(IValueParent parent) {
		return create(parent, ARRAY);
	}

	public IValueReference createBoolean(IValueParent parent) {
		return create(parent, BOOLEAN);
	}

	public IValueReference createNumber(IValueParent parent) {
		return create(parent, NUMBER);
	}

	public IValueReference createRegExp(IValueParent parent) {
		return create(parent, REGEXP);
	}

	public IValueReference createString(IValueParent parent) {
		return create(parent, STRING);
	}

	public IValueReference createXML(IValueParent parent) {
		return create(parent, XML);
	}
}
