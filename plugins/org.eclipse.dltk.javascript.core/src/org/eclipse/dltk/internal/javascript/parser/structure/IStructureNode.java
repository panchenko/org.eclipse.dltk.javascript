package org.eclipse.dltk.internal.javascript.parser.structure;

import java.util.List;

import org.eclipse.dltk.compiler.ISourceElementRequestor;

@Structure3
public interface IStructureNode {

	List<? extends IStructureNode> getChildren();

	IParentNode getParent();

	IScope getScope();

	void reportStructure(ISourceElementRequestor requestor,
			boolean allowDeclarations);

}
