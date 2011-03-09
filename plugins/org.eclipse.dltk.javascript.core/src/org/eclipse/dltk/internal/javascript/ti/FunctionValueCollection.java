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

import static org.eclipse.dltk.javascript.typeinfo.ITypeNames.NUMBER;
import static org.eclipse.dltk.javascript.typeinfo.ITypeNames.OBJECT;

import org.eclipse.dltk.javascript.typeinference.IValueCollection;
import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinference.ReferenceKind;
import org.eclipse.dltk.javascript.typeinfo.TypeUtil;

public class FunctionValueCollection extends ValueCollection {

	private final String functionName;

	public FunctionValueCollection(IValueCollection parent, String functionName) {
		this(parent, functionName, new ThisValue());
	}

	public FunctionValueCollection(IValueCollection parent,
			String functionName, IValueReference thisValue) {
		super(parent);
		this.functionName = functionName;
		this.thisValue = thisValue;
		IValueReference arguments = createChild("arguments");
		arguments.setKind(ReferenceKind.LOCAL);
		IValueReference argumentsLength = arguments.getChild("length");
		argumentsLength.setDeclaredType(TypeUtil.ref(NUMBER));
		IValueReference argumentsArray = arguments
				.getChild(IValueReference.ARRAY_OP);
		argumentsArray.setDeclaredType(TypeUtil.ref(OBJECT));
	}

	public boolean isScope() {
		return true;
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

		@Override
		public boolean isReference() {
			return true;
		}
	}

	private final IValueReference thisValue;

	@Override
	public IValueReference getThis() {
		return thisValue;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "<" + functionName + ">";
	}

}
