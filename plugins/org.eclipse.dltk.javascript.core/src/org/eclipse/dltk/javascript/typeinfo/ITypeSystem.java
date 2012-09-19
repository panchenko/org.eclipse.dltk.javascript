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
import java.util.concurrent.Callable;

import org.eclipse.dltk.internal.javascript.ti.IValue;
import org.eclipse.dltk.javascript.internal.core.ThreadTypeSystemImpl;
import org.eclipse.dltk.javascript.typeinfo.model.Member;
import org.eclipse.dltk.javascript.typeinfo.model.Type;

public interface ITypeSystem {

	/**
	 * Access to the current typesystem and helper functions to execute the code
	 * having the specified typesystem set as current.
	 */
	ThreadTypeSystem CURRENT = new ThreadTypeSystemImpl();

	/**
	 * The key of the attribute pointing to the current type.
	 */
	AttributeKey<Type> CURRENT_TYPE = new AttributeKey<Type>();

	/**
	 * Type for the utility functions accessible thru the
	 * {@link ITypeSystem#CURRENT} static member.
	 * 
	 * @noimplement This interface is not intended to be implemented by clients.
	 */
	interface ThreadTypeSystem {

		/**
		 * Returns {@link ITypeSystem} of the current thread or
		 * <code>null</code>.
		 */
		ITypeSystem get();

		/**
		 * Returns the currently processing source or <code>null</code>.
		 * 
		 * @return
		 */
		ReferenceSource getCurrentSource();

		/**
		 * Executes the code temporary setting the specified type system as
		 * current.
		 */
		void runWith(ITypeSystem typeSystem, Runnable runnable);

		/**
		 * Executes the code temporary setting the specified type system as
		 * current.
		 */
		<V> V runWith(ITypeSystem typeSystem, Callable<V> callable)
				throws Exception;
	}

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

	/**
	 * Returns the value for the specified key or <code>null</code>.
	 * <p>
	 * This method exist only to be used as temporary storage.
	 * </p>
	 */
	Object getValue(Object key);

	/**
	 * Saves the value for the specified key.
	 * <p>
	 * This method exist only to be used as temporary storage.
	 * </p>
	 */
	void setValue(Object key, Object value);

}
