package org.eclipse.dltk.javascript.internal.launching;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.dltk.javascript.launching.JavaScriptLaunchingPlugin;
import org.eclipse.osgi.util.NLS;

public class ClasspathUtils {

	public static void collectClasspath(String[] bundleIds, List entries) {
		try {
			final boolean developmentMode = Platform.inDevelopmentMode();
			for (int i = 0; i < bundleIds.length; ++i) {
				final String bundleId = bundleIds[i];
				// if in dev mode, use the bin dir
				if (developmentMode) {
					final String binEntry = getFileLocation(bundleId, "/bin"); //$NON-NLS-1$
					if (binEntry != null) {
						entries.add(binEntry);
					}
				}
				final String entry = getPluginLocation(bundleId);
				if (entry != null) {
					entries.add(entry);
				}
			}
		} catch (CoreException e) {
			JavaScriptLaunchingPlugin.error(e);
		}
	}

	private static String getFileLocation(String bundleId, String path)
			throws CoreException {
		try {
			URL url = FileLocator.find(Platform.getBundle(bundleId), new Path(
					path), null);
			if (url != null) {
				URL fileUrl = FileLocator.toFileURL(url);
				File file = new File(fileUrl.getFile());
				return file.getAbsolutePath();
			} else {
				return null;
			}
		} catch (IOException e) {
			final String msg = NLS.bind(FILE_LOCATION_ERROR, path, bundleId);
			throw new CoreException(new Status(IStatus.ERROR,
					JavaScriptLaunchingPlugin.PLUGIN_ID, IStatus.ERROR, msg, e));
		}
	}

	private static String getPluginLocation(String bundleId)
			throws CoreException {
		try {
			URL url = new URL("platform:/plugin/" + bundleId); //$NON-NLS-1$			
			URL fileUrl = FileLocator.toFileURL(url);
			File file = new File(fileUrl.getFile());
			return file.getAbsolutePath();
		} catch (IOException e) {
			final String msg = NLS.bind(PLUGIN_LOCATION_ERROR, bundleId);
			throw new CoreException(new Status(IStatus.ERROR,
					JavaScriptLaunchingPlugin.PLUGIN_ID, IStatus.ERROR, msg, e));
		}
	}

	private static final String FILE_LOCATION_ERROR = "Error determining {0} file location from bundle {1}"; //$NON-NLS-1$
	private static final String PLUGIN_LOCATION_ERROR = "Error determining jar location from bundle {0}"; //$NON-NLS-1$
}
