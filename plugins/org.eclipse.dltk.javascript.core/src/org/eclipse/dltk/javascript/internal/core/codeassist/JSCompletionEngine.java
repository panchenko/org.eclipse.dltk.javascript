/*******************************************************************************
 * Copyright (c) 2010 xored software, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.internal.core.codeassist;

import org.eclipse.dltk.codeassist.ICompletionEngine;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.javascript.typeinfo.TypeMode;

public interface JSCompletionEngine extends ICompletionEngine {

	boolean isAllowGlobals();

	void setAllowGlobals(boolean value);

	void completeTypes(ISourceModule module, TypeMode mode, String prefix,
			int offset);

}
