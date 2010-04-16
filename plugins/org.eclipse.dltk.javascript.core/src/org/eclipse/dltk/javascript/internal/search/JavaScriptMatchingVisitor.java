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
package org.eclipse.dltk.javascript.internal.search;

import org.eclipse.dltk.core.search.matching2.MatchingCollector;
import org.eclipse.dltk.internal.javascript.ti.GetMode;
import org.eclipse.dltk.internal.javascript.ti.ITypeInferenceContext;
import org.eclipse.dltk.internal.javascript.ti.IValueCollection;
import org.eclipse.dltk.internal.javascript.ti.IValueReference;
import org.eclipse.dltk.internal.javascript.ti.TypeInferencerVisitor;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.ast.VariableDeclaration;

public class JavaScriptMatchingVisitor extends TypeInferencerVisitor {

	private final MatchingCollector<MatchingNode> locator;

	/**
	 * @param context
	 */
	public JavaScriptMatchingVisitor(ITypeInferenceContext context,
			MatchingCollector<MatchingNode> locator) {
		super(context);
		this.locator = locator;
	}

	@Override
	public IValueReference visitIdentifier(Identifier node) {
		final IValueReference result = peekContext().getChild(node.getName(),
				GetMode.CREATE_LAZY);
		locator.report(new FieldReferenceNode(node));
		return result;
	}

	@Override
	protected IValueReference createVariable(IValueCollection context,
			VariableDeclaration declaration) {
		final IValueReference result = super.createVariable(context,
				declaration);
		locator.report(new FieldDeclarationNode(declaration.getIdentifier()));
		return result;
	}

	// private <E extends Element> E extractElement(IValueParent reference,
	// Class<E> elementType) {
	// if (reference instanceof IValueReference) {
	// return extractElement((IValueReference) reference, elementType);
	// } else {
	// return null;
	// }
	// }

	// /**
	// * @param reference
	// * @param elementType
	// * @return
	// */
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
