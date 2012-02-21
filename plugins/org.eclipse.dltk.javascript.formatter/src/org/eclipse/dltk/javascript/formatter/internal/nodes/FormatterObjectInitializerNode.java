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
 *     NumberFour AG - keep line breaks after object initializer (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.formatter.internal.nodes;

import org.eclipse.dltk.formatter.IFormatterContext;
import org.eclipse.dltk.formatter.IFormatterDocument;
import org.eclipse.dltk.formatter.IFormatterWriter;

public class FormatterObjectInitializerNode extends BracesNode {

	public FormatterObjectInitializerNode(IFormatterDocument document,
			IBracesConfiguration configuration) {
		super(document, configuration);
	}

	@Override
	public void accept(IFormatterContext context, IFormatterWriter visitor)
			throws Exception {
		super.accept(context, visitor);
		visitor.skipNextLineBreaks(context, false);
	}

}
