/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.javascript.internal.ui.text.completion;

import org.eclipse.dltk.core.CompletionProposal;
import org.eclipse.dltk.core.IScriptProject;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.javascript.core.JavaScriptNature;
import org.eclipse.dltk.javascript.typeinfo.model.Method;
import org.eclipse.dltk.javascript.typeinfo.model.Parameter;
import org.eclipse.dltk.ui.text.completion.AbstractScriptCompletionProposal;
import org.eclipse.dltk.ui.text.completion.IScriptCompletionProposal;
import org.eclipse.dltk.ui.text.completion.ProposalContextInformation;
import org.eclipse.dltk.ui.text.completion.ScriptCompletionProposal;
import org.eclipse.dltk.ui.text.completion.ScriptCompletionProposalCollector;
import org.eclipse.emf.common.util.EList;
import org.eclipse.swt.graphics.Image;

public class JavaScriptCompletionProposalCollector extends
		ScriptCompletionProposalCollector {

	protected final static char[] VAR_TRIGGER = new char[] { '\t', ' ', '=',
			';', '.' };

	// private final HashSet doubleFilter = new HashSet();

	@Override
	protected char[] getVarTrigger() {
		return VAR_TRIGGER;
	}

	public JavaScriptCompletionProposalCollector(ISourceModule module) {
		super(module);
	}

	/**
	 * @see org.eclipse.dltk.ui.text.completion.ScriptCompletionProposalCollector#beginReporting()
	 */
	@Override
	public void beginReporting() {
		super.beginReporting();
		// doubleFilter.clear();
	}

	/**
	 * @see org.eclipse.dltk.ui.text.completion.ScriptCompletionProposalCollector#isFiltered(org.eclipse.dltk.core.CompletionProposal)
	 */
	@Override
	protected boolean isFiltered(CompletionProposal proposal) {
		// if (!doubleFilter.add(proposal.getName())) {
		// return true;
		// }
		return super.isFiltered(proposal);
	}

	// Specific proposals creation. May be use factory?
	@Override
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

	@Override
	protected IScriptCompletionProposal createMethodReferenceProposal(
			CompletionProposal methodProposal) {
		AbstractScriptCompletionProposal methodReferenceProposal = (AbstractScriptCompletionProposal) super
				.createMethodReferenceProposal(methodProposal);
		if (methodProposal.getExtraInfo() instanceof Method) {
			methodReferenceProposal
					.setContextInformation(new ProposalContextInformation(
							methodProposal) {
						@Override
						protected String createParametersList(
								CompletionProposal proposal) {
							Method method = (Method) proposal.getExtraInfo();
							EList<Parameter> parameters = method
									.getParameters();
							StringBuilder sb = new StringBuilder();
							for (Parameter parameter : parameters) {
								if (sb.length() > 0)
									sb.append(',');
								sb.append(parameter.getName());
								if (parameter.getType() != null) {
									sb.append(':');
									sb.append(parameter.getType().getName());
								}

							}
							return sb.toString();
						}
					});
		}
		return methodReferenceProposal;
	}

	@Override
	protected ScriptCompletionProposal createScriptCompletionProposal(
			String completion, int replaceStart, int length, Image image,
			String displayString, int i) {
		JavaScriptCompletionProposal javaScriptCompletionProposal = new JavaScriptCompletionProposal(
				completion, replaceStart, length, image, displayString, i);

		return javaScriptCompletionProposal;
	}

	@Override
	protected ScriptCompletionProposal createScriptCompletionProposal(
			String completion, int replaceStart, int length, Image image,
			String displayString, int i, boolean isInDoc) {
		JavaScriptCompletionProposal javaScriptCompletionProposal = new JavaScriptCompletionProposal(
				completion, replaceStart, length, image, displayString, i,
				isInDoc);
		return javaScriptCompletionProposal;
	}

	@Override
	protected ScriptCompletionProposal createOverrideCompletionProposal(
			IScriptProject scriptProject, ISourceModule compilationUnit,
			String name, String[] paramTypes, int start, int length,
			String displayName, String completionProposal) {
		return new JavaScriptOverrideCompletionProposal(scriptProject,
				compilationUnit, name, paramTypes, start, length, displayName,
				completionProposal);
	}

	@Override
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

	@Override
	protected String getNatureId() {
		return JavaScriptNature.NATURE_ID;
	}
}
