package org.eclipse.dltk.internal.javascript.ti;

import java.util.HashSet;
import java.util.Set;

import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeKind;

public class LazyReference extends AbstractReference {

	private final Value value = new Value()
	{
		Set<Type> types = null;

		public java.util.Set<org.eclipse.dltk.javascript.typeinfo.model.Type> getTypes() {

			if (types == null) {
				types = new HashSet<Type>();
			}

			if (types.size() == 0) {
				Type type = TypeInferencerVisitor.resolveJavaScriptType(
						context, className, collection);
				if (type != null && type.getKind() != TypeKind.UNKNOWN) {
					types.add(type);
				}
			}
			return types;
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
		return value;
	}

	@Override
	public IValue createValue() {
		return getValue();
	}

}
