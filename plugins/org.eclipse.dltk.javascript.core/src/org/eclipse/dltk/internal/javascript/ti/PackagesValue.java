package org.eclipse.dltk.internal.javascript.ti;

import org.eclipse.dltk.javascript.typeinfo.ITypeSystem;

public class PackagesValue extends Value {

	private final ITypeInferenceContext context;

	public PackagesValue(ITypeInferenceContext context) {
		this.context = context;
	}

	@Override
	protected ITypeSystem getTypeSystem() {
		return context;
	}

	@Override
	public IValue getChild(String name, boolean resolve) {
		IValue child = super.getChild(name, resolve);
		if (child == null) {
			child = createChildImpl(name);
		}
		return child;
	}

	@Override
	public IValue createChild(String name) {
		Value child = createChildImpl(name);
		putDirectChild(name, child);
		return child;
	}

	private Value createChildImpl(String name) {
		return new PackageOrClassValue(name, context);
	}

}
