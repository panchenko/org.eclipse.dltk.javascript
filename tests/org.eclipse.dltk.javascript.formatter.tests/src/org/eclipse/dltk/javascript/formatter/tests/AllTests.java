/*******************************************************************************
 * Copyright (c) 2008 xored software, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.formatter.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	static final String CHARSET = "ISO-8859-1";

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.dltk.javascript.formatter.tests");
		// $JUnit-BEGIN$
		suite.addTest(IfStatementTest.suite());
		suite.addTest(FunctionTest.suite());
		suite.addTest(DoWhileTest.suite());
		suite.addTest(OptionsTest.suite());
		suite.addTest(CommentsTest.suite());
		suite.addTest(SwitchTest.suite());
		suite.addTest(TryCatchTest.suite());
		suite.addTest(SpacesTest.suite());
		suite.addTest(BlockTest.suite());
		suite.addTest(ForStatementTest.suite());
		suite.addTest(WhileTest.suite());
		// $JUnit-END$
		return suite;
	}

}
