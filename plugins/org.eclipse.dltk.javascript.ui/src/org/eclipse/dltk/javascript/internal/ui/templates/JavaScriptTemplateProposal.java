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
package org.eclipse.dltk.javascript.internal.ui.templates;

import org.eclipse.dltk.ui.templates.ScriptTemplateProposal;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.templates.Template;
import org.eclipse.jface.text.templates.TemplateContext;
import org.eclipse.swt.graphics.Image;

class JavaScriptTemplateProposal extends ScriptTemplateProposal {

	public JavaScriptTemplateProposal(Template template,
			TemplateContext context, IRegion region, Image image, int relevance) {
		super(template, context, region, image, relevance);
	}

	static final String C_START = "/*";
	static final String C_END = "*/";

	@Override
	public String getPattern() {
		final String pattern = super.getPattern();
		if (pattern.startsWith(C_START)) {
			final int pos = pattern.indexOf(C_END);
			if (pos > 0) {
				return pattern.substring(pos + 2).trim();
			}
		}
		return pattern;
	}

}
