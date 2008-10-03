package org.eclipse.dltk.internal.javascript.parser;

import org.eclipse.dltk.compiler.task.ITodoTaskPreferences;
import org.eclipse.dltk.compiler.task.TodoTaskPreferences;
import org.eclipse.dltk.core.IScriptProject;
import org.eclipse.dltk.core.builder.AbstractTodoTaskBuildParticipantType;
import org.eclipse.dltk.javascript.core.JavaScriptPlugin;

public class JavaScriptTodoParserType extends
		AbstractTodoTaskBuildParticipantType {

	protected ITodoTaskPreferences getPreferences(IScriptProject project) {
		return new TodoTaskPreferences(JavaScriptPlugin.getDefault()
				.getPluginPreferences());
	}

}
