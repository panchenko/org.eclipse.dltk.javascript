==> formatter.braces.blocks = same.line
==> formatter.indent.blocks = true
==== block-simple
{
a = 100;
}
==
{
	a = 100;
}
==> formatter.indent.blocks = false
==== block-simple-no-indent
{
		b = 100;
}
==
{
b = 100;
}
====