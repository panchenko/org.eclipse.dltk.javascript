package org.eclipse.dltk.javascript.typeinfo;

import org.eclipse.dltk.core.ISourceNode;
import org.eclipse.dltk.javascript.typeinfo.model.JSType;

/**
 * Call back for jsdoc parser to check the types that are declared in the doc.
 * 
 * @author jcompagner
 */
public interface ITypeChecker {
	public void checkType(JSType type, ISourceNode tag);
}
