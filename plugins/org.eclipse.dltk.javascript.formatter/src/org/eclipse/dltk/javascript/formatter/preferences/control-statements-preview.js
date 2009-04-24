	function foo2() {
		if (true) {
			return;
		}
		if (true) {
			return;
		} else if (false) {
			return;
		} else {
			return;
		}
	}

	function foo(state) {
try {
	throw 'Cannot x/0'
} catch (e if e instanceof Error) {
	print ("Error")
} catch (e if e instanceof EDivisionByZero) {
	print ("Division by zero!")
} catch (e) {
	print ("Unknown error")
} finally {
	print ("Successful")
}
	}
	
	function factorial(value)
	{
		i = 1;
		fn = 1;
		do {
			fn = fn*i;
		} while (i++ == value);	
		
		return fn
	}
