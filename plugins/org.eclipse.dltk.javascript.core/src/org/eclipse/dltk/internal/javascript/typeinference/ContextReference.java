/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
/**
 * 
 */
package org.eclipse.dltk.internal.javascript.typeinference;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.dltk.core.IModelElement;

public final class ContextReference implements IReference {

	private final HostCollection function;
	private final String key;
	private boolean local;
	private IReferenceLocation location;

	ContextReference(HostCollection function, String key) {
		this.function = function;
		this.key = key;
	}

	public IReference getChild(String key, boolean resolveLocals) {
		return function.getReference(key);
	}

	public Set<IReference> getChilds(boolean resolveLocals) {
		if (!resolveLocals)
			return Collections.emptySet();
		Set<IReference> hashSet = new HashSet<IReference>(function
				.getReferences().values());
		hashSet.remove(this);
		return hashSet;
	}

	public String getName() {
		return key;
	}

	public IReference getPrototype(boolean resolveLocals) {
		return getChild("prototype", resolveLocals);
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

	public IReferenceLocation getLocation() {
		return location;
	}

	public void setLocationInformation(IReferenceLocation location) {
		this.location = location;
	}

	public boolean isFunctionRef() {
		return true;
	}

	public boolean isLocal() {
		return this.local;
	}

	public void setLocal(boolean local) {
		this.local = local;
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "[" + key + "]";
	}
}
