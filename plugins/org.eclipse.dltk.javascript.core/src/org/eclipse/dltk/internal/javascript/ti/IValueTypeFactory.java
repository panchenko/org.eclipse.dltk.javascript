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

import org.eclipse.dltk.javascript.typeinference.IValueParent;
import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinfo.IRType;

public interface IValueTypeFactory {

	IValueReference create(IValueParent parent, IRType type);

	IValueReference createObject(IValueParent parent);

	IValueReference createString(IValueParent parent);

	IValueReference createRegExp(IValueParent parent);

	IValueReference createNumber(IValueParent parent);

	IValueReference createXML(IValueParent parent);

	IValueReference createXMLList(IValueParent parent);

	IValueReference createBoolean(IValueParent parent);

	IValueReference createArray(IValueParent parent);

}
