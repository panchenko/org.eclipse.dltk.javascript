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
package org.eclipse.dltk.internal.javascript.ti;

import org.eclipse.dltk.javascript.internal.model.references.Type;

public interface IValueTypeFactory {

	public static final IValueTypeFactory INSTANCE = new ValueTypeFactoryImpl();

	Type get(String name);

	IValueReference create(Type type);

	IValueReference createString();

	IValueReference createRegExp();

	IValueReference createNumber();

	IValueReference createXML();

	IValueReference createBoolean();

	IValueReference createArray();

}
