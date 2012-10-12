package org.eclipse.dltk.internal.javascript.parser.structure;

import java.util.List;

import org.eclipse.dltk.javascript.ast.Identifier;

@Structure3
public interface IScope extends IStructureNode {

	void addChild(IStructureNode child);

	void addNested(IStructureNode node);

	List<IStructureNode> getNested();

	void addLocalReference(Identifier node, IDeclaration resolved);

	void addMethodReference(String name);

	void addFieldReference(String name);

	IDeclaration resolve(String name);

}
