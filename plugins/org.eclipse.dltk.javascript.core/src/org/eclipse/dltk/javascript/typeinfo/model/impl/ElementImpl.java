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
 * $Id: ElementImpl.java,v 1.8 2011/01/25 12:47:13 apanchenk Exp $
 */
package org.eclipse.dltk.javascript.typeinfo.model.impl;

import org.eclipse.dltk.javascript.typeinfo.model.Element;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EMap;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EcoreEMap;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.impl.ElementImpl#isDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.impl.ElementImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.impl.ElementImpl#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.impl.ElementImpl#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public abstract class ElementImpl extends NamedElementImpl implements Element {
	/**
     * The default value of the '{@link #isDeprecated() <em>Deprecated</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isDeprecated()
     * @generated
     * @ordered
     */
	protected static final boolean DEPRECATED_EDEFAULT = false;

	/**
     * The cached value of the '{@link #isDeprecated() <em>Deprecated</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isDeprecated()
     * @generated
     * @ordered
     */
	protected boolean deprecated = DEPRECATED_EDEFAULT;

	/**
     * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDescription()
     * @generated
     * @ordered
     */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
     * The default value of the '{@link #isVisible() <em>Visible</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isVisible()
     * @generated
     * @ordered
     */
	protected static final boolean VISIBLE_EDEFAULT = true;

	/**
     * The cached value of the '{@link #isVisible() <em>Visible</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #isVisible()
     * @generated
     * @ordered
     */
	protected boolean visible = VISIBLE_EDEFAULT;

	/**
     * The cached value of the '{@link #getAttributes() <em>Attributes</em>}' map.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAttributes()
     * @generated
     * @ordered
     */
	protected EMap<String, Object> attributes;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ElementImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return TypeInfoModelPackage.Literals.ELEMENT;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isDeprecated() {
        return deprecated;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDeprecated(boolean newDeprecated) {
        boolean oldDeprecated = deprecated;
        deprecated = newDeprecated;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypeInfoModelPackage.ELEMENT__DEPRECATED, oldDeprecated, deprecated));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getDescription() {
        return description;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDescription(String newDescription) {
        String oldDescription = description;
        description = newDescription;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypeInfoModelPackage.ELEMENT__DESCRIPTION, oldDescription, description));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public boolean isVisible() {
        return visible;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setVisible(boolean newVisible) {
        boolean oldVisible = visible;
        visible = newVisible;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, TypeInfoModelPackage.ELEMENT__VISIBLE, oldVisible, visible));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EMap<String, Object> getAttributes() {
        if (attributes == null) {
            attributes = new EcoreEMap<String,Object>(TypeInfoModelPackage.Literals.ATTRIBUTE_ENTRY, AttributeEntryImpl.class, this, TypeInfoModelPackage.ELEMENT__ATTRIBUTES);
        }
        return attributes;
    }

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public Object getAttribute(String name) {
		return getAttributes().get(name);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public void setAttribute(String name, Object value) {
		if (value == null) {
			getAttributes().remove(name);
		} else {
			getAttributes().put(name, value);
		}
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case TypeInfoModelPackage.ELEMENT__ATTRIBUTES:
                return ((InternalEList<?>)getAttributes()).basicRemove(otherEnd, msgs);
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
            case TypeInfoModelPackage.ELEMENT__DEPRECATED:
                return isDeprecated();
            case TypeInfoModelPackage.ELEMENT__DESCRIPTION:
                return getDescription();
            case TypeInfoModelPackage.ELEMENT__VISIBLE:
                return isVisible();
            case TypeInfoModelPackage.ELEMENT__ATTRIBUTES:
                if (coreType) return getAttributes();
                else return getAttributes().map();
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
            case TypeInfoModelPackage.ELEMENT__DEPRECATED:
                setDeprecated((Boolean)newValue);
                return;
            case TypeInfoModelPackage.ELEMENT__DESCRIPTION:
                setDescription((String)newValue);
                return;
            case TypeInfoModelPackage.ELEMENT__VISIBLE:
                setVisible((Boolean)newValue);
                return;
            case TypeInfoModelPackage.ELEMENT__ATTRIBUTES:
                ((EStructuralFeature.Setting)getAttributes()).set(newValue);
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
            case TypeInfoModelPackage.ELEMENT__DEPRECATED:
                setDeprecated(DEPRECATED_EDEFAULT);
                return;
            case TypeInfoModelPackage.ELEMENT__DESCRIPTION:
                setDescription(DESCRIPTION_EDEFAULT);
                return;
            case TypeInfoModelPackage.ELEMENT__VISIBLE:
                setVisible(VISIBLE_EDEFAULT);
                return;
            case TypeInfoModelPackage.ELEMENT__ATTRIBUTES:
                getAttributes().clear();
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
            case TypeInfoModelPackage.ELEMENT__DEPRECATED:
                return deprecated != DEPRECATED_EDEFAULT;
            case TypeInfoModelPackage.ELEMENT__DESCRIPTION:
                return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
            case TypeInfoModelPackage.ELEMENT__VISIBLE:
                return visible != VISIBLE_EDEFAULT;
            case TypeInfoModelPackage.ELEMENT__ATTRIBUTES:
                return attributes != null && !attributes.isEmpty();
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
			return getClass().getSimpleName() + "(eProxyURI=" + eProxyURI()
					+ ')';
		}

		StringBuffer result = new StringBuffer(eClass().getName());
		result.append(" (name: "); //$NON-NLS-1$
		result.append(name);
		result.append(", deprecated: "); //$NON-NLS-1$
		result.append(deprecated);
		result.append(')');
		return result.toString();
	}

} //ElementImpl
