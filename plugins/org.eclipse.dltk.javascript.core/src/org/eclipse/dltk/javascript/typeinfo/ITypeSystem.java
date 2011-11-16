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
package org.eclipse.dltk.javascript.typeinfo;

import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeKind;

public interface ITypeSystem {

	/**
	 * Returns the {@link Type} with the specified name. If there is already an
	 * active call to the {@link ITypeProvider} then a proxy is returned. If
	 * type couldn't be found then {@link TypeKind#UNKNOWN} type is returned.
	 * 
	 * @param typeName
	 * @return
	 */
	Type getType(String typeName);

	/**
	 * Returns the {@link Type} with the specified name. The only difference if
	 * compared to {@link #getType(String)} is that this function returns
	 * <code>null</code> instead of {@link TypeKind#UNKNOWN} type.
	 * 
	 * @param typeName
	 *            the name of the type
	 * @param mode
	 *            the mode or <code>null</code> if unknown
	 * @since 3.0
	 */
	Type getKnownType(String typeName, TypeMode mode);

	/**
	 * Resolves the specified type if it's a proxy
	 * 
	 * @param type
	 * @return
	 */
	Type resolveType(Type type);

}
