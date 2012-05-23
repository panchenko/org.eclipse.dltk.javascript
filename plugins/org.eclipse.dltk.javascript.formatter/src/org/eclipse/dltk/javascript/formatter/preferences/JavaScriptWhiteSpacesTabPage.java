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

import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.dltk.javascript.formatter.JavaScriptFormatterConstants;
import org.eclipse.dltk.ui.formatter.FormatterModifyTabPage;
import org.eclipse.dltk.ui.formatter.IFormatterControlManager;
import org.eclipse.dltk.ui.formatter.IFormatterModifyDialog;
import org.eclipse.dltk.ui.util.SWTFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.custom.StackLayout;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Tree;
import org.eclipse.swt.widgets.TreeItem;

public class JavaScriptWhiteSpacesTabPage extends FormatterModifyTabPage {

	public JavaScriptWhiteSpacesTabPage(IFormatterModifyDialog dialog) {
		super(dialog);
	}

	private Button createCheckBox(IFormatterControlManager manager,
			Composite group, String preferenceName, String text) {
		return manager.createCheckbox(group, preferenceName, text);
	}

	static class Pair {
		final String preferenceName;
		final String text;

		public Pair(String preferenceName, String text) {
			this.preferenceName = preferenceName;
			this.text = text;
		}
	}

	static Pair pair(String preferenceName, String text) {
		return new Pair(preferenceName, text);
	}

	class OptionContainer {
		final IFormatterControlManager manager;
		final Composite parent;
		final Tree groups;
		final Composite details;
		final StackLayout layout;
		final Map<String, TreeItem> rootItems = new HashMap<String, TreeItem>();

		public OptionContainer(IFormatterControlManager manager,
				Composite parent) {
			this.manager = manager;
			this.parent = parent;
			this.groups = new Tree(parent, SWT.BORDER | SWT.SINGLE);
			this.groups.setLayoutData(new GridData(GridData.FILL_BOTH));
			this.groups.addSelectionListener(new SelectionAdapter() {
				@Override
				public void widgetSelected(SelectionEvent e) {
					if (e.item != null && e.item instanceof TreeItem) {
						final TreeItem item = (TreeItem) e.item;
						final Control newControl;
						if (item.getData() instanceof Composite) {
							newControl = (Control) item.getData();
						} else {
							newControl = null;
						}
						if (newControl != layout.topControl) {
							layout.topControl = newControl;
							details.layout();
						}
					}
				}
			});
			// TODO (alex) use checked list and just change the displayed items.
			this.details = new Composite(parent, SWT.NONE);
			this.details.setLayoutData(new GridData(GridData.FILL_BOTH));
			this.details.setLayout(layout = new StackLayout());
		}

		void add(String rootName, String groupName, Pair... pairs) {
			TreeItem rootItem = rootItems.get(rootName);
			if (rootItem == null) {
				rootItem = new TreeItem(groups, SWT.NONE);
				rootItem.setText(rootName);
				rootItems.put(rootName, rootItem);
			}
			final Composite group = new Composite(details, SWT.BORDER);
			group.setLayout(new GridLayout());
			for (Pair pair : pairs) {
				createCheckBox(manager, group, pair.preferenceName, pair.text);
			}
			final TreeItem item = new TreeItem(rootItem, SWT.NONE);
			item.setText(groupName);
			item.setData(group);
			if (layout.topControl == null) {
				layout.topControl = group;
				groups.showItem(item);
				groups.select(item);
			}
		}
	}

	@Override
	protected void createOptions(IFormatterControlManager manager,
			Composite parent) {

		SWTFactory.createLabel(parent,
				Messages.JavaScriptWhileSpacesTabPage_InsertSpaces_name, 1);

		final OptionContainer container = new OptionContainer(manager, parent);

		container
				.add(Messages.JavaScriptWhiteSpacesTabPage_ControlStatements,
						Messages.JavaScriptWhiteSpacesTabPage_Function_name,
						pair(JavaScriptFormatterConstants.INSERT_SPACE_BEFORE_LP_FUNCTION_ARGUMENTS,
								Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceBeforeLP_name),
						pair(JavaScriptFormatterConstants.INSERT_SPACE_AFTER_LP_FUNCTION_ARGUMENTS,
								Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceAfterLP_name),
						pair(JavaScriptFormatterConstants.INSERT_SPACE_BEFORE_RP_FUNCTION_ARGUMENTS,
								Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceBeforeRP_name),
						pair(JavaScriptFormatterConstants.INSERT_SPACE_BETWEEN_PARENS_FUNCTION_NO_ARGUMENTS,
								Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceBetweenParensIfNoArguments_name));

		container
				.add(Messages.JavaScriptWhiteSpacesTabPage_ControlStatements,
						Messages.JavaScriptWhiteSpacesTabPage_IfElse_name,
						pair(JavaScriptFormatterConstants.INSERT_SPACE_BEFORE_LP_IF,
								Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceBeforeLP_name),
						pair(JavaScriptFormatterConstants.INSERT_SPACE_AFTER_LP_IF,
								Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceAfterLP_name),
						pair(JavaScriptFormatterConstants.INSERT_SPACE_BEFORE_RP_IF,
								Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceBeforeRP_name));

		container
				.add(Messages.JavaScriptWhiteSpacesTabPage_ControlStatements,
						Messages.JavaScriptWhiteSpacesTabPage_Switch_name,
						pair(JavaScriptFormatterConstants.INSERT_SPACE_BEFORE_LP_SWITCH,
								Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceBeforeLP_name),
						pair(JavaScriptFormatterConstants.INSERT_SPACE_AFTER_LP_SWITCH,
								Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceAfterLP_name),
						pair(JavaScriptFormatterConstants.INSERT_SPACE_BEFORE_RP_SWITCH,
								Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceBeforeRP_name));

		container
				.add(Messages.JavaScriptWhiteSpacesTabPage_ControlStatements,
						Messages.JavaScriptWhiteSpacesTabPage_For_name,
						pair(JavaScriptFormatterConstants.INSERT_SPACE_BEFORE_LP_FOR,
								Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceBeforeLP_name),
						pair(JavaScriptFormatterConstants.INSERT_SPACE_AFTER_LP_FOR,
								Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceAfterLP_name),
						pair(JavaScriptFormatterConstants.INSERT_SPACE_BEFORE_RP_FOR,
								Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceBeforeRP_name));

		container
				.add(Messages.JavaScriptWhiteSpacesTabPage_ControlStatements,
						Messages.JavaScriptWhiteSpacesTabPage_While_name,
						pair(JavaScriptFormatterConstants.INSERT_SPACE_BEFORE_LP_WHILE,
								Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceBeforeLP_name),
						pair(JavaScriptFormatterConstants.INSERT_SPACE_AFTER_LP_WHILE,
								Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceAfterLP_name),
						pair(JavaScriptFormatterConstants.INSERT_SPACE_BEFORE_RP_WHILE,
								Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceBeforeRP_name));

		container
				.add(Messages.JavaScriptWhiteSpacesTabPage_ControlStatements,
						Messages.JavaScriptWhiteSpacesTabPage_Catch_name,
						pair(JavaScriptFormatterConstants.INSERT_SPACE_BEFORE_LP_CATCH,
								Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceBeforeLP_name),
						pair(JavaScriptFormatterConstants.INSERT_SPACE_AFTER_LP_CATCH,
								Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceAfterLP_name),
						pair(JavaScriptFormatterConstants.INSERT_SPACE_BEFORE_RP_CATCH,
								Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceBeforeRP_name));

		container
				.add(Messages.JavaScriptWhiteSpacesTabPage_ControlStatements,
						Messages.JavaScriptWhiteSpacesTabPage_With_name,
						pair(JavaScriptFormatterConstants.INSERT_SPACE_BEFORE_LP_WITH,
								Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceBeforeLP_name),
						pair(JavaScriptFormatterConstants.INSERT_SPACE_AFTER_LP_WITH,
								Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceAfterLP_name),
						pair(JavaScriptFormatterConstants.INSERT_SPACE_BEFORE_RP_WITH,
								Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceBeforeRP_name));

		container
				.add(Messages.JavaScriptWhiteSpacesTabPage_Expressions,
						Messages.JavaScriptWhiteSpacesTabPage_Call_name,
						pair(JavaScriptFormatterConstants.INSERT_SPACE_BEFORE_LP_CALL,
								Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceBeforeLP_name),
						pair(JavaScriptFormatterConstants.INSERT_SPACE_AFTER_LP_CALL,
								Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceAfterLP_name),
						pair(JavaScriptFormatterConstants.INSERT_SPACE_BEFORE_RP_CALL,
								Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceBeforeRP_name));

		container
				.add(Messages.JavaScriptWhiteSpacesTabPage_Expressions,
						Messages.JavaScriptWhiteSpacesTabPage_Expression_name,
						pair(JavaScriptFormatterConstants.INSERT_SPACE_BEFORE_LP_EXPRESSION,
								Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceBeforeLP_name),
						pair(JavaScriptFormatterConstants.INSERT_SPACE_AFTER_LP_EXPRESSION,
								Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceAfterLP_name),
						pair(JavaScriptFormatterConstants.INSERT_SPACE_BEFORE_RP_EXPRESSION,
								Messages.JavaScriptWhiteSpacesTabPage_InsertSpaceBeforeRP_name));
	}

	@Override
	protected URL getPreviewContent() {
		return getClass().getResource("whitespaces-preview.js"); //$NON-NLS-1$
	}
}
