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
 * $Id: MemberImpl.java,v 1.11 2011/08/03 08:48:03 apanchenk Exp $
 */
package org.eclipse.dltk.javascript.typeinfo.model.impl;

import org.eclipse.dltk.javascript.typeinfo.TypeUtil;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;
import org.eclipse.dltk.javascript.typeinfo.model.Member;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage;
import org.eclipse.dltk.javascript.typeinfo.model.SimpleType;
import org.eclipse.dltk.javascript.typeinfo.model.TypedElement;
import org.eclipse.dltk.javascript.typeinfo.model.Visibility;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Member</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.impl.MemberImpl#getType <em>Type</em>}</li>
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.impl.MemberImpl#getDirectType <em>Direct Type</em>}</li>
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.impl.MemberImpl#isStatic <em>Static</em>}</li>
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.impl.MemberImpl#getDeclaringType <em>Declaring Type</em>}</li>
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.impl.MemberImpl#getVisibility <em>Visibility</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class MemberImpl extends ElementImpl implements Member {
	/**
     * The cached value of the '{@link #getType() <em>Type</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getType()
     * @generated
     * @ordered
     */
    protected JSType type;

    /**
     * The default value of the '{@link #isStatic() <em>Static</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isStatic()
     * @generated
     * @ordered
     */
	protected static final boolean STATIC_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isStatic() <em>Static</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isStatic()
     * @generated
     * @ordered
     */
	protected boolean static_ = STATIC_EDEFAULT;

	/**
     * The default value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVisibility()
     * @generated
     * @ordered
     */
    protected static final Visibility VISIBILITY_EDEFAULT = Visibility.PUBLIC;

    /**
     * The cached value of the '{@link #getVisibility() <em>Visibility</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getVisibility()
     * @generated
     * @ordered
     */
    protected Visibility visibility = VISIBILITY_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected MemberImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return TypeInfoModelPackage.Literals.MEMBER;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public JSType getType() {
        return type;
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetType(JSType newType, NotificationChain msgs) {
        JSType oldType = type;
        type = newType;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypeInfoModelPackage.MEMBER__TYPE, oldType, newType);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setType(JSType newType) {
        if (newType != type) {
            NotificationChain msgs = null;
            if (type != null)
                msgs = ((InternalEObject)type).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypeInfoModelPackage.MEMBER__TYPE, null, msgs);
            if (newType != null)
                msgs = ((InternalEObject)newType).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypeInfoModelPackage.MEMBER__TYPE, null, msgs);
            msgs = basicSetType(newType, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypeInfoModelPackage.MEMBER__TYPE, newType, newType));
    }

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
    public Type getDirectType() {
		return type instanceof SimpleType ? ((SimpleType) type).getTarget() : null;
    }

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
    public void setDirectType(Type newDirectType) {
		setType(TypeUtil.ref(newDirectType));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isStatic() {
        return static_;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setStatic(boolean newStatic) {
        boolean oldStatic = static_;
        static_ = newStatic;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypeInfoModelPackage.MEMBER__STATIC, oldStatic, static_));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Type getDeclaringType() {
        if (eContainerFeatureID() != TypeInfoModelPackage.MEMBER__DECLARING_TYPE) return null;
        return (Type)eContainer();
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Visibility getVisibility() {
        return visibility;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setVisibility(Visibility newVisibility) {
        Visibility oldVisibility = visibility;
        visibility = newVisibility == null ? VISIBILITY_EDEFAULT : newVisibility;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypeInfoModelPackage.MEMBER__VISIBILITY, oldVisibility, visibility));
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TypeInfoModelPackage.MEMBER__DECLARING_TYPE:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return eBasicSetContainer(otherEnd, TypeInfoModelPackage.MEMBER__DECLARING_TYPE, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TypeInfoModelPackage.MEMBER__TYPE:
                return basicSetType(null, msgs);
            case TypeInfoModelPackage.MEMBER__DECLARING_TYPE:
                return eBasicSetContainer(null, TypeInfoModelPackage.MEMBER__DECLARING_TYPE, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case TypeInfoModelPackage.MEMBER__DECLARING_TYPE:
                return eInternalContainer().eInverseRemove(this, TypeInfoModelPackage.TYPE__MEMBERS, Type.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case TypeInfoModelPackage.MEMBER__TYPE:
                return getType();
            case TypeInfoModelPackage.MEMBER__DIRECT_TYPE:
                return getDirectType();
            case TypeInfoModelPackage.MEMBER__STATIC:
                return isStatic();
            case TypeInfoModelPackage.MEMBER__DECLARING_TYPE:
                return getDeclaringType();
            case TypeInfoModelPackage.MEMBER__VISIBILITY:
                return getVisibility();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case TypeInfoModelPackage.MEMBER__TYPE:
                setType((JSType)newValue);
                return;
            case TypeInfoModelPackage.MEMBER__DIRECT_TYPE:
                setDirectType((Type)newValue);
                return;
            case TypeInfoModelPackage.MEMBER__STATIC:
                setStatic((Boolean)newValue);
                return;
            case TypeInfoModelPackage.MEMBER__VISIBILITY:
                setVisibility((Visibility)newValue);
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
            case TypeInfoModelPackage.MEMBER__TYPE:
                setType((JSType)null);
                return;
            case TypeInfoModelPackage.MEMBER__DIRECT_TYPE:
                setDirectType((Type)null);
                return;
            case TypeInfoModelPackage.MEMBER__STATIC:
                setStatic(STATIC_EDEFAULT);
                return;
            case TypeInfoModelPackage.MEMBER__VISIBILITY:
                setVisibility(VISIBILITY_EDEFAULT);
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
            case TypeInfoModelPackage.MEMBER__TYPE:
                return type != null;
            case TypeInfoModelPackage.MEMBER__DIRECT_TYPE:
                return getDirectType() != null;
            case TypeInfoModelPackage.MEMBER__STATIC:
                return static_ != STATIC_EDEFAULT;
            case TypeInfoModelPackage.MEMBER__DECLARING_TYPE:
                return getDeclaringType() != null;
            case TypeInfoModelPackage.MEMBER__VISIBILITY:
                return visibility != VISIBILITY_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
        if (baseClass == TypedElement.class) {
            switch (derivedFeatureID) {
                case TypeInfoModelPackage.MEMBER__TYPE: return TypeInfoModelPackage.TYPED_ELEMENT__TYPE;
                case TypeInfoModelPackage.MEMBER__DIRECT_TYPE: return TypeInfoModelPackage.TYPED_ELEMENT__DIRECT_TYPE;
                default: return -1;
            }
        }
        return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
        if (baseClass == TypedElement.class) {
            switch (baseFeatureID) {
                case TypeInfoModelPackage.TYPED_ELEMENT__TYPE: return TypeInfoModelPackage.MEMBER__TYPE;
                case TypeInfoModelPackage.TYPED_ELEMENT__DIRECT_TYPE: return TypeInfoModelPackage.MEMBER__DIRECT_TYPE;
                default: return -1;
            }
        }
        return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
    }

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (static: "); //$NON-NLS-1$
        result.append(static_);
        result.append(", visibility: "); //$NON-NLS-1$
        result.append(visibility);
        result.append(')');
        return result.toString();
    }

} //MemberImpl
