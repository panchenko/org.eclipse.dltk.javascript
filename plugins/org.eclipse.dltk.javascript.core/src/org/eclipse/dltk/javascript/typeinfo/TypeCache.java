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
package org.eclipse.dltk.javascript.typeinfo;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.Assert;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

public class TypeCache {

	private final URI baseURI;
	private final TypeCacheResourceSet resourceSet;

	public TypeCache(String scheme, String authority) {
		this.baseURI = URI.createHierarchicalURI(scheme, authority, null, null,
				null);
		this.resourceSet = new TypeCacheResourceSet();
	}

	public Type addType(String bucket, Type type) {
		Assert.isLegal(type.eResource() == null);
		Assert.isLegal(!type.eIsProxy());
		final Resource resource = resourceSet.getResource(getURI(bucket), true);
		return ((TypeCacheResource) resource).addType(type);
	}

	public Type getType(String bucket, String typeName) {
		final Resource resource = resourceSet
				.getResource(getURI(bucket), false);
		if (resource != null) {
			return ((TypeCacheResource) resource).findType(typeName);
		} else {
			return null;
		}
	}

	public void clear(String bucket) {
		final Resource resource = resourceSet
				.getResource(getURI(bucket), false);
		if (resource != null) {
			((TypeCacheResource) resource).clear();
		}
	}

	private URI getURI(String bucket) {
		if (bucket == null || bucket.length() == 0) {
			return baseURI;
		} else {
			// TODO (alex) cache URIs?
			return baseURI.appendSegment(bucket);
		}
	}

	public void clear() {
		resourceSet.clear();
	}

	private static class TypeCacheResourceSet extends ResourceSetImpl implements
			TypeInfoResourceSet {

		public TypeCacheResourceSet() {
			super();
			setURIResourceMap(new HashMap<URI, Resource>());
		}

		public synchronized void clear() {
			final EList<Resource> resources = getResources();
			for (Resource resource : resources) {
				((TypeCacheResource) resource).unload();
			}
			resources.clear();
		}

		@Override
		public synchronized Resource getResource(URI uri, boolean loadOnDemand) {
			return super.getResource(uri, loadOnDemand);
		}

		@Override
		public Resource createResource(URI uri, String contentType) {
			final TypeCacheResource resource = new TypeCacheResource(uri);
			getResources().add(resource);
			return resource;
		}

		@Override
		protected void demandLoadHelper(Resource resource) {
			resource.getContents().clear(); // set the loaded flag.
		}

		public EObject resolve(InternalEObject proxy, EObject objectContext,
				Resource resourceContext) {
			System.out.println("resolve " + proxy + " from " + resourceContext);
			// TODO Auto-generated method stub
			return null;
		}

	}

	private static class TypeCacheResource extends ResourceImpl {

		private final Map<String, Type> map = new HashMap<String, Type>();

		public TypeCacheResource(URI uri) {
			super(uri);
		}

		public synchronized Type addType(Type type) {
			final Type previous = map.get(type.getName());
			if (previous != null) {
				return previous;
			}
			map.put(type.getName(), type);
			getContents().add(type);
			return type;
		}

		public synchronized Type findType(String typeName) {
			return map.get(typeName);
		}

		public synchronized void clear() {
			unload();
			map.clear();
		}

		@Override
		public String toString() {
			return getClass().getSimpleName() + '@'
					+ Integer.toHexString(hashCode()) + "@" + uri;
		}

	}

}
