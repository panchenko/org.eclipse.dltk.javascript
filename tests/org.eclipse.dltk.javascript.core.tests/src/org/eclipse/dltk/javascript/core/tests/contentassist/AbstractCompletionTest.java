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

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

import junit.framework.AssertionFailedError;
import junit.framework.TestCase;

import org.eclipse.dltk.codeassist.ICompletionEngine;
import org.eclipse.dltk.compiler.util.Util;
import org.eclipse.dltk.core.CompletionProposal;
import org.eclipse.dltk.internal.javascript.typeinference.IReference;
import org.eclipse.dltk.internal.javascript.typeinference.NativeStringReference;
import org.eclipse.dltk.internal.javascript.typeinference.NativeXMLReference;
import org.eclipse.dltk.javascript.internal.core.codeassist.completion.JavaScriptCompletionEngine;

public class AbstractCompletionTest extends TestCase {

	protected ICompletionEngine createEngine(List<CompletionProposal> results,
			boolean useEngine) {
		JavaScriptCompletionEngine engine = new JavaScriptCompletionEngine();
		engine.setRequestor(new TestCompletionRequestor(results));
		engine.setUseEngine(useEngine);
		return engine;
	}

	protected int lastPositionInFile(String string, String moduleName) {
		URL resource = this.getClass().getResource(moduleName);
		try {
			final String content = new String(Util.getInputStreamAsCharArray(
					resource.openStream(), -1, "UTF-8"));
			final int position = content.lastIndexOf(string);
			if (position >= 0) {
				return position + string.length();
			} else {
				throw new AssertionFailedError("Not found");
			}
		} catch (IOException e) {
			throw new AssertionFailedError(e.toString());
		}
	}

	private void compareNames(List<CompletionProposal> results, String[] names) {
		assertEquals(names.length, results.size());
		Collections.sort(results, new Comparator<CompletionProposal>() {

			public int compare(CompletionProposal pr, CompletionProposal pr1) {
				return new String(pr.getName()).compareTo(new String(pr1
						.getName()));
			}

		});
		Arrays.sort(names);
		Iterator<CompletionProposal> it = results.iterator();
		int pos = 0;
		while (it.hasNext()) {
			CompletionProposal pr = it.next();
			assertEquals(names[pos], new String(pr.getName()));
			pos++;
		}
	}

	protected void basicTest(String mname, int position, String[] compNames) {
		List<CompletionProposal> results = new ArrayList<CompletionProposal>();
		ICompletionEngine c = createEngine(results, false);
		c.complete(new TestModule(this.getClass().getResource(mname)),
				position, 0);
		// assertEquals(2, results.size());
		compareNames(results, compNames);
	}

	private static List<String> stringMethods = null;

	protected static List<String> getMethodsOfString() {
		if (stringMethods == null) {
			List<String> names = new ArrayList<String>();
			for (Iterator<?> i = new NativeStringReference("").getChilds(false)
					.iterator(); i.hasNext();) {
				IReference reference = (IReference) i.next();
				names.add(reference.getName());
			}
			assertEquals(36, names.size());
			stringMethods = Collections.unmodifiableList(names);
		}
		return stringMethods;
	}

	private static List<String> xmlMethods = null;

	protected static List<String> getMethodsOfXML() {
		if (xmlMethods == null) {
			List<String> names = new ArrayList<String>();
			for (Iterator<?> i = new NativeXMLReference("").getChilds(false)
					.iterator(); i.hasNext();) {
				IReference reference = (IReference) i.next();
				names.add(reference.getName());
			}
			assertEquals(45, names.size());
			xmlMethods = Collections.unmodifiableList(names);
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
