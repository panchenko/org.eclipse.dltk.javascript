package org.eclipse.dltk.internal.javascript.parser.structure;

import java.util.List;

public interface IStructureNode {

	List<? extends IStructureNode> getChildren();

	boolean isScope();

	IScope getParent();

}
