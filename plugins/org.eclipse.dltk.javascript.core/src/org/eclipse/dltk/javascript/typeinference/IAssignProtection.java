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

import org.eclipse.dltk.compiler.problem.IProblemIdentifier;

/**
 * Value of the {@link IValueReference} attribute to mark read-only elements, it
 * should be retrieved calling {@link IValueReference#getAttribute(String)} with
 * {@link #ATTRIBUTE}.
 * <p>
 * There could be different reasons for the element being read-only, so there
 * are a few static instances of this interface to distinguish them.
 * </p>
 */
public interface IAssignProtection {

	/**
	 * Key of the attribute containing this value.
	 */
	static String ATTRIBUTE = IAssignProtection.class.getName();

	/**
	 * Problem identifier to be used when reporting the problem.
	 */
	IProblemIdentifier problemId();

	/**
	 * Problem message to be used when reporting the problem.
	 */
	String problemMessage();

}
