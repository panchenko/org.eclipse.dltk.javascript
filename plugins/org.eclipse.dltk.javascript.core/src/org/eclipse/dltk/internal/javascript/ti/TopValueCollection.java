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

import org.eclipse.dltk.javascript.core.Types;
import org.eclipse.dltk.javascript.typeinference.IValueCollection;
import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinfo.IRMember;
import org.eclipse.dltk.javascript.typeinfo.JSTypeSet;
import org.eclipse.dltk.javascript.typeinfo.TypeMode;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeKind;

public class TopValueCollection extends ValueCollection {

	private static final class TopValue extends Value {

		private final ITypeInferenceContext context;

		public TopValue(ITypeInferenceContext context) {
			this.context = context;
		}

		@Override
		public JSTypeSet getTypes() {
			return JSTypeSet.emptySet();
		}

		private final Map<String, IValue> memberCache = new HashMap<String, IValue>();

		@Override
		protected IValue findMember(String name, boolean resolve) {
			IValue member = super.findMember(name, resolve);
			if (resolve && member == null) {
				IValue value = memberCache.get(name);
				if (value != null)
					return value;
				final IRMember element = context.resolve(name);
				if (element != null) {
					value = context.valueOf(element);
					if (value == null) {
						value = ElementValue.createFor(element);
					}
					memberCache.put(name, value);
					return value;
				}
				if (name.equals(IValueReference.ARRAY_OP)) {
					// special case ARRAY_OP is an instance of an Array not
					// the Array type/class itself.
					value = ElementValue
							.createFor(context.convert(Types.ARRAY));
					memberCache.put(name, value);
					return value;
				}
				final Type type = context.getKnownType(name, TypeMode.CODE);
				if (type != null && type.getKind() != TypeKind.UNKNOWN) {
					value = ElementValue.createClass(context, type);
					memberCache.put(name, value);
					return value;
				}
				if ("Packages".equals(name)) {
					value = new PackagesValue(context);
					memberCache.put(name, value);
					return value;
				}
				if (name.startsWith("Packages.")) {
					value = new PackageOrClassValue(name.substring("Packages."
							.length()), context);
					memberCache.put(name, value);
					return value;
				}
				if ("java".equals(name) || name.startsWith("java.")) {
					value = new PackageOrClassValue(name, context);
					memberCache.put(name, value);
					return value;
				}
			}
			return member;
		}

		@Override
		protected void childCreated(String name) {
			super.childCreated(name);
			memberCache.remove(name);
		}
	}

	public boolean isScope() {
		return true;
	}

	/**
	 * @param parent
	 */
	public TopValueCollection(final ITypeInferenceContext context) {
		super(null, new TopValue(context));
		this.thisValue = new ThisValue(getValue());

		IValueCollection topValueCollection = context.getTopValueCollection();
		if (topValueCollection instanceof IValueProvider) {
			getValue().addValue(
					((IValueProvider) topValueCollection).getValue());
		}
		context.configureTopValueCollection(this);
	}

	private final ThisValue thisValue;

	@Override
	public IValueReference getThis() {
		return thisValue;
	}

}
