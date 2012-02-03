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
package org.eclipse.dltk.javascript.internal.ui.text;

import static org.eclipse.dltk.ui.PreferenceConstants.EDITOR_SEMANTIC_HIGHLIGHTING_ENABLED_SUFFIX;

import org.eclipse.dltk.javascript.internal.ui.JavaScriptUI;

public class AbstractJavaScriptHighlighter {

	protected static boolean isSemanticHighlightingEnabled(String key) {
		return JavaScriptUI.getDefault().getPreferenceStore()
				.getBoolean(key + EDITOR_SEMANTIC_HIGHLIGHTING_ENABLED_SUFFIX);
	}

}
