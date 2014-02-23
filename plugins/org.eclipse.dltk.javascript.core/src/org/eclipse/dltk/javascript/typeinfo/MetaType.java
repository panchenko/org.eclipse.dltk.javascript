/*******************************************************************************
 * Copyright (c) 2012 NumberFour AG
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

import org.eclipse.dltk.annotations.ConfigurationElement;
import org.eclipse.dltk.javascript.typeinfo.model.Type;

/**
 * "Behaviour" associated with {@link Type types}.
 * 
 * Custom implementations should extend {@link DefaultMetaType}, instead of
 * implementing this interface directly.
 * 
 * @noimplement This interface is not intended to be implemented by clients.
 */
@ConfigurationElement("metaType")
public interface MetaType {

	/**
	 * Returns the unique id of this meta type.
	 */
	String getId();

	/**
	 * Creates the corresponding {@link IRType} for the specified {@link Type}
	 * instance.
	 * 
	 * @param typeSystem
	 *            the context for the operation, possible <code>null</code>
	 * @param type
	 *            the type to wrap
	 */
	IRType toRType(ITypeSystem typeSystem, Type type);

	/**
	 * Creates the corresponding {@link IRType} for the specified
	 * {@link IRTypeDeclaration} instance.
	 * 
	 * @param type
	 *            the type to wrap
	 */
	IRType toRType(IRTypeDeclaration declaration);

	/**
	 * Returns the preferred type system for converting the specified type to
	 * {@link IRTypeDeclaration} or <code>null</code> if no preference.
	 */
	ITypeSystem getPreferredTypeSystem(Type type);

}
