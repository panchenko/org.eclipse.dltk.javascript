/**
 * 
 */
package org.eclipse.dltk.rhino.dbgp;

import java.util.HashMap;
import java.util.HashSet;

import org.mozilla.javascript.Function;
import org.mozilla.javascript.Scriptable;
import org.mozilla.javascript.xml.XMLObject;

final class ContextGetCommand extends DBGPDebugger.Command {

	private static final int LOCAL_CONTEXT_ID = 0;
	private static final int GLOBAL_CONTEXT_ID = 1;
	private static final int CLASS_CONTEXT_ID = 2;
	/**
	 * 
	 */
	private final DBGPDebugger debugger;

	/**
	 * @param debugger
	 */
	ContextGetCommand(DBGPDebugger debugger) {
		this.debugger = debugger;
	}

	void parseAndExecute(String command, HashMap options) {
		StringBuffer properties = new StringBuffer();
		try {
			int level = Integer.parseInt((String) options.get("-d"));
			int context = -1;
			String contextString = (String) options.get("-c");
			if (contextString != null) {
				context = Integer.parseInt((String) options.get("-c"));
			}
			DBGPDebugFrame stackFrame = this.debugger.stackmanager
					.getStackFrame(level);
			Scriptable this1 = stackFrame.getThis();
			if (this1 != null && (context == LOCAL_CONTEXT_ID || context == -1)) {
				this.debugger.printProperty("this", "this", this1, properties,
						0, false);
			}

			Scriptable scriptable = stackFrame.getThis();
			HashSet doubles = new HashSet();
			if (context == GLOBAL_CONTEXT_ID || context == -1) {
				sendAllIds(properties, stackFrame, scriptable.getParentScope(),
						doubles, true);
			}
			if (context == LOCAL_CONTEXT_ID || context == -1) {
				String[] propertyIds = stackFrame.getParametersAndVars();
				for (int a = 0; a < propertyIds.length; a++) {
					String id = propertyIds[a].toString();
					Object value = stackFrame.getValue(a);
					if (!(value instanceof Function)
							|| (value instanceof XMLObject)) // HACK because
					// ShowFunctionsAction
					// doesnt work
					// because of
					// the lazy
					// behavior of
					// plugins in
					// Eclipse
					{
						this.debugger.printProperty(id, id, value, properties,
								0, true);
					}

				}
				sendAllIds(properties, stackFrame, scriptable, doubles, false);
			}
		} catch (Throwable t) {
			// never let the debugger crash. the printResponse below has to go
			// on.
			t.printStackTrace();
		}
		this.debugger.printResponse("<response command=\"context_get\"\r\n"
				+ "status=\"starting\"" + " reason=\"ok\""
				+ " transaction_id=\"" + options.get("-i") + "\">\r\n"
				+ properties + "</response>\r\n" + "");
	}

	/**
	 * @param properties
	 * @param stackFrame
	 * @param scriptable
	 */
	private void sendAllIds(StringBuffer properties, DBGPDebugFrame stackFrame,
			Scriptable scriptable, HashSet doubles, boolean walkParents) {
		if (scriptable != null) {
			Object[] ids = null;
			if (scriptable instanceof LazyInitScope) {
				ids = ((LazyInitScope) scriptable).getInitializedIds();
			} else {
				ids = scriptable.getIds();
			}
			for (int i = 0; i < ids.length; i++) {
				Object id = ids[i];
				if (!doubles.contains(id)) {
					doubles.add(id);
					Object value = null;
					if (id instanceof Number) {
						value = scriptable.get(((Number) id).intValue(),
								scriptable);
					} else {
						value = scriptable.get(id.toString(), scriptable);
					}
					if (!(value instanceof Function)) // HACK because
					// ShowFunctionsAction
					// doesnt work because
					// of the lazy behavior
					// of plugins in Eclipse
					{
						this.debugger.printProperty(id.toString(), id
								.toString(), value, properties, 0, true);
					}
				}
			}
			sendAllIds(properties, stackFrame, scriptable.getPrototype(),
					doubles, walkParents);
			if (walkParents)
				sendAllIds(properties, stackFrame, scriptable.getParentScope(),
						doubles, walkParents);
		}
	}
}