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
package org.eclipse.dltk.javascript.internal.ui.text;

import static org.eclipse.dltk.javascript.internal.ui.text.JavascriptColorConstants.JS_DEPRECATED;
import static org.eclipse.dltk.ui.PreferenceConstants.EDITOR_SEMANTIC_HIGHLIGHTING_ENABLED_SUFFIX;

import org.eclipse.dltk.compiler.env.IModuleSource;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencer2;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.internal.ui.JavaScriptUI;
import org.eclipse.dltk.javascript.parser.JavaScriptParserUtil;
import org.eclipse.dltk.ui.editor.highlighting.AbortSemanticHighlightingException;
import org.eclipse.dltk.ui.editor.highlighting.ISemanticHighlighter;
import org.eclipse.dltk.ui.editor.highlighting.ISemanticHighlightingRequestor;

@SuppressWarnings("restriction")
public class JavaScriptDeprecationHighlighter implements ISemanticHighlighter {

	public String[] getHighlightingKeys() {
		return new String[] { JS_DEPRECATED };
	}

	public void process(IModuleSource code,
			ISemanticHighlightingRequestor requestor) {
		if (!JavaScriptUI
				.getDefault()
				.getPreferenceStore()
				.getBoolean(
						JS_DEPRECATED
								+ EDITOR_SEMANTIC_HIGHLIGHTING_ENABLED_SUFFIX)) {
			// TODO (alex) simplify enablement check
			return;
		}
		final Script script = JavaScriptParserUtil.parse(code, null);
		if (script == null) {
			throw new AbortSemanticHighlightingException();
		}
		final TypeInferencer2 inferencer = new TypeInferencer2();
		inferencer.setModelElement(code.getModelElement());
		final JavaScriptDeprecationHighlightVisitor visitor = new JavaScriptDeprecationHighlightVisitor(
				inferencer, requestor);
		inferencer.setVisitor(visitor);
		inferencer.doInferencing(script);
	}

}
