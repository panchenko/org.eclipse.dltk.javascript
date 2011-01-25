/*******************************************************************************
 * Copyright (c) 2011 xored software, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.core;

import org.eclipse.dltk.core.keyword.KeywordManager;

public class JSKeywordManager extends KeywordManager {

	public JSKeywordManager() {
		super(JavaScriptNature.NATURE_ID);
	}

	private static JSKeywordManager manager = null;

	public static JSKeywordManager getInstance() {
		if (manager == null) {
			manager = new JSKeywordManager();
		}
		return manager;
	}

}
