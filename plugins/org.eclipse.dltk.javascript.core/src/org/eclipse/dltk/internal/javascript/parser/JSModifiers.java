/*******************************************************************************
 * Copyright (c) 2010 xored software, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.internal.javascript.parser;

import org.eclipse.dltk.ast.Modifiers;

/**
 * @since 3.0
 */
public class JSModifiers {
	public static final int DEPRECATED = 1 << Modifiers.USER_MODIFIER;

	public static final int PUBLIC = Modifiers.AccPublic;
	public static final int PRIVATE = Modifiers.AccPrivate;

	public static final int USER_MODIFIER = Modifiers.USER_MODIFIER + 2;
}
