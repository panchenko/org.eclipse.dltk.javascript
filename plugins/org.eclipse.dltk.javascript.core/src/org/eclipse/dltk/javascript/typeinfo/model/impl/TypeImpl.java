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
 * $Id: TypeImpl.java,v 1.24 2012/06/25 13:28:45 apanchenk Exp $
 */
package org.eclipse.dltk.javascript.typeinfo.model.impl;

import java.util.Collection;

import org.eclipse.dltk.core.Predicate;
import org.eclipse.dltk.internal.javascript.ti.ElementValue;
import org.eclipse.dltk.javascript.typeinference.IAssignProtection;
import org.eclipse.dltk.javascript.typeinfo.IRType;
import org.eclipse.dltk.javascript.typeinfo.JSTypeSet.SimpleTypeKey;
import org.eclipse.dltk.javascript.typeinfo.TypeUtil;
import org.eclipse.dltk.javascript.typeinfo.model.Constructor;
import org.eclipse.dltk.javascript.typeinfo.model.Member;
import org.eclipse.dltk.javascript.typeinfo.model.Property;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage;
import org.eclipse.dltk.javascript.typeinfo.model.TypeKind;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.EObjectResolvingEList;
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
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.impl.TypeImpl#getStaticConstructor <em>Static Constructor</em>}</li>
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.impl.TypeImpl#getTraits <em>Traits</em>}</li>
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.impl.TypeImpl#isExtensible <em>Extensible</em>}</li>
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.impl.TypeImpl#getConstructors <em>Constructors</em>}</li>
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.impl.TypeImpl#isInstantiable <em>Instantiable</em>}</li>
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.impl.TypeImpl#isInheritConstructors <em>Inherit Constructors</em>}</li>
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.impl.TypeImpl#isInheritStaticMembers <em>Inherit Static Members</em>}</li>
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
	protected static final TypeKind KIND_EDEFAULT = TypeKind.DEFAULT;

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
     * The cached value of the '{@link #getStaticConstructor() <em>Static Constructor</em>}' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getStaticConstructor()
     * @generated
     * @ordered
     */
    protected Constructor staticConstructor;

    /**
     * The cached value of the '{@link #getTraits() <em>Traits</em>}' reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getTraits()
     * @generated
     * @ordered
     */
    protected EList<Type> traits;

    /**
     * The default value of the '{@link #isExtensible() <em>Extensible</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isExtensible()
     * @generated
     * @ordered
     */
    protected static final boolean EXTENSIBLE_EDEFAULT = false;

    /**
     * The cached value of the '{@link #isExtensible() <em>Extensible</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isExtensible()
     * @generated
     * @ordered
     */
    protected boolean extensible = EXTENSIBLE_EDEFAULT;

    /**
     * The cached value of the '{@link #getConstructors() <em>Constructors</em>}' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getConstructors()
     * @generated
     * @ordered
     */
    protected EList<Constructor> constructors;

    /**
     * The default value of the '{@link #isInstantiable() <em>Instantiable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isInstantiable()
     * @generated
     * @ordered
     */
    protected static final boolean INSTANTIABLE_EDEFAULT = true;

    /**
     * The cached value of the '{@link #isInstantiable() <em>Instantiable</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isInstantiable()
     * @generated
     * @ordered
     */
    protected boolean instantiable = INSTANTIABLE_EDEFAULT;

    /**
     * The default value of the '{@link #isInheritConstructors() <em>Inherit Constructors</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isInheritConstructors()
     * @generated
     * @ordered
     */
    protected static final boolean INHERIT_CONSTRUCTORS_EDEFAULT = false;

    /**
     * The default value of the '{@link #isInheritStaticMembers() <em>Inherit Static Members</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #isInheritStaticMembers()
     * @generated
     * @ordered
     */
    protected static final boolean INHERIT_STATIC_MEMBERS_EDEFAULT = false;

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

	@Override
	public String getName() {
		if (isProxy()) {
			return URI.decode(eProxyURI().fragment());
		}
		return super.getName();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public TypeKind getKind() {
		if (isProxy()) {
			return TypeKind.UNRESOLVED;
		}
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
        if (superType != null && superType.eIsProxy()) {
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
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Constructor getStaticConstructor() {
        return staticConstructor;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetStaticConstructor(Constructor newStaticConstructor, NotificationChain msgs) {
        Constructor oldStaticConstructor = staticConstructor;
        staticConstructor = newStaticConstructor;
        if (eNotificationRequired()) {
            ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TypeInfoModelPackage.TYPE__STATIC_CONSTRUCTOR, oldStaticConstructor, newStaticConstructor);
            if (msgs == null) msgs = notification; else msgs.add(notification);
        }
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setStaticConstructor(Constructor newStaticConstructor) {
        if (newStaticConstructor != staticConstructor) {
            NotificationChain msgs = null;
            if (staticConstructor != null)
                msgs = ((InternalEObject)staticConstructor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TypeInfoModelPackage.TYPE__STATIC_CONSTRUCTOR, null, msgs);
            if (newStaticConstructor != null)
                msgs = ((InternalEObject)newStaticConstructor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TypeInfoModelPackage.TYPE__STATIC_CONSTRUCTOR, null, msgs);
            msgs = basicSetStaticConstructor(newStaticConstructor, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypeInfoModelPackage.TYPE__STATIC_CONSTRUCTOR, newStaticConstructor, newStaticConstructor));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Type> getTraits() {
        if (traits == null) {
            traits = new EObjectResolvingEList<Type>(Type.class, this, TypeInfoModelPackage.TYPE__TRAITS);
        }
        return traits;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isExtensible() {
        return extensible;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setExtensible(boolean newExtensible) {
        boolean oldExtensible = extensible;
        extensible = newExtensible;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypeInfoModelPackage.TYPE__EXTENSIBLE, oldExtensible, extensible));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public EList<Constructor> getConstructors() {
        if (constructors == null) {
            constructors = new EObjectContainmentEList<Constructor>(Constructor.class, this, TypeInfoModelPackage.TYPE__CONSTRUCTORS);
        }
        return constructors;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public boolean isInstantiable() {
        return instantiable;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setInstantiable(boolean newInstantiable) {
        boolean oldInstantiable = instantiable;
        instantiable = newInstantiable;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypeInfoModelPackage.TYPE__INSTANTIABLE, oldInstantiable, instantiable));
    }

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
    public boolean isInheritConstructors() {
		return false;
    }

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public boolean isInheritStaticMembers() {
		return getKind() == TypeKind.JAVA;
	}

    /**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
    public boolean isProxy() {
		return eIsProxy();
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
            case TypeInfoModelPackage.TYPE__STATIC_CONSTRUCTOR:
                return basicSetStaticConstructor(null, msgs);
            case TypeInfoModelPackage.TYPE__CONSTRUCTORS:
                return ((InternalEList<?>)getConstructors()).basicRemove(otherEnd, msgs);
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
            case TypeInfoModelPackage.TYPE__STATIC_CONSTRUCTOR:
                return getStaticConstructor();
            case TypeInfoModelPackage.TYPE__TRAITS:
                return getTraits();
            case TypeInfoModelPackage.TYPE__EXTENSIBLE:
                return isExtensible();
            case TypeInfoModelPackage.TYPE__CONSTRUCTORS:
                return getConstructors();
            case TypeInfoModelPackage.TYPE__INSTANTIABLE:
                return isInstantiable();
            case TypeInfoModelPackage.TYPE__INHERIT_CONSTRUCTORS:
                return isInheritConstructors();
            case TypeInfoModelPackage.TYPE__INHERIT_STATIC_MEMBERS:
                return isInheritStaticMembers();
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
            case TypeInfoModelPackage.TYPE__STATIC_CONSTRUCTOR:
                setStaticConstructor((Constructor)newValue);
                return;
            case TypeInfoModelPackage.TYPE__TRAITS:
                getTraits().clear();
                getTraits().addAll((Collection<? extends Type>)newValue);
                return;
            case TypeInfoModelPackage.TYPE__EXTENSIBLE:
                setExtensible((Boolean)newValue);
                return;
            case TypeInfoModelPackage.TYPE__CONSTRUCTORS:
                getConstructors().clear();
                getConstructors().addAll((Collection<? extends Constructor>)newValue);
                return;
            case TypeInfoModelPackage.TYPE__INSTANTIABLE:
                setInstantiable((Boolean)newValue);
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
            case TypeInfoModelPackage.TYPE__STATIC_CONSTRUCTOR:
                setStaticConstructor((Constructor)null);
                return;
            case TypeInfoModelPackage.TYPE__TRAITS:
                getTraits().clear();
                return;
            case TypeInfoModelPackage.TYPE__EXTENSIBLE:
                setExtensible(EXTENSIBLE_EDEFAULT);
                return;
            case TypeInfoModelPackage.TYPE__CONSTRUCTORS:
                getConstructors().clear();
                return;
            case TypeInfoModelPackage.TYPE__INSTANTIABLE:
                setInstantiable(INSTANTIABLE_EDEFAULT);
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
            case TypeInfoModelPackage.TYPE__STATIC_CONSTRUCTOR:
                return staticConstructor != null;
            case TypeInfoModelPackage.TYPE__TRAITS:
                return traits != null && !traits.isEmpty();
            case TypeInfoModelPackage.TYPE__EXTENSIBLE:
                return extensible != EXTENSIBLE_EDEFAULT;
            case TypeInfoModelPackage.TYPE__CONSTRUCTORS:
                return constructors != null && !constructors.isEmpty();
            case TypeInfoModelPackage.TYPE__INSTANTIABLE:
                return instantiable != INSTANTIABLE_EDEFAULT;
            case TypeInfoModelPackage.TYPE__INHERIT_CONSTRUCTORS:
                return isInheritConstructors() != INHERIT_CONSTRUCTORS_EDEFAULT;
            case TypeInfoModelPackage.TYPE__INHERIT_STATIC_MEMBERS:
                return isInheritStaticMembers() != INHERIT_STATIC_MEMBERS_EDEFAULT;
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

	@Override
	public EObject eResolveProxy(InternalEObject proxy) {
		return TypeUtil.resolve(proxy, this);
	}

	public Predicate<Member> memberPredicateFor(IRType type,
			Predicate<Member> predicate) {
		return predicate;
	}

	public IRType createInstance() {
		return new SimpleTypeKey(this);
	}

	public Member[] getAdditionalMembers() {
		return null;
	}

	public IAssignProtection getReadOnlyStatus(Property property) {
		return property.isReadOnly() ? ElementValue.READONLY_PROPERTY : null;
	}

} //TypeImpl
