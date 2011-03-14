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
 * $Id: TypeInfoModelFactoryImpl.java,v 1.9 2011/03/14 09:49:09 apanchenk Exp $
 */
package org.eclipse.dltk.javascript.typeinfo.model.impl;

import java.util.Map;

import org.eclipse.dltk.javascript.typeinfo.model.*;
import org.eclipse.dltk.javascript.typeinfo.model.ArrayType;
import org.eclipse.dltk.javascript.typeinfo.model.Constructor;
import org.eclipse.dltk.javascript.typeinfo.model.Method;
import org.eclipse.dltk.javascript.typeinfo.model.Parameter;
import org.eclipse.dltk.javascript.typeinfo.model.ParameterKind;
import org.eclipse.dltk.javascript.typeinfo.model.Property;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeAlias;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelFactory;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage;
import org.eclipse.dltk.javascript.typeinfo.model.TypeKind;
import org.eclipse.dltk.javascript.typeinfo.model.TypeRef;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypeInfoModelFactoryImpl extends EFactoryImpl implements TypeInfoModelFactory {
	/**
     * Creates the default factory implementation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static TypeInfoModelFactory init() {
        try {
            TypeInfoModelFactory theTypeInfoModelFactory = (TypeInfoModelFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.eclipse.org/dltk/javascript/typeinfo.ecore"); //$NON-NLS-1$ 
            if (theTypeInfoModelFactory != null) {
                return theTypeInfoModelFactory;
            }
        }
        catch (Exception exception) {
            EcorePlugin.INSTANCE.log(exception);
        }
        return new TypeInfoModelFactoryImpl();
    }

	/**
     * Creates an instance of the factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TypeInfoModelFactoryImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public EObject create(EClass eClass) {
        switch (eClass.getClassifierID()) {
            case TypeInfoModelPackage.TYPE: return (EObject)createType();
            case TypeInfoModelPackage.TYPE_ALIAS: return (EObject)createTypeAlias();
            case TypeInfoModelPackage.METHOD: return (EObject)createMethod();
            case TypeInfoModelPackage.PARAMETER: return (EObject)createParameter();
            case TypeInfoModelPackage.CONSTRUCTOR: return (EObject)createConstructor();
            case TypeInfoModelPackage.PROPERTY: return (EObject)createProperty();
            case TypeInfoModelPackage.ATTRIBUTE_ENTRY: return (EObject)createAttributeEntry();
            case TypeInfoModelPackage.TYPE_REF: return (EObject)createTypeRef();
            case TypeInfoModelPackage.ARRAY_TYPE: return (EObject)createArrayType();
            case TypeInfoModelPackage.ANY_TYPE: return (EObject)createAnyType();
            case TypeInfoModelPackage.UNION_TYPE: return (EObject)createUnionType();
            default:
                throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
        switch (eDataType.getClassifierID()) {
            case TypeInfoModelPackage.TYPE_KIND:
                return createTypeKindFromString(eDataType, initialValue);
            case TypeInfoModelPackage.PARAMETER_KIND:
                return createParameterKindFromString(eDataType, initialValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
        switch (eDataType.getClassifierID()) {
            case TypeInfoModelPackage.TYPE_KIND:
                return convertTypeKindToString(eDataType, instanceValue);
            case TypeInfoModelPackage.PARAMETER_KIND:
                return convertParameterKindToString(eDataType, instanceValue);
            default:
                throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier"); //$NON-NLS-1$ //$NON-NLS-2$
        }
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Type createType() {
        TypeImpl type = new TypeImpl();
        return type;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Constructor createConstructor() {
        ConstructorImpl constructor = new ConstructorImpl();
        return constructor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeAlias createTypeAlias() {
        TypeAliasImpl typeAlias = new TypeAliasImpl();
        return typeAlias;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Method createMethod() {
        MethodImpl method = new MethodImpl();
        return method;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Parameter createParameter() {
        ParameterImpl parameter = new ParameterImpl();
        return parameter;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Property createProperty() {
        PropertyImpl property = new PropertyImpl();
        return property;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Map.Entry<String, Object> createAttributeEntry() {
        AttributeEntryImpl attributeEntry = new AttributeEntryImpl();
        return attributeEntry;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeRef createTypeRef() {
        TypeRefImpl typeRef = new TypeRefImpl();
        return typeRef;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ArrayType createArrayType() {
        ArrayTypeImpl arrayType = new ArrayTypeImpl();
        return arrayType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public AnyType createAnyType() {
        AnyTypeImpl anyType = new AnyTypeImpl();
        return anyType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UnionType createUnionType() {
        UnionTypeImpl unionType = new UnionTypeImpl();
        return unionType;
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TypeKind createTypeKindFromString(EDataType eDataType, String initialValue) {
        TypeKind result = TypeKind.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertTypeKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ParameterKind createParameterKindFromString(EDataType eDataType, String initialValue) {
        ParameterKind result = ParameterKind.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String convertParameterKindToString(EDataType eDataType, Object instanceValue) {
        return instanceValue == null ? null : instanceValue.toString();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TypeInfoModelPackage getTypeInfoModelPackage() {
        return (TypeInfoModelPackage)getEPackage();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @deprecated
     * @generated
     */
	@Deprecated
	public static TypeInfoModelPackage getPackage() {
        return TypeInfoModelPackage.eINSTANCE;
    }

} //TypeInfoModelFactoryImpl
