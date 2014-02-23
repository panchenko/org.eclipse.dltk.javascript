/**
 */
package org.eclipse.dltk.javascript.typeinfo.model.impl;

import org.eclipse.dltk.javascript.typeinfo.model.MConstructor;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModel51Factory;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModel51Package;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TypeInfoModel51PackageImpl extends EPackageImpl implements TypeInfoModel51Package {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mConstructorEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModel51Package#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TypeInfoModel51PackageImpl() {
		super(eNS_URI, TypeInfoModel51Factory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TypeInfoModel51Package#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TypeInfoModel51Package init() {
		if (isInited) return (TypeInfoModel51Package)EPackage.Registry.INSTANCE.getEPackage(TypeInfoModel51Package.eNS_URI);

		// Obtain or create and register package
		TypeInfoModel51PackageImpl theTypeInfoModel51Package = (TypeInfoModel51PackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TypeInfoModel51PackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TypeInfoModel51PackageImpl());

		isInited = true;

		// Initialize simple dependencies
		TypeInfoModelPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTypeInfoModel51Package.createPackageContents();

		// Initialize created meta-data
		theTypeInfoModel51Package.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theTypeInfoModel51Package.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TypeInfoModel51Package.eNS_URI, theTypeInfoModel51Package);
		return theTypeInfoModel51Package;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMConstructor() {
		return mConstructorEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getMConstructor_Children() {
		return (EReference)mConstructorEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TypeInfoModel51Factory getTypeInfoModel51Factory() {
		return (TypeInfoModel51Factory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		mConstructorEClass = createEClass(MCONSTRUCTOR);
		createEReference(mConstructorEClass, MCONSTRUCTOR__CHILDREN);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		TypeInfoModelPackage theTypeInfoModelPackage = (TypeInfoModelPackage)EPackage.Registry.INSTANCE.getEPackage(TypeInfoModelPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mConstructorEClass.getESuperTypes().add(theTypeInfoModelPackage.getConstructor());

		// Initialize classes and features; add operations and parameters
		initEClass(mConstructorEClass, MConstructor.class, "MConstructor", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getMConstructor_Children(), theTypeInfoModelPackage.getConstructor(), null, "children", null, 0, -1, MConstructor.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //TypeInfoModel51PackageImpl
