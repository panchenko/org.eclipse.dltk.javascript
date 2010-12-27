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
package org.eclipse.dltk.internal.javascript.corext.refactoring.code;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.dltk.internal.javascript.corext.refactoring.code.flow.FlowInfo;
import org.eclipse.dltk.javascript.core.dom.Identifier;


/* package */ class ParameterData {

	//public static final String PROPERTY= ParameterData.class.getName();

	private Identifier declaration;
	private int accessMode;
	private boolean function = false;
	private List<Identifier> references;
	//private int operatorPrecedence;

	public ParameterData(Identifier decl) {
		declaration= decl;
		accessMode= FlowInfo.UNUSED;
		references= new ArrayList<Identifier>();
		//fOperatorPrecedence= -1;
	}

	public String getName() {
		return declaration.getName();
	}

	/*public ITypeBinding getTypeBinding() {
		return fDeclaration.resolveBinding().getType();
	}*/

	public void addReference(Identifier node) {
		references.add(node);
	}

	public List<Identifier> references() {
		return references;
	}

	public void setAccessMode(int mode) {
		accessMode= mode;
	}

	/*public boolean isUnused() {
		return fAccessMode == FlowInfo.UNUSED;
	}*/

	public boolean isReadOnly() {
		return (accessMode & (FlowInfo.READ | FlowInfo.READ_POTENTIAL)) != 0;
	}

	public boolean isWrite() {
		return (accessMode & (FlowInfo.WRITE | FlowInfo.WRITE_POTENTIAL | FlowInfo.UNKNOWN)) != 0;
	}

	public int getSimplifiedAccessMode() {
		if (isWrite())
			return FlowInfo.WRITE;
		if (isReadOnly())
			return FlowInfo.READ;
		return FlowInfo.UNUSED;
	}

	public int getNumberOfAccesses() {
		return references.size();
	}

	/*public boolean needsEvaluation() {
		if (fReferences.size() <= 1)
			return false;
		return true;
	}
	
	public void resetOperatorPrecedence() {
		operatorPrecedence = Integer.MAX_VALUE;
	}

	public void setOperatorPrecedence(int newValue) {
		operatorPrecedence = Math.min(operatorPrecedence, newValue);
	}

	public int getOperatorPrecedence() {
		return operatorPrecedence;
	}*/
	
	public void setFunction(boolean value) {
		function = value;
	}
	public boolean isFunction() {
		return function;
	}
}
