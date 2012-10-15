package org.eclipse.dltk.javascript.structure;

import org.eclipse.dltk.javascript.ast.INodeVisitor;

public interface IStructureVisitor extends INodeVisitor<IStructureNode> {

	IParentNode peek();

}
