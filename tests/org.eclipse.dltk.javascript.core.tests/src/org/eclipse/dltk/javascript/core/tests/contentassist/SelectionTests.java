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
package org.eclipse.dltk.javascript.core.tests.contentassist;

import static org.eclipse.dltk.javascript.core.tests.AllTests.PLUGIN_ID;
import static org.eclipse.dltk.javascript.core.tests.contentassist.AbstractContentAssistTest.lastPositionInFile;

import org.eclipse.dltk.codeassist.ISelectionEngine;
import org.eclipse.dltk.compiler.env.IModuleSource;
import org.eclipse.dltk.core.DLTKLanguageManager;
import org.eclipse.dltk.core.IField;
import org.eclipse.dltk.core.ILocalVariable;
import org.eclipse.dltk.core.IMethod;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.IScriptProject;
import org.eclipse.dltk.core.ISourceRange;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.core.ScriptModelUtil;
import org.eclipse.dltk.core.tests.Skip;
import org.eclipse.dltk.core.tests.model.AbstractModelTests;
import org.eclipse.dltk.javascript.core.JavaScriptNature;

public class SelectionTests extends AbstractModelTests {

	private static final String PRJ_NAME = "selection";

	public SelectionTests(String name) {
		super(PLUGIN_ID, name);
	}

	public static Suite suite() {
		return new Suite(SelectionTests.class);
	}

	@Override
	public void setUpSuite() throws Exception {
		super.setUpSuite();
		setUpScriptProject(PRJ_NAME);
		waitUntilIndexesReady();
	}

	@Override
	protected void setUp() throws Exception {
		IScriptProject scriptProject = getScriptProject(PRJ_NAME);
		if (scriptProject == null || !scriptProject.isOpen()) {
			setUpSuite();
		}
		super.setUp();
	}

	@Override
	public void tearDownSuite() throws Exception {
		deleteProject(PRJ_NAME);
		super.tearDownSuite();
	}

	private ISelectionEngine getEngine() {
		return DLTKLanguageManager
				.getSelectionEngine(JavaScriptNature.NATURE_ID);
	}

	public IModelElement[] select(IModuleSource module, final int position) {
		ISelectionEngine engine = getEngine();
		final IModelElement[] result = engine
				.select(module, position, position);
		return result != null ? result : ScriptModelUtil.NO_ELEMENTS;
	}

	public void test1() throws ModelException {
		IModuleSource module = getModule("selection1.js");
		IModelElement[] elements = select(module,
				lastPositionInFile("test1()", module, false));
		assertEquals(1, elements.length);
		final IMethod method = (IMethod) elements[0];
		final int offset = method.getSourceRange().getOffset();
		assertEquals("function",
				module.getSourceContents().substring(offset, offset + 8));
		final ISourceRange nameRange = method.getNameRange();
		assertEquals(
				"test1",
				module.getSourceContents().substring(nameRange.getOffset(),
						nameRange.getOffset() + nameRange.getLength()));
	}

	private IModuleSource getModule(String path) throws ModelException {
		return (IModuleSource) getSourceModule(PRJ_NAME, "src", path);
	}

	public void test2() throws ModelException {
		IModuleSource module = getModule("selection1.js");
		IModelElement[] elements = select(module,
				lastPositionInFile("test2()", module, false));
		assertEquals(1, elements.length);
		final IMethod method = (IMethod) elements[0];
		final int offset = method.getSourceRange().getOffset();
		assertEquals("function",
				module.getSourceContents().substring(offset, offset + 8));
		final ISourceRange nameRange = method.getNameRange();
		assertEquals(
				"test2",
				module.getSourceContents().substring(nameRange.getOffset(),
						nameRange.getOffset() + nameRange.getLength()));
	}

	public void test3() throws ModelException {
		IModuleSource module = getModule("selection1.js");
		IModelElement[] elements = select(module,
				lastPositionInFile("test3()", module, false));
		assertEquals(1, elements.length);
		final IMethod method = (IMethod) elements[0];
		final int offset = method.getSourceRange().getOffset();
		assertEquals("function",
				module.getSourceContents().substring(offset, offset + 8));
		final ISourceRange nameRange = method.getNameRange();
		assertEquals(
				"test3",
				module.getSourceContents().substring(nameRange.getOffset(),
						nameRange.getOffset() + nameRange.getLength()));
	}

	public void test4() throws ModelException {
		IModuleSource module = getModule("selection1.js");
		IModelElement[] elements = select(module,
				lastPositionInFile("testArgument", module, false));
		assertEquals(1, elements.length);
		final ILocalVariable variable = (ILocalVariable) elements[0];
		final ISourceRange nameRange = variable.getNameRange();
		assertEquals(
				"testArgument",
				module.getSourceContents().substring(nameRange.getOffset(),
						nameRange.getOffset() + nameRange.getLength()));
	}

	public void testLocalVar() throws ModelException {
		IModuleSource module = getModule("locals.js");
		IModelElement[] elements = select(module,
				lastPositionInFile("beta", module, false));
		assertEquals(1, elements.length);
		final ILocalVariable local = (ILocalVariable) elements[0];
		final ISourceRange nameRange = local.getNameRange();
		final String contents = module.getSourceContents();
		assertEquals(contents.indexOf("beta"), nameRange.getOffset());
	}

	public void testArgument() throws ModelException {
		IModuleSource module = getModule("locals.js");
		IModelElement[] elements = select(module,
				lastPositionInFile("alpha", module, false));
		assertEquals(1, elements.length);
		final ILocalVariable local = (ILocalVariable) elements[0];
		final ISourceRange nameRange = local.getNameRange();
		final String contents = module.getSourceContents();
		assertEquals(contents.indexOf("alpha"), nameRange.getOffset());
	}

	public void testField() throws ModelException {
		IModuleSource module = getModule("fields.js");
		IModelElement[] elements = select(module,
				lastPositionInFile("aa", module, false));
		assertEquals(1, elements.length);
		final IField local = (IField) elements[0];
		final ISourceRange nameRange = local.getNameRange();
		final String contents = module.getSourceContents();
		assertEquals(contents.indexOf("aa"), nameRange.getOffset());
	}

	public void testFunctionField() throws ModelException {
		IModuleSource module = getModule("functions.js");
		IModelElement[] elements = select(module,
				lastPositionInFile("fun1", module, false));
		assertEquals(1, elements.length);
		final IMethod local = (IMethod) elements[0];
		final ISourceRange nameRange = local.getNameRange();
		final String contents = module.getSourceContents();
		assertEquals(contents.indexOf("fun1"), nameRange.getOffset());
	}

	public void testFunctionLocalField() throws ModelException {
		IModuleSource module = getModule("functions.js");
		IModelElement[] elements = select(module,
				lastPositionInFile("fun2", module, false));
		assertEquals(1, elements.length);
		final IMethod local = (IMethod) elements[0];
		final ISourceRange nameRange = local.getNameRange();
		final String contents = module.getSourceContents();
		assertEquals(contents.indexOf("fun2"), nameRange.getOffset());
	}

	public void testFunctionLocalFieldWith2Declarations() throws ModelException {
		IModuleSource module = getModule("functions.js");
		IModelElement[] elements = select(module,
				lastPositionInFile("fun4", module, false));
		assertEquals(0, elements.length);
	}

	@Skip
	public void testFunctionThisField() throws ModelException {
		IModuleSource module = getModule("functions.js");
		IModelElement[] elements = select(module,
				lastPositionInFile("fun5", module, false));
		assertEquals(1, elements.length);
		final IMethod local = (IMethod) elements[0];
		final ISourceRange nameRange = local.getNameRange();
		final String contents = module.getSourceContents();
		assertEquals(contents.indexOf("fun5"), nameRange.getOffset());
	}

	public void testFunctionThisOuterField() throws ModelException {
		IModuleSource module = getModule("functions.js");
		IModelElement[] elements = select(module,
				lastPositionInFile("fun6", module, false));
		assertEquals(1, elements.length);
		final IMethod local = (IMethod) elements[0];
		final ISourceRange nameRange = local.getNameRange();
		final String contents = module.getSourceContents();
		assertEquals(contents.indexOf("fun6"), nameRange.getOffset());
	}

	public void testFunctionThisFieldWithLocalFunction() throws ModelException {
		IModuleSource module = getModule("functions.js");
		IModelElement[] elements = select(module,
				lastPositionInFile("fun8", module, false));
		assertEquals(0, elements.length);
	}

	public void testFunctionThisFieldWithLocalFunctionOutercall()
			throws ModelException {
		IModuleSource module = getModule("functions.js");
		IModelElement[] elements = select(module,
				lastPositionInFile("funA", module, false));
		assertEquals(0, elements.length);
	}

	public void testFunctionObjectInitalizerFunctionField()
			throws ModelException {
		IModuleSource module = getModule("functions.js");
		IModelElement[] elements = select(module,
				lastPositionInFile("funB", module, false));
		assertEquals(1, elements.length);
		final IMethod local = (IMethod) elements[0];
		final ISourceRange nameRange = local.getNameRange();
		final String contents = module.getSourceContents();
		assertEquals(contents.indexOf("funB"), nameRange.getOffset());
	}

}
