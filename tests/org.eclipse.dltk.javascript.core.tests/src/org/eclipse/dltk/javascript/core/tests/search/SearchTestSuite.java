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
package org.eclipse.dltk.javascript.core.tests.search;

import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import org.junit.runner.RunWith;

@RunWith(Suite.class)
@SuiteClasses({ SearchDeclarationTests.class, SearchExternalLibraryTests.class,
		SearchFieldTests.class, SearchFunctionTests.class,
		SearchLocalsTests.class, SearchReferenceTests.class,
		SearchTypeReferenceTests.class })
public class SearchTestSuite {
}
