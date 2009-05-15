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

import org.eclipse.dltk.formatter.FormatterBlockNode;
import org.eclipse.dltk.formatter.IFormatterContext;
import org.eclipse.dltk.formatter.IFormatterDocument;
import org.eclipse.dltk.formatter.IFormatterWriter;

public class OperationOrPunctuationNode extends FormatterBlockNode {

	private IPunctuationConfiguration configuration;

	public OperationOrPunctuationNode(IFormatterDocument document,
			IPunctuationConfiguration configuration) {
		super(document);
		this.configuration = configuration;
	}

	public void accept(IFormatterContext context, IFormatterWriter visitor)
			throws Exception {

		if (configuration.insertSpaceBefore())
			visitor.writeText(context, " ");

		super.accept(context, visitor);

		if (configuration.insertSpaceAfter())
			visitor.writeText(context, " ");
		else if (configuration.insertLineBreakAfter())
			visitor.writeLineBreak(context);
	}

}
