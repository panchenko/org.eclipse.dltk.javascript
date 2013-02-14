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
import org.eclipse.dltk.internal.javascript.ti.TypeInferencer2;
import org.eclipse.dltk.internal.javascript.ti.TypeSystemImpl;
import org.eclipse.dltk.javascript.internal.core.RParameterizedTypeDeclaration;
import org.eclipse.dltk.javascript.internal.core.ThreadTypeSystemImpl;
import org.eclipse.dltk.javascript.internal.core.TypeSystems;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeVariable;

/**
 * Type System is responsible for converting model {@link Type} to the
 * "resolved" {@link IRTypeDeclaration} representation.
 * 
 * <p>
 * There are a few implementations of this interface provided:
 * <ul>
 * <li>{@link TypeSystemImpl} is a standalone implementation, which is used
 * mostly for {@link TypeSystems#GLOBAL}
 * <li>{@link TypeInferencer2} is the entry point to invoke type
 * inference/validations.
 * <li>Also there are some delegating implementations, e.g.
 * {@link RParameterizedTypeDeclaration} implements it, but delegates most of
 * the calls to the parent
 * </ul>
 * 
 * @see IRTypeDeclaration
 * @see Type
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface ITypeSystem {

	/**
	 * Access to the current typesystem and helper functions to execute the code
	 * having the specified typesystem set as current.
	 */
	ThreadTypeSystem CURRENT = new ThreadTypeSystemImpl();

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
	 * Returns the {@link Type} with the specified name if it is known to this
	 * type system or <code>null</code> if no such type exists. The returned
	 * value is never a proxy.
	 * 
	 * @param typeName
	 *            the name of the type
	 */
	Type getKnownType(String typeName);

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
	IValue valueOf(IRMember member);

	/**
	 * Convert type model to the runtime representation.
	 */
	IRTypeDeclaration convert(Type type);

	/**
	 * Creates a copy of the specified element replacing contextualizable type
	 * expressions with the specified type.
	 */
	<E extends IRMember> E contextualize(E member, IRTypeDeclaration type);

	/**
	 * Parameterizes the specified generic type with the specified parameters.
	 */
	IRTypeDeclaration parameterize(Type target,
			List<? extends IRType> parameters);

	/**
	 * Returns current value of the specified type variable (if some type is
	 * being parameterized at the moment) or <code>null</code>.
	 */
	IRType getTypeVariable(TypeVariable variable);

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

	/**
	 * Returns the primary type system or this type system if it is primary.
	 */
	ITypeSystem getPrimary();

}
