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
package org.eclipse.dltk.javascript.parser.tests;

import org.eclipse.dltk.ast.utils.ASTUtil;
import org.eclipse.dltk.javascript.ast.FunctionStatement;
import org.eclipse.dltk.javascript.ast.Script;

public class FunctionDeclarationTests extends AbstractJSParserTest {

	public void testNoArgs() {
		Script script = parse("function a(){}");
		assertFalse(reporter.hasErrors());
		FunctionStatement func = uniqueResult(ASTUtil.select(script,
				FunctionStatement.class));
		assertEquals("a", func.getName().getName());
		assertTrue(func.getArguments().isEmpty());
	}

	public void testArg1() {
		Script script = parse("function a(x){}");
		assertFalse(reporter.hasErrors());
		FunctionStatement func = uniqueResult(ASTUtil.select(script,
				FunctionStatement.class));
		assertEquals("a", func.getName().getName());
		assertEquals(1, func.getArguments().size());
		assertEquals("x", func.getArguments().get(0).getArgumentName());
		assertNull(func.getArguments().get(0).getType());
	}

	public void testArg2() {
		Script script = parse("function a(x,y){}");
		assertFalse(reporter.hasErrors());
		FunctionStatement func = uniqueResult(ASTUtil.select(script,
				FunctionStatement.class));
		assertEquals("a", func.getName().getName());
		assertEquals(2, func.getArguments().size());
		assertEquals("x", func.getArguments().get(0).getArgumentName());
		assertNull(func.getArguments().get(0).getType());
		assertEquals("y", func.getArguments().get(1).getArgumentName());
		assertNull(func.getArguments().get(1).getType());
	}

	public void testTypedArg1Disabled() {
		Script script = parse("function a(x:String){}");
		assertFalse(reporter.hasErrors());
		FunctionStatement func = uniqueResult(ASTUtil.select(script,
				FunctionStatement.class));
		assertEquals("a", func.getName().getName());
		assertEquals(1, func.getArguments().size());
		assertEquals("x", func.getArguments().get(0).getArgumentName());
		assertNull(func.getArguments().get(0).getType());
	}

	public void testTypedArg2Disabled() {
		Script script = parse("function a(x:String,y:Number){}");
		assertFalse(reporter.hasErrors());
		FunctionStatement func = uniqueResult(ASTUtil.select(script,
				FunctionStatement.class));
		assertEquals("a", func.getName().getName());
		assertEquals(2, func.getArguments().size());
		assertEquals("x", func.getArguments().get(0).getArgumentName());
		assertNull(func.getArguments().get(0).getType());
		assertEquals("y", func.getArguments().get(1).getArgumentName());
		assertNull(func.getArguments().get(1).getType());
	}

	public void testTypedArg1() {
		parser.setTypeInformationEnabled(true);
		Script script = parse("function a(x:String){}");
		assertFalse(reporter.hasErrors());
		FunctionStatement func = uniqueResult(ASTUtil.select(script,
				FunctionStatement.class));
		assertEquals("a", func.getName().getName());
		assertEquals(1, func.getArguments().size());
		assertEquals("x", func.getArguments().get(0).getArgumentName());
		assertEquals("String", func.getArguments().get(0).getType().getName());
	}

	public void testTypedArg2() {
		parser.setTypeInformationEnabled(true);
		Script script = parse("function a(x:String,y:Number){}");
		assertFalse(reporter.hasErrors());
		FunctionStatement func = uniqueResult(ASTUtil.select(script,
				FunctionStatement.class));
		assertEquals("a", func.getName().getName());
		assertEquals(2, func.getArguments().size());
		assertEquals("x", func.getArguments().get(0).getArgumentName());
		assertEquals("String", func.getArguments().get(0).getType().getName());
		assertEquals("y", func.getArguments().get(1).getArgumentName());
		assertEquals("Number", func.getArguments().get(1).getType().getName());
	}

	public void testTypedReturn() {
		parser.setTypeInformationEnabled(true);
		Script script = parse("function a():Number{return 1}");
		assertFalse(reporter.hasErrors());
		FunctionStatement func = uniqueResult(ASTUtil.select(script,
				FunctionStatement.class));
		assertEquals("a", func.getName().getName());
		assertTrue(func.getArguments().isEmpty());
		assertEquals("Number", func.getReturnType().getName());
	}

}
