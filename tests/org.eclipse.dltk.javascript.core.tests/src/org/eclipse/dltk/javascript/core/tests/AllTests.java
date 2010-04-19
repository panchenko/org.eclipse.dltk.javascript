package org.eclipse.dltk.javascript.core.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.dltk.javascript.core.tests.contentassist.CodeCompletion;
import org.eclipse.dltk.javascript.core.tests.contentassist.CompletionStringParsing;
import org.eclipse.dltk.javascript.core.tests.contentassist.XMLCompletionTests;
import org.eclipse.dltk.javascript.core.tests.search.SearchDeclarationTests;
import org.eclipse.dltk.javascript.core.tests.search.SearchReferenceTests;
import org.eclipse.dltk.javascript.core.tests.search.SearchTypeReferenceTests;
import org.eclipse.dltk.javascript.core.tests.structure.JSLintModelTests;
import org.eclipse.dltk.javascript.core.tests.structure.StructureParserTests;
import org.eclipse.dltk.javascript.core.tests.typeinference.TypeInferenceTests;
import org.eclipse.dltk.javascript.core.tests.typeinfo.TypeInfoModelTests;
import org.eclipse.dltk.javascript.core.tests.validation.CodeValidationTests;
import org.eclipse.dltk.javascript.core.tests.validation.FlowValidationTests;
import org.eclipse.dltk.javascript.core.tests.validation.TypeInfoValidationTests;

public class AllTests {

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.dltk.javascript.core");
		// $JUnit-BEGIN$
		suite.addTestSuite(TypeInfoModelTests.class);
		suite.addTestSuite(TypeInferenceTests.class);
		suite.addTestSuite(StructureParserTests.class);
		suite.addTestSuite(TypeInfoValidationTests.class);
		suite.addTestSuite(JSLintModelTests.class);
		suite.addTestSuite(CodeValidationTests.class);
		suite.addTestSuite(FlowValidationTests.class);
		suite.addTestSuite(CodeCompletion.class);
		suite.addTestSuite(XMLCompletionTests.class);
		suite.addTestSuite(CompletionStringParsing.class);
		suite.addTest(SearchDeclarationTests.suite());
		suite.addTest(SearchReferenceTests.suite());
		suite.addTest(SearchTypeReferenceTests.suite());
		// $JUnit-END$
		return suite;
	}

}
