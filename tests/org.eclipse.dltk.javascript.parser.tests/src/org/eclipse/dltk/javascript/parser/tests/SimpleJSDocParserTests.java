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

import junit.framework.TestCase;

import org.eclipse.dltk.core.tests.util.StringList;
import org.eclipse.dltk.javascript.parser.jsdoc.JSDocTag;
import org.eclipse.dltk.javascript.parser.jsdoc.JSDocTags;
import org.eclipse.dltk.javascript.parser.jsdoc.SimpleJSDocParser;

public class SimpleJSDocParserTests extends TestCase {

	private List<JSDocTag> parse(String content) {
		final JSDocTags tags = new SimpleJSDocParser().parse(content, 0);
		return tags.list();
	}

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
		assertEquals("x", tags.get(0).getValue());
		assertEquals("y", tags.get(1).getValue());
		assertEquals("z", tags.get(2).getValue());
	}

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
		assertEquals("x", tags.get(0).getValue());
		assertEquals("y", tags.get(1).getValue());
		assertEquals("z", tags.get(2).getValue());
	}

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
		assertEquals("y B @param z", tags.get(0).getValue());
	}
}
