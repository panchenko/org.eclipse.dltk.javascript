/*******************************************************************************
 * Copyright (c) 2005, 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/

package org.eclipse.dltk.internal.javascript.corext.refactoring.structure;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.javascript.core.dom.FunctionExpression;


public abstract class BodyUpdater {

	/**
	 * Updates the body of a method declaration. This method is called by the
	 * {@link ChangeSignatureProcessor} and allows implementors to refactor the body
	 * of the given method declaration.
	 *
	 * @param declaration
	 * @throws CoreException
	 */
	public abstract void updateBody(FunctionExpression declaration) throws ModelException;

	/**
	 * Returns whether {@link ChangeSignatureProcessor} should check if
	 * deleted parameters are currently used in the method body.
	 *
	 * @return <code>true</code> by default, subclasses can override
	 */
	public boolean needsParameterUsedCheck() {
		return true;
	}

}
