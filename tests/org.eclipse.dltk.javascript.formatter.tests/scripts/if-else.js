==== 1-if-simple
if (a>b) {
a = 100;
}
==
if (a>b) {
	a = 100;
}
==> formatter.indent.blocks = false
==== 2-if-simple-no-indent
if (a>b) {
	a = 100;
}
==
if (a>b) {
a = 100;
}
==> formatter.newlines.else = false
==> formatter.indent.blocks = true
==> formatter.samelines.elseif = true
==== 3-if-elseif-same-line
if (a>b) {
	a = 100;
} else if (a>c) {
	b = 100;
}

if (b>c) {
	c = 100;
} 
else if (d>e) {
	d = 100;
}
==
if (a>b) {
	a = 100;
} else if (a>c) {
	b = 100;
}

if (b>c) {
	c = 100;
} else if (d>e) {
	d = 100;
}
====
==> formatter.braces.blocks = next.line
==> formatter.newlines.else = true
==== 4-if-new-line-else
if (a>b) {
	a = 100;
} else {
	b = 100;
}
==
if (a>b)
{
	a = 100;
}
else
{
	b = 100;
}
==> formatter.braces.blocks = next.line
==> formatter.newlines.else = false
==> formatter.samelines.elseif = false
==== 5-if-new-line-else-if
if ( a1>b1 ) 
{
	a1 = 100;
} else if ( c>d ) {
	b1 = 100;
}
==
if (a1>b1)
{
	a1 = 100;
} else
if (c>d)
{
	b1 = 100;
}
====
