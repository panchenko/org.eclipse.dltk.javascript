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
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

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

	private static List<String> loadMembers(final String typeName) {
		final List<String> names = new ArrayList<String>();
		final Set<Type> types = new HashSet<Type>();
		Type type = getType(typeName);
		while (type != null && types.add(type)) {
			for (Member member : type.getMembers()) {
				if (!member.isStatic() && !names.contains(member.getName()))
					names.add(member.getName());
			}
			type = type.getSuperType();
		}
		return Collections.unmodifiableList(names);
	}

	private static final Map<String, List<String>> members = new HashMap<String, List<String>>();

	private static List<String> getMembers(String typeName) {
		List<String> m = members.get(typeName);
		if (m == null) {
			m = loadMembers(typeName);
			members.put(typeName, m);
		}
		return m;
	}

	protected static List<String> getMethodsOfObject() {
		return getMembers(ITypeNames.OBJECT);
	}

	protected static List<String> getMethodsOfNumber() {
		return getMembers(ITypeNames.NUMBER);
	}

	protected static List<String> getMethodsOfString() {
		return getMembers(ITypeNames.STRING);
	}

	protected static List<String> getMethodsOfXML() {
		return getMembers(ITypeNames.XML);
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
