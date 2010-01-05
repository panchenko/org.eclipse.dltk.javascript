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

import static org.eclipse.dltk.javascript.formatter.JavaScriptFormatterConstants.BRACE_NEXT_LINE;
import static org.eclipse.dltk.javascript.formatter.JavaScriptFormatterConstants.BRACE_NEXT_LINE_INDENTED;

import org.eclipse.dltk.formatter.IFormatterDocument;

public abstract class AbstractBracesConfiguration implements
		IBracesConfiguration {

	private final IFormatterDocument document;

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
		if (indentingSettingName != null)
			return document.getBoolean(indentingSettingName);

		return false;
	}

	public boolean isBracesIndenting() {
		if (bracesSettingName != null)
			return BRACE_NEXT_LINE_INDENTED.equals(document
					.getString(bracesSettingName));

		return false;
	}

	public boolean isStatementContinuation() {
		return true;
	}

	public int insertBeforeOpenBrace() {
		if (bracesSettingName != null) {
			String value = document.getString(bracesSettingName);
			return BRACE_NEXT_LINE_INDENTED.equals(value)
					|| BRACE_NEXT_LINE.equals(value) ? IBracesConfiguration.LINE_BREAK
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
		if (keepSameLineSettingName != null) {
			return document.getBoolean(keepSameLineSettingName) ? IBracesConfiguration.UNDEFINED
					: IBracesConfiguration.LINE_BREAK;
		}

		if (newLineSettingName != null) {
			return document.getBoolean(newLineSettingName) ? IBracesConfiguration.LINE_BREAK
					: IBracesConfiguration.UNDEFINED;
		}

		return IBracesConfiguration.UNDEFINED;

	}

	private static final String describe(int value) {
		switch (value) {
		case UNDEFINED:
			return "UNDEFINED"; //$NON-NLS-1$
		case ONE_SPACE:
			return "ONE_SPACE"; //$NON-NLS-1$
		case LINE_BREAK:
			return "LINE_BREAK"; //$NON-NLS-1$
		case EMPTY_SPACE:
			return "EMPTY_SPACE"; //$NON-NLS-1$
		default:
			return String.valueOf(value);
		}
	}

	@Override
	public String toString() {
		return "beforeOpenBrace=" + describe(insertBeforeOpenBrace()) //$NON-NLS-1$
				+ ", afterOpenBrace=" + describe(insertAfterOpenBrace()) //$NON-NLS-1$
				+ ", beforeCloseBrace=" + describe(insertBeforeCloseBrace()) //$NON-NLS-1$
				+ ", afterCloseBrace=" + describe(insertAfterCloseBrace()); //$NON-NLS-1$
	}

}
