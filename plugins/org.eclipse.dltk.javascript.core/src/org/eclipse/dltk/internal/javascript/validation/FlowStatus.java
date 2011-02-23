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
package org.eclipse.dltk.internal.javascript.validation;

public class FlowStatus {
	boolean isBreak;
	boolean returnValue;
	boolean returnWithoutValue;
	boolean noReturn;

	public void add(FlowStatus value) {
		if (value != null) {
			isBreak |= value.isBreak;
			returnValue |= value.returnValue;
			returnWithoutValue |= value.returnWithoutValue;
			noReturn = value.noReturn
					|| (!value.returnValue && !value.returnWithoutValue);
		} else {
			noReturn = true;
		}
	}

	public boolean isTerminatd() {
		return isBreak || isReturned();
	}

	public boolean isReturned() {
		return (returnValue || returnWithoutValue) && !noReturn;
	}
}
