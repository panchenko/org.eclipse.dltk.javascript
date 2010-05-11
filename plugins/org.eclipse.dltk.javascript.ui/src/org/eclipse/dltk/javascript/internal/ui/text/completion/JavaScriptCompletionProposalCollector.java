/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.javascript.internal.ui.text.completion;

import java.util.HashSet;

import org.eclipse.dltk.core.CompletionProposal;
import org.eclipse.dltk.core.IScriptProject;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.ui.text.completion.AbstractScriptCompletionProposal;
import org.eclipse.dltk.ui.text.completion.CompletionProposalLabelProvider;
import org.eclipse.dltk.ui.text.completion.IScriptCompletionProposal;
import org.eclipse.dltk.ui.text.completion.ScriptCompletionProposal;
import org.eclipse.dltk.ui.text.completion.ScriptCompletionProposalCollector;
import org.eclipse.dltk.ui.text.completion.ScriptContentAssistInvocationContext;
import org.eclipse.swt.graphics.Image;

public class JavaScriptCompletionProposalCollector extends
		ScriptCompletionProposalCollector {

	protected final static char[] VAR_TRIGGER = new char[] { '\t', ' ', '=',
			';', '.' };

	private final HashSet doubleFilter = new HashSet();

	protected char[] getVarTrigger() {
		return VAR_TRIGGER;
	}

	public JavaScriptCompletionProposalCollector(ISourceModule module) {
		super(module);
	}

	// Label provider
	protected CompletionProposalLabelProvider createLabelProvider() {
		return new JavaScriptCompletionProposalLabelProvider();
	}

	// Invocation context
	protected ScriptContentAssistInvocationContext createScriptContentAssistInvocationContext(
			ISourceModule sourceModule) {
		return new ScriptContentAssistInvocationContext(sourceModule) {
			protected CompletionProposalLabelProvider createLabelProvider() {
				return new JavaScriptCompletionProposalLabelProvider();
			}
		};
	}

	/**
	 * @see org.eclipse.dltk.ui.text.completion.ScriptCompletionProposalCollector#beginReporting()
	 */
	public void beginReporting() {
		super.beginReporting();
		doubleFilter.clear();
	}

	/**
	 * @see org.eclipse.dltk.ui.text.completion.ScriptCompletionProposalCollector#isFiltered(org.eclipse.dltk.core.CompletionProposal)
	 */
	protected boolean isFiltered(CompletionProposal proposal) {
		if (!doubleFilter.add(proposal.getName())) {
			return true;
		}
		return super.isFiltered(proposal);
	}

	// Specific proposals creation. May be use factory?
	protected IScriptCompletionProposal createScriptCompletionProposal(
			CompletionProposal proposal) {
		AbstractScriptCompletionProposal outProposal = (AbstractScriptCompletionProposal) super
				.createScriptCompletionProposal(proposal);
		if (proposal.getExtraInfo() != null) {
			outProposal.setProposalInfo(new JavaScriptProposalInfo(proposal
					.getExtraInfo()));
		}
		return outProposal;
	}

	protected ScriptCompletionProposal createScriptCompletionProposal(
			String completion, int replaceStart, int length, Image image,
			String displayString, int i) {
		JavaScriptCompletionProposal javaScriptCompletionProposal = new JavaScriptCompletionProposal(
				completion, replaceStart, length, image, displayString, i);

		return javaScriptCompletionProposal;
	}

	protected ScriptCompletionProposal createScriptCompletionProposal(
			String completion, int replaceStart, int length, Image image,
			String displayString, int i, boolean isInDoc) {
		JavaScriptCompletionProposal javaScriptCompletionProposal = new JavaScriptCompletionProposal(
				completion, replaceStart, length, image, displayString, i,
				isInDoc);
		return javaScriptCompletionProposal;
	}

	protected ScriptCompletionProposal createOverrideCompletionProposal(
			IScriptProject scriptProject, ISourceModule compilationUnit,
			String name, String[] paramTypes, int start, int length,
			String displayName, String completionProposal) {
		return new JavaScriptOverrideCompletionProposal(scriptProject,
				compilationUnit, name, paramTypes, start, length, displayName,
				completionProposal);
	}

	protected IScriptCompletionProposal createKeywordProposal(
			CompletionProposal proposal) {
		String completion = String.valueOf(proposal.getCompletion());
		int start = proposal.getReplaceStart();
		int length = getLength(proposal);
		String label = getLabelProvider().createSimpleLabel(proposal);
		Image img = getImage(getLabelProvider().createImageDescriptor(proposal));
		int relevance = computeRelevance(proposal);
		return createScriptCompletionProposal(completion, start, length, img,
				label, relevance);
	}
}
