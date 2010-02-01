package org.eclipse.dltk.javascript.core.tests;

import org.eclipse.dltk.javascript.core.tests.contentassist.CodeCompletion;
import org.eclipse.dltk.javascript.core.tests.contentassist.CompletionStringParsing;
import org.eclipse.dltk.javascript.core.tests.contentassist.XMLCompletionTests;

import junit.framework.Test;
import junit.framework.TestSuite;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.dltk.javascript.core");
		// $JUnit-BEGIN$
		suite.addTestSuite(CodeCompletion.class);
		suite.addTestSuite(XMLCompletionTests.class);
		suite.addTestSuite(CompletionStringParsing.class);
		// $JUnit-END$
		return suite;
	}

}
