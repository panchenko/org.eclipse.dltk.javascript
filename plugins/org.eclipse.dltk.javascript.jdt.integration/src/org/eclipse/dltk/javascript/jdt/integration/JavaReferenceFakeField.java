/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
/**
 * 
 */
package org.eclipse.dltk.javascript.jdt.integration;

import java.io.Reader;

import org.eclipse.dltk.internal.core.ModelElement;
import org.eclipse.dltk.internal.javascript.reference.resolvers.IResolvableMember;
import org.eclipse.dltk.internal.javascript.typeinference.FakeField;
import org.eclipse.jdt.core.IJavaElement;

public class JavaReferenceFakeField extends FakeField implements
		IResolvableMember {

	final IJavaElement element;

	JavaReferenceFakeField(ModelElement parent, String name, int offset,
			int length, IJavaElement res) {
		super(parent, name, offset, length);
		this.element = res;
	}

	public IJavaElement getJavaElement() {
		return element;
	}

	public Reader getInfo(boolean lookIntoParents, boolean lookIntoExternal) {
		// try {
		// FIXME Reader contentReader =
		// JavadocContentAccess.getHTMLContentReader(
		// (IMember) element, true, true);
		// // System.out.println(element);
		// return contentReader;
		// } catch (JavaModelException e) {
		return null;
		// }

	}

}
