/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.internal.javascript.reference.resolvers;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.internal.javascript.typeinference.HostCollection;
import org.eclipse.dltk.internal.javascript.typeinference.IReference;

public final class ReferenceResolverContext {

	protected final List<IReferenceResolver> resolvers = new ArrayList<IReferenceResolver>();

	protected final ISourceModule module;

	protected final Map<?, ?> settings;

	public ReferenceResolverContext(ISourceModule module, Map<?, ?> settings) {
		super();
		this.module = module;
		this.settings = settings;
	}

	public ISourceModule getModule() {
		return module;
	}

	public Map<?, ?> getOptions() {
		return settings;
	}

	public boolean resolveLocals() {
		return false;
	}

	public Set resolveGlobals(String id) {
		TreeSet sm = new TreeSet(new Comparator() {

			public int compare(Object o1, Object o2) {
				if (o1 instanceof IReference && o2 instanceof IReference) {
					return ((IReference) o1).getName().compareToIgnoreCase(
							((IReference) o2).getName());
				}
				if (o1 instanceof IModelElement && o2 instanceof IReference) {
					return ((IModelElement) o1).getElementName()
							.compareToIgnoreCase(((IReference) o2).getName());
				}
				if (o1 instanceof IReference && o2 instanceof IModelElement) {
					return ((IReference) o1).getName().compareToIgnoreCase(
							((IModelElement) o2).getElementName());
				}
				return 0;
			}
		});
		for (int a = 0; a < resolvers.size(); a++) {
			IReferenceResolver res = resolvers.get(a);
			Set result = res.resolveGlobals(id);

			Iterator it = result.iterator();
			while (it.hasNext()) {
				sm.remove(it.next());
			}

			// this really looks like a bug in java!
			// above behaves differently then below!
			// sm.removeAll(result);

			sm.addAll(result);
		}
		return sm;
	}

	public void init() {
		for (IReferenceResolver res : resolvers) {
			res.init(this);
		}
	}

	public Set<IReference> resolveChilds(
			IResolvableReference abstractCallResultReference) {
		for (int a = 0; a < resolvers.size(); a++) {
			IReferenceResolver res = resolvers.get(a);
			Set<IReference> result = res.getChilds(abstractCallResultReference);
			if (result != null && !result.isEmpty()) {
				return result;
			}
		}
		return Collections.emptySet();
	}

	public void processCall(String call, String objId) {
		for (int a = 0; a < resolvers.size(); a++) {
			IReferenceResolver res = resolvers.get(a);
			res.processCall(call, objId);
		}
	}

	private HostCollection collection;

	public HostCollection getHostCollection() {
		return collection;
	}

	public void setHostCollection(HostCollection collection) {
		this.collection = collection;
	}
}
