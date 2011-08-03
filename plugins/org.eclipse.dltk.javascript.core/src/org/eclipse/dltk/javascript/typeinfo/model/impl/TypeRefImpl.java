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

import org.eclipse.dltk.javascript.typeinfo.TypeUtil;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage;
import org.eclipse.dltk.javascript.typeinfo.model.TypeKind;
import org.eclipse.dltk.javascript.typeinfo.model.TypeRef;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

/**
 * <!-- begin-user-doc --> An implementation of the model object '
 * <em><b>Type Ref</b></em>'. <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class TypeRefImpl extends SimpleTypeImpl implements TypeRef {
	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	protected TypeRefImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc --> <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return TypeInfoModelPackage.Literals.TYPE_REF;
    }

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public TypeKind getKind() {
		return target != null && !target.isProxy() ? target.getKind()
				: TypeKind.UNRESOLVED;
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @generated NOT
	 */
	public String getName() {
		if (target != null) {
			if (((EObject) target).eIsProxy()) {
				final URI uri = ((InternalEObject) target).eProxyURI();
				if (uri != null) {
					return URI.decode(uri.fragment());
				}
			} else {
				return target.getName();
			}
		}
		return null;
	}

	@Override
	public String toString() {
		return target != null ? target.toString() : getClass().getSimpleName();
	}

	@Override
	public EObject eResolveProxy(InternalEObject proxy) {
		return TypeUtil.resolve(proxy, this);
	}

} // TypeRefImpl
