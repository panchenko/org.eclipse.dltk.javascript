/**
 * 
 */
package org.eclipse.dltk.rhino.dbgp;

import java.util.HashMap;

final class PropertyGetCommand extends DBGPDebugger.Command {
	/**
	 * 
	 */
	private final DBGPDebugger debugger;

	/**
	 * @param debugger
	 */
	PropertyGetCommand(DBGPDebugger debugger) {
		this.debugger = debugger;
	}

	void parseAndExecute(String command, HashMap options) {
		String longName = (String) options.get("-n");
		int level = 0;
		String depth = (String) options.get("-d");
		if (depth != null) {
			level = Integer.parseInt(depth);
		}
		Object value = null;
		int shName = longName.indexOf('.');
		String shortName = longName;
		if (shName != -1)
			shortName = longName.substring(shName + 1);
		StringBuffer properties = new StringBuffer();
		DBGPDebugFrame stackFrame = this.debugger.stackmanager
				.getStackFrame(level);
		if (stackFrame != null) {
			StringBuffer sb = new StringBuffer();
			boolean previousIsPoint = false;
			for (int i = 0; i < longName.length(); i++) {
				char ch = longName.charAt(i);
				if (ch == '.') {
					previousIsPoint = true;
				} else if (ch == '[' && !previousIsPoint) {
					sb.append('.');
				} else {
					previousIsPoint = false;
				}
				sb.append(ch);
			}
			value = stackFrame.getValue(sb.toString());
		}
		this.debugger.printProperty(shortName, longName, value, properties, 0,
				true);
		this.debugger.printResponse("<response command=\"property_get\"\r\n"
				+ " transaction_id=\"" + options.get("-i") + "\">\r\n"
				+ properties + "</response>\r\n" + "");
	}
}