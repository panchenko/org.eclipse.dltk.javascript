/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.javascript.internal.ui.text;

import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.internal.ui.editor.EditorUtility;
import org.eclipse.dltk.javascript.core.JSKeywordCategory;
import org.eclipse.dltk.javascript.core.JSKeywordManager;
import org.eclipse.dltk.javascript.parser.jsdoc.JSDocTag;
import org.eclipse.dltk.ui.text.ScriptSourceViewerConfiguration;
import org.eclipse.dltk.ui.text.TodoTaskPreferencesOnPreferenceStore;
import org.eclipse.dltk.ui.text.rules.CombinedWordRule.WordMatcher;
import org.eclipse.jface.text.rules.IWordDetector;
import org.eclipse.ui.texteditor.ITextEditor;

public class JavascriptDocScanner extends JavaScriptScriptCommentScanner {

	public JavascriptDocScanner(ScriptSourceViewerConfiguration configuration) {
		super(configuration, JavascriptColorConstants.JS_DOC,
				JavascriptColorConstants.JS_TODO_TAG,
				new TodoTaskPreferencesOnPreferenceStore(
						configuration.getPreferenceStore()));
	}

	@Override
	protected String[] getTokenProperties() {
		return new String[] { JavascriptColorConstants.JS_DOC,
				JavascriptColorConstants.JS_TODO_TAG,
				JavascriptColorConstants.JS_DOC_TAGS };
	}

	@Override
	protected List<WordMatcher> createMatchers() {
		final List<WordMatcher> matchers = super.createMatchers();
		matchers.add(createJavadocKeywordMatcher());
		return matchers;
	}

	private WordMatcher createJavadocKeywordMatcher() {
		final WordMatcher matcher = new WordMatcher();
		final Set<String> tags = new HashSet<String>();
		Collections.addAll(tags, JSDocTag.getTags());
		ISourceModule module = null;
		if (fConfiguration != null) {
			final ITextEditor editor = fConfiguration.getEditor();
			if (editor != null) {
				module = EditorUtility.getEditorInputModelElement(editor, true);
			}
		}
		Collections.addAll(
				tags,
				JSKeywordManager.getInstance().getKeywords(
						JSKeywordCategory.JS_DOC_TAG, module));
		for (String tag : tags) {
			matcher.addWord(tag, getToken(JavascriptColorConstants.JS_DOC_TAGS));
		}
		return matcher;
	}

	@Override
	protected IWordDetector createIdentifierDetector() {
		return new IWordDetector() {
			public boolean isWordStart(char c) {
				return c == '@' || Character.isJavaIdentifierStart(c);
			}

			public boolean isWordPart(char c) {
				return c == '.' || c == '-'
						|| Character.isJavaIdentifierPart(c);
			}
		};
	}

}
