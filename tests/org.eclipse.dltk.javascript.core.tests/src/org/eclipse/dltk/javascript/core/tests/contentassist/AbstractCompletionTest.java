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
package org.eclipse.dltk.javascript.core.tests.contentassist;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.dltk.codeassist.ICompletionEngine;
import org.eclipse.dltk.compiler.env.IModuleSource;
import org.eclipse.dltk.core.CompletionProposal;
import org.eclipse.dltk.core.DLTKLanguageManager;
import org.eclipse.dltk.core.tests.util.StringList;
import org.eclipse.dltk.javascript.core.JavaScriptNature;
import org.eclipse.dltk.javascript.internal.core.codeassist.JSCompletionEngine;
import org.eclipse.dltk.javascript.typeinfo.ITypeNames;
import org.eclipse.dltk.javascript.typeinfo.model.Member;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelLoader;

public abstract class AbstractCompletionTest extends AbstractContentAssistTest {

	protected ICompletionEngine createEngine(List<CompletionProposal> results,
			boolean useEngine) {
		final ICompletionEngine engine = DLTKLanguageManager
				.getCompletionEngine(JavaScriptNature.NATURE_ID);
		engine.setRequestor(new TestCompletionRequestor(results));
		if (engine instanceof JSCompletionEngine) {
			((JSCompletionEngine) engine).setUseEngine(useEngine);
		}
		return engine;
	}

	private static boolean compareProposalNames(
			List<CompletionProposal> proposals, String[] names) {
		if (names.length != proposals.size()) {
			return false;
		}
		Collections.sort(proposals, new Comparator<CompletionProposal>() {

			public int compare(CompletionProposal pr, CompletionProposal pr1) {
				return pr.getName().compareTo(pr1.getName());
			}

		});
		Arrays.sort(names);
		for (int i = 0, size = proposals.size(); i < size; ++i) {
			if (!names[i].equals(proposals.get(i).getName())) {
				return false;
			}
		}
		return true;
	}

	private static StringList exractProposalNames(
			List<CompletionProposal> proposals) {
		final StringList list = new StringList(proposals.size());
		for (int i = 0, size = proposals.size(); i < size; ++i) {
			list.add(proposals.get(i).getName());
		}
		return list;
	}

	protected void basicTest(IModuleSource module, int position,
			String[] compNames) {
		List<CompletionProposal> results = new ArrayList<CompletionProposal>();
		ICompletionEngine c = createEngine(results, false);
		c.complete(module, position, 0);
		if (!compareProposalNames(results, compNames)) {
			assertEquals(new StringList(compNames).sort().toString(),
					exractProposalNames(results).sort().toString());
		}
	}

	private static Type getType(String typeName) {
		return TypeInfoModelLoader.getInstance().getType(typeName);
	}

	private static List<String> getMembers(final String typeName) {
		List<String> names = new ArrayList<String>();
		for (Member member : getType(typeName).getMembers()) {
			if (!member.isStatic())
				names.add(member.getName());
		}
		return Collections.unmodifiableList(names);
	}

	private static List<String> objectMethods = null;

	protected static List<String> getMethodsOfObject() {
		if (objectMethods == null) {
			objectMethods = getMembers(ITypeNames.OBJECT);
			assertEquals(3, objectMethods.size());
		}
		return objectMethods;
	}

	private static List<String> numberMethods = null;

	protected static List<String> getMethodsOfNumber() {
		if (numberMethods == null) {
			numberMethods = getMembers(ITypeNames.NUMBER);
			assertEquals(7, numberMethods.size());
		}
		return numberMethods;
	}

	private static List<String> stringMethods = null;

	protected static List<String> getMethodsOfString() {
		if (stringMethods == null) {
			stringMethods = getMembers(ITypeNames.STRING);
			assertEquals(36, stringMethods.size());
		}
		return stringMethods;
	}

	private static List<String> xmlMethods = null;

	protected static List<String> getMethodsOfXML() {
		if (xmlMethods == null) {
			xmlMethods = getMembers(ITypeNames.XML);
			assertEquals(45, xmlMethods.size());
		}
		return xmlMethods;
	}

	protected static String[] concat(List<String> values, String... addition) {
		List<String> result = new ArrayList<String>(values.size()
				+ addition.length);
		result.addAll(values);
		for (String value : addition) {
			result.add(value);
		}
		return result.toArray(new String[result.size()]);
	}

}
