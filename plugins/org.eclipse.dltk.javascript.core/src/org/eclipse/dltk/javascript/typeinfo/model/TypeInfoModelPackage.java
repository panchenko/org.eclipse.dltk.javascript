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
 * $Id: TypeInfoModelPackage.java,v 1.17 2011/02/24 07:24:38 apanchenk Exp $
 */
package org.eclipse.dltk.javascript.typeinfo.model;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelFactory
 * @model kind="package"
 * @generated
 */
public interface TypeInfoModelPackage extends EPackage {
	/**
     * The package name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNAME = "model"; //$NON-NLS-1$

	/**
     * The package namespace URI.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_URI = "http://www.eclipse.org/dltk/javascript/typeinfo.ecore"; //$NON-NLS-1$

	/**
     * The package namespace name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_PREFIX = "ti"; //$NON-NLS-1$

	/**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	TypeInfoModelPackage eINSTANCE = org.eclipse.dltk.javascript.typeinfo.model.impl.TypeInfoModelPackageImpl.init();

	/**
     * The meta object id for the '{@link org.eclipse.dltk.javascript.typeinfo.model.NamedElement <em>Named Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.dltk.javascript.typeinfo.model.NamedElement
     * @see org.eclipse.dltk.javascript.typeinfo.model.impl.TypeInfoModelPackageImpl#getNamedElement()
     * @generated
     */
    int NAMED_ELEMENT = 0;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT__NAME = 0;

    /**
     * The number of structural features of the '<em>Named Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int NAMED_ELEMENT_FEATURE_COUNT = 1;

    /**
     * The meta object id for the '{@link org.eclipse.dltk.javascript.typeinfo.model.TypedElement <em>Typed Element</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.dltk.javascript.typeinfo.model.TypedElement
     * @see org.eclipse.dltk.javascript.typeinfo.model.impl.TypeInfoModelPackageImpl#getTypedElement()
     * @generated
     */
    int TYPED_ELEMENT = 1;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPED_ELEMENT__TYPE = 0;

    /**
     * The feature id for the '<em><b>Direct Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPED_ELEMENT__DIRECT_TYPE = 1;

    /**
     * The number of structural features of the '<em>Typed Element</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPED_ELEMENT_FEATURE_COUNT = 2;

    /**
     * The meta object id for the '{@link org.eclipse.dltk.javascript.typeinfo.model.JSType <em>JS Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.dltk.javascript.typeinfo.model.JSType
     * @see org.eclipse.dltk.javascript.typeinfo.model.impl.TypeInfoModelPackageImpl#getJSType()
     * @generated
     */
    int JS_TYPE = 11;

    /**
     * The meta object id for the '{@link org.eclipse.dltk.javascript.typeinfo.model.impl.ElementImpl <em>Element</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.dltk.javascript.typeinfo.model.impl.ElementImpl
     * @see org.eclipse.dltk.javascript.typeinfo.model.impl.TypeInfoModelPackageImpl#getElement()
     * @generated
     */
	int ELEMENT = 2;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ELEMENT__NAME = NAMED_ELEMENT__NAME;

	/**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ELEMENT__DEPRECATED = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ELEMENT__DESCRIPTION = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Visible</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ELEMENT__VISIBLE = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
     * The feature id for the '<em><b>Attributes</b></em>' map.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ELEMENT__ATTRIBUTES = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
     * The number of structural features of the '<em>Element</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ELEMENT_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
     * The meta object id for the '{@link org.eclipse.dltk.javascript.typeinfo.model.impl.TypeImpl <em>Type</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.dltk.javascript.typeinfo.model.impl.TypeImpl
     * @see org.eclipse.dltk.javascript.typeinfo.model.impl.TypeInfoModelPackageImpl#getType()
     * @generated
     */
	int TYPE = 3;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TYPE__NAME = ELEMENT__NAME;

	/**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TYPE__DEPRECATED = ELEMENT__DEPRECATED;

	/**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TYPE__DESCRIPTION = ELEMENT__DESCRIPTION;

	/**
     * The feature id for the '<em><b>Visible</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TYPE__VISIBLE = ELEMENT__VISIBLE;

	/**
     * The feature id for the '<em><b>Attributes</b></em>' map.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TYPE__ATTRIBUTES = ELEMENT__ATTRIBUTES;

	/**
     * The feature id for the '<em><b>Members</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TYPE__MEMBERS = ELEMENT_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TYPE__KIND = ELEMENT_FEATURE_COUNT + 1;

	/**
     * The feature id for the '<em><b>Super Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE__SUPER_TYPE = ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Constructor</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE__CONSTRUCTOR = ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Type</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TYPE_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

	/**
     * The meta object id for the '{@link org.eclipse.dltk.javascript.typeinfo.model.impl.TypeAliasImpl <em>Type Alias</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.dltk.javascript.typeinfo.model.impl.TypeAliasImpl
     * @see org.eclipse.dltk.javascript.typeinfo.model.impl.TypeInfoModelPackageImpl#getTypeAlias()
     * @generated
     */
    int TYPE_ALIAS = 4;

    /**
     * The meta object id for the '{@link org.eclipse.dltk.javascript.typeinfo.model.impl.MemberImpl <em>Member</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.dltk.javascript.typeinfo.model.impl.MemberImpl
     * @see org.eclipse.dltk.javascript.typeinfo.model.impl.TypeInfoModelPackageImpl#getMember()
     * @generated
     */
	int MEMBER = 5;

	/**
     * The meta object id for the '{@link org.eclipse.dltk.javascript.typeinfo.model.impl.MethodImpl <em>Method</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.dltk.javascript.typeinfo.model.impl.MethodImpl
     * @see org.eclipse.dltk.javascript.typeinfo.model.impl.TypeInfoModelPackageImpl#getMethod()
     * @generated
     */
	int METHOD = 6;

	/**
     * The meta object id for the '{@link org.eclipse.dltk.javascript.typeinfo.model.impl.ConstructorImpl <em>Constructor</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.dltk.javascript.typeinfo.model.impl.ConstructorImpl
     * @see org.eclipse.dltk.javascript.typeinfo.model.impl.TypeInfoModelPackageImpl#getConstructor()
     * @generated
     */
    int CONSTRUCTOR = 8;

    /**
     * The feature id for the '<em><b>Source</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ALIAS__SOURCE = 0;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ALIAS__TARGET = 1;

    /**
     * The number of structural features of the '<em>Type Alias</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_ALIAS_FEATURE_COUNT = 2;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MEMBER__NAME = ELEMENT__NAME;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MEMBER__DEPRECATED = ELEMENT__DEPRECATED;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MEMBER__DESCRIPTION = ELEMENT__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Visible</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MEMBER__VISIBLE = ELEMENT__VISIBLE;

    /**
     * The feature id for the '<em><b>Attributes</b></em>' map.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MEMBER__ATTRIBUTES = ELEMENT__ATTRIBUTES;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MEMBER__TYPE = ELEMENT_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Direct Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int MEMBER__DIRECT_TYPE = ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MEMBER__STATIC = ELEMENT_FEATURE_COUNT + 2;

    /**
     * The feature id for the '<em><b>Declaring Type</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MEMBER__DECLARING_TYPE = ELEMENT_FEATURE_COUNT + 3;

    /**
     * The number of structural features of the '<em>Member</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int MEMBER_FEATURE_COUNT = ELEMENT_FEATURE_COUNT + 4;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int METHOD__NAME = MEMBER__NAME;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int METHOD__DEPRECATED = MEMBER__DEPRECATED;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int METHOD__DESCRIPTION = MEMBER__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Visible</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int METHOD__VISIBLE = MEMBER__VISIBLE;

    /**
     * The feature id for the '<em><b>Attributes</b></em>' map.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int METHOD__ATTRIBUTES = MEMBER__ATTRIBUTES;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int METHOD__TYPE = MEMBER__TYPE;

    /**
     * The feature id for the '<em><b>Direct Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int METHOD__DIRECT_TYPE = MEMBER__DIRECT_TYPE;

    /**
     * The feature id for the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int METHOD__STATIC = MEMBER__STATIC;

    /**
     * The feature id for the '<em><b>Declaring Type</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int METHOD__DECLARING_TYPE = MEMBER__DECLARING_TYPE;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int METHOD__PARAMETERS = MEMBER_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Method</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int METHOD_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.eclipse.dltk.javascript.typeinfo.model.impl.ParameterImpl <em>Parameter</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.dltk.javascript.typeinfo.model.impl.ParameterImpl
     * @see org.eclipse.dltk.javascript.typeinfo.model.impl.TypeInfoModelPackageImpl#getParameter()
     * @generated
     */
	int PARAMETER = 7;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PARAMETER__NAME = NAMED_ELEMENT__NAME;

	/**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PARAMETER__TYPE = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
     * The feature id for the '<em><b>Direct Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PARAMETER__DIRECT_TYPE = NAMED_ELEMENT_FEATURE_COUNT + 1;

    /**
     * The feature id for the '<em><b>Kind</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PARAMETER__KIND = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
     * The number of structural features of the '<em>Parameter</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PARAMETER_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 3;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR__NAME = METHOD__NAME;

    /**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR__DEPRECATED = METHOD__DEPRECATED;

    /**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR__DESCRIPTION = METHOD__DESCRIPTION;

    /**
     * The feature id for the '<em><b>Visible</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR__VISIBLE = METHOD__VISIBLE;

    /**
     * The feature id for the '<em><b>Attributes</b></em>' map.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR__ATTRIBUTES = METHOD__ATTRIBUTES;

    /**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR__TYPE = METHOD__TYPE;

    /**
     * The feature id for the '<em><b>Direct Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR__DIRECT_TYPE = METHOD__DIRECT_TYPE;

    /**
     * The feature id for the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR__STATIC = METHOD__STATIC;

    /**
     * The feature id for the '<em><b>Declaring Type</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR__DECLARING_TYPE = METHOD__DECLARING_TYPE;

    /**
     * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR__PARAMETERS = METHOD__PARAMETERS;

    /**
     * The number of structural features of the '<em>Constructor</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int CONSTRUCTOR_FEATURE_COUNT = METHOD_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.eclipse.dltk.javascript.typeinfo.model.impl.PropertyImpl <em>Property</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.dltk.javascript.typeinfo.model.impl.PropertyImpl
     * @see org.eclipse.dltk.javascript.typeinfo.model.impl.TypeInfoModelPackageImpl#getProperty()
     * @generated
     */
	int PROPERTY = 9;

	/**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROPERTY__NAME = MEMBER__NAME;

	/**
     * The feature id for the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROPERTY__DEPRECATED = MEMBER__DEPRECATED;

	/**
     * The feature id for the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROPERTY__DESCRIPTION = MEMBER__DESCRIPTION;

	/**
     * The feature id for the '<em><b>Visible</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROPERTY__VISIBLE = MEMBER__VISIBLE;

	/**
     * The feature id for the '<em><b>Attributes</b></em>' map.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROPERTY__ATTRIBUTES = MEMBER__ATTRIBUTES;

	/**
     * The feature id for the '<em><b>Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROPERTY__TYPE = MEMBER__TYPE;

	/**
     * The feature id for the '<em><b>Direct Type</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int PROPERTY__DIRECT_TYPE = MEMBER__DIRECT_TYPE;

    /**
     * The feature id for the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROPERTY__STATIC = MEMBER__STATIC;

	/**
     * The feature id for the '<em><b>Declaring Type</b></em>' container reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROPERTY__DECLARING_TYPE = MEMBER__DECLARING_TYPE;

	/**
     * The feature id for the '<em><b>Read Only</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROPERTY__READ_ONLY = MEMBER_FEATURE_COUNT + 0;

	/**
     * The number of structural features of the '<em>Property</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int PROPERTY_FEATURE_COUNT = MEMBER_FEATURE_COUNT + 1;


	/**
     * The meta object id for the '{@link org.eclipse.dltk.javascript.typeinfo.model.impl.AttributeEntryImpl <em>Attribute Entry</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.dltk.javascript.typeinfo.model.impl.AttributeEntryImpl
     * @see org.eclipse.dltk.javascript.typeinfo.model.impl.TypeInfoModelPackageImpl#getAttributeEntry()
     * @generated
     */
	int ATTRIBUTE_ENTRY = 10;

	/**
     * The feature id for the '<em><b>Key</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ATTRIBUTE_ENTRY__KEY = 0;

	/**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ATTRIBUTE_ENTRY__VALUE = 1;

	/**
     * The number of structural features of the '<em>Attribute Entry</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int ATTRIBUTE_ENTRY_FEATURE_COUNT = 2;

    /**
     * The number of structural features of the '<em>JS Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int JS_TYPE_FEATURE_COUNT = 0;

	/**
     * The meta object id for the '{@link org.eclipse.dltk.javascript.typeinfo.model.impl.TypeRefImpl <em>Type Ref</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.dltk.javascript.typeinfo.model.impl.TypeRefImpl
     * @see org.eclipse.dltk.javascript.typeinfo.model.impl.TypeInfoModelPackageImpl#getTypeRef()
     * @generated
     */
    int TYPE_REF = 12;

    /**
     * The feature id for the '<em><b>Target</b></em>' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_REF__TARGET = JS_TYPE_FEATURE_COUNT + 0;

    /**
     * The feature id for the '<em><b>Static</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_REF__STATIC = JS_TYPE_FEATURE_COUNT + 1;

    /**
     * The number of structural features of the '<em>Type Ref</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int TYPE_REF_FEATURE_COUNT = JS_TYPE_FEATURE_COUNT + 2;

    /**
     * The meta object id for the '{@link org.eclipse.dltk.javascript.typeinfo.model.impl.ArrayTypeImpl <em>Array Type</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.eclipse.dltk.javascript.typeinfo.model.impl.ArrayTypeImpl
     * @see org.eclipse.dltk.javascript.typeinfo.model.impl.TypeInfoModelPackageImpl#getArrayType()
     * @generated
     */
    int ARRAY_TYPE = 13;

    /**
     * The feature id for the '<em><b>Item Type</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_TYPE__ITEM_TYPE = JS_TYPE_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Array Type</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int ARRAY_TYPE_FEATURE_COUNT = JS_TYPE_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link org.eclipse.dltk.javascript.typeinfo.model.TypeKind <em>Type Kind</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.dltk.javascript.typeinfo.model.TypeKind
     * @see org.eclipse.dltk.javascript.typeinfo.model.impl.TypeInfoModelPackageImpl#getTypeKind()
     * @generated
     */
	int TYPE_KIND = 14;


	/**
     * The meta object id for the '{@link org.eclipse.dltk.javascript.typeinfo.model.ParameterKind <em>Parameter Kind</em>}' enum.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.eclipse.dltk.javascript.typeinfo.model.ParameterKind
     * @see org.eclipse.dltk.javascript.typeinfo.model.impl.TypeInfoModelPackageImpl#getParameterKind()
     * @generated
     */
	int PARAMETER_KIND = 15;


	/**
     * Returns the meta object for class '{@link org.eclipse.dltk.javascript.typeinfo.model.NamedElement <em>Named Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Named Element</em>'.
     * @see org.eclipse.dltk.javascript.typeinfo.model.NamedElement
     * @generated
     */
    EClass getNamedElement();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.dltk.javascript.typeinfo.model.NamedElement#getName <em>Name</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Name</em>'.
     * @see org.eclipse.dltk.javascript.typeinfo.model.NamedElement#getName()
     * @see #getNamedElement()
     * @generated
     */
    EAttribute getNamedElement_Name();

    /**
     * Returns the meta object for class '{@link org.eclipse.dltk.javascript.typeinfo.model.TypedElement <em>Typed Element</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Typed Element</em>'.
     * @see org.eclipse.dltk.javascript.typeinfo.model.TypedElement
     * @generated
     */
    EClass getTypedElement();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.dltk.javascript.typeinfo.model.TypedElement#getType <em>Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Type</em>'.
     * @see org.eclipse.dltk.javascript.typeinfo.model.TypedElement#getType()
     * @see #getTypedElement()
     * @generated
     */
    EReference getTypedElement_Type();

    /**
     * Returns the meta object for the reference '{@link org.eclipse.dltk.javascript.typeinfo.model.TypedElement#getDirectType <em>Direct Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Direct Type</em>'.
     * @see org.eclipse.dltk.javascript.typeinfo.model.TypedElement#getDirectType()
     * @see #getTypedElement()
     * @generated
     */
    EReference getTypedElement_DirectType();

    /**
     * Returns the meta object for class '{@link org.eclipse.dltk.javascript.typeinfo.model.JSType <em>JS Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>JS Type</em>'.
     * @see org.eclipse.dltk.javascript.typeinfo.model.JSType
     * @generated
     */
    EClass getJSType();

    /**
     * Returns the meta object for class '{@link org.eclipse.dltk.javascript.typeinfo.model.TypeRef <em>Type Ref</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Type Ref</em>'.
     * @see org.eclipse.dltk.javascript.typeinfo.model.TypeRef
     * @generated
     */
    EClass getTypeRef();

    /**
     * Returns the meta object for the reference '{@link org.eclipse.dltk.javascript.typeinfo.model.TypeRef#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see org.eclipse.dltk.javascript.typeinfo.model.TypeRef#getTarget()
     * @see #getTypeRef()
     * @generated
     */
    EReference getTypeRef_Target();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.dltk.javascript.typeinfo.model.TypeRef#isStatic <em>Static</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Static</em>'.
     * @see org.eclipse.dltk.javascript.typeinfo.model.TypeRef#isStatic()
     * @see #getTypeRef()
     * @generated
     */
    EAttribute getTypeRef_Static();

    /**
     * Returns the meta object for class '{@link org.eclipse.dltk.javascript.typeinfo.model.ArrayType <em>Array Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Array Type</em>'.
     * @see org.eclipse.dltk.javascript.typeinfo.model.ArrayType
     * @generated
     */
    EClass getArrayType();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.dltk.javascript.typeinfo.model.ArrayType#getItemType <em>Item Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Item Type</em>'.
     * @see org.eclipse.dltk.javascript.typeinfo.model.ArrayType#getItemType()
     * @see #getArrayType()
     * @generated
     */
    EReference getArrayType_ItemType();

    /**
     * Returns the meta object for class '{@link org.eclipse.dltk.javascript.typeinfo.model.Element <em>Element</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Element</em>'.
     * @see org.eclipse.dltk.javascript.typeinfo.model.Element
     * @generated
     */
	EClass getElement();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.dltk.javascript.typeinfo.model.Element#isDeprecated <em>Deprecated</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Deprecated</em>'.
     * @see org.eclipse.dltk.javascript.typeinfo.model.Element#isDeprecated()
     * @see #getElement()
     * @generated
     */
	EAttribute getElement_Deprecated();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.dltk.javascript.typeinfo.model.Element#getDescription <em>Description</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Description</em>'.
     * @see org.eclipse.dltk.javascript.typeinfo.model.Element#getDescription()
     * @see #getElement()
     * @generated
     */
	EAttribute getElement_Description();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.dltk.javascript.typeinfo.model.Element#isVisible <em>Visible</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Visible</em>'.
     * @see org.eclipse.dltk.javascript.typeinfo.model.Element#isVisible()
     * @see #getElement()
     * @generated
     */
	EAttribute getElement_Visible();

	/**
     * Returns the meta object for the map '{@link org.eclipse.dltk.javascript.typeinfo.model.Element#getAttributes <em>Attributes</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the map '<em>Attributes</em>'.
     * @see org.eclipse.dltk.javascript.typeinfo.model.Element#getAttributes()
     * @see #getElement()
     * @generated
     */
	EReference getElement_Attributes();

	/**
     * Returns the meta object for class '{@link org.eclipse.dltk.javascript.typeinfo.model.Type <em>Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Type</em>'.
     * @see org.eclipse.dltk.javascript.typeinfo.model.Type
     * @generated
     */
	EClass getType();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.dltk.javascript.typeinfo.model.Type#getMembers <em>Members</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Members</em>'.
     * @see org.eclipse.dltk.javascript.typeinfo.model.Type#getMembers()
     * @see #getType()
     * @generated
     */
	EReference getType_Members();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.dltk.javascript.typeinfo.model.Type#getKind <em>Kind</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Kind</em>'.
     * @see org.eclipse.dltk.javascript.typeinfo.model.Type#getKind()
     * @see #getType()
     * @generated
     */
	EAttribute getType_Kind();

	/**
     * Returns the meta object for the reference '{@link org.eclipse.dltk.javascript.typeinfo.model.Type#getSuperType <em>Super Type</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Super Type</em>'.
     * @see org.eclipse.dltk.javascript.typeinfo.model.Type#getSuperType()
     * @see #getType()
     * @generated
     */
    EReference getType_SuperType();

    /**
     * Returns the meta object for the containment reference '{@link org.eclipse.dltk.javascript.typeinfo.model.Type#getConstructor <em>Constructor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Constructor</em>'.
     * @see org.eclipse.dltk.javascript.typeinfo.model.Type#getConstructor()
     * @see #getType()
     * @generated
     */
    EReference getType_Constructor();

    /**
     * Returns the meta object for class '{@link org.eclipse.dltk.javascript.typeinfo.model.Constructor <em>Constructor</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Constructor</em>'.
     * @see org.eclipse.dltk.javascript.typeinfo.model.Constructor
     * @generated
     */
    EClass getConstructor();

    /**
     * Returns the meta object for class '{@link org.eclipse.dltk.javascript.typeinfo.model.TypeAlias <em>Type Alias</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Type Alias</em>'.
     * @see org.eclipse.dltk.javascript.typeinfo.model.TypeAlias
     * @generated
     */
    EClass getTypeAlias();

    /**
     * Returns the meta object for the attribute '{@link org.eclipse.dltk.javascript.typeinfo.model.TypeAlias#getSource <em>Source</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Source</em>'.
     * @see org.eclipse.dltk.javascript.typeinfo.model.TypeAlias#getSource()
     * @see #getTypeAlias()
     * @generated
     */
    EAttribute getTypeAlias_Source();

    /**
     * Returns the meta object for the reference '{@link org.eclipse.dltk.javascript.typeinfo.model.TypeAlias#getTarget <em>Target</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the reference '<em>Target</em>'.
     * @see org.eclipse.dltk.javascript.typeinfo.model.TypeAlias#getTarget()
     * @see #getTypeAlias()
     * @generated
     */
    EReference getTypeAlias_Target();

    /**
     * Returns the meta object for class '{@link org.eclipse.dltk.javascript.typeinfo.model.Member <em>Member</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Member</em>'.
     * @see org.eclipse.dltk.javascript.typeinfo.model.Member
     * @generated
     */
	EClass getMember();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.dltk.javascript.typeinfo.model.Member#isStatic <em>Static</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Static</em>'.
     * @see org.eclipse.dltk.javascript.typeinfo.model.Member#isStatic()
     * @see #getMember()
     * @generated
     */
	EAttribute getMember_Static();

	/**
     * Returns the meta object for the container reference '{@link org.eclipse.dltk.javascript.typeinfo.model.Member#getDeclaringType <em>Declaring Type</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>Declaring Type</em>'.
     * @see org.eclipse.dltk.javascript.typeinfo.model.Member#getDeclaringType()
     * @see #getMember()
     * @generated
     */
	EReference getMember_DeclaringType();

	/**
     * Returns the meta object for class '{@link org.eclipse.dltk.javascript.typeinfo.model.Method <em>Method</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Method</em>'.
     * @see org.eclipse.dltk.javascript.typeinfo.model.Method
     * @generated
     */
	EClass getMethod();

	/**
     * Returns the meta object for the containment reference list '{@link org.eclipse.dltk.javascript.typeinfo.model.Method#getParameters <em>Parameters</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Parameters</em>'.
     * @see org.eclipse.dltk.javascript.typeinfo.model.Method#getParameters()
     * @see #getMethod()
     * @generated
     */
	EReference getMethod_Parameters();

	/**
     * Returns the meta object for class '{@link org.eclipse.dltk.javascript.typeinfo.model.Parameter <em>Parameter</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Parameter</em>'.
     * @see org.eclipse.dltk.javascript.typeinfo.model.Parameter
     * @generated
     */
	EClass getParameter();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.dltk.javascript.typeinfo.model.Parameter#getKind <em>Kind</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Kind</em>'.
     * @see org.eclipse.dltk.javascript.typeinfo.model.Parameter#getKind()
     * @see #getParameter()
     * @generated
     */
	EAttribute getParameter_Kind();

	/**
     * Returns the meta object for class '{@link org.eclipse.dltk.javascript.typeinfo.model.Property <em>Property</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Property</em>'.
     * @see org.eclipse.dltk.javascript.typeinfo.model.Property
     * @generated
     */
	EClass getProperty();

	/**
     * Returns the meta object for the attribute '{@link org.eclipse.dltk.javascript.typeinfo.model.Property#isReadOnly <em>Read Only</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Read Only</em>'.
     * @see org.eclipse.dltk.javascript.typeinfo.model.Property#isReadOnly()
     * @see #getProperty()
     * @generated
     */
	EAttribute getProperty_ReadOnly();

	/**
     * Returns the meta object for class '{@link java.util.Map.Entry <em>Attribute Entry</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Attribute Entry</em>'.
     * @see java.util.Map.Entry
     * @model keyDataType="org.eclipse.emf.ecore.EString"
     *        valueDataType="org.eclipse.emf.ecore.EJavaObject"
     * @generated
     */
	EClass getAttributeEntry();

	/**
     * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Key</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Key</em>'.
     * @see java.util.Map.Entry
     * @see #getAttributeEntry()
     * @generated
     */
	EAttribute getAttributeEntry_Key();

	/**
     * Returns the meta object for the attribute '{@link java.util.Map.Entry <em>Value</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Value</em>'.
     * @see java.util.Map.Entry
     * @see #getAttributeEntry()
     * @generated
     */
	EAttribute getAttributeEntry_Value();

	/**
     * Returns the meta object for enum '{@link org.eclipse.dltk.javascript.typeinfo.model.TypeKind <em>Type Kind</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Type Kind</em>'.
     * @see org.eclipse.dltk.javascript.typeinfo.model.TypeKind
     * @generated
     */
	EEnum getTypeKind();

	/**
     * Returns the meta object for enum '{@link org.eclipse.dltk.javascript.typeinfo.model.ParameterKind <em>Parameter Kind</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for enum '<em>Parameter Kind</em>'.
     * @see org.eclipse.dltk.javascript.typeinfo.model.ParameterKind
     * @generated
     */
	EEnum getParameterKind();

	/**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
	TypeInfoModelFactory getTypeInfoModelFactory();

	/**
     * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
     * @generated
     */
	interface Literals {
		/**
         * The meta object literal for the '{@link org.eclipse.dltk.javascript.typeinfo.model.NamedElement <em>Named Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.dltk.javascript.typeinfo.model.NamedElement
         * @see org.eclipse.dltk.javascript.typeinfo.model.impl.TypeInfoModelPackageImpl#getNamedElement()
         * @generated
         */
        EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

        /**
         * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

        /**
         * The meta object literal for the '{@link org.eclipse.dltk.javascript.typeinfo.model.TypedElement <em>Typed Element</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.dltk.javascript.typeinfo.model.TypedElement
         * @see org.eclipse.dltk.javascript.typeinfo.model.impl.TypeInfoModelPackageImpl#getTypedElement()
         * @generated
         */
        EClass TYPED_ELEMENT = eINSTANCE.getTypedElement();

        /**
         * The meta object literal for the '<em><b>Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TYPED_ELEMENT__TYPE = eINSTANCE.getTypedElement_Type();

        /**
         * The meta object literal for the '<em><b>Direct Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TYPED_ELEMENT__DIRECT_TYPE = eINSTANCE.getTypedElement_DirectType();

        /**
         * The meta object literal for the '{@link org.eclipse.dltk.javascript.typeinfo.model.JSType <em>JS Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.dltk.javascript.typeinfo.model.JSType
         * @see org.eclipse.dltk.javascript.typeinfo.model.impl.TypeInfoModelPackageImpl#getJSType()
         * @generated
         */
        EClass JS_TYPE = eINSTANCE.getJSType();

        /**
         * The meta object literal for the '{@link org.eclipse.dltk.javascript.typeinfo.model.impl.TypeRefImpl <em>Type Ref</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.dltk.javascript.typeinfo.model.impl.TypeRefImpl
         * @see org.eclipse.dltk.javascript.typeinfo.model.impl.TypeInfoModelPackageImpl#getTypeRef()
         * @generated
         */
        EClass TYPE_REF = eINSTANCE.getTypeRef();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TYPE_REF__TARGET = eINSTANCE.getTypeRef_Target();

        /**
         * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TYPE_REF__STATIC = eINSTANCE.getTypeRef_Static();

        /**
         * The meta object literal for the '{@link org.eclipse.dltk.javascript.typeinfo.model.impl.ArrayTypeImpl <em>Array Type</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.dltk.javascript.typeinfo.model.impl.ArrayTypeImpl
         * @see org.eclipse.dltk.javascript.typeinfo.model.impl.TypeInfoModelPackageImpl#getArrayType()
         * @generated
         */
        EClass ARRAY_TYPE = eINSTANCE.getArrayType();

        /**
         * The meta object literal for the '<em><b>Item Type</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference ARRAY_TYPE__ITEM_TYPE = eINSTANCE.getArrayType_ItemType();

        /**
         * The meta object literal for the '{@link org.eclipse.dltk.javascript.typeinfo.model.impl.ElementImpl <em>Element</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.eclipse.dltk.javascript.typeinfo.model.impl.ElementImpl
         * @see org.eclipse.dltk.javascript.typeinfo.model.impl.TypeInfoModelPackageImpl#getElement()
         * @generated
         */
		EClass ELEMENT = eINSTANCE.getElement();

		/**
         * The meta object literal for the '<em><b>Deprecated</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ELEMENT__DEPRECATED = eINSTANCE.getElement_Deprecated();

		/**
         * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ELEMENT__DESCRIPTION = eINSTANCE.getElement_Description();

		/**
         * The meta object literal for the '<em><b>Visible</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ELEMENT__VISIBLE = eINSTANCE.getElement_Visible();

		/**
         * The meta object literal for the '<em><b>Attributes</b></em>' map feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference ELEMENT__ATTRIBUTES = eINSTANCE.getElement_Attributes();

		/**
         * The meta object literal for the '{@link org.eclipse.dltk.javascript.typeinfo.model.impl.TypeImpl <em>Type</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.eclipse.dltk.javascript.typeinfo.model.impl.TypeImpl
         * @see org.eclipse.dltk.javascript.typeinfo.model.impl.TypeInfoModelPackageImpl#getType()
         * @generated
         */
		EClass TYPE = eINSTANCE.getType();

		/**
         * The meta object literal for the '<em><b>Members</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference TYPE__MEMBERS = eINSTANCE.getType_Members();

		/**
         * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute TYPE__KIND = eINSTANCE.getType_Kind();

		/**
         * The meta object literal for the '<em><b>Super Type</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TYPE__SUPER_TYPE = eINSTANCE.getType_SuperType();

        /**
         * The meta object literal for the '<em><b>Constructor</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TYPE__CONSTRUCTOR = eINSTANCE.getType_Constructor();

        /**
         * The meta object literal for the '{@link org.eclipse.dltk.javascript.typeinfo.model.impl.ConstructorImpl <em>Constructor</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.dltk.javascript.typeinfo.model.impl.ConstructorImpl
         * @see org.eclipse.dltk.javascript.typeinfo.model.impl.TypeInfoModelPackageImpl#getConstructor()
         * @generated
         */
        EClass CONSTRUCTOR = eINSTANCE.getConstructor();

        /**
         * The meta object literal for the '{@link org.eclipse.dltk.javascript.typeinfo.model.impl.TypeAliasImpl <em>Type Alias</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see org.eclipse.dltk.javascript.typeinfo.model.impl.TypeAliasImpl
         * @see org.eclipse.dltk.javascript.typeinfo.model.impl.TypeInfoModelPackageImpl#getTypeAlias()
         * @generated
         */
        EClass TYPE_ALIAS = eINSTANCE.getTypeAlias();

        /**
         * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute TYPE_ALIAS__SOURCE = eINSTANCE.getTypeAlias_Source();

        /**
         * The meta object literal for the '<em><b>Target</b></em>' reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference TYPE_ALIAS__TARGET = eINSTANCE.getTypeAlias_Target();

        /**
         * The meta object literal for the '{@link org.eclipse.dltk.javascript.typeinfo.model.impl.MemberImpl <em>Member</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.eclipse.dltk.javascript.typeinfo.model.impl.MemberImpl
         * @see org.eclipse.dltk.javascript.typeinfo.model.impl.TypeInfoModelPackageImpl#getMember()
         * @generated
         */
		EClass MEMBER = eINSTANCE.getMember();

		/**
         * The meta object literal for the '<em><b>Static</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute MEMBER__STATIC = eINSTANCE.getMember_Static();

		/**
         * The meta object literal for the '<em><b>Declaring Type</b></em>' container reference feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference MEMBER__DECLARING_TYPE = eINSTANCE.getMember_DeclaringType();

		/**
         * The meta object literal for the '{@link org.eclipse.dltk.javascript.typeinfo.model.impl.MethodImpl <em>Method</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.eclipse.dltk.javascript.typeinfo.model.impl.MethodImpl
         * @see org.eclipse.dltk.javascript.typeinfo.model.impl.TypeInfoModelPackageImpl#getMethod()
         * @generated
         */
		EClass METHOD = eINSTANCE.getMethod();

		/**
         * The meta object literal for the '<em><b>Parameters</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference METHOD__PARAMETERS = eINSTANCE.getMethod_Parameters();

		/**
         * The meta object literal for the '{@link org.eclipse.dltk.javascript.typeinfo.model.impl.ParameterImpl <em>Parameter</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.eclipse.dltk.javascript.typeinfo.model.impl.ParameterImpl
         * @see org.eclipse.dltk.javascript.typeinfo.model.impl.TypeInfoModelPackageImpl#getParameter()
         * @generated
         */
		EClass PARAMETER = eINSTANCE.getParameter();

		/**
         * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute PARAMETER__KIND = eINSTANCE.getParameter_Kind();

		/**
         * The meta object literal for the '{@link org.eclipse.dltk.javascript.typeinfo.model.impl.PropertyImpl <em>Property</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.eclipse.dltk.javascript.typeinfo.model.impl.PropertyImpl
         * @see org.eclipse.dltk.javascript.typeinfo.model.impl.TypeInfoModelPackageImpl#getProperty()
         * @generated
         */
		EClass PROPERTY = eINSTANCE.getProperty();

		/**
         * The meta object literal for the '<em><b>Read Only</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute PROPERTY__READ_ONLY = eINSTANCE.getProperty_ReadOnly();

		/**
         * The meta object literal for the '{@link org.eclipse.dltk.javascript.typeinfo.model.impl.AttributeEntryImpl <em>Attribute Entry</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.eclipse.dltk.javascript.typeinfo.model.impl.AttributeEntryImpl
         * @see org.eclipse.dltk.javascript.typeinfo.model.impl.TypeInfoModelPackageImpl#getAttributeEntry()
         * @generated
         */
		EClass ATTRIBUTE_ENTRY = eINSTANCE.getAttributeEntry();

		/**
         * The meta object literal for the '<em><b>Key</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ATTRIBUTE_ENTRY__KEY = eINSTANCE.getAttributeEntry_Key();

		/**
         * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute ATTRIBUTE_ENTRY__VALUE = eINSTANCE.getAttributeEntry_Value();

		/**
         * The meta object literal for the '{@link org.eclipse.dltk.javascript.typeinfo.model.TypeKind <em>Type Kind</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.eclipse.dltk.javascript.typeinfo.model.TypeKind
         * @see org.eclipse.dltk.javascript.typeinfo.model.impl.TypeInfoModelPackageImpl#getTypeKind()
         * @generated
         */
		EEnum TYPE_KIND = eINSTANCE.getTypeKind();

		/**
         * The meta object literal for the '{@link org.eclipse.dltk.javascript.typeinfo.model.ParameterKind <em>Parameter Kind</em>}' enum.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.eclipse.dltk.javascript.typeinfo.model.ParameterKind
         * @see org.eclipse.dltk.javascript.typeinfo.model.impl.TypeInfoModelPackageImpl#getParameterKind()
         * @generated
         */
		EEnum PARAMETER_KIND = eINSTANCE.getParameterKind();

	}

} //TypeInfoModelPackage
