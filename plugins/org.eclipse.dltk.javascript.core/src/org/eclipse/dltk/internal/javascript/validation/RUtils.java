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
package org.eclipse.dltk.internal.javascript.validation;

import org.eclipse.dltk.javascript.typeinference.ReferenceLocation;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IElement;
import org.eclipse.dltk.javascript.typeinfo.IRElement;

public class RUtils {

	public static ReferenceLocation locationOf(IRElement element) {
		final Object source = element.getSource();
		if (source instanceof IElement) {
			return ((IElement) source).getLocation();
		} else {
			return null;
		}
	}

}
