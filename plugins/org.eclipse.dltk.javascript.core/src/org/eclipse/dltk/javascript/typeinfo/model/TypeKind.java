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
 * $Id: TypeKind.java,v 1.9 2011/11/16 11:57:43 apanchenk Exp $
 */
package org.eclipse.dltk.javascript.typeinfo.model;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Type Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelPackage#getTypeKind()
 * @model
 * @generated
 */
public enum TypeKind implements Enumerator {
	/**
     * The '<em><b>UNKNOWN</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #UNKNOWN_VALUE
     * @generated
     * @ordered
     */
	UNKNOWN(-1, "UNKNOWN", "UNKNOWN"), /**
     * The '<em><b>UNRESOLVED</b></em>' literal object.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #UNRESOLVED_VALUE
     * @generated
     * @ordered
     */
	UNRESOLVED(-2, "UNRESOLVED", "UNRESOLVED"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
     * The '<em><b>PREDEFINED</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #PREDEFINED_VALUE
     * @generated
     * @ordered
     */
	PREDEFINED(0, "PREDEFINED", "PREDEFINED"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
     * The '<em><b>JAVASCRIPT</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #JAVASCRIPT_VALUE
     * @generated
     * @ordered
     */
	JAVASCRIPT(1, "JAVASCRIPT", "JAVASCRIPT"), //$NON-NLS-1$ //$NON-NLS-2$

	/**
     * The '<em><b>JAVA</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #JAVA_VALUE
     * @generated
     * @ordered
     */
	JAVA(2, "JAVA", "JAVA"); //$NON-NLS-1$ //$NON-NLS-2$

	/**
     * The '<em><b>UNKNOWN</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>UNKNOWN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #UNKNOWN
     * @model
     * @generated
     * @ordered
     */
	public static final int UNKNOWN_VALUE = -1;

    /**
     * The '<em><b>UNRESOLVED</b></em>' literal value.
     * <!-- begin-user-doc -->
     * <p>
     * If the meaning of '<em><b>UNRESOLVED</b></em>' literal object isn't clear,
     * there really should be more of a description here...
     * </p>
     * <!-- end-user-doc -->
     * @see #UNRESOLVED
     * @model
     * @generated
     * @ordered
     */
    public static final int UNRESOLVED_VALUE = -2;

	/**
     * The '<em><b>PREDEFINED</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>PREDEFINED</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #PREDEFINED
     * @model
     * @generated
     * @ordered
     */
	public static final int PREDEFINED_VALUE = 0;

	/**
     * The '<em><b>JAVASCRIPT</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JAVASCRIPT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #JAVASCRIPT
     * @model
     * @generated
     * @ordered
     */
	public static final int JAVASCRIPT_VALUE = 1;

	/**
     * The '<em><b>JAVA</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>JAVA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #JAVA
     * @model
     * @generated
     * @ordered
     */
	public static final int JAVA_VALUE = 2;

	/**
     * An array of all the '<em><b>Type Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final TypeKind[] VALUES_ARRAY =
		new TypeKind[] {
            UNKNOWN,
            UNRESOLVED,
            PREDEFINED,
            JAVASCRIPT,
            JAVA,
        };

	/**
     * A public read-only list of all the '<em><b>Type Kind</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<TypeKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Type Kind</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static TypeKind get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            TypeKind result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Type Kind</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static TypeKind getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            TypeKind result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Type Kind</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static TypeKind get(int value) {
        switch (value) {
            case UNKNOWN_VALUE: return UNKNOWN;
            case UNRESOLVED_VALUE: return UNRESOLVED;
            case PREDEFINED_VALUE: return PREDEFINED;
            case JAVASCRIPT_VALUE: return JAVASCRIPT;
            case JAVA_VALUE: return JAVA;
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
	private TypeKind(int value, String name, String literal) {
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
	
} //TypeKind
