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

import org.eclipse.dltk.formatter.IFormatterContext;
import org.eclipse.dltk.formatter.IFormatterDocument;
import org.eclipse.dltk.formatter.IFormatterTextNode;
import org.eclipse.dltk.formatter.IFormatterWriter;
import org.eclipse.dltk.javascript.ast.Keywords;
import org.eclipse.dltk.javascript.formatter.JavaScriptFormatterConstants;

public class FormatterCaseNode extends FormatterBlockWithBeginEndNode {

	public FormatterCaseNode(IFormatterDocument document) {
		super(document);
	}

	public void accept(IFormatterContext context, IFormatterWriter visitor)
			throws Exception {
		context.setBlankLines(getBlankLinesBefore(context));
		if (getBegin() != null) {
			IFormatterTextNode[] nodes = getBegin();

			for (int i = 0; i < nodes.length; i++) {
				nodes[i].accept(context, visitor);

				if (nodes[i].getText().equals(Keywords.CASE)) {
					visitor.writeText(context, " ");
					continue;
				}

				if (nodes[i].getText().equals(String.valueOf(Keywords.COLON))) {
					context.setBlankLines(-1);
					visitor.writeLineBreak(context);
					visitor.skipNextLineBreaks(context);
					continue;
				}
			}
		}
		acceptBody(context, visitor);
	}

	protected boolean isIndenting() {
		return getDocument().getBoolean(
				JavaScriptFormatterConstants.INDENT_CASE);
	}
}
