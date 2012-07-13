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

@SuppressWarnings("nls")
public class XmlQueryTests extends AbstractJSParserTest {

	public void testXmlQueryElement() {
		parse("var x = xml.element");
		assertFalse(reporter.hasErrors());
	}

	public void testXmlQueryAllElements() {
		parse("var x = xml.*");
		assertFalse(reporter.hasErrors());
	}

	public void testXmlQueryAttribute() {
		parse("var x = xml.@attr");
		assertFalse(reporter.hasErrors());
	}

	public void testXmlQueryAllAttributes() {
		parse("var x = xml.@*");
		assertFalse(reporter.hasErrors());
	}

	public void testXmlDotParenExpression() {
		parse("var x = xml.(1)");
		assertFalse(reporter.hasErrors());
	}

	public void testXmlDotDotParenExpression_error() {
		parse("var x = xml..(1)");
		assertTrue(reporter.hasErrors());
	}

	public void testXmlAttributeBracketExpression() {
		parse("var x = xml.@[1]");
		assertFalse(reporter.hasErrors());
	}

	public void testXmlColonColonNumber_error() {
		parse("var x = xml..1");
		assertTrue(reporter.hasErrors());
	}

	public void testXmlColonColonBracketExpression() {
		parse("var x = xml::[1]");
		assertFalse(reporter.hasErrors());
	}

	public void testXmlColonColonAttribute() {
		parse("var x = xml..@name");
		assertFalse(reporter.hasErrors());
	}

}
