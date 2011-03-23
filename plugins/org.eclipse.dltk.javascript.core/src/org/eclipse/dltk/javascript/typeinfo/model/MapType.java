/**
 * Copyright (c) 2011 NumberFour AG
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     NumberFour AG - initial API and Implementation (Alex Panchenko)
 */
package org.eclipse.dltk.javascript.typeinfo.model;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Map Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.MapType#getKeyType <em>Key Type</em>}</li>
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.MapType#getValueType <em>Value Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage#getMapType()
 * @model
 * @generated
 */
public interface MapType extends JSType {
    /**
     * Returns the value of the '<em><b>Key Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Key Type</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Key Type</em>' containment reference.
     * @see #setKeyType(JSType)
     * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage#getMapType_KeyType()
     * @model containment="true"
     * @generated
     */
    JSType getKeyType();

    /**
     * Sets the value of the '{@link org.eclipse.dltk.javascript.typeinfo.model.MapType#getKeyType <em>Key Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Key Type</em>' containment reference.
     * @see #getKeyType()
     * @generated
     */
    void setKeyType(JSType value);

    /**
     * Returns the value of the '<em><b>Value Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Value Type</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Value Type</em>' containment reference.
     * @see #setValueType(JSType)
     * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage#getMapType_ValueType()
     * @model containment="true"
     * @generated
     */
    JSType getValueType();

    /**
     * Sets the value of the '{@link org.eclipse.dltk.javascript.typeinfo.model.MapType#getValueType <em>Value Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Value Type</em>' containment reference.
     * @see #getValueType()
     * @generated
     */
    void setValueType(JSType value);

} // MapType
