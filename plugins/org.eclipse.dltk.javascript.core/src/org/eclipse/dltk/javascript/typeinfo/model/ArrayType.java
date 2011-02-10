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
 * A representation of the model object '<em><b>Array Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.ArrayType#getItemType <em>Item Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage#getArrayType()
 * @model
 * @generated
 */
public interface ArrayType extends JSType {
    /**
     * Returns the value of the '<em><b>Item Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Item Type</em>' containment reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Item Type</em>' containment reference.
     * @see #setItemType(JSType)
     * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage#getArrayType_ItemType()
     * @model containment="true"
     * @generated
     */
    JSType getItemType();

    /**
     * Sets the value of the '{@link org.eclipse.dltk.javascript.typeinfo.model.ArrayType#getItemType <em>Item Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Item Type</em>' containment reference.
     * @see #getItemType()
     * @generated
     */
    void setItemType(JSType value);

} // ArrayType
