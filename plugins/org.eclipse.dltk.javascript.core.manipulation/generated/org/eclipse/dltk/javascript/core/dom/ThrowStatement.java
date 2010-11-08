/**
 * <copyright>
 * </copyright>
 *
 * $Id: ThrowStatement.java,v 1.1 2010/11/08 00:20:21 apanchenk Exp $
 */
package org.eclipse.dltk.javascript.core.dom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Throw Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.dltk.javascript.core.dom.ThrowStatement#getException <em>Exception</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.dltk.javascript.core.dom.DomPackage#getThrowStatement()
 * @model
 * @generated
 */
public interface ThrowStatement extends Statement {
	/**
	 * Returns the value of the '<em><b>Exception</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exception</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exception</em>' containment reference.
	 * @see #setException(Expression)
	 * @see org.eclipse.dltk.javascript.core.dom.DomPackage#getThrowStatement_Exception()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getException();

	/**
	 * Sets the value of the '{@link org.eclipse.dltk.javascript.core.dom.ThrowStatement#getException <em>Exception</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exception</em>' containment reference.
	 * @see #getException()
	 * @generated
	 */
	void setException(Expression value);

} // ThrowStatement
