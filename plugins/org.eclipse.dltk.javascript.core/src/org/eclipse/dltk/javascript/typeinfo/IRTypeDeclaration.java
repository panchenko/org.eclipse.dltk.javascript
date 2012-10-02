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
package org.eclipse.dltk.javascript.typeinfo;

import java.util.List;

import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeKind;

public interface IRTypeDeclaration extends IRElement {

	IRTypeDeclaration getSuperType();

	List<? extends IRTypeDeclaration> getTraits();

	List<IRMember> getMembers();

	List<IRConstructor> getConstructors();

	IRConstructor getStaticConstructor();

	TypeKind getKind();

	boolean isInheritStaticMembers();

	// override return type
	Type getSource();

	Object getReadOnlyStatus(IRProperty property);

	/**
	 * Answers if this type is generic (possibly not parameterized yet).
	 */
	boolean isGeneric();

	/**
	 * Answers if this type is parameterized.
	 */
	boolean isParameterized();

	/**
	 * Answers type arguments of this parameterized type or empty array if not
	 * this type is not parameterized.
	 */
	List<IRType> getActualTypeArguments();

	TypeCompatibility isAssignableFrom(IRTypeDeclaration declaration);

	IRMethod findMethod(String name, boolean isStatic);

}
