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
	 * @param typeSystem
	 *            the context for the operation, possible <code>null</code>
	 * @param type
	 *            the type to wrap
	 */
	IRType toRType(ITypeSystem typeSystem, IRTypeDeclaration declaration);

}
