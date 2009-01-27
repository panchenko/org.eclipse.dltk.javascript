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

	/**
	 * @see org.eclipse.dltk.internal.javascript.typeinference.AbstractCallResultReference#internalGetChilds(boolean)
	 */
	protected Set internalGetChilds(boolean resolveLocals) {
		if ("String".equals(getId())) {
			return ReferenceFactory.createStringReference("String").getChilds(
					resolveLocals);
		} else if ("Date".equals(getId())) {
			return ReferenceFactory.createDateReference("Date").getChilds(
					resolveLocals);
		} else if ("Array".equals(getId())) {
			return ReferenceFactory.createArrayReference("Array").getChilds(
					resolveLocals);
		} else if ("Number".equals(getId())) {
			return ReferenceFactory.createNumberReference("Number").getChilds(
					resolveLocals);
		} else if ("Boolean".equals(getId())) {
			return ReferenceFactory.createBooleanReference("Boolean")
					.getChilds(resolveLocals);
		} else if ("XML".equals(getId())) {
			return ReferenceFactory.createXMLReference("XML").getChilds(
					resolveLocals);
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