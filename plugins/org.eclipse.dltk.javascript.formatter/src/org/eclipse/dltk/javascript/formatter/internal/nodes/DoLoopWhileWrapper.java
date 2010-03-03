/*******************************************************************************
 * Copyright (c) 2009 xored software, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.formatter.internal.nodes;

import org.eclipse.dltk.formatter.FormatterTextNodeWrapper;
import org.eclipse.dltk.formatter.IFormatterContext;
import org.eclipse.dltk.formatter.IFormatterTextNode;
import org.eclipse.dltk.formatter.IFormatterWriter;
import org.eclipse.dltk.javascript.formatter.JavaScriptFormatterConstants;

public class DoLoopWhileWrapper extends FormatterTextNodeWrapper {

	public DoLoopWhileWrapper(IFormatterTextNode target) {
		super(target);
	}

	@Override
	public void accept(IFormatterContext context, IFormatterWriter visitor)
			throws Exception {
		if (!target.getDocument().getBoolean(
				JavaScriptFormatterConstants.NEW_LINE_BEFORE_WHILE_IN_DO)) {
			visitor.appendToPreviousLine(context, JSLiterals.EMPTY);
			visitor.writeText(context, JSLiterals.SPACE);
		}
		super.accept(context, visitor);
	}

}
