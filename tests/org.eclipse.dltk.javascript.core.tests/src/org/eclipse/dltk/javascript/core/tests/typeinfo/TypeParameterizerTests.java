package org.eclipse.dltk.javascript.core.tests.typeinfo;

import static java.util.Collections.singletonList;
import static org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelFactory.eINSTANCE;

import java.lang.reflect.Field;
import java.util.Collections;

import junit.framework.TestCase;

import org.eclipse.dltk.internal.javascript.ti.TypeSystemImpl;
import org.eclipse.dltk.javascript.core.Types;
import org.eclipse.dltk.javascript.typeinfo.IRMethod;
import org.eclipse.dltk.javascript.typeinfo.IRProperty;
import org.eclipse.dltk.javascript.typeinfo.IRTypeDeclaration;
import org.eclipse.dltk.javascript.typeinfo.ITypeSystem;
import org.eclipse.dltk.javascript.typeinfo.RTypeMemberQuery;
import org.eclipse.dltk.javascript.typeinfo.RTypeVariable;
import org.eclipse.dltk.javascript.typeinfo.RTypes;
import org.eclipse.dltk.javascript.typeinfo.TypeUtil;
import org.eclipse.dltk.javascript.typeinfo.model.GenericType;
import org.eclipse.dltk.javascript.typeinfo.model.Method;
import org.eclipse.dltk.javascript.typeinfo.model.Parameter;
import org.eclipse.dltk.javascript.typeinfo.model.ParameterizedType;
import org.eclipse.dltk.javascript.typeinfo.model.Property;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.dltk.javascript.typeinfo.model.TypeVariable;

@SuppressWarnings("restriction")
public class TypeParameterizerTests extends TestCase {

	private ITypeSystem typeSystem;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		this.typeSystem = new TypeSystemImpl();
	}

	public void testGenericConvert() {
		final IRTypeDeclaration declaration = typeSystem.convert(Types.ARRAY);
		final RTypeMemberQuery memberQuery = new RTypeMemberQuery(declaration);
		{
			final IRMethod pop = (IRMethod) memberQuery.findMember("pop");
			assertNotNull(pop);
			assertTrue(pop.getType() instanceof RTypeVariable);
		}
		{
			final IRMethod push = (IRMethod) memberQuery.findMember("push");
			assertNotNull(push);
			assertEquals(RTypes.NUMBER, push.getType());
			assertEquals(1, push.getParameterCount());
			assertTrue(push.getParameters().get(0).getType() instanceof RTypeVariable);
		}
	}

	public void testParameterize() {
		final IRTypeDeclaration declaration = typeSystem.parameterize(
				Types.ARRAY, Collections.singletonList(RTypes.STRING));
		{
			final IRMethod pop = declaration.findMethod("pop", false);
			assertNotNull(pop);
			assertEquals(RTypes.STRING, pop.getType());
		}
		{
			final IRMethod push = declaration.findMethod("push", false);
			assertNotNull(push);
			assertEquals(RTypes.simple(typeSystem, Types.NUMBER),
					push.getType());
			assertEquals(1, push.getParameterCount());
			assertEquals(RTypes.STRING, push.getParameters().get(0).getType());
		}
		{
			final IRMethod filter = declaration.findMethod("filter", false);
			assertNotNull(filter);
			assertEquals(RTypes.arrayOf(typeSystem, RTypes.STRING),
					filter.getType());
			assertEquals(1, filter.getParameterCount());
			assertEquals(RTypes.FUNCTION, filter.getParameters().get(0)
					.getType());
		}
	}

	public void testParameterizedEquals() {
		final IRTypeDeclaration arrayOfString = typeSystem.parameterize(
				Types.ARRAY, singletonList(RTypes.STRING));
		final IRTypeDeclaration arrayOfNumber = typeSystem.parameterize(
				Types.ARRAY, singletonList(RTypes.NUMBER));
		assertFalse(arrayOfString.equals(arrayOfNumber));
		assertFalse(arrayOfNumber.equals(arrayOfString));
	}

	public void testSimpleTypeEquals() {
		final GenericType listType = eINSTANCE.createGenericType();
		listType.setName("List");
		final TypeVariable variable = eINSTANCE.createTypeVariable();
		variable.setName("T");
		listType.getTypeParameters().add(variable);

		final IRTypeDeclaration numberList = typeSystem.parameterize(listType,
				Collections.singletonList(RTypes.NUMBER));
		final IRTypeDeclaration stringList = typeSystem.parameterize(listType,
				Collections.singletonList(RTypes.STRING));

		assertFalse((RTypes.simple(numberList)).equals(RTypes
				.simple(stringList)));
		assertFalse((RTypes.classType(numberList)).equals(RTypes
				.classType(stringList)));
	}

	public void testParameterizeGenericSuperType() {
		final GenericType collection = eINSTANCE.createGenericType();
		collection.setName("Collection");
		final TypeVariable variable = eINSTANCE.createTypeVariable();
		variable.setName("T");
		collection.getTypeParameters().add(variable);
		final Method getItem = eINSTANCE.createMethod();
		getItem.setName("getItem");
		{
			final Parameter parameter = eINSTANCE.createParameter();
			parameter.setName("index");
			parameter.setType(TypeUtil.ref(Types.NUMBER));
			getItem.getParameters().add(parameter);
		}
		getItem.setType(TypeUtil.reference(variable));
		collection.getMembers().add(getItem);

		final Type stringList = eINSTANCE.createType();
		stringList.setName("StringList");
		{
			final ParameterizedType superType = eINSTANCE
					.createParameterizedType();
			superType.setTarget(collection);
			superType.getActualTypeArguments().add(TypeUtil.ref(Types.STRING));
			stringList.setSuperTypeExpr(superType);
		}

		final IRTypeDeclaration stringListDeclaration = typeSystem
				.convert(stringList);

		final IRTypeDeclaration collectionDeclaration = stringListDeclaration
				.getSuperType();

		assertTrue(collectionDeclaration.isParameterized());
		assertEquals(1, collectionDeclaration.getActualTypeArguments().size());
		assertEquals(RTypes.STRING, collectionDeclaration
				.getActualTypeArguments().get(0));
	}

	public void testLazyPropertyType() throws Exception {
		final GenericType holder = eINSTANCE.createGenericType();
		holder.setName("Holder");
		final TypeVariable variable = eINSTANCE.createTypeVariable();
		variable.setName("T");
		holder.getTypeParameters().add(variable);
		final Property value = eINSTANCE.createProperty();
		value.setName("value");
		value.setType(TypeUtil.reference(variable));
		holder.getMembers().add(value);

		final IRTypeDeclaration declaration = typeSystem.parameterize(holder,
				Collections.singletonList(RTypes.STRING));

		final RTypeMemberQuery memberQuery = new RTypeMemberQuery(declaration);
		final IRProperty prop = (IRProperty) memberQuery.findMember("value");
		assertNotNull(prop);

		final Field initialized = getField(prop.getClass(), "initialized");
		initialized.setAccessible(true);

		assertFalse((Boolean) initialized.get(prop));

		assertEquals(RTypes.STRING, prop.getType());

		assertTrue((Boolean) initialized.get(prop));
	}

	private static Field getField(Class<?> clazz, String fieldName)
			throws NoSuchFieldException {
		for (;;) {
			try {
				return clazz.getDeclaredField(fieldName);
			} catch (NoSuchFieldException e) {
				clazz = clazz.getSuperclass();
				if (clazz == null) {
					throw e;
				}
			}
		}
	}

	public void testX() throws Exception {
		final Type amount = eINSTANCE.createType();
		amount.setName("Amount");

		final ITypeSystem globalTS = RTypes.OBJECT.getDeclaration()
				.getTypeSystem();
		final IRTypeDeclaration declaration = globalTS.parameterize(
				Types.ARRAY,
				Collections.singletonList(RTypes.simple(typeSystem, amount)));

		// System.out.println(declaration.getTypeSystem().getPrimary());
	}
}
