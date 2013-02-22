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

import org.eclipse.core.runtime.IAdaptable;
import org.eclipse.dltk.annotations.Internal;
import org.eclipse.dltk.annotations.NonNull;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.ISourceModule;

public abstract class ReferenceSource implements IAdaptable {

	@Internal
	static class Unknown extends ReferenceSource {
		@Override
		public IModelElement getModelElement() {
			return null;
		}

		@Override
		public ISourceModule getSourceModule() {
			return null;
		}

		@Override
		public String toString() {
			return "UNKNOWN";
		}
	}

	public static final ReferenceSource UNKNOWN = new Unknown();

	private static class ModelElementSource extends ReferenceSource {
		@NonNull
		private final IModelElement modelElement;

		public ModelElementSource(IModelElement modelElement) {
			this.modelElement = modelElement;
		}

		@Override
		public IModelElement getModelElement() {
			return modelElement;
		}

		@Override
		public ISourceModule getSourceModule() {
			return modelElement instanceof ISourceModule ? (ISourceModule) modelElement
					: null;
		}

		@Override
		public String toString() {
			return modelElement.getElementName();
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj) {
				return true;
			} else if (obj instanceof ModelElementSource) {
				return modelElement
						.equals(((ModelElementSource) obj).modelElement);
			} else {
				return false;
			}
		}
	}

	@Internal
	static class Dummy extends Unknown {
		@Override
		public String toString() {
			return "Dummy";
		}
	}

	/**
	 * Creates {@link ReferenceSource} for the specified {@link IModelElement}
	 * if not null or creates new dummy result.
	 */
	public static ReferenceSource create(IModelElement modelElement) {
		return modelElement != null ? new ModelElementSource(modelElement)
				: new Dummy();
	}

	public abstract IModelElement getModelElement();

	public abstract ISourceModule getSourceModule();

	public Object getAdapter(@SuppressWarnings("rawtypes") Class adapter) {
		if (adapter == ReferenceSource.class) {
			return this;
		} else {
			return null;
		}
	}

}
