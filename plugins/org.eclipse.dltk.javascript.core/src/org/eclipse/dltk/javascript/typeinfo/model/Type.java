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
 * $Id: Type.java,v 1.1 2010/03/03 13:14:31 apanchenk Exp $
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
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.Type#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.Type#getMembers <em>Members</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage#getType()
 * @model
 * @generated
 */
public interface Type {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage#getType_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.dltk.javascript.typeinfo.model.Type#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Members</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.dltk.javascript.typeinfo.model.Member}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Members</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Members</em>' containment reference list.
	 * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage#getType_Members()
	 * @model containment="true"
	 * @generated
	 */
	EList<Member> getMembers();

} // Type
