/*******************************************************************************
 * Copyright (c) 2009 xored software, Inc.  
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html  
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Vladimir Belov)
 *******************************************************************************/

package org.eclipse.dltk.javascript.internal.parser.tests;

import org.antlr.runtime.RuleReturnScope;
import org.antlr.runtime.tree.CommonTree;
import org.antlr.runtime.tree.Tree;

public class ANTLRTreeVisitor {

	int indent = 0;

	public ANTLRTreeVisitor() {
	}

	public boolean visit(Object node) {

		if (node instanceof RuleReturnScope)
			return visitScope((RuleReturnScope) node);

		if (node instanceof Tree)
			return visitTree((Tree) node);

		return false;
	}

	public boolean visitScope(RuleReturnScope scope) {
		printIndentationString();

		System.out.println(scope.getClass().toString());

		indent++;
		if (scope.getTree() != null) {
			visitTree((CommonTree) scope.getTree());
		}
		indent--;
		return false;
	}

	private void printIndentationString() {
		for (int i = 0; i < indent; i++) {
			System.out.print("  ");
		}
	}

	public boolean visitTree(Tree tree) {

		// printIndentationString();
		// System.out.println(tree.getClass().toString());

		printIndentationString();

		System.out.print(tree.getType());
		System.out.print(" - ");
		System.out.print(tree.getText());
		System.out.print("   tokens (");
		System.out.print(tree.getTokenStartIndex());
		System.out.print("..");
		System.out.print(tree.getTokenStopIndex());
		System.out.print(") ");
		System.out.print("   position (");
		System.out.print(tree.getLine());
		System.out.print(":");
		System.out.print(tree.getCharPositionInLine());
		System.out.println(")");

		indent++;
		for (int i = 0; i < tree.getChildCount(); i++) {
			visit(tree.getChild(i));
		}
		indent--;
		return false;
	}
}
