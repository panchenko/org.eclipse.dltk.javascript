/*******************************************************************************
 * Copyright (c) 2012 NumberFour AG
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     NumberFour AG - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.core.tests.validation;

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.dltk.compiler.problem.IProblem;
import org.eclipse.dltk.core.builder.IBuildParticipant;
import org.eclipse.dltk.core.tests.util.StringList;
import org.eclipse.dltk.internal.javascript.validation.FlowValidationFactory;
import org.eclipse.dltk.javascript.core.JavaScriptProblems;
import org.eclipse.dltk.javascript.core.tests.AbstractValidationTest;

@SuppressWarnings("restriction")
public class FlowTypeInfoValidationTests extends AbstractValidationTest {

	@Override
	protected IBuildParticipant createValidator() {
		try {
			return new CompoundBuildParticipant(
					new FlowValidationFactory().createBuildParticipant(null),
					new TestTypeInfoValidator());
		} catch (CoreException e) {
			throw new IllegalStateException(e);
		}
	}

	public void testFunctionAlwaysReturnValue1() {
		StringList code = new StringList();
		code.add("/** @return {Number|undefined} */");
		code.add("function q(a) {");
		code.add("  if (a ==1) return 1");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}

	public void testFunctionAlwaysReturnValue2() {
		StringList code = new StringList();
		code.add("/** @return {Number|undefined} */");
		code.add("function q(a) {");
		code.add("  if (a ==1) return 1");
		code.add("  return");
		code.add("}");
		// TODO (alex) do we want to suppress this too?
		final List<IProblem> problems = validate(code.toString());
		assertEquals(1, problems.size());
		assertEquals(JavaScriptProblems.RETURN_INCONSISTENT, problems.get(0)
				.getID());
	}

	public void testFunctionWithIfThenNotAllReturningValues() {
		StringList code = new StringList();
		code.add("/** @return {Number|undefined} */");
		code.add("function q(a) {");
		code.add("  if (a ==1) return 1");
		code.add("  else if (a == 2) a = 1");
		code.add("  else if (a == 3) a = 1");
		code.add("  else return 2");
		code.add("}");
		final List<IProblem> problems = validate(code.toString());
		assertEquals(problems.toString(), 0, problems.size());
	}
}
