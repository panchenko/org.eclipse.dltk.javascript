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

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.dltk.javascript.typeinfo.TypeLibrary;
import org.eclipse.jface.viewers.BaseLabelProvider;
import org.eclipse.jface.viewers.ILabelDecorator;
import org.eclipse.swt.graphics.Image;

class LibraryDecorator extends BaseLabelProvider implements ILabelDecorator {

	final List<TypeLibrary> libraries;

	public LibraryDecorator(List<TypeLibrary> libraries) {
		this.libraries = libraries;
	}

	public String decorateText(String text, Object element) {
		if (element instanceof LibName) {
			final List<TypeLibrary> versions = ((LibName) element)
					.filter(libraries);
			Collections.sort(versions, new Comparator<TypeLibrary>() {
				public int compare(TypeLibrary o1, TypeLibrary o2) {
					return o1.version().compareTo(o2.version());
				}
			});
			if (!versions.isEmpty()) {
				return text
						+ " ["
						+ versions.get(versions.size() - 1).version()
								.toString() + "]";
			}
		}
		return null;
	}

	public Image decorateImage(Image image, Object element) {
		return null;
	}
}
