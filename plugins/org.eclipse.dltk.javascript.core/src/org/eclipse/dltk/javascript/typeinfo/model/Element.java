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
 * $Id: Element.java,v 1.3 2010/05/09 08:02:16 apanchenk Exp $
 */
package org.eclipse.dltk.javascript.typeinfo.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.Element#getName <em>Name</em>}</li>
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.Element#isDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.Element#getDescription <em>Description</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element {
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
	 * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage#getElement_Name()
	 * @model id="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link org.eclipse.dltk.javascript.typeinfo.model.Element#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deprecated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Deprecated</em>' attribute.
	 * @see #setDeprecated(boolean)
	 * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage#getElement_Deprecated()
	 * @model
	 * @generated
	 */
	boolean isDeprecated();

	/**
	 * Sets the value of the '{@link org.eclipse.dltk.javascript.typeinfo.model.Element#isDeprecated <em>Deprecated</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Deprecated</em>' attribute.
	 * @see #isDeprecated()
	 * @generated
	 */
	void setDeprecated(boolean value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage#getElement_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link org.eclipse.dltk.javascript.typeinfo.model.Element#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

} // Element
