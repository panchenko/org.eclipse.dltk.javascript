/*******************************************************************************
 * Copyright (c) 2012 NumberFour AG
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     NumberFour AG - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.parser.tests;

import java.util.IdentityHashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.core.tests.util.StringList;
import org.eclipse.dltk.javascript.ast.BooleanLiteral;
import org.eclipse.dltk.javascript.ast.DecimalLiteral;
import org.eclipse.dltk.javascript.ast.FunctionStatement;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.ast.Script;

public class StringPoolTest extends AbstractJSParserTest {

	public void testBooleans() {
		final StringList code = new StringList();
		code.add("var booleans = [");
		for (int i = 0; i < 20; ++i) {
			code.add("  true,false,");
		}
		code.add("0]");
		final Map<String, String> booleans = new IdentityHashMap<String, String>();
		final Script script = parse(code.toString());
		final AtomicInteger counter = new AtomicInteger();
		try {
			script.traverse(new ASTVisitor() {
				@Override
				public boolean visit(ASTNode s) throws Exception {
					if (s instanceof BooleanLiteral) {
						counter.incrementAndGet();
						booleans.put(((BooleanLiteral) s).getText(), "");
					}
					return true;
				}
			});
		} catch (Exception e) {
			fail(e.toString());
		}
		assertEquals(40, counter.intValue());
		assertEquals(2, booleans.size());
	}

	public void testNumbers() {
		final StringList code = new StringList();
		code.add("var numbers = [");
		for (int i = 0; i < 20; ++i) {
			code.add("  1,2,");
		}
		code.add("]");
		final Map<String, String> booleans = new IdentityHashMap<String, String>();
		final Script script = parse(code.toString());
		final AtomicInteger counter = new AtomicInteger();
		try {
			script.traverse(new ASTVisitor() {
				@Override
				public boolean visit(ASTNode s) throws Exception {
					if (s instanceof DecimalLiteral) {
						counter.incrementAndGet();
						booleans.put(((DecimalLiteral) s).getText(), "");
					}
					return true;
				}
			});
		} catch (Exception e) {
			fail(e.toString());
		}
		assertEquals(40, counter.intValue());
		assertEquals(2, booleans.size());
	}

	public void testPerformance() throws Exception {
		final StringList code = new StringList();
		final int iterationCount = 10000;

		for (int i = 0; i < iterationCount; ++i) {
			code.add("function test" + i + "() {");
			code.add("function test(The,quick,brown,fox,jumps,over,the,lazy,dog) { var x = y; m1 = m2 }");
			code.add("}");
		}

		final Script script = parse(code.toString());
		assertFalse(reporter.hasErrors());

		final AtomicInteger counter = new AtomicInteger();
		final Map<String, String> ids = new IdentityHashMap<String, String>();

		script.traverse(new ASTVisitor() {
			@Override
			public boolean visit(ASTNode s) throws Exception {
				if (s instanceof FunctionStatement) {
					counter.incrementAndGet();
				} else if (s instanceof Identifier) {
					ids.put(((Identifier) s).getName(), "");
				}
				return true;
			}
		});

		assertEquals(iterationCount * 2, counter.intValue());
		assertEquals(iterationCount + 1 + 9 + 4, ids.size());
	}

}
