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
package org.eclipse.dltk.javascript.core;

import org.eclipse.dltk.compiler.problem.IProblemIdentifier;

public enum JavaScriptProblems implements IProblemIdentifier {

	UNKNOWN_TYPE, DEPRECATED_TYPE,

	UNDEFINED_METHOD, WRONG_PARAMETERS, DEPRECATED_METHOD,
	/**
	 * @since 3.0
	 */
	DEPRECATED_FUNCTION,
	/**
	 * @since 3.0
	 */
	INSTANCE_METHOD,
	/**
	 * @since 3.0
	 */
	STATIC_METHOD,
	/**
	 * @since 3.0
	 */
	PRIVATE_FUNCTION,
	/**
	 * @since 3.0
	 */
	WRONG_JAVA_PARAMETERS,
	/**
	 * @since 3.0
	 */
	UNDEFINED_JAVA_METHOD,
	/**
	 * @since 3.0
	 */
	DECLARATION_MISMATCH_ACTUAL_RETURN_TYPE,

	UNDEFINED_PROPERTY, DEPRECATED_PROPERTY,
	/**
	 * @since 3.0
	 */
	DEPRECATED_VARIABLE,
	/**
	 * @since 3.0
	 */
	PRIVATE_VARIABLE,
	/**
	 * @since 3.0
	 */
	HIDDEN_PROPERTY,
	/**
	 * @since 3.0
	 */
	INSTANCE_PROPERTY,
	/**
	 * @since 3.0
	 */
	STATIC_PROPERTY,
	/**
	 * @since 3.0
	 */
	UNDEFINED_JAVA_PROPERTY,
	/**
	 * @since 3.0
	 */
	REASSIGNMENT_OF_CONSTANT,
	/**
	 * @since 3.0
	 */
	PARAMETER_HIDES_VARIABLE,
	/**
	 * @since 3.0
	 */
	DUPLICATE_VAR_DECLARATION,
	/**
	 * @since 3.0
	 */
	VAR_HIDES_PARAMETER,
	/**
	 * @since 3.0
	 */
	VAR_HIDES_PROPERTY, VAR_HIDES_METHOD,
	/**
	 * @since 3.0
	 */
	UNDECLARED_VARIABLE,
	/**
	 * @since 3.0
	 */
	VAR_HIDES_FUNCTION,

	EQUAL_AS_ASSIGN, INVALID_ASSIGN_LEFT,

	UNREACHABLE_CODE, RETURN_INCONSISTENT, FUNCTION_NOT_ALWAYS_RETURN_VALUE,

	CONTINUE_NON_LOOP_LABEL, BREAK_NON_LOOP_LABEL,
	/**
	 * @since 3.0
	 */
	BREAK_OUTSIDE_LABEL,
	/**
	 * @since 3.0
	 */
	CONTINUE_OUTSIDE_LABEL;

	public String contributor() {
		return JavaScriptPlugin.PLUGIN_ID;
	}

}
