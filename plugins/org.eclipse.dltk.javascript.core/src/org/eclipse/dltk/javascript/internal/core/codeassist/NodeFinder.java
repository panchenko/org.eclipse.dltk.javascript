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
import org.eclipse.dltk.javascript.ast.Script;

public class NodeFinder extends ASTVisitor {

	private final int position;

	public NodeFinder(int position) {
		this.position = position;
	}

	private ASTNode lastNode = null;

	@Override
	public boolean visit(ASTNode node) {
		if (lastNode == null || isCloser(node)) {
			lastNode = node;
			return true;
		} else {
			return false;
		}
	}

	private boolean isCloser(ASTNode node) {
		return node.sourceStart() >= lastNode.sourceStart()
				&& node.sourceStart() < position;
	}

	public ASTNode locate(Script script) {
		lastNode = null;
		try {
			script.traverse(this);
		} catch (Exception e) {
			return null;
		}
		return lastNode;
	}

}
