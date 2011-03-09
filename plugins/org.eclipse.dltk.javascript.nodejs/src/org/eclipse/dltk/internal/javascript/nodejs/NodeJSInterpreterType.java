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
package org.eclipse.dltk.internal.javascript.nodejs;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;

import org.eclipse.core.runtime.ILog;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.Platform;
import org.eclipse.dltk.core.environment.IDeployment;
import org.eclipse.dltk.core.environment.IFileHandle;
import org.eclipse.dltk.internal.launching.AbstractInterpreterInstallType;
import org.eclipse.dltk.javascript.core.JavaScriptNature;
import org.eclipse.dltk.launching.EnvironmentVariable;
import org.eclipse.dltk.launching.IInterpreterInstall;
import org.eclipse.dltk.launching.LibraryLocation;
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;

public class NodeJSInterpreterType extends AbstractInterpreterInstallType {

	public String getName() {
		return "node.js";
	}

	public String getNatureId() {
		return JavaScriptNature.NATURE_ID;
	}

	@Override
	protected IInterpreterInstall doCreateInterpreterInstall(String id) {
		return new NodeJSInterpreter(this, id);
	}

	@Override
	protected String[] getPossibleInterpreterNames() {
		return new String[] { "node" };
	}

	private static Bundle bundle;

	private static Bundle getBundle() {
		if (bundle == null) {
			bundle = FrameworkUtil.getBundle(NodeJSInterpreterType.class);
		}
		return bundle;
	}

	@Override
	protected String getPluginId() {
		return getBundle().getSymbolicName();
	}

	@Override
	protected ILog getLog() {
		return Platform.getLog(getBundle());
	}

	@Override
	protected IPath createPathFile(IDeployment deployment) throws IOException {
		// FIXME shouldn't be called
		return null;
	}

	@Override
	protected ILookupRunnable createLookupRunnable(IFileHandle installLocation,
			List<LibraryLocation> locations, EnvironmentVariable[] variables) {
		// TODO refactor DLTK to avoid this empty override
		return new ILookupRunnable() {
			public void run(IProgressMonitor monitor)
					throws InvocationTargetException, InterruptedException {
			}
		};
	}

}
