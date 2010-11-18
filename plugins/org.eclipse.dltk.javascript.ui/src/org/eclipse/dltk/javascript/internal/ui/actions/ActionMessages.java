package org.eclipse.dltk.javascript.internal.ui.actions;

import org.eclipse.osgi.util.NLS;

public final class ActionMessages extends NLS {

	private static final String BUNDLE_NAME = "org.eclipse.jdt.internal.ui.actions.ActionMessages";//$NON-NLS-1$

	private ActionMessages() {
		// Do not instantiate
	}

	public static String ModifyParameterAction_problem_title;
	public static String ModifyParameterAction_problem_message;
	static {
		NLS.initializeMessages(BUNDLE_NAME, ActionMessages.class);
	}
}
