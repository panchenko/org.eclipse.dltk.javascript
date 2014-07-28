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
package org.eclipse.dltk.internal.javascript.ti;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.IProjectFragment;
import org.eclipse.dltk.core.IScriptProject;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.javascript.core.JavaScriptPlugin;
import org.eclipse.dltk.javascript.internal.library.TypeLibraryProjectFragment;
import org.eclipse.dltk.javascript.parser.jsdoc.JSDocTag;
import org.eclipse.dltk.javascript.typeinference.IValueCollection;
import org.eclipse.dltk.javascript.typeinfo.IRType;
import org.eclipse.dltk.javascript.typeinfo.ITypeInfoContext;
import org.eclipse.dltk.javascript.typeinfo.RTypes;
import org.eclipse.dltk.javascript.typeinfo.ReferenceSource;
import org.eclipse.dltk.javascript.typeinfo.TypeLibrary;
import org.eclipse.dltk.javascript.typeinfo.TypeLibraryManager;
import org.eclipse.dltk.javascript.typeinfo.model.Type;

class GlobalThisTypeDetector {

	static void configureTopValueCollection(ITypeInfoContext context,
			IValueCollection valueCollection) {
		final ReferenceSource source = context.getSource();
		if (source != null) {
			final IModelElement modelElement = source.getModelElement();
			if (modelElement != null) {
				try {
					final Set<IRType> types = getTypes(context,
							modelElement.getScriptProject());
					if (!types.isEmpty()) {
						valueCollection.getThis().setDeclaredType(
								types.size() == 1 ? types.iterator().next()
										: RTypes.union(types));
					}
				} catch (ModelException e) {
					JavaScriptPlugin.error(e);
				}
			}
		}
	}

	private static Set<IRType> getTypes(ITypeInfoContext context,
			IScriptProject project) throws ModelException {
		final Set<IRType> types = new HashSet<IRType>();
		for (IProjectFragment fragment : project.getProjectFragments()) {
			if (fragment instanceof TypeLibraryProjectFragment) {
				final TypeLibrary typeLibrary = TypeLibraryManager.getManager()
						.findExact(fragment.getPath().segment(1),
								fragment.getPath().segment(2));
				if (typeLibrary != null) {
					final String typeName = typeLibrary.attributes().get(
							JSDocTag.THIS);
					if (typeName != null) {
						final Type type = context.getKnownType(typeName);
						if (type != null) {
							types.add(RTypes.simple(context, type));
						}
					}
				}
			}
		}
		return types;
	}
}
