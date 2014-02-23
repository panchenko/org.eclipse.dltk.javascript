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

import org.eclipse.dltk.javascript.typeinfo.model.Visibility;

/**
 * @noimplement This interface is not intended to be implemented by clients.
 */
public interface IRMember extends IRElement {

	IRType getType();

	Visibility getVisibility();

	IRTypeDeclaration getDeclaringType();

	boolean isStatic();

	boolean isVisible();

}
