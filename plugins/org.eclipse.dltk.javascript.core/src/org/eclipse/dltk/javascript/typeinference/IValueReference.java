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
package org.eclipse.dltk.javascript.typeinference;

import org.eclipse.dltk.javascript.typeinfo.IRType;
import org.eclipse.dltk.javascript.typeinfo.JSTypeSet;

public interface IValueReference extends IValueParent, ILocationProvider {

	static final String FUNCTION_OP = "()"; //$NON-NLS-1$
	static final String ARRAY_OP = "[]"; //$NON-NLS-1$

	IValueReference getParent();

	String getName();

	JSTypeSet getTypes();

	void clear();

	void setValue(IValueReference value);

	void addValue(IValueReference value, boolean copy);

	void delete(boolean force);

	ReferenceKind getKind();

	void setKind(ReferenceKind kind);

	ReferenceLocation getLocation();

	void setLocation(ReferenceLocation location);

	IRType getDeclaredType();

	void setDeclaredType(IRType type);

	JSTypeSet getDeclaredTypes();

	Object getAttribute(String key, boolean includeReferences);

	Object getAttribute(String key);

	void setAttribute(String key, Object value);

	boolean exists();

	boolean isParentOf(IValueReference anotherReference);

	void removeReference(IValueReference reference);
}
