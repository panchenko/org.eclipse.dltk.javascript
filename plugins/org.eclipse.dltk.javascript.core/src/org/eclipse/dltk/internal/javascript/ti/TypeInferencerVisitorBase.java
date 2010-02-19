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

import java.util.Stack;

import org.eclipse.dltk.javascript.ast.ASTVisitor;

public abstract class TypeInferencerVisitorBase extends
		ASTVisitor<IValueReference> {

	private Stack<IValueCollection> contexts = new Stack<IValueCollection>();

	protected IValueCollection peekContext() {
		return !contexts.isEmpty() ? contexts.peek() : null;
	}

	protected void enterContext(IValueCollection collection) {
		contexts.push(collection);
	}

	protected IValueCollection leaveContext() {
		return contexts.pop();
	}

	public void initialize() {
		contexts.clear();
		contexts.push(new ValueCollection());
	}

	public IValueCollection getCollection() {
		return contexts.get(0);
	}

	/**
	 * @param value1
	 * @param value2
	 * @return
	 */
	protected static IValueReference merge(IValueReference value1,
			IValueReference value2) {
		final ValueReference reference = new ValueReference();
		reference.addValue(value1);
		reference.addValue(value2);
		return reference;
	}

}
