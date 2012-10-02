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
package org.eclipse.dltk.internal.javascript.ti;

import org.eclipse.dltk.javascript.typeinference.IAssignProtection;
import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinference.ReferenceKind;
import org.eclipse.dltk.javascript.typeinfo.IRFunctionType;
import org.eclipse.dltk.javascript.typeinfo.IRMethod;
import org.eclipse.dltk.javascript.typeinfo.IRType;
import org.eclipse.dltk.javascript.typeinfo.ITypeSystem;
import org.eclipse.dltk.javascript.typeinfo.JSTypeSet;
import org.eclipse.dltk.javascript.typeinfo.RTypes;

class FunctionTypeMethodValue extends ElementValue implements IValue {

	private TypeValue functionOperator;
	private final IRFunctionType functionType;
	private final FunctionMethod functionMethod;
	private final IRMethod method;

	public FunctionTypeMethodValue(ITypeSystem context,
			IRFunctionType functionType, FunctionMethod functionMethod) {
		super(context);
		this.functionType = functionType;
		this.functionMethod = functionMethod;
		this.method = functionMethod.create(functionType);
	}

	@Override
	protected IRMethod getElements() {
		return method;
	}

	@Override
	public ReferenceKind getKind() {
		return ReferenceKind.METHOD;
	}

	public IValue getChild(String name, boolean resolve) {
		if (IValueReference.FUNCTION_OP.equals(name)) {
			if (functionType.getReturnType() != null) {
				if (functionOperator == null) {
					functionOperator = new TypeValue(context,
							functionType.getReturnType());
				}
				return functionOperator;
			} else {
				return null;
			}
		}
		final ElementValue child = ElementValue.findMemberA(context,
				getDeclaredType(), name);
		if (child != null) {
			return child;
		}
		return null;
	}

	public IRType getDeclaredType() {
		return RTypes.FUNCTION;
	}

	public JSTypeSet getDeclaredTypes() {
		return JSTypeSet.singleton(getDeclaredType());
	}

	@Override
	public Object getAttribute(String key, boolean includeReferences) {
		if (IAssignProtection.ATTRIBUTE.equals(key)) {
			return UNASSIGNABLE_METHOD;
		}
		return super.getAttribute(key, includeReferences);
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + '<' + functionType + '.'
				+ functionMethod + '>';
	}
}
