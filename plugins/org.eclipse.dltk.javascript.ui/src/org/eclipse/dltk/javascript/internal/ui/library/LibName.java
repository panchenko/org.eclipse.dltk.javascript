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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.dltk.javascript.typeinfo.TypeLibrary;

class LibName {

	final String name;

	LibName(String name) {
		this.name = name;
	}

	@Override
	public int hashCode() {
		return name.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof LibName) {
			final LibName other = (LibName) obj;
			return name.equals(other.name);
		}
		return false;
	}

	@Override
	public String toString() {
		// used by ViwerComparator as labelProvider is not ILabelProvider
		return name;
	}

	public List<TypeLibrary> filter(List<TypeLibrary> libraries) {
		List<TypeLibrary> result = new ArrayList<TypeLibrary>();
		for (TypeLibrary library : libraries) {
			if (name.equals(library.name())) {
				result.add(library);
			}
		}
		return result;
	}
}
