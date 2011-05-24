/*******************************************************************************
 * Copyright (c) 2011 NumberFour AG
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     NumberFour AG - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.internal.ui.preferences;

import org.eclipse.dltk.javascript.internal.ui.CodeFormatSaveParticipantConfigurationPage;
import org.eclipse.jface.dialogs.Dialog;
import org.eclipse.swt.SWT;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Link;
import org.eclipse.ui.dialogs.PropertyPage;
import org.eclipse.ui.preferences.IWorkbenchPreferenceContainer;

public class JavaScriptEditorPropertyPage extends PropertyPage {

	protected Control createContents(Composite parent) {
		final Composite composite = new Composite(parent, SWT.NONE);
		composite.setLayoutData(new GridData(GridData.FILL_BOTH));
		composite.setLayout(new GridLayout());
		final Link link = new Link(composite, SWT.WRAP);
		final GridData data = new GridData(SWT.FILL, SWT.BEGINNING, true, false);
		data.widthHint = 300;
		link.setLayoutData(data);
		link.setText(JavaScriptPreferenceMessages.JavaScriptEditorPropertyPage_SaveActionLink_Text);
		link.addSelectionListener(new SelectionAdapter() {
			public void widgetSelected(SelectionEvent e) {
				final IWorkbenchPreferenceContainer container = (IWorkbenchPreferenceContainer) getContainer();
				container
						.openPage(
								CodeFormatSaveParticipantConfigurationPage.PROPERTY_PAGE_ID,
								null);
			}
		});
		noDefaultAndApplyButton();
		Dialog.applyDialogFont(composite);
		return composite;
	}

}
