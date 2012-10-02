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
package org.eclipse.dltk.javascript.typeinfo;

import java.util.Set;

import org.eclipse.dltk.compiler.problem.IProblemCategory;
import org.eclipse.dltk.compiler.problem.IProblemIdentifier;

public interface IRElement {

	String getName();

	Set<IProblemCategory> getSuppressedWarnings();

	boolean isSuppressed(IProblemIdentifier problemIdentifier);

	boolean isDeprecated();

	/**
	 * Returns the declaration object used to construct this "runtime/resolved"
	 * element.
	 */
	Object getSource();

}
