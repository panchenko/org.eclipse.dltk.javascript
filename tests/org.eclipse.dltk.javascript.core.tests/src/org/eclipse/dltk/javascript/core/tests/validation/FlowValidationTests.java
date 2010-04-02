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
package org.eclipse.dltk.javascript.core.tests.validation;

import java.util.Set;

import org.eclipse.dltk.core.builder.IBuildParticipant;
import org.eclipse.dltk.core.tests.util.StringList;
import org.eclipse.dltk.internal.javascript.validation.FlowValidation;
import org.eclipse.dltk.javascript.core.JavaScriptProblems;

public class FlowValidationTests extends AbstractValidationTest {

	@Override
	protected IBuildParticipant createValidator() {
		return new FlowValidation();
	}

	public void testUnreachableCodeAfterReturn() {
		StringList code = new StringList();
		code.add("function q(a) {");
		code.add("  if (a ==1) return 1");
		code.add("  else return 0");
		code.add("  var x = 1");
		code.add("}");
		final Set<Integer> problemIds = extractIds(validate(code.toString()));
		assertEquals(1, problemIds.size());
		assertTrue(problemIds.contains(JavaScriptProblems.UNREACHABLE_CODE));
	}

	public void testFunctionAlwaysReturnValue1() {
		StringList code = new StringList();
		code.add("function q(a) {");
		code.add("  if (a ==1) return 1");
		code.add("}");
		final Set<Integer> problemIds = extractIds(validate(code.toString()));
		assertEquals(1, problemIds.size());
		assertTrue(problemIds
				.contains(JavaScriptProblems.FUNCTION_NOT_ALWAYS_RETURN_VALUE));
	}

	public void testFunctionAlwaysReturnValue2() {
		StringList code = new StringList();
		code.add("function q(a) {");
		code.add("  if (a ==1) return 1");
		code.add("  return");
		code.add("}");
		final Set<Integer> problemIds = extractIds(validate(code.toString()));
		assertEquals(2, problemIds.size());
		assertTrue(problemIds
				.contains(JavaScriptProblems.FUNCTION_NOT_ALWAYS_RETURN_VALUE));
		assertTrue(problemIds.contains(JavaScriptProblems.RETURN_INCONSISTENT));
	}

}
