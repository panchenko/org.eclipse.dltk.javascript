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
import org.eclipse.dltk.javascript.ast.ISemicolonStatement;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.ast.Statement;

public class NodeFinder extends ASTVisitor {

	final int start;
	final int end;

	public NodeFinder(String content, int position) {
		int start = position;
		while (start > 0
				&& (content.charAt(start - 1) == ' ' || content
						.charAt(start - 1) == '\t')) {
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
		return node instanceof Script || node instanceof FunctionStatement
				|| node instanceof Statement;
	}

	@Override
	public boolean visit(ASTNode node) {
		if (isBlock(node)) {
			if (node.sourceEnd() < start || node.sourceStart() > end) {
				return false;
			}
			if (node.sourceEnd() == start
					&& node instanceof ISemicolonStatement
					&& ((ISemicolonStatement) node).getSemicolonPosition() >= 0) {
				return false;
			}
			return true;
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
		if (isValid(before)
				&& before instanceof org.eclipse.dltk.javascript.ast.Type) {
			return (org.eclipse.dltk.javascript.ast.Type) before;
		}
		if (isValid(after)
				&& after instanceof org.eclipse.dltk.javascript.ast.Type) {
			return (org.eclipse.dltk.javascript.ast.Type) after;
		}
		return null;
	}

	public ASTNode locateNode(Script script) {
		if (!traverse(script)) {
			return null;
		}
		if (isValid(before)) {
			return before;
		}
		if (isValid(after)) {
			return after;
		}
		return null;
	}

	private boolean isValid(final ASTNode n) {
		return n != null && n.sourceStart() <= end && n.sourceEnd() >= start;
	}

}
