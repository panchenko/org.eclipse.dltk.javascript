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
package org.eclipse.dltk.javascript.internal.ui;

import org.eclipse.dltk.core.IMethod;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.internal.javascript.parser.JSModifiers;
import org.eclipse.dltk.ui.DLTKPluginImages;
import org.eclipse.dltk.ui.ScriptElementImageProvider;
import org.eclipse.dltk.ui.viewsupport.ImageDescriptorRegistry;
import org.eclipse.jface.viewers.BaseLabelProvider;
import org.eclipse.jface.viewers.DecorationOverlayIcon;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.Image;

public class JSModelLabelProvider extends BaseLabelProvider implements
		ILabelProvider {

	private final ImageDescriptorRegistry registry = new ImageDescriptorRegistry();

	public Image getImage(Object element) {
		if (element instanceof IMethod) {
			final IMethod method = (IMethod) element;
			int flags;
			try {
				flags = method.getFlags();
			} catch (ModelException e) {
				flags = 0;
			}
			if ((flags & JSModifiers.DEPRECATED) != 0) {
				return registry.get(new DecorationOverlayIcon(
						ScriptElementImageProvider.getMethodImageDescriptor(
								flags).createImage(),
						DLTKPluginImages.DESC_OVR_DEPRECATED,
						IDecoration.UNDERLAY));
			}
		}
		return null;
	}

	public String getText(Object element) {
		return null;
	}

	@Override
	public void dispose() {
		registry.dispose();
		super.dispose();
	}

}
