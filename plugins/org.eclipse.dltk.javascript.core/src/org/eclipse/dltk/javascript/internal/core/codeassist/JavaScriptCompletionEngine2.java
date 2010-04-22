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
package org.eclipse.dltk.javascript.internal.core.codeassist;

import org.eclipse.dltk.codeassist.ScriptCompletionEngine;
import org.eclipse.dltk.compiler.CharOperation;
import org.eclipse.dltk.compiler.env.IModuleSource;
import org.eclipse.dltk.internal.javascript.ti.IValueCollection;
import org.eclipse.dltk.internal.javascript.ti.IValueReference;
import org.eclipse.dltk.internal.javascript.ti.ReferenceKind;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencer2;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.core.JavaScriptKeywords;
import org.eclipse.dltk.javascript.internal.core.codeassist.AssitUtils.PositionCalculator;
import org.eclipse.dltk.javascript.parser.JavaScriptParserUtil;

public class JavaScriptCompletionEngine2 extends ScriptCompletionEngine {

	public void complete(IModuleSource cu, int position, int i) {
		this.requestor.beginReporting();
		String content = cu.getSourceContents();
		if (position < 0 || position > content.length()) {
			return;
		}
		if (position > 0) {
			if (content.charAt(position - 1) == '.') {
				// special case;
				content = content.substring(0, position) + " \n\r e"
						+ content.substring(position);
			} else if (content.charAt(position - 1) == '=') {
				// special case;
				content = content.substring(0, position) + " \n\r e"
						+ content.substring(position);
			}
		}
		final AssitUtils.PositionCalculator calculator = new PositionCalculator(
				content, position, false);
		final TypeInferencer2 inferencer2 = new TypeInferencer2();
		if (cu instanceof org.eclipse.dltk.core.ISourceModule) {
			inferencer2
					.setModelElement((org.eclipse.dltk.core.ISourceModule) cu);
		}
		final Script script = JavaScriptParserUtil.parse(cu, null);
		inferencer2.doInferencing(script);
		inferencer2.getCollection();

		String startPart = calculator.getCompletion();
		this.setSourceRange(position - startPart.length(), position);
		// System.out.println(startPart);
		if (calculator.isMember()) {
			// doCompletionOnMember(calculator, buildContext, cu, position,
			// content, position, collection);
		} else {
			doGlobalCompletion(inferencer2.getCollection(), startPart);
			doCompletionOnKeyword(startPart);
		}
		this.requestor.endReporting();
	}

	/**
	 * @param collection
	 * @param startPart
	 */
	private void doGlobalCompletion(IValueCollection collection,
			String startPart) {
		final char[] prefix = startPart.toCharArray();
		for (String childName : collection.getDirectChildren()) {
			if (CharOperation.prefixEquals(prefix, childName, false)) {
				IValueReference child = collection.getChild(childName);
				if (child == null)
					continue;
				if (child.getKind() == ReferenceKind.LOCAL) {
					// reportLocalVar(child);

				} else if (child.getKind() == ReferenceKind.FUNCTION
						|| child.getChild(IValueReference.FUNCTION_OP) != null) {
					// reportMethodRef(child);
				}

			}
		}
		// TODO Auto-generated method stub

	}

	private void doCompletionOnKeyword(String startPart) {
		String[] keywords = JavaScriptKeywords.getJavaScriptKeywords();
		findKeywords(startPart.toCharArray(), keywords, true);
	}

	// @SuppressWarnings("unchecked")
	// private <E extends Element> E extractElement(IValueReference reference,
	// Class<E> elementType) {
	// Object value = reference.getAttribute(IReferenceAttributes.ELEMENT);
	// if (elementType.isInstance(value)) {
	// return (E) value;
	// }
	// return null;
	// }

}
