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

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.dltk.ast.utils.ASTUtil;
import org.eclipse.dltk.compiler.problem.IProblemCategory;
import org.eclipse.dltk.compiler.problem.IProblemIdentifier;
import org.eclipse.dltk.core.tests.util.StringList;
import org.eclipse.dltk.internal.javascript.ti.JSDocSupport;
import org.eclipse.dltk.internal.javascript.ti.JSMethod;
import org.eclipse.dltk.javascript.ast.FunctionStatement;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.parser.tests.AbstractJSParserTest;

@SuppressWarnings("restriction")
public class JSDocSupportTests extends AbstractJSParserTest {

	private static class Category implements IProblemCategory {

		final String name;

		public Category(String name) {
			this.name = name;
		}

		public String name() {
			return name;
		}

		public Collection<IProblemIdentifier> contents() {
			return Collections.emptyList();
		}

	}

	private Set<String> parseSuppressWarnings(final StringList code) {
		final Script script = parse(code.toString());
		final FunctionStatement function = uniqueResult(ASTUtil.select(script,
				FunctionStatement.class));
		final JSMethod method = new JSMethod();
		new JSDocSupport() {
			@Override
			protected IProblemCategory getCategory(String categoryId) {
				return new Category(categoryId);
			}
		}.processMethod(function, method, null, null);
		final Set<String> ids = new HashSet<String>();
		for (IProblemCategory category : method.getSuppressedWarnings()) {
			ids.add(category.name());
		}
		return ids;
	}

	public void testSuppressWarnings1() {
		final StringList code = new StringList();
		code.add("/**");
		code.add("@SuppressWarnings(w1)");
		code.add("*/");
		code.add("function hello(){}");
		assertEquals(Collections.singleton("w1"), parseSuppressWarnings(code));
	}

	public void testSuppressWarnings2() {
		final StringList code = new StringList();
		code.add("/**");
		code.add("@SuppressWarnings(\"w1\")");
		code.add("*/");
		code.add("function hello(){}");
		assertEquals(Collections.singleton("w1"), parseSuppressWarnings(code));
	}

	public void testSuppressWarnings3() {
		final StringList code = new StringList();
		code.add("/**");
		code.add("@SuppressWarnings( \"w1\" , w2 )");
		code.add("*/");
		code.add("function hello(){}");
		final Set<String> warningIds = new HashSet<String>();
		Collections.addAll(warningIds, "w1", "w2");
		assertEquals(warningIds, parseSuppressWarnings(code));
	}

	public void testSuppressWarnings4() {
		final StringList code = new StringList();
		code.add("/**");
		code.add("@SuppressWarnings \"w1\" , w2");
		code.add("*/");
		code.add("function hello(){}");
		final Set<String> warningIds = new HashSet<String>();
		Collections.addAll(warningIds, "w1", "w2");
		assertEquals(warningIds, parseSuppressWarnings(code));
	}
}
