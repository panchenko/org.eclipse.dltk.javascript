/*******************************************************************************
 * Copyright (c) 2011 NumberFour AG
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     NumberFour AG - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.javascript.typeinfo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;

import org.eclipse.core.runtime.Assert;
import org.eclipse.dltk.javascript.typeinfo.model.AnyType;
import org.eclipse.dltk.javascript.typeinfo.model.ArrayType;
import org.eclipse.dltk.javascript.typeinfo.model.ClassType;
import org.eclipse.dltk.javascript.typeinfo.model.FunctionType;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;
import org.eclipse.dltk.javascript.typeinfo.model.MapType;
import org.eclipse.dltk.javascript.typeinfo.model.Member;
import org.eclipse.dltk.javascript.typeinfo.model.Parameter;
import org.eclipse.dltk.javascript.typeinfo.model.ParameterKind;
import org.eclipse.dltk.javascript.typeinfo.model.RecordType;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelLoader;
import org.eclipse.dltk.javascript.typeinfo.model.TypeKind;
import org.eclipse.dltk.javascript.typeinfo.model.TypeRef;
import org.eclipse.dltk.javascript.typeinfo.model.UndefinedType;
import org.eclipse.dltk.javascript.typeinfo.model.UnionType;
import org.eclipse.dltk.javascript.typeinfo.model.impl.AnyTypeImpl;
import org.eclipse.dltk.javascript.typeinfo.model.impl.ArrayTypeImpl;
import org.eclipse.dltk.javascript.typeinfo.model.impl.ClassTypeImpl;
import org.eclipse.dltk.javascript.typeinfo.model.impl.FunctionTypeImpl;
import org.eclipse.dltk.javascript.typeinfo.model.impl.MapTypeImpl;
import org.eclipse.dltk.javascript.typeinfo.model.impl.RecordTypeImpl;
import org.eclipse.dltk.javascript.typeinfo.model.impl.TypeRefImpl;
import org.eclipse.dltk.javascript.typeinfo.model.impl.UndefinedTypeImpl;
import org.eclipse.dltk.javascript.typeinfo.model.impl.UnionTypeImpl;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.ECollections;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

public abstract class JSTypeSet implements Iterable<JSType> {

	private static class EmptyIterator implements Iterator<JSType> {

		protected EmptyIterator() {
		}

		public boolean hasNext() {
			return false;
		}

		public JSType next() {
			throw new NoSuchElementException();
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}
	}

	private static class JSEmptyTypeSet extends JSTypeSet {

		protected JSEmptyTypeSet() {
		}

		public Iterator<JSType> iterator() {
			return new EmptyIterator();
		}

		@Override
		public void add(JSType type) {
			throw new UnsupportedOperationException();
		}

		@Override
		public JSType getFirst() {
			return null;
		}

		@Override
		public Type[] toArray() {
			return new Type[0];
		}

		@Override
		public int size() {
			return 0;
		}

		@Override
		public void addAll(JSTypeSet types) {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean isEmpty() {
			return true;
		}

		@Override
		public void clear() {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean contains(JSType type) {
			return false;
		}

		@Override
		public boolean contains(Type type) {
			return false;
		}

		@Override
		public boolean containsAll(JSTypeSet types) {
			return types.isEmpty();
		}

		@Override
		public String toString() {
			return getClass().getSimpleName();
		}

	}

	private static final JSEmptyTypeSet EMPTY_SET = new JSEmptyTypeSet();

	public static JSTypeSet emptySet() {
		return EMPTY_SET;
	}

	private static class SingletonIterator implements Iterator<JSType> {
		private final JSType type;
		private boolean hasNext = true;

		public SingletonIterator(JSType type) {
			this.type = type;
		}

		public boolean hasNext() {
			return hasNext;
		}

		public JSType next() {
			if (hasNext) {
				hasNext = false;
				return type;
			}
			throw new NoSuchElementException();
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}

	}

	private static class JSSingletonTypeSet extends JSTypeSet {

		private final JSType type;

		public JSSingletonTypeSet(JSType type) {
			this.type = normalize(type);
		}

		public Iterator<JSType> iterator() {
			return new SingletonIterator(type);
		}

		@Override
		public void add(JSType type) {
			throw new UnsupportedOperationException();
		}

		@Override
		public JSType getFirst() {
			return type;
		}

		@Override
		public Type[] toArray() {
			if (type instanceof TypeRef) {
				return new Type[] { ((TypeRef) type).getTarget() };
			} else if (type instanceof ClassType) {
				return new Type[] { ((ClassType) type).getTarget() };
			} else if (type instanceof AnyType) {
				return new Type[] { TypeInfoModelLoader.getInstance().getType(
						ITypeNames.OBJECT) };
			} else {
				return new Type[0];
			}
		}

		@Override
		public int size() {
			return 1;
		}

		@Override
		public void addAll(JSTypeSet types) {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean isEmpty() {
			return false;
		}

		@Override
		public void clear() {
			throw new UnsupportedOperationException();
		}

		@Override
		public boolean contains(JSType type) {
			return this.type.equals(normalize(type));
		}

		@Override
		public boolean contains(Type type) {
			return this.type instanceof TypeRef
					&& ((TypeRef) this.type).getTarget().equals(type);
		}

		@Override
		public boolean containsAll(JSTypeSet types) {
			return types.size() == 1 && contains(types.getFirst());
		}

		@Override
		public String toString() {
			return "[" + type + "]";
		}

	}

	public static JSTypeSet singleton(JSType type) {
		if (type instanceof UnionType) {
			final JSTypeSet set = create();
			set.add(type);
			return set;
		}
		return new JSSingletonTypeSet(type);
	}

	private static class TypeRefKey implements TypeRef, JSType2 {

		private final Type type;

		public TypeRefKey(Type type) {
			this.type = type;
		}

		public TypeKind getKind() {
			return !type.isProxy() ? type.getKind() : TypeKind.UNRESOLVED;
		}

		public String getName() {
			return type.getName();
		}

		public Type getTarget() {
			return type;
		}

		public void setTarget(Type value) {
			throw new UnsupportedOperationException();
		}

		@Override
		public int hashCode() {
			return type.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof TypeRefKey) {
				final TypeRefKey other = (TypeRefKey) obj;
				return type.equals(other.type);
			}
			return false;
		}

		@Override
		public String toString() {
			return type.toString();
		}

		public boolean isArray() {
			return ITypeNames.ARRAY.equals(type.getName());
		}

		public boolean isAssignableFrom(JSType2 type) {
			if (equals(type)) {
				return true;
			} else if (isArray()) {
				return type.isArray();
			} else if (type instanceof UndefinedType) {
				return true;
			} else if (ITypeNames.OBJECT.equals(getName())) {
				return true;
			} else if (type instanceof TypeRef) {
				final Type other = ((TypeRef) type).getTarget();
				final String localName = TypeUtil.getName(this.type);
				Type t = other;
				while (t != null) {
					if (localName.equals(TypeUtil.getName(t)))
						return true;
					t = t.getSuperType();
				}
			} else if (type instanceof UnionTypeKey) {
				for (JSType2 part : ((UnionTypeKey) type).targets) {
					if (isAssignableFrom(part)) {
						return true;
					}
				}
			}
			return false;
		}
	}

	private static class ClassTypeKey implements ClassType, JSType2 {

		private final Type type;

		public ClassTypeKey(Type type) {
			this.type = type;
		}

		public TypeKind getKind() {
			return TypeKind.CLASS;
		}

		public String getRawName() {
			if (type != null) {
				if (((EObject) type).eIsProxy()) {
					final URI uri = ((InternalEObject) type).eProxyURI();
					if (uri != null) {
						return URI.decode(uri.fragment());
					}
				} else {
					return type.getName();
				}
			}
			return null;
		}

		public String getName() {
			final String rawName = getRawName();
			return rawName != null ? "Class<" + rawName + ">" : "Class";
		}

		public Type getTarget() {
			return type;
		}

		public void setTarget(Type value) {
			throw new UnsupportedOperationException();
		}

		@Override
		public int hashCode() {
			return type != null ? type.hashCode() : 31;
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof ClassTypeKey) {
				final ClassTypeKey other = (ClassTypeKey) obj;
				return type != null ? type.equals(other.type)
						: other.type == null;
			}
			return false;
		}

		@Override
		public String toString() {
			return getName();
		}

		public boolean isArray() {
			return false;
		}

		public boolean isAssignableFrom(JSType2 type) {
			if (equals(type)) {
				return true;
			} else if (type instanceof UndefinedType) {
				return true;
			} else if (type instanceof ClassType) {
				if (this.type == null) {
					return true;
				}
				final Type other = ((ClassType) type).getTarget();
				final String localName = TypeUtil.getName(this.type);
				Type t = other;
				while (t != null) {
					if (localName.equals(TypeUtil.getName(t)))
						return true;
					t = t.getSuperType();
				}
			} else if (type instanceof UnionTypeKey) {
				for (JSType2 part : ((UnionTypeKey) type).targets) {
					if (isAssignableFrom(part)) {
						return true;
					}
				}
			}
			return false;
		}
	}

	private static class ArrayTypeKey implements ArrayType, JSType2 {

		private final JSType2 itemType;

		public ArrayTypeKey(JSType2 itemType) {
			this.itemType = itemType;
		}

		public TypeKind getKind() {
			return TypeKind.PREDEFINED;
		}

		public String getName() {
			return itemType != null ? ITypeNames.ARRAY + '<'
					+ itemType.getName() + '>' : ITypeNames.ARRAY;
		}

		public JSType getItemType() {
			return itemType;
		}

		public void setItemType(JSType value) {
			throw new UnsupportedOperationException();
		}

		@Override
		public int hashCode() {
			return itemType.hashCode();
		}

		public boolean equals(Object obj) {
			if (obj instanceof ArrayTypeKey) {
				final ArrayTypeKey other = (ArrayTypeKey) obj;
				return itemType.equals(other.itemType);
			}
			return false;
		}

		@Override
		public String toString() {
			return getName();
		}

		public boolean isArray() {
			return true;
		}

		public boolean isAssignableFrom(JSType2 type) {
			if (type instanceof ArrayTypeKey) {
				return itemType
						.isAssignableFrom(((ArrayTypeKey) type).itemType);
			} else if (itemType instanceof AnyType && type.isArray()) {
				return true;
			} else if (type instanceof UndefinedType) {
				return true;
			}
			return false;
		}

	}

	private static class MapTypeKey implements MapType, JSType2 {

		private final JSType2 valueType;
		private final JSType2 keyType;

		public MapTypeKey(JSType2 keyType, JSType2 valueType) {
			this.keyType = keyType;
			this.valueType = valueType;
		}

		public TypeKind getKind() {
			return TypeKind.PREDEFINED;
		}

		public String getName() {
			// if the key type is set but it is a String then just default to
			// without it.
			if (valueType != null && keyType != null
					&& !ITypeNames.STRING.equals(keyType.getName())) {
				return ITypeNames.OBJECT + '<' + keyType.getName() + ','
						+ valueType.getName() + '>';
			}
			return valueType != null ? ITypeNames.OBJECT + '<'
					+ valueType.getName() + '>' : ITypeNames.OBJECT;
		}

		@Override
		public int hashCode() {
			return valueType.hashCode();
		}

		public boolean equals(Object obj) {
			if (obj instanceof MapTypeKey) {
				final MapTypeKey other = (MapTypeKey) obj;
				return valueType.equals(other.valueType);
			}
			return false;
		}

		@Override
		public String toString() {
			return getName();
		}

		public boolean isArray() {
			return false; // TODO what to exactly return here?
		}

		public boolean isAssignableFrom(JSType2 type) {
			if (type instanceof MapTypeKey) {
				return valueType
						.isAssignableFrom(((MapTypeKey) type).valueType);
			} else if (type instanceof UndefinedType) {
				return true;
			}
			return false;
		}

		public JSType getKeyType() {
			return keyType;
		}

		public void setKeyType(JSType value) {
			throw new UnsupportedOperationException();
		}

		public JSType getValueType() {
			return valueType;
		}

		public void setValueType(JSType value) {
			throw new UnsupportedOperationException();
		}

	}

	private static final JSType2 ANY_TYPE = new AnyTypeKey();

	private static class AnyTypeKey implements AnyType, JSType2 {

		public TypeKind getKind() {
			return TypeKind.PREDEFINED;
		}

		public String getName() {
			return "Any";
		}

		public boolean isArray() {
			return false;
		}

		public boolean isAssignableFrom(JSType2 type) {
			return true;
		}

	}

	private static final JSType2 UNDEFINED_TYPE = new UndefinedTypeKey();

	private static class UndefinedTypeKey implements UndefinedType, JSType2 {

		public TypeKind getKind() {
			return TypeKind.PREDEFINED;
		}

		public String getName() {
			return ITypeNames.UNDEFINED;
		}

		public boolean isArray() {
			return false;
		}

		public boolean isAssignableFrom(JSType2 type) {
			return true;
		}

	}

	private static class UnionTypeKey implements UnionType, JSType2 {

		final EList<JSType2> targets = new BasicEList<JSType2>();

		public TypeKind getKind() {
			return !targets.isEmpty() ? targets.get(0).getKind()
					: TypeKind.UNKNOWN;
		}

		public String getName() {
			final StringBuilder sb = new StringBuilder();
			for (JSType type : targets) {
				if (sb.length() != 0) {
					sb.append('|');
				}
				sb.append(type.getName());
			}
			return sb.toString();
		}

		public boolean isArray() {
			return false;
		}

		public boolean isAssignableFrom(JSType2 type) {
			for (JSType2 target : targets) {
				if (target.isAssignableFrom(type)) {
					return true;
				}
			}
			return false;
		}

		@SuppressWarnings({ "unchecked", "rawtypes" })
		public EList<JSType> getTargets() {
			return (EList) targets;
		}

		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return 1;
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof UnionTypeKey) {
				final UnionTypeKey other = (UnionTypeKey) obj;
				return targets.size() == other.targets.size()
						&& targets.containsAll(other.targets);
			}
			return false;
		}

	}

	public static JSType2 record(Type target) {
		return new RecordTypeKey(target);
	}

	private static class RecordTypeKey implements RecordType, JSType2 {

		private final Type target;

		public RecordTypeKey(Type target) {
			this.target = target;
		}

		public TypeKind getKind() {
			return TypeKind.RECORD;
		}

		public String getName() {
			return target.getName();
		}

		public boolean isArray() {
			return false;
		}

		public boolean isAssignableFrom(JSType2 type) {
			// TODO Auto-generated method stub
			return false;
		}

		public Type getTarget() {
			return target;
		}

		public void setTarget(Type value) {
			throw new UnsupportedOperationException();
		}

		public EList<Member> getMembers() {
			return target.getMembers();
		}

		@Override
		public int hashCode() {
			return System.identityHashCode(target);
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof RecordTypeKey) {
				final RecordTypeKey other = (RecordTypeKey) obj;
				return target == other.target;
			}
			return false;
		}

	}

	private static class ParameterKey implements Parameter {

		private final String name;
		private final JSType2 type;

		public ParameterKey(String name, JSType2 type) {
			Assert.isNotNull(type);
			this.name = name;
			this.type = type;
		}

		public String getName() {
			return name;
		}

		public void setName(String value) {
			throw new UnsupportedOperationException();
		}

		public JSType getType() {
			return type;
		}

		public void setType(JSType value) {
			throw new UnsupportedOperationException();
		}

		public Type getDirectType() {
			return type instanceof TypeRef ? ((TypeRef) type).getTarget()
					: null;
		}

		public void setDirectType(Type value) {
			throw new UnsupportedOperationException();
		}

		public ParameterKind getKind() {
			// TODO (alex) support parameter kinds
			return ParameterKind.NORMAL;
		}

		public void setKind(ParameterKind value) {
			throw new UnsupportedOperationException();
		}

		@Override
		public int hashCode() {
			return type.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ParameterKey other = (ParameterKey) obj;
			if (name == null) {
				if (other.name != null)
					return false;
			} else if (!name.equals(other.name))
				return false;
			if (!type.equals(other.type))
				return false;
			return true;
		}

	}

	private static class FunctionTypeKey implements FunctionType, JSType2 {

		private final EList<Parameter> parameters;
		private final JSType2 returnType;

		public FunctionTypeKey(EList<Parameter> parameters, JSType2 returnType) {
			this.parameters = parameters;
			this.returnType = returnType;
		}

		public TypeKind getKind() {
			return TypeKind.FUNCTION;
		}

		public String getName() {
			// TODO (alex) generate function signature
			return ITypeNames.FUNCTION;
		}

		public boolean isArray() {
			return false;
		}

		public boolean isAssignableFrom(JSType2 type) {
			// TODO (alex) Auto-generated method stub
			return false;
		}

		public JSType getReturnType() {
			return returnType;
		}

		public void setReturnType(JSType value) {
			throw new UnsupportedOperationException();
		}

		public EList<Parameter> getParameters() {
			return parameters;
		}

		@Override
		public int hashCode() {
			return parameters.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			FunctionTypeKey other = (FunctionTypeKey) obj;
			if (parameters == null) {
				if (other.parameters != null)
					return false;
			} else if (!parameters.equals(other.parameters))
				return false;
			if (returnType == null) {
				if (other.returnType != null)
					return false;
			} else if (!returnType.equals(other.returnType))
				return false;
			return true;
		}

	}

	public static JSType2 normalize(JSType type) {
		if (type instanceof TypeRefImpl) {
			final TypeRef ref = (TypeRef) type;
			return ref(ref.getTarget());
		} else if (type instanceof ClassTypeImpl) {
			return classType(((ClassType) type).getTarget());
		} else if (type instanceof ArrayTypeImpl) {
			return arrayOf(normalize(((ArrayType) type).getItemType()));
		} else if (type instanceof MapTypeImpl) {
			return mapOf(normalize(((MapType) type).getKeyType()),
					normalize(((MapType) type).getValueType()));
		} else if (type instanceof AnyTypeImpl) {
			return ANY_TYPE;
		} else if (type instanceof UndefinedTypeImpl) {
			return UNDEFINED_TYPE;
		} else if (type instanceof UnionTypeImpl) {
			final UnionTypeKey union = new UnionTypeKey();
			for (JSType t : ((UnionType) type).getTargets()) {
				union.targets.add(normalize(t));
			}
			return union;
		} else if (type instanceof RecordTypeImpl) {
			final RecordType recordType = (RecordType) type;
			return new RecordTypeKey(recordType.getTarget());
		} else if (type instanceof FunctionTypeImpl) {
			final FunctionType funcType = (FunctionType) type;
			final EList<Parameter> params;
			if (funcType.getParameters().isEmpty()) {
				params = ECollections.emptyEList();
			} else {
				params = new BasicEList<Parameter>();
				for (Parameter parameter : funcType.getParameters()) {
					params.add(new ParameterKey(parameter.getName(),
							normalize(parameter.getType())));
				}
			}
			return new FunctionTypeKey(params,
					normalize(funcType.getReturnType()));
		}
		Assert.isLegal(!(type instanceof EObject));
		return (JSType2) type;
	}

	public static JSType2 ref(Type type) {
		return new TypeRefKey(type);
	}

	public static JSType2 classType(Type type) {
		return new ClassTypeKey(type);
	}

	public static ArrayTypeKey arrayOf(final JSType2 itemType) {
		return new ArrayTypeKey(itemType);
	}

	public static MapTypeKey mapOf(final JSType2 keyType,
			final JSType2 valueType) {
		return new MapTypeKey(keyType, valueType);
	}

	public static JSType2 any() {
		return ANY_TYPE;
	}

	public static JSType2 undefined() {
		return UNDEFINED_TYPE;
	}

	public static JSType2 union(List<JSType2> targets) {
		final UnionTypeKey union = new UnionTypeKey();
		union.targets.addAll(targets);
		return union;
	}

	public static JSType2 functionType(EList<Parameter> parameters,
			JSType2 returnType) {
		return new FunctionTypeKey(parameters, returnType);
	}

	public static Parameter parameter(String name, JSType2 type) {
		return new ParameterKey(name, type);
	}

	private static class JSTypeSetImpl extends JSTypeSet {

		private final List<JSType> types = new ArrayList<JSType>();

		protected JSTypeSetImpl() {
		}

		public Iterator<JSType> iterator() {
			return types.iterator();
		}

		@Override
		public void add(JSType type) {
			if (type instanceof UnionType) {
				for (JSType t : ((UnionType) type).getTargets()) {
					add(t);
				}
			} else {
				JSType2 normalize = normalize(type);
				if (!types.contains(normalize)) {
					types.add(normalize);
				}
			}
		}

		@Override
		public JSType getFirst() {
			return types.iterator().next();
		}

		@Override
		public Type[] toArray() {
			final LinkedHashSet<Type> result = new LinkedHashSet<Type>();
			for (JSType type : types) {
				if (type instanceof TypeRef) {
					result.add(((TypeRef) type).getTarget());
				} else if (type instanceof AnyType) {
					result.add(TypeInfoModelLoader.getInstance().getType(
							ITypeNames.OBJECT));
				}
			}
			return result.toArray(new Type[result.size()]);
		}

		@Override
		public int size() {
			return types.size();
		}

		@Override
		public void addAll(JSTypeSet types) {
			for (JSType type : types) {
				add(type);
			}
		}

		@Override
		public boolean isEmpty() {
			return types.isEmpty();
		}

		@Override
		public void clear() {
			types.clear();
		}

		@Override
		public boolean contains(JSType type) {
			return types.contains(normalize(type));
		}

		@Override
		public boolean contains(Type type) {
			return types.contains(ref(type));
		}

		@Override
		public boolean containsAll(JSTypeSet types) {
			for (JSType type : types) {
				if (!contains(type)) {
					return false;
				}
			}
			return true;
		}

		@Override
		public String toString() {
			return types.toString();
		}

	}

	public static JSTypeSet create() {
		return new JSTypeSetImpl();
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof JSTypeSet) {
			final JSTypeSet other = (JSTypeSet) obj;
			return size() == other.size() && containsAll(other);
		}
		return false;
	}

	public abstract void add(JSType type);

	// public abstract void add(Type type);

	public abstract JSType getFirst();

	public abstract Type[] toArray();

	public abstract int size();

	public abstract void addAll(JSTypeSet types);

	public abstract boolean isEmpty();

	public abstract void clear();

	public abstract boolean contains(JSType type);

	public abstract boolean contains(Type type);

	public abstract boolean containsAll(JSTypeSet types);

}
