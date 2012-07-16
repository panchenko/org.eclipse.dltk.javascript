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
package org.eclipse.dltk.javascript.internal.ui.text.completion;

import org.eclipse.dltk.javascript.internal.ui.templates.JavaScriptTemplateCompletionProcessor;
import org.eclipse.dltk.ui.text.completion.ScriptTemplateCompletionProposalComputer;
import org.eclipse.dltk.ui.text.completion.ScriptContentAssistInvocationContext;
import org.eclipse.jface.text.templates.TemplateCompletionProcessor;

public class JavaScriptTemplateCompletionProposalComputer extends
		ScriptTemplateCompletionProposalComputer {

	@Override
	protected TemplateCompletionProcessor createCompletionProcessor(
			ScriptContentAssistInvocationContext context) {
		return new JavaScriptTemplateCompletionProcessor(context);
	}

}
