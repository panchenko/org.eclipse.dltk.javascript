/**
 * 
 */
package org.eclipse.dltk.javascript.ui.scriptcolor.provider;

import org.eclipse.jface.text.rules.IRule;
import org.eclipse.jface.text.rules.IToken;

/**
 * @author jcompagner
 * 
 */
public interface IScriptColorProvider {

	/**
	 * Get all the keywords this provider will generate tokens for.
	 * 
	 * @return String[] of keywords
	 */
	public String[] getKeywords();

	/**
	 * Get the {@link IToken} for the specific keyword.
	 * 
	 * @param keyword
	 * @return The token for the given keyword.
	 */
	public IToken getToken(String keyword);

	/**
	 * Get the rules that this provider wants to contribute to the code scanner.
	 * 
	 * @return IRule array
	 */
	public IRule[] getRules();
}
