/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.internal.javascript.typeinference;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.internal.javascript.reference.resolvers.IResolvableReference;
import org.eclipse.dltk.internal.javascript.reference.resolvers.ReferenceResolverContext;

public abstract class AbstractCallResultReference implements IReference,
		IDoNotReportChilds, IResolvableReference {

	public Set getChildsNoGlobalOp() {
		return hashSet == null ? new HashSet() : hashSet;
	}

	private final String id;
	private final String name;
	private final ReferenceResolverContext cs;

	private Set<IReference> hashSet = null;

	private boolean local;

	public IReference getChild(String key, boolean resolveLocals) {
		if (!resolveLocals)
			return null;
		if (hashSet == null)
			getChilds(resolveLocals);
		if (hashSet == null)
			return null;
		Iterator i = hashSet.iterator();
		while (i.hasNext()) {
			Object next = i.next();
			if (next instanceof IReference) {
				IReference r = (IReference) next;
				if (r.getName().equals(key))
					return r;
			} else if (next instanceof HostCollection) {
				HostCollection hc = (HostCollection) next;
				IReference reference = hc.getReference(key);
				if (reference != null) {
					return reference;
				}
			}
		}
		return null;
	}

	public IReference getPrototype(boolean resolveLocals) {
		return this.getChild("prototype", resolveLocals);
	}

	private static final Set<String> searchIds = new HashSet<String>();

	public Set<IReference> getChilds(boolean resolveLocals) {
		if (!resolveLocals)
			return Collections.emptySet();
		if (searchIds.contains(id))
			return Collections.emptySet();
		if (this.hashSet != null)
			return hashSet;
		try {
			searchIds.add(id);
			this.hashSet = internalGetChilds(resolveLocals);
		} finally {
			searchIds.remove(id);
		}
		return hashSet;
	}

	protected Set internalGetChilds(boolean resolveLocals) {

		return cs.resolveChilds(this);
	}

	public abstract String getResultId();

	public String getName() {
		return name;
	}

	public AbstractCallResultReference(String name, String id2,
			ReferenceResolverContext cs) {
		super();
		this.name = name;
		this.id = id2;
		this.cs = cs;
	}

	public boolean isChildishReference() {
		return false;
	}

	public void recordDelete(String fieldId) {
	}

	public void setChild(String key, IReference ref) {
	}

	public void setPrototype(IReference ref) {
	}

	public void addModelElements(Collection<IModelElement> toAdd) {

	}

	public void setLocationInformation(IReferenceLocation location) {

	}

	public String getId() {
		return id;
	}

	public boolean isLocal() {
		return local;
	}

	public void setLocal(boolean local) {
		this.local = local;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[" + name + "]";
	}
}
