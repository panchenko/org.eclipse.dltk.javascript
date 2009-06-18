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

import org.eclipse.core.runtime.Assert;
import org.eclipse.dltk.formatter.IFormatterContext;
import org.eclipse.dltk.formatter.IFormatterDocument;
import org.eclipse.dltk.formatter.IFormatterNode;
import org.eclipse.dltk.formatter.IFormatterWriter;

public class ParensNode extends FormatterBlockWithBeginEndNode {

	private IParensConfiguration configuration;

	public ParensNode(IFormatterDocument document,
			IParensConfiguration configuration) {
		super(document);
		Assert.isNotNull(configuration);
		this.configuration = configuration;
	}

	public void accept(IFormatterContext context, IFormatterWriter visitor)
			throws Exception {

		writeSpace(context, visitor, configuration.getSpaceBeforeLeftParen());
		if (getBegin() != null) {
			IFormatterNode[] nodes = getBegin();
			for (int i = 0; i < nodes.length; i++) {
				nodes[i].accept(context, visitor);
			}
		}
		writeSpace(context, visitor, configuration.getSpaceAfterLeftParen());

		acceptBody(context, visitor);

		writeSpace(context, visitor, configuration.getSpaceBeforeRightParen());
		if (getEnd() != null) {
			visitor.write(context, getEnd().getStartOffset(), getEnd()
					.getEndOffset());
		}
	}

	private void writeSpace(IFormatterContext context,
			IFormatterWriter visitor, boolean flag) throws Exception {
		visitor.writeText(context, flag ? " " : "");
	}
}
