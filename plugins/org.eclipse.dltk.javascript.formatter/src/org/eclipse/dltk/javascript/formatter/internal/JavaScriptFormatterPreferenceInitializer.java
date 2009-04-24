/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.javascript.formatter.internal;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.dltk.javascript.formatter.JavaScriptFormatterConstants;
import org.eclipse.dltk.javascript.formatter.JavaScriptFormatterPlugin;
import org.eclipse.jface.preference.IPreferenceStore;

public class JavaScriptFormatterPreferenceInitializer extends
		AbstractPreferenceInitializer {

	public void initializeDefaultPreferences() {
		IPreferenceStore store = JavaScriptFormatterPlugin.getDefault()
				.getPreferenceStore();

		String[] options = JavaScriptFormatterConstants.getNames();

		for (int i = 0; i < options.length; i++) {

			String name = options[i];

			if (JavaScriptFormatterConstants.isBoolean(name)) {

				store.setDefault(name, ((Boolean) JavaScriptFormatterConstants
						.getDefaultValue(name)).booleanValue());
				continue;
			}

			if (JavaScriptFormatterConstants.isInteger(name)) {

				store.setDefault(name, ((Integer) JavaScriptFormatterConstants
						.getDefaultValue(name)).intValue());

				continue;
			}

			if (JavaScriptFormatterConstants.isString(name)) {

				store.setDefault(name, JavaScriptFormatterConstants
						.getDefaultValue(name).toString());
			}
		}

	}
}
