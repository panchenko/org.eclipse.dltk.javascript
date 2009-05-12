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

package org.eclipse.dltk.javascript.formatter.internal;

import org.eclipse.dltk.formatter.FormatterWriter;
import org.eclipse.dltk.formatter.IFormatterContext;
import org.eclipse.dltk.formatter.IFormatterDocument;
import org.eclipse.dltk.ui.formatter.IFormatterIndentGenerator;

public class JavaScriptFormatterWriter extends FormatterWriter {

	public JavaScriptFormatterWriter(IFormatterDocument document,
			String lineDelimiter, IFormatterIndentGenerator indentGenerator) {
		super(document, lineDelimiter, indentGenerator);
	}

	@Override
	protected void writeIndent(IFormatterContext context, StringBuffer buffer) {
		super.writeIndent(context, buffer);

		JavaScriptFormatterContext jscontext = (JavaScriptFormatterContext) context;

		if (jscontext.getAdditionalIndent() != null) {
			buffer.append(jscontext.getAdditionalIndent());
		}
	}

}
