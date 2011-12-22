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
package org.eclipse.dltk.internal.javascript.ti;

import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.impl.AdapterImpl;

public class GenericTypeReference extends AdapterImpl {

	private final Type genericType;

	public GenericTypeReference(Type genericType) {
		this.genericType = genericType;
	}

	public static Type dereference(Type type) {
		for (Adapter adapter : type.eAdapters()) {
			if (adapter instanceof GenericTypeReference) {
				return ((GenericTypeReference) adapter).genericType;
			}
		}
		return type;
	}

}
