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

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import junit.framework.TestCase;

import org.eclipse.dltk.compiler.env.ModuleSource;
import org.eclipse.dltk.compiler.problem.ProblemCollector;
import org.eclipse.dltk.internal.javascript.ti.IValueCollection;
import org.eclipse.dltk.internal.javascript.ti.IValueReference;
import org.eclipse.dltk.internal.javascript.ti.IValueTypeFactory;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencer2;
import org.eclipse.dltk.internal.javascript.typeinference.ReferenceFactory;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.internal.model.references.Type;
import org.eclipse.dltk.javascript.parser.JavaScriptParser;
import org.eclipse.dltk.utils.TextUtils;

public class TypeInferenceTests extends TestCase {

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
		TypeInferencer2 inferencer = new TypeInferencer2();
		inferencer.doInferencing(parse(code));
		return inferencer.getCollection();
	}

	private static IValueCollection inference(List<String> lines) {
		return inference(TextUtils.join(lines, '\n'));
	}

	public void testNumberVar() {
		IValueCollection collection = inference("var a = 1");
		IValueReference a = collection.getChild("a");
		assertEquals(getTypes(ReferenceFactory.NUMBER), a.getTypes());
	}

	public void testStringVar() {
		IValueCollection collection = inference("var a = \"Hello\"");
		IValueReference a = collection.getChild("a");
		assertEquals(getTypes(ReferenceFactory.STRING), a.getTypes());
	}

	public void testBooleanVar() {
		IValueCollection collection = inference("var a = false");
		IValueReference a = collection.getChild("a");
		assertEquals(getTypes(ReferenceFactory.BOOLEAN), a.getTypes());
	}

	public void testXmlVar() {
		IValueCollection collection = inference("var a = <hello/>");
		IValueReference a = collection.getChild("a");
		assertEquals(getTypes(ReferenceFactory.XML), a.getTypes());
	}

	public void testConditionalOperator() {
		IValueCollection collection = inference("var a = isActive ? 1 : 0");
		IValueReference a = collection.getChild("a");
		assertEquals(getTypes(ReferenceFactory.NUMBER), a.getTypes());
	}

	public void testReturnNumber() {
		List<String> lines = new ArrayList<String>();
		lines.add("var s = 1");
		lines.add("s.execute = function() {");
		lines.add("  return 1");
		lines.add("}");
		lines.add("var z = s.execute()");
		IValueCollection collection = inference(lines);
		IValueReference z = collection.getChild("z");
		assertEquals(getTypes(ReferenceFactory.NUMBER), z.getTypes());
	}

	public void testReturnObjectProperties() {
		List<String> lines = new ArrayList<String>();
		lines.add("var s = 1");
		lines.add("s.execute = function() {");
		lines.add("  return { a: 1, b: true }");
		lines.add("}");
		lines.add("var z = s.execute()");
		IValueCollection collection = inference(lines);
		IValueReference z = collection.getChild("z");
		assertTrue(z.getTypes().isEmpty());
		final IValueReference a = z.getChild("a");
		assertNotNull(a);
		assertEquals(getTypes(ReferenceFactory.NUMBER), a.getTypes());
		final IValueReference b = z.getChild("b");
		assertNotNull(b);
		assertEquals(getTypes(ReferenceFactory.BOOLEAN), b.getTypes());
	}

	public void testInlineFunctionStatementCall() {
		List<String> lines = new ArrayList<String>();
		lines.add("var str = (function() {");
		lines.add("  return 'Hello'");
		lines.add("})()");
		IValueCollection collection = inference(lines);
		IValueReference str = collection.getChild("str");
		assertEquals(getTypes(ReferenceFactory.STRING), str.getTypes());
	}

	public void testToStringMethod() {
		List<String> lines = new ArrayList<String>();
		lines.add("var num = 1");
		lines.add("var str = num.toString()");
		IValueCollection collection = inference(lines);
		IValueReference str = collection.getChild("str");
		assertEquals(getTypes(ReferenceFactory.STRING), str.getTypes());
	}

	public void testFunctionCall() {
		List<String> lines = new ArrayList<String>();
		lines.add("function hello() {");
		lines.add("  return 'Hello'");
		lines.add("}");
		lines.add("var str = hello()");
		IValueCollection collection = inference(lines);
		IValueReference str = collection.getChild("str");
		assertEquals(getTypes(ReferenceFactory.STRING), str.getTypes());
	}

	public void testIf() {
		List<String> lines = new ArrayList<String>();
		lines.add("if (1 == 2) {");
		lines.add("  x = 1");
		lines.add("}");
		lines.add("else {");
		lines.add("  x = 'No'");
		lines.add("}");
		IValueCollection collection = inference(lines);
		IValueReference x = collection.getChild("x");
		assertEquals(
				getTypes(ReferenceFactory.STRING, ReferenceFactory.NUMBER), x
						.getTypes());
	}

	public void testFor() {
		List<String> lines = new ArrayList<String>();
		lines.add("for (var i = 0; i < 10; ++i) {");
		lines.add("  x = 'No'");
		lines.add("}");
		IValueCollection collection = inference(lines);
		IValueReference i = collection.getChild("i");
		assertEquals(getTypes(ReferenceFactory.NUMBER), i.getTypes());
		IValueReference x = collection.getChild("x");
		assertEquals(getTypes(ReferenceFactory.STRING), x.getTypes());
	}

	public void testForIn() {
		List<String> lines = new ArrayList<String>();
		lines.add("for (var i in objectWithIterator) {");
		lines.add("  print(objectWithIterator[i])");
		lines.add("}");
		IValueCollection collection = inference(lines);
		IValueReference i = collection.getChild("i");
		assertEquals(getTypes(ReferenceFactory.STRING), i.getTypes());
	}

	public void testWhile() {
		List<String> lines = new ArrayList<String>();
		lines.add("while (1 == 2) {");
		lines.add("  x = 'No'");
		lines.add("}");
		IValueCollection collection = inference(lines);
		IValueReference x = collection.getChild("x");
		assertEquals(getTypes(ReferenceFactory.STRING), x.getTypes());
	}

	public void testUnknownVar() {
		List<String> lines = new ArrayList<String>();
		lines.add("var x = y");
		IValueCollection collection = inference(lines);
		IValueReference x = collection.getChild("x");
		assertEquals(getTypes(), x.getTypes());
		assertNull(collection.getChild("y"));
	}

	public void testUnknownProperty() {
		List<String> lines = new ArrayList<String>();
		lines.add("var x = {a:1}");
		lines.add("var y = x.b");
		IValueCollection collection = inference(lines);
		IValueReference x = collection.getChild("x");
		assertEquals(getTypes(), x.getTypes());
		assertEquals(Collections.singleton("a"), x.getDirectChildren());
		IValueReference y = collection.getChild("y");
		assertEquals(getTypes(), y.getTypes());
	}

	public void testUnknownProperty3() {
		List<String> lines = new ArrayList<String>();
		lines.add("x.y.z = 1");
		IValueCollection collection = inference(lines);
		IValueReference x = collection.getChild("x");
		IValueReference y = x.getChild("y");
		IValueReference z = y.getChild("z");
		assertEquals(getTypes(ReferenceFactory.NUMBER), z.getTypes());
	}

	public void testSwitch() {
		List<String> lines = new ArrayList<String>();
		lines.add("switch(n) {");
		lines.add("case 0: str = 'Zero'; break;");
		lines.add("case 1: str = 'One'; break;");
		lines.add("}");
		IValueCollection collection = inference(lines);
		IValueReference x = collection.getChild("str");
		assertEquals(getTypes(ReferenceFactory.STRING), x.getTypes());
	}

}
