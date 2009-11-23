==== function-simple
function a       () 
{
return;	
}
==
function a () {
	return;
}
==== function-closure
x=function(element){return typeof element=="string"}
==
x = function (element) {
	return typeof element == "string"
}
==> formatter.indent.function=false
==== function-no-indent
function a () {
return;	
}
==
function a () {
return;
}
==> formatter.indent.function=true
==== function-with-parameters
function a(x) {
return x*x;	
}
==
function a (x) {
	return x * x;
}
==> formatter.indent.function=true
==> formatter.braces.function=next.line
==== function-braces-next-line
function a ( x ) 				{
return x*x;	
}
==
function a (x)
{
	return x * x;
}
==> formatter.indent.function=true
==> formatter.braces.function=next.line.indented
==== function-braces-next-line-indented
function a(x) {
return x*x;	
}
==
function a (x)
	{
		return x * x;
	}
==> formatter.indent.function=true
==> formatter.braces.function=next.line
==== function-no-name
MyObject.prototype.getMessage = function () {
return 			this.			message;			
};
==
MyObject.prototype.getMessage = function ()
{
	return this.message;
};
==> formatter.newlines.empty.method=false
==== function-empty
function 		a		(		) {					
}
==
function a () { }
==== function-empty-with-comment
function 		a		(		) {
// do something
}
==
function a ()
{
	// do something
}
==> formatter.insertspace.before.lp.function = false
==== function-closure
	var x = function ( ) { }
==
var x = function() { }
==== function-closure-new
	var x = new function ( ) { }
==	
var x = new function() { }
====
