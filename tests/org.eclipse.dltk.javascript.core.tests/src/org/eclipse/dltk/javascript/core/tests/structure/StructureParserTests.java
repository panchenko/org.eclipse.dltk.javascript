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
import org.eclipse.dltk.internal.javascript.parser.JavaScriptSourceElementParser;

public class StructureParserTests extends TestCase {

	protected ISourceElementParser createParser() {
		return new JavaScriptSourceElementParser();
	}

	protected Root parse(String code) {
		Recorder rec = new Recorder();
		ISourceElementParser parser = createParser();
		parser.setRequestor(rec);
		parser.parseSourceModule(new ModuleSource(code));
		return rec.getRoot();
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
		assertEquals(new Root(new Method("hello").addChild(new Field("x"))),
				root);
	}

	public void testMethodFieldMethod() {
		Root root = parse("function hello() { var a = { z: function() { } } }");
		assertEquals(new Root(new Method("hello").addChild(new Field("a")
				.addChild(new Method("z")))), root);
	}

	public void testMethodMethod() {
		Root root = parse("function hello() { function world() { } }");
		assertEquals(
				new Root(new Method("hello").addChild(new Method("world"))),
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
}
