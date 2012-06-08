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
package org.eclipse.dltk.javascript.core.tests.validation;

import org.eclipse.dltk.internal.javascript.ti.TypeInferencer2;
import org.eclipse.dltk.internal.javascript.validation.TypeInfoValidator;
import org.eclipse.dltk.javascript.core.tests.typeinference.TestTypeInferencer2;

@SuppressWarnings("restriction")
class TestTypeInfoValidator extends TypeInfoValidator {
	@Override
	protected TypeInferencer2 createTypeInferencer() {
		return new TestTypeInferencer2();
	}
}
