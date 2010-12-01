/**
 * <copyright>
 * </copyright>
 *
 * $Id: SingleLineCommentImpl.java,v 1.2 2010/12/01 09:31:17 apanchenk Exp $
 */
package org.eclipse.dltk.javascript.core.dom.impl;

import org.eclipse.dltk.javascript.core.dom.DomPackage;
import org.eclipse.dltk.javascript.core.dom.SingleLineComment;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Single Line Comment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class SingleLineCommentImpl extends CommentImpl implements SingleLineComment {
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected SingleLineCommentImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return DomPackage.Literals.SINGLE_LINE_COMMENT;
    }

} //SingleLineCommentImpl
