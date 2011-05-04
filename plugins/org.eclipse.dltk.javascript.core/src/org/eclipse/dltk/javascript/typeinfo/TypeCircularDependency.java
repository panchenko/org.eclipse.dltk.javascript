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
package org.eclipse.dltk.javascript.typeinfo;

import java.util.List;

import org.eclipse.core.runtime.Assert;
import org.eclipse.dltk.javascript.typeinfo.model.Type;

public class TypeCircularDependency {

	private final List<Type> loop;
	private final List<Type> pathToLoop;

	public TypeCircularDependency(List<Type> loop, List<Type> pathToLoop) {
		Assert.isNotNull(loop);
		Assert.isNotNull(pathToLoop);
		Assert.isLegal(!loop.isEmpty());
		this.loop = loop;
		this.pathToLoop = pathToLoop;
	}

	public boolean isDirect() {
		return pathToLoop.isEmpty();
	}

	/**
	 * Return the array of types walked before we entered the loop. Can be
	 * empty.
	 * 
	 * @return
	 */
	public List<Type> getPathToLoop() {
		return pathToLoop;
	}

	/**
	 * Return the array of types making the loop. The result is never empty
	 * array.
	 * 
	 * @return
	 */
	public List<Type> getLoop() {
		return loop;
	}

}
