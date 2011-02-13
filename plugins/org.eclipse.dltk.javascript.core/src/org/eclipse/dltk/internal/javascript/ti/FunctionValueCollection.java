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

import java.util.HashSet;
import java.util.Set;

import org.eclipse.dltk.javascript.typeinference.IValueCollection;
import org.eclipse.dltk.javascript.typeinference.IValueReference;

public class FunctionValueCollection extends ValueCollection {

	private final String functionName;

	public FunctionValueCollection(IValueCollection parent, String functionName) {
		super(parent);
		this.functionName = functionName;
	}

	public boolean isScope() {
		return true;
	}

	@Override
	public IValueReference getChild(String name) {
		if (!super.hasChild(name) && thisValue.hasChild(name)) {
			return thisValue.getChild(name);
		}
		return super.getChild(name);
	}

	@Override
	public Set<String> getDirectChildren() {
		Set<String> directChildren = super.getDirectChildren();
		Set<String> thisChildren = thisValue.getDirectChildren();
		if (thisChildren.isEmpty())
			return directChildren;
		if (directChildren.isEmpty())
			return thisChildren;
		HashSet<String> hs = new HashSet<String>(directChildren);
		hs.addAll(thisChildren);
		return hs;
	}

	private final IValueReference returnValue = new AnonymousValue();

	@Override
	public IValueReference getReturnValue() {
		return returnValue;
	}

	protected static class ThisValue extends AnonymousValue {
		@Override
		protected String getToStringPrefix() {
			return "this";
		}
	}

	private final IValueReference thisValue = new ThisValue();

	@Override
	public IValueReference getThis() {
		return thisValue;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "<" + functionName + ">";
	}

}
