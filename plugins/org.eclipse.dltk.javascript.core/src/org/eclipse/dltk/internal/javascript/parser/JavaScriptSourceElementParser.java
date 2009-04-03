/*******************************************************************************
 * Copyright (c) 2005, 2007 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 
 *******************************************************************************/
package org.eclipse.dltk.internal.javascript.parser;

import java.io.StringReader;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import org.eclipse.dltk.compiler.ISourceElementRequestor;
import org.eclipse.dltk.compiler.problem.IProblemReporter;
import org.eclipse.dltk.core.ISourceElementParser;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.core.ISourceModuleInfoCache.ISourceModuleInfo;
import org.eclipse.dltk.internal.javascript.reference.resolvers.ReferenceResolverContext;
import org.eclipse.dltk.internal.javascript.reference.resolvers.ResolverManager;
import org.eclipse.dltk.internal.javascript.typeinference.ContextReference;
import org.eclipse.dltk.internal.javascript.typeinference.HostCollection;
import org.eclipse.dltk.internal.javascript.typeinference.IReference;
import org.eclipse.dltk.internal.javascript.typeinference.TypeInferencer;
import org.eclipse.dltk.internal.javascript.typeinference.UnknownReference;
import org.eclipse.dltk.javascript.core.JavaScriptCorePreferences;
import org.eclipse.dltk.javascript.core.JavaScriptPlugin;

import com.xored.org.mozilla.javascript.CompilerEnvirons;
import com.xored.org.mozilla.javascript.FunctionNode;
import com.xored.org.mozilla.javascript.Parser;
import com.xored.org.mozilla.javascript.ScriptOrFnNode;
import com.xored.org.mozilla.javascript.ScriptOrFnNode.Position;

public class JavaScriptSourceElementParser implements ISourceElementParser {

	private ISourceElementRequestor fRequestor = null;
	private IProblemReporter fReporter = null;
	private ISourceModule module;

	public JavaScriptSourceElementParser() {
	}

	/**
	 * @see org.eclipse.dltk.core.ISourceElementParser#parseSourceModule(org.eclipse.dltk.core.ISourceModule)
	 */
	public void parseSourceModule(
			org.eclipse.dltk.compiler.env.ISourceModule module,
			ISourceModuleInfo mifo) {
		if (module instanceof ISourceModule) {
			this.module = (ISourceModule) module;
		}
		parseSourceModule(module.getSourceContents(), mifo);
	}

	private void parseSourceModule(String content, ISourceModuleInfo info) {
		CompilerEnvirons cenv = new CompilerEnvirons();
		boolean strict = JavaScriptPlugin.getDefault().getPluginPreferences()
				.getBoolean(JavaScriptCorePreferences.USE_STRICT_MODE);
		cenv.setStrictMode(strict);
		JavaScriptModuleDeclaration moduleDeclaration = new JavaScriptModuleDeclaration(
				content.length());

		Parser parser = new Parser(cenv, new JavaScriptErrorReporter(fReporter));
		try {

			ScriptOrFnNode parse = parser.parse(new StringReader(content), "",
					0);
			ReferenceResolverContext createResolverContext = null;
			if (module != null) {
				createResolverContext = ResolverManager.createResolverContext(
						module, new HashMap(), true);
				createResolverContext.init();
			} else {
				createResolverContext = new ReferenceResolverContext(null,
						new HashMap());
			}
			TypeInferencer interferencer = new TypeInferencer(null,
					createResolverContext);
			interferencer.setRequestor(fRequestor);
			interferencer.doInterferencing(parse, Integer.MAX_VALUE);

			fRequestor.enterModule();
			HostCollection collection = interferencer.getCollection();
			processNode(parse, collection);

			// elements/
			moduleDeclaration.setCollection(collection);
			Collection sm = (Collection) collection.getReferences().values();
			Iterator i = sm.iterator();
			while (i.hasNext()) {
				Object next = i.next();
				if (next instanceof IReference) {
					IReference ref = (IReference) next;
					reportRef(ref, null, 0);
				}
			}
			Map ms = interferencer.getFunctionMap();
			moduleDeclaration.setFunctionMap(ms);
			Iterator ia = ms.values().iterator();
			while (ia.hasNext()) {
				HostCollection next = (HostCollection) ia.next();
				fRequestor.acceptFieldReference(("!!!" + next.getName())
						.toCharArray(), 0);
			}
			fRequestor.exitModule(content.length());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return;
	}

	private HashSet reportedRefs = new HashSet();

	private void reportRef(IReference ref, String sma, int level) {
		if (reportedRefs.contains(ref))
			return;
		reportedRefs.add(ref);
		String key = ref.getName();
		if (sma != null)
			key = sma + '.' + key;
		if (level == 0) {
			Set sm = ref.getChilds(false);
			Iterator i = sm.iterator();
			while (i.hasNext()) {
				Object next = i.next();
				if (next instanceof IReference) {
					IReference refa = (IReference) next;
					reportRef(refa, key, level + 1);
				}
			}
		}
		// contibuting field to index
		fRequestor.acceptFieldReference((key).toCharArray(), 0);
	}

	private void processNode(ScriptOrFnNode parse, HostCollection collection) {

		for (int a = 0; a < parse.getFunctionCount(); a++) {
			FunctionNode functionNode = parse.getFunctionNode(a);
			functionNode.getFunctionName();

			HostCollection function = collection != null ? collection
					.getFunction(functionNode) : null;
			ISourceElementRequestor.MethodInfo methodInfo = new ISourceElementRequestor.MethodInfo();
			String functionName = functionNode.getFunctionName();

			if (functionName.length() == 0)
				continue;
			methodInfo.name = functionName;
			methodInfo.declarationStart = functionNode.getEncodedSourceStart();
			String[] paramsAndVars = functionNode.getParamAndVarNames();
			String[] params = new String[functionNode.getParamCount()];
			for (int i = 0; i < params.length; i++) {
				params[i] = paramsAndVars[i];
			}
			methodInfo.parameterNames = params;
			methodInfo.nameSourceStart = functionNode.nameStart + 1;
			// +1 because the parser starts with the empty space before the name
			methodInfo.nameSourceEnd = functionNode.nameEnd + 1;
			// +1 because the parser starts with the empty space before the name
			fRequestor.enterMethod(methodInfo);
			processNode(functionNode, function);
			fRequestor.exitMethod(functionNode.getEncodedSourceEnd());
		}
		String[] paramsAndVars = parse.getParamAndVarNames();
		String[] params = new String[parse.getParamCount()];
		for (int i = 0; i < params.length; i++) {
			params[i] = paramsAndVars[i];
		}
		int of = 0;
		if (parse instanceof FunctionNode) {
			FunctionNode n = (FunctionNode) parse;
			if (n.getFunctionType() != FunctionNode.FUNCTION_STATEMENT)
				of = 1;
		}
		for (int i = params.length; i < paramsAndVars.length - of; i++) {
			ISourceElementRequestor.FieldInfo fieldInfo = new ISourceElementRequestor.FieldInfo();
			fieldInfo.name = paramsAndVars[i];
			Position p = parse.getPosition(i);
			fieldInfo.nameSourceStart = p.start + 1;
			// +1 because the parser starts with the empty space before the name
			fieldInfo.nameSourceEnd = p.start + fieldInfo.name.length();
			// no plus 1 because the end is including not until.
			fieldInfo.declarationStart = p.start;
			fRequestor.enterField(fieldInfo);
			if (collection != null) {
				IReference reference = collection.getReference(fieldInfo.name);
				if (reference == null)
					continue;
				Set childs = reference.getChilds(false);
				Iterator it = childs.iterator();
				while (it.hasNext()) {
					Object o = it.next();
					if (o instanceof IReference) {
						IReference ref = (IReference) o;
						if (ref instanceof UnknownReference) {
							UnknownReference uref = (UnknownReference) ref;
							ISourceElementRequestor.FieldInfo fieldInfo1 = new ISourceElementRequestor.FieldInfo();
							fieldInfo1.name = ref.getName();
							fieldInfo1.nameSourceStart = uref.getOffset();
							fieldInfo1.nameSourceEnd = uref.getOffset()
									+ uref.getLength() - 1;
							fieldInfo1.declarationStart = uref.getOffset();
							fRequestor.enterField(fieldInfo1);
							fRequestor.exitField(uref.getOffset()
									+ uref.getLength());
						}
					}
					if (o instanceof ContextReference) {
						ContextReference rr = (ContextReference) o;
						ISourceElementRequestor.MethodInfo methodInfo = new ISourceElementRequestor.MethodInfo();
						methodInfo.name = rr.getName();
						methodInfo.parameterNames = new String[0];
						methodInfo.declarationStart = rr.getPosition();
						methodInfo.nameSourceStart = rr.getPosition();
						methodInfo.nameSourceEnd = rr.getPosition()
								+ rr.getLength() - 1;
						fRequestor.enterMethod(methodInfo);
						fRequestor
								.exitMethod(rr.getPosition() + rr.getLength());
					}
				}
			}
			fRequestor.exitField(fieldInfo.nameSourceEnd);
		}
	}

	public void setRequestor(ISourceElementRequestor requestor) {
		this.fRequestor = requestor;
	}

	public void setReporter(IProblemReporter reporter) {
		this.fReporter = reporter;
	}
}
