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
package org.eclipse.dltk.javascript.typeinference;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.eclipse.dltk.internal.javascript.ti.ILazyValue;
import org.eclipse.dltk.internal.javascript.ti.IReferenceAttributes;
import org.eclipse.dltk.internal.javascript.ti.IValue;
import org.eclipse.dltk.internal.javascript.ti.IValue2;
import org.eclipse.dltk.internal.javascript.ti.IValueProvider;
import org.eclipse.dltk.javascript.typeinfo.IRMember;
import org.eclipse.dltk.javascript.typeinfo.model.Member;
import org.eclipse.dltk.javascript.typeinfo.model.Method;
import org.eclipse.dltk.javascript.typeinfo.model.Type;

public class ValueReferenceUtil {

	public static String getLazyName(IValueReference reference) {
		if (reference instanceof IValueProvider) {
			final IValue value = ((IValueProvider) reference).getValue();
			if (value instanceof ILazyValue) {
				final ILazyValue lazyValue = (ILazyValue) value;
				if (!lazyValue.isResolved()) {
					lazyValue.resolve();
					if (!lazyValue.isResolved()) {
						return lazyValue.getLazyName();
					}
				}
			}
			if (value instanceof IValue2) {
				for (IValue ref : ((IValue2) value).getReferences()) {
					if (ref instanceof ILazyValue) {
						final ILazyValue lazyValue = (ILazyValue) ref;
						if (!lazyValue.isResolved()) {
							lazyValue.resolve();
							if (!lazyValue.isResolved()) {
								return lazyValue.getLazyName();
							}
						}
					}
				}
			}
		}
		return null;
	}

	/**
	 * Returns the underlying model element for the specified reference or
	 * <code>null</code>.
	 * 
	 * @param reference
	 * @param elementType
	 *            {@link IRMember}, {@link Member}
	 */
	public static <E> E extractElement(IValueReference reference,
			Class<E> elementType) {
		assert IRMember.class.isAssignableFrom(elementType)
				|| Member.class.isAssignableFrom(elementType);
		Object value = reference.getAttribute(IReferenceAttributes.ELEMENT);
		if (value != null) {
			if (value instanceof Object[]) {
				value = ((Object[]) value)[0];
			}
			return cast(value, elementType);
		}
		return null;
	}

	/**
	 * Returns List of underlying model elements or <code>null</code> if not
	 * available.
	 * 
	 * @param reference
	 * @param elementType
	 *            {@link IRMember}, {@link Member}
	 * @return
	 */
	public static <E> List<E> extractElements(IValueReference reference,
			Class<E> elementType) {
		assert IRMember.class.isAssignableFrom(elementType)
				|| Member.class.isAssignableFrom(elementType);
		final Object value = reference
				.getAttribute(IReferenceAttributes.ELEMENT);
		if (value != null) {
			if (value instanceof Object[]) {
				final Object[] elements = (Object[]) value;
				List<E> result = null;
				for (Object element : elements) {
					final E casted = cast(element, elementType);
					if (casted != null) {
						if (result == null) {
							result = new ArrayList<E>(elements.length);
						}
						result.add(casted);
					}
				}
				return result;
			} else {
				final E casted = cast(value, elementType);
				if (casted != null) {
					return Collections.singletonList(casted);
				}
			}
		}
		return null;
	}

	@SuppressWarnings("unchecked")
	private static <E> E cast(Object value, Class<E> elementType) {
		if (elementType.isInstance(value)) {
			return (E) value;
		} else if (elementType == Method.class) {
			if (value instanceof IRMember) {
				final Object source = ((IRMember) value).getSource();
				if (elementType.isInstance(source)) {
					return (E) source;
				}
				if (source instanceof Type) {
					return (E) ((Type) source).getStaticConstructor();
				}
			} else if (value instanceof Type) {
				return (E) ((Type) value).getStaticConstructor();
			}
		} else if (Member.class.isAssignableFrom(elementType)) {
			if (value instanceof IRMember) {
				final Object source = ((IRMember) value).getSource();
				if (elementType.isInstance(source)) {
					return (E) source;
				}
			}
		}
		return null;
	}

}
