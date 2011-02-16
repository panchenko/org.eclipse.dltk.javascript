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
package org.eclipse.dltk.javascript.internal.core;

import static org.eclipse.dltk.javascript.core.JavaScriptPlugin.PLUGIN_ID;

import org.eclipse.dltk.compiler.problem.DefaultProblemFactory;

public class JSProblemFactory extends DefaultProblemFactory {

	public static final String JS_PROBLEM = PLUGIN_ID + ".jsproblem"; //$NON-NLS-1$

	public static final String JS_TASK = PLUGIN_ID + ".jstask"; //$NON-NLS-1$

	@Override
	protected String getProblemMarkerType() {
		return JS_PROBLEM;
	}

	@Override
	protected String getTaskMarkerType() {
		return JS_TASK;
	}

}
