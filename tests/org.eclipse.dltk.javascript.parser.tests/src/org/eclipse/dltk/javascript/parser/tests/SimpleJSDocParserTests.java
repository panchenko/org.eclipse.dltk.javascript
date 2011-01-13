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

import java.util.ArrayList;
import java.util.List;

import junit.framework.TestCase;

import org.eclipse.dltk.core.tests.util.StringList;
import org.eclipse.dltk.javascript.parser.jsdoc.JSDocTag;
import org.eclipse.dltk.javascript.parser.jsdoc.SimpleJSDocParser;

public class SimpleJSDocParserTests extends TestCase {

	private static class Tag {
		final String tag;
		final String content;

		public Tag(String tag, String content) {
			this.tag = tag;
			this.content = content;
		}

	}

	private List<Tag> parse(String content) {
		final List<Tag> tags = new ArrayList<Tag>();
		new SimpleJSDocParser() {
			@Override
			protected void processTag(String tag, String content) {
				tags.add(new Tag(tag, content));
			}
		}.parse(content);
		return tags;
	}

	public void testSimple() {
		StringList code = new StringList();
		code.add("/**");
		code.add(" * @param x");
		code.add(" * @param y");
		code.add(" * @param z");
		code.add(" */");
		List<Tag> tags = parse(code.toString());
		assertEquals(3, tags.size());
		assertEquals(JSDocTag.PARAM, tags.get(0).tag);
		assertEquals(JSDocTag.PARAM, tags.get(1).tag);
		assertEquals(JSDocTag.PARAM, tags.get(2).tag);
		assertEquals("x", tags.get(0).content);
		assertEquals("y", tags.get(1).content);
		assertEquals("z", tags.get(2).content);
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
		List<Tag> tags = parse(code.toString());
		assertEquals(3, tags.size());
		assertEquals(JSDocTag.PARAM, tags.get(0).tag);
		assertEquals(JSDocTag.PARAM, tags.get(1).tag);
		assertEquals(JSDocTag.PARAM, tags.get(2).tag);
		assertEquals("x", tags.get(0).content);
		assertEquals("y", tags.get(1).content);
		assertEquals("z", tags.get(2).content);
	}

	public void testNotLineStart() {
		StringList code = new StringList();
		code.add("/**");
		code.add(" * A @param x");
		code.add(" * @param y");
		code.add(" * B @param z");
		code.add(" */");
		List<Tag> tags = parse(code.toString());
		assertEquals(1, tags.size());
		assertEquals(JSDocTag.PARAM, tags.get(0).tag);
		assertEquals("y B @param z", tags.get(0).content);
	}
}
