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
package org.eclipse.dltk.javascript.internal.library;

import java.util.Set;

import org.eclipse.core.resources.IProject;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.internal.core.ExternalScriptProject;
import org.eclipse.dltk.javascript.core.JavaScriptPlugin;
import org.eclipse.dltk.javascript.typeinfo.ITypeInfoContext;
import org.eclipse.dltk.javascript.typeinfo.ITypeProvider;
import org.eclipse.dltk.javascript.typeinfo.TypeMode;
import org.eclipse.dltk.javascript.typeinfo.model.Type;

import com.google.common.util.concurrent.UncheckedExecutionException;

@SuppressWarnings("restriction")
public class TypeLibraryTypeProvider implements ITypeProvider {

	private TypeLibraryModelResourceSet resourceSet;

	public boolean initialize(ITypeInfoContext context) {
		final IModelElement element = context.getModelElement();
		if (element == null) {
			return false;
		}
		final IProject project = element.getScriptProject().getProject();
		if (ExternalScriptProject.EXTERNAL_PROJECT_NAME.equals(project
				.getName())) {
			return false;
		}
		try {
			resourceSet = TypeLibraryModelResourceSetCache.getInstance()
					.getUnchecked(project);
		} catch (UncheckedExecutionException e) {
			JavaScriptPlugin.error("Error loading type libraries", e);
			return false;
		}
		return true;
	}

	public Type getType(ITypeInfoContext context, TypeMode mode, String typeName) {
		if (mode == TypeMode.CODE) {
			return resourceSet.getTypeLiteral(typeName);
		} else {
			return resourceSet.getType(typeName, true);
		}
	}

	public Set<String> listTypes(ITypeInfoContext context, TypeMode mode,
			String prefix) {
		if (mode == TypeMode.CODE) {
			return resourceSet.listTypeLiterals(prefix);
		} else {
			return resourceSet.listTypes(prefix);
		}
	}
}
