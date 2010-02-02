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

import org.eclipse.dltk.core.IForeignElement;
import org.eclipse.dltk.internal.core.ModelElement;
import org.eclipse.dltk.internal.javascript.reference.resolvers.IResolvableMember;
import org.eclipse.dltk.internal.javascript.typeinference.FakeField;
import org.eclipse.jdt.core.IJavaElement;
import org.eclipse.jdt.core.IMember;
import org.eclipse.jdt.core.JavaModelException;
import org.eclipse.jdt.ui.JavaUI;
import org.eclipse.jdt.ui.JavadocContentAccess;
import org.eclipse.ui.PartInitException;

final class JavaReferenceFakeField extends FakeField implements
		IForeignElement, IResolvableMember {

	final IJavaElement element;

	JavaReferenceFakeField(ModelElement parent, String name, int offset,
			int length, IJavaElement res) {
		super(parent, name, offset, length);
		this.element = res;
	}

	public void codeSelect() {
		try {
			JavaUI.openInEditor(element, true, true);
		} catch (PartInitException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (JavaModelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public Reader getInfo(boolean lookIntoParents, boolean lookIntoExternal) {
		try {
			Reader contentReader = JavadocContentAccess.getHTMLContentReader(
					(IMember) element, true, true);
			// System.out.println(element);
			return contentReader;
		} catch (JavaModelException e) {
			return null;
		}

	}

}
