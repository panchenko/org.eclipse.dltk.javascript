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
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;

public class JavaScriptWhiteSpacesTabPage extends FormatterModifyTabPage {

	public JavaScriptWhiteSpacesTabPage(IFormatterModifyDialog dialog) {
		super(dialog);
	}

	private Group createGroup(Composite parent, String text) {
		return SWTFactory.createGroup(parent, text, 1, 1,
				GridData.FILL_HORIZONTAL);
	}

	private Button createCheckBox(IFormatterControlManager manager,
			Group group, String preferenceName, String text) {
		return manager.createCheckbox(group, preferenceName, text);
	}

	protected void createOptions(IFormatterControlManager manager,
			Composite parent) {

		SWTFactory.createLabel(parent,
				Messages.JavaScriptWhileSpacesTabPage_InsertSpaces_name, 1);

		// ///////////////////////////////////

		Group functionGroup = createGroup(parent,
				Messages.JavaScriptWhiteSpacesTabPage_Function_name);

		createCheckBox(
				manager,
				functionGroup,
				JavaScriptFormatterConstants.INSERT_SPACE_BEFORE_LP_FUNCTION_ARGUMENTS,
				Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceBeforeLP_name);

		createCheckBox(
				manager,
				functionGroup,
				JavaScriptFormatterConstants.INSERT_SPACE_AFTER_LP_FUNCTION_ARGUMENTS,
				Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceAfterLP_name);

		createCheckBox(
				manager,
				functionGroup,
				JavaScriptFormatterConstants.INSERT_SPACE_BEFORE_RP_FUNCTION_ARGUMENTS,
				Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceBeforeRP_name);

		createCheckBox(
				manager,
				functionGroup,
				JavaScriptFormatterConstants.INSERT_SPACE_BETWEEN_PARENS_FUNCTION_NO_ARGUMENTS,
				Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceBetweenParensIfNoArguments_name);

		// ///////////////////////////////////

		Group ifElseGroup = createGroup(parent,
				Messages.JavaScriptWhiteSpacesTabPage_IfElse_name);

		createCheckBox(manager, ifElseGroup,
				JavaScriptFormatterConstants.INSERT_SPACE_BEFORE_LP_IF,
				Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceBeforeLP_name);

		createCheckBox(manager, ifElseGroup,
				JavaScriptFormatterConstants.INSERT_SPACE_AFTER_LP_IF,
				Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceAfterLP_name);

		createCheckBox(manager, ifElseGroup,
				JavaScriptFormatterConstants.INSERT_SPACE_BEFORE_RP_IF,
				Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceBeforeRP_name);

		// ///////////////////////////////////

		Group switchGroup = createGroup(parent,
				Messages.JavaScriptWhiteSpacesTabPage_Switch_name);

		createCheckBox(manager, switchGroup,
				JavaScriptFormatterConstants.INSERT_SPACE_BEFORE_LP_SWITCH,
				Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceBeforeLP_name);

		createCheckBox(manager, switchGroup,
				JavaScriptFormatterConstants.INSERT_SPACE_AFTER_LP_SWITCH,
				Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceAfterLP_name);

		createCheckBox(manager, switchGroup,
				JavaScriptFormatterConstants.INSERT_SPACE_BEFORE_RP_SWITCH,
				Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceBeforeRP_name);

		// ///////////////////////////////////

		Group forGroup = createGroup(parent,
				Messages.JavaScriptWhiteSpacesTabPage_For_name);

		createCheckBox(manager, forGroup,
				JavaScriptFormatterConstants.INSERT_SPACE_BEFORE_LP_FOR,
				Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceBeforeLP_name);

		createCheckBox(manager, forGroup,
				JavaScriptFormatterConstants.INSERT_SPACE_AFTER_LP_FOR,
				Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceAfterLP_name);

		createCheckBox(manager, forGroup,
				JavaScriptFormatterConstants.INSERT_SPACE_BEFORE_RP_FOR,
				Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceBeforeRP_name);

		// ///////////////////////////////////

		Group whileGroup = createGroup(parent,
				Messages.JavaScriptWhiteSpacesTabPage_While_name);

		createCheckBox(manager, whileGroup,
				JavaScriptFormatterConstants.INSERT_SPACE_BEFORE_LP_WHILE,
				Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceBeforeLP_name);

		createCheckBox(manager, whileGroup,
				JavaScriptFormatterConstants.INSERT_SPACE_AFTER_LP_WHILE,
				Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceAfterLP_name);

		createCheckBox(manager, whileGroup,
				JavaScriptFormatterConstants.INSERT_SPACE_BEFORE_RP_WHILE,
				Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceBeforeRP_name);

		// ///////////////////////////////////

		Group catchGroup = createGroup(parent,
				Messages.JavaScriptWhiteSpacesTabPage_Catch_name);

		createCheckBox(manager, catchGroup,
				JavaScriptFormatterConstants.INSERT_SPACE_BEFORE_LP_CATCH,
				Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceBeforeLP_name);

		createCheckBox(manager, catchGroup,
				JavaScriptFormatterConstants.INSERT_SPACE_AFTER_LP_CATCH,
				Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceAfterLP_name);

		createCheckBox(manager, catchGroup,
				JavaScriptFormatterConstants.INSERT_SPACE_BEFORE_RP_CATCH,
				Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceBeforeRP_name);

		// ///////////////////////////////////

		Group withGroup = createGroup(parent,
				Messages.JavaScriptWhiteSpacesTabPage_With_name);

		createCheckBox(manager, withGroup,
				JavaScriptFormatterConstants.INSERT_SPACE_BEFORE_LP_WITH,
				Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceBeforeLP_name);

		createCheckBox(manager, withGroup,
				JavaScriptFormatterConstants.INSERT_SPACE_AFTER_LP_WITH,
				Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceAfterLP_name);

		createCheckBox(manager, withGroup,
				JavaScriptFormatterConstants.INSERT_SPACE_BEFORE_RP_WITH,
				Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceBeforeRP_name);

		// ///////////////////////////////////

		Group callGroup = createGroup(parent,
				Messages.JavaScriptWhiteSpacesTabPage_Call_name);

		createCheckBox(manager, callGroup,
				JavaScriptFormatterConstants.INSERT_SPACE_BEFORE_LP_CALL,
				Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceBeforeLP_name);

		createCheckBox(manager, callGroup,
				JavaScriptFormatterConstants.INSERT_SPACE_AFTER_LP_CALL,
				Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceAfterLP_name);

		createCheckBox(manager, callGroup,
				JavaScriptFormatterConstants.INSERT_SPACE_BEFORE_RP_CALL,
				Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceBeforeRP_name);

		// ///////////////////////////////////

		Group expressionGroup = createGroup(parent,
				Messages.JavaScriptWhiteSpacesTabPage_Expression_name);

		createCheckBox(manager, expressionGroup,
				JavaScriptFormatterConstants.INSERT_SPACE_BEFORE_LP_EXPRESSION,
				Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceBeforeLP_name);

		createCheckBox(manager, expressionGroup,
				JavaScriptFormatterConstants.INSERT_SPACE_AFTER_LP_EXPRESSION,
				Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceAfterLP_name);

		createCheckBox(manager, expressionGroup,
				JavaScriptFormatterConstants.INSERT_SPACE_BEFORE_RP_EXPRESSION,
				Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceBeforeRP_name);

	}

	protected URL getPreviewContent() {
		return getClass().getResource("whitespaces-preview.js"); //$NON-NLS-1$
	}
}
