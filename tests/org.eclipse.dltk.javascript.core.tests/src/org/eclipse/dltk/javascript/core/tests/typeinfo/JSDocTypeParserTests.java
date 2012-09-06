/*******************************************************************************
 * Copyright (c) 2011 NumberFour AG
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     NumberFour AG - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.core.tests.typeinfo;

import java.text.ParseException;

import junit.framework.TestCase;

import org.eclipse.dltk.internal.javascript.ti.JSDocProblem;
import org.eclipse.dltk.javascript.core.Types;
import org.eclipse.dltk.javascript.typeinfo.JSDocParseException;
import org.eclipse.dltk.javascript.typeinfo.JSDocTypeParser;
import org.eclipse.dltk.javascript.typeinfo.model.ArrayType;
import org.eclipse.dltk.javascript.typeinfo.model.ClassType;
import org.eclipse.dltk.javascript.typeinfo.model.FunctionType;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;
import org.eclipse.dltk.javascript.typeinfo.model.ParameterKind;
import org.eclipse.dltk.javascript.typeinfo.model.RecordMember;
import org.eclipse.dltk.javascript.typeinfo.model.RecordType;
import org.eclipse.dltk.javascript.typeinfo.model.SimpleType;
import org.eclipse.dltk.javascript.typeinfo.model.UnionType;

public class JSDocTypeParserTests extends TestCase {

	private JSType parse(String expression) {
		try {
			return new JSDocTypeParser().parse(expression);
		} catch (ParseException e) {
			System.out.println(expression);
			final StringBuilder sb = new StringBuilder();
			for (int i = 0; i < e.getErrorOffset(); ++i)
				sb.append(' ');
			sb.append("^^^ ").append(e.getMessage());
			System.out.println(sb.toString());
			throw new RuntimeException(e);
		}
	}

	private ParseException parseError(String expression) {
		try {
			new JSDocTypeParser().parse(expression);
			fail("parse(" + expression + ") is expected to fail");
			return null;// fail() never returns
		} catch (ParseException e) {
			return e;
		}
	}

	private static void assertRef(final String expected, JSType type) {
		assertEquals(expected, ((SimpleType) type).getTarget().getName());
	}

	public void testSimple() {
		JSType type = parse("String");
		assertRef("String", type);
	}

	public void testSimpleTranslated() {
		JSType type = parse("string");
		assertRef("String", type);
	}

	public void testSimpleParentheses() {
		JSType type = parse("( string )");
		assertRef("String", type);
	}

	public void testParenthesesError() {
		final String expression = "(string";
		final ParseException exception = parseError(expression);
		assertEquals(") expected", exception.getMessage());
		assertEquals(expression.length(), exception.getErrorOffset());
	}

	public void testUnexpectedContentError() {
		final String expression = "string)))";
		final ParseException exception = parseError(expression);
		assertEquals("Unexpected )))", exception.getMessage());
		assertEquals(expression.length() - 3, exception.getErrorOffset());
	}

	public void testClassOfNumber() {
		final String expression = "Class<Number>";
		final ClassType type = (ClassType) parse(expression);
		assertSame(Types.NUMBER, type.getTarget());
	}

	public void testClassOfSomething() {
		final String expression = "Class<Something>";
		final ClassType type = (ClassType) parse(expression);
		assertEquals("Something", type.getTarget().getName());
	}

	public void testWrongClassParameterization() {
		final String expression = "Class<Array<Number>>";
		final JSDocParseException exception = (JSDocParseException) parseError(expression);
		assertEquals(JSDocProblem.WRONG_TYPE_PARAMETERIZATION,
				exception.problemId);
		assertEquals("Class cannot be parameterized with ArrayType",
				exception.getMessage());
	}

	public void testArray() {
		JSType type = parse("Array.<String>");
		assertRef("String", ((ArrayType) type).getItemType());
	}

	public void testUnionType() {
		UnionType type = (UnionType) parse("String|Number");
		assertEquals(2, type.getTargets().size());
		assertRef("String", type.getTargets().get(0));
		assertRef("Number", type.getTargets().get(1));
	}

	public void testUnionParenthesesType() {
		UnionType type = (UnionType) parse("(String | Number)");
		assertEquals(2, type.getTargets().size());
		assertRef("String", type.getTargets().get(0));
		assertRef("Number", type.getTargets().get(1));
	}

	public void testRecordType() {
		final RecordType type = (RecordType) parse("{ astring : String , anumber : Number }");
		assertEquals(2, type.getMembers().size());
		assertEquals("astring", type.getMembers().get(0).getName());
		assertRef("String", type.getMembers().get(0).getType());
		assertEquals("anumber", type.getMembers().get(1).getName());
		assertRef("Number", type.getMembers().get(1).getType());
	}

	public void testRecordTypeWithOptionalBrackets() {
		final RecordType type = (RecordType) parse("{astring:String, [anumber]:Number}");
		assertEquals(2, type.getMembers().size());
		assertEquals("astring", type.getMembers().get(0).getName());
		assertRef("String", type.getMembers().get(0).getType());
		assertEquals("anumber", type.getMembers().get(1).getName());
		assertRef("Number", type.getMembers().get(1).getType());
		assertTrue(((RecordMember) type.getMembers().get(1)).isOptional());
	}

	public void testRecordTypeWithOptionalClosureStyle() {
		final RecordType type = (RecordType) parse("{astring:String,anumber:Number=}");
		assertEquals(2, type.getMembers().size());
		assertEquals("astring", type.getMembers().get(0).getName());
		assertRef("String", type.getMembers().get(0).getType());
		assertEquals("anumber", type.getMembers().get(1).getName());
		assertRef("Number", type.getMembers().get(1).getType());
		assertTrue(((RecordMember) type.getMembers().get(1)).isOptional());
	}

	public void testRecordTypeWithLiteralQuotedProperties() {
		final RecordType type = (RecordType) parse("{'a-string':String, anumber:Number=}");
		assertEquals(1, type.getMembers().size());
		assertEquals("anumber", type.getMembers().get(0).getName());
		assertRef("Number", type.getMembers().get(0).getType());
		assertTrue(((RecordMember) type.getMembers().get(0)).isOptional());
	}

	public void testFunctionType1() {
		final FunctionType type = (FunctionType) parse("function():String");
		assertEquals(0, type.getParameters().size());
		assertRef("String", type.getReturnType());
	}

	public void testFunctionType2() {
		final FunctionType type = (FunctionType) parse("function(String)");
		assertEquals(1, type.getParameters().size());
		assertRef("String", type.getParameters().get(0).getType());
		assertNull(type.getReturnType());
	}

	public void testFunctionType3() {
		final FunctionType type = (FunctionType) parse("function( String ) : Number");
		assertEquals(1, type.getParameters().size());
		assertRef("String", type.getParameters().get(0).getType());
		assertRef("Number", type.getReturnType());
	}

	public void testFunctionTypeVarArgs() {
		final FunctionType type = (FunctionType) parse("function(string, ...[number]): number");
		assertEquals(2, type.getParameters().size());
		assertRef("String", type.getParameters().get(0).getType());
		assertRef("Number", type.getParameters().get(1).getType());
		assertEquals(ParameterKind.VARARGS, type.getParameters().get(1)
				.getKind());
		assertRef("Number", type.getReturnType());
	}

}
