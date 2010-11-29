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
 * $Id: ParameterKind.java,v 1.2 2010/11/29 16:28:05 apanchenk Exp $
 */
package org.eclipse.dltk.javascript.typeinfo.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Parameter Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage#getParameterKind()
 * @model
 * @generated
 */
public enum ParameterKind implements Enumerator {
	/**
     * The '<em><b>NORMAL</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #NORMAL_VALUE
     * @generated
     * @ordered
     */
	NORMAL(0, "NORMAL", "NORMAL"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
     * The '<em><b>OPTIONAL</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #OPTIONAL_VALUE
     * @generated
     * @ordered
     */
	OPTIONAL(1, "OPTIONAL", "OPTIONAL"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
     * The '<em><b>VARARGS</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #VARARGS_VALUE
     * @generated
     * @ordered
     */
	VARARGS(2, "VARARGS", "VARARGS"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
     * The '<em><b>NORMAL</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>NORMAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #NORMAL
     * @model
     * @generated
     * @ordered
     */
	public static final int NORMAL_VALUE = 0;

	/**
     * The '<em><b>OPTIONAL</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>OPTIONAL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #OPTIONAL
     * @model
     * @generated
     * @ordered
     */
	public static final int OPTIONAL_VALUE = 1;

	/**
     * The '<em><b>VARARGS</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>VARARGS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #VARARGS
     * @model
     * @generated
     * @ordered
     */
	public static final int VARARGS_VALUE = 2;

	/**
     * An array of all the '<em><b>Parameter Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final ParameterKind[] VALUES_ARRAY =
		new ParameterKind[] {
            NORMAL,
            OPTIONAL,
            VARARGS,
        };

	/**
     * A public read-only list of all the '<em><b>Parameter Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<ParameterKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Parameter Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static ParameterKind get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ParameterKind result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Parameter Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static ParameterKind getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ParameterKind result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Parameter Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static ParameterKind get(int value) {
        switch (value) {
            case NORMAL_VALUE: return NORMAL;
            case OPTIONAL_VALUE: return OPTIONAL;
            case VARARGS_VALUE: return VARARGS;
        }
        return null;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private final int value;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private final String name;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private final String literal;

	/**
     * Only this class can construct instances.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private ParameterKind(int value, String name, String literal) {
        this.value = value;
        this.name = name;
        this.literal = literal;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public int getValue() {
      return value;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getName() {
      return name;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getLiteral() {
      return literal;
    }

	/**
     * Returns the literal value of the enumerator, which is its string representation.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public String toString() {
        return literal;
    }
	
} //ParameterKind
