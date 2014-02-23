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

/**
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface IRMethod extends IRMember {

	int getParameterCount();

	List<IRParameter> getParameters();

	/**
	 * Checks if this method has type declarations
	 */
	boolean isTyped();

	boolean isAbstract();

	boolean isGeneric();

}
