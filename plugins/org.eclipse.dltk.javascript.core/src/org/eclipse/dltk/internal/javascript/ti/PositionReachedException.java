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
package org.eclipse.dltk.internal.javascript.ti;

import org.eclipse.dltk.ast.ASTNode;

@SuppressWarnings("serial")
public class PositionReachedException extends RuntimeException {

	private final ASTNode node;
	private final IValueReference reference;

	public PositionReachedException(ASTNode node, IValueReference reference) {
		this.node = node;
		this.reference = reference;
	}

	public ASTNode getNode() {
		return node;
	}

	public IValueReference getValue() {
		return reference;
	}

}
