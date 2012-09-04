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
package org.eclipse.dltk.javascript.typeinfo;

import org.eclipse.dltk.compiler.problem.IValidationStatus;
import org.eclipse.dltk.compiler.problem.ValidationStatus;
import org.eclipse.dltk.javascript.typeinference.IValueReference;

/**
 * Optional interface which can be implemented by {@link IRType} instance to
 * allow checking assignments from the "raw" type inferencer data.
 */
public interface IRTypeExtension extends IRType {

	/**
	 * Determines if this type could be assigned from the specified value.
	 * 
	 * <p>
	 * All the types implementing {@link IValidationStatus} marker interface
	 * could be used as return value. {@link TypeCompatibility} constants is an
	 * easy, another way is {@link ValidationStatus} which allows to specify
	 * problem message and id. <code>null</code> is treated as successful
	 * result.
	 * </p>
	 * 
	 * @see TypeCompatibility
	 * @see ValidationStatus
	 */
	IValidationStatus isAssignableFrom(IValueReference argument);

}
