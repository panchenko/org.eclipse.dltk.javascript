/**
 */
package org.eclipse.dltk.javascript.typeinfo.model;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModel51Package
 * @generated
 */
public interface TypeInfoModel51Factory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TypeInfoModel51Factory eINSTANCE = org.eclipse.dltk.javascript.typeinfo.model.impl.TypeInfoModel51FactoryImpl.init();

	/**
	 * Returns a new object of class '<em>MConstructor</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MConstructor</em>'.
	 * @generated
	 */
	MConstructor createMConstructor();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TypeInfoModel51Package getTypeInfoModel51Package();

} //TypeInfoModel51Factory
