/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.internal.javascript.typeinference;

public class ReferenceFactory {

	public static UnknownReference createNumberReference(String name) {
		return new NativeNumberReference(name);
	}

	public static UnknownReference createStringReference(String name) {
		return new NativeStringReference(name);
	}

	public static UnknownReference createBooleanReference(String name) {
		return new NativeBooleanReference(name);
	}

	public static UnknownReference createArrayReference(String name) {
		return new NativeArrayReference(name);
	}

	public static UnknownReference createDateReference(String name) {
		return new NativeDateReference(name);
	}
}
