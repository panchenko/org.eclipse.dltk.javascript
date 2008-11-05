package org.eclipse.dltk.javascript.internal.launching;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.dltk.javascript.launching.JavaScriptLaunchingPlugin;
import org.eclipse.osgi.util.NLS;
import org.osgi.framework.Bundle;

public class ClasspathUtils {

	public static void collectClasspath(String[] bundleIds, List entries) {
		try {
			final boolean developmentMode = Platform.inDevelopmentMode();
			for (int i = 0; i < bundleIds.length; ++i) {
				final String bundleId = bundleIds[i];
				final File file = getPluginLocation(bundleId);
				if (developmentMode && file.isDirectory()) {
					final File bin = new File(file, "bin"); //$NON-NLS-1$
					if (bin.isDirectory()) {
						entries.add(bin.getAbsolutePath());
						continue;
					}
				}
				entries.add(file.getAbsolutePath());
			}
		} catch (CoreException e) {
			JavaScriptLaunchingPlugin.error(e);
		}
	}

	private static File getPluginLocation(String bundleId) throws CoreException {
		try {
			final Bundle bundle = Platform.getBundle(bundleId);
			return FileLocator.getBundleFile(bundle);
		} catch (IOException e) {
			final String msg = NLS.bind(PLUGIN_LOCATION_ERROR, bundleId);
			throw new CoreException(new Status(IStatus.ERROR,
					JavaScriptLaunchingPlugin.PLUGIN_ID, IStatus.ERROR, msg, e));
		}
	}

	private static final String PLUGIN_LOCATION_ERROR = "Error determining classpath from bundle {0}"; //$NON-NLS-1$
}
