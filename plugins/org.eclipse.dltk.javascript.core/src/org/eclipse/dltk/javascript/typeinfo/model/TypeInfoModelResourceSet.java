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

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.dltk.compiler.CharOperation;
import org.eclipse.dltk.javascript.typeinfo.TypeUtil;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class TypeInfoModelResourceSet extends ResourceSetImpl {

	public TypeInfoModelResourceSet() {
		setURIResourceMap(new HashMap<URI, Resource>());
	}

	@Override
	public EObject getEObject(URI uri, boolean loadOnDemand) {
		if (TypeUtil.isTypeProxy(uri)) {
			final String typeName = URI.decode(uri.fragment());
			final Type type = resolveType(typeName);
			if (type != null) {
				return type;
			}
			return null;
		}
		return super.getEObject(uri, loadOnDemand);
	}

	protected Type resolveType(final String typeName) {
		return getType(typeName, true);
	}

	/**
	 * Returns the copy of the resource list to avoid
	 * ConcurrentModificationException.
	 * 
	 * @return
	 */
	protected Resource[] resources() {
		final EList<Resource> resources = getResources();
		return resources.toArray(new Resource[resources.size()]);
	}

	public Type getType(String typeName, boolean all) {
		for (Resource resource : resources()) {
			for (EObject object : resource.getContents()) {
				if (object instanceof Type) {
					final Type type = (Type) object;
					if ((all || type.isVisible())
							&& typeName.equals(type.getName())) {
						return type;
					}
				}
			}
		}
		return null;
	}

	public Type getTypeLiteral(String name) {
		for (Resource resource : resources()) {
			for (EObject object : resource.getContents()) {
				if (object instanceof TypeLiteral) {
					final TypeLiteral literal = (TypeLiteral) object;
					final Type type = literal.getTarget();
					if (type == null)
						continue;
					final String n = literal.getName() != null ? literal
							.getName() : type.getName();
					if (name.equals(n)) {
						return type;
					}
				}
			}
		}
		return null;
	}

	public Set<String> listTypes(String prefix) {
		Set<String> result = new HashSet<String>();
		for (Resource resource : resources()) {
			for (EObject object : resource.getContents()) {
				if (object instanceof Type) {
					final Type type = (Type) object;
					if (type.isVisible()
							&& CharOperation.prefixEquals(prefix,
									type.getName())) {
						result.add(type.getName());
					}
				}
			}
		}
		return result;
	}

	public Set<String> listTypeLiterals(String prefix) {
		Set<String> result = new HashSet<String>();
		for (Resource resource : resources()) {
			for (EObject object : resource.getContents()) {
				if (object instanceof TypeLiteral) {
					final TypeLiteral literal = (TypeLiteral) object;
					final Type type = literal.getTarget();
					if (type == null)
						continue;
					final String name = literal.getName() != null ? literal
							.getName() : type.getName();
					if (CharOperation.prefixEquals(prefix, name)) {
						result.add(name);
					}
				}
			}
		}
		return result;
	}

}
