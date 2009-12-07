/*******************************************************************************
 * Copyright (c) 2000, 2006 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.dltk.javascript.internal.launching;

import java.io.IOException;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Status;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.Launch;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IProcess;
import org.eclipse.dltk.compiler.CharOperation;
import org.eclipse.dltk.compiler.util.Util;
import org.eclipse.dltk.core.IScriptProject;
import org.eclipse.dltk.javascript.internal.debug.JavaScriptDebugPlugin;
import org.eclipse.dltk.javascript.launching.IConfigurableRunner;
import org.eclipse.dltk.javascript.launching.IJavaScriptInterpreterRunnerConfig;
import org.eclipse.dltk.javascript.launching.JavaScriptLaunchConfigurationConstants;
import org.eclipse.dltk.javascript.launching.JavaScriptLaunchingPlugin;
import org.eclipse.dltk.launching.AbstractInterpreterRunner;
import org.eclipse.dltk.launching.AbstractScriptLaunchConfigurationDelegate;
import org.eclipse.dltk.launching.IInterpreterInstall;
import org.eclipse.dltk.launching.InterpreterConfig;
import org.eclipse.dltk.launching.debug.DbgpConstants;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.launching.IVMInstall;
import org.eclipse.jdt.launching.IVMRunner;
import org.eclipse.jdt.launching.JavaRuntime;
import org.eclipse.jdt.launching.VMRunnerConfiguration;

public class JavaScriptInterpreterRunner extends AbstractInterpreterRunner
		implements IConfigurableRunner {

	public static final IJavaScriptInterpreterRunnerConfig DEFAULT_CONFIG = new IJavaScriptInterpreterRunnerConfig() {

		public void adjustRunnerConfiguration(VMRunnerConfiguration vconfig,
				InterpreterConfig iconfig, ILaunch launch, IJavaProject project) {

		}

		public String[] computeClassPath(InterpreterConfig config,
				ILaunch launch, IJavaProject project) throws Exception {
			return JavaScriptInterpreterRunner.getClassPath(project);
		}

		public String[] getProgramArguments(InterpreterConfig config,
				ILaunch launch, IJavaProject project) {
			return CharOperation.NO_STRINGS;
		}

		public String getRunnerClassName(InterpreterConfig config,
				ILaunch launch, IJavaProject project) {
			return "RhinoRunner"; //$NON-NLS-1$
		}

	};
	private IJavaScriptInterpreterRunnerConfig config = DEFAULT_CONFIG;

	@Override
	public void run(InterpreterConfig config, ILaunch launch,
			IProgressMonitor monitor) throws CoreException {
		doRunImpl(config, launch, this.config);
	}

	public static void doRunImpl(InterpreterConfig config, ILaunch launch,
			IJavaScriptInterpreterRunnerConfig iconfig) throws CoreException {

		String host = (String) config.getProperty(DbgpConstants.HOST_PROP);
		if (host == null) {
			host = Util.EMPTY_STRING;
		}

		String port = (String) config.getProperty(DbgpConstants.PORT_PROP);
		if (port == null) {
			port = Util.EMPTY_STRING;
		}

		String sessionId = (String) config
				.getProperty(DbgpConstants.SESSION_ID_PROP);

		if (sessionId == null) {
			sessionId = Util.EMPTY_STRING;
		}

		IScriptProject proj = AbstractScriptLaunchConfigurationDelegate
				.getScriptProject(launch.getLaunchConfiguration());
		IJavaProject myJavaProject = JavaCore.create(proj.getProject());
		IVMInstall vmInstall = myJavaProject.exists() ? JavaRuntime
				.getVMInstall(myJavaProject) : JavaRuntime
				.getDefaultVMInstall();
		if (vmInstall != null) {
			IVMRunner vmRunner = vmInstall.getVMRunner(launch.getLaunchMode());
			if (vmRunner != null) {
				try {
					String[] newClassPath = getClassPath(myJavaProject);

					VMRunnerConfiguration vmConfig = new VMRunnerConfiguration(
							iconfig.getRunnerClassName(config, launch,
									myJavaProject), newClassPath);
					IPath scriptFilePath = config.getScriptFilePath();
					if (scriptFilePath == null) {
						throw new CoreException(new Status(IStatus.ERROR,
								JavaScriptDebugPlugin.PLUGIN_ID,
								"Script File name is not specified..."));
					}
					List<String> args = new ArrayList<String>();
					args.add(scriptFilePath.toPortableString());
					args.add(host);
					args.add(port);
					args.add(sessionId);
					String[] newStrings = iconfig.getProgramArguments(config,
							launch, myJavaProject);
					if (newStrings.length != 0) {
						args.addAll(Arrays.asList(newStrings));
					}
					vmConfig.setProgramArguments(args.toArray(new String[args
							.size()]));
					ILaunch launchr = new Launch(launch
							.getLaunchConfiguration(), launch.getLaunchMode(),
							null);
					iconfig.adjustRunnerConfiguration(vmConfig, config, launch,
							myJavaProject);
					vmRunner.run(vmConfig, launchr, null);
					IDebugTarget[] debugTargets = launchr.getDebugTargets();
					for (int a = 0; a < debugTargets.length; a++) {
						launch.addDebugTarget(debugTargets[a]);
					}
					IProcess[] processes = launchr.getProcesses();
					for (int a = 0; a < processes.length; a++)
						launch.addProcess(processes[a]);
					return;
				} catch (URISyntaxException e) {
					e.printStackTrace();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		throw new CoreException(new Status(IStatus.ERROR,
				JavaScriptLaunchingPlugin.PLUGIN_ID, "JRE is not configured"));
	}

	public static String[] getClassPath(IJavaProject myJavaProject)
			throws IOException, URISyntaxException {
		final List<String> result = new ArrayList<String>();
		ClasspathUtils
				.collectClasspath(
						new String[] {
								GenericJavaScriptInstallType.EMBEDDED_RHINO_BUNDLE_ID,
								GenericJavaScriptInstallType.DBGP_FOR_RHINO_BUNDLE_ID },
						result);
		try {
			final String[] classPath = computeBaseClassPath(myJavaProject);
			for (int i = 0; i < classPath.length; ++i) {
				result.add(classPath[i]);
			}
		} catch (CoreException e) {
		}
		return result.toArray(new String[result.size()]);
	}

	protected static String[] computeBaseClassPath(IJavaProject myJavaProject)
			throws CoreException {
		if (!myJavaProject.exists())
			return CharOperation.NO_STRINGS;
		return JavaRuntime.computeDefaultRuntimeClassPath(myJavaProject);
	}

	public JavaScriptInterpreterRunner(IInterpreterInstall install) {
		super(install);
	}

	@Override
	protected String getProcessType() {
		return JavaScriptLaunchConfigurationConstants.ID_JAVASCRIPT_PROCESS_TYPE;
	}

	public void setRunnerConfig(IJavaScriptInterpreterRunnerConfig config) {
		this.config = config;
	}
}
