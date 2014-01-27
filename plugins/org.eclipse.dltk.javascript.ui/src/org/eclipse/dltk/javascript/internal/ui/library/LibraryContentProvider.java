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
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.dltk.javascript.typeinfo.TypeLibrary;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.Viewer;

class LibraryContentProvider implements ITreeContentProvider {

	public void dispose() {
		input = null;
	}

	private List<TypeLibrary> input;

	@SuppressWarnings("unchecked")
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput) {
		if (newInput instanceof List<?>) {
			input = (List<TypeLibrary>) newInput;
		} else {
			input = null;
		}
	}

	@SuppressWarnings("unchecked")
	public Object[] getElements(Object inputElement) {
		if (inputElement instanceof List<?>) {
			final Set<String> names = new HashSet<String>();
			for (TypeLibrary library : ((List<TypeLibrary>) inputElement)) {
				names.add(library.name());
			}
			final List<LibName> libs = new ArrayList<LibName>();
			for (String name : names) {
				libs.add(new LibName(name));
			}
			return libs.toArray();
		}
		return new Object[0];
	}

	public Object[] getChildren(Object parentElement) {
		if (parentElement instanceof LibName) {
			final List<LibVersion> versions = new ArrayList<LibVersion>();
			if (input != null) {
				for (TypeLibrary library : ((LibName) parentElement).filter(input)) {
					versions.add(new LibVersion(library));
				}
			}
			return versions.toArray();
		} else if (parentElement instanceof LibVersion) {
			return new Object[] { ((LibVersion) parentElement).library };
		}
		return new Object[0];
	}

	public Object getParent(Object element) {
		if (element instanceof LibVersion) {
			return new LibName(((LibVersion) element).library.name());
		} else if (element instanceof TypeLibrary) {
			return new LibVersion((TypeLibrary) element);
		}
		return null;
	}

	public boolean hasChildren(Object element) {
		return element instanceof LibName || element instanceof LibVersion;
	}
}
