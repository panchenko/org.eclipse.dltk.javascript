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

import org.eclipse.dltk.javascript.typeinfo.JSDocTypeParser;
import org.eclipse.dltk.javascript.typeinfo.model.ArrayType;
import org.eclipse.dltk.javascript.typeinfo.model.FunctionType;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;
import org.eclipse.dltk.javascript.typeinfo.model.RecordType;
import org.eclipse.dltk.javascript.typeinfo.model.TypeRef;

import junit.framework.TestCase;

public class JSDocTypeParserTests extends TestCase {

	private JSType parse(String expression) {
		try {
			return new JSDocTypeParser().parse(expression);
		} catch (ParseException e) {
			throw new RuntimeException(e);
		}
	}

	private static void assertRef(final String expected, JSType type) {
		assertEquals(expected, ((TypeRef) type).getTarget().getName());
	}

	public void testSimple() {
		JSType type = parse("String");
		assertRef("String", type);
	}

	public void testSimpleTranslated() {
		JSType type = parse("string");
		assertRef("String", type);
	}

	public void testArray() {
		JSType type = parse("Array.<String>");
		assertRef("String", ((ArrayType) type).getItemType());
	}

	public void testRecordType() {
		final RecordType type = (RecordType) parse("{astring:String,anumber:Number}");
		assertEquals(2, type.getMembers().size());
		assertEquals("astring", type.getMembers().get(0).getName());
		assertRef("String", type.getMembers().get(0).getType());
		assertEquals("anumber", type.getMembers().get(1).getName());
		assertRef("Number", type.getMembers().get(1).getType());
	}
	
	public void testRecordTypeWithOptionalBrackets() {
		final RecordType type = (RecordType) parse("{astring:String,[anumber]:Number}");
		assertEquals(2, type.getMembers().size());
		assertEquals("astring", type.getMembers().get(0).getName());
		assertRef("String", type.getMembers().get(0).getType());
		assertEquals("anumber", type.getMembers().get(1).getName());
		assertRef("Number", type.getMembers().get(1).getType());
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

}
