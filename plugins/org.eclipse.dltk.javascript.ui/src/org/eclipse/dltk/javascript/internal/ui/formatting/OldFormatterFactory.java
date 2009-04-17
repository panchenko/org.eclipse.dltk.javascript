package org.eclipse.dltk.javascript.internal.ui.formatting;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.dltk.core.IPreferencesLookupDelegate;
import org.eclipse.dltk.ui.formatter.AbstractScriptFormatterFactory;
import org.eclipse.dltk.ui.formatter.FormatterException;
import org.eclipse.dltk.ui.formatter.IFormatterModifyDialog;
import org.eclipse.dltk.ui.formatter.IFormatterModifyDialogOwner;
import org.eclipse.dltk.ui.formatter.IScriptFormatter;
import org.eclipse.dltk.ui.preferences.PreferenceKey;
import org.eclipse.jface.text.IDocument;
import org.eclipse.text.edits.TextEdit;

public class OldFormatterFactory extends AbstractScriptFormatterFactory {

	public IFormatterModifyDialog createDialog(
			IFormatterModifyDialogOwner dialogOwner) {
		return null;
	}

	private static class OldFormatterWrapper implements IScriptFormatter {

		private final String lineDelimiter;
		private final Map options;

		protected OldFormatterWrapper(Map preferences, String lineDelimiter) {
			this.options = preferences;
			this.lineDelimiter = lineDelimiter;
		}

		public TextEdit format(String source, int offset, int length,
				int indentationLevel) throws FormatterException {
			return new OldCodeFormatter(options).format(((Integer) options
					.get("old.kind")).intValue(), source, offset, length,
					(StringBuffer) options.get("old.computeIndentation"),
					lineDelimiter);
		}

		public int detectIndentationLevel(IDocument document, int offset) {
			return 0;
		}

	}

	public IScriptFormatter createFormatter(String lineDelimiter,
			Map preferences) {
		return new OldFormatterWrapper(preferences, lineDelimiter);
	}

	public PreferenceKey getActiveProfileKey() {
		return null;
	}

	public PreferenceKey[] getPreferenceKeys() {
		return null;
	}

	public PreferenceKey getProfilesKey() {
		return null;
	}

	public Map retrievePreferences(IPreferencesLookupDelegate delegate) {
		return new HashMap();
	}

}
