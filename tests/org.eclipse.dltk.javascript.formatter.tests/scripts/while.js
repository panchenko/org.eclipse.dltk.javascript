==> formatter.braces.blocks = same.line
==> formatter.indent.blocks = true
==== while-simple
while (a==100) 
{
a = 100;
}
==
while (a == 100) {
	a = 100;
}
==> formatter.braces.blocks = next.line
==> formatter.indent.blocks = false
==== while-no-indenting-next-line
while (b==100) {
	b = 100;
}
==
while (b == 100)
{
b = 100;
}
==> formatter.braces.blocks = next.line.indented
==> formatter.indent.blocks = true
==== do-while-next-line-indented
while ( c==100 ) {
	c = 100;
}
==
while (c == 100)
	{
		c = 100;
	}
====