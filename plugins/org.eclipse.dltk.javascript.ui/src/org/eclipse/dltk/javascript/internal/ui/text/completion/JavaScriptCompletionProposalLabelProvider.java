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
import org.eclipse.dltk.internal.javascript.ti.IReferenceAttributes;
import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinference.ReferenceLocation;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IMethod;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IVariable;
import org.eclipse.dltk.javascript.typeinfo.TypeUtil;
import org.eclipse.dltk.javascript.typeinfo.model.Element;
import org.eclipse.dltk.javascript.typeinfo.model.Member;
import org.eclipse.dltk.javascript.typeinfo.model.Method;
import org.eclipse.dltk.javascript.typeinfo.model.Property;
import org.eclipse.dltk.javascript.ui.typeinfo.ElementLabelProviderRegistry;
import org.eclipse.dltk.javascript.ui.typeinfo.IElementLabelProvider.Mode;
import org.eclipse.dltk.ui.DLTKPluginImages;
import org.eclipse.dltk.ui.ScriptElementImageProvider;
import org.eclipse.dltk.ui.text.completion.CompletionProposalLabelProvider;
import org.eclipse.jface.resource.ImageDescriptor;
import org.eclipse.jface.viewers.DecorationOverlayIcon;
import org.eclipse.jface.viewers.IDecoration;

public class JavaScriptCompletionProposalLabelProvider extends
		CompletionProposalLabelProvider {

	@Override
	public String createTypeProposalLabel(CompletionProposal typeProposal) {
		if (typeProposal.getExtraInfo() instanceof Element) {
			final String label = getElementLabel((Element) typeProposal
					.getExtraInfo());
			if (label != null) {
				return label;
			}
		}
		return super.createTypeProposalLabel(typeProposal);
	}

	private static String getElementLabel(Element element) {
		return ElementLabelProviderRegistry.getLabel(element, Mode.PROPOSAL);
	}

	@Override
	protected String createMethodProposalLabel(CompletionProposal methodProposal) {
		String returnType = null;
		String source = null;
		final Object info = methodProposal.getExtraInfo();
		if (info instanceof SelfCompletingReference) {
			SelfCompletingReference cm = (SelfCompletingReference) info;
			// methodProposal.setParameterNames(cm.getParameterNames());
			returnType = cm.getReturnType();
		} else if (info instanceof Method) {
			final Method method = (Method) info;
			final String label = getElementLabel(method);
			if (label != null) {
				return label;
			}
			if (method.getType() != null) {
				returnType = method.getType().getName();
			}
			if (method.getDeclaringType() != null) {
				source = method.getDeclaringType().getName();
			}
		} else if (info instanceof IValueReference) {
			final IValueReference reference = (IValueReference) info;
			final IValueReference result = reference
					.getChild(IValueReference.FUNCTION_OP);
			if (result != null && result.getDeclaredType() != null) {
				returnType = result.getDeclaredType().getName();
			}
			final ReferenceLocation loc = reference.getLocation();
			if (loc != ReferenceLocation.UNKNOWN
					&& loc.getSourceModule() != null) {
				source = loc.getSourceModule().getPath().toString();
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
		// TODO use different color
		if (source != null) {
			nameBuffer.append(" - ");
			nameBuffer.append(source);
		}
		return nameBuffer.toString();
	}

	@Override
	protected String createFieldProposalLabel(CompletionProposal proposal) {
		if (proposal.getExtraInfo() instanceof Property) {
			final Property property = (Property) proposal.getExtraInfo();
			final String label = getElementLabel(property);
			if (label != null) {
				return label;
			}
			if (TypeUtil.isValueTypeVisible(property.getType())) {
				final StringBuilder sb = new StringBuilder();
				sb.append(proposal.getName());
				sb.append(": ");
				sb.append(property.getType().getName());
				// TODO use different color
				if (TypeUtil.isDeclaringTypeVisible(property)) {
					sb.append(" - ");
					sb.append(property.getDeclaringType().getName());
				}
				return sb.toString();
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
			final Element element = (Element) proposal.getExtraInfo();
			final ImageDescriptor descriptor = ElementLabelProviderRegistry
					.getImageDescriptor(element);
			if (descriptor != null) {
				return decorateImageDescriptor(descriptor, proposal);
			}
			if (element instanceof Member) {
				final int flags = ((Member) element).getVisibility().getFlags();
				if (element instanceof Property) {
					return decorateImageDescriptor(
							ScriptElementImageProvider
									.getFieldImageDescriptor(flags),
							proposal);
				} else if (element instanceof Method) {
					return decorateImageDescriptor(
							ScriptElementImageProvider
									.getMethodImageDescriptor(flags),
							proposal);
				}
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
	public ImageDescriptor createTypeImageDescriptor(CompletionProposal proposal) {
		ImageDescriptor imageDescriptor = extraImageFromProposal(proposal);
		if (imageDescriptor != null)
			return imageDescriptor;
		return super.createTypeImageDescriptor(proposal);
	}

	@Override
	protected ImageDescriptor decorateImageDescriptor(
			ImageDescriptor descriptor, CompletionProposal proposal) {
		if (isDeprecated(proposal)) {
			return new DecorationOverlayIcon(descriptor.createImage(),
					DLTKPluginImages.DESC_OVR_DEPRECATED, IDecoration.UNDERLAY);
		} else if (isStatic(proposal)) {
			return new DecorationOverlayIcon(descriptor.createImage(),
					DLTKPluginImages.DESC_OVR_STATIC, IDecoration.TOP_RIGHT);
		}
		return super.decorateImageDescriptor(descriptor, proposal);
	}

	/**
	 * @param proposal
	 * @return
	 */
	private boolean isStatic(CompletionProposal proposal) {
		if (proposal.getExtraInfo() instanceof Member) {
			return ((Member) proposal.getExtraInfo()).isStatic();
		} else {
			return false;
		}
	}

	private boolean isDeprecated(CompletionProposal proposal) {
		if (proposal.getExtraInfo() instanceof Element) {
			return ((Element) proposal.getExtraInfo()).isDeprecated();
		} else if (proposal.getExtraInfo() instanceof IValueReference) {
			final IValueReference reference = (IValueReference) proposal
					.getExtraInfo();
			final IMethod method = (IMethod) reference
					.getAttribute(IReferenceAttributes.PARAMETERS);
			if (method != null)
				return method.isDeprecated();
			final IVariable variable = (IVariable) reference
					.getAttribute(IReferenceAttributes.VARIABLE);
			return variable != null && variable.isDeprecated();
		}
		return false;
	}
}
