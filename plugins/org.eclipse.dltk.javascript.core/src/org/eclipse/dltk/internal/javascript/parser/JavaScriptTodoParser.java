/*******************************************************************************
 * Copyright (c) 2010 xored software, Inc.  
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html  
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.internal.javascript.parser;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.dltk.compiler.task.ITaskReporter;
import org.eclipse.dltk.compiler.task.ITodoTaskPreferences;
import org.eclipse.dltk.compiler.task.TodoTaskSimpleParser;
import org.eclipse.dltk.core.builder.IBuildContext;
import org.eclipse.dltk.core.builder.IBuildParticipant;
import org.eclipse.dltk.internal.javascript.validation.JavaScriptValidations;
import org.eclipse.dltk.javascript.ast.Comment;
import org.eclipse.dltk.javascript.ast.Script;

public class JavaScriptTodoParser extends TodoTaskSimpleParser implements
		IBuildParticipant {

	public JavaScriptTodoParser(ITodoTaskPreferences preferences) {
		super(preferences);
	}

	private static class DelegatingTaskReporter implements ITaskReporter {

		private final ITaskReporter taskReporter;
		int lineOffset;
		int locationOffset;

		public DelegatingTaskReporter(ITaskReporter taskReporter) {
			this.taskReporter = taskReporter;
		}

		public void reportTask(String message, int lineNumber, int priority,
				int charStart, int charEnd) {
			taskReporter.reportTask(message, lineNumber + lineOffset, priority,
					charStart + locationOffset, charEnd + locationOffset);
		}

		public Object getAdapter(Class adapter) {
			return null;
		}

	}

	public void build(IBuildContext context) throws CoreException {
		final Script script = JavaScriptValidations.parse(context);
		if (script == null) {
			return;
		}
		final DelegatingTaskReporter taskReporter = new DelegatingTaskReporter(
				context.getTaskReporter());
		for (Comment comment : script.getComments()) {
			taskReporter.locationOffset = comment.sourceStart();
			taskReporter.lineOffset = context.getLineTracker()
					.getLineNumberOfOffset(comment.sourceStart());
			parse(taskReporter, comment.getText().toCharArray());
		}
	}

	@Override
	protected int findCommentStart(char[] content, int begin, int end) {
		begin = skipSpaces(content, begin, end);
		for (int i = begin; i < end; ++i) {
			if (content[i] == '/' && i + 1 < end && content[i + 1] == '/') {
				return i + 2;
			} else if (content[i] == '*') {
				return i + 1;
			} else if (content[i] == '/' && i + 1 < end
					&& content[i + 1] == '*') {
				i += 2;
				while (i < end && content[i] == '*') {
					++i;
				}
				return i;
			}
		}
		return -1;
	}

}
