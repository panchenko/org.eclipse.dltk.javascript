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

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.dltk.codeassist.ISelectionEngine;
import org.eclipse.dltk.compiler.env.IModuleSource;
import org.eclipse.dltk.core.DLTKLanguageManager;
import org.eclipse.dltk.core.ILocalVariable;
import org.eclipse.dltk.core.IMethod;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.IScriptProject;
import org.eclipse.dltk.core.ISourceRange;
import org.eclipse.dltk.core.ISourceReference;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.core.model.UnresolvedElement;
import org.eclipse.dltk.core.search.IDLTKSearchConstants;
import org.eclipse.dltk.core.search.SearchEngine;
import org.eclipse.dltk.core.search.SearchMatch;
import org.eclipse.dltk.core.search.SearchParticipant;
import org.eclipse.dltk.core.search.SearchPattern;
import org.eclipse.dltk.core.search.SearchRequestor;
import org.eclipse.dltk.core.tests.CodeAssistUtil;
import org.eclipse.dltk.core.tests.model.AbstractModelTests;
import org.eclipse.dltk.javascript.core.JavaScriptNature;
import org.eclipse.dltk.javascript.core.Types;
import org.eclipse.dltk.javascript.internal.core.codeassist.JavaScriptSelectionEngine2;
import org.junit.Assert;
import org.junit.Ignore;

@SuppressWarnings("restriction")
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
		for (ISelectionEngine engine : DLTKLanguageManager
				.getSelectionEngines(JavaScriptNature.NATURE_ID)) {
			if (engine instanceof JavaScriptSelectionEngine2) {
				return engine;
			}
		}
		throw new IllegalStateException(
				JavaScriptSelectionEngine2.class.getName() + " not found");
	}

	private IModelElement[] select(IModuleSource module, final int position) {
		return CodeAssistUtil.on(module).offset(position)
				.codeSelect(getEngine());
	}

	private Object[] selectAll(IModuleSource module, final int position) {
		return CodeAssistUtil.on(module).offset(position)
				.codeSelectAll(getEngine());
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
		final IModelElement local = elements[0];
		final ISourceRange nameRange = ((ISourceReference) local)
				.getNameRange();
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

	@Ignore
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
		assertEquals(
				contents.indexOf("fun6", contents.indexOf("function test5a()")),
				nameRange.getOffset());
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

	public void testArrayLiteralItem() throws ModelException {
		IModuleSource module = getModule("array.js");
		IModelElement[] elements = select(module,
				lastPositionInFile("abc", module, false));
		assertEquals(1, elements.length);
	}

	public void testNestedFunctionLocalVar() throws CoreException {
		IModuleSource module = getModule("nested.js");
		final int nestedVarOffset = lastPositionInFile("i = 1", module, false);
		IModelElement[] elements = select(module, nestedVarOffset);
		assertEquals(1, elements.length);
		assertEquals(nestedVarOffset, ((ILocalVariable) elements[0])
				.getNameRange().getOffset());
		final SearchPattern pattern = SearchPattern.createPattern(elements[0],
				IDLTKSearchConstants.ALL_OCCURRENCES);
		assertNotNull(pattern);
		final List<SearchMatch> result = new ArrayList<SearchMatch>();
		new SearchEngine().search(pattern,
				new SearchParticipant[] { SearchEngine
						.getDefaultSearchParticipant() }, SearchEngine
						.createSearchScope(module.getModelElement()),
				new SearchRequestor() {
					@Override
					public void acceptSearchMatch(SearchMatch match)
							throws CoreException {
						result.add(match);
					}
				}, null);
		assertEquals(3, result.size());
	}

	public void testJSDocType_param() throws ModelException {
		if (!JavaScriptSelectionEngine2.isJSDocTypeSelectionEnabled())
			return;
		final IModuleSource module = getModule("jsdoc-type-param.js");
		Assert.assertArrayEquals(new Object[] { Types.STRING },
				selectAll(module, lastPositionInFile("String", module, false)));
		Assert.assertArrayEquals(new Object[] { Types.NUMBER },
				selectAll(module, lastPositionInFile("Number", module, false)));
		Assert.assertArrayEquals(new Object[] { Types.BOOLEAN },
				selectAll(module, lastPositionInFile("Boolean", module, false)));
	}

	public void testJSDocType_return() throws ModelException {
		if (!JavaScriptSelectionEngine2.isJSDocTypeSelectionEnabled())
			return;
		final IModuleSource module = getModule("jsdoc-type-return.js");
		Assert.assertArrayEquals(new Object[] { Types.STRING },
				selectAll(module, lastPositionInFile("String", module, false)));
		Assert.assertArrayEquals(new Object[] { Types.NUMBER },
				selectAll(module, lastPositionInFile("Number", module, false)));
		Assert.assertArrayEquals(new Object[] { Types.BOOLEAN },
				selectAll(module, lastPositionInFile("Boolean", module, false)));
	}

	public void testJSDocType_type() throws ModelException {
		if (!JavaScriptSelectionEngine2.isJSDocTypeSelectionEnabled())
			return;
		final IModuleSource module = getModule("jsdoc-type-type.js");
		Assert.assertArrayEquals(new Object[] { Types.STRING },
				selectAll(module, lastPositionInFile("String", module, false)));
		Assert.assertArrayEquals(new Object[] { Types.NUMBER },
				selectAll(module, lastPositionInFile("Number", module, false)));
		Assert.assertArrayEquals(new Object[] { Types.BOOLEAN },
				selectAll(module, lastPositionInFile("Boolean", module, false)));
	}

	public void testJSDocType_type_noBraces() throws ModelException {
		if (!JavaScriptSelectionEngine2.isJSDocTypeSelectionEnabled())
			return;
		final IModuleSource module = getModule("jsdoc-type-type-no-braces.js");
		Assert.assertArrayEquals(new Object[] { Types.STRING },
				selectAll(module, lastPositionInFile("String", module, false)));
	}

	
	public void testExtends() throws ModelException {
		IModuleSource module = getModule("extends.js");
		IModelElement[] elements = select(module,
				lastPositionInFile("myprop", module, false));
		assertEquals(1, elements.length);
		final UnresolvedElement variable1 = (UnresolvedElement) elements[0];
		elements = select(module,
				lastPositionInFile("myval", module, false));
		assertEquals(1, elements.length);
		final UnresolvedElement variable2 = (UnresolvedElement) elements[0];
		final int offset1 = variable1.getSourceRange().getOffset();
		final int offset2 = variable2.getSourceRange().getOffset();
		
		assertTrue(offset1 > offset2);
		
		ISourceRange nameRange = variable1.getNameRange();
		assertEquals(
				"myprop",
				module.getSourceContents().substring(nameRange.getOffset(),
						nameRange.getOffset() + nameRange.getLength()));
		nameRange = variable2.getNameRange();
		assertEquals(
				"myval",
				module.getSourceContents().substring(nameRange.getOffset(),
						nameRange.getOffset() + nameRange.getLength()));
	}

	
	public void testExtends2() throws ModelException {
		IModuleSource module = getModule("extends.js");
		IModelElement[] elements = select(module,
				lastPositionInFile("mypublicfunction", module, false));
		assertEquals(1, elements.length);
		IMethod method = (IMethod) elements[0];
		assertEquals("MySubConstructor", method.getParent().getElementName());
		ISourceRange nameRange = method.getNameRange();
		assertEquals(
				"mypublicfunction",
				module.getSourceContents().substring(nameRange.getOffset(),
						nameRange.getOffset() + nameRange.getLength()));
		
		elements = select(module,
				lastPositionInFile("myfunction", module, false));
		assertEquals(1, elements.length);
		method = (IMethod) elements[0];
		assertEquals("MyConstructor", method.getParent().getElementName());
		nameRange = method.getNameRange();
		assertEquals(
				"myfunction",
				module.getSourceContents().substring(nameRange.getOffset(),
						nameRange.getOffset() + nameRange.getLength()));

	}
}
