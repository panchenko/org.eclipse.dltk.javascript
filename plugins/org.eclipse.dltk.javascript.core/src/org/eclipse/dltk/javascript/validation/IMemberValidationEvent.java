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

import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinfo.IRMember;

/**
 * Lightweight object used as the parameter of the
 * {@link IValidatorExtension#validateAccessibility(IMemberValidationEvent)}
 * method.
 */
public interface IMemberValidationEvent {

	/**
	 * Returns the reference being validated, not-null.
	 */
	public IValueReference getReference();

	/**
	 * Returns the {@link IRMember} attached to this reference or
	 * <code>null</code> if not available.
	 */
	public IRMember getRMember();

}
