/*******************************************************************************
 * Copyright (c) 2012 NumberFour AG
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

import org.eclipse.core.runtime.Assert;
import org.eclipse.dltk.javascript.typeinference.ReferenceKind;

/**
 * Value representing "this" in function bodies.
 */
public class ThisValue extends AnonymousReferenceValue {
	@Override
	protected String getToStringPrefix() {
		return "this";
	}

	@Override
	public ReferenceKind getKind() {
		return ReferenceKind.THIS;
	}

	@Override
	public void setKind(ReferenceKind kind) {
		Assert.isLegal(kind == ReferenceKind.THIS);
	}
}
