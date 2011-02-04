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
 * $Id: Member.java,v 1.8 2011/02/04 06:04:41 apanchenk Exp $
 */
package org.eclipse.dltk.javascript.typeinfo.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.Member#isStatic <em>Static</em>}</li>
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.Member#getDeclaringType <em>Declaring Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage#getMember()
 * @model abstract="true"
 * @generated
 */
public interface Member extends Element, TypedElement {
	/**
     * Returns the value of the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Static</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Static</em>' attribute.
     * @see #setStatic(boolean)
     * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage#getMember_Static()
     * @model
     * @generated
     */
	boolean isStatic();

	/**
     * Sets the value of the '{@link org.eclipse.dltk.javascript.typeinfo.model.Member#isStatic <em>Static</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Static</em>' attribute.
     * @see #isStatic()
     * @generated
     */
	void setStatic(boolean value);

	/**
	 * Returns the value of the '<em><b>Declaring Type</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link org.eclipse.dltk.javascript.typeinfo.model.Type#getMembers <em>Members</em>}'.
	 * <!-- begin-model-doc -->
	 * The type in which this member is declared.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Declaring Type</em>' container reference.
	 * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage#getMember_DeclaringType()
	 * @see org.eclipse.dltk.javascript.typeinfo.model.Type#getMembers
	 * @model opposite="members" transient="false" changeable="false"
	 * @generated
	 */
	Type getDeclaringType();

} // Member
