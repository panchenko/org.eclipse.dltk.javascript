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

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"org.eclipse.dltk.javascript.parser.tests");
		// $JUnit-BEGIN$
		suite.addTestSuite(VariableDeclarationTests.class);
//		suite.addTestSuite(XmlQueryTests.class);
//		suite.addTestSuite(XmlLiteralTests.class);
		// $JUnit-END$
		return suite;
	}

}
