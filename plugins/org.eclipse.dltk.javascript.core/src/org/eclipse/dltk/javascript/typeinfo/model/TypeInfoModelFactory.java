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
 * $Id: TypeInfoModelFactory.java,v 1.13 2011/08/03 08:51:27 apanchenk Exp $
 */
package org.eclipse.dltk.javascript.typeinfo.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage
 * @generated
 */
public interface TypeInfoModelFactory extends EFactory {
	/**
     * The singleton instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	TypeInfoModelFactory eINSTANCE = org.eclipse.dltk.javascript.typeinfo.model.impl.TypeInfoModelFactoryImpl.init();

	/**
     * Returns a new object of class '<em>Type</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Type</em>'.
     * @generated
     */
	Type createType();

	/**
     * Returns a new object of class '<em>Constructor</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Constructor</em>'.
     * @generated
     */
    Constructor createConstructor();

    /**
     * Returns a new object of class '<em>Type Alias</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Type Alias</em>'.
     * @generated
     */
    TypeAlias createTypeAlias();

    /**
     * Returns a new object of class '<em>Method</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Method</em>'.
     * @generated
     */
	Method createMethod();

	/**
     * Returns a new object of class '<em>Parameter</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Parameter</em>'.
     * @generated
     */
	Parameter createParameter();

	/**
     * Returns a new object of class '<em>Property</em>'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return a new object of class '<em>Property</em>'.
     * @generated
     */
	Property createProperty();

	/**
     * Returns a new object of class '<em>Function Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Function Type</em>'.
     * @generated
     */
    FunctionType createFunctionType();

    /**
     * Returns a new object of class '<em>Simple Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Simple Type</em>'.
     * @generated
     */
    SimpleType createSimpleType();

    /**
     * Returns a new object of class '<em>Type Ref</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Type Ref</em>'.
     * @generated
     */
	@Deprecated
    TypeRef createTypeRef();

    /**
     * Returns a new object of class '<em>Array Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Array Type</em>'.
     * @generated
     */
    ArrayType createArrayType();

    /**
     * Returns a new object of class '<em>Any Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Any Type</em>'.
     * @generated
     */
    AnyType createAnyType();

    /**
     * Returns a new object of class '<em>Union Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Union Type</em>'.
     * @generated
     */
    UnionType createUnionType();

    /**
     * Returns a new object of class '<em>Generic Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Generic Type</em>'.
     * @generated
     */
    GenericType createGenericType();

    /**
     * Returns a new object of class '<em>Map Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Map Type</em>'.
     * @generated
     */
    MapType createMapType();

    /**
     * Returns a new object of class '<em>Record Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Record Type</em>'.
     * @generated
     */
    RecordType createRecordType();

    /**
     * Returns a new object of class '<em>Class Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Class Type</em>'.
     * @generated
     */
    ClassType createClassType();

    /**
     * Returns a new object of class '<em>Undefined Type</em>'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return a new object of class '<em>Undefined Type</em>'.
     * @generated
     */
    UndefinedType createUndefinedType();

    /**
     * Returns the package supported by this factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the package supported by this factory.
     * @generated
     */
	TypeInfoModelPackage getTypeInfoModelPackage();

} //TypeInfoModelFactory
