package org.eclipse.dltk.internal.javascript.parser;

import org.eclipse.core.runtime.Preferences;
import org.eclipse.dltk.javascript.core.JavaScriptNature;
import org.eclipse.dltk.javascript.core.JavaScriptPlugin;
import org.eclipse.dltk.validators.core.AbstractTodoTaskBuildParticipantType;

public class JavaScriptTodoParserType extends
		AbstractTodoTaskBuildParticipantType {

	private static final String ID = "org.eclipse.dltk.javascript.todo"; //$NON-NLS-1$
	private static final String NAME = "JavaScript TODO task parser"; //$NON-NLS-1$

	public JavaScriptTodoParserType() {
		super(ID, NAME);
	}

	protected Preferences getPreferences() {
		return JavaScriptPlugin.getDefault().getPluginPreferences();
	}

	public String getNature() {
		return JavaScriptNature.NATURE_ID;
	}
}
