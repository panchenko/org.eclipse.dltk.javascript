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
package org.eclipse.dltk.javascript.typeinfo;

import java.util.Set;

import org.eclipse.dltk.javascript.typeinfo.model.Type;

public interface ITypeProvider {

	/**
	 * Initialize this provider to operate with the specified
	 * <code>context</code>. Return <code>false</code> to ignore this provider.
	 * 
	 * @param source
	 * @return
	 */
	boolean initialize(ITypeInfoContext context);

	/**
	 * Returns type with the specified name or <code>null</code>
	 * 
	 * @param context
	 *            operation context
	 * @param mode
	 *            type mode, can be <code>null</code>
	 * @param typeName
	 *            the type name
	 * @return
	 */
	public Type getType(ITypeInfoContext context, TypeMode mode, String typeName);

	/**
	 * Return the type names starting with the specified prefix
	 * 
	 * @param context
	 *            operation context
	 * @param mode
	 *            type mode, not <code>null</code>
	 * @param prefix
	 *            the prefix, not <code>null</code>
	 * @return
	 */
	public Set<String> listTypes(ITypeInfoContext context, TypeMode mode,
			String prefix);

}
