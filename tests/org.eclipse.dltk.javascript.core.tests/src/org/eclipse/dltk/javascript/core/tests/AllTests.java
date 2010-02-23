package org.eclipse.dltk.javascript.core.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.dltk.javascript.core.tests.contentassist.CodeCompletion;
import org.eclipse.dltk.javascript.core.tests.contentassist.CompletionStringParsing;
import org.eclipse.dltk.javascript.core.tests.contentassist.XMLCompletionTests;
import org.eclipse.dltk.javascript.core.tests.structure.JSLintModelTests;
import org.eclipse.dltk.javascript.core.tests.structure.NewStructureParserTests;
import org.eclipse.dltk.javascript.core.tests.structure.StructureParserTests;
import org.eclipse.dltk.javascript.core.tests.typeinference.TypeInferenceTests;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.dltk.javascript.core");
		// $JUnit-BEGIN$
		suite.addTestSuite(TypeInferenceTests.class);
		suite.addTestSuite(StructureParserTests.class);
		suite.addTestSuite(NewStructureParserTests.class);
		suite.addTestSuite(JSLintModelTests.class);
		suite.addTestSuite(CodeCompletion.class);
		suite.addTestSuite(XMLCompletionTests.class);
		suite.addTestSuite(CompletionStringParsing.class);
		// $JUnit-END$
		return suite;
	}

}
