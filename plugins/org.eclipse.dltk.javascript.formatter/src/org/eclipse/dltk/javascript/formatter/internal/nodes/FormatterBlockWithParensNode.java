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

package org.eclipse.dltk.javascript.formatter.internal.nodes;

import org.eclipse.dltk.formatter.IFormatterDocument;

public abstract class FormatterBlockWithParensNode extends
		FormatterBlockWithBeginNode {

	public FormatterBlockWithParensNode(IFormatterDocument document) {
		super(document);
	}

	public FormatterBlockWithParensNode(IFormatterDocument document,boolean startsOneNewLine) {
		super(document,startsOneNewLine);
	}


	protected abstract boolean insertSpaceBeforeLP();

	protected abstract boolean insertSpaceAfterLP();

	protected abstract boolean insertSpaceBeforeRP();

	protected abstract boolean insertNewLineAfterRP();

}
