/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.javascript.internal.ui.preferences;

import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.dltk.internal.ui.editor.ScriptSourceViewer;
import org.eclipse.dltk.javascript.internal.ui.editor.JavaScriptDocumentSetupParticipant;
import org.eclipse.dltk.javascript.internal.ui.text.JavascriptCodeScanner;
import org.eclipse.dltk.javascript.internal.ui.text.SimpleJavascriptSourceViewerConfiguration;
import org.eclipse.dltk.javascript.ui.JavascriptPreferenceConstants;
import org.eclipse.dltk.javascript.ui.scriptcolor.provider.IScriptColorPreferenceProvider;
import org.eclipse.dltk.javascript.ui.scriptcolor.provider.IScriptColorProvider;
import org.eclipse.dltk.javascript.ui.text.IJavaScriptPartitions;
import org.eclipse.dltk.ui.preferences.AbstractScriptEditorColoringConfigurationBlock;
import org.eclipse.dltk.ui.preferences.IPreferenceConfigurationBlock;
import org.eclipse.dltk.ui.preferences.OverlayPreferenceStore;
import org.eclipse.dltk.ui.preferences.PreferencesMessages;
import org.eclipse.dltk.ui.text.IColorManager;
import org.eclipse.dltk.ui.text.ScriptSourceViewerConfiguration;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.source.IOverviewRuler;
import org.eclipse.jface.text.source.IVerticalRuler;
import org.eclipse.jface.text.source.projection.ProjectionViewer;
import org.eclipse.jface.util.IPropertyChangeListener;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.ui.texteditor.ITextEditor;

public class JavascriptEditorColoringConfigurationBlock extends
		AbstractScriptEditorColoringConfigurationBlock implements
		IPreferenceConfigurationBlock {

	private static IScriptColorPreferenceProvider customColorProvider[];

	static {
		ArrayList providersList = new ArrayList();
		IScriptColorProvider[] scriptColorProviders = JavascriptCodeScanner
				.getScriptColorProviders();
		for (int i = 0; i < scriptColorProviders.length; i++) {
			if (scriptColorProviders[i] instanceof IScriptColorPreferenceProvider) {

				IScriptColorProvider colorProvider = (IScriptColorProvider) scriptColorProviders[i];
				providersList.add(colorProvider);
			}
		}

		customColorProvider = (IScriptColorPreferenceProvider[]) providersList
				.toArray(new IScriptColorPreferenceProvider[providersList
						.size()]);
	}

	private static final String PREVIEW_FILE_NAME = "PreviewFile.txt";

	private static final String[][] fSyntaxColorListModel = new String[][] {
			{
					PreferencesMessages.DLTKEditorPreferencePage_singleLineComment,
					JavascriptPreferenceConstants.EDITOR_SINGLE_LINE_COMMENT_COLOR,
					sCommentsCategory },
			{ PreferencesMessages.DLTKEditorPreferencePage_CommentTaskTags,
					JavascriptPreferenceConstants.COMMENT_TASK_TAGS,
					sCommentsCategory },
			{ "JS Doc", JavascriptPreferenceConstants.JAVASCRIPT_DOC_COLOR,
					sCommentsCategory },
			{ PreferencesMessages.DLTKEditorPreferencePage_keywords,
					JavascriptPreferenceConstants.EDITOR_KEYWORD_COLOR,
					sCoreCategory },

			{ PreferencesMessages.DLTKEditorPreferencePage_strings,
					JavascriptPreferenceConstants.EDITOR_STRING_COLOR,
					sCoreCategory },

			{ PreferencesMessages.DLTKEditorPreferencePage_numbers,
					JavascriptPreferenceConstants.EDITOR_NUMBER_COLOR,
					sCoreCategory },

			{
					PreferencesMessages.DLTKEditorPreferencePage_function_colors,
					JavascriptPreferenceConstants.EDITOR_FUNCTION_DEFINITION_COLOR,
					sCoreCategory },

			{ "XML Tag Name",
					JavascriptPreferenceConstants.EDITOR_XML_TAG_NAME_COLOR,
					"XML" },
			{ "XML Attribute Name",
					JavascriptPreferenceConstants.EDITOR_XML_ATTR_NAME_COLOR,
					"XML" },
			{ "XML Comment",
					JavascriptPreferenceConstants.EDITOR_XML_COMMENT_COLOR,
					"XML" },
	// { "XML Area Background
	// color",JavascriptPreferenceConstants.EDITOR_XML_BODY_ALL
	// , "XML"},
	};

	public JavascriptEditorColoringConfigurationBlock(
			OverlayPreferenceStore store) {
		super(new MultiplyOverlayPreferenceStore(store, customColorProvider));

	}

	protected String[] getCategories() {
		List allCategories = new ArrayList();

		allCategories.add(sCoreCategory);
		allCategories.add(sDocumentationCategory);
		allCategories.add(sCommentsCategory);
		allCategories.add("XML");

		for (int i = 0; i < customColorProvider.length; i++) {
			String[] categories = customColorProvider[i].getCategories();
			for (int j = 0; j < categories.length; j++) {
				allCategories.add(categories[j]);
			}
		}

		return (String[]) allCategories
				.toArray(new String[allCategories.size()]);
	}

	/**
	 * Overwrites the other method;
	 */
	public void performOk() {
		super.performOk();
		getPreferenceStore().propagate();
		for (int i = 0; i < customColorProvider.length; i++) {
			customColorProvider[i].save();
		}
	}

	/**
	 * @see org.eclipse.dltk.ui.preferences.AbstractScriptEditorColoringConfigurationBlock#performDefaults()
	 */
	public void performDefaults() {
		getPreferenceStore().loadDefaults();
		super.performDefaults();

	}

	protected String[][] getSyntaxColorListModel() {
		if (customColorProvider.length > 0) {

			ArrayList list = new ArrayList();

			for (int i = 0; i < fSyntaxColorListModel.length; i++) {
				list.add(fSyntaxColorListModel[i]);
			}

			for (int k = 0; k < customColorProvider.length; k++) {
				String[][] providerList = customColorProvider[k]
						.getSyntaxColorListModel();
				for (int i = 0; i < providerList.length; i++) {
					list.add(providerList[i]);
				}
			}

			String[][] allColors = new String[list.size()][];
			return (String[][]) list.toArray(allColors);

		}
		return fSyntaxColorListModel;
	}

	protected ProjectionViewer createPreviewViewer(Composite parent,
			IVerticalRuler verticalRuler, IOverviewRuler overviewRuler,
			boolean showAnnotationsOverview, int styles, IPreferenceStore store) {
		return new ScriptSourceViewer(parent, verticalRuler, overviewRuler,
				showAnnotationsOverview, styles, store);
	}

	protected ScriptSourceViewerConfiguration createSimpleSourceViewerConfiguration(
			IColorManager colorManager, IPreferenceStore preferenceStore,
			ITextEditor editor, boolean configureFormatter) {
		return new SimpleJavascriptSourceViewerConfiguration(colorManager,
				preferenceStore, editor, IJavaScriptPartitions.JS_PARTITIONING,
				configureFormatter);
	}

	protected void setDocumentPartitioning(IDocument document) {
		JavaScriptDocumentSetupParticipant participant = new JavaScriptDocumentSetupParticipant();
		participant.setup(document);
	}

	protected InputStream getPreviewContentReader() {
		return getClass().getResourceAsStream(PREVIEW_FILE_NAME);
	}

	private static class MultiplyOverlayPreferenceStore extends
			OverlayPreferenceStore {

		private final OverlayPreferenceStore defaultStore;
		private final Map customStores;

		/**
		 * @param parent
		 * @param overlayKeys
		 */
		public MultiplyOverlayPreferenceStore(OverlayPreferenceStore store,
				IScriptColorPreferenceProvider[] providers) {
			super(null, null);
			this.defaultStore = store;

			customStores = new HashMap();

			for (int i = 0; i < providers.length; i++) {
				customStores.put(providers[i].getPreferenceKeyPrefix(),
						new OverlayPreferenceStore(providers[i]
								.getPreferenceStore(), new OverlayKey[0]));
			}

		}

		public void addKeys(OverlayKey[] keys) {
			Map map = new HashMap();
			map.put(null, new ArrayList());
			String[] prefixes = (String[]) customStores.keySet().toArray(
					new String[customStores.size()]);
			for (int j = 0; j < prefixes.length; j++) {
				map.put(prefixes[j], new ArrayList());
			}
			outer: for (int i = 0; i < keys.length; i++) {

				OverlayKey key = keys[i];
				for (int j = 0; j < prefixes.length; j++) {
					if (key.getKey().startsWith(prefixes[j])) {
						((List) map.get(prefixes[j])).add(key);
						continue outer;
					}
				}
				((List) map.get(null)).add(key);
			}
			defaultStore.addKeys((OverlayKey[]) ((List) map.get(null))
					.toArray(new OverlayKey[0]));
			for (int j = 0; j < prefixes.length; j++) {
				OverlayPreferenceStore store = (OverlayPreferenceStore) customStores
						.get(prefixes[j]);
				store.addKeys((OverlayKey[]) ((List) map.get(prefixes[j]))
						.toArray(new OverlayKey[0]));
				store.load();
				store.start();

			}
		}

		public void addPropertyChangeListener(IPropertyChangeListener listener) {
			defaultStore.addPropertyChangeListener(listener);
			Iterator it = customStores.values().iterator();
			while (it.hasNext()) {
				((OverlayPreferenceStore) it.next())
						.addPropertyChangeListener(listener);
			}
		}

		public boolean contains(String name) {
			IPreferenceStore store = getStore(name);
			return store.contains(name);
		}

		public void firePropertyChangeEvent(String name, Object oldValue,
				Object newValue) {
			defaultStore.firePropertyChangeEvent(name, oldValue, newValue);
			Iterator it = customStores.values().iterator();
			while (it.hasNext()) {
				((OverlayPreferenceStore) it.next()).firePropertyChangeEvent(
						name, oldValue, newValue);
			}

		}

		public boolean getBoolean(String name) {
			IPreferenceStore store = getStore(name);
			return store.getBoolean(name);
		}

		/**
		 * @param name
		 * @return
		 */
		private IPreferenceStore getStore(String name) {
			Iterator it = customStores.entrySet().iterator();
			while (it.hasNext()) {
				Map.Entry entry = (Entry) it.next();
				if (name.startsWith((String) entry.getKey())) {
					return (IPreferenceStore) entry.getValue();
				}
			}
			return defaultStore;
		}

		public boolean getDefaultBoolean(String name) {
			IPreferenceStore store = getStore(name);
			return store.getDefaultBoolean(name);
		}

		public double getDefaultDouble(String name) {
			IPreferenceStore store = getStore(name);
			return store.getDefaultDouble(name);
		}

		public float getDefaultFloat(String name) {
			IPreferenceStore store = getStore(name);
			return store.getDefaultFloat(name);
		}

		public int getDefaultInt(String name) {
			IPreferenceStore store = getStore(name);
			return store.getDefaultInt(name);
		}

		public long getDefaultLong(String name) {
			IPreferenceStore store = getStore(name);
			return store.getDefaultLong(name);
		}

		public String getDefaultString(String name) {
			IPreferenceStore store = getStore(name);
			return store.getDefaultString(name);
		}

		public double getDouble(String name) {
			IPreferenceStore store = getStore(name);
			return store.getDouble(name);
		}

		public float getFloat(String name) {
			IPreferenceStore store = getStore(name);
			return store.getFloat(name);
		}

		public int getInt(String name) {
			IPreferenceStore store = getStore(name);
			return store.getInt(name);
		}

		public long getLong(String name) {
			IPreferenceStore store = getStore(name);
			return store.getLong(name);
		}

		public String getString(String name) {
			IPreferenceStore store = getStore(name);
			return store.getString(name);
		}

		public boolean isDefault(String name) {
			IPreferenceStore store = getStore(name);
			return store.isDefault(name);
		}

		public void load() {
			defaultStore.load();
			Iterator it = customStores.values().iterator();
			while (it.hasNext()) {
				((OverlayPreferenceStore) it.next()).load();
			}
		}

		public void loadDefaults() {
			defaultStore.loadDefaults();
			Iterator it = customStores.values().iterator();
			while (it.hasNext()) {
				OverlayPreferenceStore overlayPreferenceStore = (OverlayPreferenceStore) it
						.next();
				overlayPreferenceStore.loadDefaults();
			}
		}

		public boolean needsSaving() {
			boolean b = defaultStore.needsSaving();
			if (!b) {
				Iterator it = customStores.values().iterator();
				while (it.hasNext()) {
					b = ((OverlayPreferenceStore) it.next()).needsSaving();
					if (b)
						return b;
				}
			}
			return b;
		}

		public void propagate() {
			defaultStore.propagate();
			Iterator it = customStores.values().iterator();
			while (it.hasNext()) {
				((OverlayPreferenceStore) it.next()).propagate();
			}
		}

		public void putValue(String name, String value) {
			IPreferenceStore store = getStore(name);
			store.putValue(name, value);
		}

		public void removePropertyChangeListener(
				IPropertyChangeListener listener) {
			defaultStore.removePropertyChangeListener(listener);
			Iterator it = customStores.values().iterator();
			while (it.hasNext()) {
				((OverlayPreferenceStore) it.next())
						.removePropertyChangeListener(listener);
			}
		}

		public void setDefault(String name, boolean value) {
			IPreferenceStore store = getStore(name);
			store.setDefault(name, value);
		}

		public void setDefault(String name, double value) {
			IPreferenceStore store = getStore(name);
			store.setDefault(name, value);
		}

		public void setDefault(String name, float value) {
			IPreferenceStore store = getStore(name);
			store.setDefault(name, value);
		}

		public void setDefault(String name, int value) {
			IPreferenceStore store = getStore(name);
			store.setDefault(name, value);
		}

		public void setDefault(String name, long value) {
			IPreferenceStore store = getStore(name);
			store.setDefault(name, value);
		}

		public void setDefault(String name, String value) {
			IPreferenceStore store = getStore(name);
			store.setDefault(name, value);
		}

		public void setToDefault(String name) {
			IPreferenceStore store = getStore(name);
			store.setToDefault(name);
		}

		public void setValue(String name, boolean value) {
			IPreferenceStore store = getStore(name);
			store.setValue(name, value);
		}

		public void setValue(String name, double value) {
			IPreferenceStore store = getStore(name);
			store.setValue(name, value);
		}

		public void setValue(String name, float value) {
			IPreferenceStore store = getStore(name);
			store.setValue(name, value);
		}

		public void setValue(String name, int value) {
			IPreferenceStore store = getStore(name);
			store.setValue(name, value);
		}

		public void setValue(String name, long value) {
			IPreferenceStore store = getStore(name);
			store.setValue(name, value);
		}

		public void setValue(String name, String value) {
			IPreferenceStore store = getStore(name);
			store.setValue(name, value);
		}

		public void start() {
			defaultStore.start();
			Iterator it = customStores.values().iterator();
			while (it.hasNext()) {
				((OverlayPreferenceStore) it.next()).start();
			}

		}

		public void stop() {
			defaultStore.stop();
			Iterator it = customStores.values().iterator();
			while (it.hasNext()) {
				((OverlayPreferenceStore) it.next()).stop();
			}

		}

		public String toString() {
			return defaultStore.toString();
		}
	}
}
