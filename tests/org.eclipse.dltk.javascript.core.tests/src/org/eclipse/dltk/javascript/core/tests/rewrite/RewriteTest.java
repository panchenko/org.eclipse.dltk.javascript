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

import static java.lang.Integer.parseInt;

import java.util.Iterator;
import java.util.concurrent.atomic.AtomicInteger;

import org.eclipse.dltk.core.tests.util.StringList;
import org.eclipse.dltk.javascript.core.dom.NumericLiteral;
import org.eclipse.dltk.javascript.core.dom.Source;
import org.eclipse.dltk.javascript.core.dom.StringLiteral;
import org.eclipse.dltk.javascript.core.dom.VariableDeclaration;
import org.eclipse.emf.ecore.EObject;

public class RewriteTest extends AbstractRewriteTest {

	public void testStringLiteral() {
		final StringList code = new StringList();
		code.add("var lang = 'Java'");
		final AtomicInteger counter = new AtomicInteger();
		final String changed = rewrite(code.toString(), new Operation() {
			@Override
			public void execute(Source source) {
				for (Iterator<EObject> i = source.eAllContents(); i.hasNext();) {
					final EObject child = i.next();
					if (child instanceof StringLiteral) {
						((StringLiteral) child).setText("'JavaScript'");
						counter.incrementAndGet();
					}
				}
			}
		});
		assertEquals(1, counter.intValue());
		final StringList expected = new StringList();
		expected.add("var lang = 'JavaScript'");
		assertEquals(expected.toString(), changed);
	}

	public void testVariable() {
		final AtomicInteger counter = new AtomicInteger();
		final String changed = rewrite("var year = 2012", new Operation() {
			@Override
			public void execute(Source source) {
				for (Iterator<EObject> i = source.eAllContents(); i.hasNext();) {
					final EObject child = i.next();
					if (child instanceof VariableDeclaration) {
						final VariableDeclaration var = (VariableDeclaration) child;
						var.getIdentifier().setName("YEAR");
						counter.incrementAndGet();
					}
				}
			}
		});
		assertEquals(1, counter.intValue());
		assertEquals("var YEAR = 2012", changed);
	}

	public void testNumericLiteral() {
		final AtomicInteger counter = new AtomicInteger();
		final String changed = rewrite("var year = 2012", new Operation() {
			@Override
			public void execute(Source source) {
				for (Iterator<EObject> i = source.eAllContents(); i.hasNext();) {
					final EObject child = i.next();
					if (child instanceof NumericLiteral) {
						final NumericLiteral num = (NumericLiteral) child;
						num.setText(Integer.toString(parseInt(num.getText()) + 1));
						counter.incrementAndGet();
					}
				}
			}
		});
		assertEquals(1, counter.intValue());
		assertEquals("var year = 2013", changed);
	}

}
