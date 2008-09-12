/**
 * 
 */
package org.eclipse.dltk.internal.javascript.typeinference;

/**
 * @author jcompagner
 * 
 */
public class NativeDateReference extends UnknownReference {

	private static UnknownReference toString = new NativeStringReference(
			"toString").setFunctionRef();
	private static UnknownReference toTimeString = new NativeStringReference(
			"toTimeString").setFunctionRef();
	private static UnknownReference toDateString = new NativeStringReference(
			"toDateString").setFunctionRef();
	private static UnknownReference toLocaleString = new NativeStringReference(
			"toLocaleString").setFunctionRef();
	private static UnknownReference toLocaleTimeString = new NativeStringReference(
			"toLocaleTimeString").setFunctionRef();
	private static UnknownReference toLocaleDateString = new NativeStringReference(
			"toLocaleDateString").setFunctionRef();
	private static UnknownReference toUTCString = new NativeStringReference(
			"toUTCString").setFunctionRef();
	private static UnknownReference toSource = new NativeStringReference(
			"toSource").setFunctionRef();
	private static UnknownReference valueOf = new NativeStringReference(
			"valueOf").setFunctionRef();
	private static UnknownReference getTime = new NativeNumberReference(
			"getTime").setFunctionRef();
	private static UnknownReference getYear = new NativeNumberReference(
			"getYear").setFunctionRef();
	private static UnknownReference getFullYear = new NativeNumberReference(
			"getFullYear").setFunctionRef();
	private static UnknownReference getUTCFullYear = new NativeNumberReference(
			"getUTCFullYear").setFunctionRef();
	private static UnknownReference getMonth = new NativeNumberReference(
			"getMonth").setFunctionRef();
	private static UnknownReference getUTCMonth = new NativeNumberReference(
			"getUTCMonth").setFunctionRef();
	private static UnknownReference getDate = new NativeNumberReference(
			"getDate").setFunctionRef();
	private static UnknownReference getUTCDate = new NativeNumberReference(
			"getUTCDate").setFunctionRef();
	private static UnknownReference getDay = new NativeNumberReference("getDay")
			.setFunctionRef();
	private static UnknownReference getUTCDay = new NativeNumberReference(
			"getUTCDay").setFunctionRef();
	private static UnknownReference getHours = new NativeNumberReference(
			"getHours").setFunctionRef();
	private static UnknownReference getUTCHours = new NativeNumberReference(
			"getUTCHours").setFunctionRef();
	private static UnknownReference getMinutes = new NativeNumberReference(
			"getMinutes").setFunctionRef();
	private static UnknownReference getUTCMinutes = new NativeNumberReference(
			"getUTCMinutes").setFunctionRef();
	private static UnknownReference getSeconds = new NativeNumberReference(
			"getSeconds").setFunctionRef();
	private static UnknownReference getUTCSeconds = new NativeNumberReference(
			"getUTCSeconds").setFunctionRef();
	private static UnknownReference getMilliseconds = new NativeNumberReference(
			"getMilliseconds").setFunctionRef();
	private static UnknownReference getUTCMilliseconds = new NativeNumberReference(
			"getUTCMilliseconds").setFunctionRef();
	private static UnknownReference getTimezoneOffset = new NativeNumberReference(
			"getTimezoneOffset").setFunctionRef();
	private static UnknownReference setTime = new NativeNumberReference(
			"setTime").setFunctionRef();
	private static UnknownReference setMilliseconds = new NativeNumberReference(
			"setMilliseconds").setFunctionRef();
	private static UnknownReference setUTCMilliseconds = new NativeNumberReference(
			"setUTCMilliseconds").setFunctionRef();
	private static UnknownReference setSeconds = new NativeNumberReference(
			"setSeconds").setFunctionRef();
	private static UnknownReference setUTCSeconds = new NativeNumberReference(
			"setUTCSeconds").setFunctionRef();
	private static UnknownReference setMinutes = new NativeNumberReference(
			"setMinutes").setFunctionRef();
	private static UnknownReference setUTCMinutes = new NativeNumberReference(
			"setUTCMinutes").setFunctionRef();
	private static UnknownReference setHours = new NativeNumberReference(
			"setHours").setFunctionRef();
	private static UnknownReference setUTCHours = new NativeNumberReference(
			"setUTCHours").setFunctionRef();
	private static UnknownReference setDate = new NativeNumberReference(
			"setDate").setFunctionRef();
	private static UnknownReference setUTCDate = new NativeNumberReference(
			"setUTCDate").setFunctionRef();
	private static UnknownReference setMonth = new NativeNumberReference(
			"setMonth").setFunctionRef();
	private static UnknownReference setUTCMonth = new NativeNumberReference(
			"setUTCMonth").setFunctionRef();
	private static UnknownReference setFullYear = new NativeNumberReference(
			"setFullYear").setFunctionRef();
	private static UnknownReference setUTCFullYear = new NativeNumberReference(
			"setUTCFullYear").setFunctionRef();
	private static UnknownReference setYear = new NativeNumberReference(
			"setYear").setFunctionRef();

	/**
	 * @param paramOrVarName
	 * @param childIsh
	 */
	public NativeDateReference(String paramOrVarName) {
		super(paramOrVarName, false);
		setFunctionRef();
	}

	/**
	 * @see org.eclipse.dltk.internal.javascript.typeinference.UnknownReference#createChilds()
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

		if (ref instanceof UnknownReference) {
			UnknownReference ur = (UnknownReference) ref;
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
				ur
						.setParameterNames(new char[][] { "datestring"
								.toCharArray() });
			} else if (name.equals("setDate")) {
				ur
						.setProposalInfo("Sets the day of the month from a Date object (from 1-31).");
				ur.setParameterNames(new char[][] { "day".toCharArray() });
			} else if (name.equals("setFullYear")) {
				ur.setProposalInfo("Sets the year, as a four-digit number.");
				ur.setParameterNames(new char[][] { "fullyear".toCharArray(),
						"[month]".toCharArray(), "[day]".toCharArray() });
			} else if (name.equals("setHours")) {
				ur.setProposalInfo("Sets the hour of a day (from 0-23).");
				ur.setParameterNames(new char[][] { "hours".toCharArray(),
						"[minutes]".toCharArray(), "[seconds]".toCharArray(),
						"[millis]".toCharArray() });
			} else if (name.equals("setMilliseconds")) {
				ur
						.setProposalInfo("Sets the milliseconds of a Date object (from 0-999).");
				ur.setParameterNames(new char[][] { "millis".toCharArray() });
			} else if (name.equals("setMinutes")) {
				ur.setProposalInfo("Sets the minutes of a date (from 0-59)");
				ur.setParameterNames(new char[][] { "minutes".toCharArray(),
						"[seconds]".toCharArray(), "[millis]".toCharArray() });
			} else if (name.equals("setSeconds")) {
				ur.setProposalInfo("Sets the seconds of a date (from 0-59)");
				ur.setParameterNames(new char[][] { "seconds".toCharArray(),
						"[millis]".toCharArray() });
			} else if (name.equals("setMonth")) {
				ur.setProposalInfo("Sets the month from a date (from 0-11).");
				ur.setParameterNames(new char[][] { "month".toCharArray(),
						"[day]".toCharArray() });
			} else if (name.equals("setTime")) {
				ur
						.setProposalInfo("Sets the number of milliseconds since midnight Jan 1, 1970");
				ur.setParameterNames(new char[][] { "millis".toCharArray() });
			} else if (name.equals("setUTCDate")) {
				ur
						.setProposalInfo("Sets the day of the month from a date according to universal time (from 0-6).");
				ur.setParameterNames(new char[][] { "day".toCharArray() });
			} else if (name.equals("setUTCDay")) {
				ur
						.setProposalInfo("Sets the day of the week from a date according to universal time (from 1-31)");
				ur.setParameterNames(new char[][] { "day".toCharArray() });
			} else if (name.equals("setUTCMonth")) {
				ur
						.setProposalInfo("Sets the month from a Date object according to universal time (from 0-11)");
				ur.setParameterNames(new char[][] { "month".toCharArray(),
						"[day]".toCharArray() });
			} else if (name.equals("setUTCFullYear")) {
				ur
						.setProposalInfo("Sets the four-digit year from a date according to universal time ");
				ur.setParameterNames(new char[][] { "fullyear".toCharArray(),
						"[month]".toCharArray(), "[day]".toCharArray() });
			} else if (name.equals("setUTCHours")) {
				ur
						.setProposalInfo("Sets the hour of a date according to universal time (from 0-23)");
				ur.setParameterNames(new char[][] { "hours".toCharArray(),
						"[minutes]".toCharArray(), "[seconds]".toCharArray(),
						"[millis]".toCharArray() });
			} else if (name.equals("setUTCMinutes")) {
				ur
						.setProposalInfo("Sets the minutes of a date according to universal time (from 0-59)");
				ur.setParameterNames(new char[][] { "minutes".toCharArray(),
						"[seconds]".toCharArray(), "[millis]".toCharArray() });
			} else if (name.equals("setUTCSeconds")) {
				ur
						.setProposalInfo("Sets the seconds of a date according to universal time (from 0-59)");
				ur.setParameterNames(new char[][] { "seconds".toCharArray(),
						"[millis]".toCharArray() });
			} else if (name.equals("setUTCMilliseconds")) {
				ur
						.setProposalInfo("Sets the milliseconds of a date according to universal time (from 0-999)");
				ur.setParameterNames(new char[][] { "millis".toCharArray() });
			} else if (name.equals("setYear")) {
				ur
						.setProposalInfo("Sets the year, as a two-digit or a three/four-digit number, depending on the browser. Use setFullYear() instead!!");
				ur.setParameterNames(new char[][] { "year".toCharArray() });

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
				ur.setParameterNames(new char[][] { "year".toCharArray(),
						"month".toCharArray(), "day".toCharArray(),
						"[hours,minutes,seconds,ms]".toCharArray() });
			}
		}
		super.setChild(key, ref);
	}

}