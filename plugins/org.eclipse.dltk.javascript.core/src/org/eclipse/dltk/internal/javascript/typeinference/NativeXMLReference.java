package org.eclipse.dltk.internal.javascript.typeinference;

import java.util.Collections;
import java.util.Set;

import org.eclipse.dltk.javascript.typeinfo.ITypeNames;

public class NativeXMLReference extends StandardSelfCompletingReference {

	public NativeXMLReference(String paramOrVarName) {
		super(paramOrVarName, false);
	}

	@Override
	protected void createChilds() {
		addChildren(ReferenceModelLoader.getInstance().getChildren(
				ITypeNames.XML));
	}

	@Override
	public Set<String> getTypes() {
		return Collections.singleton(ITypeNames.XML);
	}

}
