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
====
