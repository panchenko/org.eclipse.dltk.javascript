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
package org.eclipse.dltk.internal.javascript.parser;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.dltk.ast.parser.IModuleDeclaration;
import org.eclipse.dltk.compiler.IElementRequestor.ElementInfo;
import org.eclipse.dltk.compiler.IElementRequestor.FieldInfo;
import org.eclipse.dltk.compiler.IElementRequestor.MethodInfo;
import org.eclipse.dltk.compiler.env.IModuleSource;
import org.eclipse.dltk.core.DLTKCore;
import org.eclipse.dltk.core.SourceParserUtil;
import org.eclipse.dltk.internal.javascript.ti.IReferenceAttributes;
import org.eclipse.dltk.internal.javascript.ti.IValueCollection;
import org.eclipse.dltk.internal.javascript.ti.IValueParent;
import org.eclipse.dltk.internal.javascript.ti.IValueReference;
import org.eclipse.dltk.internal.javascript.ti.ReferenceKind;
import org.eclipse.dltk.internal.javascript.ti.ReferenceLocation;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencer2;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.core.JavaScriptNature;
import org.eclipse.dltk.javascript.parser.JavaScriptParser;

public class JavaScriptSourceElementParser2 extends
		JavaScriptSourceElementParser implements IReferenceAttributes {

	protected boolean isEnabled(IModuleSource module) {
		if (module.getModelElement() != null) {
			final String parserId = module.getModelElement().getScriptProject()
					.getOption(DLTKCore.PROJECT_SOURCE_PARSER_ID, false);
			return JavaScriptParser.PARSER_ID.equals(parserId);
		}
		return false;
	}

	@Override
	public void parseSourceModule(IModuleSource module) {
		if (!isEnabled(module)) {
			super.parseSourceModule(module);
			return;
		}
		final Script script;
		// TODO use cache
		final IModuleDeclaration declaration = SourceParserUtil.parse(module,
				JavaScriptNature.NATURE_ID, fReporter);
		if (declaration instanceof Script) {
			script = (Script) declaration;
		} else {
			script = new JavaScriptParser().parse(module, fReporter);
		}
		final TypeInferencer2 inferencer = createInferencer();
		inferencer.doInferencing(script);
		fRequestor.enterModule();
		processScope(inferencer.getCollection(), new HashSet<IValueReference>());
		fRequestor.exitModule(script.sourceEnd());
	}

	protected TypeInferencer2 createInferencer() {
		return new TypeInferencer2();
	}

	/**
	 * @param statements
	 */
	private void processScope(IValueParent collection,
			Set<IValueReference> processed) {
		for (String childName : collection.getDirectChildren()) {
			final IValueReference child = collection.getChild(childName);
			if (child == null || !processed.add(child))
				continue;
			if (child.getKind() == ReferenceKind.LOCAL) {
				final FieldInfo fi = new FieldInfo();
				fi.name = childName;
				fi.type = extractType(child);
				final ReferenceLocation location = child.getLocation();
				copyLocation(location, fi);
				fRequestor.enterField(fi);
				processScope(child, processed);
				fRequestor.exitField(location.getDeclarationEnd());
			} else if (child.getKind() == ReferenceKind.FUNCTION
					|| child.getChild(IValueReference.FUNCTION_OP) != null) {
				final MethodInfo mi = new MethodInfo();
				mi.name = childName;
				mi.returnType = extractType(child
						.getChild(IValueReference.FUNCTION_OP));
				final ReferenceLocation location = child.getLocation();
				copyLocation(location, mi);
				final IValueReference[] parameters = (IValueReference[]) child
						.getAttribute(PARAMETERS);
				if (parameters != null && parameters.length != 0) {
					for (IValueReference parameter : parameters) {
						if (extractType(parameter) != null) {
							mi.parameterTypes = new String[parameters.length];
							break;
						}
					}
					mi.parameterNames = new String[parameters.length];
					for (int i = 0; i < parameters.length; ++i) {
						mi.parameterNames[i] = parameters[i].getName();
						if (mi.parameterTypes != null) {
							mi.parameterTypes[i] = extractType(parameters[i]);
						}
					}
				}
				fRequestor.enterMethod(mi);
				final IValueCollection functionScope = (IValueCollection) child
						.getAttribute(FUNCTION_SCOPE);
				if (functionScope != null) {
					processScope(functionScope, processed);
				}
				fRequestor.exitMethod(location.getDeclarationEnd());
			}
		}
	}

	private String extractType(IValueReference reference) {
		if (reference != null && reference.getDeclaredType() != null) {
			return reference.getDeclaredType().getName();
		} else {
			return null;
		}
	}

	/**
	 * @param location
	 * @param info
	 */
	private void copyLocation(ReferenceLocation location, ElementInfo info) {
		info.declarationStart = location.getDeclarationStart();
		info.nameSourceStart = location.getNameStart();
		info.nameSourceEnd = location.getNameEnd() - 1;
	}

}
