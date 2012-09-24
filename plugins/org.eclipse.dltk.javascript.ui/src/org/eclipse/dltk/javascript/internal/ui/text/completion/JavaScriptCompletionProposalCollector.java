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
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.internal.javascript.ti.IReferenceAttributes;
import org.eclipse.dltk.javascript.core.JavaScriptNature;
import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinfo.IRMethod;
import org.eclipse.dltk.javascript.typeinfo.IRParameter;
import org.eclipse.dltk.javascript.typeinfo.TypeMode;
import org.eclipse.dltk.javascript.typeinfo.model.GenericType;
import org.eclipse.dltk.javascript.typeinfo.model.Method;
import org.eclipse.dltk.javascript.typeinfo.model.Parameter;
import org.eclipse.dltk.javascript.typeinfo.model.ParameterKind;
import org.eclipse.dltk.ui.text.completion.AbstractScriptCompletionProposal;
import org.eclipse.dltk.ui.text.completion.IScriptCompletionProposal;
import org.eclipse.dltk.ui.text.completion.LazyScriptCompletionProposal;
import org.eclipse.dltk.ui.text.completion.ProposalContextInformation;
import org.eclipse.dltk.ui.text.completion.ScriptCompletionProposal;
import org.eclipse.dltk.ui.text.completion.ScriptCompletionProposalCollector;
import org.eclipse.emf.common.util.EList;
import org.eclipse.swt.graphics.Image;

@SuppressWarnings("restriction")
public class JavaScriptCompletionProposalCollector extends
		ScriptCompletionProposalCollector {

	protected final static char[] VAR_TRIGGER = new char[] { '\t', ' ', '=',
			';', '.' };

	@Override
	protected char[] getVarTrigger() {
		return VAR_TRIGGER;
	}

	public JavaScriptCompletionProposalCollector(ISourceModule module) {
		super(module);
	}

	/**
	 * Checks if the specified proposal has ProposalInfo set.
	 * 
	 * @param proposal
	 * @return
	 */
	private boolean hasProposalInfo(AbstractScriptCompletionProposal proposal) {
		if (proposal instanceof LazyScriptCompletionProposal) {
			// lazy objects are supposed to create ProposalInfo on demand.
			return true;
		} else {
			return proposal.getProposalInfo() != null;
		}
	}

	@Override
	protected IScriptCompletionProposal createScriptCompletionProposal(
			CompletionProposal proposal) {
		AbstractScriptCompletionProposal outProposal = (AbstractScriptCompletionProposal) super
				.createScriptCompletionProposal(proposal);
		if (outProposal != null && !hasProposalInfo(outProposal)
				&& proposal.getExtraInfo() != null) {
			outProposal.setProposalInfo(new JavaScriptProposalInfo(proposal
					.getExtraInfo()));
		}
		return outProposal;
	}

	@Override
	protected IScriptCompletionProposal createTypeProposal(
			CompletionProposal typeProposal) {
		if (getAttribute(TypeMode.JSDOC) != null
				&& typeProposal.getExtraInfo() instanceof GenericType) {
			return new GenericTypeCompletionProposal(typeProposal,
					getInvocationContext());
		}
		return super.createTypeProposal(typeProposal);
	}

	@Override
	protected IScriptCompletionProposal createMethodReferenceProposal(
			CompletionProposal methodProposal) {
		AbstractScriptCompletionProposal methodReferenceProposal = (AbstractScriptCompletionProposal) super
				.createMethodReferenceProposal(methodProposal);
		final Object extraInfo = methodProposal.getExtraInfo();
		if (extraInfo != null) {
			methodReferenceProposal.setProposalInfo(new JavaScriptProposalInfo(
					extraInfo));
		}
		StringBuilder sb = null;
		final Integer paramLimit = (Integer) methodProposal
				.getAttribute(ScriptCompletionProposalCollector.ATTR_PARAM_LIMIT);
		if (extraInfo instanceof Method) {
			final Method method = (Method) extraInfo;
			final EList<Parameter> parameters = method.getParameters();
			if (parameters.size() > 0) {
				sb = new StringBuilder();
				int index = 0;
				for (Parameter parameter : parameters) {
					if (sb.length() > 0)
						sb.append(", ");
					if (parameter.getKind() == ParameterKind.OPTIONAL)
						sb.append('[');
					if (parameter.getType() != null) {
						sb.append(parameter.getType().getName());
						if (parameter.getKind() == ParameterKind.VARARGS)
							sb.append("...");
						sb.append(' ');
					}
					sb.append(parameter.getName());
					if (parameter.getKind() == ParameterKind.VARARGS
							&& parameter.getType() == null)
						sb.append("...");
					if (parameter.getKind() == ParameterKind.OPTIONAL)
						sb.append(']');
					if (paramLimit != null && ++index >= paramLimit.intValue())
						break;
				}
			}
		} else if (extraInfo instanceof IValueReference) {
			final IRMethod method = (IRMethod) ((IValueReference) extraInfo)
					.getAttribute(IReferenceAttributes.R_METHOD);
			if (method != null && method.getParameterCount() > 0) {
				sb = new StringBuilder();
				int index = 0;
				for (IRParameter parameter : method.getParameters()) {
					if (sb.length() > 0)
						sb.append(", ");
					if (parameter.isOptional())
						sb.append('[');
					if (parameter.getType() != null) {
						sb.append(parameter.getType().getName());
						if (parameter.isVarargs())
							sb.append("...");
						sb.append(' ');
					}
					sb.append(parameter.getName());
					if (parameter.isVarargs() && parameter.getType() == null)
						sb.append("...");
					if (parameter.isOptional())
						sb.append(']');
					if (paramLimit != null && ++index >= paramLimit.intValue())
						break;
				}
			}
		}
		if (sb != null) {
			final ProposalContextInformation contextInformation = new JavaScriptProposalContextInformation(
					methodProposal, sb.toString());
			final int pos = methodProposal.getCompletion().indexOf('(');
			if (pos >= 0) {
				contextInformation.setContextInformationPosition(methodProposal
						.getReplaceStart() + pos + 1);
				methodReferenceProposal
						.setContextInformation(contextInformation);
			}
		}

		return methodReferenceProposal;
	}

	@Override
	protected IScriptCompletionProposal createFieldProposal(
			CompletionProposal proposal) {
		final IScriptCompletionProposal fieldProposal = super
				.createFieldProposal(proposal);
		if (proposal.getExtraInfo() != null) {
			((AbstractScriptCompletionProposal) fieldProposal)
					.setProposalInfo(new JavaScriptProposalInfo(proposal
							.getExtraInfo()));
		}
		return fieldProposal;
	}

	@Override
	protected ScriptCompletionProposal createScriptCompletionProposal(
			String completion, int replaceStart, int length, Image image,
			String displayString, int i, boolean isInDoc) {
		// PATCH JOHAN, do check for the JSDOC attribute and overwrite the
		// isInDoc boolean if that is set.
		if (getAttribute(TypeMode.JSDOC) instanceof Boolean)
			isInDoc = ((Boolean) getAttribute(TypeMode.JSDOC)).booleanValue();
		JavaScriptCompletionProposal javaScriptCompletionProposal = new JavaScriptCompletionProposal(
				completion, replaceStart, length, image, displayString, i,
				isInDoc);
		return javaScriptCompletionProposal;
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
				label, relevance, false);
	}

	@Override
	protected String getNatureId() {
		return JavaScriptNature.NATURE_ID;
	}

	private static final class JavaScriptProposalContextInformation extends
			ProposalContextInformation {
		private final String informationDisplayString;

		public JavaScriptProposalContextInformation(
				CompletionProposal proposal, String informationDisplayString) {
			super(proposal);
			this.informationDisplayString = informationDisplayString;
		}

		@Override
		public String getInformationDisplayString() {
			return informationDisplayString;
		}
	}

}
