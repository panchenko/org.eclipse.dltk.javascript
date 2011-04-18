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

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.ASTVisitor;
import org.eclipse.dltk.javascript.ast.FunctionStatement;
import org.eclipse.dltk.javascript.ast.ISemicolonStatement;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.ast.Statement;

public class NodeFinder extends ASTVisitor {
	final int originStart;
	final int originEnd;
	final int start;
	final int end;

	public NodeFinder(String content, int s, int e) {
		this.originStart = s;
		this.originEnd = e;
		int start = s;
		while (start > 0
				&& (content.charAt(start - 1) == ' ' || content
						.charAt(start - 1) == '\t')) {
			--start;
		}
		this.start = start;
		int end = e;
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

	public void locate(Script script) {
		if (!traverse(script)) {
			before = null;
			after = null;
		}
	}

	public ASTNode getNode() {
		final List<ASTNode> nodes = new ArrayList<ASTNode>();
		if (isValid(before)) {
			nodes.add(before);
		}
		if (isValid(after)) {
			nodes.add(after);
		}
		if (!nodes.isEmpty()) {
			if (nodes.size() > 1) {
				Collections.sort(nodes, new Comparator<ASTNode>() {
					public int compare(ASTNode o1, ASTNode o2) {
						int distance1 = distanceTo(o1);
						int distance2 = distanceTo(o2);
						return Math.abs(distance1) - Math.abs(distance2);
					}

					private int distanceTo(ASTNode o1) {
						if (o1.sourceStart() >= originStart
								&& o1.sourceStart() <= originEnd
								|| o1.sourceEnd() >= originStart
								&& o1.sourceEnd() <= originEnd) {
							return 0;
						} else {
							return ((o1.sourceEnd() + o1.sourceStart()) - (originStart + originEnd)) / 2;
						}
					}
				});
			}
			return nodes.get(0);
		}
		return null;
	}

	private boolean isValid(final ASTNode n) {
		return n != null && n.sourceStart() <= end && n.sourceEnd() >= start;
	}

}
