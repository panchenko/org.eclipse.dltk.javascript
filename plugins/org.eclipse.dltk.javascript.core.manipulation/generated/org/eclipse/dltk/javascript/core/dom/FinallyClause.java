/**
 * <copyright>
 * </copyright>
 *
 * $Id: FinallyClause.java,v 1.2 2010/12/01 09:31:18 apanchenk Exp $
 */
package org.eclipse.dltk.javascript.core.dom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Finally Clause</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.dltk.javascript.core.dom.FinallyClause#getBody <em>Body</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.dltk.javascript.core.dom.DomPackage#getFinallyClause()
 * @model
 * @generated
 */
public interface FinallyClause extends Node {
	/**
     * Returns the value of the '<em><b>Body</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Body</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Body</em>' containment reference.
     * @see #setBody(BlockStatement)
     * @see org.eclipse.dltk.javascript.core.dom.DomPackage#getFinallyClause_Body()
     * @model containment="true" required="true"
     * @generated
     */
	BlockStatement getBody();

	/**
     * Sets the value of the '{@link org.eclipse.dltk.javascript.core.dom.FinallyClause#getBody <em>Body</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Body</em>' containment reference.
     * @see #getBody()
     * @generated
     */
	void setBody(BlockStatement value);

} // FinallyClause
