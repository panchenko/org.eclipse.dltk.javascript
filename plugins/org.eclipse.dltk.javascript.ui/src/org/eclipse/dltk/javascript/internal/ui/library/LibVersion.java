/*******************************************************************************
 * Copyright (c) 2014 Alex Panchenko
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Alex Panchenko - initial API and Implementation
 *******************************************************************************/
package org.eclipse.dltk.javascript.internal.ui.library;

import org.eclipse.dltk.javascript.typeinfo.TypeLibrary;

class LibVersion {

	final TypeLibrary library;

	LibVersion(TypeLibrary library) {
		this.library = library;
	}

	@Override
	public int hashCode() {
		return library.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof LibVersion) {
			final LibVersion other = (LibVersion) obj;
			return library.equals(other.library);
		}
		return false;
	}
}
