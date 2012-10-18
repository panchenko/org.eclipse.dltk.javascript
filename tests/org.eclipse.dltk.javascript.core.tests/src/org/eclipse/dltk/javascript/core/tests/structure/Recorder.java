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

import org.eclipse.dltk.compiler.ISourceElementRequestorExtension;
import org.eclipse.dltk.compiler.SourceElementRequestorAdaptor;
import org.eclipse.dltk.compiler.SourceElementRequestorMode;

public class Recorder extends SourceElementRequestorAdaptor implements
		ISourceElementRequestorExtension {

	private final Stack<Member> structure = new Stack<Member>();

	private final Root root = new Root();

	public Recorder() {
		structure.push(root);
	}

	public Root getRoot() {
		return root;
	}

	private Member peek() {
		return structure.peek();
	}

	protected void push(Member child) {
		structure.peek().add(child);
		structure.push(child);
	}

	protected Member pop() {
		return structure.pop();
	}

	@Override
	public void enterField(FieldInfo info) {
		push(new Field(info.name));
	}
	
	@Override
	public boolean enterFieldCheckDuplicates(FieldInfo info) {
		Field field = new Field(info.name);
		if (structure.contains(field)) return false;
		push(field);
		return true;
	}

	@Override
	public void exitField(int declarationEnd) {
		pop();
	}

	@Override
	public void enterMethod(MethodInfo info) {
		push(new Method(info));
	}

	@Override
	public void exitMethod(int declarationEnd) {
		pop();
	}

	@Override
	public void acceptFieldReference(String fieldName, int sourcePosition) {
		peek().add(new FieldRef(fieldName));
	}

	@Override
	public void acceptMethodReference(String methodName, int argCount,
			int sourcePosition, int sourceEndPosition) {
		peek().add(new MethodRef(methodName));
	}

	public SourceElementRequestorMode getMode() {
		return SourceElementRequestorMode.INDEX;
	}

}
