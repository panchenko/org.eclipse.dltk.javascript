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

import org.eclipse.dltk.javascript.typeinference.IAssignProtection;

public interface IReferenceAttributes {

	String PARAMETERS = "PARAMETERS"; //$NON-NLS-1$
	String LOCATION = "LOCATION"; //$NON-NLS-1$
	String FUNCTION_SCOPE = "FUNCTION_SCOPE"; //$NON-NLS-1$
	String ELEMENT = "ELEMENT"; //$NON-NLS-1$
	String VARIABLE = "VARIABLE"; //$NON-NLS-1$s
	@Deprecated
	String CONSTANT = IAssignProtection.ATTRIBUTE;
	String HIDE_ALLOWED = "HIDE_ALLOWED";
	String OPTIONAL = "OPTIONAL";
	String PRIVATE = "PRIVATE";
	String SUPER_SCOPE = "SUPER_SCOPE";

	String RESOLVING = "RESOLVING";
	String PHANTOM = "PHANTOM";
}
