/**
 * 
 */
package org.eclipse.dltk.internal.javascript.typeinference;

/**
 * @author jcompagner
 * 
 */
public class NativeDateReference extends StandardSelfCompletingReference {

	private static StandardSelfCompletingReference toString = new NativeStringReference(
			"toString").setFunctionRef();
	private static StandardSelfCompletingReference toTimeString = new NativeStringReference(
			"toTimeString").setFunctionRef();
	private static StandardSelfCompletingReference toDateString = new NativeStringReference(
			"toDateString").setFunctionRef();
	private static StandardSelfCompletingReference toLocaleString = new NativeStringReference(
			"toLocaleString").setFunctionRef();
	private static StandardSelfCompletingReference toLocaleTimeString = new NativeStringReference(
			"toLocaleTimeString").setFunctionRef();
	private static StandardSelfCompletingReference toLocaleDateString = new NativeStringReference(
			"toLocaleDateString").setFunctionRef();
	private static StandardSelfCompletingReference toUTCString = new NativeStringReference(
			"toUTCString").setFunctionRef();
	private static StandardSelfCompletingReference toSource = new NativeStringReference(
			"toSource").setFunctionRef();
	private static StandardSelfCompletingReference valueOf = new NativeStringReference(
			"valueOf").setFunctionRef();
	private static StandardSelfCompletingReference getTime = new NativeNumberReference(
			"getTime").setFunctionRef();
	private static StandardSelfCompletingReference getYear = new NativeNumberReference(
			"getYear").setFunctionRef();
	private static StandardSelfCompletingReference getFullYear = new NativeNumberReference(
			"getFullYear").setFunctionRef();
	private static StandardSelfCompletingReference getUTCFullYear = new NativeNumberReference(
			"getUTCFullYear").setFunctionRef();
	private static StandardSelfCompletingReference getMonth = new NativeNumberReference(
			"getMonth").setFunctionRef();
	private static StandardSelfCompletingReference getUTCMonth = new NativeNumberReference(
			"getUTCMonth").setFunctionRef();
	private static StandardSelfCompletingReference getDate = new NativeNumberReference(
			"getDate").setFunctionRef();
	private static StandardSelfCompletingReference getUTCDate = new NativeNumberReference(
			"getUTCDate").setFunctionRef();
	private static StandardSelfCompletingReference getDay = new NativeNumberReference(
			"getDay").setFunctionRef();
	private static StandardSelfCompletingReference getUTCDay = new NativeNumberReference(
			"getUTCDay").setFunctionRef();
	private static StandardSelfCompletingReference getHours = new NativeNumberReference(
			"getHours").setFunctionRef();
	private static StandardSelfCompletingReference getUTCHours = new NativeNumberReference(
			"getUTCHours").setFunctionRef();
	private static StandardSelfCompletingReference getMinutes = new NativeNumberReference(
			"getMinutes").setFunctionRef();
	private static StandardSelfCompletingReference getUTCMinutes = new NativeNumberReference(
			"getUTCMinutes").setFunctionRef();
	private static StandardSelfCompletingReference getSeconds = new NativeNumberReference(
			"getSeconds").setFunctionRef();
	private static StandardSelfCompletingReference getUTCSeconds = new NativeNumberReference(
			"getUTCSeconds").setFunctionRef();
	private static StandardSelfCompletingReference getMilliseconds = new NativeNumberReference(
			"getMilliseconds").setFunctionRef();
	private static StandardSelfCompletingReference getUTCMilliseconds = new NativeNumberReference(
			"getUTCMilliseconds").setFunctionRef();
	private static StandardSelfCompletingReference getTimezoneOffset = new NativeNumberReference(
			"getTimezoneOffset").setFunctionRef();
	private static StandardSelfCompletingReference setTime = new NativeNumberReference(
			"setTime").setFunctionRef();
	private static StandardSelfCompletingReference setMilliseconds = new NativeNumberReference(
			"setMilliseconds").setFunctionRef();
	private static StandardSelfCompletingReference setUTCMilliseconds = new NativeNumberReference(
			"setUTCMilliseconds").setFunctionRef();
	private static StandardSelfCompletingReference setSeconds = new NativeNumberReference(
			"setSeconds").setFunctionRef();
	private static StandardSelfCompletingReference setUTCSeconds = new NativeNumberReference(
			"setUTCSeconds").setFunctionRef();
	private static StandardSelfCompletingReference setMinutes = new NativeNumberReference(
			"setMinutes").setFunctionRef();
	private static StandardSelfCompletingReference setUTCMinutes = new NativeNumberReference(
			"setUTCMinutes").setFunctionRef();
	private static StandardSelfCompletingReference setHours = new NativeNumberReference(
			"setHours").setFunctionRef();
	private static StandardSelfCompletingReference setUTCHours = new NativeNumberReference(
			"setUTCHours").setFunctionRef();
	private static StandardSelfCompletingReference setDate = new NativeNumberReference(
			"setDate").setFunctionRef();
	private static StandardSelfCompletingReference setUTCDate = new NativeNumberReference(
			"setUTCDate").setFunctionRef();
	private static StandardSelfCompletingReference setMonth = new NativeNumberReference(
			"setMonth").setFunctionRef();
	private static StandardSelfCompletingReference setUTCMonth = new NativeNumberReference(
			"setUTCMonth").setFunctionRef();
	private static StandardSelfCompletingReference setFullYear = new NativeNumberReference(
			"setFullYear").setFunctionRef();
	private static StandardSelfCompletingReference setUTCFullYear = new NativeNumberReference(
			"setUTCFullYear").setFunctionRef();
	private static StandardSelfCompletingReference setYear = new NativeNumberReference(
			"setYear").setFunctionRef();

	/**
	 * @param paramOrVarName
	 * @param childIsh
	 */
	public NativeDateReference(String paramOrVarName) {
		super(paramOrVarName, false);
	}

	/**
	 * @see org.eclipse.dltk.internal.javascript.typeinference.StandardSelfCompletingReference#createChilds()
	 */
	protected void createChilds() {
		setChild("toString", toString);
		setChild("toTimeString", toTimeString);
		setChild("toDateString", toDateString);
		setChild("toLocaleString", toLocaleString);
		setChild("toLocaleTimeString", toLocaleTimeString);
		setChild("toLocaleDateString", toLocaleDateString);
		setChild("toUTCString", toUTCString);
		setChild("toSource", toSource);
		setChild("valueOf", valueOf);
		setChild("getTime", getTime);
		setChild("getYear", getYear);
		setChild("getFullYear", getFullYear);
		setChild("getUTCFullYear", getUTCFullYear);
		setChild("getMonth", getMonth);
		setChild("getUTCMonth", getUTCMonth);
		setChild("getDate", getDate);
		setChild("getUTCDate", getUTCDate);
		setChild("getDay", getDay);
		setChild("getUTCDay", getUTCDay);
		setChild("getHours", getHours);
		setChild("getUTCHours", getUTCHours);
		setChild("getMinutes", getMinutes);
		setChild("getUTCMinutes", getUTCMinutes);
		setChild("getSeconds", getSeconds);
		setChild("getUTCSeconds", getUTCSeconds);
		setChild("getMilliseconds", getMilliseconds);
		setChild("getUTCMilliseconds", getUTCMilliseconds);
		setChild("getTimezoneOffset", getTimezoneOffset);
		setChild("setTime", setTime);
		setChild("setMilliseconds", setMilliseconds);
		setChild("setUTCMilliseconds", setUTCMilliseconds);
		setChild("setSeconds", setSeconds);
		setChild("setUTCSeconds", setUTCSeconds);
		setChild("setMinutes", setMinutes);
		setChild("setUTCMinutes", setUTCMinutes);
		setChild("setHours", setHours);
		setChild("setUTCHours", setUTCHours);
		setChild("setDate", setDate);
		setChild("setUTCDate", setUTCDate);
		setChild("setMonth", setMonth);
		setChild("setUTCMonth", setUTCMonth);
		setChild("setFullYear", setFullYear);
		setChild("setUTCFullYear", setUTCFullYear);
		setChild("setYear", setYear);
	}

	public void setChild(String key, IReference ref) {

		if (ref instanceof StandardSelfCompletingReference) {
			StandardSelfCompletingReference ur = (StandardSelfCompletingReference) ref;
			String name = ref.getName();
			if (name.equals("toString")) {
				ur.setProposalInfo("Returns a String value for this object.");
			} else if (name.equals("toSource")) {
				ur
						.setProposalInfo("The toSource() method represents the source code of an object.");
			} else if (name.equals("valueOf")) {
				ur
						.setProposalInfo("Returns the primitive value of a String object.");
			} else if (name.equals("getDate")) {
				ur
						.setProposalInfo("Returns the day of the month from a Date object (from 1-31).");
			} else if (name.equals("getDay")) {
				ur
						.setProposalInfo("Returns the day of the week from a Date object (from 0-6).");
			} else if (name.equals("getFullYear")) {
				ur.setProposalInfo("Returns the year, as a four-digit number.");
			} else if (name.equals("getHours")) {
				ur.setProposalInfo("Returns the hour of a day (from 0-23).");
			} else if (name.equals("getMilliseconds")) {
				ur
						.setProposalInfo("Returns the milliseconds of a Date object (from 0-999).");
			} else if (name.equals("getMinutes")) {
				ur.setProposalInfo("Returns the minutes of a date (from 0-59)");
			} else if (name.equals("getSeconds")) {
				ur.setProposalInfo("Returns the seconds of a date (from 0-59)");
			} else if (name.equals("getMonth")) {
				ur
						.setProposalInfo("Returns the month from a date (from 0-11).");
			} else if (name.equals("getTime")) {
				ur
						.setProposalInfo("Returns the number of milliseconds since midnight Jan 1, 1970");
			} else if (name.equals("getTimezoneOffset")) {
				ur
						.setProposalInfo("Returns the difference in minutes between local time and Greenwich Mean Time (GMT).");
			} else if (name.equals("getUTCDate")) {
				ur
						.setProposalInfo("Returns the day of the month from a date according to universal time (from 0-6).");
			} else if (name.equals("getUTCDay")) {
				ur
						.setProposalInfo("Returns the day of the week from a date according to universal time (from 1-31)");
			} else if (name.equals("getUTCMonth")) {
				ur
						.setProposalInfo("Returns the month from a Date object according to universal time (from 0-11)");
			} else if (name.equals("getUTCFullYear")) {
				ur
						.setProposalInfo("Returns the four-digit year from a date according to universal time ");
			} else if (name.equals("getUTCHours")) {
				ur
						.setProposalInfo("Returns the hour of a date according to universal time (from 0-23)");
			} else if (name.equals("getUTCMinutes")) {
				ur
						.setProposalInfo("Returns the minutes of a date according to universal time (from 0-59)");
			} else if (name.equals("getUTCSeconds")) {
				ur
						.setProposalInfo("Returns the seconds of a date according to universal time (from 0-59)");
			} else if (name.equals("getUTCMilliseconds")) {
				ur
						.setProposalInfo("Returns the milliseconds of a date according to universal time (from 0-999)");
			} else if (name.equals("getYear")) {
				ur
						.setProposalInfo("Returns the year, as a two-digit or a three/four-digit number, depending on the browser. Use getFullYear() instead!!");
			} else if (name.equals("parse")) {
				ur
						.setProposalInfo("Takes a date string and returns the number of milliseconds since midnight of January 1, 1970.");
				ur.setParameterNames(new String[] { "datestring" });
			} else if (name.equals("setDate")) {
				ur
						.setProposalInfo("Sets the day of the month from a Date object (from 1-31).");
				ur.setParameterNames(new String[] { "day" });
			} else if (name.equals("setFullYear")) {
				ur.setProposalInfo("Sets the year, as a four-digit number.");
				ur.setParameterNames(new String[] { "fullyear", "[month]",
						"[day]" });
			} else if (name.equals("setHours")) {
				ur.setProposalInfo("Sets the hour of a day (from 0-23).");
				ur.setParameterNames(new String[] { "hours", "[minutes]",
						"[seconds]", "[millis]" });
			} else if (name.equals("setMilliseconds")) {
				ur
						.setProposalInfo("Sets the milliseconds of a Date object (from 0-999).");
				ur.setParameterNames(new String[] { "millis" });
			} else if (name.equals("setMinutes")) {
				ur.setProposalInfo("Sets the minutes of a date (from 0-59)");
				ur.setParameterNames(new String[] { "minutes", "[seconds]",
						"[millis]" });
			} else if (name.equals("setSeconds")) {
				ur.setProposalInfo("Sets the seconds of a date (from 0-59)");
				ur.setParameterNames(new String[] { "seconds", "[millis]" });
			} else if (name.equals("setMonth")) {
				ur.setProposalInfo("Sets the month from a date (from 0-11).");
				ur.setParameterNames(new String[] { "month", "[day]" });
			} else if (name.equals("setTime")) {
				ur
						.setProposalInfo("Sets the number of milliseconds since midnight Jan 1, 1970");
				ur.setParameterNames(new String[] { "millis" });
			} else if (name.equals("setUTCDate")) {
				ur
						.setProposalInfo("Sets the day of the month from a date according to universal time (from 0-6).");
				ur.setParameterNames(new String[] { "day" });
			} else if (name.equals("setUTCDay")) {
				ur
						.setProposalInfo("Sets the day of the week from a date according to universal time (from 1-31)");
				ur.setParameterNames(new String[] { "day" });
			} else if (name.equals("setUTCMonth")) {
				ur
						.setProposalInfo("Sets the month from a Date object according to universal time (from 0-11)");
				ur.setParameterNames(new String[] { "month", "[day]" });
			} else if (name.equals("setUTCFullYear")) {
				ur
						.setProposalInfo("Sets the four-digit year from a date according to universal time ");
				ur.setParameterNames(new String[] { "fullyear", "[month]",
						"[day]" });
			} else if (name.equals("setUTCHours")) {
				ur
						.setProposalInfo("Sets the hour of a date according to universal time (from 0-23)");
				ur.setParameterNames(new String[] { "hours", "[minutes]",
						"[seconds]", "[millis]" });
			} else if (name.equals("setUTCMinutes")) {
				ur
						.setProposalInfo("Sets the minutes of a date according to universal time (from 0-59)");
				ur.setParameterNames(new String[] { "minutes", "[seconds]",
						"[millis]" });
			} else if (name.equals("setUTCSeconds")) {
				ur
						.setProposalInfo("Sets the seconds of a date according to universal time (from 0-59)");
				ur.setParameterNames(new String[] { "seconds", "[millis]" });
			} else if (name.equals("setUTCMilliseconds")) {
				ur
						.setProposalInfo("Sets the milliseconds of a date according to universal time (from 0-999)");
				ur.setParameterNames(new String[] { "millis" });
			} else if (name.equals("setYear")) {
				ur
						.setProposalInfo("Sets the year, as a two-digit or a three/four-digit number, depending on the browser. Use setFullYear() instead!!");
				ur.setParameterNames(new String[] { "year" });

			} else if (name.equals("toDateString")) {
				ur
						.setProposalInfo("Returns the date portion of a Date object in readable form");
			} else if (name.equals("toGMTString")) {
				ur
						.setProposalInfo("Converts a Date object, according to Greenwich time, to a string. Use toUTCString() instead!!");
			} else if (name.equals("toLocaleDateString")) {
				ur
						.setProposalInfo("Converts a Date object, according to local time, to a string and returns the date portion.");
			} else if (name.equals("toLocaleTimeString")) {
				ur
						.setProposalInfo("Converts a Date object, according to local time, to a string and returns the time portion.");
			} else if (name.equals("toLocaleString")) {
				ur
						.setProposalInfo("Converts a Date object, according to local time, to a string.");
			} else if (name.equals("toTimeString")) {
				ur
						.setProposalInfo("Returns the time portion of a Date object in readable form.");
			} else if (name.equals("toUTCString")) {
				ur
						.setProposalInfo("Converts a Date object, according to universal time, to a string.");
			} else if (name.equals("UTC")) {
				ur
						.setProposalInfo("Takes a date and returns the number of milliseconds since midnight of January 1, 1970 according to universal time.");
				ur.setParameterNames(new String[] { "year", "month", "day",
						"[hours,minutes,seconds,ms]" });
			}
		}
		super.setChild(key, ref);
	}

}