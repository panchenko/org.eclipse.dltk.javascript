package org.eclipse.dltk.internal.javascript.ti;

import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IVariable;

public class JSVariable extends JSElement implements IVariable {

	private boolean deprecated;
	private boolean priv;
	private boolean prot;

	public void setDeprecated(boolean deprecated) {
		this.deprecated = deprecated;

	}

	public boolean isDeprecated() {
		return deprecated;
	}

	public void setPrivate(boolean priv) {
		this.priv = priv;

	}

	public boolean isPrivate() {
		return priv;
	}

	public void setProtected(boolean prot) {
		this.prot = prot;

	}

	public boolean isProtected() {
		return prot;
	}

}
