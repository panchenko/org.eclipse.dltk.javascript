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

public class StructureContext implements IStructureContext {

	public static final StructureContext ROOT = new StructureContext();

	public boolean allowMethods() {
		// TODO Auto-generated method stub
		return false;
	}

	public boolean allowFields() {
		// TODO Auto-generated method stub
		return false;
	}

	public IStructureContext setAllowFields(boolean value) {
		// TODO Auto-generated method stub
		return null;
	}

}
