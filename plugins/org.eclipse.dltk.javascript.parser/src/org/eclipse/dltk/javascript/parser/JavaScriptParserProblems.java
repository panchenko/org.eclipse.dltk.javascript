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
package org.eclipse.dltk.javascript.parser;

import org.eclipse.dltk.compiler.problem.IProblemIdentifier;

public enum JavaScriptParserProblems implements IProblemIdentifier {

	INTERNAL_ERROR, LEXER_ERROR, SYNTAX_ERROR, RESERVED_KEYWORD, DUPLICATE_PARAMETER,
	// public static final int VAR_HIDES_ARGUMENT = IProblem.MethodRelated +
	// 1001;
	// public static final int CONST_HIDES_ARGUMENT = IProblem.MethodRelated +
	// 1002;
	FUNCTION_HIDES_ARGUMENT,
	// public static final int DUPLICATE_VAR_DECLARATION = IProblem.Internal +
	// 1004;
	// public static final int DUPLICATE_CONST_DECLARATION = IProblem.Internal +
	// 1005;

	DOUBLE_SWITCH_DEFAULT, DUPLICATE_LABEL, UNDEFINED_LABEL, BAD_BREAK, INVALID_RETURN, BAD_CONTINUE, CATCH_UNREACHABLE, TRAILING_COMMA_OBJECT_INITIALIZER;

	public String contributor() {
		return JavaScriptParserPlugin.PLUGIN_ID;
	}

}
