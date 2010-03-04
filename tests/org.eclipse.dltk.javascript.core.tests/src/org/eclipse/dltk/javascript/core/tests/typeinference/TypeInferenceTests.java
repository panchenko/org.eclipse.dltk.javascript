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
package org.eclipse.dltk.javascript.core.tests.typeinference;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import junit.framework.TestCase;

import org.eclipse.dltk.compiler.env.ModuleSource;
import org.eclipse.dltk.compiler.problem.ProblemCollector;
import org.eclipse.dltk.core.tests.util.StringList;
import org.eclipse.dltk.internal.javascript.ti.IValueCollection;
import org.eclipse.dltk.internal.javascript.ti.IValueReference;
import org.eclipse.dltk.internal.javascript.ti.IValueTypeFactory;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencer2;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.parser.JavaScriptParser;
import org.eclipse.dltk.javascript.typeinfo.ITypeNames;
import org.eclipse.dltk.javascript.typeinfo.model.Type;

public class TypeInferenceTests extends TestCase implements ITypeNames {

	private static Script parse(String code) {
		final JavaScriptParser parser = new JavaScriptParser();
		final ProblemCollector reporter = new ProblemCollector();
		final Script script = parser.parse(new ModuleSource(code), reporter);
		if (reporter.hasErrors()) {
			fail(reporter.getErrors().toString());
		}
		return script;
	}

	private static Set<Type> getTypes(String... names) {
		final Set<Type> types = new HashSet<Type>();
		for (String name : names) {
			final Type type = IValueTypeFactory.INSTANCE.get(name);
			assertNotNull(type);
			types.add(type);
		}
		return types;
	}

	private static IValueCollection inference(final String code) {
		TypeInferencer2 inferencer = new TestTypeInferencer2();
		inferencer.doInferencing(parse(code));
		return inferencer.getCollection();
	}

	public void testNumberVar() {
		IValueCollection collection = inference("var a = 1");
		IValueReference a = collection.getChild("a");
		assertEquals(getTypes(NUMBER), a.getTypes());
	}

	public void testStringVar() {
		IValueCollection collection = inference("var a = \"Hello\"");
		IValueReference a = collection.getChild("a");
		assertEquals(getTypes(STRING), a.getTypes());
	}

	public void testBooleanVar() {
		IValueCollection collection = inference("var a = false");
		IValueReference a = collection.getChild("a");
		assertEquals(getTypes(BOOLEAN), a.getTypes());
	}

	public void testXmlVar() {
		IValueCollection collection = inference("var a = <hello/>");
		IValueReference a = collection.getChild("a");
		assertEquals(getTypes(XML), a.getTypes());
	}

	public void testConditionalOperator() {
		IValueCollection collection = inference("var a = isActive ? 1 : 0");
		IValueReference a = collection.getChild("a");
		assertEquals(getTypes(NUMBER), a.getTypes());
	}

	public void testReturnNumber() {
		List<String> lines = new StringList();
		lines.add("var s = 1");
		lines.add("s.execute = function() {");
		lines.add("  return 1");
		lines.add("}");
		lines.add("var z = s.execute()");
		IValueCollection collection = inference(lines.toString());
		IValueReference z = collection.getChild("z");
		assertEquals(getTypes(NUMBER), z.getTypes());
	}

	public void testReturnObjectProperties() {
		List<String> lines = new StringList();
		lines.add("var s = 1");
		lines.add("s.execute = function() {");
		lines.add("  return { a: 1, b: true }");
		lines.add("}");
		lines.add("var z = s.execute()");
		IValueCollection collection = inference(lines.toString());
		IValueReference z = collection.getChild("z");
		assertTrue(z.getTypes().isEmpty());
		final IValueReference a = z.getChild("a");
		assertNotNull(a);
		assertEquals(getTypes(NUMBER), a.getTypes());
		final IValueReference b = z.getChild("b");
		assertNotNull(b);
		assertEquals(getTypes(BOOLEAN), b.getTypes());
	}

	public void testInlineFunctionStatementCall() {
		List<String> lines = new StringList();
		lines.add("var str = (function() {");
		lines.add("  return 'Hello'");
		lines.add("})()");
		IValueCollection collection = inference(lines.toString());
		IValueReference str = collection.getChild("str");
		assertEquals(getTypes(STRING), str.getTypes());
	}

	public void testToStringMethod() {
		List<String> lines = new StringList();
		lines.add("var num = 1");
		lines.add("var str = num.toString()");
		IValueCollection collection = inference(lines.toString());
		IValueReference str = collection.getChild("str");
		assertEquals(getTypes(STRING), str.getTypes());
	}

	public void testFunctionCall() {
		List<String> lines = new StringList();
		lines.add("function hello() {");
		lines.add("  return 'Hello'");
		lines.add("}");
		lines.add("var str = hello()");
		IValueCollection collection = inference(lines.toString());
		IValueReference str = collection.getChild("str");
		assertEquals(getTypes(STRING), str.getTypes());
	}

	public void testIf() {
		List<String> lines = new StringList();
		lines.add("if (1 == 2) {");
		lines.add("  x = 1");
		lines.add("}");
		lines.add("else {");
		lines.add("  x = 'No'");
		lines.add("}");
		IValueCollection collection = inference(lines.toString());
		IValueReference x = collection.getChild("x");
		assertEquals(getTypes(STRING, NUMBER), x.getTypes());
	}

	public void testFor() {
		List<String> lines = new StringList();
		lines.add("for (var i = 0; i < 10; ++i) {");
		lines.add("  x = 'No'");
		lines.add("}");
		IValueCollection collection = inference(lines.toString());
		IValueReference i = collection.getChild("i");
		assertEquals(getTypes(NUMBER), i.getTypes());
		IValueReference x = collection.getChild("x");
		assertEquals(getTypes(STRING), x.getTypes());
	}

	public void testForIn() {
		List<String> lines = new StringList();
		lines.add("for (var i in objectWithIterator) {");
		lines.add("  print(objectWithIterator[i])");
		lines.add("}");
		IValueCollection collection = inference(lines.toString());
		IValueReference i = collection.getChild("i");
		assertEquals(getTypes(STRING), i.getTypes());
	}

	public void testWhile() {
		List<String> lines = new StringList();
		lines.add("while (1 == 2) {");
		lines.add("  x = 'No'");
		lines.add("}");
		IValueCollection collection = inference(lines.toString());
		IValueReference x = collection.getChild("x");
		assertEquals(getTypes(STRING), x.getTypes());
	}

	public void testUnknownVar() {
		List<String> lines = new StringList();
		lines.add("var x = y");
		IValueCollection collection = inference(lines.toString());
		IValueReference x = collection.getChild("x");
		assertEquals(getTypes(), x.getTypes());
		assertNull(collection.getChild("y"));
	}

	public void testUnknownProperty() {
		List<String> lines = new StringList();
		lines.add("var x = {a:1}");
		lines.add("var y = x.b");
		IValueCollection collection = inference(lines.toString());
		IValueReference x = collection.getChild("x");
		assertEquals(getTypes(), x.getTypes());
		assertEquals(Collections.singleton("a"), x.getDirectChildren());
		IValueReference y = collection.getChild("y");
		assertEquals(getTypes(), y.getTypes());
	}

	public void testUnknownProperty3() {
		List<String> lines = new StringList();
		lines.add("x.y.z = 1");
		IValueCollection collection = inference(lines.toString());
		IValueReference x = collection.getChild("x");
		IValueReference y = x.getChild("y");
		IValueReference z = y.getChild("z");
		assertEquals(getTypes(NUMBER), z.getTypes());
	}

	public void testSwitch() {
		List<String> lines = new StringList();
		lines.add("switch(n) {");
		lines.add("case 0: str = 'Zero'; break;");
		lines.add("case 1: str = 'One'; break;");
		lines.add("}");
		IValueCollection collection = inference(lines.toString());
		IValueReference x = collection.getChild("str");
		assertEquals(getTypes(STRING), x.getTypes());
	}

	public void testWith() {
		List<String> lines = new StringList();
		lines.add("var a = {name:1}");
		lines.add("with (a) {");
		lines.add("  name = 'Alex'");
		lines.add("}");
		IValueCollection collection = inference(lines.toString());
		IValueReference a = collection.getChild("a");
		assertEquals(getTypes(), a.getTypes());
		IValueReference name = a.getChild("name");
		assertTrue(name.getTypes().containsAll(getTypes(STRING)));
	}

	public void testNew() {
		List<String> lines = new StringList();
		lines.add("var str = new String()");
		lines.add("var num = new Number()");
		lines.add("var bool = new Boolean()");
		lines.add("var arr = new Array()");
		IValueCollection collection = inference(lines.toString());
		IValueReference str = collection.getChild("str");
		assertEquals(getTypes(STRING), str.getTypes());
		IValueReference num = collection.getChild("num");
		assertEquals(getTypes(NUMBER), num.getTypes());
		IValueReference bool = collection.getChild("bool");
		assertEquals(getTypes(BOOLEAN), bool.getTypes());
		IValueReference arr = collection.getChild("arr");
		assertEquals(getTypes(ARRAY), arr.getTypes());
	}

	public void testRecursion1() {
		List<String> lines = new StringList();
		lines.add("context = { 'index': 1, 'prev': context }");
		lines.add("doSomethind()");
		lines.add("context = context['prev']");
		IValueCollection collection = inference(lines.toString());
		IValueReference context = collection.getChild("context");
		IValueReference index = context.getChild("index");
		assertEquals(getTypes(NUMBER), index.getTypes());
		IValueReference prev = context.getChild("prev");
		assertNotNull(prev);
	}

	public void testRecursion2() {
		List<String> lines = new StringList();
		lines.add("var a = function() { return 1 }");
		lines.add("a.operation2 = a");
		IValueCollection collection = inference(lines.toString());
		IValueReference a = collection.getChild("a");
		assertNotNull(a);
	}

}
