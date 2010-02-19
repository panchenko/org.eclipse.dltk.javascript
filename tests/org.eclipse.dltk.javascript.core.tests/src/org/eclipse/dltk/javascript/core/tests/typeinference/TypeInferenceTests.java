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
import java.util.List;
import java.util.Set;

import junit.framework.TestCase;

import org.eclipse.dltk.compiler.env.ModuleSource;
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
		JavaScriptParser parser = new JavaScriptParser();
		return parser.parse(new ModuleSource(code), null);
	}

	private static Set<Type> getTypes(String name) {
		return Collections.singleton(IValueTypeFactory.INSTANCE.get(name));
	}

	private static IValueCollection inference(final String code) {
		TypeInferencer2 inferencer = new TypeInferencer2();
		inferencer.doInferencing(parse(code));
		return inferencer.getCollection();
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
		IValueCollection collection = inference(TextUtils.join(lines, "\n"));
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
		IValueCollection collection = inference(TextUtils.join(lines, "\n"));
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
		IValueCollection collection = inference(TextUtils.join(lines, "\n"));
		IValueReference str = collection.getChild("str");
		assertEquals(getTypes(ReferenceFactory.STRING), str.getTypes());
	}

	public void testToStringMethod() {
		List<String> lines = new ArrayList<String>();
		lines.add("var num = 1");
		lines.add("var str = num.toString()");
		IValueCollection collection = inference(TextUtils.join(lines, "\n"));
		IValueReference str = collection.getChild("str");
		assertEquals(getTypes(ReferenceFactory.STRING), str.getTypes());
	}

	public void testFunctionCall() {
		List<String> lines = new ArrayList<String>();
		lines.add("function hello() {");
		lines.add("  return 'Hello'");
		lines.add("}");
		lines.add("var str = hello()");
		IValueCollection collection = inference(TextUtils.join(lines, "\n"));
		IValueReference str = collection.getChild("str");
		assertEquals(getTypes(ReferenceFactory.STRING), str.getTypes());
	}

}
