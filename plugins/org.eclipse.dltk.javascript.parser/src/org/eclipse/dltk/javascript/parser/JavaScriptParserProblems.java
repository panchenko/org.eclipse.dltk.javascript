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

import org.eclipse.dltk.compiler.problem.IProblem;

public class JavaScriptParserProblems {

	public static final int INTERNAL_ERROR = IProblem.Internal + 1;
	public static final int LEXER_ERROR = IProblem.Syntax + 1;
	public static final int SYNTAX_ERROR = IProblem.Syntax + 2;

	public static final int DUPLICATE_PARAMETER = IProblem.MethodRelated + 1000;
	public static final int VAR_HIDES_ARGUMENT = IProblem.MethodRelated + 1001;
	public static final int CONST_HIDES_ARGUMENT = IProblem.MethodRelated + 1002;
	public static final int FUNCTION_HIDES_ARGUMENT = IProblem.MethodRelated + 1003;
	public static final int DUPLICATE_VAR_DECLARATION = IProblem.Internal + 1004;

	public static final int DOUBLE_SWITCH_DEFAULT = IProblem.Internal + 1025;
	public static final int DUPLICATE_LABEL = IProblem.Internal + 1026;
	public static final int UNDEFINED_LABEL = IProblem.Internal + 1027;
}
