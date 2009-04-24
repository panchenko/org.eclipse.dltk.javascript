package org.eclipse.dltk.javascript.formatter.preferences;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.dltk.javascript.formatter.JavaScriptFormatterConstants;
import org.eclipse.dltk.ui.CodeFormatterConstants;
import org.eclipse.dltk.ui.PreferenceConstants;
import org.eclipse.dltk.ui.text.util.AutoEditUtils;
import org.eclipse.dltk.ui.text.util.ITabPreferencesProvider;
import org.eclipse.dltk.ui.text.util.TabStyle;
import org.eclipse.jface.preference.IPreferenceStore;

public class JavaScriptFormatterPreferenceInterpreter implements
		ITabPreferencesProvider {

	private final IPreferenceStore store;
	private final Map options;

	public JavaScriptFormatterPreferenceInterpreter(IPreferenceStore store) {
		this.store = store;
		this.options = null;
	}

	public JavaScriptFormatterPreferenceInterpreter(Map options) {
		this.store = null;
		this.options = options;
	}

	private int getInt(String name, int defaultValue) {
		if (null != store)
			return store.getInt(name);

		try {

			if (!options.containsKey(name))
				return defaultValue;

			return Integer.parseInt(options.get(name).toString());

		} catch (NumberFormatException e) {
			return defaultValue;
		}
	}

	private boolean getBoolean(String name, boolean defaultValue) {
		if (null != store)
			return store.getBoolean(name);

		if (!options.containsKey(name))
			return defaultValue;

		return Boolean.valueOf(options.get(name).toString()).booleanValue();
	}

	private String getString(String name, String defaultValue) {
		if (null != store)
			return store.getString(name);

		if (!options.containsKey(name))
			return defaultValue;

		return options.get(name).toString();
	}

	public TabStyle getTabStyle() {
		return TabStyle.forName(getString(
				CodeFormatterConstants.FORMATTER_TAB_CHAR, null), TabStyle.TAB);
	}

	public int getIndentSize() {
		return getInt(CodeFormatterConstants.FORMATTER_INDENTATION_SIZE, 4);
	}

	public int getTabSize() {
		return getInt(CodeFormatterConstants.FORMATTER_TAB_SIZE, 4);
	}

	public String getIndent() {
		if (getTabStyle() == TabStyle.SPACES) {
			return AutoEditUtils.getNSpaces(getIndentSize());
		} else
			return "\t";
	}

	public String getIndent(int count) {
		String indent = getIndent();
		StringBuffer result = new StringBuffer(indent.length() * count);
		for (int i = 0; i < count; i++)
			result.append(indent);
		return result.toString();
	}

	public String getIndentByVirtualSize(int size) {
		if (getTabStyle() == TabStyle.SPACES) {
			return AutoEditUtils.getNSpaces(size);
		} else {
			int tabs = size / getTabSize();
			int leftover = size - tabs * getTabSize();
			return AutoEditUtils.getNChars(tabs, '\t')
					+ AutoEditUtils.getNSpaces(leftover);
		}
	}

	public boolean isSmartTab() {
		return getBoolean(PreferenceConstants.EDITOR_SMART_TAB, false);
	}

	public boolean isSmartMode() {
		return getBoolean(PreferenceConstants.EDITOR_SMART_INDENT, false);
	}

	public boolean closeBrackets() {
		return getBoolean(PreferenceConstants.EDITOR_CLOSE_BRACKETS, false);
	}

	public boolean isSmartPaste() {
		return getBoolean(PreferenceConstants.EDITOR_SMART_PASTE, false);
	}

	public boolean closeStrings() {
		return getBoolean(PreferenceConstants.EDITOR_CLOSE_STRINGS, false);
	}

	public boolean getTabAlwaysIndents() {
		return true;
	}

	public boolean getIndentFunction() {
		return getBoolean(JavaScriptFormatterConstants.INDENT_METHOD, true);
	}

	public boolean getIndentBlock() {
		return getBoolean(JavaScriptFormatterConstants.INDENT_BLOCK, true);
	}

	public boolean getIndentSwitch() {
		return getBoolean(JavaScriptFormatterConstants.INDENT_SWITCH, true);
	}

	public boolean getIndentCase() {
		return getBoolean(JavaScriptFormatterConstants.INDENT_CASE, true);
	}

	public boolean getIndentBreak() {
		return getBoolean(JavaScriptFormatterConstants.INDENT_BREAK, true);
	}

	public boolean getIndentEmptyLine() {
		return getBoolean(JavaScriptFormatterConstants.INDENT_EMPTY_LINES, true);
	}

	public String getBraceFunction() {
		return getString(JavaScriptFormatterConstants.BRACE_METHOD,
				JavaScriptFormatterConstants.BRACE_SAME_LINE);
	}

	public String getBraceBlock() {
		return getString(JavaScriptFormatterConstants.BRACE_BLOCK,
				JavaScriptFormatterConstants.BRACE_SAME_LINE);
	}

	public String getBraceCase() {
		return getString(JavaScriptFormatterConstants.BRACE_CASE,
				JavaScriptFormatterConstants.BRACE_SAME_LINE);
	}

	public String getBraceSwitch() {
		return getString(JavaScriptFormatterConstants.BRACE_SWITCH,
				JavaScriptFormatterConstants.BRACE_SAME_LINE);
	}

	public String getBraceArrayInitializer() {
		return getString(JavaScriptFormatterConstants.BRACE_ARRAY,
				JavaScriptFormatterConstants.BRACE_SAME_LINE);
	}

	public boolean getBraceEmptyArray() {
		return getBoolean(JavaScriptFormatterConstants.BRACE_EMPTY_ARRAY, true);
	}

	public boolean getNewLineInEmptyMethod() {
		return getBoolean(
				JavaScriptFormatterConstants.NEW_LINE_IN_EMPTY_METHOD, true);
	}

	public boolean getNewLineInEmptyBlock() {
		return getBoolean(JavaScriptFormatterConstants.NEW_LINE_IN_EMPTY_BLOCK,
				true);
	}

	public boolean getNewLineAtEOF() {
		return getBoolean(JavaScriptFormatterConstants.NEW_LINE_AT_EOF, true);
	}

	private void putInt(Map map, String name, int defaultValue) {
		map.put(name, new Integer(getInt(name, defaultValue)));
	}

	private void putBoolean(Map map, String name, boolean defaultValue) {
		map.put(name, new Boolean(getBoolean(name, defaultValue)));
	}

	private void putString(Map map, String name, String defaultValue) {
		map.put(name, getString(name, defaultValue));
	}

	public Map getOptions() {
		HashMap values = new HashMap();

		// Indentation
		putInt(values, JavaScriptFormatterConstants.FORMATTER_INDENTATION_SIZE,
				4);
		putString(values, JavaScriptFormatterConstants.FORMATTER_TAB_CHAR,
				String.valueOf('\t'));
		putInt(values, JavaScriptFormatterConstants.FORMATTER_TAB_SIZE, 4);

		putBoolean(values, JavaScriptFormatterConstants.INDENT_METHOD, true);
		putBoolean(values, JavaScriptFormatterConstants.INDENT_BLOCK, true);
		putBoolean(values, JavaScriptFormatterConstants.INDENT_SWITCH, true);
		putBoolean(values, JavaScriptFormatterConstants.INDENT_CASE, true);
		putBoolean(values, JavaScriptFormatterConstants.INDENT_BREAK, true);

		// does not present in UI!
		putBoolean(values, JavaScriptFormatterConstants.INDENT_EMPTY_LINES,
				true);

		// Braces
		putString(values, JavaScriptFormatterConstants.BRACE_METHOD,
				JavaScriptFormatterConstants.BRACE_NEXT_LINE);
		putString(values, JavaScriptFormatterConstants.BRACE_BLOCK,
				JavaScriptFormatterConstants.BRACE_NEXT_LINE);
		putString(values, JavaScriptFormatterConstants.BRACE_CASE,
				JavaScriptFormatterConstants.BRACE_NEXT_LINE);
		putString(values, JavaScriptFormatterConstants.BRACE_SWITCH,
				JavaScriptFormatterConstants.BRACE_NEXT_LINE);
		putString(values, JavaScriptFormatterConstants.BRACE_ARRAY,
				JavaScriptFormatterConstants.BRACE_NEXT_LINE);
		putString(values, JavaScriptFormatterConstants.BRACE_EMPTY_ARRAY,
				JavaScriptFormatterConstants.BRACE_NEXT_LINE);

		return values;
	}

}
