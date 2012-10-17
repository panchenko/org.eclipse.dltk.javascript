/*******************************************************************************
 * Copyright (c) 2012 NumberFour AG
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     NumberFour AG - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.internal.javascript.parser.structure;

import java.util.Stack;

import org.eclipse.dltk.javascript.structure.FunctionNode;
import org.eclipse.dltk.javascript.structure.IDeclaration;
import org.eclipse.dltk.javascript.structure.IStructureContext;
import org.eclipse.dltk.javascript.structure.IStructureNode;

public class StructureContext implements IStructureContext {

	private static enum ContextState {
		ROOT {
			@Override
			public ContextState enter(IStructureNode node) {
				if (node instanceof FunctionNode) {
					return FUNCTION;
				} else if (node instanceof IDeclaration) {
					return FIELD;
				}
				return super.enter(node);
			}
		},
		FIELD, OBJECT, FUNCTION, END {
			@Override
			public boolean allow(IStructureNode node) {
				return false;
			}
		};

		public ContextState enter(IStructureNode node) {
			// TODO Auto-generated method stub
			return this;
		}

		public boolean allow(IStructureNode node) {
			return true;
		}
	}

	private final Stack<IStructureNode> nodes = new Stack<IStructureNode>();
	private final Stack<ContextState> states = new Stack<ContextState>();

	public boolean allow(IStructureNode node) {
		return state().allow(node);
	}

	private ContextState state() {
		return states.isEmpty() ? ContextState.ROOT : states.peek();
	}

	public void enter(IStructureNode node) {
		nodes.push(node);
		final ContextState state = state();
		states.push(state.enter(node));
	}

	public void leave(IStructureNode node) {
		final IStructureNode value = nodes.pop();
		assert value == node;
		states.pop();
	}

}
