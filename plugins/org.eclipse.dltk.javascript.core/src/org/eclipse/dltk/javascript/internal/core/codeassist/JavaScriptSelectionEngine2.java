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
package org.eclipse.dltk.javascript.internal.core.codeassist;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.codeassist.ScriptSelectionEngine;
import org.eclipse.dltk.compiler.env.IModuleSource;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.model.LocalVariable;
import org.eclipse.dltk.internal.javascript.ti.IValueReference;
import org.eclipse.dltk.internal.javascript.ti.PositionReachedException;
import org.eclipse.dltk.internal.javascript.ti.ReferenceKind;
import org.eclipse.dltk.internal.javascript.ti.ReferenceLocation;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencer2;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.ast.SimpleType;
import org.eclipse.dltk.javascript.parser.JavaScriptParser;

public class JavaScriptSelectionEngine2 extends ScriptSelectionEngine {

	private static final boolean DEBUG = false;

	public IModelElement[] select(IModuleSource module, int position, int i) {
		if (module.getModelElement() == null) {
			return null;
		}
		String content = module.getSourceContents();
		if (position < 0 || position > content.length()) {
			return null;
		}
		if (DEBUG) {
			System.out.println("select in " + module.getFileName() + " at "
					+ position);
		}
		final Script script = new JavaScriptParser().parse(module, null);

		NodeFinder finder = new NodeFinder(content, position);
		ASTNode node = finder.locateNode(script);
		if (node != null) {
			if (DEBUG) {
				System.out.println(node.getClass().getName() + "=" + node);
			}
			if (node instanceof Identifier || node instanceof SimpleType) {
				final TypeInferencer2 inferencer2 = new TypeInferencer2();
				final SelectionVisitor visitor = new SelectionVisitor(
						inferencer2, node);
				inferencer2.setVisitor(visitor);
				inferencer2.setModelElement(module.getModelElement());
				IValueReference value;
				try {
					inferencer2.doInferencing(script);
					if (DEBUG) {
						System.out.println("node not found");
					}
					return null;
				} catch (PositionReachedException e) {
					value = e.getValue();
					if (value == null) {
						if (DEBUG) {
							System.out.println("node found, but value is null");
						}
						return null;
					}
				}
				final ReferenceKind kind = value.getKind();
				if (DEBUG) {
					System.out.println(value + "," + kind);
				}
				if (kind == ReferenceKind.ARGUMENT
						|| kind == ReferenceKind.LOCAL
						|| kind == ReferenceKind.FUNCTION) {
					final ReferenceLocation location = value.getLocation();
					if (DEBUG) {
						System.out.println(location);
					}
					if (location == ReferenceLocation.UNKNOWN) {
						return null;
					}
					return new IModelElement[] { new LocalVariable(module
							.getModelElement(), value.getName(), location
							.getDeclarationStart(), location
							.getDeclarationEnd(), location.getNameStart(),
							location.getNameEnd() - 1, null) };
				}
			}
		}

		// TODO Auto-generated method stub
		return null;
	}
}
