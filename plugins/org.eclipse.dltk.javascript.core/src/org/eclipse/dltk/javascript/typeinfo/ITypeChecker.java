package org.eclipse.dltk.javascript.typeinfo;

import org.eclipse.dltk.annotations.Nullable;
import org.eclipse.dltk.core.ISourceNode;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;
import org.eclipse.dltk.javascript.typeinfo.model.Type;

/**
 * Call back for jsdoc parser to check the types that are declared in the doc.
 * 
 * @author jcompagner
 */
public interface ITypeChecker {

	int LOCAL_TYPES = 1;

	int DEFAULT = LOCAL_TYPES;

	public int getDefaults();

	public void setDefaults(int flags);

	/**
	 * Checks the specified type expression.
	 * 
	 * Delegates to the next function with {@link #DEFAULT} flags.
	 */
	public void checkType(JSType type, ISourceNode node);

	public void checkType(JSType type, ISourceNode node, int flags);

	/**
	 * Checks the specified type.
	 * 
	 * @param type
	 * @param node
	 * @param flags
	 * @param checks
	 *            additional checks or <code>null</code> if not required
	 */
	public void checkType(Type type, ISourceNode node, int flags,
			@Nullable ITypeCheck[] checks);
}
