/**
 * <copyright>
 * </copyright>
 *
 * $Id: BlockStatement.java,v 1.2 2010/12/01 09:31:18 apanchenk Exp $
 */
package org.eclipse.dltk.javascript.core.dom;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Block Statement</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.dltk.javascript.core.dom.BlockStatement#getStatements <em>Statements</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.dltk.javascript.core.dom.DomPackage#getBlockStatement()
 * @model
 * @generated
 */
public interface BlockStatement extends Statement {
	/**
     * Returns the value of the '<em><b>Statements</b></em>' containment reference list.
     * The list contents are of type {@link org.eclipse.dltk.javascript.core.dom.Statement}.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statements</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @return the value of the '<em>Statements</em>' containment reference list.
     * @see org.eclipse.dltk.javascript.core.dom.DomPackage#getBlockStatement_Statements()
     * @model containment="true"
     * @generated
     */
	EList<Statement> getStatements();

} // BlockStatement
