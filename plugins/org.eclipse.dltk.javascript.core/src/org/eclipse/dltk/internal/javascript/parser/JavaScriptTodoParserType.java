package org.eclipse.dltk.internal.javascript.parser;

import org.eclipse.dltk.compiler.task.ITodoTaskPreferences;
import org.eclipse.dltk.compiler.task.TodoTaskPreferences;
import org.eclipse.dltk.core.IScriptProject;
import org.eclipse.dltk.core.builder.AbstractTodoTaskBuildParticipantType;
import org.eclipse.dltk.core.builder.IBuildParticipant;
import org.eclipse.dltk.javascript.core.JavaScriptPlugin;

public class JavaScriptTodoParserType extends
		AbstractTodoTaskBuildParticipantType {

	protected ITodoTaskPreferences getPreferences(IScriptProject project) {
		return new TodoTaskPreferences(JavaScriptPlugin.getDefault()
				.getPluginPreferences());
	}

	protected IBuildParticipant getBuildParticipant(
			ITodoTaskPreferences preferences) {
		return new TodoTaskBuildParticipant(preferences) {
			protected int findCommentStart(char[] content, int begin, int end) {
				if (!isCheckRanges()) {
					begin = skipSpaces(content, begin, end);
					if (begin + 1 < end
							&& content[begin] == '/'
							&& (content[begin + 1] == '/' || content[begin + 1] == '*')) {
						return begin + 2;
					}
					return -1;
				}
				for (int i = begin; i < end; ++i) {
					if (content[i] == '/'
							&& (i + 1 < end && (content[i + 1] == '/' || content[i + 1] == '*'))
							&& isValid(i)) {
						return i + 2;
					}
				}
				return -1;
			}
		};
	}
}
