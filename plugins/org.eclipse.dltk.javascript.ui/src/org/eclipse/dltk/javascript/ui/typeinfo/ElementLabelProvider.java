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
package org.eclipse.dltk.javascript.ui.typeinfo;

import org.eclipse.dltk.ast.Modifiers;
import org.eclipse.dltk.javascript.typeinfo.model.Element;
import org.eclipse.dltk.javascript.typeinfo.model.Member;
import org.eclipse.dltk.javascript.typeinfo.model.Method;
import org.eclipse.dltk.javascript.typeinfo.model.Property;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.ui.typeinfo.IElementLabelProvider.Mode;
import org.eclipse.dltk.ui.ScriptElementImageDescriptor;
import org.eclipse.dltk.ui.ScriptElementImageProvider;
import org.eclipse.dltk.ui.viewsupport.ImageDescriptorRegistry;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.ILabelProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.swt.graphics.Image;

/**
 * {@link ILabelProvider} implementation for {@link Element}s, supporting
 * delegation to the contributed {@link IElementLabelProvider}s.
 */
public final class ElementLabelProvider extends LabelProvider {

	private final ImageDescriptorRegistry registry = new ImageDescriptorRegistry(
			false);

	@Override
	public String getText(Object element) {
		if (element instanceof Element) {
			final Element el = (Element) element;
			final String label = ElementLabelProviderRegistry.getLabel(el,
					Mode.TITLE);
			if (label != null) {
				return label;
			}
			return el.getName();
		}
		return super.getText(element);
	}

	@Override
	public Image getImage(Object element) {
		if (element instanceof Element) {
			final Element el = (Element) element;
			final ImageDescriptor descriptor = ElementLabelProviderRegistry
					.getImageDescriptor(el);
			if (descriptor != null) {
				return registry.get(descriptor);
			}
			final ImageDescriptor desc;
			if (element instanceof Type) {
				desc = ScriptElementImageProvider.getTypeImageDescriptor(
						Modifiers.AccDefault, false);
			} else if (element instanceof Member) {
				final int flags = ((Member) element).getVisibility().getFlags();
				if (element instanceof Property) {
					desc = ScriptElementImageProvider
							.getFieldImageDescriptor(flags);
				} else {
					assert element instanceof Method;
					desc = ScriptElementImageProvider
							.getMethodImageDescriptor(flags);
				}
			} else {
				desc = ImageDescriptor.getMissingImageDescriptor();
			}
			return registry.get(decorateImageDescriptor(desc, el));
		}
		return super.getImage(element);
	}

	protected ImageDescriptor decorateImageDescriptor(
			ImageDescriptor descriptor, Element element) {
		if (element.isDeprecated()) {
			return new ScriptElementImageDescriptor(descriptor,
					ScriptElementImageDescriptor.DEPRECATED,
					ScriptElementImageProvider.SMALL_SIZE);
		} else if (element instanceof Member && ((Member) element).isStatic()) {
			return new ScriptElementImageDescriptor(descriptor,
					ScriptElementImageDescriptor.STATIC,
					ScriptElementImageProvider.SMALL_SIZE);
		} else {
			return descriptor;
		}
	}

	@Override
	public void dispose() {
		registry.dispose();
		super.dispose();
	}
}
