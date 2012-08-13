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

/**
 * "Runtime" type expression hierarchy, used when evaluating the code. The
 * instances are created based on EMF-backed
 * {@link org.eclipse.dltk.javascript.typeinfo.model.JSType} type expressions
 * used only for declarations, resolving all
 * {@link org.eclipse.dltk.javascript.typeinfo.model.Type} proxies along the
 * way.
 */
public interface IRType {

	String getName();

	TypeCompatibility isAssignableFrom(IRType type);

	ITypeSystem activeTypeSystem();

}
