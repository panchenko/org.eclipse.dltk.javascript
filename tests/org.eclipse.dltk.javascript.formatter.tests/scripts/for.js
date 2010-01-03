==> formatter.indent.blocks = true
==== for-simple
for(			i			 = 0; 			i 		< 		10; i++			) {
         a          = 	i 	+ 	100;
}

for			(			; 			; 			)
{
}
==
for (i = 0; i < 10; i++) {
	a = i + 100;
}

for (;;) {
}
==> formatter.indent.blocks = false
==== for-simple-no-indent
for(j = 0; j < 10; j++) {
		b = j + 100;
}
==
for (j = 0; j < 10; j++) {
b = j + 100;
}
==== function-for-each-nextline
function testFormatting(){if(a==10){}else{}for each(var a in {}){}};
==
function testFormatting () {
	if (a == 10) {
	} else {
	}
	for each (var a in { }) {
	}
}
;
==== function-for-loop-nextline
function testFormatting(){if(a==10){}else{}for (var a=0;a<10;a++)){}};
==
function testFormatting () {
	if (a == 10) {
	} else {
	}
	for (var a = 0; a < 10; a++))
	{
	}
}
;
==== for-break
for  (;;)    break;
==
for (;;) break;
==== for-continue
for  (;;)    continue;
==
for (;;) continue;
