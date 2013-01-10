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

import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinfo.IRType;
import org.eclipse.dltk.javascript.typeinfo.JSTypeSet;

public class ConstantValue extends AbstractReference {

	private final Value value = new Value();

	public ConstantValue(IRType type) {
		assert type != null;
		value.getTypes().add(type);
	}

	public ConstantValue(JSTypeSet types) {
		value.getTypes().addAll(types);
	}

	public boolean isReference() {
		return false;
	}

	@Override
	public Value getValue() {
		return value;
	}

	@Override
	public Value createValue() {
		return getValue();
	}

	public void delete(boolean force) {
	}

	public String getName() {
		return "";
	}

	public IValueReference getParent() {
		return null;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + value.getTypes();
	}

	public static IValueReference of(IRType type) {
		return type != null ? new ConstantValue(type) : null;
	}

}
