


// Match one d followed by one or more b's followed by one d
// Remember matched b's and the following d
// Ignore case
function test_regexp()
{
	
	var myRe = /d(b+)(d)/i;
	var myArray = myRe.exec("cdbBdbsbz");

	var myRe2 = /d(b+)(d)/;
	
}