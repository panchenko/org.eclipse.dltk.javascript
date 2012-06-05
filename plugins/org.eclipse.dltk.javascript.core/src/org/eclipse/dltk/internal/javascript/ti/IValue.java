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

import java.util.Set;

import org.eclipse.dltk.javascript.typeinference.ReferenceKind;
import org.eclipse.dltk.javascript.typeinference.ReferenceLocation;
import org.eclipse.dltk.javascript.typeinfo.IRType;
import org.eclipse.dltk.javascript.typeinfo.JSTypeSet;

public interface IValue {

	int CREATE = 1;

	boolean hasChild(String name);

	Set<String> getDirectChildren();

	IValue getChild(String name, boolean resolve);

	IValue createChild(String name, int flags);

	IRType getDeclaredType();

	void setDeclaredType(IRType declaredType);

	JSTypeSet getDeclaredTypes();

	void addType(IRType type);

	JSTypeSet getTypes();

	Object getAttribute(String key, boolean includeReferences);

	@Deprecated
	Object getAttribute(String key);

	void setAttribute(String key, Object value);

	ReferenceKind getKind();

	void setKind(ReferenceKind kind);

	ReferenceLocation getLocation();

	void setLocation(ReferenceLocation location);

	void addValue(IValue src);

	void addReference(IValue src);

	void clear();

	void putChild(String name, IValue value);

	Set<String> getDeletedChildren();

	void deleteChild(String name);

}
