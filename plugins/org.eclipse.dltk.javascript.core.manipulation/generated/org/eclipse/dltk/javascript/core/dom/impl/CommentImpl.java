/**
 * <copyright>
 * </copyright>
 *
 * $Id: CommentImpl.java,v 1.2 2010/12/01 09:31:18 apanchenk Exp $
 */
package org.eclipse.dltk.javascript.core.dom.impl;

import org.eclipse.dltk.javascript.core.dom.Comment;
import org.eclipse.dltk.javascript.core.dom.DomPackage;

import org.eclipse.emf.ecore.EClass;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public abstract class CommentImpl extends NodeImpl implements Comment {
	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected CommentImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return DomPackage.Literals.COMMENT;
    }

} //CommentImpl
