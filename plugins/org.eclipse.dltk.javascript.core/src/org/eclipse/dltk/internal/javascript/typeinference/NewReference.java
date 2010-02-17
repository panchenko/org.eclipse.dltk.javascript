/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.internal.javascript.typeinference;

import java.util.Collections;
import java.util.Set;

import org.eclipse.dltk.internal.javascript.reference.resolvers.ReferenceResolverContext;

public class NewReference extends AbstractCallResultReference {

	public NewReference(String name, String globalName,
			ReferenceResolverContext cs) {
		super(name, globalName, cs);
	}

	public String getResultId() {
		return "this";
	}

	public boolean isFunctionRef() {
		return false;
	}

	public Set<String> getTypes() {
		return Collections.singleton(getId());
	}

	/**
	 * @see org.eclipse.dltk.internal.javascript.typeinference.AbstractCallResultReference#internalGetChilds(boolean)
	 */
	protected Set internalGetChilds(boolean resolveLocals) {
		if (ReferenceFactory.STRING.equals(getId())) {
			return ReferenceFactory.createStringReference(
					ReferenceFactory.STRING).getChilds(resolveLocals);
		} else if (ReferenceFactory.DATE.equals(getId())) {
			return ReferenceFactory.createDateReference(ReferenceFactory.DATE)
					.getChilds(resolveLocals);
		} else if (ReferenceFactory.ARRAY.equals(getId())) {
			return ReferenceFactory
					.createArrayReference(ReferenceFactory.ARRAY).getChilds(
							resolveLocals);
		} else if (ReferenceFactory.NUMBER.equals(getId())) {
			return ReferenceFactory.createNumberReference(
					ReferenceFactory.NUMBER).getChilds(resolveLocals);
		} else if (ReferenceFactory.BOOLEAN.equals(getId())) {
			return ReferenceFactory.createBooleanReference(
					ReferenceFactory.BOOLEAN).getChilds(resolveLocals);
		} else if (ReferenceFactory.XML.equals(getId())) {
			return ReferenceFactory.createXMLReference(ReferenceFactory.XML)
					.getChilds(resolveLocals);
		} else if (getId().startsWith("Packages.")) {
			String className = getId().substring("Packages.".length());
			try {
				Class clz = Class.forName(className);
				NativeObjectReference ref = new NativeObjectReference(
						className, clz);
				return ref.getChilds(resolveLocals);

			} catch (Exception e) {
				// ignore
			}
		}
		return super.internalGetChilds(resolveLocals);
	}
}