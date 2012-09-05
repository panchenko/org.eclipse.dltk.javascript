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
import org.eclipse.dltk.javascript.typeinference.IValueCollection;
import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinfo.IRMember;
import org.eclipse.dltk.javascript.typeinfo.model.Member;
import org.eclipse.dltk.javascript.typeinfo.model.Type;

/**
 * Instances of this interface could be created with
 * {@link org.eclipse.dltk.javascript.typeinfo.ITypeInferenceExtensionFactory}
 */
public interface IValidatorExtension {

	enum UnusedVariableValidation {
		TRUE, FALSE
	}

	IValidationStatus canInstantiate(Type type, IValueReference typeReference);

	UnusedVariableValidation canValidateUnusedVariable(
			IValueCollection collection, IValueReference reference);

	/**
	 * @param member
	 *            model of the accessed member, not <code>null</code>.
	 * @return
	 */
	IValidationStatus validateAccessibility(Member member);

	/**
	 * Tests if the specified member is accessible.
	 * 
	 * @param event
	 *            Event object containing {@link IValueReference} and
	 *            {@link IRMember} attached to it. It is a transient object that
	 *            is only valid for the duration of a single
	 *            validateAccessibility method. An object should not be
	 *            referenced once the method call is complete.
	 */
	IValidationStatus validateAccessibility(IMemberValidationEvent event);

}
