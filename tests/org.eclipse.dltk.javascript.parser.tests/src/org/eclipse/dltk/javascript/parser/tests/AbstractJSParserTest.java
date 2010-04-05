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
package org.eclipse.dltk.javascript.parser.tests;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.compiler.problem.IProblem;
import org.eclipse.dltk.compiler.problem.ProblemCollector;
import org.eclipse.dltk.javascript.ast.DecimalLiteral;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.parser.JSProblem;
import org.eclipse.dltk.javascript.parser.JavaScriptParser;

public abstract class AbstractJSParserTest extends TestCase {

	protected final ProblemCollector reporter = new ProblemCollector();
	protected final JavaScriptParser parser = new JavaScriptParser();

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		reporter.reset();
		parser.setTypeInformationEnabled(false);
	}

	protected Script parseRaw(final String source) {
		return parser.parse(source, reporter);
	}

	protected Script parse(final String source) {
		final Script script = parseRaw(source);
		if (!script.getStatements().isEmpty()) {
			new ASTVerifier(script, source).verify();
		}
		assertNotNull(script);
		for (IProblem problem : reporter.getProblems()) {
			if (problem instanceof JSProblem) {
				rethrow(((JSProblem) problem).getCause());
			}
		}
		return script;
	}

	protected static <E> E uniqueResult(List<E> elements) {
		if (elements.size() == 1) {
			return elements.get(0);
		} else {
			throw new AssertionFailedError("Single element expected");
		}
	}

	protected static void rethrow(final Throwable cause) {
		if (cause instanceof RuntimeException) {
			throw (RuntimeException) cause;
		} else if (cause instanceof Error) {
			throw (Error) cause;
		} else {
			throw new RuntimeException(cause);
		}
	}

	protected static void assertIdentifier(String expected, ASTNode id) {
		assertEquals(expected, ((Identifier) id).getName());
	}

	protected static void assertDecimal(String expected, ASTNode decimal) {
		assertEquals(expected, ((DecimalLiteral) decimal).getText());
	}

	public int getProblemId() {
		final Set<Integer> problemIds = getProblemIds();
		assertEquals(1, problemIds.size());
		return problemIds.toArray(new Integer[1])[0].intValue();
	}

	public Set<Integer> getProblemIds() {
		return extractIds(reporter.getProblems());
	}

	protected Set<Integer> extractIds(final List<IProblem> problems) {
		final Set<Integer> ids = new HashSet<Integer>();
		for (IProblem problem : problems) {
			ids.add(problem.getID());
		}
		return ids;
	}

}
