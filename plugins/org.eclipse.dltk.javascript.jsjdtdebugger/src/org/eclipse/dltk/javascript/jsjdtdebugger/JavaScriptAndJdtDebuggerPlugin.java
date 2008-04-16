package org.eclipse.dltk.javascript.jsjdtdebugger;

import org.eclipse.core.runtime.Preferences;
import org.eclipse.core.runtime.Preferences.IPropertyChangeListener;
import org.eclipse.core.runtime.Preferences.PropertyChangeEvent;
import org.eclipse.debug.core.DebugEvent;
import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.DebugPlugin;
import org.eclipse.debug.core.IDebugEventSetListener;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.model.IDebugTarget;
import org.eclipse.debug.core.model.IThread;
import org.eclipse.dltk.dbgp.commands.IDbgpPropertyCommands;
import org.eclipse.dltk.dbgp.exceptions.DbgpException;
import org.eclipse.dltk.debug.core.DLTKDebugPlugin;
import org.eclipse.dltk.debug.core.model.IScriptThread;
import org.eclipse.dltk.debug.ui.DLTKDebugUIPlugin;
import org.eclipse.dltk.javascript.jsjdtdebugger.preferences.IJavaScriptAndJdtDebuggerPreferenceConstants;
import org.eclipse.dltk.launching.DebuggingEngineRunner;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class JavaScriptAndJdtDebuggerPlugin extends AbstractUIPlugin implements
		IDebugEventSetListener, IPropertyChangeListener {

	private static final String SUSPEND_ON_ENTRY = "suspendOnEntry";
	private static final String SUSPEND_ON_EXIT = "suspendOnExit";

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.dltk.javascript.jsjdtdebugger";

	// The shared instance
	private static JavaScriptAndJdtDebuggerPlugin plugin;

	/**
	 * The constructor
	 */
	public JavaScriptAndJdtDebuggerPlugin() {
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.Plugins#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		super.start(context);
		plugin = this;

		Preferences prefs = getPluginPreferences();

		resetSuspendProperties(prefs);

		prefs.addPropertyChangeListener(this);
		DebugPlugin.getDefault().addDebugEventListener(this);
	}

	private void resetSuspendProperties(Preferences prefs) {
		prefs
				.setValue(
						IJavaScriptAndJdtDebuggerPreferenceConstants.PREF_BREAK_ON_METHOD_ENTRY,
						false);
		prefs
				.setValue(
						IJavaScriptAndJdtDebuggerPreferenceConstants.PREF_BREAK_ON_METHOD_EXIT,
						false);
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.Plugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		DebugPlugin.getDefault().removeDebugEventListener(this);
		getPluginPreferences().removePropertyChangeListener(this);
		plugin = null;
		super.stop(context);
	}

	/**
	 * Returns the shared instance
	 * 
	 * @return the shared instance
	 */
	public static JavaScriptAndJdtDebuggerPlugin getDefault() {
		return plugin;
	}

	public void handleDebugEvents(DebugEvent[] events) {
		for (int i = 0; i < events.length; i++) {
			DebugEvent event = events[i];
			if (event.getSource() instanceof IScriptThread
					&& event.getKind() == DebugEvent.CREATE) {
				IScriptThread thread = (IScriptThread) event.getSource();
				setupBreakOnMethodEntry(thread);
				setupBreakOnMethodExit(thread);
			}
		}
	}

	private void setupBreakOnMethodEntry(IScriptThread thread) {
		IDbgpPropertyCommands propCmds = thread.getDbgpSession()
				.getCoreCommands();
		try {
			Preferences prefs = getPluginPreferences();
			String suspendOnEntry = prefs
					.getString(IJavaScriptAndJdtDebuggerPreferenceConstants.PREF_BREAK_ON_METHOD_ENTRY);
			propCmds.setProperty(SUSPEND_ON_ENTRY, -1, suspendOnEntry);
		} catch (DbgpException e) {
			DLTKDebugPlugin.log(e);
		}
	}

	private void setupBreakOnMethodExit(IScriptThread thread) {
		IDbgpPropertyCommands propCmds = thread.getDbgpSession()
				.getCoreCommands();
		try {
			Preferences prefs = getPluginPreferences();
			String suspendOnExit = prefs
					.getString(IJavaScriptAndJdtDebuggerPreferenceConstants.PREF_BREAK_ON_METHOD_EXIT);
			propCmds.setProperty(SUSPEND_ON_EXIT, -1, suspendOnExit);
		} catch (DbgpException e) {
			DLTKDebugPlugin.log(e);
		}
	}

	private boolean isThisDebuggerLaunch(ILaunch launch) {
		String engineId = launch
				.getAttribute(DebuggingEngineRunner.LAUNCH_ATTR_DEBUGGING_ENGINE_ID);
		if (JavaScriptAndJDTDebuggerRunner.ENGINE_ID.equals(engineId)) {
			return true;
		}
		return false;
	}

	public void propertyChange(PropertyChangeEvent event) {
		if (IJavaScriptAndJdtDebuggerPreferenceConstants.PREF_BREAK_ON_METHOD_ENTRY
				.equals(event.getProperty())) {
			runForEachDebuggerThread(new IDebuggerThreadVisitor() {
				public void visit(IScriptThread thread) {
					setupBreakOnMethodEntry(thread);
				}
			});
		} else if (IJavaScriptAndJdtDebuggerPreferenceConstants.PREF_BREAK_ON_METHOD_EXIT
				.equals(event.getProperty())) {
			runForEachDebuggerThread(new IDebuggerThreadVisitor() {
				public void visit(IScriptThread thread) {
					setupBreakOnMethodExit(thread);
				}
			});
		}
	}

	private interface IDebuggerThreadVisitor {
		void visit(IScriptThread thread);
	}

	private void runForEachDebuggerThread(IDebuggerThreadVisitor visitor) {
		ILaunch[] launches = DebugPlugin.getDefault().getLaunchManager()
				.getLaunches();
		for (int i = 0; i < launches.length; i++) {
			ILaunch launch = launches[i];
			if (!isThisDebuggerLaunch(launch))
				continue;

			IDebugTarget target = launch.getDebugTarget();
			if (target == null)
				continue;

			IThread[] threads = null;
			try {
				threads = target.getThreads();
			} catch (DebugException e) {
				DLTKDebugUIPlugin.log(e);
			}

			if (threads == null || threads.length == 0)
				continue;

			for (int t = 0; t < threads.length; t++) {
				if (threads[t] instanceof IScriptThread) {
					IScriptThread scriptThread = (IScriptThread) threads[t];
					visitor.visit(scriptThread);
				}
			}
		}
	}
}
