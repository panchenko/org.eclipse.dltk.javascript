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

import org.eclipse.core.runtime.IPath;
import org.eclipse.dltk.core.IField;
import org.eclipse.dltk.core.IMember;
import org.eclipse.dltk.core.IMethod;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.internal.javascript.parser.JSModifiers;
import org.eclipse.dltk.javascript.internal.library.TypeLibraryProjectFragment;
import org.eclipse.dltk.ui.DLTKPluginImages;
import org.eclipse.dltk.ui.ScriptElementImageProvider;
import org.eclipse.dltk.ui.viewsupport.ImageDescriptorRegistry;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.BaseLabelProvider;
import org.eclipse.jface.viewers.DecorationOverlayIcon;
import org.eclipse.jface.viewers.IDecoration;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.swt.graphics.Image;

/**
 * @since 3.0
 */
public class JSModelLabelProvider extends BaseLabelProvider implements
		ILabelProvider {

	private final ImageDescriptorRegistry registry = new ImageDescriptorRegistry(
			false);

	public Image getImage(Object element) {
		if (element instanceof IMember) {
			final IMember method = (IMember) element;
			int flags;
			try {
				flags = method.getFlags();
			} catch (ModelException e) {
				flags = 0;
			}
			if ((flags & JSModifiers.DEPRECATED) != 0) {
				ImageDescriptor imageDescriptor = null;
				ImageDescriptor[] overlay = new ImageDescriptor[5];
				overlay[IDecoration.UNDERLAY] = DLTKPluginImages.DESC_OVR_DEPRECATED;
				if (element instanceof IMethod) {
					try {
						if (((IMethod) element).isConstructor()) {
							overlay[IDecoration.TOP_RIGHT] = DLTKPluginImages.DESC_OVR_CONSTRUCTOR;
						}
					} catch (ModelException e) {
					}
					imageDescriptor = ScriptElementImageProvider
							.getMethodImageDescriptor(flags);
				} else if (element instanceof IField) {
					imageDescriptor = ScriptElementImageProvider
							.getFieldImageDescriptor(flags);
				} else {
					imageDescriptor = ScriptElementImageProvider
							.getTypeImageDescriptor(flags, false);
				}
				return registry.get(new DecorationOverlayIcon(registry
						.get(imageDescriptor), overlay));
			}
		}
		return null;
	}

	public String getText(Object element) {
		if (element instanceof TypeLibraryProjectFragment) {
			final IPath path = ((TypeLibraryProjectFragment) element).getPath();
			return path.segment(1) + " " + path.segment(2);
		}
		return null;
	}

	@Override
	public void dispose() {
		registry.dispose();
		super.dispose();
	}

}
