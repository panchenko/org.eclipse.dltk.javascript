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
package org.eclipse.dltk.internal.javascript.ti;

import org.eclipse.dltk.javascript.typeinference.ReferenceLocation;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IElement;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;

public class JSElement implements IElement {

	private String name;
	private JSType type;
	private ReferenceLocation location = ReferenceLocation.UNKNOWN;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public JSType getType() {
		return type;
	}

	public void setType(JSType type) {
		this.type = type;
	}

	public ReferenceLocation getLocation() {
		return location;
	}

	public void setLocation(ReferenceLocation location) {
		this.location = location;
	}

}
