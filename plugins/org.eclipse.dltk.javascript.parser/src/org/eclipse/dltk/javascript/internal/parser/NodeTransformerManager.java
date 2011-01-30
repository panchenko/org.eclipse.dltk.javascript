/*******************************************************************************
 * Copyright (c) 2011 xored software, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.internal.parser;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.dltk.core.IModelElement;
import org.eclipse.dltk.javascript.parser.JSProblemReporter;
import org.eclipse.dltk.javascript.parser.JavaScriptParserPlugin;
import org.eclipse.dltk.javascript.parser.NodeTransformer;
import org.eclipse.dltk.utils.SimpleExtensionManager;

public class NodeTransformerManager extends
		SimpleExtensionManager<NodeTransformer.Factory> {

	private NodeTransformerManager() {
		super(NodeTransformer.Factory.class, JavaScriptParserPlugin.PLUGIN_ID
				+ ".transformer");
	}

	private static NodeTransformerManager instance;

	public static NodeTransformerManager getManager() {
		if (instance == null) {
			instance = new NodeTransformerManager();
		}
		return instance;
	}

	public static final NodeTransformer[] NO_TRANSFORMERS = new NodeTransformer[0];

	public static NodeTransformer[] createTransformers(IModelElement element,
			JSProblemReporter reporter) {
		final NodeTransformer.Factory[] factories = getManager().getInstances();
		if (factories.length == 0) {
			return NO_TRANSFORMERS;
		}
		final List<NodeTransformer> result = new ArrayList<NodeTransformer>(
				factories.length);
		for (NodeTransformer.Factory factory : factories) {
			final NodeTransformer transformer = factory.create(element,
					reporter);
			if (transformer != null) {
				result.add(transformer);
			}
		}
		if (result.isEmpty()) {
			return NO_TRANSFORMERS;
		}
		return result.toArray(new NodeTransformer[result.size()]);
	}

}
