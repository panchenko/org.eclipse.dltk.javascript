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
package org.eclipse.dltk.internal.javascript.ti;

import org.eclipse.dltk.javascript.typeinfo.model.Element;
import org.eclipse.dltk.javascript.typeinfo.model.Type;

public class TopValueCollection extends ValueCollection {

	private final ITypeInferenceContext context;

	public boolean isScope() {
		return true;
	}

	/**
	 * @param parent
	 */
	public TopValueCollection(final ITypeInferenceContext context) {
		super(null, new Value() {
			@Override
			protected IValue findMember(String name, boolean resolve) {
				if (resolve) {
					final Element element = context.resolve(name);
					if (element != null) {
						return ElementValue.createFor(element);
					}
					final Type type = context.getKnownType(name);
					if (type != null) {
						return ElementValue.createStatic(type);
					}
				}
				return null;
			}
		});
		this.context = context;
	}

	@Override
	public ITypeInferenceContext getContext() {
		return context;
	}

}
