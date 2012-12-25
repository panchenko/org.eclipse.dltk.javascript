package org.eclipse.dltk.internal.javascript.parser;

import org.eclipse.dltk.compiler.task.ITodoTaskPreferences;
import org.eclipse.dltk.compiler.task.TodoTaskPreferencesOnPreferenceLookupDelegate;
import org.eclipse.dltk.core.IScriptProject;
import org.eclipse.dltk.core.builder.AbstractTodoTaskBuildParticipantType;
import org.eclipse.dltk.core.builder.IBuildParticipant;
import org.eclipse.dltk.javascript.core.JavaScriptPlugin;

public class JavaScriptTodoParserType extends
		AbstractTodoTaskBuildParticipantType {

	@Override
	protected ITodoTaskPreferences getPreferences(IScriptProject project) {
		return new TodoTaskPreferencesOnPreferenceLookupDelegate(
				JavaScriptPlugin.PLUGIN_ID, project);
	}

	@Override
	protected IBuildParticipant getBuildParticipant(
			ITodoTaskPreferences preferences) {
		return new JavaScriptTodoParser(preferences);
	}
}
