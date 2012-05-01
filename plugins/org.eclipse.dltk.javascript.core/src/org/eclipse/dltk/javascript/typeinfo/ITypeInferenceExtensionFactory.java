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

/**
 * This interface could be optionally implemented by
 * {@link ITypeInferenceHandlerFactory}.
 */
public interface ITypeInferenceExtensionFactory {

	/**
	 * @param context
	 * @param visitor
	 * @param extensionClass
	 *            e.g.
	 *            {@link org.eclipse.dltk.javascript.validation.IValidatorExtension}
	 * @return
	 */
	Object createExtension(ITypeInfoContext context,
			ITypeInferencerVisitor visitor, Class<?> extensionClass);

}
