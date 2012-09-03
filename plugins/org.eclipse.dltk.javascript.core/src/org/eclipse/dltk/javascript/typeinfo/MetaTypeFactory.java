/*******************************************************************************
 * Copyright (c) 2012 NumberFour AG
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     NumberFour AG - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.typeinfo;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IExecutableExtension;
import org.eclipse.core.runtime.IExecutableExtensionFactory;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.dltk.javascript.core.JavaScriptPlugin;
import org.osgi.framework.Bundle;

/**
 * Helper class for contributing {@link MetaType} implementations from enums.
 */
public class MetaTypeFactory implements IExecutableExtensionFactory,
		IExecutableExtension {

	private IConfigurationElement config;
	private String className;

	public void setInitializationData(IConfigurationElement config,
			String propertyName, Object data) throws CoreException {
		if (data instanceof String)
			className = (String) data;
		else
			throw new CoreException(new Status(IStatus.ERROR,
					JavaScriptPlugin.PLUGIN_ID, 0,
					"Data argument must be a String for " + getClass(), null));
		this.config = config;
	}

	public Object create() throws CoreException {
		if (className == null) {
			throw new CoreException(new Status(IStatus.ERROR,
					JavaScriptPlugin.PLUGIN_ID, 0,
					"Class name not specified for " + getClass(), null));
		}
		final int dot = className.lastIndexOf('.');
		if (dot == -1) {
			throw new CoreException(new Status(IStatus.ERROR,
					JavaScriptPlugin.PLUGIN_ID, 0, "Illegal class name "
							+ className + " for " + getClass(), null));
		}
		final String bundleName = config.getContributor().getName();
		final Bundle bundle = Platform.getBundle(bundleName);
		if (bundle == null) {
			throw new CoreException(new Status(IStatus.ERROR,
					JavaScriptPlugin.PLUGIN_ID, 0, "Bundle " + bundleName
							+ " not found for " + getClass(), null));
		}
		try {
			final Class<?> clazz = bundle
					.loadClass(className.substring(0, dot));
			if (!clazz.isEnum()) {
				throw new CoreException(new Status(IStatus.ERROR,
						JavaScriptPlugin.PLUGIN_ID, 0, "Class "
								+ clazz.getName() + " must be enum for "
								+ getClass(), null));
			}
			final String name = className.substring(dot + 1);
			final Enum<?>[] entries = (Enum<?>[]) clazz.getEnumConstants();
			for (Enum<?> entry : entries) {
				if (name.equals(entry.name())) {
					return entry;
				}
			}
			throw new CoreException(new Status(IStatus.ERROR,
					JavaScriptPlugin.PLUGIN_ID, 0, "No enum const " + className
							+ " for " + getClass(), null));
		} catch (ClassNotFoundException e) {
			// fall-through and try the whole string
		}
		try {
			final Class<?> clazz = bundle.loadClass(className);
			if (!clazz.isEnum()) {
				throw new CoreException(new Status(IStatus.ERROR,
						JavaScriptPlugin.PLUGIN_ID, 0, "Class "
								+ clazz.getName() + " must be enum for "
								+ getClass(), null));
			}
			final Object[] entries = clazz.getEnumConstants();
			if (entries.length != 1) {
				throw new CoreException(new Status(IStatus.ERROR,
						JavaScriptPlugin.PLUGIN_ID, 0,
						"Single enum const expected in " + clazz.getName()
								+ " for " + getClass(), null));
			}
			return entries[0];
		} catch (ClassNotFoundException e) {
			throw new CoreException(new Status(IStatus.ERROR,
					JavaScriptPlugin.PLUGIN_ID, 0, "Class " + className
							+ " not found for " + getClass(), e));
		}
	}
}
