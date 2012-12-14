/*******************************************************************************
 * Copyright (c) 2011 xored software, Inc.
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

import java.util.List;

import org.eclipse.dltk.core.tests.util.StringList;
import org.eclipse.dltk.javascript.parser.jsdoc.JSDocTag;
import org.eclipse.dltk.javascript.parser.jsdoc.JSDocTags;
import org.eclipse.dltk.javascript.parser.jsdoc.SimpleJSDocParser;
import org.junit.Assert;
import org.junit.Test;

public class SimpleJSDocParserTests extends Assert {

	private List<JSDocTag> parse(String content) {
		final JSDocTags tags = new SimpleJSDocParser().parse(content, 0);
		return tags.list();
	}

	@Test
	public void testSimple() {
		StringList code = new StringList();
		code.add("/**");
		code.add(" * @param x");
		code.add(" * @param y");
		code.add(" * @param z");
		code.add(" */");
		List<JSDocTag> tags = parse(code.toString());
		assertEquals(3, tags.size());
		assertEquals(JSDocTag.PARAM, tags.get(0).name());
		assertEquals(JSDocTag.PARAM, tags.get(1).name());
		assertEquals(JSDocTag.PARAM, tags.get(2).name());
		assertEquals("x", tags.get(0).value());
		assertEquals("y", tags.get(1).value());
		assertEquals("z", tags.get(2).value());
	}

	@Test
	public void testEmptyLines() {
		StringList code = new StringList();
		code.add("/**");
		code.add(" * @param x");
		code.add(" *");
		code.add(" * @param y");
		code.add(" *");
		code.add(" * @param z");
		code.add(" */");
		List<JSDocTag> tags = parse(code.toString());
		assertEquals(3, tags.size());
		assertEquals(JSDocTag.PARAM, tags.get(0).name());
		assertEquals(JSDocTag.PARAM, tags.get(1).name());
		assertEquals(JSDocTag.PARAM, tags.get(2).name());
		assertEquals("x", tags.get(0).value());
		assertEquals("y", tags.get(1).value());
		assertEquals("z", tags.get(2).value());
	}

	@Test
	public void testNotLineStart() {
		StringList code = new StringList();
		code.add("/**");
		code.add(" * A @param x");
		code.add(" * @param y");
		code.add(" * B @param z");
		code.add(" */");
		List<JSDocTag> tags = parse(code.toString());
		assertEquals(1, tags.size());
		assertEquals(JSDocTag.PARAM, tags.get(0).name());
		assertEquals("y B @param z", tags.get(0).value());
	}

	@Test
	public void testSuppressWarnings() {
		StringList code = new StringList();
		code.add("/**");
		code.add(" * " + JSDocTag.SUPPRESS_WARNINGS + "(all)");
		code.add(" */");
		final String string = code.toString();
		List<JSDocTag> tags = parse(string);
		assertEquals(1, tags.size());
		final JSDocTag tag = tags.get(0);
		assertEquals(JSDocTag.SUPPRESS_WARNINGS, tag.name());
		assertEquals("(all)", tag.value());

		assertEquals(string.indexOf(")"),
				tag.fromValueOffset(tag.value().indexOf(")")));
		assertEquals(tag.value().indexOf(")"),
				tag.toValueOffset(string.indexOf(")")));
	}

	@Test
	public void testTagWithNumbers() {
		StringList code = new StringList();
		code.add("/**");
		code.add(" * @web2.0");
		code.add(" */");
		List<JSDocTag> tags = parse(code.toString());
		assertEquals(1, tags.size());
		assertEquals("@web2.0", tags.get(0).name());
	}

	@Test
	public void testMultiLine() {
		final StringList code = new StringList();
		code.add("/**");
		code.add(" * @print Hello,");
		code.add(" * world");
		code.add(" * !     ");
		code.add(" */");
		final String string = code.toString();
		final List<JSDocTag> tags = parse(string);
		assertEquals(1, tags.size());
		final JSDocTag tag = tags.get(0);
		assertEquals("@print", tag.name());
		assertEquals("Hello, world !", tag.value());
		assertEquals(string.indexOf("@print"), tag.start());
		assertEquals(string.indexOf("Hello"), tag.valueStart());
		assertEquals(string.indexOf("!") + 1, tag.end());

		assertEquals(string.indexOf("!"),
				tag.fromValueOffset(tag.value().indexOf("!")));
		assertEquals(tag.value().indexOf("!"),
				tag.toValueOffset(string.indexOf("!")));
	}

	@Test
	public void testMultiLineReturn() {
		final StringList code = new StringList();
		code.add("/**");
		code.add(" * @return {");
		code.add(" *   String");
		code.add(" *   |Number");
		code.add(" *   |Date");
		code.add(" *   }");
		code.add(" */");
		final String string = code.toString();
		final List<JSDocTag> tags = parse(string);
		assertEquals(1, tags.size());
		final JSDocTag tag = tags.get(0);
		assertEquals("@return", tag.name());
		assertEquals("{   String   |Number   |Date   }", tag.value());
		assertEquals(string.indexOf("@return"), tag.start());
		assertEquals(string.indexOf("{"), tag.valueStart());
		assertEquals(string.indexOf("}") + 1, tag.end());

		assertEquals(string.indexOf("String"),
				tag.fromValueOffset(tag.value().indexOf("String")));
		assertEquals(tag.value().indexOf("Number"),
				tag.toValueOffset(string.indexOf("Number")));
		assertEquals(tag.value().indexOf("Date"),
				tag.toValueOffset(string.indexOf("Date")));
	}

	@Test
	public void testMultiLineEmpty() {
		final StringList code = new StringList();
		code.add("/**");
		code.add(" * @print ");
		code.add(" *   ");
		code.add(" *   ");
		code.add(" */");
		final String string = code.toString();
		final List<JSDocTag> tags = parse(string);
		assertEquals(1, tags.size());
		final JSDocTag tag = tags.get(0);
		assertEquals("@print", tag.name());
		assertEquals("", tag.value());
		assertEquals(string.indexOf("@print"), tag.start());
		assertEquals(string.indexOf("@print") + "@print".length(), tag.end());
		assertEquals(string.indexOf("@print") + "@print".length(),
				tag.valueStart());
	}

}
