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
package org.eclipse.dltk.internal.javascript.ti;

import org.eclipse.dltk.compiler.problem.IProblemIdentifierExtension;
import org.eclipse.dltk.javascript.core.JSProblemFactory;
import org.eclipse.dltk.javascript.core.JavaScriptPlugin;
import org.eclipse.dltk.utils.EnumNLS;
import org.eclipse.osgi.util.NLS;

public enum JSDocProblem implements JSProblemIdentifier,
		IProblemIdentifierExtension {

	DUPLICATE_TAG, MISSING_PARAMETER_NAME, MISSING_TYPE_NAME, UNKNOWN_PARAM, DUPLICATE_PARAM, PARAMETER_MISSING_ANNOTATION;

	private String message;

	public String formatMessage(Object... args) {
		return NLS.bind(message, args);
	}

	public String contributor() {
		return JavaScriptPlugin.PLUGIN_ID;
	}

	static {
		EnumNLS.initializeMessages(JSDocProblem.values(), "message");
	}

	public String getMarkerType() {
		return JSProblemFactory.JSDOC_PROBLEM;
	}
}
