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
import org.eclipse.dltk.ui.DLTKPluginImages;
import org.eclipse.jface.viewers.DelegatingStyledCellLabelProvider.IStyledLabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.StyledString;
import org.eclipse.swt.graphics.Image;

class LibraryLabelProvider extends LabelProvider implements
		IStyledLabelProvider {

	@Override
	public String getText(Object element) {
		if (element instanceof LibName) {
			return ((LibName) element).name;
		} else if (element instanceof LibVersion) {
			return ((LibVersion) element).library.version().toString();
		} else if (element instanceof TypeLibrary) {
			final TypeLibrary library = (TypeLibrary) element;
			// TODO (alex) compact output for contributed libs
			return library.getFile().toString();
		} else {
			return super.getText(element);
		}
	}

	@Override
	public Image getImage(Object element) {
		if (element instanceof LibName) {
			return DLTKPluginImages.get(DLTKPluginImages.IMG_OBJS_LIBRARY);
		} else if (element instanceof LibVersion) {
			return DLTKPluginImages.get(DLTKPluginImages.IMG_OBJS_CFILE);
		} else if (element instanceof TypeLibrary) {
			return DLTKPluginImages.get(DLTKPluginImages.IMG_OBJS_EXTJAR);
		} else {
			return super.getImage(element);
		}
	}

	public StyledString getStyledText(Object element) {
		return new StyledString(getText(element));
	}
}
