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
import java.util.Iterator;
import java.util.Map;

import org.eclipse.core.runtime.Assert;
import org.eclipse.dltk.javascript.typeinfo.model.SimpleType;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelLoader;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

public abstract class TypeCache {

	private final URI baseURI;
	private final TypeCacheResourceSet resourceSet;

	public TypeCache(String scheme, String authority) {
		this(URI.createHierarchicalURI(scheme, authority, null, null, null));
	}

	public TypeCache(URI baseURI) {
		Assert.isLegal(baseURI.isHierarchical(),
				"TypeCache baseURI must be hierarchical");
		this.baseURI = baseURI;
		this.resourceSet = new TypeCacheResourceSet(this);
	}

	public static class CacheEntry {
		final String bucket;
		final Type type;

		CacheEntry(String bucket, Type type) {
			this.bucket = bucket;
			this.type = type;
		}
	}

	private final Map<String, CacheEntry> map = new HashMap<String, CacheEntry>();

	/**
	 * Adds the specified type to the specified bucket within the cache. To be
	 * called from {@link #createType(String)}.
	 * 
	 * @param bucket
	 * @param type
	 * @return
	 */
	protected CacheEntry addType(String bucket, Type type) {
		if (bucket == null) {
			bucket = "";
		}
		Assert.isLegal(type.eResource() == null);
		Assert.isLegal(!type.eIsProxy());
		final String name = type.getName();
		synchronized (map) {
			CacheEntry entry = map.get(name);
			if (entry != null) {
				if (!bucket.equals(entry.bucket)) {
					throw new IllegalStateException(
							"Type cache bucket changed for " + name);
				}
				return entry;
			}
			entry = new CacheEntry(bucket, type);
			map.put(name, entry);
			resourceSet.getResource(getURI(bucket), true).getContents()
					.add(type);
			return entry;
		}
	}

	static class ThreadState {
		int activeOperations;
	}

	private final ThreadLocal<ThreadState> threads = new ThreadLocal<ThreadState>() {
		protected ThreadState initialValue() {
			return new ThreadState();
		}
	};

	/**
	 * Finds the specified type in the cache. If type is not cached in the cache
	 * yet, then the {@link #createType(String)} is called to create the entry.
	 * 
	 * @param typeName
	 * @return
	 */
	public Type findType(String typeName) {
		CacheEntry entry;
		synchronized (map) {
			entry = map.get(typeName);
		}
		if (entry != null) {
			return entry.type;
		}
		final ThreadState state = threads.get();
		++state.activeOperations;
		try {
			entry = createType(typeName);
		} finally {
			--state.activeOperations;
		}
		return entry != null ? entry.type : null;
		// TODO (alex) cache negative result?
	}

	/**
	 * Creates the specified type. Should create the type, call
	 * {@link #addType(String, Type)} with it and return the result. If it needs
	 * other types, then should call {@link #getType(String)} and
	 * {@link #getTypeRef(String)}.
	 * 
	 * @param typeName
	 * @return
	 */
	protected abstract CacheEntry createType(String typeName);

	/**
	 * For the internal usage within {@link #createType(String)}
	 * 
	 * @param typeName
	 * @return
	 */
	protected Type getType(String typeName) {
		final Type type = TypeInfoModelLoader.getInstance().getType(typeName);
		if (type != null) {
			return type;
		}
		CacheEntry entry;
		synchronized (map) {
			entry = map.get(typeName);
		}
		if (entry != null) {
			return entry.type;
		}
		final ThreadState state = threads.get();
		if (state.activeOperations != 0) {
			return TypeUtil.createProxy(typeName);
		}
		++state.activeOperations;
		try {
			entry = createType(typeName);
			return entry != null ? entry.type : null;
		} finally {
			--state.activeOperations;
		}
	}

	/**
	 * For the internal usage within {@link #createType(String)}
	 * 
	 * @param typeName
	 * @return
	 */
	protected SimpleType getTypeRef(String typeName) {
		return TypeUtil.ref(getType(typeName));
	}

	private URI getURI(String bucket) {
		if (bucket == null || bucket.length() == 0) {
			return baseURI;
		} else {
			// TODO (alex) cache URIs?
			return baseURI.appendSegment(bucket);
		}
	}

	/**
	 * Clears the cache
	 */
	public void clear() {
		synchronized (map) {
			map.clear();
			final EList<Resource> resources = resourceSet.getResources();
			for (Resource resource : resources) {
				resource.unload();
			}
			resources.clear();
		}
	}

	/**
	 * Clears the specified bucket of the cache
	 * 
	 * @param bucket
	 */
	public void clear(String bucket) {
		if (bucket == null) {
			bucket = "";
		}
		synchronized (map) {
			for (Iterator<Map.Entry<String, CacheEntry>> i = map.entrySet()
					.iterator(); i.hasNext();) {
				final Map.Entry<String, CacheEntry> entry = i.next();
				if (bucket.equals(entry.getValue().bucket)) {
					i.remove();
				}
			}
			final Resource resource = resourceSet.getResource(getURI(bucket),
					false);
			if (resource != null) {
				resource.unload();
			}
		}
	}

	private static class TypeCacheResourceSet extends ResourceSetImpl implements
			TypeInfoResourceSet {

		private final TypeCache cache;

		public TypeCacheResourceSet(TypeCache cache) {
			super();
			this.cache = cache;
			setURIResourceMap(new HashMap<URI, Resource>());
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
			final URI uri = proxy.eProxyURI();
			if (TypeUtil.isTypeProxy(uri)) {
				return cache.getType(URI.decode(uri.fragment()));
			} else {
				return EcoreUtil.resolve(proxy, this);
			}
		}
	}

	private static class TypeCacheResource extends ResourceImpl {

		public TypeCacheResource(URI uri) {
			super(uri);
		}

		@Override
		public String toString() {
			return getClass().getSimpleName() + '@'
					+ Integer.toHexString(hashCode()) + "@" + uri;
		}

	}

}
