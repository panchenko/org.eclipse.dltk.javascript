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

import org.eclipse.dltk.internal.javascript.ti.JSDocSupport;
import org.eclipse.dltk.ui.text.IColorManager;
import org.eclipse.dltk.ui.text.TodoTaskPreferencesOnPreferenceStore;
import org.eclipse.dltk.ui.text.rules.CombinedWordRule.WordMatcher;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.rules.IWordDetector;

public class JavascriptDocScanner extends JavaScriptScriptCommentScanner {

	public JavascriptDocScanner(IColorManager manager, IPreferenceStore store) {
		super(manager, store, JavascriptColorConstants.JS_DOC,
				JavascriptColorConstants.JS_TODO_TAG,
				new TodoTaskPreferencesOnPreferenceStore(store));
	}

	@Override
	protected int skipCommentChars() {
		int count = 0;
		int c = read();
		while (Character.isWhitespace(c)) {
			++count;
			c = read();
		}
		while (c == '/') {
			++count;
			c = read();
		}
		while (c == '*') {
			++count;
			c = read();
		}
		unread();
		return count;
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
		Collections.addAll(tags, JSDocSupport.getTags());
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
				return Character.isJavaIdentifierPart(c);
			}
		};
	}

}
