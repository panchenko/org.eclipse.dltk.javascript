package org.eclipse.dltk.javascript.core.tests.contentassist;

import java.util.LinkedList;

import org.eclipse.dltk.codeassist.ICompletionEngine;
import org.eclipse.dltk.core.CompletionProposal;

public class CodeCompletion extends AbstractCompletionTest {

	/**
	 * dumb completion on keyword
	 */
	public void test0() {
		LinkedList<CompletionProposal> results = new LinkedList<CompletionProposal>();
		ICompletionEngine c = createEngine(results, false);
		c.complete(new TestModule(""), 0, 0);
		assertEquals(0, results.size());
	}

	/**
	 * dumb completion on function
	 */
	public void test1() {
		LinkedList<CompletionProposal> results = new LinkedList<CompletionProposal>();
		ICompletionEngine c = createEngine(results, false);
		c.complete(new TestModule(this.getClass().getResource("test1.js")), 0,
				0);
		assertEquals(0, results.size());
	}

	/**
	 * dumb completion on function
	 */
	public void test2() {
		String[] names = new String[] { "firstVar", "secondVar" };
		String module = "test2.js";
		int position = lastPositionInFile("\n", module);
		basicTest(module, position, names);
		// basicTest("test2.js", 36, names);
	}

	/**
	 * dumb completion on function
	 */
	public void test3() {
		String[] names = concat(getMethodsOfObject(), "world");
		String module = "test3.js";
		int position = lastPositionInFile("firstVar.", module);
		basicTest(module, position, names);
		// basicTest(module, 63, names);
	}

	// 104 ,temperature
	/**
	 * dumb completion on function
	 */
	public void test4() {
		String[] names = concat(getMethodsOfString(), "temperature");
		String module = "test4.js";
		int position = lastPositionInFile("firstVar.world.", module);
		basicTest(module, position, names);
		// basicTest("test4.js", 100, names);
	}

	public void test5() {
		String[] names = concat(getMethodsOfString(), "world");
		String[] names1 = concat(getMethodsOfString(), "temperature");
		String module = "test5.js";
		int positionFirst = lastPositionInFile("secondVar.", module);
		basicTest(module, positionFirst, names);
		int positionSecond = lastPositionInFile("world.", module);
		basicTest(module, positionSecond, names1);
		// basicTest(module, 120, names);
		// basicTest(module, 126, names1);
	}

	public void test6() {
		String[] names = concat(getMethodsOfString(), "world");
		// String[] names1=new String[]{"temperature"};
		String module = "test6.js";
		int position = lastPositionInFile("world.", module);
		basicTest(module, position, names);
		// basicTest(module, 158, names);
		// basicTest(module, 126, names1);
	}

	public void test7() {
		String[] names = concat(getMethodsOfString(), "world");
		// String[] names1=new String[]{"temperature"};
		String module = "test7.js";
		int position = lastPositionInFile("world.", module);
		basicTest(module, position, names);
		// basicTest(module, 157, names);
		// basicTest(module, 126, names1);
	}

	public void test8() {
		String[] names = concat(getMethodsOfString(), "mission", "target");
		// String[] names1=new String[]{"temperature"};
		String module = "test8.js";
		int position = lastPositionInFile("firstVar.", module);
		basicTest(module, position, names);
		// basicTest(module, 124, names);
		// basicTest(module, 126, names1);
	}

	public void test9() {
		String[] names = concat(getMethodsOfString());
		// String[] names1=new String[]{"temperature"};
		String module = "test9.js";
		int position = lastPositionInFile("firstVar.", module);
		basicTest(module, position, names);
		// basicTest(module, 138, names);
		// basicTest(module, 126, names1);
	}

	public void test10() {
		String[] names = concat(getMethodsOfString(), "mission", "target");
		// String[] names1=new String[]{"temperature"};
		String module = "test10.js";
		// basicTest(module, 139, names);
		int position = lastPositionInFile("secondVar.", module);
		basicTest(module, position, names);
	}

	public void test11() {
		String[] names = new String[] { "firstVar", "secondVar" };
		String module = "test11.js";
		int position = lastPositionInFile("{", module);
		basicTest(module, position, names);
		// basicTest(module, 56, names);
	}

	public void test12() {
		String[] names = new String[] { "p0", "p1" };
		String module = "test12.js";
		// basicTest(module, 62, names);
		int position = lastPositionInFile("p", module);
		basicTest(module, position, names);
	}

	public void test13() {
		String[] names = concat(getMethodsOfString(), "element");
		String module = "test13.js";
		int position = lastPositionInFile("firstVar.", module);
		basicTest(module, position, names);
	}

	public void test14() {
		String[] names = concat(getMethodsOfString(), "element");
		String module = "test14.js";
		int position = lastPositionInFile("firstVar.", module);
		basicTest(module, position, names);
		// basicTest(module, 88, names);
	}

	public void test15() {
		String[] names = concat(getMethodsOfNumber());
		String module = "test15.js";
		int position = lastPositionInFile("firstVar.", module);
		basicTest(module, position, names);
		// basicTest(module, 104, names);
	}

	public void test16() {
		String[] names = new String[] { "xaml" };
		String module = "test16.js";
		int position = lastPositionInFile("x", module);
		basicTest(module, position, names);
		// basicTest(module, 86, names);
	}

	public void test17() {
		String[] names = new String[] {};
		String module = "test17.js";
		int position = lastPositionInFile("x", module);
		basicTest(module, position, names);
		// basicTest(module, 87, names);
	}

	public void test18() {
		String[] names = new String[] { "my" };
		String module = "test18.js";
		int position = lastPositionInFile("hello.", module);
		basicTest(module, position, names);
		// basicTest(module, 120, names);
	}

	public void test19() {
		String[] names = concat(getMethodsOfNumber());
		String module = "test19.js";
		int position = lastPositionInFile("hello.", module);
		basicTest(module, position, names);
		// basicTest(module, 119, names);
	}

	public void test20() {
		String[] names = concat(getMethodsOfNumber(), "my");
		String module = "test20.js";
		int position = lastPositionInFile("hello.", module);
		basicTest(module, position, names);
		// basicTest(module, 123, names);
	}

	public void test21() {
		String[] names = concat(getMethodsOfNumber(), "favorite");
		String module = "test21.js";
		int position = lastPositionInFile("hello.my.", module);
		basicTest(module, position, names);
		// basicTest(module, 151, names);
	}

	public void test22() {
		String[] names = concat(getMethodsOfNumber());
		String module = "test22.js";
		int position = lastPositionInFile("hello.", module);
		basicTest(module, position, names);
		// basicTest(module, 147, names);
	}

	public void test23() {
		String[] names = new String[] { "my", "olive" };
		String module = "test23.js";
		int position = lastPositionInFile("hello.", module);
		basicTest(module, position, names);
		// basicTest(module, 160, names);
	}

	public void test24() {
		String[] names = concat(getMethodsOfNumber(), "age", "wine");
		String module = "test24.js";
		int position = lastPositionInFile("hello.olive.", module);
		basicTest(module, position, names);
		// basicTest(module, 215, names);
	}

	public void test25() {
		String[] names = concat(getMethodsOfNumber(), "age", "my", "olive",
				"wine");

		String module = "test25.js";
		int position = lastPositionInFile("hello.olive.", module);
		basicTest(module, position, names);
		// basicTest(module, 219, names);
	}

	public void test26() {
		String[] names = concat(getMethodsOfNumber(), "wine");

		String module = "test26.js";
		int position = lastPositionInFile("hello.olive.", module);
		basicTest(module, position, names);
		// basicTest(module, 256, names);
	}

	public void test27() {
		String[] names = new String[] { "olive" };
		String module = "test27.js";
		int position = lastPositionInFile("hello.o", module);
		basicTest(module, position, names);
		// basicTest(module, 131, names);
	}

	public void test28() {
		String[] names = concat(getMethodsOfNumber());
		String module = "test28.js";
		int position = lastPositionInFile("hello.", module);
		basicTest(module, position, names);
		// basicTest(module, 118, names);
	}

	public void test29() {
		String[] names = new String[] { "x" };
		String module = "test29.js";
		int position = lastPositionInFile("{", module);
		basicTest(module, position, names);
		// basicTest(module, 46, names);
	}

	public void test30() {
		String[] names = concat(getMethodsOfNumber(), "xsd");
		String module = "test30.js";
		int position = lastPositionInFile("sz.", module);
		basicTest(module, position, names);
		// basicTest(module, 79, names);
	}

	public void test31() {
		String[] names = concat(getMethodsOfString(), "x");
		String module = "test31.js";
		int position = lastPositionInFile("node.", module);
		basicTest(module, position, names);
		// basicTest(module, 107, names);
	}

	public void test32() {
		String[] names = concat(getMethodsOfString(), "x");
		String module = "test32.js";
		int position = lastPositionInFile("node.", module);
		basicTest(module, position, names);
		// basicTest(module, 110, names);
	}

	public void test33() {
		String[] names = new String[] { "object", "objectVariable" };
		String module = "test33.js";
		int position = lastPositionInFile("{", module);
		basicTest(module, position, names);
		// basicTest(module, 65, names);
	}

	public void test34() {
		String[] names = new String[] { "x2" };
		String module = "test34.js";
		int position = lastPositionInFile("object.", module);
		basicTest(module, position, names);
		// basicTest(module, 93, names);
	}

	public void test35() {
		String[] names = concat(getMethodsOfNumber(), "x");
		String module = "test35.js";
		int position = lastPositionInFile("c.", module);
		basicTest(module, position, names);
		// basicTest(module, 82, names);
	}

	public void test36() {
		String[] names = new String[] { "c", "object", "e" };
		String module = "test36.js";
		int position = lastPositionInFile("{", module);
		basicTest(module, position, names);
		// basicTest(module, 76, names);
	}

	public void test37() {
		String[] names = new String[] { "forward", "hello", "object" };
		String module = "test37.js";
		int position = lastPositionInFile("{", module);
		basicTest(module, position, names);
		// basicTest(module, 85, names);
	}

	public void test38() {
		String[] names = new String[] { "object" };
		String module = "test38.js";
		int position = lastPositionInFile("o", module);
		basicTest(module, position, names);
		// basicTest(module, 102, names);
	}

	public void test39() {
		String[] names = concat(getMethodsOfNumber(), "er");
		String module = "test39.js";
		int position = lastPositionInFile("eer.", module);
		basicTest(module, position, names);
		// basicTest(module, 125, names);
	}

	public void test40() {
		String[] names = new String[] { "s" };
		String module = "test40.js";
		int position = lastPositionInFile("v.", module);
		basicTest(module, position, names);
		// basicTest(module, 65, names);
	}

	public void test41() {
		String[] names = new String[] { "hello" };
		String module = "test41.js";
		int position = lastPositionInFile("er[0].", module);
		basicTest(module, position, names);
		// basicTest(module, 96, names);
	}

	public void test42() {
		String[] names = new String[] { "Hello", "Mama" };
		String module = "test42.js";
		int position = lastPositionInFile("object.", module);
		basicTest(module, position, names);
		// basicTest(module, 76, names);
	}

	public void test43() {
		String[] names = new String[] {};
		String module = "test43.js";
		int position = lastPositionInFile(";", module);
		basicTest(module, position, names);
		// basicTest(module, 45, names);
	}

	public void test44() {
		String[] names = new String[] { "main" };
		String module = "test44.js";
		int position = lastPositionInFile("object.", module);
		basicTest(module, position, names);
		// basicTest(module, 95, names);
	}

	public void test45() {
		String[] names = new String[] { "word", "other_word" };
		String module = "test45.js";
		int position = lastPositionInFile("x.hello.", module);
		basicTest(module, position, names);
		// basicTest(module, 139, names);
	}

	public void test46() {
		String[] names = new String[] { "aaa", "baa", "my", "prototype" };
		String module = "test46.js";
		int position = lastPositionInFile("x.", module);
		basicTest(module, position, names);
		// basicTest(module, 102, names);
	}

	public void test47() {
		String[] names = new String[] { "x", "y" };
		String module = "test47.js";
		int position = lastPositionInFile("this.", module);
		basicTest(module, position, names);
		// basicTest(module, 54, names);
	}

	public void test48() {
		String[] names = new String[] { "erer" };
		String module = "test48.js";
		int position = lastPositionInFile("this.", module);
		basicTest(module, position, names);
		// basicTest(module, 105, names);
	}

	public void testObjectFunctionReturnValue() {
		String[] names = new String[] { "a", "b" };
		String module = "test-return-value.js";
		int position = lastPositionInFile("execute().", module);
		basicTest(module, position, names);
	}

	public void testFunctionRefs() {
		String[] names = new String[] { "test1", "test2", "test3" };
		String module = "test-function-refs.js";
		int position = lastPositionInFile("a = test", module);
		basicTest(module, position, names);
	}

}
