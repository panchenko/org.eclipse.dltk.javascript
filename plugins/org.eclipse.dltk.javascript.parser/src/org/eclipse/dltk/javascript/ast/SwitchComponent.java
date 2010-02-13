/*******************************************************************************
 * Copyright (c) 2009 xored software, Inc.  
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html  
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.ast;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.dltk.ast.ASTNode;

public abstract class SwitchComponent extends JSNode implements ISourceable {

	private int colon = -1;
	private final List<Statement> statements = new ArrayList<Statement>();

	/**
	 * @param parent
	 */
	public SwitchComponent(ASTNode parent) {
		super(parent);
	}

	/**
	 * @since 2.0
	 */
	public abstract Keyword getKeyword();

	/**
	 * @since 2.0
	 */
	public int getColonPosition() {
		return this.colon;
	}

	/**
	 * @since 2.0
	 */
	public void setColonPosition(int colon) {
		this.colon = colon;
	}

	/**
	 * @since 2.0
	 */
	public List<Statement> getStatements() {
		return statements;
	}

}
