==== assignments-new-lines
a=1;b=2;c=3;
==
a = 1;
b = 2;
c = 3;
==== switch-new-lines
function hello(){switch(a){case 0:return 0;default:return 1;}}
==
function hello () {
	switch (a) {
		case 0:
			return 0;
		default:
			return 1;
	}
}
==> formatter.statement.new.line = false
==== assignments-no-new-line
a=1;b=2;c=3;
==
a = 1;b = 2;c = 3;
==== switch-no-new-lines
function hello(){switch(a){case 0:return 0;default:return 1;}}
==
function hello () {switch (a) {case 0:return 0;default:return 1;}}
