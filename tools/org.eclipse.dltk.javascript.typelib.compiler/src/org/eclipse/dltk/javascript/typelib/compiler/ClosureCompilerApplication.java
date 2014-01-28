/*******************************************************************************
 * Copyright (c) 2014 Alex Panchenko
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Alex Panchenko - initial API and Implementation
 *******************************************************************************/
package org.eclipse.dltk.javascript.typelib.compiler;

import java.io.File;

import org.eclipse.dltk.javascript.typeinfo.TypeLibraryFormat;
import org.eclipse.dltk.javascript.typelib.closure.ClosureCompiler;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

import com.google.common.base.Charsets;

public class ClosureCompilerApplication implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception {
		final String[] args = (String[]) context.getArguments().get(IApplicationContext.APPLICATION_ARGS);

		final ClosureCompiler compiler = new ClosureCompiler();
		compiler.load(new File("/home/alex/DLTK/closure-compiler/externs/w3c_dom1.js"), Charsets.UTF_8);
		compiler.load(new File("/home/alex/DLTK/closure-compiler/externs/w3c_dom2.js"), Charsets.UTF_8);
		compiler.load(new File("/home/alex/DLTK/closure-compiler/externs/w3c_event.js"), Charsets.UTF_8);

		compiler.resolveTypes();

		compiler.save(new File(
				"/home/alex/DLTK/org.eclipse.dltk.javascript/tools/org.eclipse.dltk.javascript.typelib.compiler/dom."
						+ TypeLibraryFormat.FILE_EXTENSION));

		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void stop() {
	}
}
