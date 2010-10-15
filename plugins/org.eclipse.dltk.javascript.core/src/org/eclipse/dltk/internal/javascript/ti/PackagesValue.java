package org.eclipse.dltk.internal.javascript.ti;

public class PackagesValue extends Value {

	public PackagesValue() {
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
		return new PackageOrClassValue(name);
	}

}
