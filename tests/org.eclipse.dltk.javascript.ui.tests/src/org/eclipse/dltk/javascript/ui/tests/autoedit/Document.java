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

import org.eclipse.dltk.core.tests.util.StringList;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;

public class Document extends org.eclipse.jface.text.Document {

	public Document(String initialContent) {
		super(initialContent);
	}

	public Document(StringList strings) {
		this(strings.toString());
	}

	public int getEndOfLineOffset(int line) throws BadLocationException {
		return getEndOfLineOffset(this, line);
	}

	public static int getEndOfLineOffset(IDocument document, int line)
			throws BadLocationException {
		IRegion line1 = document.getLineInformation(line);
		return line1.getOffset() + line1.getLength();
	}
}
