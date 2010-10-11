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
package org.eclipse.dltk.javascript.typeinfo;

import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.ISourceModule;

public class ReferenceSource {

	public static final ReferenceSource UNKNOWN = new ReferenceSource(null) {
		@Override
		public String toString() {
			return "UNKNOWN";
		}
	};

	private final IModelElement modelElement;

	public ReferenceSource(IModelElement modelElement) {
		this.modelElement = modelElement;
	}

	public IModelElement getModelElement() {
		return modelElement;
	}

	public ISourceModule getSourceModule() {
		return modelElement instanceof ISourceModule ? (ISourceModule) modelElement
				: null;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}

}
