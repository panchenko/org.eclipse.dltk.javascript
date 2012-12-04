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
package org.eclipse.dltk.javascript.internal.search;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.compiler.util.Util;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.ast.StringLiteral;
import org.eclipse.dltk.javascript.core.JSBindings;

public abstract class AbstractMatchingNode<E extends ASTNode> implements
		MatchingNode {

	public final E node;

	public AbstractMatchingNode(E node) {
		this.node = node;
	}

	@Override
	public int hashCode() {
		return node.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof AbstractMatchingNode<?>) {
			final AbstractMatchingNode<?> other = (AbstractMatchingNode<?>) obj;
			return node.equals(other.node);
		}
		return false;
	}

	public int sourceStart() {
		return node.sourceStart();
	}

	public int sourceEnd() {
		return node.sourceEnd();
	}

	public int length() {
		return sourceEnd() - sourceStart();
	}

	public boolean needsResolve() {
		return false;
	}

	public boolean resolvePotentialMatch(JSBindings bindings) {
		return true;
	}

	public String getName() {
		if (node instanceof Identifier) {
			return ((Identifier) node).getName();
		} else if (node instanceof StringLiteral) {
			return ((StringLiteral) node).getValue();
		} else {
			return Util.EMPTY_STRING;
		}
	}

	@Override
	public String toString() {
		return getClass().getSimpleName() + "(" + node + ")";
	}

}
