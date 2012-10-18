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

import org.eclipse.dltk.compiler.env.IModuleSource;
import org.eclipse.dltk.internal.javascript.parser.structure.JavaScriptSourceElementParser3;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.parser.JavaScriptParser;
import org.eclipse.dltk.javascript.structure.IStructureNode;
import org.eclipse.dltk.javascript.structure.ScriptScope;

@SuppressWarnings("restriction")
public final class TestJavaScriptSourceElementParser extends
		JavaScriptSourceElementParser3 {
	@Override
	protected Script parse(IModuleSource module) {
		final JavaScriptParser parser = new JavaScriptParser();
		return parser.parse(module, fReporter);
	}

	@Override
	protected void reportStructure(Script script, IStructureNode node) {
		if (DEBUG) {
			print(node, true, 0);
		}
		super.reportStructure(script, node);
	}

	static final boolean DEBUG = false;

	private void print(IStructureNode node, boolean printable, int level) {
		if (node.isManyChildren()) {
			final int nextLevel = node instanceof ScriptScope ? level
					: level + 1;
			for (IStructureNode child : node.getChildren()) {
				for (int i = 0; i < nextLevel; ++i) {
					System.out.print('\t');
				}
				System.out.println(child);
				print(child, true, nextLevel);
			}
		} else {
			for (IStructureNode child : node.getChildren()) {
				print(child, false, level);
			}
		}
	}

}
