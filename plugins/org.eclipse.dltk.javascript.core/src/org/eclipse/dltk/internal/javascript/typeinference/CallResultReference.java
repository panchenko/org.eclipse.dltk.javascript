/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.internal.javascript.typeinference;

import java.util.Set;

import org.eclipse.dltk.internal.javascript.reference.resolvers.ReferenceResolverContext;

public class CallResultReference extends AbstractCallResultReference {

	protected IReference root;

	public CallResultReference(HostCollection collection, String key,
			String id, ReferenceResolverContext cs) {
		super(key, id, cs);
		int pm = id.indexOf('.');
		if (pm != -1) {
			String root = id.substring(0, pm);
			this.root = collection.getReference(root);

		}
	}

	/**
	 * @see org.eclipse.dltk.internal.javascript.typeinference.AbstractCallResultReference#internalGetChilds(boolean)
	 */
	protected Set internalGetChilds(boolean resolveLocals) {
		if (root != null) {
			String id = getId();
			int index = id.indexOf(".");
			// skip the root itself.
			id = id.substring(index + 1);
			IReference child = root;
			index = id.indexOf(".");
			while (index != -1 && child != null) {
				String key = id.substring(0, index);
				child = child.getChild(key, resolveLocals);
				if (index == id.length())
					break;
				id = id.substring(index + 1);
				index = id.indexOf(".");
			}
			if (child != null) {
				child = child.getChild(id, resolveLocals);
				if (child != null) {
					return child.getChilds(resolveLocals);
				}
			}

		}
		return super.internalGetChilds(resolveLocals);
	}

	public IReference getRoot() {
		return root;
	}

	public String getResultId() {
		return "!!!returnValue";
	}

	public boolean isFunctionRef() {
		return false;
	}
}
