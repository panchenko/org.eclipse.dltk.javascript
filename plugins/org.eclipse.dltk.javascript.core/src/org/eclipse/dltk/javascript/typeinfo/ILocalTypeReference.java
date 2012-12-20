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

import org.eclipse.dltk.internal.javascript.ti.TypeInferencer2;
import org.eclipse.dltk.javascript.typeinfo.model.Type;

/**
 * Handle of the "local type" registered in the {@link TypeInferencer2} via
 * {@link ITypeInfoContext#registerLocalType(Type)}. The idea is that it is
 * something temporary, created based on the current module and it should not be
 * available for other modules.
 */
public interface ILocalTypeReference {

	/**
	 * Returns the model {@link Type} instance managed via this local type
	 * reference.
	 */
	Type getType();

	/**
	 * Answers if this local type instance is enabled at the moment
	 */
	boolean isEnabled();

	/**
	 * Enables or disables this local type instance
	 */
	void setEnabled(boolean value);

}
