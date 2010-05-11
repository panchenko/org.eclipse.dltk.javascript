/*******************************************************************************
 * Copyright (c) 2010 xored software, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.ui.typeinfo;

import org.eclipse.dltk.javascript.internal.ui.JavaScriptUI;
import org.eclipse.dltk.javascript.typeinfo.model.Element;
import org.eclipse.dltk.utils.LazyExtensionManager;
import org.eclipse.jface.resource.ImageDescriptor;

public class ElementLabelProviderRegistry {

	private static final LazyExtensionManager<IElementLabelProvider> manager = new LazyExtensionManager<IElementLabelProvider>(
			JavaScriptUI.PLUGIN_ID + ".typeInfoLabelProvider");

	public static ImageDescriptor getImageDescriptor(Element element) {
		for (IElementLabelProvider provider : manager) {
			ImageDescriptor descriptor = provider.getImageDescriptor(element);
			if (descriptor != null) {
				return descriptor;
			}
		}
		return null;
	}
}
