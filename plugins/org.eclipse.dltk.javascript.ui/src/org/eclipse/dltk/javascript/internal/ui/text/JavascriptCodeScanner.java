/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.javascript.internal.ui.text;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.dltk.javascript.core.JavaScriptKeywords;
import org.eclipse.dltk.javascript.internal.ui.rules.FloatNumberRule;
import org.eclipse.dltk.javascript.ui.scriptcolor.provider.IScriptColorProvider;
import org.eclipse.dltk.ui.text.AbstractScriptScanner;
import org.eclipse.dltk.ui.text.IColorManager;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;
import org.eclipse.jface.text.rules.WhitespaceRule;

public class JavascriptCodeScanner extends AbstractScriptScanner {

	private static String fgReturnKeyword = "return";
	private static String fgTokenProperties[] = new String[] {
			JavascriptColorConstants.JS_SINGLE_LINE_COMMENT,
			JavascriptColorConstants.JS_DEFAULT,
			JavascriptColorConstants.JS_KEYWORD,
			JavascriptColorConstants.JS_KEYWORD_RETURN,
			JavascriptColorConstants.JS_NUMBER,
			JavascriptColorConstants.JS_FUNCTION_DEFINITION };

	private static IScriptColorProvider[] providers;
	static {
		initProviders();
	}

	public static IScriptColorProvider[] getScriptColorProviders() {
		return providers;
	}

	private static void initProviders() {
		final List<IScriptColorProvider> providerList = new ArrayList<IScriptColorProvider>();
		final IConfigurationElement[] configurationElements = Platform
				.getExtensionRegistry().getConfigurationElementsFor(
						"org.eclipse.dltk.javascript.ui.keywordsprovider");
		for (IConfigurationElement configurationElement : configurationElements) {
			try {
				final Object provider = configurationElement
						.createExecutableExtension("class");
				if (provider instanceof IScriptColorProvider) {
					providerList.add((IScriptColorProvider) provider);
				}
			} catch (CoreException e) {
				e.printStackTrace();
			}
		}
		providers = providerList.toArray(new IScriptColorProvider[providerList
				.size()]);
	}

	public JavascriptCodeScanner(IColorManager manager, IPreferenceStore store) {
		super(manager, store);
		initialize();
	}

	@Override
	protected String[] getTokenProperties() {
		return fgTokenProperties;
	}

	@Override
	protected List<IRule> createRules() {
		List<IRule> rules = new ArrayList<IRule>();
		IToken keyword = getToken(JavascriptColorConstants.JS_KEYWORD);
		IToken keywordReturn = getToken(JavascriptColorConstants.JS_KEYWORD_RETURN);
		IToken other = getToken(JavascriptColorConstants.JS_DEFAULT);
		IToken def = getToken(JavascriptColorConstants.JS_FUNCTION_DEFINITION);
		IToken number = getToken(JavascriptColorConstants.JS_NUMBER);
		// comments are already done by the TASK scanner...
		// IToken comment =
		// getToken(JavascriptColorConstants.JS_SINGLE_LINE_COMMENT);
		// Add rule for single line comments.
		// rules.add(new EndOfLineRule("//", comment));
		// Add generic whitespace rule.
		rules.add(new WhitespaceRule(new JavascriptWhitespaceDetector()));
		// Add word rule for keywords, types, and constants.
		JavascriptWordRule wordRule = new JavascriptWordRule(
				new JavascriptWordDetector(), other, null, def);
		for (String word : JavaScriptKeywords.getJavaScriptKeywords()) {
			wordRule.addWord(word, keyword);
		}
		wordRule.addWord(fgReturnKeyword, keywordReturn);

		for (int i = 0; i < providers.length; i++) {
			String[] keywords = providers[i].getKeywords();
			if (keywords != null) {
				for (String word : keywords) {
					wordRule.addWord(word, providers[i].getToken(word));
				}
			}
		}
		rules.add(wordRule);
		rules.add(new FloatNumberRule(number));

		for (int i = 0; i < providers.length; i++) {
			IRule[] r = providers[i].getRules();
			if (r != null) {
				for (int j = 0; j < r.length; j++) {
					rules.add(r[j]);
				}
			}
		}
		setDefaultReturnToken(other);
		return rules;
	}
}
