/*******************************************************************************
 * Copyright (c) 2011 NumberFour AG
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     NumberFour AG - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.typeinference;

import java.util.Collections;
import java.util.Set;

import org.eclipse.dltk.internal.javascript.ti.ITypeInferenceContext;
import org.eclipse.dltk.internal.javascript.ti.IValue;
import org.eclipse.dltk.internal.javascript.ti.IValueProvider;
import org.eclipse.dltk.internal.javascript.ti.PhantomValue;
import org.eclipse.dltk.javascript.typeinfo.JSTypeSet;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;

public enum PhantomValueReference implements IValueReference, IValueProvider {

	REFERENCE;

	public Set<String> getDirectChildren() {
		return Collections.emptySet();
	}

	public Set<String> getDeletedChildren() {
		return Collections.emptySet();
	}

	public boolean hasChild(String name) {
		return true;
	}

	public IValueReference getChild(String name) {
		return this;
	}

	public ITypeInferenceContext getContext() {
		return null;
	}

	public IValueReference getParent() {
		return null;
	}

	public String getName() {
		return "";
	}

	public JSTypeSet getTypes() {
		return JSTypeSet.emptySet();
	}

	public void clear() {
	}

	public void setValue(IValueReference value) {
	}

	public void addValue(IValueReference value, boolean copy) {
	}

	public void delete() {
	}

	public ReferenceKind getKind() {
		return ReferenceKind.PHANTOM;
	}

	public void setKind(ReferenceKind kind) {
	}

	public ReferenceLocation getLocation() {
		return ReferenceLocation.UNKNOWN;
	}

	public void setLocation(ReferenceLocation location) {
	}

	public JSType getDeclaredType() {
		return null;
	}

	public void setDeclaredType(JSType type) {
	}

	public JSTypeSet getDeclaredTypes() {
		return JSTypeSet.emptySet();
	}

	public Object getAttribute(String key, boolean includeReferences) {
		return null;
	}

	public Object getAttribute(String key) {
		return null;
	}

	public void setAttribute(String key, Object value) {
	}

	public boolean exists() {
		return true;
	}

	public boolean isParentOf(IValueReference anotherReference) {
		return anotherReference instanceof PhantomValueReference;
	}

	public boolean isReference() {
		return false;
	}

	public IValue getValue() {
		return PhantomValue.VALUE;
	}

	public IValue createValue() {
		return getValue();
	}

}
