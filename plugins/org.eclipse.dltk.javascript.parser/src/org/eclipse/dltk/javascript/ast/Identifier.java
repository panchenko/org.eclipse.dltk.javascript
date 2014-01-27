/*******************************************************************************
 * Copyright (c) 2009 xored software, Inc.  
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html  
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Vladimir Belov)
 *******************************************************************************/

package org.eclipse.dltk.javascript.ast;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.ast.ASTVisitor;

public class Identifier extends Expression implements Documentable {

	private String name;
	private Comment documentation;

	public Identifier(JSNode parent) {
		super(parent);
	}

	/**
	 * @see org.eclipse.dltk.ast.ASTNode#traverse(org.eclipse.dltk.ast.ASTVisitor)
	 */
	@Override
	public void traverse(ASTVisitor visitor) throws Exception {
		if (visitor.visit(this)) {
			visitor.endvisit(this);
		}
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDocumentation(Comment documentation) {
		this.documentation = documentation;
	}

	@Override
	public Comment getDocumentation() {
		return documentation;
	}

	@Override
	public String toString() {
		return name;
	}

	@Override
	public String toSourceString(String indentationString) {
		return name;
	}

	/**
	 * Checks if this identifier is a direct symbol reference.
	 */
	public boolean isSymbolReference() {
		final ASTNode parent = getParent();
		if (parent instanceof PropertyInitializer) {
			return ((PropertyInitializer) parent).getName() != this;
		} else if (parent instanceof PropertyExpression) {
			return ((PropertyExpression) parent).getProperty() != this;
		} else if (parent instanceof XmlAttributeIdentifier) {
			return false;
		} else {
			return true;
		}
	}

	/**
	 * Finds the closest declaration of this identifier. Returns the declaration
	 * found or <code>null</code> if no such declaration exists or identifier is
	 * used not as symbol reference.
	 */
	public JSDeclaration findDeclaration() {
		if (isSymbolReference()) {
			JSNode parent = getParent();
			while (parent != null) {
				if (parent instanceof JSScope) {
					for (JSDeclaration declaration : ((JSScope) parent)
							.getDeclarations()) {
						final Identifier id = declaration.getIdentifier();
						if (id != null && name.equals(id.getName())) {
							return declaration;
						}
					}
				}
				parent = parent.getParent();
			}
		}
		return null;
	}

}
