package org.eclipse.dltk.internal.javascript.ti;

import java.util.Set;

import org.eclipse.dltk.javascript.typeinference.IValueCollection;
import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinference.ReferenceKind;
import org.eclipse.dltk.javascript.typeinfo.model.Type;

public class LazyReference extends AbstractReference {

	boolean resolved = false;
	private final Value value = new Value() {
		public java.util.Set<Value> getReferences() {
			Set<Value> references = super.getReferences();
			if (!resolved) {
				IValueReference createChild = collection.getChild(className);
				if (createChild.exists()) {
					ValueCollection collection = (ValueCollection) createChild
							.getAttribute(IReferenceAttributes.FUNCTION_SCOPE);
					if (collection != null && collection.getThis() != null) {
						createChild = collection.getThis();
					}

					IValue src = ((IValueProvider) createChild).getValue();
					Type type = (Type) src.getAttribute(
							IReferenceAttributes.JAVA_OBJECT_TYPE, true);
					if (type != null) {
						setDeclaredType(type);
					} else if (src instanceof Value) {
						references.add((Value) src);
					} else if (src != null) {
						addValue(src);
					}
					setKind(ReferenceKind.TYPE);
					resolved = true;
				}
			}
			return references;
		};
	};
	private final ITypeInferenceContext context;
	private final String className;
	private final IValueCollection collection;

	public LazyReference(ITypeInferenceContext context, String className,
			IValueCollection collection) {
		this.context = context;
		this.className = className;
		this.collection = collection;

	}

	public IValueReference getChild(String name) {
		if (name.equals(IValueReference.FUNCTION_OP))
			return this;
		return super.getChild(name);
	}

	public IValueReference getParent() {
		return null;
	}

	public String getName() {
		return "";
	}

	public void delete() {
	}

	public ITypeInferenceContext getContext() {
		return context;
	}

	public boolean isReference() {
		return true;
	}

	@Override
	public IValue getValue() {
		value.getReferences();
		return value;
	}

	@Override
	public IValue createValue() {
		return getValue();
	}

}
