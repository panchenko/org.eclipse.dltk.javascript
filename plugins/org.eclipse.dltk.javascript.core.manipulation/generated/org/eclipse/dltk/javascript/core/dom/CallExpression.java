/**
 * <copyright>
 * </copyright>
 *
 * $Id: CallExpression.java,v 1.1 2010/11/08 00:20:20 apanchenk Exp $
 */
package org.eclipse.dltk.javascript.core.dom;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Call Expression</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.dltk.javascript.core.dom.CallExpression#getApplicant <em>Applicant</em>}</li>
 *   <li>{@link org.eclipse.dltk.javascript.core.dom.CallExpression#getArguments <em>Arguments</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.dltk.javascript.core.dom.DomPackage#getCallExpression()
 * @model
 * @generated
 */
public interface CallExpression extends Expression {
	/**
	 * Returns the value of the '<em><b>Applicant</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Applicant</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Applicant</em>' containment reference.
	 * @see #setApplicant(Expression)
	 * @see org.eclipse.dltk.javascript.core.dom.DomPackage#getCallExpression_Applicant()
	 * @model containment="true" required="true"
	 * @generated
	 */
	Expression getApplicant();

	/**
	 * Sets the value of the '{@link org.eclipse.dltk.javascript.core.dom.CallExpression#getApplicant <em>Applicant</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Applicant</em>' containment reference.
	 * @see #getApplicant()
	 * @generated
	 */
	void setApplicant(Expression value);

	/**
	 * Returns the value of the '<em><b>Arguments</b></em>' containment reference list.
	 * The list contents are of type {@link org.eclipse.dltk.javascript.core.dom.Expression}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Arguments</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Arguments</em>' containment reference list.
	 * @see org.eclipse.dltk.javascript.core.dom.DomPackage#getCallExpression_Arguments()
	 * @model containment="true"
	 * @generated
	 */
	EList<Expression> getArguments();

} // CallExpression
