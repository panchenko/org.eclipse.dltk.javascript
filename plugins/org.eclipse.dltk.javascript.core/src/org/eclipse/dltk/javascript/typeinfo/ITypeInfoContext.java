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

import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.javascript.typeinfo.model.Type;

public interface ITypeInfoContext {

	Type getType(String typeName);

	/**
	 * @since 3.0
	 */
	Type getKnownType(String typeName);

	/**
	 * Returns the model element being processed or <code>null</code>
	 * 
	 * @return
	 */
	IModelElement getModelElement();

}
