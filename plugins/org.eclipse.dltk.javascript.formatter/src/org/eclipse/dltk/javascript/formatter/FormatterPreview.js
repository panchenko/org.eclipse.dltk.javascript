/**
 * A sample source file for the code formatter preview
 */
 
function CheckZipCode( z ) 
{
	try {
		z = new ZipCode(z);
	} catch (e) {
		if (e instanceof ZipCodeFormatException) {
			return ZIPCODE_INVALID;
		} else {
	         return ZIPCODE_UNKNOWN_ERROR;
		}
	}
	return z;	
	
	zip = new String(zip);
	pattern = /[0-9]{5}([- ]?[0-9]{4})?/;
	if (pattern.test(zip)) {
		// zip code value will be the first match in the string
	    this.value = zip.match(pattern)[0];
	    this.valueOf = function() {
	    	return this.value
	    };
	    this.toString = function() {
	    	return String(this.value)
	    };
	} else {
		throw new ZipCodeFormatException(zip);
	}
		
}