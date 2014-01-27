/*******************************************************************************
 * Copyright (c) 2014 Alex Panchenko
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Alex Panchenko - initial API and Implementation
 *******************************************************************************/
package org.eclipse.dltk.javascript.typeinfo;

/**
 * @since 5.1
 * @noinstantiate This class is not intended to be instantiated by clients.
 */
@SuppressWarnings("serial")
public class TypeLibraryException extends Exception {

	public TypeLibraryException(String message) {
		super(message);
	}

	public TypeLibraryException(String message, Throwable cause) {
		super(message, cause);
	}
}
