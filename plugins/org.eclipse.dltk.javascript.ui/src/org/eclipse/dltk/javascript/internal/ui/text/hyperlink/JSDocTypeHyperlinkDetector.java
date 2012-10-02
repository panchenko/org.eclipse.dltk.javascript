/*******************************************************************************
 * Copyright (c) 2011 NumberFour AG
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     NumberFour AG - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.internal.ui.text.hyperlink;

import org.eclipse.dltk.core.DLTKCore;
import org.eclipse.dltk.core.IMember;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.core.IModelElementVisitor;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.ModelException;
import org.eclipse.dltk.core.ScriptModelUtil;
import org.eclipse.dltk.internal.javascript.ti.JSDocSupport;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencer2;
import org.eclipse.dltk.internal.ui.actions.SelectionConverter;
import org.eclipse.dltk.internal.ui.editor.EditorUtility;
import org.eclipse.dltk.internal.ui.editor.ModelElementHyperlink;
import org.eclipse.dltk.javascript.internal.ui.JavaScriptUI;
import org.eclipse.dltk.javascript.internal.ui.text.JSDocTextUtils;
import org.eclipse.dltk.javascript.internal.ui.text.JSDocTypeUtil;
import org.eclipse.dltk.javascript.internal.ui.text.TypeNameNode;
import org.eclipse.dltk.javascript.parser.jsdoc.JSDocTag;
import org.eclipse.dltk.javascript.typeinfo.IElementConverter;
import org.eclipse.dltk.javascript.typeinfo.TypeInfoManager;
import org.eclipse.dltk.javascript.typeinfo.TypeMode;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.ui.text.IJavaScriptPartitions;
import org.eclipse.dltk.ui.actions.OpenAction;
import org.eclipse.dltk.ui.infoviews.ModelElementArray;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.ITextViewer;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.TextUtilities;
import org.eclipse.jface.text.hyperlink.AbstractHyperlinkDetector;
import org.eclipse.jface.text.hyperlink.IHyperlink;
import org.eclipse.ui.texteditor.ITextEditor;

@SuppressWarnings("restriction")
public class JSDocTypeHyperlinkDetector extends AbstractHyperlinkDetector {

	public IHyperlink[] detectHyperlinks(ITextViewer textViewer,
			IRegion inputRegion, boolean canShowMultipleHyperlinks) {
		if (inputRegion == null || textViewer == null) {
			return null;
		}
		try {
			final IDocument doc = textViewer.getDocument();
			final int offset = inputRegion.getOffset();
			final String contentType = TextUtilities.getContentType(doc,
					IJavaScriptPartitions.JS_PARTITIONING, offset, true);
			if (!IJavaScriptPartitions.JS_DOC.equals(contentType)
					&& !IJavaScriptPartitions.JS_MULTI_LINE_COMMENT
							.equals(contentType)) {
				return null;
			}
			final IRegion lineRegion = JSDocTextUtils
					.getLineRegion(doc, offset);
			final String line = doc.get(lineRegion.getOffset(),
					lineRegion.getLength());
			final int offsetInLine = offset - lineRegion.getOffset();
			int start = line.lastIndexOf('{', offsetInLine);
			if (start < 0) {
				return null;
			}
			++start;
			int end = line.indexOf('}', offsetInLine);
			if (end < 0) {
				return null;
			}
			final TypeNameNode tagName = JSDocTextUtils.getTag(
					line.toCharArray(), 0, start);
			if (tagName != null && JSDocTag.PARAM.equals(tagName.value())) {
				if (line.regionMatches(
						end - JSDocSupport.PARAM_OPTIONAL.length(),
						JSDocSupport.PARAM_OPTIONAL, 0,
						JSDocSupport.PARAM_OPTIONAL.length())) {
					end -= JSDocSupport.PARAM_OPTIONAL.length();
				}
				if (line.regionMatches(end - JSDocSupport.PARAM_DOTS.length(),
						JSDocSupport.PARAM_DOTS, 0,
						JSDocSupport.PARAM_DOTS.length())) {
					end -= JSDocSupport.PARAM_DOTS.length();
				}
				if (line.regionMatches(start, JSDocSupport.PARAM_DOTS, 0,
						JSDocSupport.PARAM_DOTS.length())) {
					start += JSDocSupport.PARAM_DOTS.length();
				}
			}
			final ITextEditor editor = (ITextEditor) getAdapter(ITextEditor.class);
			if (editor == null) {
				return null;
			}
			IAction action = editor.getAction("OpenEditor"); //$NON-NLS-1$
			if (action == null || !(action instanceof OpenAction))
				return null;
			final OpenAction openAction = (OpenAction) action;
			final ISourceModule input = EditorUtility
					.getEditorInputModelElement(editor, false);
			if (input == null) {
				return null;
			}
			TypeInferencer2 inferencer2 = new TypeInferencer2();
			inferencer2.setModelElement(input);
			final int typeExpressionOffset = lineRegion.getOffset() + start;
			final TypeNameNode selection = JSDocTypeUtil.findName(inferencer2,
					line.substring(start, end), offset - typeExpressionOffset);
			if (selection == null) {
				return null;
			}
			Type type = inferencer2
					.getKnownType(selection.type, TypeMode.JSDOC);
			Object[] elements = null;
			if (type == null) {
				try {
					ScriptModelUtil.reconcile(input);
					input.accept(new Visitor(selection.type));
				} catch (ModelException e) {
					if (DLTKCore.DEBUG) {
						e.printStackTrace();
					}
				} catch (ModelElementFound e) {
					elements = new Object[] { e.element };
				}
			} else {
				elements = SelectionConverter
						.filterElements(new Object[] { convert(input, type) });
			}
			if (elements != null && elements.length > 0) {
				final IRegion region = new Region(typeExpressionOffset
						+ selection.start, selection.end - selection.start);
				final IHyperlink link;
				if (elements.length == 1) {
					link = new ModelElementHyperlink(region, elements[0],
							openAction);
				} else {
					link = new ModelElementHyperlink(region,
							new ModelElementArray(elements), openAction);
				}
				return new IHyperlink[] { link };
			}
		} catch (BadLocationException e) {
			JavaScriptUI.log(e);
		}
		return null;
	}

	public Object convert(final ISourceModule input, Type type) {
		for (IElementConverter converter : TypeInfoManager
				.getElementConverters()) {
			final Object converted = converter.convert(input, type);
			if (converted != null) {
				return converted;
			}
		}
		return type;
	}

	private static class Visitor implements IModelElementVisitor {

		private final String name;

		public Visitor(String name) {
			this.name = name;
		}

		public boolean visit(IModelElement element) {
			if (element instanceof IMember) {
				IMember member = (IMember) element;
				if (name.equals(member.getElementName())) {
					throw new ModelElementFound(element);
				}
			}
			return true;
		}
	}

	@SuppressWarnings("serial")
	private static class ModelElementFound extends RuntimeException {
		final IModelElement element;

		public ModelElementFound(IModelElement element) {
			this.element = element;
		}

	}

}
