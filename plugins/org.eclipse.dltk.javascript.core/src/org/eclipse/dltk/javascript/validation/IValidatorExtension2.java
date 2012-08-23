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
package org.eclipse.dltk.javascript.validation;

import org.eclipse.dltk.compiler.problem.IValidationStatus;
import org.eclipse.dltk.core.ISourceNode;
import org.eclipse.dltk.javascript.typeinfo.model.Type;

public interface IValidatorExtension2 extends IValidatorExtension {

	/**
	 * Validates accessibility of the specified type.
	 * 
	 * @param type
	 * @param node
	 * @return
	 */
	IValidationStatus validateAccessibility(Type type, ISourceNode node);

}
