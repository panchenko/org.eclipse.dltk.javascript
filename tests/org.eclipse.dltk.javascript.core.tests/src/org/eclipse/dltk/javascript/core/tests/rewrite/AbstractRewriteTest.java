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
import org.eclipse.dltk.javascript.core.dom.Source;
import org.eclipse.dltk.javascript.core.dom.rewrite.ASTConverter;
import org.eclipse.dltk.javascript.core.dom.rewrite.RewriteAnalyzer;
import org.eclipse.dltk.javascript.parser.JavaScriptParser;
import org.eclipse.emf.ecore.change.ChangeDescription;
import org.eclipse.emf.ecore.change.util.ChangeRecorder;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.Document;
import org.eclipse.text.edits.MalformedTreeException;
import org.eclipse.text.edits.TextEdit;

import junit.framework.TestCase;

public abstract class AbstractRewriteTest extends TestCase {

	protected String rewrite(String input, Operation operation) {
		final Script script = new JavaScriptParser().parse(input, null);
		final ASTConverter converter = new ASTConverter();
		final Source source = (Source) converter.visit(script);
		final ChangeRecorder recorder = new ChangeRecorder(source);
		operation.execute(source);
		final ChangeDescription cd = recorder.endRecording();
		final RewriteAnalyzer rewrite = new RewriteAnalyzer(cd, input);
		rewrite.rewrite(source);
		cd.apply();
		final Document document = new Document(input);
		try {
			rewrite.getEdit().apply(document, TextEdit.UPDATE_REGIONS);
		} catch (MalformedTreeException e) {
			throw new AssertionError(e);
		} catch (BadLocationException e) {
			throw new AssertionError(e);
		}
		return document.get();
	}

}
