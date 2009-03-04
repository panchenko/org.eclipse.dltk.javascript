/**
 * 
 */
package org.eclipse.dltk.javascript.typeinference;

import org.eclipse.dltk.internal.javascript.reference.resolvers.ReferenceResolverContext;
import org.eclipse.dltk.internal.javascript.typeinference.IReference;

/**
 * This is an Extension point that is called by the ReferenceFactory to get a
 * custom JavaScript type based on the type string.
 * 
 * This is used for function parameter names that have JSDoc supplied with a
 * param tag. Including the type.
 * 
 * @author jcompagner
 * 
 */
public interface ITypeProvider {

	public IReference createTypeReference(String paramOrVarName, String type,
			ReferenceResolverContext rrc);
}
