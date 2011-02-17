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

import org.eclipse.dltk.compiler.problem.IProblemIdentifier;
import org.eclipse.dltk.core.builder.IBuildParticipant;
import org.eclipse.dltk.core.tests.util.StringList;
import org.eclipse.dltk.internal.javascript.validation.CodeValidation;
import org.eclipse.dltk.javascript.core.JavaScriptProblems;

public class CodeValidationTests extends AbstractValidationTest {

	@Override
	protected IBuildParticipant createValidator() {
		return new CodeValidation();
	}

	public void testEqualAsAssign() {
		StringList code = new StringList();
		code.add("function q(a) {");
		code.add("  if (a = 1) return 1");
		code.add("  else return 0");
		code.add("}");
		final Set<IProblemIdentifier> problemIds = extractIds(validate(code
				.toString()));
		assertEquals(1, problemIds.size());
		assertTrue(problemIds.contains(JavaScriptProblems.EQUAL_AS_ASSIGN));
	}

	public void testInvalidAssignmentLeftSide() {
		Set<IProblemIdentifier> problemIds = extractIds(validate("++1"));
		assertEquals(1, problemIds.size());
		assertTrue(problemIds.contains(JavaScriptProblems.INVALID_ASSIGN_LEFT));
	}

	public void testContinueNonLoopLabel() {
		StringList code = new StringList();
		code.add("A: while (!f.isEOF()) {");
		code.add("READ: s = f.readLine()");
		code.add("if (s == 'END') continue READ");
		code.add("}");
		Set<IProblemIdentifier> problemIds = extractIds(validate(code
				.toString()));
		assertEquals(1, problemIds.size());
		assertTrue(problemIds
				.contains(JavaScriptProblems.CONTINUE_OUTSIDE_LABEL));
	}

	public void testBreakNonLoopLabel() {
		StringList code = new StringList();
		code.add("A: while (!f.isEOF()) {");
		code.add("READ: s = f.readLine()");
		code.add("if (s == 'END') break READ");
		code.add("}");
		Set<IProblemIdentifier> problemIds = extractIds(validate(code
				.toString()));
		assertEquals(1, problemIds.size());
		assertTrue(problemIds.contains(JavaScriptProblems.BREAK_OUTSIDE_LABEL));
	}

	public void testDuplicatePropertyInLiteral() {
		StringList code = new StringList();
		code.add("var x = {");
		code.add("a:1,");
		code.add("b:2,");
		code.add("a:3");
		code.add("}");
		Set<IProblemIdentifier> problemIds = extractIds(validate(code
				.toString()));
		assertEquals(1, problemIds.size());
		assertTrue(problemIds.contains(JavaScriptProblems.DUPLICATE_PROPERTY_IN_LITERAL));
	}

}
