/*******************************************************************************
 * Copyright (c) 2012 NumberFour AG
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     NumberFour AG - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.typeinfo;

/**
 * Optional interface to be implemented by {@link IRType} instances if they
 * represent references like <em>{This}</em> which should be contextualized with
 * the actual type before usage.
 */
public interface IRContextualizableType {

	boolean isContextualizable();

	IRType contextualize(IRTypeDeclaration declaration);
}
