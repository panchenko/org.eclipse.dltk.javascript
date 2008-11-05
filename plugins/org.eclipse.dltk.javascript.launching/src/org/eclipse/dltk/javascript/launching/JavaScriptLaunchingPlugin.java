package org.eclipse.dltk.javascript.launching;

import java.io.IOException;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Plugin;
import org.eclipse.core.runtime.Status;
import org.eclipse.dltk.core.environment.IDeployment;
import org.eclipse.dltk.core.environment.IExecutionEnvironment;
import org.eclipse.dltk.core.environment.IFileHandle;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class JavaScriptLaunchingPlugin extends Plugin {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.dltk.javascript.launching"; //$NON-NLS-1$

	// The shared instance
	private static JavaScriptLaunchingPlugin plugin;

	/**
	 * The constructor
	 */
	public JavaScriptLaunchingPlugin() {
		plugin = this;
	}

	/*
	 * @see Plugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
	}

	/*
	 * @see Plugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static JavaScriptLaunchingPlugin getDefault() {
		return plugin;
	}

	public static String getUniqueIdentifier() {
		return PLUGIN_ID;
	}

	public static void error(Throwable t) {
		plugin.getLog().log(
				new Status(IStatus.ERROR, PLUGIN_ID, IStatus.OK, t.toString(),
						t));
	}

	public IFileHandle getConsoleProxy(IExecutionEnvironment exeEnv)
			throws IOException {
		IDeployment deployment = exeEnv.createDeployment();
		IPath path = deployment.add(this.getBundle(), "console");
		path.append("ConsoleProxy.js");
		return deployment.getFile(path);
	}

}
