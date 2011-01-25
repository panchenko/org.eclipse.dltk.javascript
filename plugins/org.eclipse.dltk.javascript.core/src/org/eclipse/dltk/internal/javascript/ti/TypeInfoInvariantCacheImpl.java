/*******************************************************************************
 * Copyright (c) 2011 xored software, Inc.
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

import org.eclipse.dltk.internal.javascript.ti.TypeInferencer2.InvariantTypeResourceSet;
import org.eclipse.dltk.javascript.typeinfo.ITypeInfoContext;

public class TypeInfoInvariantCacheImpl implements
		ITypeInfoContext.ITypeInfoInvariantCache {

	public void reset() {
		TypeInferencer2.invariantRS.reset();
	}

	public void reset(String context) {
		InvariantTypeResourceSet invariantTypeResourceSet = TypeInferencer2.invariantContextRS
				.get(context);
		if (invariantTypeResourceSet != null)
			invariantTypeResourceSet.reset();
	}

}
