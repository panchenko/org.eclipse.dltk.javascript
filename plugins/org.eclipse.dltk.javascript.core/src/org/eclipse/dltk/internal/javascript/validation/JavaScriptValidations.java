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
package org.eclipse.dltk.internal.javascript.validation;

import java.util.Set;

import org.eclipse.dltk.ast.parser.IModuleDeclaration;
import org.eclipse.dltk.core.DLTKCore;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.builder.IBuildContext;
import org.eclipse.dltk.internal.javascript.ti.IValueParent;
import org.eclipse.dltk.internal.javascript.ti.IValueReference;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.parser.JavaScriptParser;
import org.eclipse.dltk.javascript.parser.Reporter;
import org.eclipse.dltk.javascript.typeinfo.model.Type;

public class JavaScriptValidations {

	public static Script parse(IBuildContext context) {
		final ISourceModule module = context.getSourceModule();
		if (module != null) {
			final String parserId = module.getScriptProject().getOption(
					DLTKCore.PROJECT_SOURCE_PARSER_ID, false);
			if (!JavaScriptParser.PARSER_ID.equals(parserId)) {
				return null;
			}
		}
		final IModuleDeclaration savedAST = (IModuleDeclaration) context
				.get(IBuildContext.ATTR_MODULE_DECLARATION);
		if (savedAST instanceof Script) {
			return (Script) savedAST;
		}
		// TODO use cached AST
		final JavaScriptParser parser = new JavaScriptParser();
		// TODO use option from project
		parser.setTypeInformationEnabled(true);
		final Script script = parser.parse(context, context
				.getProblemReporter());
		context.set(IBuildContext.ATTR_MODULE_DECLARATION, script);
		return script;
	}

	public static Type typeOf(IValueParent parent) {
		if (parent instanceof IValueReference) {
			IValueReference reference = (IValueReference) parent;
			if (reference.getDeclaredType() != null) {
				return reference.getDeclaredType();
			}
			final Set<Type> types = reference.getTypes();
			if (types.size() == 1) {
				return types.toArray(new Type[1])[0];
			}
		}
		return null;
	}

	protected static Reporter createReporter(IBuildContext context) {
		return new Reporter(context.getLineTracker(), context
				.getProblemReporter());
	}

}
