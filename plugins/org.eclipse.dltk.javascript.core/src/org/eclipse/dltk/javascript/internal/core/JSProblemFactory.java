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

import org.eclipse.dltk.compiler.problem.DefaultProblemFactory;
import org.eclipse.dltk.javascript.core.JavaScriptPlugin;

public class JSProblemFactory extends DefaultProblemFactory {

	public static final String JS_PROBLEM = JavaScriptPlugin.PLUGIN_ID
			+ ".jsproblem";

	public JSProblemFactory() {
		System.out.println("new " + getClass().getSimpleName());
	}

	@Override
	public String getProblemMarker() {
		return JS_PROBLEM;
	}

}
