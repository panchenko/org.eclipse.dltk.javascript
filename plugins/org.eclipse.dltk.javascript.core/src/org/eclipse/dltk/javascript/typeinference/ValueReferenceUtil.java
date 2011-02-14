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

import org.eclipse.dltk.internal.javascript.ti.ILazyValue;
import org.eclipse.dltk.internal.javascript.ti.IValue;
import org.eclipse.dltk.internal.javascript.ti.IValue2;
import org.eclipse.dltk.internal.javascript.ti.IValueProvider;

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

}
