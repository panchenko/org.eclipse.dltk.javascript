==> formatter.braces.blocks = same.line
==> formatter.indent.blocks = true
==== do-while-simple
do {
			a 	= 	100;
} while (a==		100);
==
do {
	a = 100;
} while (a == 100);
==== do-while-simple-no-semicolon
do {
			a 	= 	100;
} while (a==		100)
==
do {
	a = 100;
} while (a == 100)
==> formatter.braces.blocks = next.line
==> formatter.indent.blocks = false
==== do-while-no-indenting-next-line
do {
	b = 100;
} while (b==100) ;
==
do
{
b = 100;
} while (b == 100);
==> formatter.braces.blocks = next.line
==> formatter.newlines.while = true
==> formatter.indent.blocks = true
==== do-while-next-line
do {
	z = 100;
} while (z==100);
==
do
{
	z = 100;
}
while (z == 100);
==== do-while-same-line
==> formatter.braces.blocks = same.line
==> formatter.newlines.while = false
do
{
z = 100;
}
while (z==100);
==
do {
	z = 100;
} while (z == 100);
====
