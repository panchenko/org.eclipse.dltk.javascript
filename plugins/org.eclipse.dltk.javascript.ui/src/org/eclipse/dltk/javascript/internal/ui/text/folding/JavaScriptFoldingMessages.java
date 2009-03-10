/*******************************************************************************
 * Copyright (c) 2000, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.javascript.internal.ui.text.folding;

import org.eclipse.osgi.util.NLS;

public final class JavaScriptFoldingMessages extends NLS {

	private static final String BUNDLE_NAME = "org.eclipse.dltk.javascript.internal.ui.text.folding.JavaScriptFoldingMessages";//$NON-NLS-1$

	private JavaScriptFoldingMessages() {
		// Do not instantiate
	}

	static {
		NLS.initializeMessages(BUNDLE_NAME, JavaScriptFoldingMessages.class);
	}

	public static String JavaScriptFoldingPreferenceBlock_initFoldDoc;
}
