/*******************************************************************************
 * Copyright (c) 2011 NumberFour AG
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     NumberFour AG - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.typeinference;

import org.eclipse.dltk.compiler.problem.IProblemIdentifier;

public interface IAssignProtection {

	static String ATTRIBUTE = IAssignProtection.class.getName();

	IProblemIdentifier problemId();

	String problemMessage();

}
