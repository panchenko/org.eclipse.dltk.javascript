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
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import org.eclipse.dltk.internal.javascript.ti.GenericTypeReference;
import org.eclipse.dltk.javascript.typeinfo.model.AnyType;
import org.eclipse.dltk.javascript.typeinfo.model.ArrayType;
import org.eclipse.dltk.javascript.typeinfo.model.ClassType;
import org.eclipse.dltk.javascript.typeinfo.model.FunctionType;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;
import org.eclipse.dltk.javascript.typeinfo.model.MapType;
import org.eclipse.dltk.javascript.typeinfo.model.Member;
import org.eclipse.dltk.javascript.typeinfo.model.ParameterizedType;
import org.eclipse.dltk.javascript.typeinfo.model.RType;
import org.eclipse.dltk.javascript.typeinfo.model.RecordMember;
import org.eclipse.dltk.javascript.typeinfo.model.RecordType;
import org.eclipse.dltk.javascript.typeinfo.model.SimpleType;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelLoader;
import org.eclipse.dltk.javascript.typeinfo.model.TypeVariableReference;
import org.eclipse.dltk.javascript.typeinfo.model.UndefinedType;
import org.eclipse.dltk.javascript.typeinfo.model.UnionType;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.InternalEObject;

public abstract class JSTypeSet implements Iterable<IRType> {

	private static class EmptyIterator implements Iterator<IRType> {

		protected EmptyIterator() {
		}

		public boolean hasNext() {
			return false;
		}

		public IRType next() {
			throw new NoSuchElementException();
		}

		public void remove() {
			throw new UnsupportedOperationException();
		}
	}

	private static class JSEmptyTypeSet extends JSTypeSet {

		protected JSEmptyTypeSet() {
		}

		public Iterator<IRType> iterator() {
			return new EmptyIterator();
		}

		@Override
		public void add(IRType type) {
			throw new UnsupportedOperationException();
		}

		@Override
		public IRType getFirst() {
			return null;
		}

		@Override
		public IRType toRType() {
			return none();
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
		public boolean contains(IRType type) {
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

	private static class SingletonIterator implements Iterator<IRType> {
		private final IRType type;
		private boolean hasNext = true;

		public SingletonIterator(IRType type) {
			this.type = type;
		}

		public boolean hasNext() {
			return hasNext;
		}

		public IRType next() {
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

		private final IRType type;

		public JSSingletonTypeSet(IRType type) {
			this.type = type;
		}

		public Iterator<IRType> iterator() {
			return new SingletonIterator(type);
		}

		@Override
		public void add(IRType type) {
			throw new UnsupportedOperationException();
		}

		@Override
		public IRType getFirst() {
			return type;
		}

		@Override
		public IRType toRType() {
			return type;
		}

		@Override
		public Type[] toArray() {
			if (type instanceof SimpleTypeKey) {
				return new Type[] { ((SimpleTypeKey) type).getTarget() };
			} else if (type instanceof ClassTypeKey) {
				return new Type[] { ((ClassTypeKey) type).getTarget() };
			} else if (type instanceof AnyTypeKey) {
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
		public boolean contains(IRType type) {
			return this.type.equals(type);
		}

		@Override
		public boolean contains(Type type) {
			return this.type instanceof SimpleTypeKey
					&& ((SimpleTypeKey) this.type).getTarget().equals(type);
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

	public static JSTypeSet singleton(IRType type) {
		if (type instanceof IRUnionType) {
			final JSTypeSet set = create();
			set.add(type);
			return set;
		}
		return new JSSingletonTypeSet(type);
	}

	private static final boolean DEBUG = false;

	private static abstract class TypeKey implements IRType {

		protected final ITypeSystem typeSystem;

		protected TypeKey() {
			this(null);
		}

		protected TypeKey(ITypeSystem typeSystem) {
			this.typeSystem = typeSystem;
		}

		public ITypeSystem activeTypeSystem() {
			return typeSystem;
		}

		protected final void checkType(Type type) {
			if (type.isProxy()) {
				System.out.println("PROXY " + type.getName());
			}
		}

		public TypeCompatibility isAssignableFrom(IRType type) {
			if (type == UNDEFINED_TYPE || type == ANY_TYPE) {
				return TypeCompatibility.TRUE;
			} else if (type == NONE_TYPE) {
				return TypeCompatibility.FALSE;
			} else if (type instanceof UnionTypeKey) {
				for (IRType part : ((UnionTypeKey) type).targets) {
					if (isAssignableFrom(part).ok()) {
						return TypeCompatibility.TRUE;
					}
				}
			}
			return TypeCompatibility.FALSE;
		}

		protected boolean isAssignableFrom(Type dest, Type src) {
			// TODO (alex) compare objects instead of names
			final String localName = TypeUtil.getName(dest);
			for (Type t : new TypeQuery(src).getHierarchy()) {
				if (localName.equals(TypeUtil.getName(t)))
					return true;
			}
			return false;
		}

		@Override
		public final String toString() {
			return getName();
		}

	}

	private static class SimpleTypeKey extends TypeKey implements IRSimpleType {

		private final Type type;

		public SimpleTypeKey(ITypeSystem typeSystem, Type type) {
			super(typeSystem);
			this.type = type;
			if (DEBUG)
				checkType(type);
		}

		public SimpleTypeKey(Type type) {
			this.type = type;
			if (DEBUG)
				checkType(type);
		}

		public String getName() {
			return type.getName();
		}

		public Type getTarget() {
			return type;
		}

		@Override
		public int hashCode() {
			return type.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof SimpleTypeKey) {
				final SimpleTypeKey other = (SimpleTypeKey) obj;
				return type.equals(other.type);
			}
			return false;
		}

		@Override
		public TypeCompatibility isAssignableFrom(IRType type) {
			if (super.isAssignableFrom(type).ok()) {
				return TypeCompatibility.TRUE;
			} else if (ITypeNames.OBJECT.equals(getName())) {
				return TypeCompatibility.TRUE;
			} else if (type instanceof SimpleTypeKey) {
				final Type other = ((SimpleTypeKey) type).getTarget();
				if (isAssignableFrom(this.type, other)) {
					return TypeCompatibility.TRUE;
				}
				final Type genericType = GenericTypeReference
						.dereference(this.type);
				if (genericType != this.type) {
					if (isAssignableFrom(genericType, other)) {
						return TypeCompatibility.TRUE;
					}
				}
			}
			return TypeCompatibility.FALSE;
		}
	}

	private static class ClassTypeKey extends TypeKey implements IRClassType {

		private final Type type;

		public ClassTypeKey(Type type) {
			this.type = type;
			if (DEBUG)
				if (type != null)
					checkType(type);
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

		public IRType toItemType() {
			if (type == null) {
				return any();
			} else if (ITypeNames.ARRAY.equals(type.getName())) {
				return arrayOf(none());
			} else {
				return new SimpleTypeKey(type);
			}
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

		public TypeCompatibility isAssignableFrom(IRType type) {
			if (super.isAssignableFrom(type).ok()) {
				return TypeCompatibility.TRUE;
			} else if (type instanceof ClassTypeKey) {
				if (this.type == null) {
					return TypeCompatibility.TRUE;
				}
				final Type other = ((ClassTypeKey) type).getTarget();
				return TypeCompatibility.valueOf(other == null
						|| isAssignableFrom(this.type, other));
			}
			return TypeCompatibility.FALSE;
		}

	}

	private static class ArrayTypeKey extends TypeKey implements IRArrayType {

		private final IRType itemType;

		public ArrayTypeKey(ITypeSystem typeSystem, IRType itemType) {
			super(typeSystem);
			this.itemType = itemType;
		}

		public ArrayTypeKey(IRType itemType) {
			this.itemType = itemType;
		}

		public String getName() {
			return ITypeNames.ARRAY + '<' + itemType.getName() + '>';
		}

		public IRType getItemType() {
			return itemType;
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

		public TypeCompatibility isAssignableFrom(IRType type) {
			if (super.isAssignableFrom(type).ok()) {
				return TypeCompatibility.TRUE;
			}
			if (type instanceof ArrayTypeKey) {
				final TypeCompatibility compatibility = itemType
						.isAssignableFrom(((ArrayTypeKey) type).itemType);
				return compatibility == TypeCompatibility.TRUE ? compatibility
						: TypeCompatibility.UNPARAMETERIZED;
			} else {
				return TypeCompatibility.FALSE;
			}
		}

	}

	private static class MapTypeKey extends TypeKey implements IRMapType {

		private final IRType valueType;
		private final IRType keyType;

		public MapTypeKey(IRType keyType, IRType valueType) {
			this.keyType = keyType;
			this.valueType = valueType;
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

		public TypeCompatibility isAssignableFrom(IRType type) {
			if (super.isAssignableFrom(type).ok()) {
				return TypeCompatibility.TRUE;
			}
			if (type instanceof MapTypeKey) {
				return valueType
						.isAssignableFrom(((MapTypeKey) type).valueType);
			}
			return TypeCompatibility.FALSE;
		}

		public IRType getKeyType() {
			return keyType;
		}

		public IRType getValueType() {
			return valueType;
		}

	}

	private static final IRType ANY_TYPE = new AnyTypeKey();

	private static class AnyTypeKey extends TypeKey implements IRAnyType {

		public String getName() {
			return "Any";
		}

		@Override
		public TypeCompatibility isAssignableFrom(IRType type) {
			return TypeCompatibility.TRUE;
		}

	}

	private static final IRType NONE_TYPE = new NoneTypeKey();

	private static class NoneTypeKey extends TypeKey implements IRNoneType {

		public String getName() {
			return "None";
		}

		@Override
		public TypeCompatibility isAssignableFrom(IRType type) {
			return TypeCompatibility.TRUE;
		}

	}

	private static final IRType UNDEFINED_TYPE = new UndefinedTypeKey();

	private static class UndefinedTypeKey extends TypeKey implements
			IRUndefinedType {

		public String getName() {
			return ITypeNames.UNDEFINED;
		}

		public TypeCompatibility isAssignableFrom(IRType type) {
			return TypeCompatibility.valueOf(type == this);
		}

	}

	private static class UnionTypeKey extends TypeKey implements IRUnionType {

		final Set<IRType> targets = new LinkedHashSet<IRType>();

		public String getName() {
			final StringBuilder sb = new StringBuilder();
			for (IRType type : targets) {
				if (sb.length() != 0) {
					sb.append('|');
				}
				sb.append(type.getName());
			}
			return sb.toString();
		}

		public TypeCompatibility isAssignableFrom(IRType type) {
			for (IRType target : targets) {
				if (target.isAssignableFrom(type).ok()) {
					return TypeCompatibility.TRUE;
				}
			}
			return TypeCompatibility.FALSE;
		}

		public Set<IRType> getTargets() {
			return Collections.unmodifiableSet(targets);
		}

		@Override
		public int hashCode() {
			return targets.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof UnionTypeKey) {
				final UnionTypeKey other = (UnionTypeKey) obj;
				return targets.equals(other.targets);
			}
			return false;
		}

	}

	private static class RRecordMember implements IRRecordMember {

		final String name;
		final IRType type;
		final boolean optional;
		final Member member;

		public RRecordMember(String name, IRType type, Member member) {
			this.name = name;
			this.type = type;
			this.optional = member instanceof RecordMember
					&& ((RecordMember) member).isOptional();
			this.member = member;
		}

		public String getName() {
			return name;
		}

		public IRType getType() {
			return type;
		}

		public boolean isOptional() {
			return optional;
		}

		@Override
		public String toString() {
			return name + ":" + type;
		}

		@Override
		public int hashCode() {
			return name.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof RRecordMember) {
				final RRecordMember other = (RRecordMember) obj;
				return name.equals(other.name) && type.equals(other.type);
			}
			return false;
		}

		public Member getMember() {
			return member;
		}
	}

	private static class RecordTypeKey extends TypeKey implements IRRecordType {

		private final Map<String, IRRecordMember> members = new LinkedHashMap<String, IRRecordMember>();

		public RecordTypeKey(ITypeSystem context, List<Member> members) {
			for (Member member : members) {
				final IRType memberType = member.getType() != null ? normalize(
						context, member.getType()) : ANY_TYPE;
				this.members
						.put(member.getName(),
								new RRecordMember(member.getName(), memberType,
										member));
			}
		}

		public String getName() {
			final StringBuilder sb = new StringBuilder();
			sb.append('{');
			for (IRRecordMember member : members.values()) {
				if (sb.length() > 1) {
					sb.append(',');
				}
				sb.append(member.getName());
				if (!(member.getType() instanceof IRAnyType)) {
					sb.append(':');
					sb.append(member.getType().getName());
				}
			}
			sb.append('}');
			return sb.toString();
		}

		public IRRecordMember getMember(String name) {
			return members.get(name);
		}

		public Collection<IRRecordMember> getMembers() {
			return members.values();
		}

		public TypeCompatibility isAssignableFrom(IRType type) {
			if (super.isAssignableFrom(type).ok()) {
				return TypeCompatibility.TRUE;
			}
			if (type instanceof RecordTypeKey) {
				final Map<String, IRRecordMember> others = ((RecordTypeKey) type).members;
				for (Map.Entry<String, IRRecordMember> entry : others
						.entrySet()) {
					final IRRecordMember member = members.get(entry.getKey());
					if (member == null) {
						return TypeCompatibility.FALSE;
					}
					if (!member.getType()
							.isAssignableFrom(entry.getValue().getType()).ok()) {
						return TypeCompatibility.FALSE;
					}
				}
				for (Map.Entry<String, IRRecordMember> entry : members
						.entrySet()) {
					if (!entry.getValue().isOptional()
							&& !others.containsKey(entry.getKey())) {
						return TypeCompatibility.FALSE;
					}
				}
				return TypeCompatibility.TRUE;
			}
			return TypeCompatibility.FALSE;
		}

		@Override
		public int hashCode() {
			return members.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof RecordTypeKey) {
				final RecordTypeKey other = (RecordTypeKey) obj;
				return members.equals(other.members);
			}
			return false;
		}

	}

	private static class FunctionTypeKey extends TypeKey implements
			IRFunctionType {

		private final List<IRParameter> parameters;
		private final IRType returnType;

		public FunctionTypeKey(List<IRParameter> parameters, IRType returnType) {
			this.parameters = parameters;
			this.returnType = returnType;
		}

		public String getName() {
			// TODO (alex) generate function signature
			return ITypeNames.FUNCTION;
		}

		public TypeCompatibility isAssignableFrom(IRType type) {
			if (super.isAssignableFrom(type).ok()) {
				return TypeCompatibility.TRUE;
			} else if (type instanceof FunctionTypeKey) {
				return TypeCompatibility.TRUE;
			} else if (type instanceof SimpleTypeKey) {
				// TODO (alex) convert when creating type
				return TypeCompatibility.valueOf(ITypeNames.FUNCTION
						.equals(type.getName()));
			} else {
				return TypeCompatibility.FALSE;
			}
		}

		public IRType getReturnType() {
			return returnType;
		}

		public List<IRParameter> getParameters() {
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
			if (!parameters.equals(other.parameters))
				return false;
			if (returnType == null) {
				if (other.returnType != null)
					return false;
			} else if (!returnType.equals(other.returnType))
				return false;
			return true;
		}

	}

	public static IRType normalize(JSType type) {
		return normalize(null, type);
	}

	public static IRType normalize(ITypeSystem context, JSType type) {
		if (type instanceof ParameterizedType) {
			final ParameterizedType parameterized = (ParameterizedType) type;
			Type target = parameterized.getTarget();
			if (target == null) {
				return any();
			}
			if (context != null) {
				final EList<JSType> typeArguments = parameterized
						.getActualTypeArguments();
				final List<IRType> parameters = new ArrayList<IRType>(
						typeArguments.size());
				for (int i = 0; i < typeArguments.size(); ++i) {
					parameters.add(normalize(context, typeArguments.get(i)));
				}
				return new SimpleTypeKey(context, context.parameterize(target,
						parameters));
			} else {
				return ref(target);
			}
		} else if (type instanceof TypeVariableReference) {
			// TODO (alex) shouldn't happen
			return none();
		} else if (type instanceof SimpleType) {
			final SimpleType ref = (SimpleType) type;
			Type target = ref.getTarget();
			if (target == null) {
				return any();
			}
			if (target.isProxy() && context != null) {
				target = context.resolveType(target);
			}
			return ref(target);
		} else if (type instanceof ClassType) {
			Type target = ((ClassType) type).getTarget();
			if (target != null && target.isProxy() && context != null) {
				target = context.resolveType(target);
			}
			return classType(target);
		} else if (type instanceof ArrayType) {
			final JSType itemType = ((ArrayType) type).getItemType();
			return new ArrayTypeKey(context, normalize(context, itemType));
		} else if (type instanceof MapType) {
			final MapType mapType = (MapType) type;
			return mapOf(normalize(context, mapType.getKeyType()),
					normalize(context, mapType.getValueType()));
		} else if (type instanceof AnyType) {
			return ANY_TYPE;
		} else if (type instanceof UndefinedType) {
			return UNDEFINED_TYPE;
		} else if (type instanceof UnionType) {
			final UnionTypeKey union = new UnionTypeKey();
			for (JSType t : ((UnionType) type).getTargets()) {
				union.targets.add(normalize(context, t));
			}
			return union;
		} else if (type instanceof RecordType) {
			return new RecordTypeKey(context, ((RecordType) type).getMembers());
		} else if (type instanceof FunctionType) {
			final FunctionType funcType = (FunctionType) type;
			return new FunctionTypeKey(RModelBuilder.convert(context,
					funcType.getParameters()), normalize(context,
					funcType.getReturnType()));
		} else if (type instanceof RType) {
			return ((RType) type).getRuntimeType();
		} else if (type == null) {
			return null;
		} else {
			for (IRTypeFactory factory : TypeInfoManager.getRTypeFactories()) {
				final IRType runtimeType = factory.create(context, type);
				if (runtimeType != null) {
					return runtimeType;
				}
			}
			throw new IllegalArgumentException("Unsupported type "
					+ type.getClass().getName());
		}
	}

	public static IRType ref(Type type) {
		for (IRTypeFactory factory : TypeInfoManager.getRTypeFactories()) {
			final IRType runtimeType = factory.create(type);
			if (runtimeType != null) {
				return runtimeType;
			}
		}
		if (ITypeNames.ARRAY.equals(type.getName())) {
			return arrayOf(none());
		} else {
			return new SimpleTypeKey(type);
		}
	}

	public static IRType ref(String name) {
		final Type type = TypeInfoModelLoader.getInstance().getType(name);
		return ref(type);
	}

	public static IRType classType(Type type) {
		return new ClassTypeKey(type);
	}

	public static ArrayTypeKey arrayOf(final IRType itemType) {
		return new ArrayTypeKey(itemType);
	}

	public static MapTypeKey mapOf(final IRType keyType, final IRType valueType) {
		return new MapTypeKey(keyType, valueType);
	}

	public static IRType any() {
		return ANY_TYPE;
	}

	public static IRType none() {
		return NONE_TYPE;
	}

	public static IRType undefined() {
		return UNDEFINED_TYPE;
	}

	public static IRType union(List<IRType> targets) {
		final UnionTypeKey union = new UnionTypeKey();
		union.targets.addAll(targets);
		return union;
	}

	public static IRType functionType(List<IRParameter> parameters,
			IRType returnType) {
		return new FunctionTypeKey(parameters, returnType);
	}

	private static class JSTypeSetImpl extends JSTypeSet {

		private final List<IRType> types = new ArrayList<IRType>(3);

		protected JSTypeSetImpl() {
		}

		public Iterator<IRType> iterator() {
			return types.iterator();
		}

		@Override
		public void add(IRType type) {
			if (type instanceof IRUnionType) {
				for (IRType t : ((IRUnionType) type).getTargets()) {
					add(t);
				}
			} else {
				if (!types.contains(type)) {
					types.add(type);
				}
			}
		}

		@Override
		public IRType getFirst() {
			return types.iterator().next();
		}

		@Override
		public IRType toRType() {
			if (types.isEmpty()) {
				return none();
			} else if (types.size() == 1) {
				return types.iterator().next();
			} else {
				return union(types);
			}
		}

		@Override
		public Type[] toArray() {
			final LinkedHashSet<Type> result = new LinkedHashSet<Type>();
			for (IRType type : types) {
				if (type instanceof SimpleTypeKey) {
					result.add(((SimpleTypeKey) type).getTarget());
				} else if (type instanceof AnyTypeKey) {
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
			for (IRType type : types) {
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
		public boolean contains(IRType type) {
			return types.contains(type);
		}

		@Override
		public boolean contains(Type type) {
			return types.contains(ref(type));
		}

		@Override
		public boolean containsAll(JSTypeSet types) {
			for (IRType type : types) {
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

	public static JSTypeSet create(IRType type) {
		if (type == null || type == none()) {
			return emptySet();
		} else {
			final JSTypeSet set = new JSTypeSetImpl();
			set.add(type);
			return set;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof JSTypeSet) {
			final JSTypeSet other = (JSTypeSet) obj;
			return size() == other.size() && containsAll(other);
		}
		return false;
	}

	public abstract void add(IRType type);

	// public abstract void add(Type type);

	public abstract IRType getFirst();

	public abstract IRType toRType();

	public abstract Type[] toArray();

	public abstract int size();

	public abstract void addAll(JSTypeSet types);

	public abstract boolean isEmpty();

	public abstract void clear();

	public abstract boolean contains(IRType type);

	public abstract boolean contains(Type type);

	public abstract boolean containsAll(JSTypeSet types);

}
