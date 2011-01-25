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
 * $Id: Element.java,v 1.7 2011/01/25 12:47:12 apanchenk Exp $
 */
package org.eclipse.dltk.javascript.typeinfo.model;

import org.eclipse.emf.common.util.EMap;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.Element#isDeprecated <em>Deprecated</em>}</li>
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.Element#getDescription <em>Description</em>}</li>
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.Element#isVisible <em>Visible</em>}</li>
 *   <li>{@link org.eclipse.dltk.javascript.typeinfo.model.Element#getAttributes <em>Attributes</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage#getElement()
 * @model abstract="true"
 * @generated
 */
public interface Element extends NamedElement {
	/**
     * Returns the value of the '<em><b>Deprecated</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Deprecated</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Deprecated</em>' attribute.
     * @see #setDeprecated(boolean)
     * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage#getElement_Deprecated()
     * @model
     * @generated
     */
	boolean isDeprecated();

	/**
     * Sets the value of the '{@link org.eclipse.dltk.javascript.typeinfo.model.Element#isDeprecated <em>Deprecated</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Deprecated</em>' attribute.
     * @see #isDeprecated()
     * @generated
     */
	void setDeprecated(boolean value);

	/**
     * Returns the value of the '<em><b>Description</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Description</em>' attribute.
     * @see #setDescription(String)
     * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage#getElement_Description()
     * @model
     * @generated
     */
	String getDescription();

	/**
     * Sets the value of the '{@link org.eclipse.dltk.javascript.typeinfo.model.Element#getDescription <em>Description</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Description</em>' attribute.
     * @see #getDescription()
     * @generated
     */
	void setDescription(String value);

	/**
     * Returns the value of the '<em><b>Visible</b></em>' attribute.
     * The default value is <code>"true"</code>.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Visible</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Visible</em>' attribute.
     * @see #setVisible(boolean)
     * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage#getElement_Visible()
     * @model default="true"
     * @generated
     */
	boolean isVisible();

	/**
     * Sets the value of the '{@link org.eclipse.dltk.javascript.typeinfo.model.Element#isVisible <em>Visible</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Visible</em>' attribute.
     * @see #isVisible()
     * @generated
     */
	void setVisible(boolean value);

	/**
     * Returns the value of the '<em><b>Attributes</b></em>' map.
     * The key is of type {@link java.lang.String},
     * and the value is of type {@link java.lang.Object},
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Attributes</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Attributes</em>' map.
     * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage#getElement_Attributes()
     * @model mapType="org.eclipse.dltk.javascript.typeinfo.model.AttributeEntry<org.eclipse.emf.ecore.EString, org.eclipse.emf.ecore.EJavaObject>"
     * @generated
     */
	EMap<String, Object> getAttributes();

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model
     * @generated
     */
	Object getAttribute(String name);

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @model
     * @generated
     */
	void setAttribute(String name, Object value);

} // Element
