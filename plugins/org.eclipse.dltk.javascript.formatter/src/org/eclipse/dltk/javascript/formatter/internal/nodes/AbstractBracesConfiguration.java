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

public abstract class AbstractBracesConfiguration implements
		IBracesConfiguration {

	private IFormatterDocument document;

	protected String indentingSettingName;
	protected String bracesSettingName;
	protected String keepSameLineSettingName;
	protected String newLineSettingName;

	public AbstractBracesConfiguration(IFormatterDocument document) {
		this.document = document;
	}

	protected IFormatterDocument getDocument() {
		return this.document;
	}

	public boolean isIndenting() {
		if (indentingSettingName != null && indentingSettingName.length() > 0)
			return document.getBoolean(indentingSettingName);

		// if (indentingSettingName != null && indentingSettingName.length() >
		// 0) {
		// boolean result = document.getBoolean(indentingSettingName);
		// System.out.println(">>> " + indentingSettingName + " = " + result);
		// return result;
		// }

		return false;
	}

	public boolean isBracesIndenting() {
		if (bracesSettingName != null && bracesSettingName.length() > 0)
			return JavaScriptFormatterConstants.BRACE_NEXT_LINE_INDENTED
					.equals(document.getString(bracesSettingName));

		return false;
	}

	public boolean isBeginLineBreaking() {
		if (bracesSettingName != null && bracesSettingName.length() != 0) {

			String value = document.getString(bracesSettingName);
			return JavaScriptFormatterConstants.BRACE_NEXT_LINE_INDENTED
					.equals(value)
					|| JavaScriptFormatterConstants.BRACE_NEXT_LINE
							.equals(value);

		}

		return false;
	}

	public boolean isStatementContinuation() {
		return true;
	}

	public boolean isEndLineBreaking() {
		if (keepSameLineSettingName != null
				&& keepSameLineSettingName.length() > 0) {
			return !document.getBoolean(keepSameLineSettingName);
		}

		if (newLineSettingName != null && newLineSettingName.length() > 0) {
			return document.getBoolean(newLineSettingName);
		}

		return true;
	}

}
