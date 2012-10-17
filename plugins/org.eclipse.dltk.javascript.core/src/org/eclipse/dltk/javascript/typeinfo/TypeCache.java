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
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.Assert;
import org.eclipse.dltk.annotations.Internal;
import org.eclipse.dltk.compiler.CharOperation;
import org.eclipse.dltk.javascript.typeinfo.model.SimpleType;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelLoader;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * TypeCache abstract implementation
 */
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

	/**
	 * Adds the specified type to the specified bucket within the cache.
	 * Internal method to be called from {@link #createType(String)}.
	 * 
	 * @param bucket
	 * @param type
	 * @return
	 */
	protected Type addType(String bucket, Type type) {
		Assert.isLegal(type.eResource() == null);
		Assert.isLegal(!type.eIsProxy());
		final TypeCacheResource resource = getResource(bucket, true);
		synchronized (resource) {
			final String name = type.getName();
			final Type previous = resource.types.get(name);
			if (previous != null) {
				return previous;
			}
			resource.types.put(name, type);
			resource.getContents().add(type);
		}
		return type;
	}

	static class ThreadState {
		int activeOperations;
	}

	private final ThreadLocal<ThreadState> threads = new ThreadLocal<ThreadState>() {
		protected ThreadState initialValue() {
			return new ThreadState();
		}
	};

	private TypeCacheResource getResource(String bucket, boolean loadOnDemand) {
		synchronized (resourceSet) {
			return (TypeCacheResource) resourceSet.getResource(getURI(bucket),
					loadOnDemand);
		}
	}

	/**
	 * Finds the specified type in the cache. If type is not cached in the cache
	 * yet, then the {@link #createType(String)} is called to create the entry.
	 * 
	 * @param typeName
	 * @return
	 */
	public Type findType(String context, String typeName) {
		final TypeCacheResource resource = getResource(context, false);
		if (resource != null) {
			synchronized (resource) {
				final Type type = resource.types.get(typeName);
				if (type != null) {
					return type;
				}
			}
		}
		final ThreadState state = threads.get();
		++state.activeOperations;
		try {
			final String[] accessible = getAccessibleBuckets(context);
			for (String ac : accessible) {
				final TypeCacheResource ar = getResource(ac, false);
				if (ar != null) {
					synchronized (ar) {
						final Type type = ar.types.get(typeName);
						if (type != null) {
							return type;
						}
					}
				}
			}
			return createType(context, typeName);
		} finally {
			--state.activeOperations;
		}
	}

	/**
	 * Returns all the buckets accessible from the specified context.
	 * 
	 * @param context
	 * @return
	 */
	protected String[] getAccessibleBuckets(String context) {
		return CharOperation.NO_STRINGS;
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
	protected abstract Type createType(String context, String typeName);

	/**
	 * For the internal usage within {@link #createType(String)}
	 * 
	 * @param typeName
	 * @return
	 */
	protected final Type getType(String context, String typeName) {
		return getType(context, typeName, false);
	}

	/**
	 * For the internal usage within {@link #createType(String)}
	 * 
	 * @param typeName
	 * @return
	 */
	@Internal
	Type getType(String context, String typeName, boolean force) {
		Type type = TypeInfoModelLoader.getInstance().getType(typeName);
		if (type != null) {
			return type;
		}
		TypeCacheResource resource = getResource(context, false);
		if (resource != null) {
			synchronized (resource) {
				type = resource.types.get(typeName);
				if (type != null) {
					return type;
				}
			}
		}
		final ThreadState state = threads.get();
		if (!force && state.activeOperations != 0) {
			return TypeUtil.createProxy(typeName);
		}
		++state.activeOperations;
		try {
			final String[] accessible = getAccessibleBuckets(context);
			for (String bucket : accessible) {
				resource = getResource(bucket, false);
				if (resource != null) {
					synchronized (resource) {
						type = resource.types.get(typeName);
						if (type != null) {
							return type;
						}
					}
				}
			}
			return createType(context, typeName);
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
	protected SimpleType getTypeRef(String context, String typeName) {
		return TypeUtil.ref(getType(context, typeName));
	}

	/**
	 * Returns the resource URI for the specified cache bucket.
	 * 
	 * @param bucket
	 * @return
	 */
	private URI getURI(String bucket) {
		if (bucket == null || bucket.length() == 0) {
			return baseURI;
		} else {
			// TODO (alex) cache URIs?
			return baseURI.appendSegment(bucket);
		}
	}

	/**
	 * Tests if one URI is a prefix of another.
	 * 
	 * @param base
	 * @param uri
	 * @return
	 */
	private static boolean isPrefixOf(URI base, URI uri) {
		int segmentCount;
		if (uri.isHierarchical() && base.scheme().equals(uri.scheme())
				&& base.authority().equals(uri.authority())
				&& (segmentCount = base.segmentCount()) <= uri.segmentCount()) {
			for (int i = 0; i < segmentCount; ++i) {
				if (!base.segment(i).equals(uri.segment(i)))
					return false;
			}
			return true;
		}
		return false;
	}

	/**
	 * Returns the cache bucket of the specified resource.
	 * 
	 * @param resourceContext
	 * @return
	 */
	@Internal
	String getContextOf(Resource resourceContext) {
		final URI uri = resourceContext.getURI();
		if (uri != null && isPrefixOf(baseURI, uri)) {
			if (baseURI.segmentCount() == uri.segmentCount()) {
				return "";
			} else {
				return uri.segment(baseURI.segmentCount());
			}
		}
		return null;
	}

	/**
	 * Clears the cache
	 */
	public void clear() {
		synchronized (resourceSet) {
			final EList<Resource> resources = resourceSet.getResources();
			for (Resource resource : resources) {
				synchronized (resource) {
					resource.unload();
				}
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
		final TypeCacheResource resource;
		synchronized (resourceSet) {
			resource = getResource(bucket, false);
		}
		if (resource != null) {
			synchronized (resource) {
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
				return cache.getType(cache.getContextOf(resourceContext),
						URI.decode(uri.fragment()), true);
			} else {
				return EcoreUtil.resolve(proxy, this);
			}
		}
	}

	private static class TypeCacheResource extends ResourceImpl {

		public TypeCacheResource(URI uri) {
			super(uri);
		}

		final Map<String, Type> types = new HashMap<String, Type>();

		@Override
		public String toString() {
			return getClass().getSimpleName() + '@'
					+ Integer.toHexString(hashCode()) + "@" + uri;
		}

		@Override
		protected void doUnload() {
			types.clear();
			super.doUnload();
		}

		/**
		 * This method is overridden to return only direct contents of the list
		 * (i.e. types). We are not interested in making proxies out of
		 * properties and methods. Other callers of this method are not used
		 * here.
		 */
		@Override
		protected TreeIterator<EObject> getAllProperContents(
				List<EObject> contents) {
			return new ForwardingTreeIterator<EObject>(contents.iterator());
		}
	}

	private static class ForwardingTreeIterator<E> implements TreeIterator<E> {
		private final Iterator<E> delegate;

		public ForwardingTreeIterator(Iterator<E> delegate) {
			this.delegate = delegate;
		}

		public boolean hasNext() {
			return delegate.hasNext();
		}

		public E next() {
			return delegate.next();
		}

		public void remove() {
			delegate.remove();
		}

		public void prune() {
		}
	}

}
