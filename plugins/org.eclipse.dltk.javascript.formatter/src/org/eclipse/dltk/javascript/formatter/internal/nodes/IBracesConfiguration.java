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

package org.eclipse.dltk.javascript.formatter.internal.nodes;

public interface IBracesConfiguration {

	public boolean isIndenting();

	public boolean isBracesIndenting();

	public boolean isBeginLineBreaking();

	/**
	 * Should return <code>true</code> if these brace block is part of
	 * statement.
	 * 
	 * @return
	 */
	boolean isStatementContinuation();

	public boolean isEndLineBreaking();

}
