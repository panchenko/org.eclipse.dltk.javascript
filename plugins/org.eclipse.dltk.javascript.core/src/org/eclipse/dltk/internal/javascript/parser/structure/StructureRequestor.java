package org.eclipse.dltk.internal.javascript.parser.structure;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.Stack;

import org.eclipse.dltk.ast.ASTNode;
import org.eclipse.dltk.compiler.IElementRequestor.FieldInfo;
import org.eclipse.dltk.compiler.IElementRequestor.ImportInfo;
import org.eclipse.dltk.compiler.IElementRequestor.MethodInfo;
import org.eclipse.dltk.compiler.IElementRequestor.TypeInfo;
import org.eclipse.dltk.compiler.ISourceElementRequestor;
import org.eclipse.dltk.javascript.ast.Expression;
import org.eclipse.dltk.javascript.ast.FunctionStatement;
import org.eclipse.dltk.javascript.ast.Identifier;
import org.eclipse.dltk.javascript.structure.IDeclaration;
import org.eclipse.dltk.javascript.structure.IStructureRequestor;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IMethod;
import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IParameter;
import org.eclipse.dltk.javascript.typeinfo.ITypeNames;
import org.eclipse.dltk.javascript.typeinfo.model.ArrayType;
import org.eclipse.dltk.javascript.typeinfo.model.ClassType;
import org.eclipse.dltk.javascript.typeinfo.model.FunctionType;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;
import org.eclipse.dltk.javascript.typeinfo.model.MapType;
import org.eclipse.dltk.javascript.typeinfo.model.SimpleType;
import org.eclipse.dltk.javascript.typeinfo.model.Type;
import org.eclipse.emf.ecore.EObject;

public class StructureRequestor implements IStructureRequestor {

	private static enum ElementType {
		FIELD, FIELD_LOCAL
	}

	private final ISourceElementRequestor requestor;
	private final Stack<ElementType> elementTypes = new Stack<ElementType>();

	public StructureRequestor(ISourceElementRequestor requestor) {
		this.requestor = requestor;
	}

	public void acceptImport(ImportInfo importInfo) {
		requestor.acceptImport(importInfo);
	}

	public void acceptTypeReference(ASTNode node, String typeName) {
		requestor.acceptTypeReference(typeName, node.sourceStart());
	}

	public void acceptLocalReference(Identifier node, IDeclaration target) {
	}

	public void enterLocal(Identifier identifer, JSType type) {
		acceptTypeReference(identifer.start(), type);
	}

	public void exitLocal(int sourceEnd) {
	}

	public void acceptFieldReference(Identifier node) {
		requestor.acceptFieldReference(node.getName(), node.sourceStart());
	}

	public void acceptMethodReference(Identifier node, int argCount) {
		requestor.acceptMethodReference(node.getName(), argCount,
				node.sourceStart(), node.sourceEnd() - 1);
	}

	public void enterNamespace(String[] namespace) {
		requestor.enterModuleRoot();
		requestor.enterNamespace(namespace);
	}

	public void exitNamespace() {
		requestor.exitNamespace();
		requestor.exitModuleRoot();
	}

	public void enterType(TypeInfo typeInfo) {
		requestor.enterType(typeInfo);
	}

	public void exitType(int sourceEnd) {
		requestor.exitType(sourceEnd);
	}

	public void enterMethod(MethodInfo methodInfo, Expression identifier,
			FunctionStatement function, IMethod method) {
		requestor.enterMethod(methodInfo);
		reportTypeRef(method.getType(), methodInfo.declarationStart,
				methodInfo.returnType != null);
		reportTypeRef(method.getThisType(), methodInfo.declarationStart, false);
		for (IParameter parameter : method.getParameters()) {
			reportTypeRef(parameter.getType(), methodInfo.declarationStart,
					methodInfo.parameterTypes != null);
		}
	}

	public void exitMethod(int sourceEnd) {
		requestor.exitMethod(sourceEnd);
	}

	public void exitField(int sourceEnd) {
		if (elementTypes.pop() == ElementType.FIELD) {
			requestor.exitField(sourceEnd);
		}
	}

	public void enterField(FieldInfo fieldInfo, Expression identifer,
			JSType type, boolean local) {
		elementTypes.push(local ? ElementType.FIELD_LOCAL : ElementType.FIELD);
		if (!local) {
			requestor.enterField(fieldInfo);
			reportTypeRef(type, fieldInfo.declarationStart,
					fieldInfo.type != null);
		} else {
			requestor.acceptFieldReference(fieldInfo.name,
					identifer.sourceStart());
		}
	}

	public void acceptTypeReference(int position, JSType type) {
		reportTypeRef(type, position, false);
	}

	private void reportTypeRef(JSType type, int position, boolean skipSimple) {
		if (type == null || skipSimple && type instanceof SimpleType) {
			return;
		}
		for (String typeName : collectContainedTypeNames(type)) {
			requestor.acceptTypeReference(toShortName(typeName), position);
		}
	}

	public static Collection<String> collectContainedTypeNames(JSType type) {
		Set<String> result = null;
		{
			final String typeName = reportSimpleTypeRef(type);
			if (typeName != null) {
				if (result == null) {
					result = new HashSet<String>();
				}
				result.add(typeName);
			}
		}
		for (Iterator<EObject> i = type.eAllContents(); i.hasNext();) {
			final EObject child = i.next();
			if (child instanceof JSType) {
				final String typeName = reportSimpleTypeRef((JSType) child);
				if (typeName != null) {
					if (result == null) {
						result = new HashSet<String>();
					}
					result.add(typeName);
				}
			}
		}
		return result != null ? result : Collections.<String> emptyList();
	}

	private static String reportSimpleTypeRef(JSType type) {
		if (type instanceof MapType) {
			return ITypeNames.OBJECT;
		} else if (type instanceof ArrayType) {
			return ITypeNames.ARRAY;
		} else if (type instanceof FunctionType) {
			return ITypeNames.FUNCTION;
		} else if (type instanceof SimpleType) {
			final Type t = ((SimpleType) type).getTarget();
			return t != null ? t.getName() : null;
		} else if (type instanceof ClassType) {
			final Type t = ((ClassType) type).getTarget();
			return t != null ? t.getName() : null;
		} else {
			return null;
		}
	}

	private static String toShortName(String name) {
		final int slash = name.lastIndexOf('/');
		if (slash >= 0) {
			return name.substring(slash + 1);
		}
		final int dot = name.lastIndexOf('.');
		if (dot >= 0) {
			return name.substring(dot + 1);
		}
		return name;
	}

}
