/*******************************************************************************
 * Copyright (c) 2011 NumberFour AG
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

import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

/**
 * This type is not used anymore for parameterized types.
 */
@Deprecated
public class OriginReference extends AdapterImpl {

	public final Type genericType;
	public final IRType[] parameterTypes;

	public OriginReference(Type genericType) {
		this(genericType, new IRType[0]);
	}

	public OriginReference(Type genericType, IRType[] parameterTypes) {
		this.genericType = genericType;
		this.parameterTypes = parameterTypes;
	}

	public static Type dereference(Type type) {
		for (Adapter adapter : type.eAdapters()) {
			if (adapter instanceof OriginReference) {
				return ((OriginReference) adapter).genericType;
			}
		}
		return type;
	}

	public static OriginReference of(Type type) {
		for (Adapter adapter : type.eAdapters()) {
			if (adapter instanceof OriginReference) {
				return (OriginReference) adapter;
			}
		}
		return null;
	}

}
