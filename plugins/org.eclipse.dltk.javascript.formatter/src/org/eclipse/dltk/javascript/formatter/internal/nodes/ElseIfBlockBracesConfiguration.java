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
import org.eclipse.dltk.javascript.formatter.JavaScriptFormatterConstants;

public class ElseIfBlockBracesConfiguration extends
		AbstractElseBracesConfiguration {

	public ElseIfBlockBracesConfiguration(IFormatterDocument document) {
		super(document);

		// Do not set indentation level here, it sets by IF statement!
		bracesSettingName = JavaScriptFormatterConstants.BRACE_BLOCK;
	}

	public int insertBeforeOpenBrace() {
		if (getDocument().getBoolean(
				JavaScriptFormatterConstants.KEEP_ELSE_IF_ON_ONE_LINE))
			return IBracesConfiguration.ONE_SPACE;
		else
			return IBracesConfiguration.LINE_BREAK;
	}

	public int insertAfterOpenBrace() {
		return IBracesConfiguration.UNDEFINED;
	}

}
