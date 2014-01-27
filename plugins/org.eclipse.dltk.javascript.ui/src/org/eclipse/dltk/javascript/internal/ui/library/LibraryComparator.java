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

import org.eclipse.jface.viewers.Viewer;
import org.eclipse.jface.viewers.ViewerComparator;

class LibraryComparator extends ViewerComparator {

	@Override
	public int compare(Viewer viewer, Object e1, Object e2) {
		if (e1 instanceof LibVersion && e2 instanceof LibVersion) {
			final LibVersion v1 = (LibVersion) e1;
			final LibVersion v2 = (LibVersion) e2;
			return v1.library.version().compareTo(v2.library.version());
		}
		return super.compare(viewer, e1, e2);
	}
}
