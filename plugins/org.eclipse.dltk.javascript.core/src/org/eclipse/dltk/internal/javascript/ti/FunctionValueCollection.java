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

public class FunctionValueCollection extends ValueCollection {

	public FunctionValueCollection(IValueCollection parent) {
		super(parent);
	}

	private final IValueReference returnValue = new ValueReference(this);

	@Override
	public IValueReference getReturnValue() {
		return returnValue;
	}

	private final IValueReference thisValue = new ValueReference(this);

	@Override
	public IValueReference getThis() {
		return thisValue;
	}

}
