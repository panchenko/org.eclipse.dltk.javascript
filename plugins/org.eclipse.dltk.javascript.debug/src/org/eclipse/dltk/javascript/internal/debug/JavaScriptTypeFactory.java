package org.eclipse.dltk.javascript.internal.debug;

import org.eclipse.debug.core.DebugException;
import org.eclipse.debug.core.model.IVariable;
import org.eclipse.dltk.debug.core.DLTKDebugPlugin;
import org.eclipse.dltk.debug.core.model.ArrayScriptType;
import org.eclipse.dltk.debug.core.model.AtomicScriptType;
import org.eclipse.dltk.debug.core.model.ComplexScriptType;
import org.eclipse.dltk.debug.core.model.IScriptType;
import org.eclipse.dltk.debug.core.model.IScriptTypeFactory;
import org.eclipse.dltk.debug.core.model.IScriptValue;
import org.eclipse.dltk.debug.core.model.StringScriptType;

public class JavaScriptTypeFactory implements IScriptTypeFactory {
	private static final String[] atomicTypes = { "number", "boolean", "date" };

	private static final ThreadLocal<Integer> detailsLevel = new ThreadLocal<Integer>() {
		protected Integer initialValue() {
			return Integer.valueOf(0);
		}
	};

	public JavaScriptTypeFactory() {

	}

	public IScriptType buildType(String type) {
		for (int i = 0; i < atomicTypes.length; ++i) {
			if (atomicTypes[i].equals(type)) {
				return new AtomicScriptType(type);
			}
		}

		if ("javaarray".equals(type) || "array".equals(type)) {
			return new ArrayScriptType() {
				protected String buildDetailString(IVariable variable)
						throws DebugException {
					Integer currentLevel = detailsLevel.get();
					detailsLevel
							.set(Integer.valueOf(currentLevel.intValue() + 1));
					try {
						if (variable.getValue() instanceof IScriptValue
								&& currentLevel.intValue() < 2) {
							IScriptValue value = (IScriptValue) variable
									.getValue();
							return value.getType().formatDetails(value);
						}
						return super.buildDetailString(variable);
					} finally {
						currentLevel = detailsLevel.get();
						detailsLevel.set(Integer.valueOf(currentLevel
								.intValue() - 1));
					}

				}
			};
		}

		if ("string".equals(type)) {
			return new StringScriptType("string");
		}
		return new ComplexScriptType(type) {
			public String formatValue(IScriptValue value) {
				StringBuffer sb = new StringBuffer();
				sb.append(value.getRawValue());
				String id = value.getInstanceId();
				if (id != null) {
					sb.append(" (id = " + id + ")"); // TODO add constant
				}

				return sb.toString();
			}

			/**
			 * @see org.eclipse.dltk.debug.core.model.ComplexScriptType#formatDetails(org.eclipse.dltk.debug.core.model.IScriptValue)
			 */
			public String formatDetails(IScriptValue value) {
				StringBuffer sb = new StringBuffer();
				Integer currentLevel = detailsLevel.get();
				detailsLevel.set(Integer.valueOf(currentLevel.intValue() + 1));
				try {
					IVariable[] variables = value.getVariables();
					if (variables.length > 0) {
						sb.append("{");
						for (int i = 0; i < variables.length; i++) {
							sb.append(variables[i].getName());
							sb.append(":");
							if (variables[i].getValue() instanceof IScriptValue) {
								if (currentLevel.intValue() < 2) {
									IScriptValue sv = (IScriptValue) variables[i]
											.getValue();
									sb.append(sv.getType().formatDetails(sv));
								} else
									sb.append("{...}");
							} else {
								sb.append(variables[i].getValue()
										.getValueString());
							}
							sb.append(",");
						}
						sb.setLength(sb.length() - 1);
						sb.append("}");
					} else {
						sb.append(value.getRawValue());
						String id = value.getInstanceId();
						if (id != null) {
							sb.append(" (id = " + id + ")");
						}
					}
				} catch (DebugException ex) {
					DLTKDebugPlugin.logWarning(
							"error creating variable details", ex);
				} finally {
					currentLevel = detailsLevel.get();
					detailsLevel
							.set(Integer.valueOf(currentLevel.intValue() - 1));
				}
				return sb.toString();
			}
		};
	}
}
