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
 * $Id: TypeInfoModelSwitch.java,v 1.19 2012/04/09 13:54:27 apanchenk Exp $
 */
package org.eclipse.dltk.javascript.typeinfo.model.util;

import java.util.List;
import java.util.Map;

import org.eclipse.dltk.javascript.typeinfo.model.*;
import org.eclipse.dltk.javascript.typeinfo.model.AnyType;
import org.eclipse.dltk.javascript.typeinfo.model.ArrayType;
import org.eclipse.dltk.javascript.typeinfo.model.ClassType;
import org.eclipse.dltk.javascript.typeinfo.model.Constructor;
import org.eclipse.dltk.javascript.typeinfo.model.Element;
import org.eclipse.dltk.javascript.typeinfo.model.FunctionType;
import org.eclipse.dltk.javascript.typeinfo.model.GenericType;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;
import org.eclipse.dltk.javascript.typeinfo.model.MapType;
import org.eclipse.dltk.javascript.typeinfo.model.Member;
import org.eclipse.dltk.javascript.typeinfo.model.Method;
import org.eclipse.dltk.javascript.typeinfo.model.NamedElement;
import org.eclipse.dltk.javascript.typeinfo.model.Parameter;
import org.eclipse.dltk.javascript.typeinfo.model.ParameterizedType;
import org.eclipse.dltk.javascript.typeinfo.model.Property;
import org.eclipse.dltk.javascript.typeinfo.model.RecordMember;
import org.eclipse.dltk.javascript.typeinfo.model.RecordProperty;
import org.eclipse.dltk.javascript.typeinfo.model.RecordType;
import org.eclipse.dltk.javascript.typeinfo.model.SimpleType;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeAlias;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage;
import org.eclipse.dltk.javascript.typeinfo.model.TypeVariable;
import org.eclipse.dltk.javascript.typeinfo.model.TypeVariableReference;
import org.eclipse.dltk.javascript.typeinfo.model.TypedElement;
import org.eclipse.dltk.javascript.typeinfo.model.UndefinedType;
import org.eclipse.dltk.javascript.typeinfo.model.UnionType;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage
 * @generated
 */
public class TypeInfoModelSwitch<T> {
	/**
     * The cached model package
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static TypeInfoModelPackage modelPackage;

	/**
     * Creates an instance of the switch.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TypeInfoModelSwitch() {
        if (modelPackage == null) {
            modelPackage = TypeInfoModelPackage.eINSTANCE;
        }
    }

	/**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    public T doSwitch(EObject theEObject) {
        return doSwitch(theEObject.eClass(), theEObject);
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(EClass theEClass, EObject theEObject) {
        if (theEClass.eContainer() == modelPackage) {
            return doSwitch(theEClass.getClassifierID(), theEObject);
        }
        else {
            List<EClass> eSuperTypes = theEClass.getESuperTypes();
            return
                eSuperTypes.isEmpty() ?
                    defaultCase(theEObject) :
                    doSwitch(eSuperTypes.get(0), theEObject);
        }
    }

    /**
     * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the first non-null result returned by a <code>caseXXX</code> call.
     * @generated
     */
    protected T doSwitch(int classifierID, EObject theEObject) {
        switch (classifierID) {
            case TypeInfoModelPackage.NAMED_ELEMENT: {
                NamedElement namedElement = (NamedElement)theEObject;
                T result = caseNamedElement(namedElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypeInfoModelPackage.TYPED_ELEMENT: {
                TypedElement typedElement = (TypedElement)theEObject;
                T result = caseTypedElement(typedElement);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypeInfoModelPackage.ELEMENT: {
                Element element = (Element)theEObject;
                T result = caseElement(element);
                if (result == null) result = caseNamedElement(element);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypeInfoModelPackage.TYPE: {
                Type type = (Type)theEObject;
                T result = caseType(type);
                if (result == null) result = caseElement(type);
                if (result == null) result = caseNamedElement(type);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypeInfoModelPackage.TYPE_ALIAS: {
                TypeAlias typeAlias = (TypeAlias)theEObject;
                T result = caseTypeAlias(typeAlias);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypeInfoModelPackage.MEMBER: {
                Member member = (Member)theEObject;
                T result = caseMember(member);
                if (result == null) result = caseElement(member);
                if (result == null) result = caseTypedElement(member);
                if (result == null) result = caseNamedElement(member);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypeInfoModelPackage.METHOD: {
                Method method = (Method)theEObject;
                T result = caseMethod(method);
                if (result == null) result = caseMember(method);
                if (result == null) result = caseElement(method);
                if (result == null) result = caseTypedElement(method);
                if (result == null) result = caseNamedElement(method);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypeInfoModelPackage.PARAMETER: {
                Parameter parameter = (Parameter)theEObject;
                T result = caseParameter(parameter);
                if (result == null) result = caseNamedElement(parameter);
                if (result == null) result = caseTypedElement(parameter);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypeInfoModelPackage.CONSTRUCTOR: {
                Constructor constructor = (Constructor)theEObject;
                T result = caseConstructor(constructor);
                if (result == null) result = caseMethod(constructor);
                if (result == null) result = caseMember(constructor);
                if (result == null) result = caseElement(constructor);
                if (result == null) result = caseTypedElement(constructor);
                if (result == null) result = caseNamedElement(constructor);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypeInfoModelPackage.PROPERTY: {
                Property property = (Property)theEObject;
                T result = caseProperty(property);
                if (result == null) result = caseMember(property);
                if (result == null) result = caseElement(property);
                if (result == null) result = caseTypedElement(property);
                if (result == null) result = caseNamedElement(property);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypeInfoModelPackage.ATTRIBUTE_ENTRY: {
                @SuppressWarnings("unchecked") Map.Entry<String, Object> attributeEntry = (Map.Entry<String, Object>)theEObject;
                T result = caseAttributeEntry(attributeEntry);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypeInfoModelPackage.JS_TYPE: {
                JSType jsType = (JSType)theEObject;
                T result = caseJSType(jsType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypeInfoModelPackage.FUNCTION_TYPE: {
                FunctionType functionType = (FunctionType)theEObject;
                T result = caseFunctionType(functionType);
                if (result == null) result = caseJSType(functionType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypeInfoModelPackage.SIMPLE_TYPE: {
                SimpleType simpleType = (SimpleType)theEObject;
                T result = caseSimpleType(simpleType);
                if (result == null) result = caseJSType(simpleType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypeInfoModelPackage.ARRAY_TYPE: {
                ArrayType arrayType = (ArrayType)theEObject;
                T result = caseArrayType(arrayType);
                if (result == null) result = caseJSType(arrayType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypeInfoModelPackage.ANY_TYPE: {
                AnyType anyType = (AnyType)theEObject;
                T result = caseAnyType(anyType);
                if (result == null) result = caseJSType(anyType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypeInfoModelPackage.UNION_TYPE: {
                UnionType unionType = (UnionType)theEObject;
                T result = caseUnionType(unionType);
                if (result == null) result = caseJSType(unionType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypeInfoModelPackage.PARAMETERIZED_TYPE: {
                ParameterizedType parameterizedType = (ParameterizedType)theEObject;
                T result = caseParameterizedType(parameterizedType);
                if (result == null) result = caseSimpleType(parameterizedType);
                if (result == null) result = caseJSType(parameterizedType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypeInfoModelPackage.MAP_TYPE: {
                MapType mapType = (MapType)theEObject;
                T result = caseMapType(mapType);
                if (result == null) result = caseJSType(mapType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypeInfoModelPackage.RECORD_TYPE: {
                RecordType recordType = (RecordType)theEObject;
                T result = caseRecordType(recordType);
                if (result == null) result = caseJSType(recordType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypeInfoModelPackage.RECORD_MEMBER: {
                RecordMember recordMember = (RecordMember)theEObject;
                T result = caseRecordMember(recordMember);
                if (result == null) result = caseMember(recordMember);
                if (result == null) result = caseElement(recordMember);
                if (result == null) result = caseTypedElement(recordMember);
                if (result == null) result = caseNamedElement(recordMember);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypeInfoModelPackage.RECORD_PROPERTY: {
                RecordProperty recordProperty = (RecordProperty)theEObject;
                T result = caseRecordProperty(recordProperty);
                if (result == null) result = caseProperty(recordProperty);
                if (result == null) result = caseRecordMember(recordProperty);
                if (result == null) result = caseMember(recordProperty);
                if (result == null) result = caseElement(recordProperty);
                if (result == null) result = caseTypedElement(recordProperty);
                if (result == null) result = caseNamedElement(recordProperty);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypeInfoModelPackage.CLASS_TYPE: {
                ClassType classType = (ClassType)theEObject;
                T result = caseClassType(classType);
                if (result == null) result = caseJSType(classType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypeInfoModelPackage.UNDEFINED_TYPE: {
                UndefinedType undefinedType = (UndefinedType)theEObject;
                T result = caseUndefinedType(undefinedType);
                if (result == null) result = caseJSType(undefinedType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypeInfoModelPackage.TYPE_VARIABLE: {
                TypeVariable typeVariable = (TypeVariable)theEObject;
                T result = caseTypeVariable(typeVariable);
                if (result == null) result = caseNamedElement(typeVariable);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypeInfoModelPackage.GENERIC_TYPE: {
                GenericType genericType = (GenericType)theEObject;
                T result = caseGenericType(genericType);
                if (result == null) result = caseType(genericType);
                if (result == null) result = caseElement(genericType);
                if (result == null) result = caseNamedElement(genericType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypeInfoModelPackage.TYPE_VARIABLE_REFERENCE: {
                TypeVariableReference typeVariableReference = (TypeVariableReference)theEObject;
                T result = caseTypeVariableReference(typeVariableReference);
                if (result == null) result = caseJSType(typeVariableReference);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypeInfoModelPackage.RTYPE: {
                RType rType = (RType)theEObject;
                T result = caseRType(rType);
                if (result == null) result = caseJSType(rType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypeInfoModelPackage.GENERIC_METHOD: {
                GenericMethod genericMethod = (GenericMethod)theEObject;
                T result = caseGenericMethod(genericMethod);
                if (result == null) result = caseMethod(genericMethod);
                if (result == null) result = caseMember(genericMethod);
                if (result == null) result = caseElement(genericMethod);
                if (result == null) result = caseTypedElement(genericMethod);
                if (result == null) result = caseNamedElement(genericMethod);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            case TypeInfoModelPackage.JS_CUSTOM_TYPE: {
                JSCustomType jsCustomType = (JSCustomType)theEObject;
                T result = caseJSCustomType(jsCustomType);
                if (result == null) result = defaultCase(theEObject);
                return result;
            }
            default: return defaultCase(theEObject);
        }
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Named Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseNamedElement(NamedElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Typed Element</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Typed Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTypedElement(TypedElement object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>JS Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>JS Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseJSType(JSType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Function Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Function Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseFunctionType(FunctionType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Simple Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Simple Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseSimpleType(SimpleType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Array Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Array Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseArrayType(ArrayType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Any Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Any Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseAnyType(AnyType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Union Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Union Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUnionType(UnionType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Parameterized Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Parameterized Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseParameterizedType(ParameterizedType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Map Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Map Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseMapType(MapType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Record Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Record Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRecordType(RecordType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Record Member</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Record Member</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRecordMember(RecordMember object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Record Property</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Record Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRecordProperty(RecordProperty object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Class Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Class Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseClassType(ClassType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Undefined Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Undefined Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseUndefinedType(UndefinedType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Type Variable</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Type Variable</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTypeVariable(TypeVariable object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Generic Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Generic Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGenericType(GenericType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Type Variable Reference</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Type Variable Reference</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTypeVariableReference(TypeVariableReference object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>RType</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>RType</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseRType(RType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Generic Method</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Generic Method</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseGenericMethod(GenericMethod object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>JS Custom Type</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>JS Custom Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseJSCustomType(JSCustomType object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Element</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseElement(Element object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Type</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Type</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseType(Type object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Constructor</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Constructor</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseConstructor(Constructor object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Type Alias</em>'.
     * <!-- begin-user-doc -->
     * This implementation returns null;
     * returning a non-null result will terminate the switch.
     * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Type Alias</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
    public T caseTypeAlias(TypeAlias object) {
        return null;
    }

    /**
     * Returns the result of interpreting the object as an instance of '<em>Member</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Member</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseMember(Member object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Method</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Method</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseMethod(Method object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Parameter</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Parameter</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseParameter(Parameter object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Property</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Property</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseProperty(Property object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>Attribute Entry</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>Attribute Entry</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
     * @generated
     */
	public T caseAttributeEntry(Map.Entry<String, Object> object) {
        return null;
    }

	/**
     * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
     * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
     * @param object the target of the switch.
     * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
     * @see #doSwitch(org.eclipse.emf.ecore.EObject)
     * @generated
     */
    public T defaultCase(EObject object) {
        return null;
    }

} //TypeInfoModelSwitch
