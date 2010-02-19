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

import org.eclipse.dltk.javascript.internal.model.references.Type;

public interface IValueReference extends IValueParent {

	static final String FUNCTION_OP = "()";

	String getName();

	Set<Type> getTypes();

	Set<String> getDirectChildren();

	void clear();

	void addValue(IValueReference value);

	void setLocal(boolean local);

	Type getDeclaredType();

	void setDeclaredType(Type type);

}
