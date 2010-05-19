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
import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.javascript.ast.FunctionStatement;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.ast.Statement;

public class NodeFinder extends ASTVisitor {

	final int start;
	final int end;

	public NodeFinder(String content, int position) {
		int start = position;
		while (start > 0 && Character.isWhitespace(content.charAt(start - 1))) {
			--start;
		}
		this.start = start;
		int end = position;
		while (end < content.length()
				&& Character.isWhitespace(content.charAt(end))) {
			++end;
		}
		this.end = end;
	}

	ASTNode before = null;
	ASTNode after = null;

	private static boolean isBlock(ASTNode node) {
		return node instanceof FunctionStatement || node instanceof Statement;
	}

	@Override
	public boolean visit(ASTNode node) {
		if (isBlock(node)
				&& (node.sourceEnd() < start || node.sourceStart() > end)) {
			return false;
		}
		boolean enter = false;
		if (before == null || isCloser(node, before, start)) {
			before = node;
			enter = true;
		}
		if (after == null || isCloser(node, after, end)) {
			after = node;
			enter = true;
		}
		return enter;
	}

	private static boolean isCloser(ASTNode node, ASTNode result, int pos) {
		return node.sourceStart() >= result.sourceStart()
				&& node.sourceStart() <= pos;
	}

	private boolean traverse(Script script) {
		after = null;
		before = null;
		try {
			script.traverse(this);
			return true;
		} catch (Exception e) {
			return false;
		}
	}

	public org.eclipse.dltk.javascript.ast.Type locateType(Script script) {
		if (!traverse(script)) {
			return null;
		}
		if (before instanceof org.eclipse.dltk.javascript.ast.Type) {
			return (org.eclipse.dltk.javascript.ast.Type) before;
		}
		if (after instanceof org.eclipse.dltk.javascript.ast.Type) {
			return (org.eclipse.dltk.javascript.ast.Type) after;
		}
		return null;
	}

	public ASTNode locateNode(Script script) {
		if (!traverse(script)) {
			return null;
		}
		if (before != null && before.sourceStart() <= end
				&& before.sourceEnd() >= start) {
			return before;
		}
		if (after != null && after.sourceStart() <= end
				&& after.sourceEnd() >= start) {
			return after;
		}
		return null;
	}

}
