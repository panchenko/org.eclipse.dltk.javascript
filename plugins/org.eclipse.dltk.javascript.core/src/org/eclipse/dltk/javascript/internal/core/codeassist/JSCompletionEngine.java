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
import org.eclipse.dltk.javascript.typeinfo.IRMember;
import org.eclipse.dltk.javascript.typeinfo.TypeMode;

public interface JSCompletionEngine extends ICompletionEngine {

	int OPTION_NONE = 0;
	int OPTION_GLOBALS = 1;
	int OPTION_KEYWORDS = 2;
	int OPTION_ALL = OPTION_GLOBALS | OPTION_KEYWORDS;

	int getGlobalOptions();

	void setGlobalOptions(int value);

	void completeTypes(ISourceModule module, TypeMode mode, String prefix,
			int offset);

	void completeGlobals(ISourceModule module, String prefix, int offset,
			boolean jsdoc);

	void completeMembers(ISourceModule module, String prefix, int offset,
			boolean jsdoc, Iterable<IRMember> memers);
}
