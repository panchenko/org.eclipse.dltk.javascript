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
package org.eclipse.dltk.javascript.core.tests.typeinfo;

import org.eclipse.dltk.javascript.typeinfo.DefaultMetaType;

public abstract class MetaTypes extends DefaultMetaType {

	public static final MetaTypes ONE = new MetaTypes() {
		@Override
		public String getId() {
			return MetaTypes.class.getName() + ".ONE";
		}
	};

	public static final MetaTypes TWO = new MetaTypes() {
		@Override
		public String getId() {
			return MetaTypes.class.getName() + ".TWO";
		}
	};

}
