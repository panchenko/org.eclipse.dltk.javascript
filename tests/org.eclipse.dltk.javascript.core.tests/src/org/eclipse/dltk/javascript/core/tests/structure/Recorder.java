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
package org.eclipse.dltk.javascript.core.tests.structure;

import java.util.Stack;

import org.eclipse.dltk.compiler.SourceElementRequestorAdaptor;

public class Recorder extends SourceElementRequestorAdaptor {

	private final Stack<Member> structure = new Stack<Member>();

	private final Root root = new Root();

	public Recorder() {
		structure.push(root);
	}

	public Root getRoot() {
		return root;
	}

	private void push(Member child) {
		structure.peek().addChild(child);
		structure.push(child);
	}

	private Member pop() {
		return structure.pop();
	}

	@Override
	public void enterField(FieldInfo info) {
		push(new Field(info.name));
	}

	@Override
	public void exitField(int declarationEnd) {
		pop();
	}

	@Override
	public void enterMethod(MethodInfo info) {
		push(new Method(info.name));
	}

	@Override
	public void exitMethod(int declarationEnd) {
		pop();
	}

}
