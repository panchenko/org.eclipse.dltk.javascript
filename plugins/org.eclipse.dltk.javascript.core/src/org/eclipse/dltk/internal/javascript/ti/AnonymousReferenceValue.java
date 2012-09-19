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
package org.eclipse.dltk.internal.javascript.ti;

/**
 * Subclass of {@link AnonymousValue} having {@link #isReference()} method
 * always returning true.
 */
public class AnonymousReferenceValue extends AnonymousValue {

	@Override
	public boolean isReference() {
		return true;
	}

}
