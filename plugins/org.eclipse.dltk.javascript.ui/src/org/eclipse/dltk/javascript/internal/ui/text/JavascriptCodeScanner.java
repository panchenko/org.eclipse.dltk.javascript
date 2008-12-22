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
import org.eclipse.core.runtime.IExtension;
import org.eclipse.core.runtime.IExtensionPoint;
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

	private static void initProviders() {
		IExtensionPoint extensionPoint = Platform.getExtensionRegistry()
				.getExtensionPoint(
						"org.eclipse.dltk.javascript.ui.scriptcolor.provider");
		IExtension[] extensions = extensionPoint.getExtensions();
		ArrayList providerList = new ArrayList();
		for (int a = 0; a < extensions.length; a++) {
			IConfigurationElement[] configurationElements = extensions[a]
					.getConfigurationElements();
			for (int b = 0; b < configurationElements.length; b++) {

				IConfigurationElement configurationElement = configurationElements[b];
				try {
					Object createExecutableExtension = configurationElement
							.createExecutableExtension("class");
					if (createExecutableExtension instanceof IScriptColorProvider) {
						providerList.add(createExecutableExtension);
					}
				} catch (CoreException e) {
					e.printStackTrace();
				}
				// System.out.println(configurationElement.getName());
			}
		}
		IScriptColorProvider[] pr = new IScriptColorProvider[providerList
				.size()];
		providerList.toArray(pr);
		providers = pr;
	}

	public JavascriptCodeScanner(IColorManager manager, IPreferenceStore store) {
		super(manager, store);
		initialize();
	}

	protected String[] getTokenProperties() {
		return fgTokenProperties;
	}

	protected List createRules() {
		List/* <IRule> */rules = new ArrayList/* <IRule> */();
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
		for (int i = 0; i < JavaScriptKeywords.getJavaScriptKeywords().length; i++) {
			wordRule.addWord(JavaScriptKeywords.getJavaScriptKeywords()[i],
					keyword);
		}
		wordRule.addWord(fgReturnKeyword, keywordReturn);

		for (int i = 0; i < providers.length; i++) {
			String[] keywords = providers[i].getKeywords();
			if (keywords != null) {
				for (int j = 0; j < keywords.length; j++) {
					wordRule.addWord(keywords[j], providers[i]
							.getToken(keywords[j]));
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
