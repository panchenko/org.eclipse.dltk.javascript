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

package org.eclipse.dltk.javascript.formatter.preferences;

import java.net.URL;

import org.eclipse.dltk.javascript.formatter.JavaScriptFormatterConstants;
import org.eclipse.dltk.ui.formatter.FormatterIndentationGroup;
import org.eclipse.dltk.ui.formatter.FormatterModifyTabPage;
import org.eclipse.dltk.ui.formatter.IFormatterControlManager;
import org.eclipse.dltk.ui.formatter.IFormatterModifyDialog;
import org.eclipse.dltk.ui.util.SWTFactory;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

public class JavaScriptIndentationTabPage extends FormatterModifyTabPage {

	public JavaScriptIndentationTabPage(IFormatterModifyDialog dialog) {
		super(dialog);
	}

	@Override
	protected void createOptions(final IFormatterControlManager manager,
			Composite parent) {
		new FormatterIndentationGroup(manager, parent);
		//
		Group indentGroup = SWTFactory.createGroup(parent,
				Messages.JavaScriptIdentationTabPage_IndentGroup_name, 1, 1,
				GridData.FILL_HORIZONTAL);

		manager
				.createCheckbox(
						indentGroup,
						JavaScriptFormatterConstants.INDENT_METHOD,
						Messages.JavaScriptIdentationTabPage_StatementsWithinFunctionBody_name);

		manager
				.createCheckbox(
						indentGroup,
						JavaScriptFormatterConstants.INDENT_BLOCK,
						Messages.JavaScriptIdentationTabPage_StatementsWithinBlocks_name);

		manager
				.createCheckbox(
						indentGroup,
						JavaScriptFormatterConstants.INDENT_SWITCH,
						Messages.JavaScriptIdentationTabPage_StatementsWithinSwitchBody_name);
		manager
				.createCheckbox(
						indentGroup,
						JavaScriptFormatterConstants.INDENT_CASE,
						Messages.JavaScriptIdentationTabPage_StatementsWithinCaseBody_name);

		manager.createCheckbox(indentGroup,
				JavaScriptFormatterConstants.INDENT_BREAK,
				Messages.JavaScriptIdentationTabPage_BreakStatements_name);

	}

	@Override
	protected URL getPreviewContent() {
		return getClass().getResource("indentation-preview.js"); //$NON-NLS-1$
	}
}
