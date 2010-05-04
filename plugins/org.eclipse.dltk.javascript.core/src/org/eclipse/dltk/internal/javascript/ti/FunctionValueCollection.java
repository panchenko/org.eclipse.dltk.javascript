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

	private final String functionName;

	public FunctionValueCollection(IValueCollection parent, String functionName) {
		super(parent);
		this.functionName = functionName;
	}

	public boolean isScope() {
		return true;
	}

	private final IValueReference returnValue = new AnonymousValue();

	@Override
	public IValueReference getReturnValue() {
		return returnValue;
	}

	private final IValueReference thisValue = new AnonymousValue();

	@Override
	public IValueReference getThis() {
		return thisValue;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "<" + functionName + ">";
	}

}
