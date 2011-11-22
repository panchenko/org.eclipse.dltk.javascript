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
package org.eclipse.dltk.javascript.internal.ui.text.completion;

import java.util.List;

import org.eclipse.dltk.core.CompletionProposal;
import org.eclipse.dltk.javascript.typeinfo.model.GenericType;
import org.eclipse.dltk.javascript.typeinfo.model.TypeVariable;
import org.eclipse.dltk.ui.DLTKUIPlugin;
import org.eclipse.dltk.ui.text.completion.IScriptCompletionProposalExtension2;
import org.eclipse.dltk.ui.text.completion.LazyScriptCompletionProposal;
import org.eclipse.dltk.ui.text.completion.ProposalInfo;
import org.eclipse.dltk.ui.text.completion.ReplacementBuffer;
import org.eclipse.dltk.ui.text.completion.ScriptContentAssistInvocationContext;
import org.eclipse.jface.text.BadLocationException;
import org.eclipse.jface.text.IDocument;
import org.eclipse.jface.text.IRegion;
import org.eclipse.jface.text.Region;
import org.eclipse.jface.text.link.LinkedModeModel;
import org.eclipse.jface.text.link.LinkedModeUI;
import org.eclipse.jface.text.link.LinkedPosition;
import org.eclipse.jface.text.link.LinkedPositionGroup;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.graphics.Point;
import org.eclipse.ui.texteditor.link.EditorLinkedModeUI;

/**
 * @since 4.0
 */
public class GenericTypeCompletionProposal extends LazyScriptCompletionProposal
		implements IScriptCompletionProposalExtension2 {
	/**
	 * Triggers for method proposals. Do not modify.
	 */
	protected final static char[] TYPE_TRIGGERS = new char[] { '<', ' ' };

	private IRegion fSelectedRegion; // initialized by apply()

	public GenericTypeCompletionProposal(CompletionProposal proposal,
			ScriptContentAssistInvocationContext context) {
		super(proposal, context);
	}

	public String getName() {
		return fProposal.getName();
	}

	private ReplacementBuffer replacementBuffer;

	@Override
	public void apply(IDocument document, char trigger, int offset) {
		if (trigger == ' ' || trigger == '<')
			trigger = '\0';
		super.apply(document, trigger, offset);

		int exit = getReplacementOffset() + getReplacementString().length();

		if (replacementBuffer != null && replacementBuffer.hasArguments()
				&& getTextViewer() != null) {
			int baseOffset = getReplacementOffset() + getCursorPosition();
			try {
				LinkedModeModel model = new LinkedModeModel();
				for (IRegion region : replacementBuffer.getArguments()) {
					LinkedPositionGroup group = new LinkedPositionGroup();
					group.addPosition(new LinkedPosition(document, baseOffset
							+ region.getOffset(), region.getLength(),
							LinkedPositionGroup.NO_STOP));
					model.addGroup(group);
				}

				model.forceInstall();

				LinkedModeUI ui = new EditorLinkedModeUI(model, getTextViewer());
				ui.setExitPosition(getTextViewer(), exit, 0, Integer.MAX_VALUE);
				ui.setExitPolicy(new ExitPolicy('>', document));
				ui.setCyclingMode(LinkedModeUI.CYCLE_WHEN_NO_PARENT);
				ui.enter();

				fSelectedRegion = ui.getSelectedRegion();

			} catch (BadLocationException e) {
			}
		} else {
			fSelectedRegion = new Region(exit, 0);
		}
	}

	/**
	 * @see org.eclipse.dltk.ui.text.completion.AbstractScriptCompletionProposal#getSelection(org.eclipse.jface.text.IDocument)
	 */
	@Override
	public Point getSelection(IDocument document) {
		if (fSelectedRegion == null)
			return new Point(getReplacementOffset(), 0);

		return new Point(fSelectedRegion.getOffset(),
				fSelectedRegion.getLength());
	}

	@Override
	public CharSequence getPrefixCompletionText(IDocument document,
			int completionOffset) {
		String completion = String.valueOf(fProposal.getName());
		if (isCamelCaseMatching()) {
			String prefix = getPrefix(document, completionOffset);
			return getCamelCaseCompound(prefix, completion);
		}
		return completion;
	}

	@Override
	protected char[] computeTriggerCharacters() {
		return TYPE_TRIGGERS;
	}

	/**
	 * Override {@link #computeReplacement(IReplacementBuffer)}
	 */
	@Override
	protected final String computeReplacementString() {
		replacementBuffer = new ReplacementBuffer();
		computeReplacement(replacementBuffer);
		return replacementBuffer.toString();
	}

	protected void computeReplacement(ReplacementBuffer buffer) {
		buffer.append(fProposal.getName());
		buffer.append("<");
		setCursorPosition(buffer.length());
		final GenericType genericType = (GenericType) fProposal.getExtraInfo();
		final List<TypeVariable> variables = genericType.getTypeParameters();
		int argumentOffset = 0;
		for (int i = 0; i < variables.size(); ++i) {
			if (i != 0) {
				buffer.append(COMMA);
				argumentOffset += 1;
			}
			buffer.append(variables.get(i).getName());
			buffer.addArgument(argumentOffset, variables.get(i).getName()
					.length());
			argumentOffset += variables.get(i).getName().length();
		}
		buffer.append(">");
	}

	@Override
	protected ProposalInfo computeProposalInfo() {
		return new JavaScriptProposalInfo(fProposal.getExtraInfo());
	}

	@Override
	protected Image computeImage() {
		return DLTKUIPlugin.getImageDescriptorRegistry().get(
				fInvocationContext.getLabelProvider()
						.createTypeImageDescriptor(fProposal));
	}

}
