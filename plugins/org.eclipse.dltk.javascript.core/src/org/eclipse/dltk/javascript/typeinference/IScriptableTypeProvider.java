/**
 * 
 */
package org.eclipse.dltk.javascript.typeinference;

import org.mozilla.javascript.Scriptable;

/**
 * This is an Extension point that is called by the ReferenceFactory to get a
 * custom JavaScript type based on the type string.
 * 
 * This is used for function parameter names that have JSDoc supplied with a
 * param tag. That also have the type included like
 * 
 * <pre>
 * &#064;param {MyCustomType} paramName My parameter
 * </pre>
 * 
 * @author jcompagner
 * 
 */
public interface IScriptableTypeProvider {

	public Scriptable getType(String paramOrVarName, String type);
}
