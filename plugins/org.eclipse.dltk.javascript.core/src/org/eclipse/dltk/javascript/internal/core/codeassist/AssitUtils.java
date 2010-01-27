/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.javascript.internal.core.codeassist;

import java.util.HashMap;

import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.internal.core.ModelElement;
import org.eclipse.dltk.internal.javascript.parser.NullReporter;
import org.eclipse.dltk.internal.javascript.reference.resolvers.ReferenceResolverContext;
import org.eclipse.dltk.internal.javascript.reference.resolvers.ResolverManager;
import org.eclipse.dltk.internal.javascript.typeinference.HostCollection;
import org.eclipse.dltk.internal.javascript.typeinference.PositionReachedException;
import org.eclipse.dltk.internal.javascript.typeinference.TypeInferencer;

import com.xored.org.mozilla.javascript.CompilerEnvirons;
import com.xored.org.mozilla.javascript.Parser;
import com.xored.org.mozilla.javascript.ScriptOrFnNode;

public class AssitUtils {

	public static ReferenceResolverContext buildContext(ISourceModule module,
			int position, String content, String fileName2) {
		HashMap settings = new HashMap();
		ReferenceResolverContext createResolverContext = ResolverManager
				.createResolverContext(module, settings, false);
		createResolverContext.init();
		Parser p = new Parser(new CompilerEnvirons(), new NullReporter());
		ScriptOrFnNode parse = p.parse(content, fileName2, 0);
		TypeInferencer inf = new TypeInferencer((ModelElement) module,
				createResolverContext);
		try {
			inf.doInterferencing(parse, position);
		} catch (PositionReachedException ex) {
			// ex.printStackTrace();
		}
		HostCollection collection = inf.getCollection();
		createResolverContext.setHostCollection(collection);
		return createResolverContext;
	}

	public static class PositionCalculator {

		private boolean isMember;
		private final String completion;
		private final String completionPart;
		private final String corePart;

		public PositionCalculator(String conString, int pos, boolean bothSides) {
			if (bothSides) {
				int maxPos = conString.length();
				if (pos < maxPos) {
					while (pos < maxPos) {
						char charAt = conString.charAt(pos);
						if (Character.isJavaIdentifierPart(charAt)) {
							pos++;
							continue;
						} else {
							break;
						}
					}
				} else
					pos = maxPos;
			}
			completion = HostCollection.parseCompletionString(conString
					.substring(0, pos), false);
			int lastDot = completion.lastIndexOf('.');
			if (lastDot != -1) {
				isMember = true;
				completionPart = completion.substring(lastDot + 1);
				corePart = completion.substring(0, lastDot);
			} else {
				isMember = false;
				completionPart = completion;
				corePart = completion;
			}
		}

		public String getCompletion() {
			return completion;
		}

		public String getCompletionPart() {
			return completionPart;
		}

		public String getCorePart() {
			return corePart;
		}

		public boolean isMember() {
			return isMember;
		}
	}

}
