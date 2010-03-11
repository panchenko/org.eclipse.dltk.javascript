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
package org.eclipse.dltk.javascript.core.tests.validation;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.core.resources.IFile;
import org.eclipse.dltk.compiler.problem.IProblem;
import org.eclipse.dltk.compiler.problem.IProblemReporter;
import org.eclipse.dltk.compiler.problem.ProblemCollector;
import org.eclipse.dltk.compiler.task.ITaskReporter;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.builder.IBuildContext;
import org.eclipse.dltk.core.builder.ISourceLineTracker;
import org.eclipse.dltk.core.environment.IFileHandle;
import org.eclipse.dltk.utils.TextUtils;

public class TestBuildContext implements IBuildContext {

	private final String content;

	public TestBuildContext(String content) {
		this.content = content;
	}

	private final Map<String, Object> attributes = new HashMap<String, Object>();

	public Object get(String attribute) {
		return attributes.get(attribute);
	}

	public void set(String attribute, Object value) {
		attributes.put(attribute, value);
	}

	public int getBuildType() {
		return INCREMENTAL_BUILD;
	}

	public String getSourceContents() {
		return content;
	}

	public char[] getContents() {
		return content.toCharArray();
	}

	public char[] getContentsAsCharArray() {
		return getContents();
	}

	public IFile getFile() {
		return null;
	}

	public IFileHandle getFileHandle() {
		return null;
	}

	private ISourceLineTracker lineTracker = null;

	public ISourceLineTracker getLineTracker() {
		if (lineTracker == null) {
			lineTracker = TextUtils.createLineTracker(content);
		}
		return lineTracker;
	}

	private final ProblemCollector problemCollector = new ProblemCollector();

	public IProblemReporter getProblemReporter() {
		return problemCollector;
	}

	public ISourceModule getSourceModule() {
		return null;
	}

	public ITaskReporter getTaskReporter() {
		return problemCollector;
	}

	public List<IProblem> getProblems() {
		return problemCollector.getProblems();
	}

	public IModelElement getModelElement() {
		return null;
	}

	public String getFileName() {
		return null;
	}

}
