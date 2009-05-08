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

import org.eclipse.dltk.ui.formatter.FormatterModifyDialog;
import org.eclipse.dltk.ui.formatter.IFormatterModifyDialogOwner;
import org.eclipse.dltk.ui.formatter.IScriptFormatterFactory;

public class JavaScriptFormatterModifyDialog extends FormatterModifyDialog {

	public JavaScriptFormatterModifyDialog(
			IFormatterModifyDialogOwner dialogOwner,
			IScriptFormatterFactory formatterFactory) {
		super(dialogOwner, formatterFactory);
	}

	protected void addPages() {

		addTabPage(Messages.JavaScriptIdentationTabPage_name,
				new JavaScriptIdentationTabPage(this));
		addTabPage(Messages.JavaScriptBracesTabPage_name,
				new JavaScriptBracesTabPage(this));
		addTabPage(Messages.JavaScriptWhiteSpacesTabPage_name,
				new JavaScriptWhiteSpacesTabPage(this));
		addTabPage(Messages.JavaScriptControlStatementsTabPage_name,
				new JavaScriptControlStatementsTabPage(this));
	}

}
