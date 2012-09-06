/*******************************************************************************
 * Copyright (c) 2012 NumberFour AG
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     NumberFour AG - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.typeinfo;

import java.text.ParseException;

import org.eclipse.dltk.javascript.parser.JSProblemIdentifier;

@SuppressWarnings("serial")
public class JSDocParseException extends ParseException {

	public final JSProblemIdentifier problemId;

	public JSDocParseException(JSProblemIdentifier problemId, Object... args) {
		super(problemId.formatMessage(args), -1);
		assert problemId != null;
		this.problemId = problemId;
	}

}
