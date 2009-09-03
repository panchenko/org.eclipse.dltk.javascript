==== string-literals
			a = "   aaaa   ";
b = '   1000   ';
==
a = "   aaaa   ";
b = '   1000   ';
==== multiline-string-literals
	function test() {
			a = "1\
2\
3";
		}
==
function test () {
	a = "1\
2\
3";
}
====
