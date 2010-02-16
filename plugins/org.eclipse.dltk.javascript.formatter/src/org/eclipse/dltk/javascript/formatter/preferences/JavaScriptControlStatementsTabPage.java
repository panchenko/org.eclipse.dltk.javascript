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
import org.eclipse.dltk.ui.formatter.FormatterModifyTabPage;
import org.eclipse.dltk.ui.formatter.IFormatterControlManager;
import org.eclipse.dltk.ui.formatter.IFormatterModifyDialog;
import org.eclipse.dltk.ui.util.SWTFactory;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

public class JavaScriptControlStatementsTabPage extends FormatterModifyTabPage {

	public JavaScriptControlStatementsTabPage(IFormatterModifyDialog dialog) {
		super(dialog);
	}

	@Override
	protected void createOptions(IFormatterControlManager manager,
			Composite parent) {

		Group generalGroup = SWTFactory.createGroup(parent,
				Messages.JavaScriptControlStatementsTabPage_GeneralGroup_name,
				1, 1, GridData.FILL_HORIZONTAL);

		manager
				.createCheckbox(
						generalGroup,
						JavaScriptFormatterConstants.NEW_LINE_BEFORE_ELSE_IN_IF,
						Messages.JavaScriptControlStatementsTabPage_NewLineBeforeElse_name);

		manager
				.createCheckbox(
						generalGroup,
						JavaScriptFormatterConstants.KEEP_ELSE_IF_ON_ONE_LINE,
						Messages.JavaScriptControlStatementsTabPage_KeepElseIfOneLine_name);

		manager
				.createCheckbox(
						generalGroup,
						JavaScriptFormatterConstants.NEW_LINE_BEFORE_CATCH_IN_TRY,
						Messages.JavaScriptControlStatementsTabPage_NewLineBeforeCatch_name);

		manager
				.createCheckbox(
						generalGroup,
						JavaScriptFormatterConstants.NEW_LINE_BEFORE_FINALLY_IN_TRY,
						Messages.JavaScriptControlStatementsTabPage_NewLineBeforeFinally_name);

		manager
				.createCheckbox(
						generalGroup,
						JavaScriptFormatterConstants.NEW_LINE_BEFORE_WHILE_IN_DO,
						Messages.JavaScriptControlStatementsTabPage_NewLineBeforeWhile_name);

	}

	@Override
	protected URL getPreviewContent() {
		return getClass().getResource("control-statements-preview.js"); //$NON-NLS-1$
	}
}
