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
package org.eclipse.dltk.internal.javascript.typeinference;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Set;

import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.internal.core.ModelElement;
import org.eclipse.dltk.internal.javascript.reference.resolvers.ReferenceResolverContext;

import com.xored.org.mozilla.javascript.Node;

class TransparentRef implements IReference {

	private final TypeInferencer typeInferencer;

	IReference evaluateReference;

	private final String fieldId;
	private final Node node;

	ReferenceResolverContext cs;

	private boolean recursive = false;

	TransparentRef(TypeInferencer typeInferencer, IReference evaluateReference,
			Node objID, String fieldId, ModelElement parent,
			ReferenceResolverContext cs) {
		this.typeInferencer = typeInferencer;
		this.evaluateReference = evaluateReference;
		this.fieldId = fieldId;
		this.node = objID;
		this.parent = parent;
		this.cs = cs;
	}

	public IReference getChild(String key, boolean resolveLocals) {
		if (recursive)
			return null;
		try {
			recursive = true;
			IReference child = evaluateReference.getChild(key, resolveLocals);
			return child;
		} finally {
			recursive = false;
		}
	}

	public Set<IReference> getChilds(boolean resolveLocals) {
		if (recursive)
			return Collections.emptySet();
		try {
			recursive = true;
			return evaluateReference.getChilds(resolveLocals);
		} finally {
			recursive = false;
		}
	}

	public String getName() {
		return fieldId;
	}

	public String getParentName() {
		return fieldId;
	}

	public void setChild(String key, IReference ref) {
		if (recursive)
			return;
		try {
			recursive = true;
			evaluateReference.setChild(key, ref);
		} finally {
			recursive = false;
		}
	}

	public boolean isChildishReference() {
		return false;
	}

	ModelElement parent;

	public void patchRef(HostCollection collection) {
		if (recursive)
			return;
		try {
			recursive = true;
			Set s = evaluateReference.getChilds(false);
			IReference queryElement = this.typeInferencer.internalEvaluate(
					collection, getName(), node, parent, cs);

			if (queryElement != null && queryElement != this) {
				// make sure that this doesn't become a transparent to a
				// transparent
				// (because then circular references can happen)
				// just point to the real reference.
				while (queryElement instanceof TransparentRef) {
					queryElement = ((TransparentRef) queryElement).evaluateReference;
				}
				if (!(queryElement instanceof CombinedOrReference && ((CombinedOrReference) queryElement)
						.testContains(this))) {
					this.evaluateReference = queryElement;
				}
			}
			Iterator it = s.iterator();
			// TODO REVIEW IT;
			while (it.hasNext()) {
				Object next = it.next();
				if (!(next instanceof IReference))
					continue;
				IReference r = (IReference) next;
				evaluateReference.setChild(r.getName(), r);
			}
		} finally {
			recursive = false;
		}
	}

	public void recordDelete(String fieldId) {
		if (recursive)
			return;
		try {
			recursive = true;
			evaluateReference.recordDelete(fieldId);
		} finally {
			recursive = false;
		}
	}

	public IReference getPrototype(boolean resolveLocals) {
		if (recursive)
			return null;
		try {
			recursive = true;
			return evaluateReference.getPrototype(false);
		} finally {
			recursive = false;
		}
	}

	public void setPrototype(IReference ref) {
		if (recursive)
			return;
		try {
			recursive = true;
			evaluateReference.setPrototype(ref);
		} finally {
			recursive = false;
		}
	}

	int length;
	int location;

	public void addModelElements(Collection<IModelElement> toAdd) {
		if (parent != null)
			toAdd.add(new FakeField(parent, getName(), location, length));
	}

	public void setLocationInformation(ModelElement mo, int position, int length) {
		this.parent = mo;
		this.location = position;
		this.length = length;
	}

	public boolean isFunctionRef() {
		if (recursive)
			return false;
		try {
			recursive = true;
			return evaluateReference.isFunctionRef();
		} finally {
			recursive = false;
		}
	}

	public boolean isLocal() {
		if (recursive)
			return false;
		try {
			recursive = true;
			return evaluateReference.isLocal();
		} finally {
			recursive = false;
		}
	}

	public void setLocal(boolean local) {
		if (recursive)
			return;
		try {
			recursive = true;
			evaluateReference.setLocal(local);
		} finally {
			recursive = false;
		}
	}

}
