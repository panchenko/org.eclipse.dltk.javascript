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
import org.eclipse.dltk.ui.CodeFormatterConstants;
import org.eclipse.dltk.ui.formatter.FormatterModifyTabPage;
import org.eclipse.dltk.ui.formatter.IFormatterControlManager;
import org.eclipse.dltk.ui.formatter.IFormatterModifyDialog;
import org.eclipse.dltk.ui.preferences.FormatterMessages;
import org.eclipse.dltk.ui.util.SWTFactory;
import org.eclipse.swt.events.ModifyEvent;
import org.eclipse.swt.events.ModifyListener;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Combo;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Group;
import org.eclipse.swt.widgets.Text;

public class JavaScriptIdentationTabPage extends FormatterModifyTabPage {

	public JavaScriptIdentationTabPage(IFormatterModifyDialog dialog) {
		super(dialog);
	}

	private Combo tabPolicy;
	private Text indentSize;
	private Text tabSize;

	private final String[] tabPolicyItems = new String[] {
			CodeFormatterConstants.SPACE, CodeFormatterConstants.TAB,
			CodeFormatterConstants.MIXED };

	private final String[] tabPolicyItemNames = new String[] {
			FormatterMessages.IndentationTabPage_general_group_option_tab_policy_SPACE,
			FormatterMessages.IndentationTabPage_general_group_option_tab_policy_TAB,
			FormatterMessages.IndentationTabPage_general_group_option_tab_policy_MIXED };

	private class TabPolicyListener extends SelectionAdapter implements
			IFormatterControlManager.IInitializeListener {

		private final IFormatterControlManager manager;

		public TabPolicyListener(IFormatterControlManager manager) {
			this.manager = manager;
		}

		public void widgetSelected(SelectionEvent e) {
			int index = tabPolicy.getSelectionIndex();
			if (index >= 0) {
				final boolean tabMode = CodeFormatterConstants.TAB
						.equals(tabPolicyItems[index]);
				manager.enableControl(indentSize, !tabMode);
			}
		}

		public void initialize() {
			final boolean tabMode = CodeFormatterConstants.TAB.equals(manager
					.getString(CodeFormatterConstants.FORMATTER_TAB_CHAR));
			manager.enableControl(indentSize, !tabMode);
		}

	}

	private TabPolicyListener tabPolicyListener;

	protected void createOptions(final IFormatterControlManager manager,
			Composite parent) {
		Group tabPolicyGroup = SWTFactory.createGroup(parent,
				Messages.JavaScriptIdentationTabPage_GeneralSettingsGroup_name,
				2, 1, GridData.FILL_HORIZONTAL);
		tabPolicy = manager
				.createCombo(
						tabPolicyGroup,
						JavaScriptFormatterConstants.FORMATTER_TAB_CHAR,
						FormatterMessages.IndentationTabPage_general_group_option_tab_policy,
						tabPolicyItems, tabPolicyItemNames);
		tabPolicyListener = new TabPolicyListener(manager);
		tabPolicy.addSelectionListener(tabPolicyListener);
		manager.addInitializeListener(tabPolicyListener);
		indentSize = manager
				.createNumber(
						tabPolicyGroup,
						JavaScriptFormatterConstants.FORMATTER_INDENTATION_SIZE,
						FormatterMessages.IndentationTabPage_general_group_option_indent_size);
		tabSize = manager
				.createNumber(
						tabPolicyGroup,
						JavaScriptFormatterConstants.FORMATTER_TAB_SIZE,
						FormatterMessages.IndentationTabPage_general_group_option_tab_size);

		tabSize.addModifyListener(new ModifyListener() {
			public void modifyText(ModifyEvent e) {
				int index = tabPolicy.getSelectionIndex();
				if (index >= 0) {
					final boolean tabMode = CodeFormatterConstants.TAB
							.equals(tabPolicyItems[index]);
					if (tabMode) {
						indentSize.setText(tabSize.getText());
					}
				}
			}
		});

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

	protected URL getPreviewContent() {
		return getClass().getResource("indentation-preview.js"); //$NON-NLS-1$
	}
}
