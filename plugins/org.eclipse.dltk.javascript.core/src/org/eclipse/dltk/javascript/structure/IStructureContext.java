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
package org.eclipse.dltk.javascript.structure;

public interface IStructureContext {

	int FIELD = 1;
	int METHOD = 2;

	boolean allow(int mask);

	/**
	 * Adds the specified mask to the current and remembers the previous mask on
	 * the stack.
	 */
	void pushMask(int mask);

	/**
	 * Restores the previously pushed mask from the stack.
	 */
	void popMask();

}
