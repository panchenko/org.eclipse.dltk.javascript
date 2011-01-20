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

import org.eclipse.dltk.compiler.problem.IProblemIdentifier;
import org.eclipse.dltk.utils.EnumNLS;
import org.eclipse.osgi.util.NLS;

public enum JSDocProblem implements IProblemIdentifier {

	DUPLICATE_TYPE, MISSING_PARAMETER_NAME, UNKNOWN_PARAM, DUPLICATE_PARAM, REPEATED_TAG;

	private String message;

	public String formatMessage(Object... args) {
		return NLS.bind(message, args);
	}

	public String getId() {
		return getClass().getName() + '#' + name();
	}

	static {
		EnumNLS.initializeMessages(JSDocProblem.values(), "message");
	}
}
