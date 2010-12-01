/**
 * <copyright>
 * </copyright>
 *
 * $Id: NumericLiteral.java,v 1.2 2010/12/01 09:31:18 apanchenk Exp $
 */
package org.eclipse.dltk.javascript.core.dom;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Numeric Literal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.eclipse.dltk.javascript.core.dom.NumericLiteral#getText <em>Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.eclipse.dltk.javascript.core.dom.DomPackage#getNumericLiteral()
 * @model
 * @generated
 */
public interface NumericLiteral extends Expression, IPropertyName {
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
     * @see org.eclipse.dltk.javascript.core.dom.DomPackage#getNumericLiteral_Text()
     * @model required="true"
     * @generated
     */
	String getText();

	/**
     * Sets the value of the '{@link org.eclipse.dltk.javascript.core.dom.NumericLiteral#getText <em>Text</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Text</em>' attribute.
     * @see #getText()
     * @generated
     */
	void setText(String value);

} // NumericLiteral
