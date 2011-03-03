package org.eclipse.dltk.internal.javascript.ti;

public interface ILazyValue {
	void resolve();

	String getLazyName();

	boolean isResolved();

	void setFinalResolve();
}
