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
package org.eclipse.dltk.javascript.ui.tests.autoedit;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import junit.framework.Assert;

import org.eclipse.jface.text.DocumentCommand;
import org.eclipse.jface.text.IDocument;

public class Cmd extends DocumentCommand {

	public Cmd(String text, int offset) {
		this(text, offset, 0);
	}

	public Cmd(String text, int offset, int length) {
		this.offset = offset;
		this.length = length;
		this.text = text;
		this.doit = true;
		this.caretOffset = offset;
		this.shiftsCaret = true;
	}

	public void apply(IDocument document) {
		if (!doit)
			return;
		try {
			Method execute = DocumentCommand.class.getDeclaredMethod("execute",
					IDocument.class);
			if (!execute.isAccessible())
				execute.setAccessible(true);
			execute.invoke(this, document);
		} catch (SecurityException e) {
			Assert.fail(e.toString());
		} catch (NoSuchMethodException e) {
			Assert.fail(e.toString());
		} catch (IllegalArgumentException e) {
			Assert.fail(e.toString());
		} catch (IllegalAccessException e) {
			Assert.fail(e.toString());
		} catch (InvocationTargetException e) {
			Assert.fail(e.toString());
		}
	}

}
