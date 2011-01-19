package org.eclipse.dltk.internal.javascript.ti;

import org.eclipse.dltk.javascript.typeinfo.model.Type;

public class PackageOrClassValue extends Value {

	private final String name;
	private final ITypeInferenceContext context;

	public PackageOrClassValue(String name, ITypeInferenceContext context) {
		this.name = name;
		this.context = context;
		// first try to resolve it with the name.
		Type type = context.getKnownType(name);
		if (type == null) {
			// if not found then try it with the Packages prefix.
			type = context.getKnownType("Packages." + name);
		}
		if (type != null) {
			setAttribute(IReferenceAttributes.STATIC, Boolean.TRUE);
			getTypes().add(type);
		}
	}

	@Override
	public IValue getChild(String childName, boolean resolve) {
		IValue child = super.getChild(childName, resolve);
		if (child == null) {
			child = createChildImpl(childName);
		}
		return child;
	}

	@Override
	public IValue createChild(String childName) {
		Value child = createChildImpl(childName);
		putDirectChild(childName, child);
		return child;
	}

	private Value createChildImpl(String childName) {
		return new PackageOrClassValue(name + "." + childName, context);
	}

}
