/*******************************************************************************
 * Copyright (c) 2011 NumberFour AG
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     NumberFour AG - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.typeinfo.model;

import org.eclipse.dltk.javascript.typeinfo.TypeUtil;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class TypeInfoModelResourceSet extends ResourceSetImpl {

	@Override
	public EObject getEObject(URI uri, boolean loadOnDemand) {
		if (TypeUtil.isTypeProxy(uri)) {
			final String typeName = URI.decode(uri.fragment());
			final Type type = getType(typeName);
			if (type != null) {
				return type;
			}
			return null;
		}
		return super.getEObject(uri, loadOnDemand);
	}

	/**
	 * Returns the copy of the resource list to avoid
	 * ConcurrentModificationException.
	 * 
	 * @return
	 */
	Resource[] resources() {
		final EList<Resource> resources = getResources();
		return resources.toArray(new Resource[resources.size()]);
	}

	Type getType(String typeName) {
		for (Resource resource : resources()) {
			for (EObject object : resource.getContents()) {
				if (object instanceof Type) {
					final Type type = (Type) object;
					if (type.isVisible() && typeName.equals(type.getName())) {
						return type;
					}
				}
			}
		}
		return null;
	}
}
