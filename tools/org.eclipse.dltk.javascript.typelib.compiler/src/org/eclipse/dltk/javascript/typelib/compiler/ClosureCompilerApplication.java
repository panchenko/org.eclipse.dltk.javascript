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
import java.util.Iterator;

import org.eclipse.dltk.javascript.typeinfo.TypeLibraryFormat;
import org.eclipse.dltk.javascript.typeinfo.TypeLibraryMetaType;
import org.eclipse.dltk.javascript.typeinfo.model.Member;
import org.eclipse.dltk.javascript.typeinfo.model.Method;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

import com.google.common.base.Charsets;
import com.google.common.collect.ImmutableMap;

public class ClosureCompilerApplication implements IApplication {

	@Override
	public Object start(IApplicationContext context) throws Exception {
		final String[] args = (String[]) context.getArguments().get(IApplicationContext.APPLICATION_ARGS);

		// final AbstractTypeLibraryCompiler compiler = new ClosureCompiler();
		// compiler.load(new File("/home/alex/DLTK/closure-compiler/externs/w3c_dom1.js"), Charsets.UTF_8);
		// compiler.load(new File("/home/alex/DLTK/closure-compiler/externs/w3c_dom2.js"), Charsets.UTF_8);
		// compiler.load(new File("/home/alex/DLTK/closure-compiler/externs/w3c_event.js"), Charsets.UTF_8);
		// compiler.resolveTypes();
		// compiler.save(
		// new File("/home/alex/DLTK/org.eclipse.dltk.javascript/tools/org.eclipse.dltk.javascript.typelib.compiler/dom."
		// + TypeLibraryFormat.FILE_EXTENSION),
		// ImmutableMap.of(TypeLibraryFormat.NAME_HEADER, "w3c_dom", TypeLibraryFormat.VERSION_HEADER, "1.0"));

		final VJETCompiler v = new VJETCompiler();
		v.load(new File("/home/alex/DLTK/vjet/org.eclipse.vjet.typelibs/JQueryTL/src/org/jquery/jQuery.js"), Charsets.UTF_8);
		v.resolveTypes();
		v.renameType("org.jquery.jQuery", "jQuery");
		v.addTypeLitreal("jQuery", "$");
		// remove "$" methods - we model them as static constructors.
		for (Type type : v.getTypes()) {
			type.setMetaType(TypeLibraryMetaType.INSTANCE);
			for (Iterator<Member> i = type.getMembers().iterator(); i.hasNext();) {
				final Member member = i.next();
				if (member instanceof Method && "$".equals(member.getName())) {
					i.remove();
				}
			}
		}
		v.mergeMethodParameterTypes();

		v.save(
				new File("/home/alex/DLTK/org.eclipse.dltk.javascript/tools/org.eclipse.dltk.javascript.typelib.compiler/jQuery."
						+ TypeLibraryFormat.FILE_EXTENSION),
				ImmutableMap.of(TypeLibraryFormat.NAME_HEADER, "jQuery", TypeLibraryFormat.VERSION_HEADER, "1.9"));

		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void stop() {
	}
}
