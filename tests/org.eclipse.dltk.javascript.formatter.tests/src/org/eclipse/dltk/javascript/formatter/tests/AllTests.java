/*******************************************************************************
 * Copyright (c) 2009 xored software, Inc.  
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html  
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Vladimir Belov)
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
		suite.addTest(BracesTest.suite());
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
		suite.addTest(RegExpTest.suite());
		suite.addTest(E4XTest.suite());
		// $JUnit-END$
		return suite;
	}

}
