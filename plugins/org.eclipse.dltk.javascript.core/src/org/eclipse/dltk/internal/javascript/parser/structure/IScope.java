package org.eclipse.dltk.internal.javascript.parser.structure;

import org.eclipse.dltk.javascript.ast.Identifier;

public interface IScope extends IStructureNode {

	void addChild(IStructureNode child);

	void addLocalReference(Identifier node, IDeclaration resolved);

	void addMethodReference(String name);

	void addFieldReference(String name);

	IDeclaration resolve(String name);

}
