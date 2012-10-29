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
package org.eclipse.dltk.javascript.core.tests.rewrite;

import org.eclipse.dltk.core.tests.util.StringList;
import org.eclipse.dltk.javascript.core.dom.Source;
import org.eclipse.dltk.javascript.core.dom.VariableStatement;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class VariableRemoveTest extends AbstractRewriteTest {

	public void testNOP() {
		final StringList code = new StringList();
		code.add("var a = 1");
		code.add("var b = 2");
		code.add("var c = 3");
		assertEquals(code.toString(), rewrite(code.toString(), new Operation() {
			@Override
			public void execute(Source source) {
			}
		}));
	}

	public void testRemoveStatement() {
		final StringList code = new StringList();
		code.add("var a = 1");
		code.add("var b = 2");
		code.add("var c = 3");
		final String output = rewrite(code.toString(), new Operation() {
			@Override
			public void execute(Source source) {
				assertEquals(3, source.getStatements().size());
				EcoreUtil.remove(source.getStatements().get(1));
			}
		});
		code.remove(1);
		assertEquals(code.toString(), output);
	}

	public void testRemoveStatementWithJsdocs() {
		final StringList code = new StringList();
		code.add("/** @type {Number} */");
		code.add("var n");
		code.add("/** @type {String} */");
		code.add("var s");
		code.add("/** @type {Date} */");
		code.add("var d");
		final String output = rewrite(code.toString(), new Operation() {
			@Override
			public void execute(Source source) {
				assertEquals(3, source.getStatements().size());
				EcoreUtil.remove(source.getStatements().get(1));
			}
		});
		code.remove(3); // var s
		code.remove(2); // @type String
		assertEquals(code.toString(), output);
	}

	public void testRemoveVariableWithJsdocs() {
		final StringList code = new StringList();
		code.add("var ");
		code.add("/** @type {Number} */ n,");
		code.add("/** @type {String} */ s,");
		code.add("/** @type {Date}   */ d");
		final String output = rewrite(code.toString(), new Operation() {
			@Override
			public void execute(Source source) {
				assertEquals(1, source.getStatements().size());
				final VariableStatement statement = (VariableStatement) source
						.getStatements().get(0);
				EcoreUtil.remove(statement.getDeclarations().get(1));
			}
		});
		code.remove(2); // @type String s
		assertEquals(code.toString(), output);
	}

	public void testRemoveOnlyVariableStatement() {
		final StringList code = new StringList();
		code.add("/** @type {Number} */");
		code.add("var n");
		final String output = rewrite(code.toString(), new Operation() {
			@Override
			public void execute(Source source) {
				assertEquals(1, source.getStatements().size());
				EcoreUtil.remove(source.getStatements().get(0));
			}
		});
		assertEquals("\n", output);
	}

}
