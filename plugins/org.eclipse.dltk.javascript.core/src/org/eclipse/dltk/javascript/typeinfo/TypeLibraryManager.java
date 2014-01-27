/*******************************************************************************
 * Copyright (c) 2014 Alex Panchenko
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Alex Panchenko - initial API and Implementation
 *******************************************************************************/
package org.eclipse.dltk.javascript.typeinfo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;
import java.util.zip.ZipEntry;
import java.util.zip.ZipInputStream;

import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.Assert;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.core.runtime.jobs.Job;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.dltk.annotations.Nullable;
import org.eclipse.dltk.core.DLTKCore;
import org.eclipse.dltk.core.IBuildpathContainer;
import org.eclipse.dltk.core.IBuildpathEntry;
import org.eclipse.dltk.core.IScriptProject;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.javascript.core.JavaScriptNature;
import org.eclipse.dltk.javascript.core.JavaScriptPlugin;
import org.eclipse.dltk.javascript.internal.library.TypeLibraryContainer;
import org.eclipse.dltk.utils.BundleUtil;
import org.eclipse.osgi.util.NLS;
import org.osgi.framework.Bundle;
import org.osgi.framework.Version;
import org.osgi.service.prefs.BackingStoreException;

import com.google.gson.Gson;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;

public class TypeLibraryManager {

	private static final String LIBRARY_ELEMENT = "library";

	private static TypeLibraryManager manager = null;

	private TypeLibraryManager() {
		for (IConfigurationElement element : Platform.getExtensionRegistry()
				.getConfigurationElementsFor(TypeInfoManager.EXT_POINT)) {
			if (LIBRARY_ELEMENT.equals(element.getName())) {
				final Bundle bundle = BundleUtil.getBundle(element);
				if (bundle == null) {
					continue;
				}
				registerBundledLibrary(bundle, element.getAttribute("location"));
			}
		}
		for (File file : loadFromPreferences()) {
			if (file.isFile()) {
				try {
					registerLibrary(file, TypeLibrary.Kind.USER);
				} catch (Exception e) {
					JavaScriptPlugin.error(NLS.bind(
							"Error registering user library {0}", file), e);
				}
			}
		}
	}

	private TypeLibrary registerBundledLibrary(Bundle bundle, String location) {
		try {
			return registerLibrary(BundleUtil.getFile(bundle, location),
					TypeLibrary.Kind.BUILTIN);
		} catch (Exception e) {
			JavaScriptPlugin.error(NLS.bind(
					"Error registering library {0} from {1}", location,
					bundle.getSymbolicName()), e);
			return null;
		}
	}

	public static synchronized TypeLibraryManager getManager() {
		if (manager == null) {
			manager = new TypeLibraryManager();
		}
		return manager;
	}

	public static synchronized void shutdown() {
		if (manager != null) {
			manager.close();
		}
	}

	void close() {
		// TODO (alex) close if there is something
	}

	/**
	 * Registers the library from the specified file.
	 */
	public TypeLibrary registerLibrary(File libraryFile, TypeLibrary.Kind kind)
			throws TypeLibraryException, IOException {
		libraryFile = libraryFile.getAbsoluteFile();
		synchronized (libraries) {
			final LibraryRecord loaded = libraries.get(libraryFile);
			if (loaded != null) {
				return loaded;
			}
		}
		final LibraryRecord record = loadLibrary(libraryFile, kind);
		synchronized (libraries) {
			libraries.put(libraryFile, record);
		}
		return record;
	}

	private LibraryRecord loadLibrary(File libraryFile, TypeLibrary.Kind kind)
			throws TypeLibraryException, IOException {
		boolean hasTypes = false;
		Properties manifest = null;
		final ZipInputStream stream = new ZipInputStream(new FileInputStream(
				libraryFile));
		try {
			ZipEntry zipEntry;
			while ((zipEntry = stream.getNextEntry()) != null) {
				if (TypeLibraryFormat.TYPES_FILE.equals(zipEntry.getName())) {
					hasTypes = true;
				} else if (TypeLibraryFormat.MANIFEST_FILE.equals(zipEntry
						.getName())) {
					manifest = new Properties();
					manifest.load(stream);
				}
			}
		} finally {
			try {
				stream.close();
			} catch (IOException e) {
				JavaScriptPlugin.warning(NLS.bind("Error closing {0}",
						libraryFile));
			}
		}
		if (!hasTypes) {
			throw new TypeLibraryException(NLS.bind(
					"Type library {0} does not contain {1}", libraryFile,
					TypeLibraryFormat.TYPES_FILE));
		}
		if (manifest == null) {
			throw new TypeLibraryException(NLS.bind(
					"Type library {0} does not contain {1}", libraryFile,
					TypeLibraryFormat.MANIFEST_FILE));
		}
		final String name = manifest.getProperty(TypeLibraryFormat.NAME_HEADER);
		if (name == null || name.length() == 0) {
			throw new TypeLibraryException(NLS.bind(
					"Type library {0} manifest does not contain", libraryFile,
					TypeLibraryFormat.NAME_HEADER));
		}
		final String versionString = manifest
				.getProperty(TypeLibraryFormat.VERSION_HEADER);
		if (versionString == null || versionString.length() == 0) {
			throw new TypeLibraryException(NLS.bind(
					"Type library {0} manifest does not contain {1}",
					libraryFile, TypeLibraryFormat.VERSION_HEADER));
		}
		final Version version;
		try {
			version = Version.parseVersion(versionString);
		} catch (IllegalArgumentException e) {
			throw new TypeLibraryException(NLS.bind(
					"Type library {0} manifest contains invalid version {1}",
					libraryFile, versionString), e);
		}
		return new LibraryRecord(libraryFile, kind, name, version);
	}

	/**
	 * Lists all the registered libraries
	 */
	public TypeLibrary[] list() {
		synchronized (libraries) {
			return libraries.values()
					.toArray(new TypeLibrary[libraries.size()]);
		}
	}

	/**
	 * Lists the latest versions of all the libraries.
	 */
	public TypeLibrary[] listLatest() {
		final Map<String, LibraryRecord> matches = new HashMap<String, LibraryRecord>();
		synchronized (libraries) {
			for (LibraryRecord record : libraries.values()) {
				final LibraryRecord match = matches.get(record.name);
				if (match == null
						|| record.version.compareTo(match.version) > 0) {
					matches.put(record.name, record);
				}
			}
		}
		return matches.values().toArray(new TypeLibrary[matches.size()]);
	}

	/**
	 * Lists all the versions of the library with the specified name.
	 */
	public TypeLibrary[] list(String name) {
		final List<TypeLibrary> result = new ArrayList<TypeLibrary>();
		synchronized (libraries) {
			for (LibraryRecord record : libraries.values()) {
				if (name.equals(record.name)) {
					result.add(record);
				}
			}
		}
		return result.toArray(new TypeLibrary[result.size()]);
	}

	/**
	 * Finds the library with the specified name.
	 * 
	 * @return the latest version of the library or <code>null</code>
	 */
	public TypeLibrary find(String name) {
		LibraryRecord match = null;
		synchronized (libraries) {
			for (LibraryRecord record : libraries.values()) {
				if (name.equals(record.name)
						&& (match == null || record.version
								.compareTo(match.version) > 0)) {
					match = record;
				}
			}
		}
		return match;
	}

	/**
	 * Finds the library with specified name and minimum version.
	 * 
	 * @param name
	 *            name of the library
	 * @param minimumVersion
	 *            minimum version, or null in order to find latest version
	 * @return library with version greater then or equal the given version, or
	 *         null, if no such version or library is found.
	 */
	@Nullable
	public TypeLibrary find(String name, Version minVersion) {
		if (minVersion == null) {
			return find(name);
		}
		LibraryRecord match = null;
		synchronized (libraries) {
			for (LibraryRecord record : libraries.values()) {
				if (name.equals(record.name)
						&& record.version.compareTo(minVersion) >= 0
						&& (match == null || record.version
								.compareTo(match.version) > 0)) {
					match = record;
				}
			}
		}
		return match;
	}

	/**
	 * Finds the library with specified name and minimum version.
	 * 
	 * @param name
	 *            name of the library
	 * @param version
	 *            the exact version
	 * @return library with the specified version or <code>null</code>, if no
	 *         such library/version is found.
	 */
	public TypeLibrary findExact(String name, Version version) {
		Assert.isNotNull(name, "Library name must be not null");
		Assert.isNotNull(version, "Library version must be not null");
		synchronized (libraries) {
			for (LibraryRecord record : libraries.values()) {
				if (name.equals(record.name) && version.equals(record.version)) {
					return record;
				}
			}
		}
		return null;
	}

	private static class LibraryRecord implements TypeLibrary {
		final File file;
		final TypeLibrary.Kind kind;
		final String name;
		final Version version;

		LibraryRecord(File file, TypeLibrary.Kind kind, String name,
				Version version) {
			this.file = file;
			this.kind = kind;
			this.name = name;
			this.version = version;
		}

		public String name() {
			return name;
		}

		public Version version() {
			return version;
		}

		public Kind kind() {
			return kind;
		}

		@Override
		public String toString() {
			return "Library(" + file + ")";
		}

		public File getFile() {
			return file;
		}

		public IPath getPath() {
			return new Path(file.getAbsolutePath());
		}
	}

	private final Map<File, LibraryRecord> libraries = new HashMap<File, LibraryRecord>();

	/**
	 * Returns already registered {@link TypeLibrary} for the specified
	 * {@link File} or <code>null</code> if the specified file is not registered
	 * as a library.
	 */
	@Nullable
	public TypeLibrary get(File file) {
		synchronized (libraries) {
			return libraries.get(file);
		}
	}

	private static final String PREF_LIBS = "TypeLibraries";

	static class PreferenceEntry {
		final String path;

		public PreferenceEntry(String path) {
			this.path = path;
		}
	}

	/**
	 * Loads the list of the libraries saved in preferences
	 */
	private Set<File> loadFromPreferences() {
		final IEclipsePreferences preferences = InstanceScope.INSTANCE
				.getNode(JavaScriptPlugin.PLUGIN_ID);
		if (preferences != null) {
			final String libs = preferences.get(PREF_LIBS, null);
			if (libs != null) {
				final List<PreferenceEntry> entries;
				try {
					entries = new Gson().fromJson(libs,
							new TypeToken<List<PreferenceEntry>>() {
							}.getType());
				} catch (JsonParseException e) {
					JavaScriptPlugin.error(
							"Error loading type libary preferences", e);
					return Collections.emptySet();
				}
				final Set<File> files = new HashSet<File>();
				for (PreferenceEntry entry : entries) {
					files.add(new File(entry.path));
				}
				return files;
			}
		}
		return Collections.emptySet();
	}

	/**
	 * Stores path to given libraries in preferences and registers the libraries
	 * to the library manager. The {@link LibraryKind#USER} library files are
	 * not touched by this operation. Note that libraries previously contained
	 * in the preferences but not contained in the given library collection are
	 * removed from the preferences.
	 * 
	 * @see #addToPreferences(Iterable)
	 */
	public void saveToPreferences(Collection<TypeLibrary> libraries)
			throws TypeLibraryException, IOException {
		final Set<File> files = new HashSet<File>();
		for (TypeLibrary library : libraries) {
			if (library.kind() == TypeLibrary.Kind.USER) {
				files.add(library.getFile());
			}
		}
		saveToPreferences(files);
	}

	/**
	 * Saves specified set of library files to preferences.
	 */
	private void saveToPreferences(Set<File> files)
			throws TypeLibraryException, IOException {
		final List<LibraryRecord> removing = new ArrayList<LibraryRecord>();
		final List<File> adding = new ArrayList<File>();
		synchronized (libraries) {
			for (LibraryRecord record : libraries.values()) {
				if (record.kind != TypeLibrary.Kind.BUILTIN
						&& !files.contains(record.file)) {
					removing.add(record);
				}
			}
			for (File file : files) {
				if (!libraries.containsKey(file)) {
					adding.add(file);
				}
			}
		}
		final Set<String> changedLibraries = new HashSet<String>();
		for (File file : adding) {
			final TypeLibrary library = registerLibrary(file,
					TypeLibrary.Kind.USER);
			changedLibraries.add(library.name());
		}
		synchronized (libraries) {
			libraries.values().removeAll(removing);
		}
		if (!removing.isEmpty()) {
			for (LibraryRecord record : removing) {
				changedLibraries.add(record.name);
			}
		}
		final IEclipsePreferences preferences = InstanceScope.INSTANCE
				.getNode(JavaScriptPlugin.PLUGIN_ID);
		if (preferences != null) {
			if (!files.isEmpty()) {
				final List<PreferenceEntry> entries = new ArrayList<PreferenceEntry>();
				for (File file : files) {
					entries.add(new PreferenceEntry(file.getPath()));
				}
				preferences.put(PREF_LIBS, new Gson().toJson(entries));
			} else {
				preferences.remove(PREF_LIBS);
			}
			try {
				preferences.flush();
			} catch (BackingStoreException e) {
				JavaScriptPlugin.error("Error saving type libary preferences",
						e);
			}
		}
		if (!changedLibraries.isEmpty()) {
			final List<IScriptProject> projects = findAffectedProjects(changedLibraries);
			if (!projects.isEmpty()) {
				new UpdateContainersJob(changedLibraries, projects).schedule();
			}
		}
	}

	private static class UpdateContainersJob extends Job {

		private final List<IScriptProject> projects;
		private final Set<String> libraryNames;
		private final Map<IPath, List<IScriptProject>> entry2project = new HashMap<IPath, List<IScriptProject>>();

		UpdateContainersJob(Set<String> libraryNames,
				List<IScriptProject> projects) {
			super("Updating library references");
			this.projects = projects;
			this.libraryNames = libraryNames;
			setRule(getWorkspaceRoot());
		}

		@Override
		protected IStatus run(IProgressMonitor monitor) {
			try {
				updateProjects(SubMonitor.convert(monitor, projects.size() * 3));
			} catch (ModelException e) {
				JavaScriptPlugin.error("Error updating library references", e);
			} finally {
				if (monitor != null) {
					monitor.done();
				}
			}
			return Status.OK_STATUS;
		}

		private void updateProjects(SubMonitor monitor) throws ModelException {
			for (IScriptProject project : projects) {
				if (project.exists()) {
					final IBuildpathEntry[] buildpath = project
							.getRawBuildpath();
					for (IBuildpathEntry entry : buildpath) {
						final IPath path = entry.getPath();
						if (path.segmentCount() >= 2
								&& TypeLibraryContainer.ID.equals(path
										.segment(0))
								&& libraryNames.contains(path.segment(1))) {
							List<IScriptProject> libProjects = entry2project
									.get(path);
							if (libProjects == null) {
								libProjects = new ArrayList<IScriptProject>();
								entry2project.put(path, libProjects);
							}
							if (!libProjects.contains(project)) {
								libProjects.add(project);
							}
						}
					}
				}
			}
			for (Map.Entry<IPath, List<IScriptProject>> entry : entry2project
					.entrySet()) {
				final IBuildpathContainer[] containers = new IBuildpathContainer[entry
						.getValue().size()];
				for (int i = 0; i < entry.getValue().size(); ++i) {
					containers[i] = new TypeLibraryContainer(entry.getKey());
				}
				DLTKCore.setBuildpathContainer(entry.getKey(), entry.getValue()
						.toArray(new IScriptProject[entry.getValue().size()]),
						containers, monitor);
			}
		}
	}

	/**
	 * @param changedLibraries
	 * @return
	 * @throws ModelException
	 */
	private List<IScriptProject> findAffectedProjects(
			Set<String> changedLibraries) {
		final IScriptProject[] jsProjects;
		try {
			jsProjects = DLTKCore.create(getWorkspaceRoot()).getScriptProjects(
					JavaScriptNature.NATURE_ID);
		} catch (ModelException e) {
			return Collections.emptyList();
		}
		final List<IScriptProject> result = new ArrayList<IScriptProject>();
		for (IScriptProject project : jsProjects) {
			if (project.exists()) {
				final IBuildpathEntry[] buildpath;
				try {
					buildpath = project.getRawBuildpath();
				} catch (ModelException e) {
					continue;
				}
				for (IBuildpathEntry entry : buildpath) {
					final IPath path = entry.getPath();
					if (path.segmentCount() >= 2
							&& TypeLibraryContainer.ID.equals(path.segment(0))
							&& changedLibraries.contains(path.segment(1))) {
						result.add(project);
						break;
					}
				}
			}
		}
		return result;
	}

	private static IWorkspaceRoot getWorkspaceRoot() {
		return ResourcesPlugin.getWorkspace().getRoot();
	}

	/**
	 * Opens the specified library file without adding to the list of available
	 * libraries.
	 */
	public TypeLibrary openLibrary(File file) throws TypeLibraryException,
			IOException {
		file = file.getAbsoluteFile();
		final LibraryRecord record;
		synchronized (libraries) {
			record = libraries.get(file);
		}
		if (record != null) {
			return record;
		}
		return loadLibrary(file, TypeLibrary.Kind.USER);
	}

	/**
	 * @param f
	 * @param typesFile
	 * @return
	 * @throws IOException
	 */
	public InputStream openEntry(File libraryFile, String entry)
			throws IOException {
		final ZipInputStream stream = new ZipInputStream(new FileInputStream(
				libraryFile));
		boolean success = false;
		try {
			ZipEntry zipEntry;
			while ((zipEntry = stream.getNextEntry()) != null) {
				if (entry.equals(zipEntry.getName())) {
					success = true;
					return stream;
				}
			}
		} finally {
			if (!success) {
				try {
					stream.close();
				} catch (IOException e) {
					JavaScriptPlugin.warning(NLS.bind("Error closing {0}",
							libraryFile));
				}
			}
		}
		throw new FileNotFoundException(libraryFile + "#" + entry);
	}
}
