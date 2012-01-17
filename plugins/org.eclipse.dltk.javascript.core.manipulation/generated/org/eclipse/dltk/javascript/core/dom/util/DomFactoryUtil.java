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
package org.eclipse.dltk.javascript.core.dom.util;

import org.eclipse.dltk.javascript.core.dom.DomFactory;
import org.eclipse.dltk.javascript.core.dom.Expression;
import org.eclipse.dltk.javascript.core.dom.Identifier;
import org.eclipse.dltk.javascript.core.dom.StringLiteral;
import org.eclipse.dltk.javascript.core.dom.VariableReference;

public class DomFactoryUtil {

	public static Identifier createIdentifier(final String name) {
		final Identifier identifier = DomFactory.eINSTANCE.createIdentifier();
		identifier.setName(name);
		return identifier;
	}

	public static VariableReference createVariableReference(
			Identifier identifier) {
		final VariableReference reference = DomFactory.eINSTANCE
				.createVariableReference();
		reference.setVariable(identifier);
		return reference;
	}

	public static Expression createVariableReference(String identifier) {
		return createVariableReference(createIdentifier(identifier));
	}

	public static Expression createStringLiteral(String text) {
		final StringLiteral literal = DomFactory.eINSTANCE
				.createStringLiteral();
		literal.setText(text);
		return literal;
	}

}
