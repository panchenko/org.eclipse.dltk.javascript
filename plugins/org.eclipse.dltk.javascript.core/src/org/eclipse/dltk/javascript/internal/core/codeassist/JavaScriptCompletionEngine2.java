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

import java.util.HashSet;
import java.util.Set;

import org.eclipse.dltk.codeassist.ScriptCompletionEngine;
import org.eclipse.dltk.compiler.CharOperation;
import org.eclipse.dltk.compiler.env.IModuleSource;
import org.eclipse.dltk.compiler.env.ModuleSource;
import org.eclipse.dltk.core.CompletionProposal;
import org.eclipse.dltk.core.IAccessRule;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.internal.javascript.ti.IReferenceAttributes;
import org.eclipse.dltk.internal.javascript.ti.IValueCollection;
import org.eclipse.dltk.internal.javascript.ti.IValueParent;
import org.eclipse.dltk.internal.javascript.ti.IValueReference;
import org.eclipse.dltk.internal.javascript.ti.ReferenceKind;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencer2;
import org.eclipse.dltk.internal.javascript.typeinference.CompletionPath;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.core.JavaScriptKeywords;
import org.eclipse.dltk.javascript.internal.core.codeassist.AssitUtils.PositionCalculator;
import org.eclipse.dltk.javascript.parser.JavaScriptParser;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IMethod;
import org.eclipse.dltk.javascript.typeinfo.model.Member;
import org.eclipse.dltk.javascript.typeinfo.model.Method;
import org.eclipse.dltk.javascript.typeinfo.model.Type;

public class JavaScriptCompletionEngine2 extends ScriptCompletionEngine
		implements JSCompletionEngine {

	private boolean useEngine;

	public boolean isUseEngine() {
		return useEngine;
	}

	public void setUseEngine(boolean useEngine) {
		this.useEngine = useEngine;
	}

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
		final Script script = new JavaScriptParser().parse(new ModuleSource(
				content) {
			@Override
			public IModelElement getModelElement() {
				return inferencer2.getModelElement();
			}
		}, null);
		inferencer2.doInferencing(script);
		inferencer2.getCollection();

		String startPart = calculator.getCompletion();
		this.setSourceRange(position - startPart.length(), position);
		// System.out.println(startPart);
		if (calculator.isMember()) {
			doCompletionOnMember(inferencer2.getCollection(), startPart,
					position);
		} else {
			doGlobalCompletion(inferencer2.getCollection(), startPart);
			// doCompletionOnKeyword(startPart);
		}
		this.requestor.endReporting();
	}

	/**
	 * @param collection
	 * @param startPart
	 */
	private void doCompletionOnMember(IValueCollection collection,
			String startPart, int position) {
		CompletionPath path = new CompletionPath(startPart);
		IValueParent item = collection;
		for (int i = 0; i < path.segmentCount() - 1; ++i) {
			if (path.isName(i)) {
				item = item.getChild(path.segment(i));
				if (item == null)
					break;
			} else if (path.isFunction(i)) {
				item = item.getChild(IValueReference.FUNCTION_OP);
				if (item == null)
					break;
			} else {
				assert path.isArray(i);
				// TODO
				item = null;
				break;
			}
			// if (path.isArray(i))
		}
		if (item != null && !path.isEmpty()) {
			final char[] prefix = path.lastSegment().toCharArray();
			this.setSourceRange(position - prefix.length, position);
			final Set<String> processed = new HashSet<String>();
			for (String childName : item.getDirectChildren()) {
				processed.add(childName);
				if (CharOperation.prefixEquals(prefix, childName, false)) {
					IValueReference child = item.getChild(childName);
					if (child != null) {
						reportReference(child, prefix, position);
					}
				}
			}
			if (item instanceof IValueReference) {
				for (Type type : ((IValueReference) item).getTypes()) {
					for (Member member : type.getMembers()) {
						if (processed.add(member.getName())
								&& CharOperation.prefixEquals(prefix, member
										.getName(), false)) {
							reportMember(member, prefix, position);
						}
					}
				}
			}
		}
	}

	/**
	 * @param member
	 * @param position
	 */
	private void reportMember(Member member, char[] prefix, int position) {
		boolean isFunction = member instanceof Method;
		CompletionProposal proposal = CompletionProposal.create(
				isFunction ? CompletionProposal.METHOD_REF
						: CompletionProposal.LOCAL_VARIABLE_REF, position);

		int relevance = computeBaseRelevance();
		// relevance += computeRelevanceForInterestingProposal();
		relevance += computeRelevanceForCaseMatching(prefix, member.getName());
		relevance += computeRelevanceForRestrictions(IAccessRule.K_ACCESSIBLE);
		proposal.setRelevance(relevance);

		proposal.setCompletion(member.getName());
		proposal.setName(member.getName());
		proposal.extraInfo = member;
		proposal.setReplaceRange(this.startPosition - this.offset,
				this.endPosition - this.offset);
		if (isFunction) {
			Method method = (Method) member;
			final int paramCount = method.getParameters().size();
			if (paramCount > 0) {
				final String[] params = new String[paramCount];
				for (int i = 0; i < paramCount; ++i) {
					params[i] = method.getParameters().get(i).getName();
				}
				proposal.setParameterNames(params);
			}
		}
		this.requestor.accept(proposal);
	}

	/**
	 * @param reference
	 */
	private void reportReference(IValueReference reference, char[] prefix,
			int position) {
		boolean isFunction = reference.getKind() == ReferenceKind.FUNCTION
				|| reference.getChild(IValueReference.FUNCTION_OP) != null;
		CompletionProposal proposal = CompletionProposal.create(
				isFunction ? CompletionProposal.METHOD_REF
						: CompletionProposal.LOCAL_VARIABLE_REF, position);

		int relevance = computeBaseRelevance();
		relevance += computeRelevanceForInterestingProposal();
		relevance += computeRelevanceForCaseMatching(prefix, reference
				.getName());
		relevance += computeRelevanceForRestrictions(IAccessRule.K_ACCESSIBLE);
		proposal.setRelevance(relevance);

		proposal.setCompletion(reference.getName());
		proposal.setName(reference.getName());
		proposal.extraInfo = reference;
		proposal.setReplaceRange(this.startPosition - this.offset,
				this.endPosition - this.offset);
		if (isFunction) {
			final IMethod method = (IMethod) reference
					.getAttribute(IReferenceAttributes.PARAMETERS);
			if (method != null) {
				final int paramCount = method.getParameterCount();
				if (paramCount > 0) {
					final String[] params = new String[paramCount];
					for (int i = 0; i < paramCount; ++i) {
						params[i] = method.getParameters().get(i).getName();
					}
					proposal.setParameterNames(params);
				}
			}
		}
		this.requestor.accept(proposal);
		// TODO Auto-generated method stub

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
