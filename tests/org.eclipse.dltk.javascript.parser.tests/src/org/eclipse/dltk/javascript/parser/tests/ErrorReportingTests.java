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

import org.eclipse.dltk.javascript.ast.Script;

public class ErrorReportingTests extends AbstractJSParserTest {

	public void test1() {
		Script script = parseRaw("a.");
		assertTrue(reporter.hasErrors());
		assertEquals(1, reporter.getErrors().size());
		System.out.println(reporter.getErrors());
	}

}
