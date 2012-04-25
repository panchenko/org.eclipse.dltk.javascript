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
	boolean returnThrow;
	boolean returnValue;
	boolean returnWithoutValue;
	boolean noReturn;

	public void add(FlowStatus value) {
		if (value != null) {
			isBreak |= value.isBreak;
			returnThrow |= value.returnThrow;
			returnValue |= value.returnValue;
			returnWithoutValue |= value.returnWithoutValue;
			noReturn = value.noReturn || !value.isAnyReturn();
		} else {
			noReturn = true;
		}
	}

	public void addCase(FlowStatus value) {
		if (value != null) {
			isBreak |= value.isBreak;
			returnThrow |= value.returnThrow;
			returnValue |= value.returnValue;
			returnWithoutValue |= value.returnWithoutValue;
		}
	}

	public boolean isTerminated() {
		return isBreak || isReturned();
	}

	public boolean isAnyReturn() {
		return returnThrow || returnValue || returnWithoutValue;
	}

	public boolean isReturned() {
		return isAnyReturn() && !noReturn;
	}

	public void addBranch(FlowStatus branch) {
		if (branch != null) {
			if (noReturn != branch.noReturn)
				noReturn = true;
			if (returnValue != branch.returnValue)
				returnValue = true;
			if (returnWithoutValue != branch.returnWithoutValue)
				returnWithoutValue = true;
		} else {
			noReturn = true;
		}
	}
}
