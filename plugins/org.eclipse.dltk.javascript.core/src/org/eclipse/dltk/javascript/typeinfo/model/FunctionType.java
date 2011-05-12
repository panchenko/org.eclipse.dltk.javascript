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

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Type</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.FunctionType#getReturnType <em>Return Type</em>}</li>
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.FunctionType#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage#getFunctionType()
 * @model
 * @generated
 */
public interface FunctionType extends JSType {
    /**
     * Returns the value of the '<em><b>Return Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Return Type</em>' reference isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Return Type</em>' containment reference.
     * @see #setReturnType(JSType)
     * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage#getFunctionType_ReturnType()
     * @model containment="true"
     * @generated
     */
    JSType getReturnType();

    /**
     * Sets the value of the '{@link org.eclipse.dltk.javascript.typeinfo.model.FunctionType#getReturnType <em>Return Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Return Type</em>' containment reference.
     * @see #getReturnType()
     * @generated
     */
    void setReturnType(JSType value);

    /**
     * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.dltk.javascript.typeinfo.model.Parameter}.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Parameters</em>' containment reference list.
     * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage#getFunctionType_Parameters()
     * @model containment="true"
     * @generated
     */
    EList<Parameter> getParameters();

} // FunctionType
