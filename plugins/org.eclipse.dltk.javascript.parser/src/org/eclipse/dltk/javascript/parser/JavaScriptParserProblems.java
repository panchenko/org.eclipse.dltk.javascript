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

}
