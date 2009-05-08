/*******************************************************************************
 * Copyright (c) 2009 xored software, Inc.  
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html  
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Vladimir Belov)
 *******************************************************************************/

package org.eclipse.dltk.javascript.internal.parser.tests;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.dltk.javascript.formatter.JavaScriptFormatterConstants;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.util.IPropertyChangeListener;

public class PreferenceStoreEmulator implements IPreferenceStore {

	private Map values = new HashMap();

	public PreferenceStoreEmulator() {

		String[] options = JavaScriptFormatterConstants.getNames();
		for (int i = 0; i < options.length; i++) {
			String name = options[i];
			values
					.put(name, JavaScriptFormatterConstants
							.getDefaultValue(name));
		}
	}

	public void addPropertyChangeListener(IPropertyChangeListener listener) {
	}

	public boolean contains(String name) {
		return this.values.containsKey(name);
	}

	public void firePropertyChangeEvent(String name, Object oldValue,
			Object newValue) {
	}

	public boolean getBoolean(String name) {
		return ((Boolean) this.values.get(name)).booleanValue();
	}

	public boolean getDefaultBoolean(String name) {
		return ((Boolean) this.values.get(name)).booleanValue();
	}

	public double getDefaultDouble(String name) {
		return ((Double) this.values.get(name)).doubleValue();
	}

	public float getDefaultFloat(String name) {
		return ((Float) this.values.get(name)).floatValue();
	}

	public int getDefaultInt(String name) {
		return ((Integer) this.values.get(name)).intValue();
	}

	public long getDefaultLong(String name) {
		return ((Long) this.values.get(name)).longValue();
	}

	public String getDefaultString(String name) {
		return this.values.get(name).toString();
	}

	public double getDouble(String name) {
		return ((Double) this.values.get(name)).doubleValue();
	}

	public float getFloat(String name) {
		return ((Float) this.values.get(name)).floatValue();
	}

	public int getInt(String name) {
		return ((Integer) this.values.get(name)).intValue();
	}

	public long getLong(String name) {
		return ((Long) this.values.get(name)).longValue();
	}

	public String getString(String name) {
		return this.values.get(name).toString();
	}

	public boolean isDefault(String name) {
		return false;
	}

	public boolean needsSaving() {
		return true;
	}

	public void putValue(String name, String value) {
		this.values.put(name, value);

	}

	public void removePropertyChangeListener(IPropertyChangeListener listener) {
	}

	public void setDefault(String name, double value) {
	}

	public void setDefault(String name, float value) {
	}

	public void setDefault(String name, int value) {
	}

	public void setDefault(String name, long value) {
	}

	public void setDefault(String name, String defaultObject) {
	}

	public void setDefault(String name, boolean value) {
	}

	public void setToDefault(String name) {
	}

	public void setValue(String name, double value) {
	}

	public void setValue(String name, float value) {
	}

	public void setValue(String name, int value) {
	}

	public void setValue(String name, long value) {
	}

	public void setValue(String name, String value) {
	}

	public void setValue(String name, boolean value) {
	}

}
