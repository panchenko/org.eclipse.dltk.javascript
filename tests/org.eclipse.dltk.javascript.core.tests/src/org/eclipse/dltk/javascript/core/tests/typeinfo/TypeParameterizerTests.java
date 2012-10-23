package org.eclipse.dltk.javascript.core.tests.typeinfo;

import static java.util.Collections.singletonList;
import static org.eclipse.dltk.javascript.typeinfo.RTypes.simple;
import static org.eclipse.dltk.javascript.typeinfo.model.TypeInfoModelFactory.eINSTANCE;

import java.util.Collections;

import junit.framework.TestCase;

import org.eclipse.dltk.internal.javascript.ti.TypeSystemImpl;
import org.eclipse.dltk.javascript.core.Types;
import org.eclipse.dltk.javascript.typeinfo.IRMethod;
import org.eclipse.dltk.javascript.typeinfo.IRSimpleType;
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
			assertEquals(RTypes.simple(typeSystem, Types.NUMBER),
					push.getType());
			assertEquals(1, push.getParameterCount());
			assertTrue(push.getParameters().get(0).getType() instanceof RTypeVariable);
		}
	}

	public void testParameterize() {
		final IRTypeDeclaration declaration = typeSystem.parameterize(
				Types.ARRAY, Collections.singletonList(RTypes.simple(
						typeSystem, Types.STRING)));
		{
			final IRMethod pop = declaration.findMethod("pop", false);
			assertNotNull(pop);
			assertSame(Types.STRING, ((IRSimpleType) pop.getType()).getTarget());
		}
		{
			final IRMethod push = declaration.findMethod("push", false);
			assertNotNull(push);
			assertEquals(RTypes.simple(typeSystem, Types.NUMBER),
					push.getType());
			assertEquals(1, push.getParameterCount());
			assertEquals(RTypes.simple(typeSystem, Types.STRING), push
					.getParameters().get(0).getType());
		}
		{
			final IRMethod filter = declaration.findMethod("filter", false);
			assertNotNull(filter);
			assertEquals(RTypes.arrayOf(RTypes.STRING), filter.getType());
			assertEquals(1, filter.getParameterCount());
			assertEquals(RTypes.FUNCTION, filter.getParameters().get(0)
					.getType());
		}
	}

	public void testParameterizedEquals() {
		final IRTypeDeclaration arrayOfString = typeSystem.parameterize(
				Types.ARRAY, singletonList(simple(typeSystem, Types.STRING)));
		final IRTypeDeclaration arrayOfNumber = typeSystem.parameterize(
				Types.ARRAY, singletonList(simple(typeSystem, Types.NUMBER)));
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
}
