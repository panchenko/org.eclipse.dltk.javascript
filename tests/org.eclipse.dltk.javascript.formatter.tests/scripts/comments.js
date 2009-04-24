==== comment-in-if
if /*A*/ (/*B*/ true /*C*/) /*D*/ {
	a = 100;
}
==
if /*A*/ (/*B*/ true /*C*/) /*D*/ {
	a = 100;
}
==== function-def
function hello /*A*/ (/*B*/ name /*C*/) /*D*/ {
	a = 100;
}
==
function hello /*A*/ (/*B*/ name /*C*/) /*D*/ {
	a = 100;
}
==== EOL-comment
if (true) // always
{
	// do something
}
==
if (true) // always
{
	// do something
}
