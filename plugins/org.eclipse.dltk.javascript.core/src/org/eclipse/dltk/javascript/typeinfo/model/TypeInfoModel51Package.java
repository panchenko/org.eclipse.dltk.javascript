/**
 */
package org.eclipse.dltk.javascript.typeinfo.model;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModel51Factory
 * @model kind="package"
 * @generated
 */
public interface TypeInfoModel51Package extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "model";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.eclipse.org/dltk/javascript/typeinfo51.ecore";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "t51";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypeInfoModel51Package eINSTANCE = org.eclipse.dltk.javascript.typeinfo.model.impl.TypeInfoModel51PackageImpl.init();

	/**
	 * The meta object id for the '{@link org.eclipse.dltk.javascript.typeinfo.model.impl.MConstructorImpl <em>MConstructor</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.dltk.javascript.typeinfo.model.impl.MConstructorImpl
	 * @see org.eclipse.dltk.javascript.typeinfo.model.impl.TypeInfoModel51PackageImpl#getMConstructor()
	 * @generated
	 */
	int MCONSTRUCTOR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR__NAME = TypeInfoModelPackage.CONSTRUCTOR__NAME;

	/**
	 * The feature id for the '<em><b>Deprecated</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR__DEPRECATED = TypeInfoModelPackage.CONSTRUCTOR__DEPRECATED;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR__DESCRIPTION = TypeInfoModelPackage.CONSTRUCTOR__DESCRIPTION;

	/**
	 * The feature id for the '<em><b>Visible</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR__VISIBLE = TypeInfoModelPackage.CONSTRUCTOR__VISIBLE;

	/**
	 * The feature id for the '<em><b>Attributes</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR__ATTRIBUTES = TypeInfoModelPackage.CONSTRUCTOR__ATTRIBUTES;

	/**
	 * The feature id for the '<em><b>Hide Allowed</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR__HIDE_ALLOWED = TypeInfoModelPackage.CONSTRUCTOR__HIDE_ALLOWED;

	/**
	 * The feature id for the '<em><b>Type</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR__TYPE = TypeInfoModelPackage.CONSTRUCTOR__TYPE;

	/**
	 * The feature id for the '<em><b>Direct Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR__DIRECT_TYPE = TypeInfoModelPackage.CONSTRUCTOR__DIRECT_TYPE;

	/**
	 * The feature id for the '<em><b>Static</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR__STATIC = TypeInfoModelPackage.CONSTRUCTOR__STATIC;

	/**
	 * The feature id for the '<em><b>Declaring Type</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR__DECLARING_TYPE = TypeInfoModelPackage.CONSTRUCTOR__DECLARING_TYPE;

	/**
	 * The feature id for the '<em><b>Visibility</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR__VISIBILITY = TypeInfoModelPackage.CONSTRUCTOR__VISIBILITY;

	/**
	 * The feature id for the '<em><b>Parameters</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR__PARAMETERS = TypeInfoModelPackage.CONSTRUCTOR__PARAMETERS;

	/**
	 * The feature id for the '<em><b>Abstract</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR__ABSTRACT = TypeInfoModelPackage.CONSTRUCTOR__ABSTRACT;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR__CHILDREN = TypeInfoModelPackage.CONSTRUCTOR_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>MConstructor</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MCONSTRUCTOR_FEATURE_COUNT = TypeInfoModelPackage.CONSTRUCTOR_FEATURE_COUNT + 1;

	/**
	 * Returns the meta object for class '{@link org.eclipse.dltk.javascript.typeinfo.model.MConstructor <em>MConstructor</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MConstructor</em>'.
	 * @see org.eclipse.dltk.javascript.typeinfo.model.MConstructor
	 * @generated
	 */
	EClass getMConstructor();

	/**
	 * Returns the meta object for the containment reference list '{@link org.eclipse.dltk.javascript.typeinfo.model.MConstructor#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see org.eclipse.dltk.javascript.typeinfo.model.MConstructor#getChildren()
	 * @see #getMConstructor()
	 * @generated
	 */
	EReference getMConstructor_Children();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TypeInfoModel51Factory getTypeInfoModel51Factory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.eclipse.dltk.javascript.typeinfo.model.impl.MConstructorImpl <em>MConstructor</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.eclipse.dltk.javascript.typeinfo.model.impl.MConstructorImpl
		 * @see org.eclipse.dltk.javascript.typeinfo.model.impl.TypeInfoModel51PackageImpl#getMConstructor()
		 * @generated
		 */
		EClass MCONSTRUCTOR = eINSTANCE.getMConstructor();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference MCONSTRUCTOR__CHILDREN = eINSTANCE.getMConstructor_Children();

	}

} //TypeInfoModel51Package
