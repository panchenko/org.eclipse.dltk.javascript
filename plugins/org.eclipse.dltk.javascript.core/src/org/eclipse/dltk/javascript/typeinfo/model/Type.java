/**
 * Copyright (c) 2010 xored software, Inc.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Alex Panchenko)
 *
 * $Id: Type.java,v 1.4 2010/03/11 05:33:55 apanchenk Exp $
 */
package org.eclipse.dltk.javascript.typeinfo.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.Type#getMembers <em>Members</em>}</li>
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.Type#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage#getType()
 * @model
 * @generated
 */
public interface Type extends Element {
	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.dltk.javascript.typeinfo.model.Member}.
	 * It is bidirectional and its opposite is '{@link org.eclipse.dltk.javascript.typeinfo.model.Member#getDeclaringType <em>Declaring Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage#getType_Members()
	 * @see org.eclipse.dltk.javascript.typeinfo.model.Member#getDeclaringType
	 * @model opposite="declaringType" containment="true"
	 * @generated
	 */
	EList<Member> getMembers();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link org.eclipse.dltk.javascript.typeinfo.model.TypeKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.dltk.javascript.typeinfo.model.TypeKind
	 * @see #setKind(TypeKind)
	 * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage#getType_Kind()
	 * @model
	 * @generated
	 */
	TypeKind getKind();

	/**
	 * Sets the value of the '{@link org.eclipse.dltk.javascript.typeinfo.model.Type#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see org.eclipse.dltk.javascript.typeinfo.model.TypeKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(TypeKind value);

} // Type
