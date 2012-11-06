package org.eclipse.dltk.javascript.core.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import org.eclipse.dltk.javascript.core.tests.builder.BuildChangeTests;
import org.eclipse.dltk.javascript.core.tests.contentassist.CodeCompletion;
import org.eclipse.dltk.javascript.core.tests.contentassist.CompletionStringParsing;
import org.eclipse.dltk.javascript.core.tests.contentassist.SelectionTests;
import org.eclipse.dltk.javascript.core.tests.contentassist.StandardTypeMemberTests;
import org.eclipse.dltk.javascript.core.tests.contentassist.XMLCompletionTests;
import org.eclipse.dltk.javascript.core.tests.rewrite.VariableRemoveTest;
import org.eclipse.dltk.javascript.core.tests.search.SearchDeclarationTests;
import org.eclipse.dltk.javascript.core.tests.search.SearchExternalLibraryTests;
import org.eclipse.dltk.javascript.core.tests.search.SearchFieldTests;
import org.eclipse.dltk.javascript.core.tests.search.SearchFunctionTests;
import org.eclipse.dltk.javascript.core.tests.search.SearchLocalsTests;
import org.eclipse.dltk.javascript.core.tests.search.SearchReferenceTests;
import org.eclipse.dltk.javascript.core.tests.search.SearchTypeReferenceTests;
import org.eclipse.dltk.javascript.core.tests.structure.JSLintModelTests;
import org.eclipse.dltk.javascript.core.tests.structure.StructureParserTests;
import org.eclipse.dltk.javascript.core.tests.typeinference.TypeInferenceTests;
import org.eclipse.dltk.javascript.core.tests.typeinfo.JSDocSupportTests;
import org.eclipse.dltk.javascript.core.tests.typeinfo.JSDocTypeParserTests;
import org.eclipse.dltk.javascript.core.tests.typeinfo.CommonSuperTypeFinderTest;
import org.eclipse.dltk.javascript.core.tests.typeinfo.RTypeTests;
import org.eclipse.dltk.javascript.core.tests.typeinfo.TypeInfoModelTests;
import org.eclipse.dltk.javascript.core.tests.typeinfo.TypeMemberQueryTest;
import org.eclipse.dltk.javascript.core.tests.typeinfo.TypeParameterizerTests;
import org.eclipse.dltk.javascript.core.tests.typeinfo.TypeQueryTests;
import org.eclipse.dltk.javascript.core.tests.typeinfo.RTypeDeclarationTests;
import org.eclipse.dltk.javascript.core.tests.validation.CodeValidationTests;
import org.eclipse.dltk.javascript.core.tests.validation.CodeValidatorValidationTests;
import org.eclipse.dltk.javascript.core.tests.validation.FlowTypeInfoValidationTests;
import org.eclipse.dltk.javascript.core.tests.validation.FlowValidationTests;
import org.eclipse.dltk.javascript.core.tests.validation.JSDocValidationTest;
import org.eclipse.dltk.javascript.core.tests.validation.TypeInfoValidationTests;

public class AllTests {

	public static final String PLUGIN_ID = "org.eclipse.dltk.javascript.core.tests";

	public static Test suite() {
		TestSuite suite = new TestSuite(
				"Test for org.eclipse.dltk.javascript.core");
		// $JUnit-BEGIN$
		suite.addTestSuite(TypeMemberQueryTest.class);
		suite.addTestSuite(BuildChangeTests.class);
		suite.addTestSuite(TypeInfoModelTests.class);
		suite.addTestSuite(TypeQueryTests.class);
		suite.addTestSuite(RTypeTests.class);
		suite.addTestSuite(CommonSuperTypeFinderTest.class);
		suite.addTestSuite(TypeInferenceTests.class);
		suite.addTestSuite(StructureParserTests.class);
		suite.addTestSuite(TypeInfoValidationTests.class);
		suite.addTestSuite(FlowTypeInfoValidationTests.class);
		suite.addTestSuite(JSDocTypeParserTests.class);
		suite.addTestSuite(JSDocSupportTests.class);
		suite.addTestSuite(JSLintModelTests.class);
		suite.addTestSuite(CodeValidationTests.class);
		suite.addTestSuite(FlowValidationTests.class);
		suite.addTestSuite(CodeValidatorValidationTests.class);
		suite.addTestSuite(JSDocValidationTest.class);
		suite.addTestSuite(StandardTypeMemberTests.class);
		suite.addTestSuite(CodeCompletion.class);
		suite.addTestSuite(XMLCompletionTests.class);
		suite.addTestSuite(CompletionStringParsing.class);
		suite.addTestSuite(TypeParameterizerTests.class);
		suite.addTestSuite(RTypeDeclarationTests.class);
		suite.addTest(SearchDeclarationTests.suite());
		suite.addTest(SearchReferenceTests.suite());
		suite.addTest(SearchTypeReferenceTests.suite());
		suite.addTest(SelectionTests.suite());
		suite.addTest(SearchFieldTests.suite());
		suite.addTest(SearchLocalsTests.suite());
		suite.addTest(SearchFunctionTests.suite());
		suite.addTest(SearchExternalLibraryTests.suite());
		suite.addTestSuite(VariableRemoveTest.class);
		// $JUnit-END$
		return suite;
	}

}
