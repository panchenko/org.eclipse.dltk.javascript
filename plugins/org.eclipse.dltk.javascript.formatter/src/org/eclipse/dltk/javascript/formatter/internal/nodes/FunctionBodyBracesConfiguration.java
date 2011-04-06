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

public class FunctionBodyBracesConfiguration extends
		AbstractBracesConfiguration {

	private boolean emptyBody;

	public FunctionBodyBracesConfiguration(IFormatterDocument document,
			boolean emptyBody) {
		super(document);

		this.emptyBody = emptyBody;

		indentingSettingName = JavaScriptFormatterConstants.INDENT_METHOD;
		bracesSettingName = JavaScriptFormatterConstants.BRACE_METHOD;
	}

	public int insertBeforeOpenBrace() {
		if (emptyBody)
			return IBracesConfiguration.ONE_SPACE;
		else
			return super.insertBeforeOpenBrace();
	}

	public int insertAfterOpenBrace() {
		if (emptyBody)
			return IBracesConfiguration.EMPTY_SPACE;
		else
			return super.insertAfterOpenBrace();
	}

	public int insertBeforeCloseBrace() {
		if (emptyBody) {
			return document
					.getBoolean(JavaScriptFormatterConstants.BRACE_EMPTY_FUNCTION) ? IBracesConfiguration.EMPTY_SPACE
					: IBracesConfiguration.ONE_SPACE;
		} else {
			return super.insertBeforeCloseBrace();
		}
	}

	public int insertAfterCloseBrace() {
		return IBracesConfiguration.LINE_BREAK;
	}

}
