/**
 * Copyright (c) 2011 NumberFour AG
 * 
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     NumberFour AG - initial API and Implementation (Alex Panchenko)
 */
package org.eclipse.dltk.javascript.typeinfo.model.impl;

import org.eclipse.dltk.javascript.typeinfo.model.Constructor;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage;
import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Constructor</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ConstructorImpl extends MethodImpl implements Constructor {
	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
    protected ConstructorImpl() {
        super();
		static_ = CONSTRUCTOR_STATIC_EDEFAULT;
    }

	private static final boolean CONSTRUCTOR_STATIC_EDEFAULT = true;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypeInfoModelPackage.Literals.CONSTRUCTOR;
    }

	@Override
	public Type getDeclaringType() {
		if (eContainerFeatureID() != EOPPOSITE_FEATURE_BASE
				- TypeInfoModelPackage.TYPE__STATIC_CONSTRUCTOR
				&& eContainerFeatureID() != EOPPOSITE_FEATURE_BASE
						- TypeInfoModelPackage.TYPE__CONSTRUCTORS)
			return null;
		return (Type) eContainer();
	}

	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case TypeInfoModelPackage.MEMBER__STATIC:
			setStatic(CONSTRUCTOR_STATIC_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case TypeInfoModelPackage.MEMBER__STATIC:
			return static_ != CONSTRUCTOR_STATIC_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

} //ConstructorImpl
