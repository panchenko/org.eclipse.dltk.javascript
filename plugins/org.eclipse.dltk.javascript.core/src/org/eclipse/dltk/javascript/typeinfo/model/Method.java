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
 * $Id: Method.java,v 1.1 2010/03/03 13:14:31 apanchenk Exp $
 */
package org.eclipse.dltk.javascript.typeinfo.model;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Method</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.Method#getParameters <em>Parameters</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage#getMethod()
 * @model
 * @generated
 */
public interface Method extends Member {
	/**
	 * Returns the value of the '<em><b>Parameters</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.dltk.javascript.typeinfo.model.Parameter}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parameters</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parameters</em>' containment reference list.
	 * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage#getMethod_Parameters()
	 * @model containment="true"
	 * @generated
	 */
	EList<Parameter> getParameters();

} // Method
