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
package org.eclipse.dltk.internal.javascript.parser.structure;

import org.eclipse.dltk.javascript.structure.IStructureContext;
import org.eclipse.dltk.utils.IntList;

public class StructureContext implements IStructureContext {

	private int currentMask;
	private final IntList masks = new IntList();

	public boolean allow(int mask) {
		return (currentMask & mask) == 0;
	}

	public void pushMask(int mask) {
		masks.add(currentMask);
		currentMask |= mask;
	}

	public void popMask() {
		currentMask = masks.removeAt(masks.size() - 1);
	}

}
