package org.eclipse.dltk.javascript.internal.launching;

import java.io.File;
import java.io.IOException;
import java.net.URL;
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
			return getBundleFile(bundle);
		} catch (IOException e) {
			final String msg = NLS.bind(PLUGIN_LOCATION_ERROR, bundleId);
			throw new CoreException(new Status(IStatus.ERROR,
					JavaScriptLaunchingPlugin.PLUGIN_ID, IStatus.ERROR, msg, e));
		}
	}

	/**
	 * Returns a file for the contents of the specified bundle. Depending on how
	 * the bundle is installed the returned file may be a directory or a jar
	 * file containing the bundle content.
	 * 
	 * XXX 3.3 compatibility = {@link FileLocator#getBundleFile(Bundle)}
	 * 
	 * @param bundle
	 *            the bundle
	 * @return a file with the contents of the bundle
	 * @throws IOException
	 *             if an error occurs during the resolution
	 */
	public static File getBundleFile(Bundle bundle) throws IOException {
		URL rootEntry = bundle.getEntry("/"); //$NON-NLS-1$
		rootEntry = FileLocator.resolve(rootEntry);
		if ("file".equals(rootEntry.getProtocol())) //$NON-NLS-1$
			return new File(rootEntry.getPath());
		if ("jar".equals(rootEntry.getProtocol())) { //$NON-NLS-1$
			String path = rootEntry.getPath();
			if (path.startsWith("file:")) { //$NON-NLS-1$
				// strip off the file: and the !/
				path = path.substring(5, path.length() - 2);
				return new File(path);
			}
		}
		throw new IOException("Unknown protocol"); //$NON-NLS-1$
	}

	private static final String PLUGIN_LOCATION_ERROR = "Error determining classpath from bundle {0}"; //$NON-NLS-1$
}
