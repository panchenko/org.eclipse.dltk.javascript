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
package org.eclipse.dltk.javascript.core.tests.structure;

import junit.framework.TestCase;

import org.eclipse.dltk.compiler.env.ModuleSource;
import org.eclipse.dltk.core.ISourceElementParser;

public class StructureParserTests extends TestCase {

	protected ISourceElementParser createParser() {
		return new TestJavaScriptSourceElementParser();
	}

	protected Root parse(String code) {
		Recorder rec = new Recorder();
		ISourceElementParser parser = createParser();
		parser.setRequestor(rec);
		parser.parseSourceModule(new ModuleSource(code));
		return rec.getRoot();
	}

	protected Root parse(String... code) {
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < code.length; ++i) {
			if (i != 0) {
				sb.append("\n");
			}
			sb.append(code[i]);
		}
		return parse(sb.toString());
	}

	public void testMethod() {
		Root root = parse("function hello(){}");
		assertEquals(new Root(new Method("hello")), root);
	}

	public void testMethodWithParams() {
		Root root = parse("function hello(name){}");
		assertEquals(new Root(new Method("hello", new Parameter("name"))), root);
	}

	public void testField() {
		Root root = parse("var x = 1");
		assertEquals(new Root(new Field("x")), root);
	}

	public void testMethodField() {
		Root root = parse("function hello(){var x = 1}");
		assertEquals(new Root(new Method("hello").add(new Field("x"))), root);
	}

	public void testMethodFieldMethod() {
		Root root = parse("function hello() { var a = { z: function() { } } }");
		assertEquals(new Root(new Method("hello").add(new Field("a")
				.add(new Method("z")))), root);
	}

	public void testMethodMethod() {
		Root root = parse("function hello() { function world() { } }");
		assertEquals(new Root(new Method("hello").add(new Method("world"))),
				root);
	}

	public void testMethodReference() {
		Root root = parse("var x = calculate()");
		assertEquals(new Root(new Field("x"), new MethodRef("calculate")), root);
	}

	public void testFieldReference() {
		Root root = parse("var x = database.get()");
		assertEquals(new Root(new Field("x"), new FieldRef("database"),
				new MethodRef("get")), root);
	}

	public void testFunctionFieldReference() {
		Root root = parse("function run() {var x = database.get()}");
		assertEquals(new Root(new Method("run").add(new Field("x"),
				new FieldRef("database"), new MethodRef("get"))), root);
	}

	public void testManyFunctionCalls() {
		Root root = parse("function a(){x=1} a();fa=1;",
				"function b(){y=2} b();fb=2;", "function c(){z=3} c();fc=3;");
		Root expected = new Root();
		expected.add(new Method("a").add(new FieldRef("x")),
				new MethodRef("a"), new FieldRef("fa"));
		expected.add(new Method("b").add(new FieldRef("y")),
				new MethodRef("b"), new FieldRef("fb"));
		expected.add(new Method("c").add(new FieldRef("z")),
				new MethodRef("c"), new FieldRef("fc"));
		assertEquals(expected, root);
	}
}
