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
 * $Id: TypeInfoModelAdapterFactory.java,v 1.17 2011/11/22 15:52:22 apanchenk Exp $
 */
package org.eclipse.dltk.javascript.typeinfo.model.util;

import java.util.Map;
import org.eclipse.dltk.javascript.typeinfo.model.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage
 * @generated
 */
public class TypeInfoModelAdapterFactory extends AdapterFactoryImpl {
	/**
     * The cached model package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static TypeInfoModelPackage modelPackage;

	/**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TypeInfoModelAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = TypeInfoModelPackage.eINSTANCE;
        }
    }

	/**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
	@Override
	public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

	/**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected TypeInfoModelSwitch<Adapter> modelSwitch =
		new TypeInfoModelSwitch<Adapter>() {
            @Override
            public Adapter caseNamedElement(NamedElement object) {
                return createNamedElementAdapter();
            }
            @Override
            public Adapter caseTypedElement(TypedElement object) {
                return createTypedElementAdapter();
            }
            @Override
            public Adapter caseElement(Element object) {
                return createElementAdapter();
            }
            @Override
            public Adapter caseType(Type object) {
                return createTypeAdapter();
            }
            @Override
            public Adapter caseTypeAlias(TypeAlias object) {
                return createTypeAliasAdapter();
            }
            @Override
            public Adapter caseMember(Member object) {
                return createMemberAdapter();
            }
            @Override
            public Adapter caseMethod(Method object) {
                return createMethodAdapter();
            }
            @Override
            public Adapter caseParameter(Parameter object) {
                return createParameterAdapter();
            }
            @Override
            public Adapter caseConstructor(Constructor object) {
                return createConstructorAdapter();
            }
            @Override
            public Adapter caseProperty(Property object) {
                return createPropertyAdapter();
            }
            @Override
            public Adapter caseAttributeEntry(Map.Entry<String, Object> object) {
                return createAttributeEntryAdapter();
            }
            @Override
            public Adapter caseJSType(JSType object) {
                return createJSTypeAdapter();
            }
            @Override
            public Adapter caseFunctionType(FunctionType object) {
                return createFunctionTypeAdapter();
            }
            @Override
            public Adapter caseSimpleType(SimpleType object) {
                return createSimpleTypeAdapter();
            }
            @Override
            public Adapter caseArrayType(ArrayType object) {
                return createArrayTypeAdapter();
            }
            @Override
            public Adapter caseAnyType(AnyType object) {
                return createAnyTypeAdapter();
            }
            @Override
            public Adapter caseUnionType(UnionType object) {
                return createUnionTypeAdapter();
            }
            @Override
            public Adapter caseParameterizedType(ParameterizedType object) {
                return createParameterizedTypeAdapter();
            }
            @Override
            public Adapter caseMapType(MapType object) {
                return createMapTypeAdapter();
            }
            @Override
            public Adapter caseRecordType(RecordType object) {
                return createRecordTypeAdapter();
            }
            @Override
            public Adapter caseRecordMember(RecordMember object) {
                return createRecordMemberAdapter();
            }
            @Override
            public Adapter caseRecordProperty(RecordProperty object) {
                return createRecordPropertyAdapter();
            }
            @Override
            public Adapter caseClassType(ClassType object) {
                return createClassTypeAdapter();
            }
            @Override
            public Adapter caseUndefinedType(UndefinedType object) {
                return createUndefinedTypeAdapter();
            }
            @Override
            public Adapter caseTypeVariable(TypeVariable object) {
                return createTypeVariableAdapter();
            }
            @Override
            public Adapter caseGenericType(GenericType object) {
                return createGenericTypeAdapter();
            }
            @Override
            public Adapter caseTypeVariableReference(TypeVariableReference object) {
                return createTypeVariableReferenceAdapter();
            }
            @Override
            public Adapter caseRType(RType object) {
                return createRTypeAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

	/**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
	@Override
	public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.dltk.javascript.typeinfo.model.NamedElement <em>Named Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.dltk.javascript.typeinfo.model.NamedElement
     * @generated
     */
    public Adapter createNamedElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.dltk.javascript.typeinfo.model.TypedElement <em>Typed Element</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.dltk.javascript.typeinfo.model.TypedElement
     * @generated
     */
    public Adapter createTypedElementAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.dltk.javascript.typeinfo.model.JSType <em>JS Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.dltk.javascript.typeinfo.model.JSType
     * @generated
     */
    public Adapter createJSTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.dltk.javascript.typeinfo.model.FunctionType <em>Function Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.dltk.javascript.typeinfo.model.FunctionType
     * @generated
     */
    public Adapter createFunctionTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.dltk.javascript.typeinfo.model.SimpleType <em>Simple Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.dltk.javascript.typeinfo.model.SimpleType
     * @generated
     */
    public Adapter createSimpleTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.dltk.javascript.typeinfo.model.ArrayType <em>Array Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.dltk.javascript.typeinfo.model.ArrayType
     * @generated
     */
    public Adapter createArrayTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.dltk.javascript.typeinfo.model.AnyType <em>Any Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.dltk.javascript.typeinfo.model.AnyType
     * @generated
     */
    public Adapter createAnyTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.dltk.javascript.typeinfo.model.UnionType <em>Union Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.dltk.javascript.typeinfo.model.UnionType
     * @generated
     */
    public Adapter createUnionTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.dltk.javascript.typeinfo.model.ParameterizedType <em>Parameterized Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.dltk.javascript.typeinfo.model.ParameterizedType
     * @generated
     */
    public Adapter createParameterizedTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.dltk.javascript.typeinfo.model.GenericType <em>Generic Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.dltk.javascript.typeinfo.model.GenericType
     * @generated
     */
    public Adapter createGenericTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.dltk.javascript.typeinfo.model.TypeVariableReference <em>Type Variable Reference</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.dltk.javascript.typeinfo.model.TypeVariableReference
     * @generated
     */
    public Adapter createTypeVariableReferenceAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.dltk.javascript.typeinfo.model.RType <em>RType</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.dltk.javascript.typeinfo.model.RType
     * @generated
     */
    public Adapter createRTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.dltk.javascript.typeinfo.model.MapType <em>Map Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.dltk.javascript.typeinfo.model.MapType
     * @generated
     */
    public Adapter createMapTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.dltk.javascript.typeinfo.model.RecordType <em>Record Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.dltk.javascript.typeinfo.model.RecordType
     * @generated
     */
    public Adapter createRecordTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.dltk.javascript.typeinfo.model.RecordMember <em>Record Member</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.dltk.javascript.typeinfo.model.RecordMember
     * @generated
     */
    public Adapter createRecordMemberAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.dltk.javascript.typeinfo.model.RecordProperty <em>Record Property</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.dltk.javascript.typeinfo.model.RecordProperty
     * @generated
     */
    public Adapter createRecordPropertyAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.dltk.javascript.typeinfo.model.ClassType <em>Class Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.dltk.javascript.typeinfo.model.ClassType
     * @generated
     */
    public Adapter createClassTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.dltk.javascript.typeinfo.model.UndefinedType <em>Undefined Type</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.dltk.javascript.typeinfo.model.UndefinedType
     * @generated
     */
    public Adapter createUndefinedTypeAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.dltk.javascript.typeinfo.model.TypeVariable <em>Type Variable</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.dltk.javascript.typeinfo.model.TypeVariable
     * @generated
     */
    public Adapter createTypeVariableAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.dltk.javascript.typeinfo.model.Element <em>Element</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.dltk.javascript.typeinfo.model.Element
     * @generated
     */
	public Adapter createElementAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.dltk.javascript.typeinfo.model.Type <em>Type</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.dltk.javascript.typeinfo.model.Type
     * @generated
     */
	public Adapter createTypeAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.dltk.javascript.typeinfo.model.Constructor <em>Constructor</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.dltk.javascript.typeinfo.model.Constructor
     * @generated
     */
    public Adapter createConstructorAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.dltk.javascript.typeinfo.model.TypeAlias <em>Type Alias</em>}'.
     * <!-- begin-user-doc -->
     * This default implementation returns null so that we can easily ignore cases;
     * it's useful to ignore a case when inheritance will catch all the cases anyway.
     * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.dltk.javascript.typeinfo.model.TypeAlias
     * @generated
     */
    public Adapter createTypeAliasAdapter() {
        return null;
    }

    /**
     * Creates a new adapter for an object of class '{@link org.eclipse.dltk.javascript.typeinfo.model.Member <em>Member</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.dltk.javascript.typeinfo.model.Member
     * @generated
     */
	public Adapter createMemberAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.dltk.javascript.typeinfo.model.Method <em>Method</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.dltk.javascript.typeinfo.model.Method
     * @generated
     */
	public Adapter createMethodAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.dltk.javascript.typeinfo.model.Parameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.dltk.javascript.typeinfo.model.Parameter
     * @generated
     */
	public Adapter createParameterAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.eclipse.dltk.javascript.typeinfo.model.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.eclipse.dltk.javascript.typeinfo.model.Property
     * @generated
     */
	public Adapter createPropertyAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link java.util.Map.Entry <em>Attribute Entry</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see java.util.Map.Entry
     * @generated
     */
	public Adapter createAttributeEntryAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
	public Adapter createEObjectAdapter() {
        return null;
    }

} //TypeInfoModelAdapterFactory
