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
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import org.eclipse.dltk.compiler.CharOperation;
import org.eclipse.dltk.compiler.ISourceElementRequestor;
import org.eclipse.dltk.compiler.env.IModuleSource;
import org.eclipse.dltk.compiler.problem.IProblemReporter;
import org.eclipse.dltk.core.ISourceElementParser;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.internal.core.ModelElement;
import org.eclipse.dltk.internal.javascript.reference.resolvers.ReferenceResolverContext;
import org.eclipse.dltk.internal.javascript.reference.resolvers.ResolverManager;
import org.eclipse.dltk.internal.javascript.typeinference.ContextReference;
import org.eclipse.dltk.internal.javascript.typeinference.HostCollection;
import org.eclipse.dltk.internal.javascript.typeinference.IReference;
import org.eclipse.dltk.internal.javascript.typeinference.IReferenceLocation;
import org.eclipse.dltk.internal.javascript.typeinference.StandardSelfCompletingReference;
import org.eclipse.dltk.internal.javascript.typeinference.TypeInferencer;
import org.eclipse.dltk.javascript.core.JavaScriptCorePreferences;

import com.xored.org.mozilla.javascript.CompilerEnvirons;
import com.xored.org.mozilla.javascript.FunctionNode;
import com.xored.org.mozilla.javascript.Parser;
import com.xored.org.mozilla.javascript.ScriptOrFnNode;
import com.xored.org.mozilla.javascript.ScriptOrFnNode.Position;

public class JavaScriptSourceElementParser implements ISourceElementParser {

	protected ISourceElementRequestor fRequestor = null;
	protected IProblemReporter fReporter = null;
	private ISourceModule module;

	public JavaScriptSourceElementParser() {
	}

	/**
	 * @see org.eclipse.dltk.core.ISourceElementParser#parseSourceModule(org.eclipse.dltk.core.ISourceModule)
	 */
	public void parseSourceModule(IModuleSource module) {
		if (module instanceof ISourceModule) {
			this.module = (ISourceModule) module;
		}
		parseSourceModule(module.getSourceContents());
	}

	private void parseSourceModule(String content) {
		CompilerEnvirons cenv = new CompilerEnvirons();
		cenv.setStrictMode(JavaScriptCorePreferences.isStrictMode());
		JavaScriptModuleDeclaration moduleDeclaration = new JavaScriptModuleDeclaration(
				content.length());

		Parser parser = new Parser(cenv, new JavaScriptErrorReporter(fReporter));
		try {

			ScriptOrFnNode parse = parser.parse(new StringReader(content), "",
					0);
			final ReferenceResolverContext resolverContext;
			if (module != null) {
				resolverContext = ResolverManager.createResolverContext(module,
						Collections.emptyMap(), true);
				resolverContext.init();
			} else {
				resolverContext = new ReferenceResolverContext(null,
						Collections.emptyMap());
			}
			TypeInferencer interferencer = new TypeInferencer(
					(ModelElement) module, resolverContext);
			interferencer.setRequestor(fRequestor);
			interferencer.doInterferencing(parse, Integer.MAX_VALUE);

			fRequestor.enterModule();
			HostCollection collection = interferencer.getCollection();
			processNode(parse, collection);

			// elements/
			moduleDeclaration.setCollection(collection);
			for (IReference ref : collection.getReferences().values()) {
				reportRef(ref, null, 0);
			}
			Map<Integer, HostCollection> ms = interferencer.getFunctionMap();
			moduleDeclaration.setFunctionMap(ms);
			for (HostCollection next : ms.values()) {
				fRequestor.acceptFieldReference("!!!" + next.getName(), 0);
			}
			fRequestor.exitModule(content.length());
		} catch (Exception e) {
			e.printStackTrace();
		}

		return;
	}

	private Set<IReference> reportedRefs = new HashSet<IReference>();

	private void reportRef(IReference ref, String sma, int level) {
		if (reportedRefs.contains(ref))
			return;
		reportedRefs.add(ref);
		String key = ref.getName();
		if (sma != null)
			key = sma + '.' + key;
		if (level == 0) {
			Set<IReference> sm = ref.getChilds(false);
			for (IReference refa : sm) {
				reportRef(refa, key, level + 1);
			}
		}
		// contibuting field to index
		fRequestor.acceptFieldReference(key, 0);
	}

	private void processNode(ScriptOrFnNode parse, HostCollection collection) {

		for (int a = 0; a < parse.getFunctionCount(); a++) {
			FunctionNode functionNode = parse.getFunctionNode(a);
			functionNode.getFunctionName();

			HostCollection function = collection != null ? collection
					.getFunction(functionNode) : null;
			String functionName = functionNode.getFunctionName();

			if (functionName.length() == 0)
				continue;
			ISourceElementRequestor.MethodInfo methodInfo = new ISourceElementRequestor.MethodInfo();
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
				Set<IReference> childs = reference.getChilds(false);
				for (IReference ref : childs) {
					if (ref instanceof StandardSelfCompletingReference) {
						StandardSelfCompletingReference uref = (StandardSelfCompletingReference) ref;
						if (ref.isFunctionRef()) {
							reportMethod(ref.getName(), uref.getLocation());
						} else {
							reportField(ref.getName(), uref.getLocation());
						}
					} else if (ref instanceof ContextReference) {
						ContextReference rr = (ContextReference) ref;
						reportMethod(rr.getName(), rr.getLocation());
					}
				}
			}
			fRequestor.exitField(fieldInfo.nameSourceEnd);
		}
	}

	private void reportMethod(String methodName, IReferenceLocation location) {
		ISourceElementRequestor.MethodInfo mi = new ISourceElementRequestor.MethodInfo();
		mi.name = methodName;
		mi.parameterNames = CharOperation.NO_STRINGS;
		mi.declarationStart = location.getOffset();
		mi.nameSourceStart = location.getOffset();
		mi.nameSourceEnd = location.getOffset() + location.getLength() - 1;
		fRequestor.enterMethod(mi);
		fRequestor.exitMethod(location.getOffset() + location.getLength());
	}

	private void reportField(String fieldName, IReferenceLocation location) {
		ISourceElementRequestor.FieldInfo fi = new ISourceElementRequestor.FieldInfo();
		fi.name = fieldName;
		fi.nameSourceStart = location.getOffset();
		fi.nameSourceEnd = location.getOffset() + location.getLength() - 1;
		fi.declarationStart = location.getOffset();
		fRequestor.enterField(fi);
		fRequestor.exitField(location.getOffset() + location.getLength());
	}

	public void setRequestor(ISourceElementRequestor requestor) {
		this.fRequestor = requestor;
	}

	public void setReporter(IProblemReporter reporter) {
		this.fReporter = reporter;
	}
}
