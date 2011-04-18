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
package org.eclipse.dltk.javascript.internal.ui.text.folding;

import java.util.HashMap;

import org.eclipse.dltk.ast.parser.IModuleDeclaration;
import org.eclipse.dltk.core.DLTKCore;
import org.eclipse.dltk.core.IMethod;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.IModelElementVisitor;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.ISourceRange;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.core.SourceParserUtil;
import org.eclipse.dltk.corext.SourceRange;
import org.eclipse.dltk.internal.javascript.validation.AbstractNavigationVisitor;
import org.eclipse.dltk.javascript.ast.FunctionStatement;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.ast.Method;
import org.eclipse.dltk.javascript.ast.ObjectInitializer;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.ast.StringLiteral;
import org.eclipse.dltk.javascript.ast.XmlLiteral;
import org.eclipse.dltk.javascript.parser.JavaScriptParser;
import org.eclipse.dltk.ui.PreferenceConstants;
import org.eclipse.dltk.ui.text.folding.IFoldingBlockProvider;
import org.eclipse.dltk.ui.text.folding.IFoldingBlockRequestor;
import org.eclipse.dltk.ui.text.folding.IFoldingContent;
import org.eclipse.jface.preference.IPreferenceStore;

public class JavaScriptCodeFoldingBlockProvider extends
		AbstractNavigationVisitor<Object> implements IFoldingBlockProvider {

	private static Script parse(IFoldingContent content) {
		if (content.getModelElement() instanceof ISourceModule) {
			IModuleDeclaration declaration = SourceParserUtil.parse(
					(ISourceModule) content.getModelElement(), null);
			if (declaration instanceof Script) {
				return (Script) declaration;
			}
		}
		JavaScriptParser parser = new JavaScriptParser();
		return parser.parse(content, null);
	}

	private boolean collapseMethods;
	private boolean collapseObjectInitializers;
	private boolean collapseXml;
	private boolean collapseStrings;
	private int fBlockLinesMin;

	public void initializePreferences(IPreferenceStore preferenceStore) {
		collapseMethods = preferenceStore
				.getBoolean(PreferenceConstants.EDITOR_FOLDING_INIT_METHODS);
		fBlockLinesMin = preferenceStore
				.getInt(PreferenceConstants.EDITOR_FOLDING_LINES_LIMIT);
	}

	public int getMinimalLineCount() {
		return fBlockLinesMin;
	}

	private IFoldingBlockRequestor requestor;

	public void setRequestor(IFoldingBlockRequestor requestor) {
		this.requestor = requestor;
	}

	@SuppressWarnings("serial")
	public static class MethodCollector extends
			HashMap<ISourceRange, IModelElement> implements
			IModelElementVisitor {

		public boolean visit(IModelElement element) {

			if (element instanceof IMethod) {
				try {
					put(((IMethod) element).getNameRange(), element);
				} catch (ModelException e) {
					// empty
				}
			}
			return true;
		}

		/**
		 * @param offset
		 * @param length
		 */
		public IModelElement get(int offset, int length) {
			return get(new SourceRange(offset, length));
		}

	}

	private MethodCollector methodCollector = new MethodCollector();

	public void computeFoldableBlocks(IFoldingContent content) {
		final Script script = parse(content);
		if (script != null) {
			methodCollector.clear();
			try {
				content.getModelElement().accept(methodCollector);
			} catch (ModelException e) {
				if (DLTKCore.DEBUG) {
					e.printStackTrace();
				}
			}
			visitScript(script);
		}
	}

	@Override
	public Object visitFunctionStatement(FunctionStatement node) {
		IModelElement element = null;
		final Identifier name = node.getName();
		if (name != null) {
			element = methodCollector.get(name.sourceStart(), name.sourceEnd()
					- name.sourceStart());
		}

		requestor.acceptBlock(node.sourceStart(), node.sourceEnd(),
				JavaScriptFoldingBlockKind.FUNCTION, element, collapseMethods);
		return super.visitFunctionStatement(node);
	}

	@Override
	protected Object visitMethod(Method method) {
		requestor.acceptBlock(method.sourceStart(), method.sourceEnd(),
				JavaScriptFoldingBlockKind.FUNCTION, null, collapseMethods);
		return super.visitMethod(method);
	}

	@Override
	public Object visitObjectInitializer(ObjectInitializer node) {
		requestor.acceptBlock(node.sourceStart(), node.sourceEnd(),
				JavaScriptFoldingBlockKind.OBJECT_INITIALIZER, null,
				collapseObjectInitializers);
		return super.visitObjectInitializer(node);
	}

	@Override
	public Object visitXmlLiteral(XmlLiteral node) {
		requestor.acceptBlock(node.sourceStart(), node.sourceEnd(),
				JavaScriptFoldingBlockKind.XML, null, collapseXml);
		return super.visitXmlLiteral(node);
	}

	@Override
	public Object visitStringLiteral(StringLiteral node) {
		requestor.acceptBlock(node.sourceStart(), node.sourceEnd(),
				JavaScriptFoldingBlockKind.MULTILINESTRING, null,
				collapseStrings);
		return super.visitStringLiteral(node);
	}
}
