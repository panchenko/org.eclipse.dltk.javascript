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

		return false;
	}

	public boolean isBracesIndenting() {
		if (bracesSettingName != null && bracesSettingName.length() > 0)
			return JavaScriptFormatterConstants.BRACE_NEXT_LINE_INDENTED
					.equals(document.getString(bracesSettingName));

		return false;
	}

	public boolean isStatementContinuation() {
		return true;
	}

	public int insertBeforeOpenBrace() {
		if (bracesSettingName != null && bracesSettingName.length() != 0) {

			String value = document.getString(bracesSettingName);

			return JavaScriptFormatterConstants.BRACE_NEXT_LINE_INDENTED
					.equals(value)
					|| JavaScriptFormatterConstants.BRACE_NEXT_LINE
							.equals(value) ? IBracesConfiguration.LINE_BREAK
					: IBracesConfiguration.ONE_SPACE;

		}

		return IBracesConfiguration.UNDEFINED;
	}

	public int insertAfterOpenBrace() {
		return IBracesConfiguration.LINE_BREAK;
	}

	public int insertBeforeCloseBrace() {
		return IBracesConfiguration.LINE_BREAK;
	}

	public int insertAfterCloseBrace() {
		if (keepSameLineSettingName != null
				&& keepSameLineSettingName.length() > 0) {
			return document.getBoolean(keepSameLineSettingName) ? IBracesConfiguration.UNDEFINED
					: IBracesConfiguration.LINE_BREAK;
		}

		if (newLineSettingName != null && newLineSettingName.length() > 0) {
			return document.getBoolean(newLineSettingName) ? IBracesConfiguration.LINE_BREAK
					: IBracesConfiguration.UNDEFINED;
		}

		return IBracesConfiguration.UNDEFINED;

	}

	private static final String describe(int value) {
		switch (value) {
		case UNDEFINED:
			return "UNDEFINED";
		case ONE_SPACE:
			return "ONE_SPACE";
		case LINE_BREAK:
			return "LINE_BREAK";
		case EMPTY_SPACE:
			return "EMPTY_SPACE";
		default:
			return String.valueOf(value);
		}
	}

	@Override
	public String toString() {
		return "beforeOpenBrace=" + describe(insertBeforeOpenBrace())
				+ ", afterOpenBrace=" + describe(insertAfterOpenBrace())
				+ ", beforeCloseBrace=" + describe(insertBeforeCloseBrace())
				+ ", afterCloseBrace=" + describe(insertAfterCloseBrace());
	}

}
