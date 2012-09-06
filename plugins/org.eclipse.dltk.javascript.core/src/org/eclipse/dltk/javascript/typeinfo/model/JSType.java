/**
 * Copyright (c) 2011 xored software, Inc.
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Alex Panchenko)
 */
package org.eclipse.dltk.javascript.typeinfo.model;

import org.eclipse.dltk.javascript.typeinfo.IRType;
import org.eclipse.dltk.javascript.typeinfo.ITypeSystem;
import org.eclipse.emf.ecore.EObject;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>JS Type</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage#getJSType()
 * @model interface="true" abstract="true"
 * @generated
 */
public interface JSType extends EObject {

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @model kind="operation"
     * @generated
     */
    String getName();

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * Creates the corresponding {@link IRType} instance for this type expression.
     * <!-- end-model-doc -->
     * @model dataType="org.eclipse.dltk.javascript.typeinfo.model.IRType" typeSystemDataType="org.eclipse.dltk.javascript.typeinfo.model.ITypeSystem"
     * @generated
     */
    IRType toRType(ITypeSystem typeSystem);

} // JSType
