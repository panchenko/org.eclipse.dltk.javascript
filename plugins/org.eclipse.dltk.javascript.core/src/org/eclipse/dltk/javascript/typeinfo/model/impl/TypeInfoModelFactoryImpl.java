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
 * $Id: TypeInfoModelFactoryImpl.java,v 1.21 2012/04/23 06:18:12 apanchenk Exp $
 */
package org.eclipse.dltk.javascript.typeinfo.model.impl;

import java.util.Map;

import org.eclipse.dltk.javascript.typeinfo.model.*;
import org.eclipse.dltk.javascript.typeinfo.model.AnyType;
import org.eclipse.dltk.javascript.typeinfo.model.ArrayType;
import org.eclipse.dltk.javascript.typeinfo.model.ClassType;
import org.eclipse.dltk.javascript.typeinfo.model.Constructor;
import org.eclipse.dltk.javascript.typeinfo.model.FunctionType;
import org.eclipse.dltk.javascript.typeinfo.model.ParameterizedType;
import org.eclipse.dltk.javascript.typeinfo.model.MapType;
import org.eclipse.dltk.javascript.typeinfo.model.Method;
import org.eclipse.dltk.javascript.typeinfo.model.Parameter;
import org.eclipse.dltk.javascript.typeinfo.model.ParameterKind;
import org.eclipse.dltk.javascript.typeinfo.model.Property;
import org.eclipse.dltk.javascript.typeinfo.model.RecordProperty;
import org.eclipse.dltk.javascript.typeinfo.model.RecordType;
import org.eclipse.dltk.javascript.typeinfo.model.SimpleType;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeAlias;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelFactory;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage;
import org.eclipse.dltk.javascript.typeinfo.model.TypeKind;
import org.eclipse.dltk.javascript.typeinfo.model.UndefinedType;
import org.eclipse.dltk.javascript.typeinfo.model.UnionType;
import org.eclipse.dltk.javascript.typeinfo.model.Visibility;
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
            case TypeInfoModelPackage.TYPE: return createType();
            case TypeInfoModelPackage.TYPE_ALIAS: return createTypeAlias();
            case TypeInfoModelPackage.METHOD: return createMethod();
            case TypeInfoModelPackage.PARAMETER: return createParameter();
            case TypeInfoModelPackage.CONSTRUCTOR: return createConstructor();
            case TypeInfoModelPackage.PROPERTY: return createProperty();
            case TypeInfoModelPackage.ATTRIBUTE_ENTRY: return (EObject)createAttributeEntry();
            case TypeInfoModelPackage.FUNCTION_TYPE: return createFunctionType();
            case TypeInfoModelPackage.SIMPLE_TYPE: return createSimpleType();
            case TypeInfoModelPackage.ARRAY_TYPE: return createArrayType();
            case TypeInfoModelPackage.ANY_TYPE: return createAnyType();
            case TypeInfoModelPackage.UNION_TYPE: return createUnionType();
            case TypeInfoModelPackage.PARAMETERIZED_TYPE: return createParameterizedType();
            case TypeInfoModelPackage.MAP_TYPE: return createMapType();
            case TypeInfoModelPackage.RECORD_TYPE: return createRecordType();
            case TypeInfoModelPackage.RECORD_PROPERTY: return createRecordProperty();
            case TypeInfoModelPackage.CLASS_TYPE: return createClassType();
            case TypeInfoModelPackage.UNDEFINED_TYPE: return createUndefinedType();
            case TypeInfoModelPackage.TYPE_VARIABLE: return createTypeVariable();
            case TypeInfoModelPackage.GENERIC_TYPE: return createGenericType();
            case TypeInfoModelPackage.TYPE_VARIABLE_REFERENCE: return createTypeVariableReference();
            case TypeInfoModelPackage.RTYPE: return createRType();
            case TypeInfoModelPackage.GENERIC_METHOD: return createGenericMethod();
            case TypeInfoModelPackage.TYPE_LITERAL: return createTypeLiteral();
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
            case TypeInfoModelPackage.VISIBILITY:
                return createVisibilityFromString(eDataType, initialValue);
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
            case TypeInfoModelPackage.VISIBILITY:
                return convertVisibilityToString(eDataType, instanceValue);
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
    public FunctionType createFunctionType() {
        FunctionTypeImpl functionType = new FunctionTypeImpl();
        return functionType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public SimpleType createSimpleType() {
        SimpleTypeImpl simpleType = new SimpleTypeImpl();
        return simpleType;
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
    public ParameterizedType createParameterizedType() {
        ParameterizedTypeImpl parameterizedType = new ParameterizedTypeImpl();
        return parameterizedType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GenericType createGenericType() {
        GenericTypeImpl genericType = new GenericTypeImpl();
        return genericType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeVariableReference createTypeVariableReference() {
        TypeVariableReferenceImpl typeVariableReference = new TypeVariableReferenceImpl();
        return typeVariableReference;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RType createRType() {
        RTypeImpl rType = new RTypeImpl();
        return rType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public GenericMethod createGenericMethod() {
        GenericMethodImpl genericMethod = new GenericMethodImpl();
        return genericMethod;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeLiteral createTypeLiteral() {
        TypeLiteralImpl typeLiteral = new TypeLiteralImpl();
        return typeLiteral;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public MapType createMapType() {
        MapTypeImpl mapType = new MapTypeImpl();
        return mapType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RecordType createRecordType() {
        RecordTypeImpl recordType = new RecordTypeImpl();
        return recordType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public RecordProperty createRecordProperty() {
        RecordPropertyImpl recordProperty = new RecordPropertyImpl();
        return recordProperty;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public ClassType createClassType() {
        ClassTypeImpl classType = new ClassTypeImpl();
        return classType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public UndefinedType createUndefinedType() {
        UndefinedTypeImpl undefinedType = new UndefinedTypeImpl();
        return undefinedType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public TypeVariable createTypeVariable() {
        TypeVariableImpl typeVariable = new TypeVariableImpl();
        return typeVariable;
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
    public Visibility createVisibilityFromString(EDataType eDataType, String initialValue) {
        Visibility result = Visibility.get(initialValue);
        if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'"); //$NON-NLS-1$ //$NON-NLS-2$ //$NON-NLS-3$
        return result;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String convertVisibilityToString(EDataType eDataType, Object instanceValue) {
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
