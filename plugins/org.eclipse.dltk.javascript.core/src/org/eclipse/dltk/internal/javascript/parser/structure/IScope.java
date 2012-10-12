package org.eclipse.dltk.internal.javascript.parser.structure;

import java.util.List;

import org.eclipse.dltk.annotations.Nullable;

@Structure3
public interface IScope extends IParentNode {

	void addChild(IStructureNode child);

	void addNested(IStructureNode node);

	List<IStructureNode> getNested();

	@Nullable
	IDeclaration resolve(String name);

}
