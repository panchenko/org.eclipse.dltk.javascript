==== spaces-string-literals
			a = "   aaaa   ";
b = '   1000   ';
	throw 'Cannot x/0'
==
a = "   aaaa   ";
b = '   1000   ';
throw 'Cannot x/0'
==== var-parenthesis-method-call
var  s  =  (  "A"  )  .  toLowerCase();
==
var s = ("A").toLowerCase();
==> formatter.insertspace.before.lp.if = true
==> formatter.insertspace.after.lp.if = true
==> formatter.insertspace.before.rp.if = true
==> formatter.insertspace.before.lp.for = true
==> formatter.insertspace.after.lp.for = true
==> formatter.insertspace.before.rp.for = true
==> formatter.insertspace.before.lp.switch = true
==> formatter.insertspace.after.lp.switch = true
==> formatter.insertspace.before.rp.switch = true
==> formatter.insertspace.before.lp.while = true
==> formatter.insertspace.after.lp.while = true
==> formatter.insertspace.before.rp.while = true
==> formatter.insertspace.before.lp.call = true
==> formatter.insertspace.after.lp.call = true
==> formatter.insertspace.before.rp.call = true
==> formatter.insertspace.before.lp.expression = true
==> formatter.insertspace.after.lp.expression = true
==> formatter.insertspace.before.rp.expression = true
==> formatter.insertspace.before.lp.function = true
==> formatter.insertspace.after.lp.function = true
==> formatter.insertspace.before.rp.function = true
==> formatter.insertspace.between.parents.empty = true
==> formatter.insertspace.before.lp.catch = true
==> formatter.insertspace.after.lp.catch = true
==> formatter.insertspace.before.rp.catch = true
==> formatter.insertspace.before.lp.with = true
==> formatter.insertspace.after.lp.with = true
==> formatter.insertspace.before.rp.with = true
==== spaces-full 
function q (a, b) {
	return (a + b) * (a + b);
}

function shutdown () {
	alter ( "Shutdown" )
}

while (i++ < 100)
{
	print(i);
}

switch (x)
{
	case 0:
	case 1:
	
	default:
		throw "x is not bit!"
}

for(var i = 0; i < 10; i++)
{
	if (i != 0)
		print(", ");
	
	print(i);
}

with (point)
{
	x = 100;
	y = 200;
}

try {
	throw "Cannot x/0"
} catch (e) {
	alter("Division by zero")
}
==
function q ( a, b ) {
	return ( a + b ) * ( a + b );
}

function shutdown ( ) {
	alter ( "Shutdown" )
}

while ( i++ < 100 ) {
	print ( i );
}

switch ( x ) {
	case 0:
	case 1:

	default:
		throw "x is not bit!"
}

for ( var i = 0; i < 10; i++ ) {
	if ( i != 0 )
		print ( ", " );

	print ( i );
}

with ( point ) {
	x = 100;
	y = 200;
}

try {
	throw "Cannot x/0"
} catch ( e ) {
	alter ( "Division by zero" )
}
====