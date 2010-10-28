package org.eclipse.dltk.internal.javascript.ti;

import org.eclipse.dltk.javascript.typeinfo.IModelBuilder.IVariable;

public class JSVariable implements IVariable {

	private String name;
	private String type;
	private boolean deprecated;
	private boolean priv;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

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

}
