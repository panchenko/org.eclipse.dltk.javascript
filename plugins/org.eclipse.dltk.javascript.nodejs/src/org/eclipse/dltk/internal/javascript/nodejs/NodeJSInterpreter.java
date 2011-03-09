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
package org.eclipse.dltk.internal.javascript.nodejs;

import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.dltk.launching.AbstractInterpreterInstall;
import org.eclipse.dltk.launching.IInterpreterInstallType;
import org.eclipse.dltk.launching.IInterpreterRunner;

public class NodeJSInterpreter extends AbstractInterpreterInstall {

	public NodeJSInterpreter(IInterpreterInstallType type, String id) {
		super(type, id);
	}

	@Override
	public IInterpreterRunner getInterpreterRunner(String mode) {
		if (ILaunchManager.RUN_MODE.equals(mode)) {
			return new NodeJSInterpreterRunner(this);
		}
		return null;
	}

}
