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
package org.eclipse.dltk.javascript.ui.tests.autoedit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import org.eclipse.dltk.core.tests.util.StringList;
import org.eclipse.dltk.javascript.internal.ui.JavaScriptUI;
import org.eclipse.dltk.javascript.internal.ui.editor.JavaScriptDocumentSetupParticipant;
import org.eclipse.dltk.javascript.internal.ui.text.JSDocAutoIndentStrategy;
import org.eclipse.dltk.javascript.ui.text.IJavaScriptPartitions;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.DocumentCommand;
import org.eclipse.jface.text.IAutoEditStrategy;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.TextUtilities;

public abstract class JSAutoEditStrategyTestCase extends org.junit.Assert {

	protected static final String TAB = "\t";

	protected static final String ENTER = "\n";

	private final TestStrategy codeStrategy = new TestStrategy();
	private final JSDocAutoIndentStrategy docStrategy = new JSDocAutoIndentStrategy(
			JavaScriptUI.getDefault().getPreferenceStore());

	private IAutoEditStrategy getStrategy(IDocument document, int offset) {
		final String contentType;
		try {
			contentType = TextUtilities.getContentType(document,
					IJavaScriptPartitions.JS_PARTITIONING, offset, true);
		} catch (BadLocationException e) {
			throw new AssertionError(e.toString());
		}
		if (IJavaScriptPartitions.JS_DOC.equals(contentType)
				|| IJavaScriptPartitions.JS_MULTI_LINE_COMMENT
						.equals(contentType)) {
			return docStrategy;
		} else if (IDocument.DEFAULT_CONTENT_TYPE.equals(contentType)) {
			return codeStrategy;
		} else {
			return null;
		}
	}

	protected void execute(IDocument document, DocumentCommand cmd) {
		final IAutoEditStrategy strategy = getStrategy(document, cmd.offset);
		assertNotNull(strategy);
		strategy.customizeDocumentCommand(document, cmd);
		if (!cmd.doit)
			return;
		try {
			// access "execute(IDocument)" method via reflection since it has
			// package visibility
			Method execute = DocumentCommand.class.getDeclaredMethod("execute",
					IDocument.class);
			if (!execute.isAccessible())
				execute.setAccessible(true);
			execute.invoke(cmd, document);
		} catch (SecurityException e) {
			throw new AssertionError(e);
		} catch (NoSuchMethodException e) {
			throw new AssertionError(e);
		} catch (IllegalArgumentException e) {
			throw new AssertionError(e);
		} catch (IllegalAccessException e) {
			throw new AssertionError(e);
		} catch (InvocationTargetException e) {
			throw new AssertionError(e);
		}
	}

	protected DocumentCommand createCommand(String text, int offset) {
		return createCommand(text, offset, 0);
	}

	protected DocumentCommand createCommand(String text, int offset, int length) {
		final DocumentCommand cmd = new DocumentCommand() {
		};
		cmd.offset = offset;
		cmd.length = length;
		cmd.text = text;
		cmd.doit = true;
		cmd.caretOffset = offset;
		cmd.shiftsCaret = true;
		return cmd;
	}

	protected Document createDocument(StringList code) {
		final Document document = new Document(code);
		new JavaScriptDocumentSetupParticipant().setup(document);
		return document;
	}

}
