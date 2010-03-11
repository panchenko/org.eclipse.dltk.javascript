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
package org.eclipse.dltk.internal.javascript.validation;

import org.eclipse.dltk.core.builder.IBuildContext;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.parser.JavaScriptParser;

class JavaScriptValidations {

	public static Script parse(IBuildContext context) {
		// TODO use cached AST
		final JavaScriptParser parser = new JavaScriptParser();
		// TODO use option from project
		parser.setTypeInformationEnabled(true);
		return parser.parse(context, context.getProblemReporter());
	}

}
