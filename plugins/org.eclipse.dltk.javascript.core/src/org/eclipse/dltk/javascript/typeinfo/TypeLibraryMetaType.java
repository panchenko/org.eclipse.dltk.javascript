package org.eclipse.dltk.javascript.typeinfo;

import org.eclipse.dltk.javascript.typeinfo.model.Type;

public class TypeLibraryMetaType extends DefaultMetaType implements
		MetaTypeExtension {

	public static final MetaType INSTANCE = new TypeLibraryMetaType();

	@Override
	public String getId() {
		return getClass().getName();
	}

	@Override
	public boolean isOverloadAllowed(Type type) {
		return true;
	}
}
