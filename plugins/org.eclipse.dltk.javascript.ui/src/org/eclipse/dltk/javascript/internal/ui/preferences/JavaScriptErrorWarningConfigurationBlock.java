/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.javascript.internal.ui.preferences;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.dltk.ast.parser.SourceParserManager;
import org.eclipse.dltk.core.DLTKCore;
import org.eclipse.dltk.core.IDLTKContributedExtension;
import org.eclipse.dltk.core.SourceParserUtil;
import org.eclipse.dltk.javascript.core.JavaScriptCorePreferences;
import org.eclipse.dltk.javascript.core.JavaScriptNature;
import org.eclipse.dltk.javascript.core.JavaScriptPlugin;
import org.eclipse.dltk.javascript.parser.JavaScriptParserPlugin;
import org.eclipse.dltk.javascript.parser.JavaScriptParserPreferences;
import org.eclipse.dltk.ui.preferences.AbstractOptionsBlock;
import org.eclipse.dltk.ui.preferences.IPreferenceChangeRebuildPrompt;
import org.eclipse.dltk.ui.preferences.PreferenceChangeRebuildPrompt;
import org.eclipse.dltk.ui.preferences.PreferenceKey;
import org.eclipse.dltk.ui.util.IStatusChangeListener;
import org.eclipse.dltk.ui.util.SWTFactory;
import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.ui.preferences.IWorkbenchPreferenceContainer;

public class JavaScriptErrorWarningConfigurationBlock extends
		AbstractOptionsBlock {

	public JavaScriptErrorWarningConfigurationBlock(
			IStatusChangeListener context, IProject project,
			IWorkbenchPreferenceContainer container) {
		super(context, project, getKeys(project), container);
	}

	private static PreferenceKey[] getKeys(IProject project) {
		List<PreferenceKey> keys = new ArrayList<PreferenceKey>();
		keys.add(new PreferenceKey(JavaScriptPlugin.PLUGIN_ID,
				JavaScriptCorePreferences.USE_STRICT_MODE));
		if (project != null) {
			keys.add(new PreferenceKey(DLTKCore.PLUGIN_ID,
					DLTKCore.PROJECT_SOURCE_PARSER_ID));
		}
		keys.add(new PreferenceKey(JavaScriptParserPlugin.PLUGIN_ID,
				JavaScriptParserPreferences.ENABLE_TYPE_INFO));
		return keys.toArray(new PreferenceKey[keys.size()]);
	}

	@Override
	public Control createOptionsBlock(Composite parent) {
		final GridLayout layout = new GridLayout(2, false);
		layout.marginHeight = 0;
		layout.marginWidth = 0;

		final Composite composite = new Composite(parent, SWT.NULL);
		composite.setLayout(layout);
		composite.setFont(parent.getFont());

		if (isProjectPreferencePage()) {
			SWTFactory.createLabel(composite, "Parser", 1);
			final IDLTKContributedExtension[] extensions = SourceParserManager
					.getInstance().getContributions(JavaScriptNature.NATURE_ID);
			final String[] ids = new String[extensions.length];
			final String[] names = new String[extensions.length];
			for (int i = 0; i < extensions.length; ++i) {
				ids[i] = extensions[i].getId();
				names[i] = extensions[i].getName();
			}
			bindControl(SWTFactory.createCombo(composite, SWT.READ_ONLY, 1, 0,
					names), new PreferenceKey(DLTKCore.PLUGIN_ID,
					DLTKCore.PROJECT_SOURCE_PARSER_ID), ids);
		}

		bindControl(SWTFactory.createCheckButton(composite,
				JavaScriptPreferenceMessages.ErrorWarning_strictMode, null,
				false, 2), new PreferenceKey(JavaScriptPlugin.PLUGIN_ID,
				JavaScriptCorePreferences.USE_STRICT_MODE), null);
		bindControl(SWTFactory.createCheckButton(composite,
				JavaScriptPreferenceMessages.ErrorWarning_enableTypeInfo, null,
				false, 2), new PreferenceKey(JavaScriptParserPlugin.PLUGIN_ID,
				JavaScriptParserPreferences.ENABLE_TYPE_INFO), null);

		return composite;
	}

	@Override
	protected IPreferenceChangeRebuildPrompt getPreferenceChangeRebuildPrompt(
			boolean workspaceSettings, Collection<PreferenceKey> changedOptions) {
		return PreferenceChangeRebuildPrompt.create(workspaceSettings,
				"Parser Settings Changed", "The parser settings have changed.");
	}

	@Override
	protected Job[] createBuildJobs(IProject project) {
		final Job[] jobs = super.createBuildJobs(project);
		final Job[] result = new Job[jobs.length + 1];
		System.arraycopy(jobs, 0, result, 1, jobs.length);
		Job job0 = jobs[0];
		result[0] = new Job(job0.getName()) {
			@Override
			protected IStatus run(IProgressMonitor monitor) {
				SourceParserUtil.clearCache();
				return Status.OK_STATUS;
			}
		};
		result[0].setRule(job0.getRule());
		result[0].setUser(job0.isUser());
		result[0].setSystem(job0.isSystem());
		return result;
	}

}
