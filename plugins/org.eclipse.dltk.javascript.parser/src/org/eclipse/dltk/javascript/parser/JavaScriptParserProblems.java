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
import org.eclipse.dltk.utils.EnumNLS;
import org.eclipse.osgi.util.NLS;

public enum JavaScriptParserProblems implements IProblemIdentifier,
		JSProblemIdentifier {

	INTERNAL_ERROR, LEXER_ERROR, SYNTAX_ERROR, RESERVED_KEYWORD,

	DUPLICATE_FUNCTION, DUPLICATE_PARAMETER, DUPLICATE_VAR, DUPLICATE_CONST,

	FUNCTION_DUPLICATES_OTHER, VAR_DUPLICATES_OTHER, CONST_DUPLICATES_OTHER,

	DOUBLE_SWITCH_DEFAULT, DUPLICATE_LABEL, UNDEFINED_LABEL, BAD_BREAK, INVALID_RETURN, BAD_CONTINUE, CATCH_UNREACHABLE,

	TRAILING_COMMA_OBJECT_INITIALIZER;

	private String message;

	public String getMessage() {
		return message;
	}

	public String formatMessage(Object... args) {
		return NLS.bind(message, args);
	}

	static {
		EnumNLS.initializeMessages(JavaScriptParserProblems.values(), "message");
	}

	public String contributor() {
		return JavaScriptParserPlugin.PLUGIN_ID;
	}

}
