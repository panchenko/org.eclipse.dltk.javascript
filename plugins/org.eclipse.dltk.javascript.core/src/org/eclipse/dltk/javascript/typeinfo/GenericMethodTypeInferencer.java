/*******************************************************************************
 * Copyright (c) 2012 NumberFour AG
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
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.dltk.annotations.Internal;
import org.eclipse.dltk.annotations.Nullable;
import org.eclipse.dltk.internal.javascript.ti.IValue;
import org.eclipse.dltk.javascript.typeinfo.model.ArrayType;
import org.eclipse.dltk.javascript.typeinfo.model.GenericMethod;
import org.eclipse.dltk.javascript.typeinfo.model.GenericType;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;
import org.eclipse.dltk.javascript.typeinfo.model.MapType;
import org.eclipse.dltk.javascript.typeinfo.model.ParameterizedType;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeVariable;
import org.eclipse.dltk.javascript.typeinfo.model.TypeVariableClassType;
import org.eclipse.dltk.javascript.typeinfo.model.TypeVariableReference;
import org.eclipse.dltk.javascript.typeinfo.model.UnionType;

/**
 * Helper class for inferring values of the type variables used in a generic
 * method call.
 * <p>
 * Usage instructions:
 * </p>
 * <ul>
 * <li>instantiate it with the type system and generic method which type
 * variables should be inferred</li>
 * <li>call {@link #capture(JSType, Iterable)} for each parameter, passing the
 * parameter type declaration and the actual argument type(s).</li>
 * <li>pass this object as type system to
 * {@link RTypes#create(ITypeSystem, JSType)} together with the declared method
 * return type, so this object will provide evaluated types of the type
 * variables and delegate all other requests to the type system passed in the
 * constructor OR call {@link #getTypeVariable(TypeVariable)} directly.</li>
 * </ul>
 */
public class GenericMethodTypeInferencer implements ITypeSystem {

	private final ITypeSystem typeSystem;
	private final Map<TypeVariable, JSTypeSet> captures = new HashMap<TypeVariable, JSTypeSet>();
	private final Map<TypeVariable, IRType> evaluated = new HashMap<TypeVariable, IRType>();

	public GenericMethodTypeInferencer(ITypeSystem typeSystem,
			GenericMethod method) {
		this.typeSystem = typeSystem;
		for (TypeVariable variable : method.getTypeParameters()) {
			captures.put(variable, JSTypeSet.create());
		}
	}

	/**
	 * Return type of the
	 * {@link GenericMethodTypeInferencer#capture(JSType, Iterable)} method.
	 */
	public interface Capture {

		/**
		 * Returns whether this capture indicates everything is okay (not okay
		 * means there were some incompatible types).
		 */
		boolean isOK();

		/**
		 * Returns type variables captured, if nothing was captured then empty
		 * collection is returned.
		 */
		Collection<TypeVariable> getVariables();

		/**
		 * Returns captured types of the specified type variable, if type
		 * variable was specified incorrectly then <code>null</code> is
		 * returned.
		 */
		JSTypeSet getTypeOf(TypeVariable variable);
	}

	private static enum ErrorCapture implements Capture {
		ERROR;

		public boolean isOK() {
			return false;
		}

		public Collection<TypeVariable> getVariables() {
			return Collections.emptyList();
		}

		public JSTypeSet getTypeOf(TypeVariable variable) {
			return JSTypeSet.emptySet();
		}
	}

	private static abstract class AbstractCapture implements Capture {
		final int weight;

		public AbstractCapture(int weight) {
			this.weight = weight;
		}

		public boolean isOK() {
			return true;
		}
	}

	private static class SingleCapture extends AbstractCapture {
		private final TypeVariable variable;
		private final Iterable<? extends IRType> types;

		public SingleCapture(TypeVariable variable,
				Iterable<? extends IRType> types, int weight) {
			super(weight);
			this.variable = variable;
			this.types = types;
		}

		public Collection<TypeVariable> getVariables() {
			return Collections.singletonList(variable);
		}

		public JSTypeSet getTypeOf(TypeVariable variable) {
			return this.variable.equals(variable) ? JSTypeSet.of(types) : null;
		}

		@Override
		public String toString() {
			return variable + "=" + types;
		}
	}

	private static class MultiCapture extends AbstractCapture {

		private final Map<TypeVariable, JSTypeSet> captures;

		public MultiCapture(Map<TypeVariable, JSTypeSet> captures, int weight) {
			super(weight);
			this.captures = captures;
		}

		public Collection<TypeVariable> getVariables() {
			return captures.keySet();
		}

		public JSTypeSet getTypeOf(TypeVariable variable) {
			return captures.get(variable);
		}

		@Override
		public String toString() {
			return captures.toString();
		}
	}

	private static final int SIMPLE_WEIGHT = 0;
	private static final int CLASS_WEIGHT = 10;

	/**
	 * Captures the values of the type variables based on the parameter
	 * declaration and actual argument types.
	 * <p>
	 * Algorithm is pretty simple: handle all possible types of the type
	 * expressions and collect matches.
	 * </p>
	 * 
	 * @return the captured type variable and evaluated types, possibly
	 *         <code>null</code>.
	 */
	@Nullable
	public Capture capture(JSType paramType, Iterable<? extends IRType> argTypes) {
		final Capture capture = doCapture(paramType, argTypes);
		if (capture != null) {
			for (TypeVariable variable : capture.getVariables()) {
				final JSTypeSet variableTypes = captures.get(variable);
				if (variableTypes != null) {
					variableTypes.addAll(capture.getTypeOf(variable));
					evaluated.remove(variable);
				}
			}
		}
		return capture;
	}

	@Nullable
	private Capture doCapture(JSType paramType,
			Iterable<? extends IRType> argTypes) {
		if (paramType instanceof TypeVariableReference) {
			return capture(((TypeVariableReference) paramType).getVariable(),
					argTypes, SIMPLE_WEIGHT);
		} else if (paramType instanceof TypeVariableClassType) {
			final JSTypeSet result = JSTypeSet.create();
			for (IRType type : argTypes) {
				if (type instanceof IRClassType) {
					result.add(((IRClassType) type).toItemType());
				}
			}
			return !result.isEmpty() ? capture(
					((TypeVariableClassType) paramType).getVariable(), result,
					CLASS_WEIGHT) : null;
		} else if (paramType instanceof ArrayType) {
			final JSTypeSet result = JSTypeSet.create();
			for (IRType type : argTypes) {
				if (type instanceof IRArrayType) {
					result.add(((IRArrayType) type).getItemType());
				}
			}
			return !result.isEmpty() ? doCapture(
					((ArrayType) paramType).getItemType(), result) : null;
		} else if (paramType instanceof MapType) {
			final MapType mapType = (MapType) paramType;
			final JSTypeSet keys = JSTypeSet.create();
			final JSTypeSet values = JSTypeSet.create();
			for (IRType type : argTypes) {
				if (type instanceof IRMapType) {
					final IRMapType arg = (IRMapType) type;
					if (arg.getKeyType() != null) {
						keys.add(arg.getKeyType());
					}
					values.add(arg.getValueType());
				}
			}
			final Capture key = mapType.getKeyType() != null && !keys.isEmpty() ? doCapture(
					mapType.getKeyType(), keys) : null;
			final Capture value = mapType.getValueType() != null
					&& !values.isEmpty() ? doCapture(mapType.getValueType(),
					values) : null;
			return merge(key, value);
		} else if (paramType instanceof ParameterizedType) {
			final ParameterizedType parameterized = (ParameterizedType) paramType;
			final int typeParamCount = parameterized.getActualTypeArguments()
					.size();
			final JSTypeSet[] typeParams = new JSTypeSet[typeParamCount];
			for (int i = 0; i < typeParamCount; ++i) {
				typeParams[i] = JSTypeSet.create();
			}
			final Type genericType = typeSystem.resolveType(parameterized
					.getTarget());
			for (IRType type : argTypes) {
				if (type instanceof IRSimpleType) {
					final IRTypeDeclaration declaration = ((IRSimpleType) type)
							.getDeclaration();
					if (genericType.equals(declaration.getSource())) {
						if (declaration.isParameterized()) {
							final int effectiveParamCount = Math.min(
									typeParamCount, declaration
											.getActualTypeArguments().size());
							for (int i = 0; i < effectiveParamCount; ++i) {
								typeParams[i].add(declaration
										.getActualTypeArguments().get(i));
							}
						} else if (genericType instanceof GenericType) {
							final List<TypeVariable> typeParameters = ((GenericType) genericType)
									.getTypeParameters();
							for (int i = 0; i < typeParamCount; ++i) {
								if (i < typeParameters.size()
										&& typeParameters.get(i).getBound() != null) {
									typeParams[i].add(RTypes.create(typeSystem,
											typeParameters.get(i).getBound()));
								}
							}
						}
					}
				}
			}
			final Capture[] results = new Capture[typeParamCount];
			for (int i = 0; i < typeParamCount; ++i) {
				results[i] = doCapture(parameterized.getActualTypeArguments()
						.get(i), typeParams[i]);
			}
			return merge(results);
		} else if (paramType instanceof UnionType) {
			AbstractCapture bestCapture = null;
			for (JSType type : ((UnionType) paramType).getTargets()) {
				final Capture capture = doCapture(type, argTypes);
				if (capture instanceof AbstractCapture) {
					final AbstractCapture ac = (AbstractCapture) capture;
					if (bestCapture == null || ac.weight > bestCapture.weight) {
						bestCapture = ac;
					}
				}
			}
			return bestCapture;
		} else {
			// TODO alex other type expressions
			return null;
		}
	}

	@Internal
	static class TempCapture {
		final JSTypeSet types = JSTypeSet.create();
		int weight;
	}

	private Capture merge(Capture... captures) {
		int errors = 0;
		final Map<TypeVariable, TempCapture> variables = new HashMap<TypeVariable, TempCapture>();
		for (Capture capture : captures) {
			if (capture != null) {
				if (capture == ErrorCapture.ERROR) {
					++errors;
				} else if (capture instanceof AbstractCapture) {
					final AbstractCapture ac = (AbstractCapture) capture;
					for (TypeVariable variable : capture.getVariables()) {
						TempCapture temp = variables.get(variable);
						if (temp == null) {
							temp = new TempCapture();
							temp.weight = ac.weight;
							variables.put(variable, temp);
						} else {
							if (ac.weight > temp.weight) {
								temp.weight = ac.weight;
								temp.types.clear();
							}
						}
						temp.types.addAll(capture.getTypeOf(variable));
					}
				}
			}
		}
		if (variables.isEmpty()) {
			return errors != 0 ? ErrorCapture.ERROR : null;
		} else if (variables.size() == 1) {
			final Map.Entry<TypeVariable, TempCapture> entry = variables
					.entrySet().iterator().next();
			return new SingleCapture(entry.getKey(), entry.getValue().types,
					entry.getValue().weight);
		} else {
			int weight = Integer.MAX_VALUE;
			final Map<TypeVariable, JSTypeSet> multiCaptures = new HashMap<TypeVariable, JSTypeSet>();
			for (Map.Entry<TypeVariable, TempCapture> entry : variables
					.entrySet()) {
				if (entry.getValue().weight < weight) {
					weight = entry.getValue().weight;
				}
				multiCaptures.put(entry.getKey(), entry.getValue().types);
			}
			return new MultiCapture(multiCaptures, weight);
		}
	}

	@Nullable
	private Capture capture(TypeVariable variable,
			Iterable<? extends IRType> argTypes, int weight) {
		return captures.containsKey(variable) ? new SingleCapture(variable,
				argTypes, weight) : null;
	}

	/**
	 * Implements {@link ITypeSystem#getTypeVariable(TypeVariable)}, providing
	 * the evaluated types of the type variables.
	 */
	public IRType getTypeVariable(TypeVariable variable) {
		IRType type = evaluated.get(variable);
		if (type != null) {
			return type;
		}
		final JSTypeSet types = captures.get(variable);
		if (types != null) {
			if (types.size() > 1) {
				// TODO (alex) improve the APIs
				final List<IRType> copy = new ArrayList<IRType>(types.size());
				for (IRType t : types) {
					copy.add(t);
				}
				type = CommonSuperTypeFinder.evaluate(typeSystem, copy);
			} else {
				type = types.toRType();
			}
			if (type == null) {
				type = RTypes.none();
			}
			evaluated.put(variable, type);
			return type;
		}
		return null;
	}

	// the following methods just delegate to the type system passed in the
	// constructor.

	public Type getKnownType(String typeName) {
		return typeSystem.getKnownType(typeName);
	}

	public Type resolveType(Type type) {
		return typeSystem.resolveType(type);
	}

	public IValue valueOf(IRMember member) {
		return typeSystem.valueOf(member);
	}

	public IRTypeDeclaration convert(Type type) {
		return typeSystem.convert(type);
	}

	public <E extends IRMember> E contextualize(E member, IRTypeDeclaration type) {
		return typeSystem.contextualize(member, type);
	}

	public IRTypeDeclaration parameterize(Type target,
			List<? extends IRType> parameters) {
		return typeSystem.parameterize(target, parameters);
	}

	public Object getValue(Object key) {
		return typeSystem.getValue(key);
	}

	public void setValue(Object key, Object value) {
		typeSystem.setValue(key, value);
	}

	public ITypeSystem getPrimary() {
		return typeSystem;
	}

}
