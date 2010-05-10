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
import org.eclipse.dltk.compiler.util.Util;
import org.eclipse.dltk.core.CompletionProposal;
import org.eclipse.dltk.core.IAccessRule;
import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.internal.javascript.ti.IReferenceAttributes;
import org.eclipse.dltk.internal.javascript.ti.ITypeInferenceContext;
import org.eclipse.dltk.internal.javascript.ti.IValueCollection;
import org.eclipse.dltk.internal.javascript.ti.IValueParent;
import org.eclipse.dltk.internal.javascript.ti.IValueReference;
import org.eclipse.dltk.internal.javascript.ti.PositionReachedException;
import org.eclipse.dltk.internal.javascript.ti.ReferenceKind;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencer2;
import org.eclipse.dltk.internal.javascript.typeinference.CompletionPath;
import org.eclipse.dltk.javascript.ast.Script;
import org.eclipse.dltk.javascript.ast.SimpleType;
import org.eclipse.dltk.javascript.core.JavaScriptKeywords;
import org.eclipse.dltk.javascript.parser.JavaScriptParser;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IMethod;
import org.eclipse.dltk.javascript.typeinfo.model.Element;
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

	public void complete(final IModuleSource cu, int position, int i) {
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
		final TypeInferencer2 inferencer2 = new TypeInferencer2();
		final Script script = new JavaScriptParser().parse(new ModuleSource(
				content) {
			@Override
			public IModelElement getModelElement() {
				return cu.getModelElement();
			}
		}, null);
		final NodeFinder nodeFinder = new NodeFinder(content, position);
		final org.eclipse.dltk.javascript.ast.Type typeNode = nodeFinder
				.locateType(script);
		if (typeNode != null) {
			String typePrefix = Util.EMPTY_STRING;
			if (typeNode instanceof SimpleType) {
				typePrefix = typeNode.getName();
				if (nodeFinder.end >= typeNode.sourceStart()
						&& nodeFinder.end < typeNode.sourceEnd()) {
					typePrefix = typePrefix.substring(0, nodeFinder.end
							- typeNode.sourceStart());
				}
			}
			doCompletionOnType(inferencer2, typePrefix, position);
		} else {
			final PositionCalculator calculator = new PositionCalculator(
					content, position, false);
			final CompletionVisitor visitor = new CompletionVisitor(
					inferencer2, position);
			inferencer2.setVisitor(visitor);
			if (cu instanceof org.eclipse.dltk.core.ISourceModule) {
				inferencer2
						.setModelElement((org.eclipse.dltk.core.ISourceModule) cu);
			}
			try {
				inferencer2.doInferencing(script);
			} catch (PositionReachedException e) {
				// e.printStackTrace();
			}

			if (calculator.isMember()) {
				doCompletionOnMember(inferencer2, visitor.getCollection(),
						calculator.getCompletion(), position);
			} else {
				doGlobalCompletion(inferencer2, visitor.getCollection(),
						calculator.getCompletion(), position);
			}
		}
		this.requestor.endReporting();
	}

	private void doCompletionOnType(ITypeInferenceContext context,
			String typeNamePrefix, int position) {
		Set<String> typeNames = context.listTypes(typeNamePrefix);
		final Reporter reporter = new Reporter(typeNamePrefix, position);
		for (String typeName : typeNames) {
			final Type type = context.getType(typeName);
			if (type != null && type.isVisible()) {
				reporter.reportTypeRef(type);
			}
		}
	}

	private static boolean exists(IValueParent item) {
		if (item instanceof IValueReference) {
			return ((IValueReference) item).exists();
		} else {
			return true;
		}
	}

	/**
	 * @param context
	 * @param collection
	 * @param startPart
	 */
	private void doCompletionOnMember(ITypeInferenceContext context,
			IValueCollection collection, String startPart, int position) {
		CompletionPath path = new CompletionPath(startPart);
		IValueParent item = collection;
		for (int i = 0; i < path.segmentCount() - 1; ++i) {
			if (path.isName(i)) {
				final String segment = path.segment(i);
				if ("this".equals(segment) && item instanceof IValueCollection) {
					item = ((IValueCollection) item).getThis();
				} else {
					item = item.getChild(segment);
				}
				if (!exists(item))
					break;
			} else if (path.isFunction(i)) {
				item = item.getChild(IValueReference.FUNCTION_OP);
				if (!exists(item))
					break;
			} else {
				assert path.isArray(i);
				item = item.getChild(IValueReference.ARRAY_OP);
				if (!exists(item))
					break;
			}
		}
		if (item != null && exists(item) && !path.isEmpty()) {
			final Reporter reporter = new Reporter(path.lastSegment(), position);
			reporter.report(item);
			if (item instanceof IValueCollection) {
				IValueCollection coll = (IValueCollection) item;
				for (;;) {
					coll = coll.getParent();
					if (coll == null)
						break;
					reporter.report(coll);
				}
				final Set<String> globals = context.listGlobals(path
						.lastSegment());
				for (String global : globals) {
					if (reporter.canReport(global)) {
						Element element = context.resolve(global);
						if (element != null && element.isVisible()) {
							reporter.report(global, element);
						}
					}
				}
			}
		}
	}

	private class Reporter {

		final char[] prefix;
		final int position;
		final Set<String> processed = new HashSet<String>();
		final Set<Type> processedTypes = new HashSet<Type>();

		public Reporter(String prefix, int position) {
			this.prefix = prefix.toCharArray();
			this.position = position;
			setSourceRange(position - this.prefix.length, position);
		}

		public void report(String name, Element element) {
			if (element instanceof Member && processed.add(name)) {
				reportMember((Member) element, name);
			}
		}

		public boolean canReport(String name) {
			return CharOperation.prefixEquals(prefix, name, false)
					&& !processed.contains(name);
		}

		public void report(IValueParent item) {
			final Set<String> deleted = item.getDeletedChildren();
			for (String childName : item.getDirectChildren()) {
				if (!deleted.contains(childName)
						&& CharOperation.prefixEquals(prefix, childName, false)
						&& processed.add(childName)) {
					IValueReference child = item.getChild(childName);
					if (child.exists()) {
						reportReference(child, prefix, position);
					}
				}
			}
			if (item instanceof IValueReference) {
				final IValueReference valueRef = (IValueReference) item;
				for (Type type : valueRef.getDeclaredTypes()) {
					reportTypeMembers(type);
				}
				for (Type type : valueRef.getTypes()) {
					reportTypeMembers(type);
				}
			}
		}

		private void reportTypeMembers(Type type) {
			if (processedTypes.add(type)) {
				for (Member member : type.getMembers()) {
					if (member.isVisible()
							&& CharOperation.prefixEquals(prefix, member
									.getName(), false)
							&& processed.add(member.getName())) {
						reportMember(member, member.getName());
					}
				}
			}
		}

		/**
		 * @param member
		 */
		private void reportMember(Member member, String memberName) {
			boolean isFunction = member instanceof Method;
			CompletionProposal proposal = CompletionProposal.create(
					isFunction ? CompletionProposal.METHOD_REF
							: CompletionProposal.FIELD_REF, position);

			int relevance = computeBaseRelevance();
			// relevance += computeRelevanceForInterestingProposal();
			relevance += computeRelevanceForCaseMatching(prefix, memberName);
			relevance += computeRelevanceForRestrictions(IAccessRule.K_ACCESSIBLE);
			proposal.setRelevance(relevance);

			proposal.setCompletion(memberName);
			proposal.setName(memberName);
			proposal.extraInfo = member;
			proposal.setReplaceRange(startPosition - offset, endPosition
					- offset);
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
			requestor.accept(proposal);
		}

		/**
		 * @param reference
		 */
		private void reportReference(IValueReference reference, char[] prefix,
				int position) {
			boolean isFunction = reference.getKind() == ReferenceKind.FUNCTION
					|| reference.getChild(IValueReference.FUNCTION_OP).exists();
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
			proposal.setReplaceRange(startPosition - offset, endPosition
					- offset);
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
			requestor.accept(proposal);
		}

		public void reportTypeRef(Type type) {
			CompletionProposal proposal = CompletionProposal.create(
					CompletionProposal.TYPE_REF, position);
			int relevance = computeBaseRelevance();
			// relevance += computeRelevanceForInterestingProposal();
			relevance += computeRelevanceForCaseMatching(prefix, type.getName());
			relevance += computeRelevanceForRestrictions(IAccessRule.K_ACCESSIBLE);
			proposal.setRelevance(relevance);
			proposal.setCompletion(type.getName());
			proposal.setName(type.getName());
			proposal.extraInfo = type;
			proposal.setReplaceRange(startPosition - offset, endPosition
					- offset);
			requestor.accept(proposal);
		}

	}

	/**
	 * @param context
	 * @param collection
	 * @param startPart
	 * @param position
	 */
	private void doGlobalCompletion(ITypeInferenceContext context,
			IValueCollection collection, String startPart, int position) {
		doCompletionOnMember(context, collection, startPart, position);
		// final char[] prefix = startPart.toCharArray();
		// for (String childName : collection.getDirectChildren()) {
		// if (CharOperation.prefixEquals(prefix, childName, false)) {
		// IValueReference child = collection.getChild(childName);
		// if (child == null)
		// continue;
		// if (child.getKind() == ReferenceKind.LOCAL) {
		// // reportLocalVar(child);
		//
		// } else if (child.getKind() == ReferenceKind.FUNCTION
		// || child.getChild(IValueReference.FUNCTION_OP) != null) {
		// // reportMethodRef(child);
		// }
		//
		// }
		// }
		if (useEngine) {
			doCompletionOnKeyword(startPart, position);
		}
		// TODO Auto-generated method stub

	}

	private void doCompletionOnKeyword(String startPart, int position) {
		setSourceRange(position - startPart.length(), position);
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
