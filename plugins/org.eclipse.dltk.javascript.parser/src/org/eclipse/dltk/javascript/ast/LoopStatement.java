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

package org.eclipse.dltk.javascript.ast;


public abstract class LoopStatement extends Statement implements
		ISourceableBlock {

	private Statement body = null;

	public LoopStatement(JSNode parent) {
		super(parent);
	}

	public Statement getBody() {
		return this.body;
	}

	public void setBody(Statement body) {
		this.body = body;
	}

	public boolean isBlock() {
		return true;
	}

}
