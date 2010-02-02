/**
 * 
 */
package org.eclipse.dlkt.javascript.dom.support;

import java.net.URL;

import org.eclipse.core.resources.IFile;

/**
 * This class is a proposal holder around a function object. So that you can
 * give it a help text and parameter names.
 * 
 * If wrapped in such an object then it is assumed that the object is a function
 * object.
 * 
 * @author jcompagner
 * 
 */
public interface IProposalHolder {
	public String[] getParameterNames();

	public String getProposalInfo();

	public Object getObject();

	public URL getImageURL();

	public boolean isFunctionRef();

	public IFile getSourceFile();

	public String getReturnType();
}
