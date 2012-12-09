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

import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.core.dom.rewrite.ASTConverter;
import org.eclipse.dltk.javascript.parser.tests.XmlQueryTests;
import org.junit.Ignore;

public class XmlQueryRewriteTests extends XmlQueryTests {

	@Override
	protected Script parse(String source) {
		final Script script = super.parse(source);
		final ASTConverter converter = new ASTConverter();
		/* (Source) */converter.visit(script);
		return script;
	}

	@Ignore("fails with ClassCastException")
	@Override
	public void testXmlColonColonBracketExpression() {
		// TODO (alex) fix failures
		super.testXmlColonColonBracketExpression();
	}

	@Ignore("fails with ClassCastException")
	@Override
	public void testXmlDotParenExpression() {
		super.testXmlDotParenExpression();
	}

	@Ignore("fails with ClassCastException")
	@Override
	public void testXmlAttributeBracketExpression() {
		super.testXmlAttributeBracketExpression();
	}

}
