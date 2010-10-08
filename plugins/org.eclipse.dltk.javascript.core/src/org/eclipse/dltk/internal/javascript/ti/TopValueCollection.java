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

import java.util.HashMap;
import java.util.Map;

import org.eclipse.dltk.javascript.typeinfo.model.Member;
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

			private final Map<String, IValue> memberCache = new HashMap<String, IValue>();
			@Override
			protected IValue findMember(String name, boolean resolve) {
				if (resolve) {
					IValue value = memberCache.get(name);
					if (value != null)
						return value;
					final Member element = context.resolve(name);
					if (element != null) {
						value = context.valueOf(element);
						if (value != null)
							memberCache.put(name, value);
						return value;
					}
					final Type type = context.getKnownType(name);
					if (type != null) {
						value = ElementValue
								.createStatic(type);
						memberCache.put(name, value);
						return value;
					}
				}
				return null;
			}
		});
		this.context = context;

		IValueCollection topValueCollection = context.getTopValueCollection();
		if (topValueCollection instanceof IValueProvider) {
			getValue().addValue(
					((IValueProvider) topValueCollection).getValue());
		}
	}

	@Override
	public ITypeInferenceContext getContext() {
		return context;
	}

}
