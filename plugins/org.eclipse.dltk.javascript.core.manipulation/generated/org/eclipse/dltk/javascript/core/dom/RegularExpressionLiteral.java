/**
 * <copyright>
 * </copyright>
 *
 * $Id: RegularExpressionLiteral.java,v 1.1 2010/11/08 00:20:20 apanchenk Exp $
 */
package org.eclipse.dltk.javascript.core.dom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Regular Expression Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.dltk.javascript.core.dom.RegularExpressionLiteral#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.dltk.javascript.core.dom.DomPackage#getRegularExpressionLiteral()
 * @model
 * @generated
 */
public interface RegularExpressionLiteral extends Expression {
	/**
	 * Returns the value of the '<em><b>Text</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Text</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Text</em>' attribute.
	 * @see #setText(String)
	 * @see org.eclipse.dltk.javascript.core.dom.DomPackage#getRegularExpressionLiteral_Text()
	 * @model required="true"
	 * @generated
	 */
	String getText();

	/**
	 * Sets the value of the '{@link org.eclipse.dltk.javascript.core.dom.RegularExpressionLiteral#getText <em>Text</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Text</em>' attribute.
	 * @see #getText()
	 * @generated
	 */
	void setText(String value);

} // RegularExpressionLiteral
