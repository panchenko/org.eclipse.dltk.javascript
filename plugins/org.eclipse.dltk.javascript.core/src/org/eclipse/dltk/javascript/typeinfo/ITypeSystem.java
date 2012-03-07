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

import java.util.List;

import org.eclipse.dltk.internal.javascript.ti.IValue;
import org.eclipse.dltk.javascript.typeinfo.model.Member;
import org.eclipse.dltk.javascript.typeinfo.model.Type;

public interface ITypeSystem {

	/**
	 * Resolves the specified type if it's a proxy
	 * 
	 * @param type
	 * @return
	 */
	Type resolveType(Type type);

	/**
	 * Support for members pointing to other .js files. Returns the result of
	 * the referenced file evaluation or <code>null</code> to proceed with the
	 * result from type model.
	 * 
	 * @param member
	 * @return
	 */
	IValue valueOf(Member member);

	Type parameterize(Type target, List<IRType> parameters);

	/**
	 * Returns current value for the specified attribute.
	 * 
	 * @param key
	 * @return
	 */
	<T> T getAttribute(AttributeKey<T> key);

}
