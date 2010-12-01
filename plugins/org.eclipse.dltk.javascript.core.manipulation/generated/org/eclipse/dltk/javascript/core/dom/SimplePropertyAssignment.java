/**
 * <copyright>
 * </copyright>
 *
 * $Id: SimplePropertyAssignment.java,v 1.2 2010/12/01 09:31:18 apanchenk Exp $
 */
package org.eclipse.dltk.javascript.core.dom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Simple Property Assignment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.dltk.javascript.core.dom.SimplePropertyAssignment#getInitializer <em>Initializer</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.dltk.javascript.core.dom.DomPackage#getSimplePropertyAssignment()
 * @model
 * @generated
 */
public interface SimplePropertyAssignment extends PropertyAssignment {
	/**
     * Returns the value of the '<em><b>Initializer</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Initializer</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Initializer</em>' containment reference.
     * @see #setInitializer(Expression)
     * @see org.eclipse.dltk.javascript.core.dom.DomPackage#getSimplePropertyAssignment_Initializer()
     * @model containment="true" required="true"
     * @generated
     */
	Expression getInitializer();

	/**
     * Sets the value of the '{@link org.eclipse.dltk.javascript.core.dom.SimplePropertyAssignment#getInitializer <em>Initializer</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Initializer</em>' containment reference.
     * @see #getInitializer()
     * @generated
     */
	void setInitializer(Expression value);

} // SimplePropertyAssignment
