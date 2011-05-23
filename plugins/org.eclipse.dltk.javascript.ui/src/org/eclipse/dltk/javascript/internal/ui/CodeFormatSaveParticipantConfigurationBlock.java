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
package org.eclipse.dltk.javascript.internal.ui;

import org.eclipse.core.resources.IProject;
import org.eclipse.dltk.ui.preferences.AbstractOptionsBlock;
import org.eclipse.dltk.ui.preferences.PreferenceKey;
import org.eclipse.dltk.ui.util.IStatusChangeListener;
import org.eclipse.dltk.ui.util.SWTFactory;
import org.eclipse.jface.layout.GridLayoutFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridData;
import org.eclipse.swt.widgets.Button;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.preferences.IWorkbenchPreferenceContainer;

public class CodeFormatSaveParticipantConfigurationBlock extends
		AbstractOptionsBlock {

	public CodeFormatSaveParticipantConfigurationBlock(
			IStatusChangeListener context, IProject project,
			PreferenceKey[] allKeys, IWorkbenchPreferenceContainer container) {
		super(context, project, allKeys, container);
	}

	@Override
	protected Control createOptionsBlock(Composite parent) {
		final Composite pageComponent = new Composite(parent, SWT.NULL);
		pageComponent.setLayout(GridLayoutFactory.swtDefaults().create());
		pageComponent.setFont(parent.getFont());
		pageComponent.setLayoutData(new GridData(GridData.FILL_BOTH));

		final Button formatOnSave = SWTFactory.createCheckButton(pageComponent,
				"Format source code on save");
		bindControl(formatOnSave,
				CodeFormatSaveParticipantConfigurationPage.KEYS[0], null);

		return pageComponent;
	}

}
