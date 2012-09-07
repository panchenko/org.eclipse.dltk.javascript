package org.eclipse.dltk.internal.javascript.parser.structure;

import java.util.ArrayList;
import java.util.List;

public class Scope implements IScope {

	private final List<IDeclaration> children = new ArrayList<IDeclaration>();

	public void add(IDeclaration child) {
		children.add(child);
	}

}
