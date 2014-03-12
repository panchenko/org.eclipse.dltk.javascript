package org.eclipse.dltk.javascript.internal.debug.ui;

import org.eclipse.dltk.core.IField;
import org.eclipse.dltk.dbgp.IDbgpProperty;
import org.eclipse.dltk.dbgp.commands.IDbgpPropertyCommands;
import org.eclipse.dltk.debug.core.model.IScriptStackFrame;
import org.eclipse.dltk.debug.core.model.IScriptValue;
import org.eclipse.dltk.debug.ui.ScriptDebugModelPresentation;
import org.eclipse.dltk.internal.debug.core.model.ScriptValue;
import org.eclipse.dltk.internal.debug.ui.ScriptDebugHover;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;

public class JavaScriptDebugHover extends ScriptDebugHover {

	protected ScriptDebugModelPresentation getModelPresentation() {
		return new JavaScriptDebugModelPresentation() {
			@Override
			protected boolean isShowLabelDetails(IScriptValue value) {
				return true;
			}

			@Override
			protected String getValueText(IScriptValue value) {
				String valueText = super.getValueText(value);
				if (valueText != null && valueText.length() > 400) {
					valueText = valueText.substring(0, 400) + "...";
				}
				return valueText;
			}
		};
	}

	public void setPreferenceStore(IPreferenceStore store) {

	}

	protected String getFieldProperty(IField field) {
		// if (field instanceof FakeField) {
		// return ((FakeField) field).getSnippet();
		// }
		return super.getFieldProperty(field);
	}

	/**
	 * @see String#charAt(int);
	 */

	public String getHoverInfo(ITextViewer textViewer, IRegion hoverRegion) {
		IScriptStackFrame frame = getFrame();
		if (frame == null)
			return null;

		String txt = textViewer.getDocument().get();

		int end = hoverRegion.getOffset();
		int maxPos = txt.length();
		if (end < maxPos) {
			while (end < maxPos) {
				char charAt = txt.charAt(end);
				if (Character.isJavaIdentifierPart(charAt) || charAt == ']') {
					end++;
					continue;
				} else {
					break;
				}
			}
		} else
			end = maxPos;

		int begin = hoverRegion.getOffset();
		int inBracket = 0;
		if (txt.charAt(end - 1) == ']')
			inBracket++;
		while (begin > 0) {
			char charAt = txt.charAt(begin);
			if (inBracket > 0) {
				if (charAt == ']') {
					inBracket++;
				} else if (charAt == '[') {
					inBracket--;
				}
				begin--;
				continue;
			}
			if (!Character.isJavaIdentifierPart(charAt)) {
				if (charAt == ']') {
					inBracket++;
				} else if (charAt != '.')
					break;
			}
			begin--;
		}
		if (inBracket > 0 || (begin + 1) >= end)
			return null;

		String snippet = txt.substring(begin + 1, end);
		IDbgpPropertyCommands propCmds = frame.getScriptThread()
				.getDbgpSession().getCoreCommands();

		try {
			IDbgpProperty property = propCmds.getProperty(snippet);
			return getResultText(snippet,
					ScriptValue.createValue(frame, property));
		} catch (Exception e) {
		}
		return null;
	}

}
