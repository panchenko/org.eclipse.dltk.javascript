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
import org.eclipse.dltk.javascript.typeinfo.ITypeNames;

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
		if (ITypeNames.STRING.equals(getId())) {
			return ReferenceFactory.createStringReference(ITypeNames.STRING)
					.getChilds(resolveLocals);
		} else if (ITypeNames.DATE.equals(getId())) {
			return ReferenceFactory.createDateReference(ITypeNames.DATE)
					.getChilds(resolveLocals);
		} else if (ITypeNames.ARRAY.equals(getId())) {
			return ReferenceFactory.createArrayReference(ITypeNames.ARRAY)
					.getChilds(resolveLocals);
		} else if (ITypeNames.NUMBER.equals(getId())) {
			return ReferenceFactory.createNumberReference(ITypeNames.NUMBER)
					.getChilds(resolveLocals);
		} else if (ITypeNames.BOOLEAN.equals(getId())) {
			return ReferenceFactory.createBooleanReference(ITypeNames.BOOLEAN)
					.getChilds(resolveLocals);
		} else if (ITypeNames.XML.equals(getId())) {
			return ReferenceFactory.createXMLReference(ITypeNames.XML)
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