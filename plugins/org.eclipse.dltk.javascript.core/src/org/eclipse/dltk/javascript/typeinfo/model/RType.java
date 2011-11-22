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

import org.eclipse.dltk.javascript.typeinfo.IRType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RType</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.RType#getRuntimeType <em>Runtime Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage#getRType()
 * @model
 * @generated
 */
public interface RType extends JSType {
    /**
     * Returns the value of the '<em><b>Runtime Type</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of the '<em>Runtime Type</em>' attribute isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @return the value of the '<em>Runtime Type</em>' attribute.
     * @see #setRuntimeType(IRType)
     * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage#getRType_RuntimeType()
     * @model dataType="org.eclipse.dltk.javascript.typeinfo.model.IRType" transient="true"
     * @generated
     */
    IRType getRuntimeType();

    /**
     * Sets the value of the '{@link org.eclipse.dltk.javascript.typeinfo.model.RType#getRuntimeType <em>Runtime Type</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @param value the new value of the '<em>Runtime Type</em>' attribute.
     * @see #getRuntimeType()
     * @generated
     */
    void setRuntimeType(IRType value);

} // RType
