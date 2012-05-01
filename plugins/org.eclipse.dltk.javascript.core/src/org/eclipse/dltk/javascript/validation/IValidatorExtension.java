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
package org.eclipse.dltk.javascript.validation;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.compiler.problem.IValidationStatus;
import org.eclipse.dltk.javascript.ast.Expression;
import org.eclipse.dltk.javascript.typeinference.IValueCollection;
import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinfo.IRMember;
import org.eclipse.dltk.javascript.typeinfo.model.Member;
import org.eclipse.dltk.javascript.typeinfo.model.Type;

/**
 * Instances of this interface could be created with
 * {@link org.eclipse.dltk.javascript.typeinfo.ITypeInferenceExtensionFactory}
 */
public interface IValidatorExtension {

	IValidationStatus canInstantiate(Type type, IValueReference typeReference);

	boolean canValidateUnusedVariable(IValueCollection collection,
			IValueReference reference);

	IValidationStatus validateAccessibility(ASTNode node, Member member);

	IValidationStatus validateAccessibility(Expression expression,
			IValueReference reference);

	IValidationStatus validateAccessibility(Expression expression,
			IValueReference reference, IRMember member);

}
