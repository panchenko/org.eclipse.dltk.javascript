/*******************************************************************************
 * Copyright (c) 2009 xored software, Inc.  
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html  
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Vladimir Belov)
 *******************************************************************************/

package org.eclipse.dltk.javascript.parser.tests;

import java.io.IOException;

import junit.framework.TestCase;

import org.eclipse.dltk.javascript.internal.parser.tests.JavaScriptTokenStreamTester;

@SuppressWarnings("nls")
public class JavaScriptStreamTokenTestCase extends TestCase {

	public void testE4XTokenizer() throws IOException {
		JavaScriptTokenStreamTester.tokenize("e4x.js", "UTF-8");
	}

	public void testE4XParser() throws IOException {
		JavaScriptTokenStreamTester.parse("e4x.js", "UTF-8");
	}

	public void testE4XSimpleTokenizer() throws IOException {
		JavaScriptTokenStreamTester.tokenize("e4x-simple.js");
	}

	public void testE4XSimpleParser() throws IOException {
		JavaScriptTokenStreamTester.parse("e4x-simple.js");
	}

	public void testArrayTokenizer() throws IOException {
		JavaScriptTokenStreamTester.tokenize("arrays.js");
	}

	public void testArrayParser() throws IOException {
		JavaScriptTokenStreamTester.parse("arrays.js");
	}

}
