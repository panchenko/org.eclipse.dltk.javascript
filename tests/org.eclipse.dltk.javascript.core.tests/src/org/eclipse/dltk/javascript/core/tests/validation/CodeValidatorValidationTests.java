package org.eclipse.dltk.javascript.core.tests.validation;

import static org.eclipse.dltk.core.tests.TestSupport.notYetImplemented;

import java.util.Set;

import org.eclipse.dltk.compiler.problem.IProblemIdentifier;
import org.eclipse.dltk.core.builder.IBuildParticipant;
import org.eclipse.dltk.core.tests.TestSupport;
import org.eclipse.dltk.core.tests.util.StringList;
import org.eclipse.dltk.internal.javascript.validation.TypeInfoValidator;
import org.eclipse.dltk.javascript.core.JavaScriptProblems;
import org.eclipse.dltk.javascript.core.tests.AbstractValidationTest;
import org.eclipse.dltk.javascript.parser.JavaScriptParserProblems;

@SuppressWarnings("restriction")
public class CodeValidatorValidationTests extends AbstractValidationTest {

	@Override
	protected IBuildParticipant createValidator() {
		return new TypeInfoValidator();
	}

	public void testFunctionHidesNestedFunction() {
		StringList code = new StringList();
		code.add("function test() {");
		code.add(" function test() {");
		code.add(" }");
		code.add("}");
		final Set<IProblemIdentifier> problemIds = extractIds(validate(code
				.toString()));
		assertEquals(1, problemIds.size());
		assertTrue(problemIds
				.contains(JavaScriptProblems.FUNCTION_HIDES_FUNCTION));

	}

	public void testFunctionHidesFunction() {
		StringList code = new StringList();
		code.add("function test() {");
		code.add("}");
		code.add("function test() {");
		code.add("}");
		final Set<IProblemIdentifier> problemIds = extractIds(validate(code
				.toString()));
		assertEquals(problemIds.toString(), 1, problemIds.size());
		assertTrue(problemIds
				.contains(JavaScriptParserProblems.DUPLICATE_FUNCTION));

	}

	public void testFunctionHidesVariable() {
		StringList code = new StringList();
		code.add("var test;");
		code.add("function test() {");
		code.add("}");
		final Set<IProblemIdentifier> problemIds = extractIds(validate(code
				.toString()));
		assertEquals(problemIds.toString(), 1, problemIds.size());
		assertTrue(
				problemIds.toString(),
				problemIds
						.contains(JavaScriptParserProblems.FUNCTION_DUPLICATES_OTHER));
	}

	public void testArgumentHidesVariable() {
		StringList code = new StringList();
		code.add("var test;");
		code.add("function test2(test) {");
		code.add("}");
		final Set<IProblemIdentifier> problemIds = extractIds(validate(code
				.toString()));
		assertEquals(1, problemIds.size());
		assertTrue(problemIds.toString(),
				problemIds
						.contains(JavaScriptProblems.PARAMETER_HIDES_VARIABLE));
	}

	public void testArgumentHidesFunciton() {
		StringList code = new StringList();
		code.add("function test(){}");
		code.add("function test2(test) {");
		code.add("}");
		final Set<IProblemIdentifier> problemIds = extractIds(validate(code
				.toString()));
		assertEquals(1, problemIds.size());
		assertTrue(problemIds.toString(),
				problemIds
						.contains(JavaScriptProblems.PARAMETER_HIDES_FUNCTION));
	}

	public void testVariableHidesArgument() {
		StringList code = new StringList();
		code.add("function test2(test) {");
		code.add("var test;");
		code.add("}");
		final Set<IProblemIdentifier> problemIds = extractIds(validate(code
				.toString()));
		assertEquals(problemIds.toString(), 1, problemIds.size());
		assertTrue(
				problemIds.toString(),
				problemIds
						.contains(JavaScriptParserProblems.VAR_DUPLICATES_OTHER));
	}

	public void testVariableHidesOwnFunction() {
		StringList code = new StringList();
		code.add("function test() {");
		code.add("var test;");
		code.add("}");
		final Set<IProblemIdentifier> problemIds = extractIds(validate(code
				.toString()));
		assertEquals(1, problemIds.size());
		assertTrue(problemIds.toString(),
				problemIds.contains(JavaScriptProblems.VAR_HIDES_FUNCTION));
	}

	public void testVariableHidesFunction() {
		StringList code = new StringList();
		code.add("function test() {}");
		code.add("function test1() {");
		code.add("var test;");
		code.add("}");
		final Set<IProblemIdentifier> problemIds = extractIds(validate(code
				.toString()));
		assertEquals(1, problemIds.size());
		assertTrue(problemIds.toString(),
				problemIds.contains(JavaScriptProblems.VAR_HIDES_FUNCTION));

	}

	public void testPrivateFunctionAccessedAsVariable() {
		if (TestSupport.notYetImplemented(this))
			return;
		StringList code = new StringList();
		code.add("function test1() {");
		code.add(" /** @private */");
		code.add(" this.a = function() {");
		code.add(" }");
		code.add("}");
		code.add("function test2() {");
		code.add(" var b = new test1();");
		code.add(" b.a");
		code.add("}");
		final Set<IProblemIdentifier> problemIds = extractIds(validate(code
				.toString()));
		assertEquals(1, problemIds.size());
		assertTrue(problemIds.toString(),
				problemIds.contains(JavaScriptProblems.PRIVATE_FUNCTION));

	}

	public void testUnusedTopLevelVariable() {
		enable(JavaScriptProblems.UNUSED_VARIABLE);
		StringList code = new StringList();
		code.add("var x = 1");
		code.add("x = 2");
		code.add("x = 3");
		final Set<IProblemIdentifier> problemIds = extractIds(validate(code
				.toString()));
		assertEquals(0, problemIds.size());
	}

	public void testUnusedTopLevelPrivateVariable() {
		enable(JavaScriptProblems.UNUSED_VARIABLE);
		StringList code = new StringList();
		code.add("/** @private */");
		code.add("var x = 1");
		code.add("x = 2");
		code.add("x = 3");
		final Set<IProblemIdentifier> problemIds = extractIds(validate(code
				.toString()));
		assertEquals(1, problemIds.size());
		assertTrue(problemIds.toString(),
				problemIds.contains(JavaScriptProblems.UNUSED_VARIABLE));
	}

	public void testUnusedVariable() {
		enable(JavaScriptProblems.UNUSED_VARIABLE);
		StringList code = new StringList();
		code.add("function test() {");
		code.add("var x = 1");
		code.add("x = 2");
		code.add("x = 3");
		code.add("}");
		final Set<IProblemIdentifier> problemIds = extractIds(validate(code
				.toString()));
		assertEquals(1, problemIds.size());
		assertTrue(problemIds.toString(),
				problemIds.contains(JavaScriptProblems.UNUSED_VARIABLE));
	}

	
	public void testUnusedVariableInFunctionSuppressed() {
		enable(JavaScriptProblems.UNUSED_VARIABLE);
		StringList code = new StringList();
		code.add("/**");
		code.add(" * @SuppressWarnings(unused)");
		code.add(" */");		
		code.add("function test() {");
		code.add("var x = 1");
		code.add("x = 2");
		code.add("x = 3");
		code.add("}");
		final Set<IProblemIdentifier> problemIds = extractIds(validate(code
				.toString()));
		assertEquals(0, problemIds.size());
	}
	public void testUnusedVariableSuppressed() {
		enable(JavaScriptProblems.UNUSED_VARIABLE);
		StringList code = new StringList();
		code.add("/**");
		code.add(" * @SuppressWarnings(unused)");
		code.add(" * @private");
		code.add(" */");
		code.add("var x = 1");
		code.add("x = 2");
		code.add("x = 3");
		final Set<IProblemIdentifier> problemIds = extractIds(validate(code
				.toString()));
		assertEquals(problemIds.toString(), 0, problemIds.size());
	}

	public void testVariableUsedInFunction() {
		enable(JavaScriptProblems.UNUSED_VARIABLE);
		StringList code = new StringList();
		code.add("/** @private */");
		code.add("var x = 1");
		code.add("function q() { return x; }");
		final Set<IProblemIdentifier> problemIds = extractIds(validate(code
				.toString()));
		assertEquals(problemIds.toString(), 0, problemIds.size());
	}

	public void testVariableUsedInNot() {
		enable(JavaScriptProblems.UNUSED_VARIABLE);
		StringList code = new StringList();
		code.add("/** @private */");
		code.add("var x = 1");
		code.add("function q() { return !x; }");
		final Set<IProblemIdentifier> problemIds = extractIds(validate(code
				.toString()));
		assertEquals(problemIds.toString(), 0, problemIds.size());
	}

	public void testVariableUnusedWithIncrement() {
		enable(JavaScriptProblems.UNUSED_VARIABLE);
		StringList code = new StringList();
		code.add("/** @private */");
		code.add("var x = 0");
		code.add("function q() { ++x; }");
		final Set<IProblemIdentifier> problemIds = extractIds(validate(code
				.toString()));
		assertEquals(problemIds.toString(), 1, problemIds.size());
	}

	public void testVariableUsedReturnIncrement() {
		enable(JavaScriptProblems.UNUSED_VARIABLE);
		StringList code = new StringList();
		code.add("/** @private */");
		code.add("var x = 0");
		code.add("function q() { return ++x; }");
		final Set<IProblemIdentifier> problemIds = extractIds(validate(code
				.toString()));
		assertEquals(problemIds.toString(), 0, problemIds.size());
	}

	public void testPrototypeChainWithPropetiesWithTypeDeclarationDeprected() {
		final StringList code = new StringList();
		code.add("function BaseEntity() {}");
		code.add("/**");
		code.add(" * @extends {BaseEntity}");
		code.add(" */");
		code.add("function ExtendedEntity() {}");
		code.add("ExtendedEntity.prototype = Object.create(BaseEntity.prototype, {");
		code.add("/**");
		code.add(" * @type {String}");
		code.add(" * @deprecated");
		code.add(" */");
		code.add("foo: {configurable: false,get: function() { return 10 },set: function(value){ },value: null},");
		code.add("bar:{ writable:true, configurable:true, value: 'hello' }});");
		code.add("function test() {");
		code.add("	var x = new ExtendedEntity();");
		code.add("	x.foo;");
		code.add("}");
		final Set<IProblemIdentifier> problemIds = extractIds(validate(code
				.toString()));
		assertEquals(problemIds.toString(), 1, problemIds.size());
		assertTrue(problemIds.toString(),
				problemIds.contains(JavaScriptProblems.DEPRECATED_PROPERTY));
	}
	
	public void testPrototypeChainWithPropetiesDeprected() {
		final StringList code = new StringList();
		code.add("function BaseEntity() {}");
		code.add("/**");
		code.add(" * @extends {BaseEntity}");
		code.add(" */");
		code.add("function ExtendedEntity() {}");
		code.add("ExtendedEntity.prototype = Object.create(BaseEntity.prototype, {");
		code.add("/**");
		code.add(" * @type {String}");
		code.add(" */");
		code.add("foo: {configurable: false,get: function() { return 10 },set: function(value){ },value: null},");
		code.add("/**");
		code.add(" * @deprecated");  
		code.add(" */");
		code.add("bar:{ writable:true, configurable:true, value: 'hello' }});");
		code.add("function test() {");
		code.add("	var x = new ExtendedEntity();");
		code.add("	x.bar;");
		code.add("}");
		final Set<IProblemIdentifier> problemIds = extractIds(validate(code
				.toString()));
		assertEquals(problemIds.toString(), 1, problemIds.size());
		assertTrue(problemIds.toString(),
				problemIds.contains(JavaScriptProblems.DEPRECATED_PROPERTY));
	}
}
