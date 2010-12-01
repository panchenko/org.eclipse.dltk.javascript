/**
 * <copyright>
 * </copyright>
 *
 * $Id: WhileStatement.java,v 1.2 2010/12/01 09:31:18 apanchenk Exp $
 */
package org.eclipse.dltk.javascript.core.dom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>While Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.dltk.javascript.core.dom.WhileStatement#getCondition <em>Condition</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.dltk.javascript.core.dom.DomPackage#getWhileStatement()
 * @model
 * @generated
 */
public interface WhileStatement extends IterationStatement {
	/**
     * Returns the value of the '<em><b>Condition</b></em>' containment reference.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Condition</em>' containment reference.
     * @see #setCondition(Expression)
     * @see org.eclipse.dltk.javascript.core.dom.DomPackage#getWhileStatement_Condition()
     * @model containment="true" required="true"
     * @generated
     */
	Expression getCondition();

	/**
     * Sets the value of the '{@link org.eclipse.dltk.javascript.core.dom.WhileStatement#getCondition <em>Condition</em>}' containment reference.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Condition</em>' containment reference.
     * @see #getCondition()
     * @generated
     */
	void setCondition(Expression value);

} // WhileStatement
