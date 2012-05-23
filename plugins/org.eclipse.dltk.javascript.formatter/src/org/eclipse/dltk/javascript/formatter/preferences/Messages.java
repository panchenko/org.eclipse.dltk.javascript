/*******************************************************************************
 * Copyright (c) 2009, 2012 xored software, Inc., NumberFour AG
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html  
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Vladimir Belov)
 *     NumberFour AG - dynamically show checkboxes only for the selected category (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.formatter.preferences;

import org.eclipse.osgi.util.NLS;

public class Messages extends NLS {

	private static final String BUNDLE_NAME = "org.eclipse.dltk.javascript.formatter.preferences.Messages";//$NON-NLS-1$

	public static String JavaScriptBracesTabPage_name;
	public static String JavaScriptBracesTabPage_BracePositionGroup_name;
	public static String JavaScriptBracesTabPage_FunctionDeclaration_name;
	public static String JavaScriptBracesTabPage_Blocks_name;
	public static String JavaScriptBracesTabPage_BlocksInCaseStatement_name;
	public static String JavaScriptBracesTabPage_SwitchStatement_name;
	public static String JavaScriptBracesTabPage_ArrayInitializer_name;
	public static String JavaScriptBracesTabPage_KeepEmptyArrayOnOneLine_name;
	public static String JavaScriptBracesTabPage_EmptyFunctionBraces_name;
	public static String JavaScriptBracesTabPage_EmptyObjectBraces_name;

	public static String JavaScriptBracesTabPage_BraceSameLine;
	public static String JavaScriptBracesTabPage_BraceNextLine;
	public static String JavaScriptBracesTabPage_BraceNextLineIndented;
	public static String JavaScriptBracesTabPage_BraceNextLineOnWrap;

	public static String JavaScriptCodeStyleConfigurationBlock_text;
	public static String JavaScriptCodeStylePreferencePage_description;

	public static String JavaScriptIdentationTabPage_name;
	public static String JavaScriptIdentationTabPage_IndentGroup_name;
	public static String JavaScriptIdentationTabPage_StatementsWithinFunctionBody_name;
	public static String JavaScriptIdentationTabPage_StatementsWithinBlocks_name;
	public static String JavaScriptIdentationTabPage_StatementsWithinSwitchBody_name;
	public static String JavaScriptIdentationTabPage_StatementsWithinCaseBody_name;
	public static String JavaScriptIdentationTabPage_BreakStatements_name;

	public static String JavaScriptWhiteSpacesTabPage_name;

	public static String JavaScriptWhileSpacesTabPage_InsertSpaces_name;

	public static String JavaScriptWhiteSpacesTabPage_ControlStatements;
	public static String JavaScriptWhiteSpacesTabPage_Expressions;

	public static String JavaScriptWhiteSpacesTabPage_InsertSpaceBeforeLP_name;
	public static String JavaScriptWhiteSpacesTabPage_InsertSpaceAfterLP_name;
	public static String JavaScriptWhiteSpacesTabPage_InsertSpaceBeforeRP_name;

	public static String JavaScriptWhiteSpacesTabPage_Function_name;
	public static String JavaScriptWhiteSpacesTabPage_InsertSpaceBetweenParensIfNoArguments_name;

	public static String JavaScriptWhiteSpacesTabPage_IfElse_name;
	public static String JavaScriptWhiteSpacesTabPage_For_name;
	public static String JavaScriptWhiteSpacesTabPage_Switch_name;
	public static String JavaScriptWhiteSpacesTabPage_While_name;
	public static String JavaScriptWhiteSpacesTabPage_Call_name;
	public static String JavaScriptWhiteSpacesTabPage_Expression_name;
	public static String JavaScriptWhiteSpacesTabPage_Catch_name;
	public static String JavaScriptWhiteSpacesTabPage_With_name;

	public static String JavaScriptControlStatementsTabPage_name;

	public static String JavaScriptCommentsTabPage_name;

	public static String JavaScriptFoldingPreferenceBlock_Comments_name;

	public static String JavaScriptFileCreationWizard_pageDescription;
	public static String JavaScriptFileCreationWizard_pageTitle;

	public static String JavaScriptNewLinesTabPage_name;
	public static String JavaScriptNewLinesTabPage_InsertNewLineGroup_name;
	public static String JavaScriptBracesTabPage_NewLineInEmptyMethodBody_name;
	public static String JavaScriptBracesTabPage_NewLineInEmptyBlock_name;
	public static String JavaScriptBracesTabPage_NewLineAtEndOfFile_name;

	public static String JavaScriptNewLinesTabPage_ObjectInitializersGroup_name;
	public static String JavaScriptNewLinesTabPage_ArrayInitializersGroup_name;
	public static String JavaScriptNewLinesTabPage_EmptyStatementsGroup_name;

	public static String JavaScriptControlStatementsTabPage_GeneralGroup_name;

	public static String JavaScriptControlStatementsTabPage_NewLineBeforeElse_name;
	public static String JavaScriptControlStatementsTabPage_NewLineBeforeCatch_name;
	public static String JavaScriptControlStatementsTabPage_NewLineBeforeFinally_name;
	public static String JavaScriptControlStatementsTabPage_NewLineBeforeWhile_name;

	public static String JavaScriptControlStatementsTabPage_IfElseGroup_name;
	public static String JavaScriptControlStatementsTabPage_KeepThenSameLine_name;
	public static String JavaScriptControlStatementsTabPage_KeepSimpleIfOneLine_name;
	public static String JavaScriptControlStatementsTabPage_KeepElseSameLine_name;
	public static String JavaScriptControlStatementsTabPage_KeepElseIfOneLine_name;
	public static String JavaScriptControlStatementsTabPage_KeepReturnOneLine_name;
	public static String JavaScriptControlStatementsTabPage_KeepThrowOneLine_name;

	private Messages() {
	}

	static {
		NLS.initializeMessages(BUNDLE_NAME, Messages.class);
	}

}
