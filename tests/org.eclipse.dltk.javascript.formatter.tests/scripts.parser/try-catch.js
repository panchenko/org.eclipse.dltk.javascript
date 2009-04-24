

function aaaaa()
{
	
	try {
		myroutine(); // may throw three exceptions
		
		throw new IOException("Cannot open file: {0} in mode {1}", fileName, "RW");
		
	} catch (e if e instanceof TypeError) {
		x = 10;
		// statements to handle TypeError exceptions
	} 
	catch (e if e instanceof RangeError) {
		// statements to handle RangeError exceptions
	} catch (e if e instanceof EvalError) {
		// statements to handle EvalError exceptions
	} catch (e) {
		// statements to handle any unspecified exceptions
		logMyErrors(e); // pass exception object to error handler
	} finally {
		// finally
	}
		
		
	try {
		throw "myException"; // generates an exception
	} catch (e) {
		// statements to handle any exceptions
		logMyErrors(e); // pass exception object to error handler
	}
			
	openMyFile()
	try {
	   // tie up a resource
	   writeMyFile(theData);
	} finally {
	   closeMyFile(); // always close the resource
	}			
}