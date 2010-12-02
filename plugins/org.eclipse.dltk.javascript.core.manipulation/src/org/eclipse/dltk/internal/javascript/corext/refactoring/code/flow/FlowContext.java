/*******************************************************************************
 * Copyright (c) 2000, 2008 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 *******************************************************************************/
package org.eclipse.dltk.internal.javascript.corext.refactoring.code.flow;

import java.util.Map;

import org.eclipse.dltk.javascript.core.dom.Identifier;



public class FlowContext {
	public enum Mode {
		MERGE, ARGUMENTS, RETURN_VALUES;
	}

	private int fLength;
	private boolean fConsiderAccessMode;
	//private boolean fLoopReentranceMode;
	private Mode fComputeMode;
	private VariableBinding[] fLocals;
	//private List fExceptionStack;
	private Map<Identifier,VariableBinding> fBindings;

	//private static final List EMPTY_CATCH_CLAUSE= new ArrayList(0);

	public FlowContext(int length, Map<Identifier,VariableBinding> bindings) {
		fLength = length;
		//fExceptionStack= new ArrayList(3);
		fBindings = bindings;
	}

	public void setConsiderAccessMode(boolean b) {
		fConsiderAccessMode= b;
	}

	public void setComputeMode(Mode mode) {
		fComputeMode=mode;
	}

	/*void setLoopReentranceMode(boolean b) {
		fLoopReentranceMode= b;
	}*/

	int getArrayLength() {
		return fLength;
	}

	/*int getStartingIndex() {
		return fStart;
	}*/

	boolean considerAccessMode() {
		return fConsiderAccessMode;
	}

	/*boolean isLoopReentranceMode() {
		return fLoopReentranceMode;
	}*/

	boolean computeMerge() {
		return fComputeMode == Mode.MERGE;
	}

	boolean computeArguments() {
		return fComputeMode == Mode.ARGUMENTS;
	}

	boolean computeReturnValues() {
		return fComputeMode == Mode.RETURN_VALUES;
	}

	/*public IVariableBinding getLocalFromId(int id) {
		return getLocalFromIndex(id - fStart);
	}*/

	public VariableBinding getLocalFromIndex(int index) {
		if (fLocals == null || index > fLocals.length)
			return null;
		return fLocals[index];
	}

	/*public int getIndexFromLocal(VariableBinding local) {
		// TODO double check
		if (fLocals == null)
			return -1;
		for (int i= 0; i < fLocals.length; i++) {
			if (fLocals[i] == local)
				return i;
		}
		return -1;
	}*/

	void manageLocal(VariableBinding local) {
		if (fLocals == null)
			fLocals= new VariableBinding[fLength];
		fLocals[local.getVariableId()]= local;
	}
	
	VariableBinding resolve(Identifier id) {
		return fBindings.get(id);
	}

	//---- Exception handling --------------------------------------------------------

	/*void pushExcptions(TryStatement node) {
		List catchClauses= node.catchClauses();
		if (catchClauses == null)
			catchClauses= EMPTY_CATCH_CLAUSE;
		fExceptionStack.add(catchClauses);
	}

	void popExceptions() {
		Assert.isTrue(fExceptionStack.size() > 0);
		fExceptionStack.remove(fExceptionStack.size() - 1);
	}

	boolean isExceptionCaught(ITypeBinding excpetionType) {
		for (Iterator exceptions= fExceptionStack.iterator(); exceptions.hasNext(); ) {
			for (Iterator catchClauses= ((List)exceptions.next()).iterator(); catchClauses.hasNext(); ) {
				SingleVariableDeclaration catchedException= ((CatchClause)catchClauses.next()).getException();
				IVariableBinding binding= catchedException.resolveBinding();
				if (binding == null)
					continue;
				ITypeBinding catchedType= binding.getType();
				while (catchedType != null) {
					if (catchedType == excpetionType)
						return true;
					catchedType= catchedType.getSuperclass();
				}
			}
		}
		return false;
	}*/
}
