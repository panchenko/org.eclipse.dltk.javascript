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

import org.eclipse.dltk.javascript.typeinfo.model.Type;

public interface IValueReference extends IValueParent {

	static final String FUNCTION_OP = "()"; //$NON-NLS-1$
	static final String ARRAY_OP = "[]"; //$NON-NLS-1$

	IValueReference getParent();

	String getName();

	Set<Type> getTypes();

	void clear();

	void setValue(IValueReference value);

	void addValue(IValueReference value, boolean copy);

	void delete();

	ReferenceKind getKind();

	void setKind(ReferenceKind kind);

	ReferenceLocation getLocation();

	void setLocation(ReferenceLocation location);

	Type getDeclaredType();

	void setDeclaredType(Type type);

	Set<Type> getDeclaredTypes();

	Object getAttribute(String key, boolean includeReferences);
	
	Object getAttribute(String key);

	void setAttribute(String key, Object value);

	boolean exists();
}
