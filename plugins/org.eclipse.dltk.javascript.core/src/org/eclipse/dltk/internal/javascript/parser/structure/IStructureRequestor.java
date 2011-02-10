package org.eclipse.dltk.internal.javascript.parser.structure;

import org.eclipse.dltk.compiler.IElementRequestor.FieldInfo;
import org.eclipse.dltk.compiler.IElementRequestor.MethodInfo;
import org.eclipse.dltk.compiler.IElementRequestor.TypeInfo;
import org.eclipse.dltk.core.ISourceModule;
import org.eclipse.dltk.javascript.ast.Argument;
import org.eclipse.dltk.javascript.ast.Expression;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.typeinference.IValueReference;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IMethod;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;

public interface IStructureRequestor {

	void acceptFieldReference(Identifier node, IValueReference reference);

	void acceptMethodReference(Identifier node, int argCount,
			IValueReference reference);

	void enterNamespace(String[] namespace);

	void exitNamespace();

	void enterType(TypeInfo typeInfo);

	void exitType(int sourceEnd);

	void enterMethod(MethodInfo methodInfo, Expression identifier,
			IMethod method);

	void exitMethod(int sourceEnd);

	void exitField(int sourceEnd);

	void enterField(FieldInfo fieldInfo, Expression identifier, JSType type);

	boolean enterFieldCheckDuplicates(FieldInfo fieldInfo,
			Expression identifier, JSType type);

	void acceptLocalReference(Identifier node, IValueReference reference);

	public void enterLocal(Identifier identifier, ISourceModule module,
			JSType type);

	void exitLocal(int sourceEnd);

	void acceptArgumentDeclaration(Argument argument,
			ISourceModule sourceModule, JSType type);

}
