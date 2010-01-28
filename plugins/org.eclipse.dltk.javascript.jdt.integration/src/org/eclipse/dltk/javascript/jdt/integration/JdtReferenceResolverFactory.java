/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.javascript.jdt.integration;

import org.eclipse.dltk.internal.javascript.reference.resolvers.IReferenceResolver;
import org.eclipse.dltk.internal.javascript.reference.resolvers.IResolverFactory;

public class JdtReferenceResolverFactory implements IResolverFactory {

	public IReferenceResolver create() {
		return new JdtReferenceResolver();
	}

}
