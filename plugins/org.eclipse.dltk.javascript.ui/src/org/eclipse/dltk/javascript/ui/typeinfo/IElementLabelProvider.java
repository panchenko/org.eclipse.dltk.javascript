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

import org.eclipse.dltk.javascript.typeinfo.model.Element;
import org.eclipse.jface.resource.ImageDescriptor;

public interface IElementLabelProvider {
	public enum Mode {
		PROPOSAL, TITLE
	}

	String getLabel(Element element, Mode mode);

	ImageDescriptor getImageDescriptor(Element element);

}
