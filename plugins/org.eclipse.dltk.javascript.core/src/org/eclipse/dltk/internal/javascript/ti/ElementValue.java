/*******************************************************************************
 * Copyright (c) 2010 xored software, Inc.
 *
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     xored software, Inc. - initial API and Implementation (Alex Panchenko)
 *******************************************************************************/
package org.eclipse.dltk.internal.javascript.ti;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.eclipse.dltk.compiler.problem.IProblemIdentifier;
import org.eclipse.dltk.internal.javascript.validation.ValidationMessages;
import org.eclipse.dltk.javascript.core.JavaScriptProblems;
import org.eclipse.dltk.javascript.core.Types;
import org.eclipse.dltk.javascript.typeinference.IAssignProtection;
import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinference.ReferenceKind;
import org.eclipse.dltk.javascript.typeinference.ReferenceLocation;
import org.eclipse.dltk.javascript.typeinfo.AttributeKey;
import org.eclipse.dltk.javascript.typeinfo.IRArrayType;
import org.eclipse.dltk.javascript.typeinfo.IRClassType;
import org.eclipse.dltk.javascript.typeinfo.IRFunctionType;
import org.eclipse.dltk.javascript.typeinfo.IRMapType;
import org.eclipse.dltk.javascript.typeinfo.IRRecordMember;
import org.eclipse.dltk.javascript.typeinfo.IRRecordType;
import org.eclipse.dltk.javascript.typeinfo.IRSimpleType;
import org.eclipse.dltk.javascript.typeinfo.IRType;
import org.eclipse.dltk.javascript.typeinfo.IRUnionType;
import org.eclipse.dltk.javascript.typeinfo.ITypeSystem;
import org.eclipse.dltk.javascript.typeinfo.JSTypeSet;
import org.eclipse.dltk.javascript.typeinfo.MemberPredicate;
import org.eclipse.dltk.javascript.typeinfo.MemberPredicates;
import org.eclipse.dltk.javascript.typeinfo.RSimpleType;
import org.eclipse.dltk.javascript.typeinfo.RTypes;
import org.eclipse.dltk.javascript.typeinfo.TypeCompatibility;
import org.eclipse.dltk.javascript.typeinfo.TypeMemberQuery;
import org.eclipse.dltk.javascript.typeinfo.TypeUtil;
import org.eclipse.dltk.javascript.typeinfo.model.ArrayType;
import org.eclipse.dltk.javascript.typeinfo.model.Element;
import org.eclipse.dltk.javascript.typeinfo.model.JSCustomType;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;
import org.eclipse.dltk.javascript.typeinfo.model.MapType;
import org.eclipse.dltk.javascript.typeinfo.model.Member;
import org.eclipse.dltk.javascript.typeinfo.model.Method;
import org.eclipse.dltk.javascript.typeinfo.model.ParameterizedType;
import org.eclipse.dltk.javascript.typeinfo.model.Property;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeKind;

public abstract class ElementValue implements IValue {

	public static ElementValue findMember(ITypeSystem context, IRType type,
			String name) {
		return findMember(context, type, name, MemberPredicates.ALWAYS_TRUE);
	}

	private static class NestedTypeSystem implements ITypeSystem {

		private final ITypeSystem origin;
		private final Type ownerType;

		public NestedTypeSystem(ITypeSystem origin, Type ownerType) {
			super();
			this.origin = origin;
			this.ownerType = ownerType;
		}

		public Type resolveType(Type type) {
			return origin.resolveType(type);
		}

		public IValue valueOf(Member member) {
			return origin.valueOf(member);
		}

		public Type parameterize(Type target, List<IRType> parameters) {
			return origin.parameterize(target, parameters);
		}

		@SuppressWarnings("unchecked")
		public <T> T getAttribute(AttributeKey<T> key) {
			if (ITypeSystem.CURRENT_TYPE == key) {
				return (T) ownerType;
			} else {
				return origin.getAttribute(key);
			}
		}

		public Object getValue(Object key) {
			return origin.getValue(key);
		}

		public void setValue(Object key, Object value) {
			origin.setValue(key, value);
		}
	}

	private static class PrototypeType extends RSimpleType {
		public PrototypeType(ITypeSystem typeSystem, Type type) {
			super(typeSystem, type);
		}

		public PrototypeType(Type type) {
			super(type != null ? type : Types.OBJECT);
		}

		@Override
		public String getName() {
			return "prototype<" + getTarget().getName() + ">";
		}

		@Override
		public boolean isExtensible() {
			return true;
		}
	}

	static ElementValue findMemberA(ITypeSystem context, IRType type,
			String name) {
		final MemberPredicate predicate;
		if (type instanceof IRClassType) {
			final Type target = ((IRClassType) type).getTarget();
			predicate = target != null ? target.memberPredicateFor(type,
					MemberPredicates.STATIC) : MemberPredicates.STATIC;
		} else if (type instanceof IRSimpleType) {
			final Type target = ((IRSimpleType) type).getTarget();
			predicate = target != null ? target.memberPredicateFor(type,
					MemberPredicates.NON_STATIC) : MemberPredicates.NON_STATIC;
		} else if (type instanceof IRUnionType) {
			// TODO (alex) use different predicate for each option
			predicate = MemberPredicates.ALWAYS_TRUE;
		} else {
			predicate = MemberPredicates.NON_STATIC;
		}
		return findMember(context, type, name, predicate);
	}

	public static ElementValue findMember(ITypeSystem context, IRType type,
			String name, MemberPredicate predicate) {
		if (type != null) {
			final ITypeSystem saved = type.activeTypeSystem();
			if (saved != null) {
				context = saved;
			}
		}
		if (IValueReference.ARRAY_OP.equals(name)) {
			IRType arrayType = TypeUtil.extractArrayItemType(type);
			// only give back this a a TypeValue if it is a known and not a
			// NoneType
			if (arrayType != null
					&& TypeUtil.kind(arrayType) != TypeKind.UNKNOWN
					&& arrayType != RTypes.none()) {
				return new TypeValue(context, arrayType);
			}
		}
		if (type instanceof IRClassType) {
			final Type t = ((IRClassType) type).getTarget();
			if (t != null) {
				final List<Member> selection = findMembers(t, name, predicate);
				if (!selection.isEmpty()) {
					if (selection.size() == 1) {
						return createElement(context, t, selection.get(0));
					}
					return new MemberValue(context,
							selection.toArray(new Member[selection.size()]));
				}
			}
			if ((t == null || t.hasPrototype())
					&& predicate.isCompatibleWith(MemberPredicates.STATIC)) {
				final List<Member> selection = findMembers(
						t != null ? t.getPrototypeType() : Types.FUNCTION,
						name, MemberPredicates.NON_STATIC);
				if (!selection.isEmpty()) {
					if (selection.size() == 1) {
						final Member selected = selection.get(0);
						if ("prototype".equals(selected.getName())
								&& selected instanceof Property) {
							final Type target = ((IRClassType) type)
									.getTarget();
							return new PrototypePropertyValue(context,
									(Property) selected, new PrototypeType(
											target));
						}
						return createElement(context, Types.FUNCTION, selected);
					}
					return new MemberValue(context,
							selection.toArray(new Member[selection.size()]));
				}
			}
		} else if (type instanceof IRUnionType) {
			for (IRType unionTarget : ((IRUnionType) type).getTargets()) {
				ElementValue member = findMember(context, unionTarget, name,
						predicate);
				if (member != null)
					return member;
			}
		} else if (type instanceof IRRecordType) {
			final IRRecordMember member = ((IRRecordType) type).getMember(name);
			if (member != null) {
				return new RTypeValue(context, member.getType(),
						member.getMember());
			}
		} else if (type instanceof IRFunctionType) {
			if (FunctionMethod.apply.test(name)) {
				return getFunctionMethod(context, (IRFunctionType) type,
						FunctionMethod.apply);
			} else if (FunctionMethod.call.test(name)) {
				return getFunctionMethod(context, (IRFunctionType) type,
						FunctionMethod.call);
			} else {
				final List<Member> selection = findMembers(Types.FUNCTION,
						name, predicate);
				if (!selection.isEmpty()) {
					if (selection.size() == 1) {
						return createElement(context, Types.FUNCTION,
								selection.get(0));
					}
					return new MemberValue(context,
							selection.toArray(new Member[selection.size()]));
				}
			}
		} else {
			final Type t = TypeUtil.extractType(context, type);
			if (t != null) {
				final List<Member> selection = findMembers(t, name, predicate);
				if (!selection.isEmpty()) {
					if (selection.size() == 1) {
						return createElement(context, t, selection.get(0));
					}
					return new MemberValue(context,
							selection.toArray(new Member[selection.size()]));
				}
			}
		}
		return null;
	}

	private static ElementValue getFunctionMethod(ITypeSystem context,
			IRFunctionType type, FunctionMethod method) {
		if (context != null) {
			final FunctionMethodKey key = new FunctionMethodKey(type, method);
			ElementValue value = (ElementValue) context.getValue(key);
			if (value == null) {
				value = new FunctionTypeMethodValue(context, type, method);
				context.setValue(key, value);
			}
			return value;
		} else {
			return new FunctionTypeMethodValue(context, type, method);
		}
	}

	private static class FunctionMethodKey extends
			AttributeKey<FunctionTypeMethodValue> {
		private final IRFunctionType type;
		private final FunctionMethod method;

		public FunctionMethodKey(IRFunctionType type, FunctionMethod method) {
			this.type = type;
			this.method = method;
		}

		@Override
		public int hashCode() {
			return type.hashCode() ^ method.hashCode();
		}

		@Override
		public boolean equals(Object obj) {
			if (obj instanceof FunctionMethodKey) {
				final FunctionMethodKey other = (FunctionMethodKey) obj;
				return type.equals(other.type) && method == other.method;
			}
			return false;
		}
	}

	private static ElementValue createElement(ITypeSystem context,
			final Type type, final Member member) {
		if (member instanceof Property) {
			if (isCustomType(member.getType())) {
				return new PropertyValue(new NestedTypeSystem(context, type),
						(Property) member);
			} else {
				return new PropertyValue(context, (Property) member);
			}
		} else if (member instanceof Method) {
			if (isCustomType(member.getType())) {
				return new MethodValue(new NestedTypeSystem(context, type),
						(Method) member);
			} else {
				return new MethodValue(context, (Method) member);
			}
		} else {
			return null;
		}
	}

	private static boolean isCustomType(JSType type) {
		if (type == null) {
			return false;
		} else if (type instanceof JSCustomType) {
			return true;
		}
		if (type instanceof ArrayType) {
			return isCustomType(((ArrayType) type).getItemType());
		} else if (type instanceof ParameterizedType) {
			final ParameterizedType parameterized = (ParameterizedType) type;
			for (JSType p : parameterized.getActualTypeArguments()) {
				if (isCustomType(p)) {
					return true;
				}
			}
		}
		return false;
	}

	public static List<Member> findMembers(Type type, String name,
			MemberPredicate predicate) {
		final List<Member> selection = new ArrayList<Member>(4);
		for (Member member : new TypeMemberQuery(type, predicate)
				.ignoreDuplicates()) {
			if (name.equals(member.getName())) {
				selection.add(member);
			}
		}
		return selection;
	}

	public static ElementValue createFor(Element element, ITypeSystem context) {
		if (element instanceof Method) {
			return new MethodValue(context, (Method) element);
		} else if (element instanceof Property) {
			return new PropertyValue(context, (Property) element);
		} else {
			final Type type = (Type) element;
			return new TypeValue(context,
					RTypes.simple(context != null ? context.resolveType(type)
							: type));
		}
	}

	public static ElementValue createClass(ITypeSystem context, Type type) {
		return new ClassValue(context, JSTypeSet.singleton(RTypes
				.classType(type)));
	}

	static class TypeValue extends ElementValue implements IValue {

		private final Map<String, IValue> children = new HashMap<String, IValue>(
				4, 0.9f);

		private final JSTypeSet types;

		public TypeValue(ITypeSystem context, IRType type) {
			super(context);
			this.types = JSTypeSet.singleton(type);
		}

		public TypeValue(ITypeSystem context, JSTypeSet types) {
			super(context);
			this.types = types;
		}

		@Override
		protected Type[] getElements() {
			return types.toArray();
		}

		public IValue getChild(String name, boolean resolve) {
			IValue value = children.get(name);
			if (value == null) {
				if (name.equals(IValueReference.ARRAY_OP)) {
					value = new Value();
				} else {
					for (IRType type : types) {
						value = findMemberA(context, type, name);
						if (value != null) {
							if (value instanceof ElementValue) {
								value = ((ElementValue) value).resolveValue();
							}
							break;
						}
					}
				}
				if (value != null) {
					children.put(name, value);
				}
			}
			return value;
		}

		public IRType getDeclaredType() {
			return types.getFirst();
		}

		public JSTypeSet getDeclaredTypes() {
			return types;
		}

		@Override
		public final JSTypeSet getTypes() {
			return types;
		}

		@Override
		public String toString() {
			return getClass().getSimpleName() + types;
		}
	}

	private static class ClassValue extends ElementValue implements IValue {

		private final JSTypeSet types;

		public ClassValue(ITypeSystem context, JSTypeSet types) {
			super(context);
			this.types = types;
		}

		@Override
		protected Type[] getElements() {
			return types.toArray();
		}

		public IValue getChild(String name, boolean resolve) {
			// just guess that if the child is the function operator it is a new
			// expression of this type. return then the none static type.
			if (name.equals(IValueReference.FUNCTION_OP)) {
				if (types.size() == 1) {
					final IRType type = types.getFirst();
					if (type instanceof IRClassType) {
						return new TypeValue(context,
								((IRClassType) type).newItemType());
					}
				}
				final JSTypeSet returnTypes = JSTypeSet.create();
				for (IRType type : types) {
					if (type instanceof IRClassType) {
						returnTypes.add(((IRClassType) type).newItemType());
					} else {
						returnTypes.add(type);
					}
				}
				return new TypeValue(context, returnTypes);
			}
			for (IRType type : types) {
				IValue child = findMember(context, type, name,
						MemberPredicates.STATIC);
				if (child != null)
					return child;
			}
			return null;
		}

		public IRType getDeclaredType() {
			return types.getFirst();
		}

		public JSTypeSet getDeclaredTypes() {
			return types;
		}

		@Override
		public ReferenceKind getKind() {
			return ReferenceKind.TYPE;
		}

		@Override
		public Object getAttribute(String key, boolean includeReferences) {
			if (IAssignProtection.ATTRIBUTE.equals(key)) {
				return UNASSIGNABLE_CLASS;
			}
			return super.getAttribute(key, includeReferences);
		}

		@Override
		public String toString() {
			return getClass().getSimpleName() + types;
		}
	}

	private static class MethodValue extends ElementValue implements IValue {

		private TypeValue functionOperator;
		private final Method method;

		public MethodValue(ITypeSystem context, Method method) {
			super(context);
			this.method = method;
		}

		@Override
		protected Method getElements() {
			return method;
		}

		@Override
		public IValue resolveValue() {
			final IValue value = context.valueOf(method);
			if (value != null) {
				return value;
			}
			return this;
		}

		@Override
		public ReferenceKind getKind() {
			return ReferenceKind.METHOD;
		}

		public IValue getChild(String name, boolean resolve) {
			if (IValueReference.FUNCTION_OP.equals(name)) {
				if (method.getType() != null) {
					if (functionOperator == null) {
						functionOperator = new TypeValue(context,
								JSTypeSet.singleton(RTypes.create(context,
										method.getType())));
					}
					return functionOperator;
				}
			}
			final ElementValue child = ElementValue.findMemberA(context,
					getDeclaredType(), name);
			if (child != null) {
				return child;
			}
			return null;
		}

		public IRType getDeclaredType() {
			return RTypes.simple(Types.FUNCTION);
		}

		public JSTypeSet getDeclaredTypes() {
			return JSTypeSet.singleton(getDeclaredType());
		}

		@Override
		public Object getAttribute(String key, boolean includeReferences) {
			if (IAssignProtection.ATTRIBUTE.equals(key)
					&& method.getDeclaringType() == null) {
				return UNASSIGNABLE_METHOD;
			}
			return super.getAttribute(key, includeReferences);
		}

		@Override
		public String toString() {
			return getClass().getSimpleName() + '<' + method + '>';
		}
	}

	public static final IAssignProtection READONLY_PROPERTY = new IAssignProtection() {
		public IProblemIdentifier problemId() {
			return JavaScriptProblems.PROPERTY_READONLY;
		}

		public String problemMessage() {
			return ValidationMessages.AssignmentToReadonlyProperty;
		}
	};

	static final IAssignProtection UNASSIGNABLE_METHOD = new IAssignProtection() {
		public IProblemIdentifier problemId() {
			return JavaScriptProblems.UNASSIGNABLE_ELEMENT;
		}

		public String problemMessage() {
			return ValidationMessages.UnassignableMethod;
		}
	};

	static final IAssignProtection UNASSIGNABLE_CLASS = new IAssignProtection() {
		public IProblemIdentifier problemId() {
			return JavaScriptProblems.UNASSIGNABLE_ELEMENT;
		}

		public String problemMessage() {
			return ValidationMessages.UnassignableClass;
		}
	};

	static final IRType NOT_INITIALIZED = new IRType() {

		public TypeCompatibility isAssignableFrom(IRType type) {
			return TypeCompatibility.FALSE;
		}

		public String getName() {
			return "NOT_INITIALIZED";
		}

		public ITypeSystem activeTypeSystem() {
			return null;
		}

		public String toString() {
			return getName();
		}

		public boolean isExtensible() {
			return false;
		}

		public boolean isJavaScriptObject() {
			return false;
		}
	};

	private static class PropertyValue extends ElementValue implements IValue {

		private final Property property;
		private final Map<String, IValue> children = new HashMap<String, IValue>(
				4, 0.9f);

		public PropertyValue(ITypeSystem context, Property property) {
			super(context);
			this.property = property;
		}

		@Override
		protected Property getElements() {
			return property;
		}

		@Override
		public IValue resolveValue() {
			final IValue value = context.valueOf(property);
			if (value != null) {
				return value;
			}
			return this;
		}

		@Override
		public ReferenceKind getKind() {
			return ReferenceKind.PROPERTY;
		}

		public IValue getChild(String name, boolean resolve) {
			IValue child = children.get(name);
			if (child == null) {
				if (name.equals(IValueReference.ARRAY_OP)
						&& property.getType() != null) {
					Type arrayType = null;
					if (property.getType() instanceof ArrayType) {
						arrayType = TypeUtil.extractType(((ArrayType) property
								.getType()).getItemType());
					} else if (property.getType() instanceof MapType) {
						arrayType = TypeUtil.extractType(((MapType) property
								.getType()).getValueType());
					}
					if (arrayType != null) {
						child = createFor(arrayType, context);
						children.put(name, child);
						return child;
					}
				}
				final IRType propType = getDeclaredType();
				final ElementValue eValue = ElementValue.findMemberA(context,
						propType, name);
				if (eValue != null) {
					child = eValue.resolveValue();
					children.put(name, child);
				}
			}
			return child;
		}

		private IRType declaredType = NOT_INITIALIZED;

		public IRType getDeclaredType() {
			if (declaredType == NOT_INITIALIZED) {
				declaredType = RTypes.create(context, property.getType());
			}
			return declaredType;
		}

		private JSTypeSet declaredTypes = null;

		public JSTypeSet getDeclaredTypes() {
			if (declaredTypes == null) {
				final IRType type = getDeclaredType();
				if (type != null) {
					declaredTypes = JSTypeSet.singleton(type);
				} else {
					declaredTypes = JSTypeSet.emptySet();
				}
			}
			return declaredTypes;
		}

		@Override
		public Object getAttribute(String key, boolean includeReferences) {
			if (IAssignProtection.ATTRIBUTE.equals(key)) {
				final Type declaringType = property.getDeclaringType();
				if (declaringType != null) {
					return declaringType.getReadOnlyStatus(property);
				} else {
					return property.isReadOnly() ? READONLY_PROPERTY : null;
				}
			}
			return super.getAttribute(key, includeReferences);
		}

		@Override
		public String toString() {
			return getClass().getSimpleName() + '<' + property + '>';
		}
	}

	private static class PrototypePropertyValue extends PropertyValue {
		private final IRType valueType;

		public PrototypePropertyValue(ITypeSystem context, Property property,
				IRType valueType) {
			super(context, property);
			this.valueType = valueType;
		}

		@Override
		public IRType getDeclaredType() {
			return valueType;
		}
	}

	private static class RTypeValue extends ElementValue implements IValue {

		private final IRType type;
		private final Map<String, IValue> children = new HashMap<String, IValue>();
		private final Member element;

		public RTypeValue(ITypeSystem context, IRType type, Member element) {
			super(context);
			this.type = type;
			this.element = element;
		}

		@Override
		protected Member getElements() {
			return element;
		}

		@Override
		public ReferenceKind getKind() {
			return ReferenceKind.PROPERTY;
		}

		public IValue getChild(String name, boolean resolve) {
			IValue child = children.get(name);
			if (child == null) {
				if (name.equals(IValueReference.ARRAY_OP)) {
					Type arrayType = null;
					if (type instanceof IRArrayType) {
						arrayType = TypeUtil.extractType(context,
								((IRArrayType) type).getItemType());
					} else if (type instanceof IRMapType) {
						arrayType = TypeUtil.extractType(context,
								((IRMapType) type).getValueType());
					}
					if (arrayType != null) {
						ElementValue arrayOpChild = createFor(arrayType,
								context);
						children.put(name, arrayOpChild);
						return arrayOpChild;
					}
				} else if (IValueReference.FUNCTION_OP.equals(name)) {
					if (type instanceof IRFunctionType) {
						child = new Value();
						child.addType(((IRFunctionType) type).getReturnType());
						children.put(name, child);
						return child;
					}
				}
				ElementValue eValue = ElementValue.findMemberA(context, type,
						name);
				if (eValue != null) {
					child = eValue.resolveValue();
					children.put(name, child);
				}
			}
			return child;
		}

		public IRType getDeclaredType() {
			return type;
		}

		public JSTypeSet getDeclaredTypes() {
			if (type != null) {
				return JSTypeSet.singleton(type);
			} else {
				return JSTypeSet.emptySet();
			}
		}

		@Override
		public String toString() {
			return getClass().getSimpleName() + '<' + type + '>';
		}
	}

	private static class MemberValue extends ElementValue implements IValue {

		private TypeValue functionOperator;
		private final Member[] members;

		public MemberValue(ITypeSystem context, Member[] members) {
			super(context);
			this.members = members;
		}

		@Override
		protected Member[] getElements() {
			return members;
		}

		@Override
		public IValue resolveValue() {
			if (members.length == 1) {
				final IValue value = context.valueOf(members[0]);
				if (value != null) {
					// copy over the properties of this value.
					value.setDeclaredType(getDeclaredType());
					value.setAttribute(IReferenceAttributes.ELEMENT,
							getAttribute(IReferenceAttributes.ELEMENT));
					return value;
				}
			}
			return this;
		}

		@Override
		public ReferenceKind getKind() {
			for (Member member : members) {
				if (member instanceof Method)
					return ReferenceKind.METHOD;
			}
			return ReferenceKind.PROPERTY;
		}

		public IValue getChild(String name, boolean resolve) {
			if (IValueReference.FUNCTION_OP.equals(name)) {
				JSTypeSet types = null;
				for (Member member : members) {
					if (member instanceof Method) {
						final Method method = (Method) member;
						if (method.getType() != null) {
							if (types == null) {
								types = JSTypeSet.create();
							}
							types.add(RTypes.create(context, method.getType()));
						}
					}
				}
				if (types != null) {
					if (functionOperator == null) {
						functionOperator = new TypeValue(context, types);
					}
					return functionOperator;
				}
			}

			IRType type = getDeclaredType();
			if (type != null) {
				final ElementValue child = ElementValue.findMemberA(context,
						type, name);
				if (child != null) {
					return child;
				}
			}
			return null;
		}

		public IRType getDeclaredType() {
			for (Member member : members) {
				if (member instanceof Property) {
					final Property property = (Property) member;
					if (property.getType() != null) {
						return RTypes.create(context, property.getType());
					}
				} else if (member instanceof Method) {
					return RTypes.simple(Types.FUNCTION);
				}
			}
			return null;
		}

		public JSTypeSet getDeclaredTypes() {
			JSTypeSet types = null;
			for (Member member : members) {
				if (member instanceof Property) {
					final Property property = (Property) member;
					if (property.getType() != null) {
						if (types == null) {
							types = JSTypeSet.create();
						}
						types.add(RTypes.create(context, property.getType()));
					}
				} else if (member instanceof Method) {
					if (types == null) {
						types = JSTypeSet.create();
					}
					types.add(RTypes.simple(Types.FUNCTION));
				}
			}
			if (types != null) {
				return types;
			} else {
				return JSTypeSet.emptySet();
			}
		}

		@Override
		public Object getAttribute(String key, boolean includeReferences) {
			if (IAssignProtection.ATTRIBUTE.equals(key)) {
				for (Member member : members) {
					if (member instanceof Property) {
						if (((Property) member).isReadOnly()) {
							return READONLY_PROPERTY;
						}
					} else if (member instanceof Method
							&& member.getDeclaringType() == null) {
						return UNASSIGNABLE_METHOD;
					}
				}
				return null;
			}
			return super.getAttribute(key, includeReferences);
		}

	}

	protected final ITypeSystem context;

	public ElementValue(ITypeSystem context) {
		this.context = context;
	}

	protected abstract Object getElements();

	public IValue resolveValue() {
		return this;
	}

	public final void clear() {
	}

	public final void addValue(IValue src) {
	}

	public final void addReference(IValue src) {
	}

	public void removeReference(IValue value) {
	}

	public final Object getAttribute(String key) {
		return getAttribute(key, false);
	}

	public Object getAttribute(String key, boolean includeReferences) {
		if (IReferenceAttributes.ELEMENT.equals(key)) {
			return getElements();
		}
		if (IReferenceAttributes.TYPE_SYSTEM.equals(key)) {
			return context;
		}
		if (IReferenceAttributes.HIDE_ALLOWED.equals(key)) {
			final Object elements = getElements();
			if (elements instanceof Element) {
				return ((Element) elements).isHideAllowed() ? Boolean.TRUE
						: null;
			}
		}
		return null;
	}

	public final void setAttribute(String key, Object value) {
	}

	public final Set<String> getDirectChildren() {
		return Collections.emptySet();
	}

	public Set<String> getDeletedChildren() {
		return Collections.emptySet();
	}

	public void deleteChild(String name) {
	}

	public final boolean hasChild(String name) {
		return false;
	}

	public final IValue createChild(String name, int flags) {
		return getChild(name, true);
		// throw new UnsupportedOperationException();
	}

	public void putChild(String name, IValue value) {
		throw new UnsupportedOperationException();
	}

	public ReferenceKind getKind() {
		return ReferenceKind.UNKNOWN;
	}

	public final ReferenceLocation getLocation() {
		return ReferenceLocation.UNKNOWN;
	}

	public JSTypeSet getTypes() {
		return JSTypeSet.emptySet();
	}

	public final void setDeclaredType(IRType declaredType) {
	}

	public void addType(IRType type) {
	}

	public final void setKind(ReferenceKind kind) {
	}

	public final void setLocation(ReferenceLocation location) {
	}
}
