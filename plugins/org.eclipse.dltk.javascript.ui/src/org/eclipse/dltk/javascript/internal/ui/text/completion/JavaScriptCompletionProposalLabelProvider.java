/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.javascript.internal.ui.text.completion;

import java.net.URL;

import org.eclipse.dltk.core.CompletionProposal;
import org.eclipse.dltk.internal.javascript.reference.resolvers.SelfCompletingReference;
import org.eclipse.dltk.javascript.typeinfo.model.Element;
import org.eclipse.dltk.javascript.typeinfo.model.Method;
import org.eclipse.dltk.javascript.typeinfo.model.Property;
import org.eclipse.dltk.javascript.ui.typeinfo.ElementLabelProviderRegistry;
import org.eclipse.dltk.ui.text.completion.CompletionProposalLabelProvider;
import org.eclipse.jface.resource.ImageDescriptor;

public class JavaScriptCompletionProposalLabelProvider extends
		CompletionProposalLabelProvider {

	@Override
	protected String createMethodProposalLabel(CompletionProposal methodProposal) {
		String returnType = null;
		if (methodProposal.getExtraInfo() instanceof SelfCompletingReference) {
			SelfCompletingReference cm = (SelfCompletingReference) methodProposal
					.getExtraInfo();
			// methodProposal.setParameterNames(cm.getParameterNames());
			returnType = cm.getReturnType();
		} else if (methodProposal.getExtraInfo() instanceof Method) {
			Method method = (Method) methodProposal.getExtraInfo();
			if (method.getType() != null) {
				returnType = method.getType().getName();
			}
		}
		StringBuffer nameBuffer = new StringBuffer();

		// method name
		nameBuffer.append(methodProposal.getName());

		// parameters
		nameBuffer.append('(');
		appendParameterList(nameBuffer, methodProposal);
		nameBuffer.append(')');

		if (returnType != null) {
			nameBuffer.append(": ");
			nameBuffer.append(returnType);
		}
		return nameBuffer.toString();
	}

	@Override
	protected String createFieldProposalLabel(CompletionProposal proposal) {
		if (proposal.getExtraInfo() instanceof Property) {
			Property property = (Property) proposal.getExtraInfo();
			// add the type to the label, but only if it is not exactly the same like Constants (MyObject:MyObject)
			if (property.getType() != null
					&& !property.getType().getName()
							.equalsIgnoreCase(proposal.getName())) {
				return proposal.getName() + ": " + property.getType().getName();
			}
		}
		return proposal.getName();
	}

	/**
	 * @see org.eclipse.dltk.ui.text.completion.CompletionProposalLabelProvider#createImageDescriptor(org.eclipse.dltk.core.CompletionProposal)
	 */
	@Override
	public ImageDescriptor createImageDescriptor(CompletionProposal proposal) {
		ImageDescriptor imageDescriptor = extraImageFromProposal(proposal);
		if (imageDescriptor != null)
			return imageDescriptor;
		return super.createImageDescriptor(proposal);
	}

	/**
	 * @param proposal
	 * @return
	 */
	private ImageDescriptor extraImageFromProposal(CompletionProposal proposal) {
		if (proposal.getExtraInfo() instanceof SelfCompletingReference) {
			SelfCompletingReference cm = (SelfCompletingReference) proposal
					.getExtraInfo();
			URL imageUrl = cm.getImageURL();
			if (imageUrl != null)
				return decorateImageDescriptor(
						ImageDescriptor.createFromURL(imageUrl), proposal);
		} else if (proposal.getExtraInfo() instanceof Element) {
			final ImageDescriptor descriptor = ElementLabelProviderRegistry
					.getImageDescriptor((Element) proposal.getExtraInfo());
			if (descriptor != null) {
				return decorateImageDescriptor(descriptor, proposal);
			}
		}
		return null;
	}

	/**
	 * @see org.eclipse.dltk.ui.text.completion.CompletionProposalLabelProvider#createFieldImageDescriptor(org.eclipse.dltk.core.CompletionProposal)
	 */
	@Override
	protected ImageDescriptor createFieldImageDescriptor(
			CompletionProposal proposal) {
		ImageDescriptor imageDescriptor = extraImageFromProposal(proposal);
		if (imageDescriptor != null)
			return imageDescriptor;
		return super.createFieldImageDescriptor(proposal);
	}

	/**
	 * @see org.eclipse.dltk.ui.text.completion.CompletionProposalLabelProvider#createLocalImageDescriptor(org.eclipse.dltk.core.CompletionProposal)
	 */
	@Override
	protected ImageDescriptor createLocalImageDescriptor(
			CompletionProposal proposal) {
		ImageDescriptor imageDescriptor = extraImageFromProposal(proposal);
		if (imageDescriptor != null)
			return imageDescriptor;
		return super.createLocalImageDescriptor(proposal);
	}

	/**
	 * @see org.eclipse.dltk.ui.text.completion.CompletionProposalLabelProvider#createMethodImageDescriptor(org.eclipse.dltk.core.CompletionProposal)
	 */
	@Override
	public ImageDescriptor createMethodImageDescriptor(
			CompletionProposal proposal) {
		ImageDescriptor imageDescriptor = extraImageFromProposal(proposal);
		if (imageDescriptor != null)
			return imageDescriptor;
		return super.createMethodImageDescriptor(proposal);
	}

	/**
	 * @see org.eclipse.dltk.ui.text.completion.CompletionProposalLabelProvider#createPackageImageDescriptor(org.eclipse.dltk.core.CompletionProposal)
	 */
	@Override
	protected ImageDescriptor createPackageImageDescriptor(
			CompletionProposal proposal) {
		ImageDescriptor imageDescriptor = extraImageFromProposal(proposal);
		if (imageDescriptor != null)
			return imageDescriptor;
		return super.createPackageImageDescriptor(proposal);
	}

	/**
	 * @see org.eclipse.dltk.ui.text.completion.CompletionProposalLabelProvider#createTypeImageDescriptor(org.eclipse.dltk.core.CompletionProposal)
	 */
	@Override
	protected ImageDescriptor createTypeImageDescriptor(
			CompletionProposal proposal) {
		ImageDescriptor imageDescriptor = extraImageFromProposal(proposal);
		if (imageDescriptor != null)
			return imageDescriptor;
		return super.createTypeImageDescriptor(proposal);
	}
}
