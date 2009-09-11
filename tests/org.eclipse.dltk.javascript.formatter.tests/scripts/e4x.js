==== ex4-simple-xml-variable
	var xml =	 		<language>JavaScript</language>;
==
var xml = <language>JavaScript</language>;
==== ex4-simple
	var xml2 =
	 		<language>JavaScript</language>;
==
var xml2 =
	<language>JavaScript</language>;
==== keyword open and a close tag
    function test3()
    {
	    var _xml =      <xml></<xml>;
    }
==
function test3 () {
	var _xml = <xml></<xml>;
}
==== keyword openclose tag
    function test3()
    {
	    var _xml =      <xml/>;
    }
==
function test3 () {
	var _xml = <xml/>;
}
==== none keyword openclose tag
    function test3()
    {
	    var _xml =      <xml2/>;
    }
==
function test3 () {
	var _xml = <xml2/>;
}
==== xml variable usage
	function XMLRPC_request(type, value) {
    	xml = <{type}>value</{type}>;
	}
==
function XMLRPC_request (type, value) {
	xml = <{type}>value</{type}>;
}
