package org.eclipse.dltk.internal.javascript.ti;

import static org.eclipse.dltk.javascript.typeinfo.ITypeNames.OBJECT;

import org.eclipse.dltk.javascript.typeinference.IValueCollection;
import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinference.ReferenceKind;
import org.eclipse.dltk.javascript.typeinfo.TypeUtil;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelFactory;
import org.eclipse.dltk.javascript.typeinfo.model.TypeKind;

public class LazyTypeReference extends AbstractReference {

	final class LazyTypeValue extends Value implements ILazyValue {
		boolean resolved = false;
		private boolean finalResolve;
		private boolean doResolve = true;

		public void resolve() {
			if (!resolved && doResolve) {
				IValueReference createChild = collection.getChild(className);
				if (createChild.exists()) {
					ValueCollection collection = (ValueCollection) createChild
							.getAttribute(IReferenceAttributes.FUNCTION_SCOPE);
					if (collection != null && collection.getThis() != null) {
						createChild = collection.getThis();
					}

					IValue src = ((IValueProvider) createChild).getValue();
					// if i enable this then the type added below takes
					// precedance some time
					// for example a toString() on a javasccript object will
					// then return the toString of Object
					// if (src instanceof Value) {
					// this.references.add((Value) src);
					// } else
					if (src != null) {
						addValue(src);
					}
					setKind(ReferenceKind.TYPE);
					Type type = TypeInfoModelFactory.eINSTANCE.createType();
					type.setSuperType(context.getKnownType(OBJECT));
					type.setKind(TypeKind.JAVASCRIPT);
					type.setName(className);
					setDeclaredType(TypeUtil.ref(type));
					resolved = true;
				} else {
					doResolve = !finalResolve;
				}
			}
		}

		public String getLazyName() {
			return className;
		}

		public boolean isResolved() {
			return resolved;
		}

		public void setFinalResolve() {
			finalResolve = true;
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof LazyTypeValue)
				return ((LazyTypeValue) obj).getLazyName().equals(className);
			return super.equals(obj);
		}

		@Override
		public int hashCode() {
			return className.hashCode();
		}
	}

	private final LazyTypeValue value = new LazyTypeValue();
	final ITypeInferenceContext context;
	final String className;
	final IValueCollection collection;

	public LazyTypeReference(ITypeInferenceContext context, String className,
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
		return className;
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
		value.resolve();
		return value;
	}

	@Override
	public IValue createValue() {
		return getValue();
	}

}
