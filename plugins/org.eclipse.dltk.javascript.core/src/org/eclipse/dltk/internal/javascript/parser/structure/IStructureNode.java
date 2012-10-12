package org.eclipse.dltk.internal.javascript.parser.structure;

import java.util.List;

@Structure3
public interface IStructureNode {

	List<? extends IStructureNode> getChildren();

	boolean isScope();

	IScope getParent();

}
