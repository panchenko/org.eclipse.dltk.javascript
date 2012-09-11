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

import org.eclipse.dltk.compiler.ISourceElementRequestor;
import org.eclipse.dltk.compiler.env.IModuleSource;
import org.eclipse.dltk.compiler.problem.IProblemReporter;
import org.eclipse.dltk.core.ISourceElementParser;
import org.eclipse.dltk.internal.javascript.parser.structure.IScope;
import org.eclipse.dltk.internal.javascript.parser.structure.IStructureNode;
import org.eclipse.dltk.internal.javascript.parser.structure.ObjectDeclaration;
import org.eclipse.dltk.internal.javascript.parser.structure.ScriptScope;
import org.eclipse.dltk.internal.javascript.parser.structure.StructureReporter3;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.parser.JavaScriptParserUtil;

public class JavaScriptSourceElementParser3 implements ISourceElementParser {

	protected ISourceElementRequestor fRequestor = null;
	protected IProblemReporter fReporter = null;

	public void setRequestor(ISourceElementRequestor requestor) {
		this.fRequestor = requestor;
	}

	public void setReporter(IProblemReporter reporter) {
		this.fReporter = reporter;
	}

	public void parseSourceModule(IModuleSource module) {
		final Script script = parse(module);
		final StructureReporter3 reporter = new StructureReporter3();
		fRequestor.enterModule();
		final IStructureNode node = reporter.visit(script);
		fRequestor.exitModule(script.sourceEnd());
		if (DEBUG) {
			System.out.println(module.getSourceContents().trim());
			System.out.println("--");
			print(node, true, 0);
			System.out.println("----");
		}
	}

	private void print(IStructureNode node, boolean printable, int level) {
		if (node instanceof IScope || node instanceof ObjectDeclaration) {
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

	protected Script parse(IModuleSource module) {
		return JavaScriptParserUtil.parse(module, fReporter);
	}

	private static final boolean DEBUG = true;
}
