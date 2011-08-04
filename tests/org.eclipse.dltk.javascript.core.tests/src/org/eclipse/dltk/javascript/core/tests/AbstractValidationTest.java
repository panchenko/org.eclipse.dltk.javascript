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
package org.eclipse.dltk.javascript.core.tests;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.dltk.compiler.problem.IProblem;
import org.eclipse.dltk.compiler.problem.IProblemIdentifier;
import org.eclipse.dltk.core.builder.IBuildParticipant;
import org.eclipse.dltk.javascript.core.JavaScriptProblems;
import org.eclipse.dltk.javascript.core.tests.validation.TestBuildContext;
import org.eclipse.dltk.javascript.parser.tests.AbstractJSParserTest;

public abstract class AbstractValidationTest extends AbstractJSParserTest {

	protected abstract IBuildParticipant createValidator();

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		disabledProblems.clear();
		disable(JavaScriptProblems.UNUSED_VARIABLE);
	}

	private final Set<IProblemIdentifier> disabledProblems = new HashSet<IProblemIdentifier>();

	protected void enable(IProblemIdentifier identifier) {
		disabledProblems.remove(identifier);
	}

	protected void disable(IProblemIdentifier identifier) {
		disabledProblems.add(identifier);
	}

	protected List<IProblem> validate(String content) {
		final TestBuildContext context = new TestBuildContext(content);
		try {
			createValidator().build(context);
		} catch (CoreException e) {
			fail(e.getMessage());
		}
		final List<IProblem> problems = new ArrayList<IProblem>(
				context.getProblems());
		for (Iterator<IProblem> i = problems.iterator(); i.hasNext();) {
			final IProblem problem = i.next();
			if (disabledProblems.contains(problem.getID())) {
				i.remove();
			}
		}
		return problems;
	}

}
