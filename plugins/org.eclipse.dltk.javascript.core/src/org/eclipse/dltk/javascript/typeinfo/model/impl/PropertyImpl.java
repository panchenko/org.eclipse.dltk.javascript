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
 * $Id: PropertyImpl.java,v 1.1 2010/03/03 13:14:32 apanchenk Exp $
 */
package org.eclipse.dltk.javascript.typeinfo.model.impl;

import org.eclipse.dltk.javascript.typeinfo.model.Property;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Property</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PropertyImpl extends MemberImpl implements Property {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PropertyImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TypeInfoModelPackage.Literals.PROPERTY;
	}

} //PropertyImpl
