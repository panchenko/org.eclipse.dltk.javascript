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

import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.dltk.compiler.problem.IProblem;
import org.eclipse.dltk.core.builder.IBuildParticipant;
import org.eclipse.dltk.javascript.parser.tests.AbstractJSParserTest;

public abstract class AbstractValidationTest extends AbstractJSParserTest {

	protected abstract IBuildParticipant createValidator();

	protected List<IProblem> validate(String content) {
		final TestBuildContext context = new TestBuildContext(content);
		try {
			createValidator().build(context);
		} catch (CoreException e) {
			fail(e.getMessage());
		}
		return context.getProblems();
	}

}
