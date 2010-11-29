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
 * $Id: Parameter.java,v 1.4 2010/11/29 16:28:05 apanchenk Exp $
 */
package org.eclipse.dltk.javascript.typeinfo.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Parameter</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.Parameter#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.Parameter#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.Parameter#getKind <em>Kind</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage#getParameter()
 * @model
 * @generated
 */
public interface Parameter {
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
     * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage#getParameter_Name()
     * @model
     * @generated
     */
	String getName();

	/**
     * Sets the value of the '{@link org.eclipse.dltk.javascript.typeinfo.model.Parameter#getName <em>Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Name</em>' attribute.
     * @see #getName()
     * @generated
     */
	void setName(String value);

	/**
     * Returns the value of the '<em><b>Type</b></em>' reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Type</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Type</em>' reference.
     * @see #setType(Type)
     * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage#getParameter_Type()
     * @model
     * @generated
     */
	Type getType();

	/**
     * Sets the value of the '{@link org.eclipse.dltk.javascript.typeinfo.model.Parameter#getType <em>Type</em>}' reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Type</em>' reference.
     * @see #getType()
     * @generated
     */
	void setType(Type value);

	/**
     * Returns the value of the '<em><b>Kind</b></em>' attribute.
     * The literals are from the enumeration {@link org.eclipse.dltk.javascript.typeinfo.model.ParameterKind}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Kind</em>' attribute.
     * @see org.eclipse.dltk.javascript.typeinfo.model.ParameterKind
     * @see #setKind(ParameterKind)
     * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage#getParameter_Kind()
     * @model
     * @generated
     */
	ParameterKind getKind();

	/**
     * Sets the value of the '{@link org.eclipse.dltk.javascript.typeinfo.model.Parameter#getKind <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Kind</em>' attribute.
     * @see org.eclipse.dltk.javascript.typeinfo.model.ParameterKind
     * @see #getKind()
     * @generated
     */
	void setKind(ParameterKind value);

} // Parameter
