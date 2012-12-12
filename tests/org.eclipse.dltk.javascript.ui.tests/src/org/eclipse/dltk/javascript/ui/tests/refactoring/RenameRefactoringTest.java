/*******************************************************************************
 * Copyright (c) 2012 NumberFour AG
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     NumberFour AG - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.ui.tests.refactoring;

import static com.google.common.base.Preconditions.checkNotNull;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.core.runtime.SubMonitor;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.manipulation.IRefactoringEngine;
import org.eclipse.dltk.core.manipulation.RefactoringEngineManager;
import org.eclipse.dltk.core.tests.ProjectSetup;
import org.eclipse.dltk.internal.corext.refactoring.rename.ScriptRenameProcessor;
import org.eclipse.dltk.internal.corext.refactoring.tagging.IReferenceUpdating;
import org.eclipse.dltk.javascript.ui.tests.AllTests;
import org.eclipse.ltk.core.refactoring.Change;
import org.eclipse.ltk.core.refactoring.RefactoringStatus;
import org.eclipse.ltk.core.refactoring.participants.ProcessorBasedRefactoring;
import org.junit.Assert;
import org.junit.ClassRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class RenameRefactoringTest extends Assert {

	@ClassRule
	public static final ProjectSetup PROJECT = new ProjectSetup(
			AllTests.WORKSPACE, "rename");

	@Rule
	public final ErrorCollector errors = new ErrorCollector();

	@Test
	public void renameParamWithJSDoc() throws CoreException {
		final ISourceModule module = checkNotNull(PROJECT.getSourceModule(
				"src", "param-jsdoc.js"));

		module.becomeWorkingCopy(null, null);
		try {

			final IModelElement[] elements = module.codeSelect(module
					.getSource().indexOf("x)"), 0);
			assertEquals(1, elements.length);

			final IModelElement element = elements[0];
			final IRefactoringEngine engine = checkNotNull(RefactoringEngineManager
					.getInstance().findRefactoringEngine(element));
			final ScriptRenameProcessor processor = engine
					.createRenameProcessor(element);
			processor.setNewElementName("y");
			((IReferenceUpdating) processor).setUpdateReferences(true);

			final SubMonitor monitor = SubMonitor
					.convert(new NullProgressMonitor());
			final ProcessorBasedRefactoring ref = new ProcessorBasedRefactoring(
					processor);
			final RefactoringStatus conditionsStatus = ref
					.checkAllConditions(monitor.newChild(1));
			assertTrue(conditionsStatus.isOK());
			final Change change = ref.createChange(monitor.newChild(1));
			change.perform(monitor.newChild(1));

			assertEquals(
					PROJECT.getFileContentsAsString("src/param-jsdoc.txt"),
					module.getSource());
		} finally {
			try {
				module.discardWorkingCopy();
			} catch (Exception e) {
				errors.addError(e);
			}
		}
	}

}
