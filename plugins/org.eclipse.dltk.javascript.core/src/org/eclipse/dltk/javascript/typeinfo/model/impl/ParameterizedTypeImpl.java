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

import java.util.Collection;

import org.eclipse.dltk.javascript.typeinfo.IRType;
import org.eclipse.dltk.javascript.typeinfo.ITypeSystem;
import org.eclipse.dltk.javascript.typeinfo.RTypes;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;
import org.eclipse.dltk.javascript.typeinfo.model.ParameterizedType;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Generic Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.impl.ParameterizedTypeImpl#getActualTypeArguments <em>Actual Type Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ParameterizedTypeImpl extends SimpleTypeImpl implements ParameterizedType {
    /**
     * The cached value of the '{@link #getActualTypeArguments() <em>Actual Type Arguments</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getActualTypeArguments()
     * @generated
     * @ordered
     */
    protected EList<JSType> actualTypeArguments;
    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected ParameterizedTypeImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return TypeInfoModelPackage.Literals.PARAMETERIZED_TYPE;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<JSType> getActualTypeArguments() {
        if (actualTypeArguments == null) {
            actualTypeArguments = new EObjectContainmentEList<JSType>(JSType.class, this, TypeInfoModelPackage.PARAMETERIZED_TYPE__ACTUAL_TYPE_ARGUMENTS);
        }
        return actualTypeArguments;
    }

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
    public String getRawName() {
		return super.getName();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TypeInfoModelPackage.PARAMETERIZED_TYPE__ACTUAL_TYPE_ARGUMENTS:
                return ((InternalEList<?>)getActualTypeArguments()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TypeInfoModelPackage.PARAMETERIZED_TYPE__ACTUAL_TYPE_ARGUMENTS:
                return getActualTypeArguments();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @SuppressWarnings("unchecked")
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case TypeInfoModelPackage.PARAMETERIZED_TYPE__ACTUAL_TYPE_ARGUMENTS:
                getActualTypeArguments().clear();
                getActualTypeArguments().addAll((Collection<? extends JSType>)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case TypeInfoModelPackage.PARAMETERIZED_TYPE__ACTUAL_TYPE_ARGUMENTS:
                getActualTypeArguments().clear();
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case TypeInfoModelPackage.PARAMETERIZED_TYPE__ACTUAL_TYPE_ARGUMENTS:
                return actualTypeArguments != null && !actualTypeArguments.isEmpty();
        }
        return super.eIsSet(featureID);
    }

	@Override
	public String getName() {
		if (!getActualTypeArguments().isEmpty()) {
			final StringBuilder sb = new StringBuilder();
			sb.append(super.getName());
			sb.append('<');
			boolean first = true;
			for (JSType typeParameter : getActualTypeArguments()) {
				if (!first) {
					sb.append(',');
				}
				first = false;
				sb.append(typeParameter.getName());
			}
			sb.append('>');
			return sb.toString();
		}
		return super.getName();
	}

	@Override
	public IRType toRType(ITypeSystem typeSystem) {
		final Type t = getTarget();
		if (t == null) {
			return RTypes.any();
		}
		return RTypes.simple(typeSystem.parameterize(t,
				RTypes.convert(typeSystem, getActualTypeArguments())));
	}

	@Override
	public String toString() {
		return getName();
	}
} // ParameterizedTypeImpl
