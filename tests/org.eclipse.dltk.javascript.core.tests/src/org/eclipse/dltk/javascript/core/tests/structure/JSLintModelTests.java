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
package org.eclipse.dltk.javascript.core.tests.structure;

import java.io.File;
import java.io.IOException;

import junit.framework.TestCase;

import org.eclipse.dltk.compiler.env.IModuleSource;
import org.eclipse.dltk.compiler.env.ModuleSource;
import org.eclipse.dltk.compiler.util.Util;
import org.eclipse.dltk.core.ISourceElementParser;

public class JSLintModelTests extends TestCase {

	public void test1() throws IOException {
		final File file = new File("/home/dltk/apps/jslint.js");
		if (!file.exists()) {
			return;
		}
		final IModuleSource source = new ModuleSource(Util.getFileCharContent(
				file, null));
		ISourceElementParser parser = new TestJavaScriptSourceElementParser();
		parser.setRequestor(new Recorder());
		parser.parseSourceModule(source);
	}

}
