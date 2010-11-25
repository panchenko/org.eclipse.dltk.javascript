package org.eclipse.dltk.internal.javascript.ti;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import org.eclipse.dltk.javascript.typeinfo.model.Member;
import org.eclipse.dltk.javascript.typeinfo.model.Parameter;
import org.eclipse.dltk.javascript.typeinfo.model.Property;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelFactory;
import org.eclipse.dltk.javascript.typeinfo.model.TypeKind;
import org.eclipse.emf.common.util.EList;

public class PackageOrClassValue extends Value {

	private static final Map<String, Object> types = new ConcurrentHashMap<String, Object>();
	private static final Object NO_CLASS = new Object();

	private final String name;

	public PackageOrClassValue(String name) {
		this.name = name;

		Type type = null;
		Object object = types.get(name);
		if (object == null) {
			try {
				Class<?> clz = Class.forName(name, false, Thread
						.currentThread().getContextClassLoader());
				type = getType(clz, name);
			} catch (ClassNotFoundException e) {
				// ignore
				types.put(name, NO_CLASS);
			}
		} else if (object instanceof Type) {
			type = (Type) object;
		}

		if (type != null) {
			setAttribute(IReferenceAttributes.STATIC, Boolean.TRUE);
			getTypes().add(type);
		}
	}

	@Override
	public IValue getChild(String childName, boolean resolve) {
		IValue child = super.getChild(name, resolve);
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
		return new PackageOrClassValue(name + "." + childName);
	}

	private static Type getType(Class<?> clz, String name) {

		Type type = (Type) types.get(name);
		if (type != null)
			return type;

		type = TypeInfoModelFactory.eINSTANCE.createType();
		type.setName(name);
		type.setKind(TypeKind.JAVA);

//		Type staticType = TypeInfoModelFactory.eINSTANCE.createType();
//		staticType.setName(name);
//		staticType.setKind(TypeKind.JAVA);

		types.put(name, type);
//		types.put(name + "_$static$", staticType);

		Method[] methods = clz.getMethods();
		Field[] fields = clz.getFields();

		EList<Member> members = type.getMembers();
//		EList<Member> staticMembers = staticType.getMembers();

		for (Field field : fields) {
			Property property = TypeInfoModelFactory.eINSTANCE.createProperty();
			property.setName(field.getName());
			Class<?> fieldType = field.getType();
			if (fieldType != null)
				property.setType(getType(fieldType, fieldType.getName()));
			if (Modifier.isStatic(field.getModifiers())) {
				property.setStatic(true);
			} 
			members.add(property);
		}
		for (Method method : methods) {
			org.eclipse.dltk.javascript.typeinfo.model.Method m = TypeInfoModelFactory.eINSTANCE
					.createMethod();
			m.setName(method.getName());
			Class<?> methodType = method.getReturnType();
			if (methodType != null)
				m.setType(getType(methodType, methodType.getName()));

			EList<Parameter> parameters = m.getParameters();
			Class<?>[] parameterTypes = method.getParameterTypes();
			for (int i = 0; i < parameterTypes.length; i++) {
				Parameter parameter = TypeInfoModelFactory.eINSTANCE
						.createParameter();
				parameter.setName(parameterTypes[i].getSimpleName() + " arg"
						+ i);
				parameter.setType(getType(parameterTypes[i],
						parameterTypes[i].getName()));
				parameters.add(parameter);
			}
			if (Modifier.isStatic(method.getModifiers())) {
				m.setStatic(true);
			} 
				members.add(m);
		}
		return type;
	}

}
