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
import java.util.List;
import java.util.Map;

import org.eclipse.dltk.codeassist.ICompletionEngine;
import org.eclipse.dltk.compiler.env.IModuleSource;
import org.eclipse.dltk.core.CompletionProposal;
import org.eclipse.dltk.core.DLTKLanguageManager;
import org.eclipse.dltk.core.tests.util.StringList;
import org.eclipse.dltk.javascript.core.JavaScriptNature;
import org.eclipse.dltk.javascript.internal.core.codeassist.JSCompletionEngine;
import org.eclipse.dltk.javascript.typeinfo.MemberPredicate;
import org.eclipse.dltk.javascript.typeinfo.ITypeNames;
import org.eclipse.dltk.javascript.typeinfo.MemberPredicates;
import org.eclipse.dltk.javascript.typeinfo.TypeMemberQuery;
import org.eclipse.dltk.javascript.typeinfo.model.Member;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelLoader;

@SuppressWarnings("restriction")
public abstract class AbstractCompletionTest extends AbstractContentAssistTest {

	protected ICompletionEngine createEngine(List<CompletionProposal> results,
			boolean useEngine) {

		final ICompletionEngine[] engines = DLTKLanguageManager
				.getCompletionEngines(JavaScriptNature.NATURE_ID);
		if (engines != null) {
			for (ICompletionEngine engine : engines) {
				if (engine instanceof JSCompletionEngine) {
					engine.setRequestor(new TestCompletionRequestor(results));
					((JSCompletionEngine) engine).setUseEngine(useEngine);
					return engine;
				}
			}
		}
		return null;
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
			List<CompletionProposal> proposals, boolean withKinds) {
		final StringList list = new StringList(proposals.size());
		for (int i = 0, size = proposals.size(); i < size; ++i) {
			final CompletionProposal proposal = proposals.get(i);
			String name = proposal.getName();
			if (withKinds
					&& proposal.getKind() == CompletionProposal.METHOD_REF) {
				name += "()";
			}
			list.add(name);
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
					exractProposalNames(results, false).sort().toString());
		}
	}

	protected void testWithKinds(IModuleSource module, int position,
			String[] compNames) {
		List<CompletionProposal> results = new ArrayList<CompletionProposal>();
		ICompletionEngine c = createEngine(results, false);
		c.complete(module, position, 0);
		if (!compareProposalNames(results, compNames)) {
			assertEquals(new StringList(compNames).sort().toString(),
					exractProposalNames(results, true).sort().toString());
		}
	}

	private static Type getType(String typeName) {
		return TypeInfoModelLoader.getInstance().getType(typeName, true);
	}

	private static List<String> loadMembers(final String typeName,
			MemberPredicate predicate) {
		final List<String> names = new ArrayList<String>();
		final Type type = getType(typeName);
		for (Member member : new TypeMemberQuery(type, predicate)) {
			if (!names.contains(member.getName()))
				names.add(member.getName());
		}
		return Collections.unmodifiableList(names);
	}

	private static final class Key {
		private final String name;
		private final Object predicate;

		public Key(String name, Object predicate) {
			this.name = name;
			this.predicate = predicate;
		}

		@Override
		public int hashCode() {
			return name.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof Key) {
				final Key other = (Key) obj;
				return name.equals(other.name)
						&& predicate.equals(other.predicate);
			}
			return false;
		}
	}

	private static final Map<Key, List<String>> members = new HashMap<Key, List<String>>();

	public static List<String> getMembers(String typeName,
			MemberPredicate predicate) {
		final Key key = new Key(typeName, predicate);
		List<String> m = members.get(key);
		if (m == null) {
			m = loadMembers(typeName, predicate);
			members.put(key, m);
		}
		return m;
	}

	protected static List<String> getMethodsOfObject() {
		return getMembers(ITypeNames.OBJECT, MemberPredicates.NON_STATIC);
	}

	protected static List<String> getMethodsOfArray() {
		return getMembers(ITypeNames.ARRAY, MemberPredicates.NON_STATIC);
	}

	protected static List<String> getMembersOfFunction() {
		return getMembers(ITypeNames.FUNCTION, MemberPredicates.NON_STATIC);
	}

	protected static List<String> getMethodsOfNumber() {
		return getMembers(ITypeNames.NUMBER, MemberPredicates.NON_STATIC);
	}

	protected static List<String> getMethodsOfString() {
		return getMembers(ITypeNames.STRING, MemberPredicates.NON_STATIC);
	}

	protected static List<String> getMethodsOfXML() {
		return getMembers(ITypeNames.XML, MemberPredicates.NON_STATIC);
	}

	protected static String[] concat(List<String> values, String... addition) {
		List<String> result = new ArrayList<String>(values.size()
				+ addition.length);
		result.addAll(values);
		Collections.addAll(result, addition);
		return result.toArray(new String[result.size()]);
	}

	protected static String[] concat(List<String> a, List<String> b,
			String... addition) {
		List<String> result = new ArrayList<String>(a.size() + b.size()
				+ addition.length);
		result.addAll(a);
		result.addAll(b);
		Collections.addAll(result, addition);
		return result.toArray(new String[result.size()]);
	}

}
