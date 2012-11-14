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

import org.eclipse.dltk.javascript.typeinfo.model.JSType;
import org.eclipse.dltk.javascript.typeinfo.model.Type;

/**
 * The root of the "resolved" type expression hierarchy, which is used when
 * evaluating the code. The instances are created based on EMF-backed
 * {@link JSType} type expressions (which are used only for declarations).
 * <p>
 * The rationale for these classes is having an easy and efficient way to
 * compare type expressions and a standard workflow for resolving {@link Type}
 * proxies.
 * </p>
 * <p>
 * Concrete type expressions are represented by child types -
 * {@link IRSimpleType}, {@link IRClassType} just to name a few.
 * </p>
 * <p>
 * Types are represented by {@link IRTypeDeclaration} instances, parameterized
 * types have all the type variables replaced with the actual values, the only
 * way to distinguish them is checking
 * {@link IRTypeDeclaration#isParameterized()} and
 * {@link IRTypeDeclaration#getActualTypeArguments()}.
 * </p>
 * <p>
 * Use {@link RTypes#create(ITypeSystem, JSType)} to create them.
 * </p>
 */
public interface IRType {

	/**
	 * Returns the name of this type expression.
	 */
	String getName();

	/**
	 * Checks if this type expression is compatible with the specified one.
	 */
	TypeCompatibility isAssignableFrom(IRType type);

	/**
	 * Returns the {@link ITypeSystem} this type expression belongs to, or null.
	 * 
	 * @return
	 */
	ITypeSystem activeTypeSystem();

	/**
	 * Answers if additional members could be added to this type expression.
	 */
	boolean isExtensible();

	/**
	 * Answers if this type expression extends JavaScript Object type. The only
	 * possible way to have <code>false</code> here is {@link IRSimpleType}
	 * pointing to foreign (java) type in Rhino environment.
	 */
	boolean isJavaScriptObject();

	/**
	 * Transforms the type using the specified function.
	 */
	IRType transform(IRTypeTransformer function);

	/**
	 * Normalizes this type, i.e. removes unnecessary options from the type
	 * expression. Most of the time this function returns <code>this</code>.
	 */
	IRType normalize();

}
