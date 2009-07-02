/**
 * 
 */
package org.eclipse.dltk.internal.javascript.typeinference;

import java.util.Date;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;

import com.xored.org.mozilla.javascript.JavaMembers;
import com.xored.org.mozilla.javascript.NativeJavaMethod;

/**
 * @author jcompagner
 * 
 */
public class NativeObjectReference extends StandardSelfCompletingReference {

	public static HashMap TYPES = new HashMap() {
		private static final long serialVersionUID = 1L;

		public Object get(Object name) {
			Object o = super.get(name);
			if (o == null) {
				String str = (String) name;
				int i = str.lastIndexOf("."); //$NON-NLS-1$
				if (i >= 0) {
					str = str.substring(i + 1);
				}
				o = str;
			}
			return o;
		}
	};
	static {
		TYPES.put("double", "number"); //$NON-NLS-1$ //$NON-NLS-2$
		TYPES.put("float", "number"); //$NON-NLS-1$ //$NON-NLS-2$
		TYPES.put("int", "number"); //$NON-NLS-1$ //$NON-NLS-2$
		TYPES.put("long", "number"); //$NON-NLS-1$ //$NON-NLS-2$
	}
	private final Class clz;

	/**
	 * @param paramOrVarName
	 * @param childIsh
	 */
	public NativeObjectReference(String paramOrVarName, Class clz) {
		super(paramOrVarName, false);
		this.clz = clz;
	}

	/**
	 * @see org.eclipse.dltk.internal.javascript.typeinference.StandardSelfCompletingReference#createChilds()
	 */
	protected void createChilds() {
		try {
			JavaMembers javaMembers = new JavaMembers(null, clz);
			Hashtable fieldAndMethods = javaMembers.getFieldAndMethods(false);
			Hashtable members = javaMembers.getMembers(false);
			if (fieldAndMethods != null) {
				// todo
			}
			if (members != null) {
				Iterator iterator = members.entrySet().iterator();
				while (iterator.hasNext()) {
					StandardSelfCompletingReference uref = null;
					Map.Entry entry = (Entry) iterator.next();
					String key = (String) entry.getKey();
					if (entry.getValue() instanceof NativeJavaMethod) {
						com.xored.org.mozilla.javascript.MemberBox[] methods = ((NativeJavaMethod) entry
								.getValue()).getMethods();
						for (int i = 0; i < methods.length; i++) {
							if (methods[i].getReturnType() != null) {
								Class clss = methods[i].getReturnType();
								if (clss == String.class) {
									uref = ReferenceFactory
											.createStringReference(key);
								} else if (clss == Boolean.class
										|| clss == boolean.class) {
									uref = ReferenceFactory
											.createBooleanReference(key);
								} else if (Date.class.isAssignableFrom(clss)) {
									uref = ReferenceFactory
											.createDateReference(key);
									// booleans are just above.
								} else if (Number.class.isAssignableFrom(clss)
										|| clss.isPrimitive()) {
									uref = ReferenceFactory
											.createNumberReference(key);
								} else if ((clss).isArray()) {
									uref = ReferenceFactory
											.createArrayReference(key);
								}
							}
							if (uref == null) {
								uref = new StandardSelfCompletingReference(key, false);
							}

							Class[] argTypes = methods[i].getArgTypes();
							if (argTypes != null) {
								char[][] names = new char[argTypes.length][];
								for (int j = 0; j < argTypes.length; j++) {
									if (argTypes[j].isArray()) {
										String name = (String) TYPES
												.get(argTypes[j]
														.getComponentType()
														.getName())
												+ "[]";
										names[j] = name.toCharArray();
									} else {
										String name = (String) TYPES
												.get(argTypes[j].getName());
										names[j] = name.toCharArray();
									}
								}
								uref.setParameterNames(names);

							}
							uref.setFunctionRef();
							// todo this stores key under map but there can be
							// multiply methods...
							setChild(key, uref);
						}
					} else {
						setChild(key, new StandardSelfCompletingReference(key, false));
					}

				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
