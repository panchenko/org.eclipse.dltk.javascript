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
 * $Id: TypeImpl.java,v 1.8 2011/01/25 12:47:13 apanchenk Exp $
 */
package org.eclipse.dltk.javascript.typeinfo.model.impl;

import java.util.Collection;

import org.eclipse.dltk.internal.javascript.ti.ITypeInferenceContext;
import org.eclipse.dltk.javascript.typeinfo.model.Member;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage;
import org.eclipse.dltk.javascript.typeinfo.model.TypeKind;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Type</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.impl.TypeImpl#getMembers <em>Members</em>}</li>
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.impl.TypeImpl#getKind <em>Kind</em>}</li>
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.impl.TypeImpl#getSuperType <em>Super Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TypeImpl extends ElementImpl implements Type {
	/**
     * The cached value of the '{@link #getMembers() <em>Members</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMembers()
     * @generated
     * @ordered
     */
	protected EList<Member> members;

	/**
     * The default value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
	protected static final TypeKind KIND_EDEFAULT = TypeKind.UNKNOWN;

	/**
     * The cached value of the '{@link #getKind() <em>Kind</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getKind()
     * @generated
     * @ordered
     */
	protected TypeKind kind = KIND_EDEFAULT;

	/**
     * The cached value of the '{@link #getSuperType() <em>Super Type</em>}' reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSuperType()
     * @generated
     * @ordered
     */
    protected Type superType;

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected TypeImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return TypeInfoModelPackage.Literals.TYPE;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Member> getMembers() {
        if (members == null) {
            members = new EObjectContainmentWithInverseEList<Member>(Member.class, this, TypeInfoModelPackage.TYPE__MEMBERS, TypeInfoModelPackage.MEMBER__DECLARING_TYPE);
        }
        return members;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public TypeKind getKind() {
        return kind;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setKind(TypeKind newKind) {
        TypeKind oldKind = kind;
        kind = newKind == null ? KIND_EDEFAULT : newKind;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypeInfoModelPackage.TYPE__KIND, oldKind, kind));
    }

	/**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Type getSuperType() {
        if (superType != null && ((EObject)superType).eIsProxy()) {
            InternalEObject oldSuperType = (InternalEObject)superType;
            superType = (Type)eResolveProxy(oldSuperType);
            if (superType != oldSuperType) {
                if (eNotificationRequired())
                    eNotify(new ENotificationImpl(this, Notification.RESOLVE, TypeInfoModelPackage.TYPE__SUPER_TYPE, oldSuperType, superType));
            }
        }
        return superType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Type basicGetSuperType() {
        return superType;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSuperType(Type newSuperType) {
        Type oldSuperType = superType;
        superType = newSuperType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypeInfoModelPackage.TYPE__SUPER_TYPE, oldSuperType, superType));
    }

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getComponentType() {
		return (String) getAttribute(ITypeInferenceContext.GENERIC_ARRAY_TYPE);
	}

    /**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TypeInfoModelPackage.TYPE__MEMBERS:
                return ((InternalEList<InternalEObject>)(InternalEList<?>)getMembers()).basicAdd(otherEnd, msgs);
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
            case TypeInfoModelPackage.TYPE__MEMBERS:
                return ((InternalEList<?>)getMembers()).basicRemove(otherEnd, msgs);
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
            case TypeInfoModelPackage.TYPE__MEMBERS:
                return getMembers();
            case TypeInfoModelPackage.TYPE__KIND:
                return getKind();
            case TypeInfoModelPackage.TYPE__SUPER_TYPE:
                if (resolve) return getSuperType();
                return basicGetSuperType();
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
            case TypeInfoModelPackage.TYPE__MEMBERS:
                getMembers().clear();
                getMembers().addAll((Collection<? extends Member>)newValue);
                return;
            case TypeInfoModelPackage.TYPE__KIND:
                setKind((TypeKind)newValue);
                return;
            case TypeInfoModelPackage.TYPE__SUPER_TYPE:
                setSuperType((Type)newValue);
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
            case TypeInfoModelPackage.TYPE__MEMBERS:
                getMembers().clear();
                return;
            case TypeInfoModelPackage.TYPE__KIND:
                setKind(KIND_EDEFAULT);
                return;
            case TypeInfoModelPackage.TYPE__SUPER_TYPE:
                setSuperType((Type)null);
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
            case TypeInfoModelPackage.TYPE__MEMBERS:
                return members != null && !members.isEmpty();
            case TypeInfoModelPackage.TYPE__KIND:
                return kind != KIND_EDEFAULT;
            case TypeInfoModelPackage.TYPE__SUPER_TYPE:
                return superType != null;
        }
        return super.eIsSet(featureID);
    }

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String toString() {
		if (eIsProxy()) {
			return eClass().getName() + "(eProxyURI=" + eProxyURI() + ')';
		}

		StringBuffer result = new StringBuffer(eClass().getName());
		result.append('<');
		result.append(name);
		result.append('>');
		return result.toString();
	}

} //TypeImpl
