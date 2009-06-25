==> formatter.indent.switch = true
==> formatter.indent.case = true
==> formatter.indent.break = true
==== switch-simple
switch (z) {
					case 99:
case 100:
			d = 5;
break;
default:
break;
}
==
switch (z) {
	case 99:
	case 100:
		d = 5;
		break;
	default:
		break;
}
==== switch-with-empty-default
switch (index) {
case 1:
break;
default:
;
}
==
switch (index) {
	case 1:
		break;
	default:
		;
}
==> formatter.indent.switch = false
==> formatter.indent.case = false
==> formatter.indent.break = false
==== switch-simple-no-indent
switch (x) {
	case 66:
		case 100:
					break;
			default:
								break;
}
==
switch (x) {
case 66:
case 100:
break;
default:
break;
}
====
==> formatter.indent.switch = true
==> formatter.indent.case = true
==> formatter.indent.break = false
==== switch-no-break-indent
switch (y) {
	case 66:
		case 100:
	a = 100;
					break;
			default:
			y = ""
								break;
}
==
switch (y) {
	case 66:
	case 100:
		a = 100;
	break;
	default:
		y = ""
	break;
}
==> formatter.indent.switch = true
==> formatter.indent.case = false
==> formatter.indent.break = true
==== switch-no-case-body-indent
switch (y) {
	case 77:
		case 100:
	a = 100;
					break;
					
			default:
			y = ""
								break;
}
==
switch (y) {
	case 77:
	case 100:
	a = 100;
		break;

	default:
	y = ""
		break;
}
==> formatter.indent.switch = true
==> formatter.indent.case = true
==> formatter.indent.break = true
==> formatter.braces.switch = next.line
==== switch-switch-braces-next-line
switch (y) {
	case 77:
		case 100:
	a = 100;
					break;
					
			default:
			y = ""
								break;
}
==
switch (y)
{
	case 77:
	case 100:
		a = 100;
		break;

	default:
		y = ""
		break;
}
==> formatter.braces.switch = next.line.indented
==== switch-switch-braces-next-line-indented
switch (y) {
	case 77:
		case 100:
	a = 100;
					break;
					
			default:
			y = ""
								break;
}
==
switch (y)
	{
		case 77:
		case 100:
			a = 100;
			break;

		default:
			y = ""
			break;
	}
==== switch-case-same-line
==> formatter.braces.switch = same.line
==> formatter.insertspace.before.lp.function = false
==> formatter.braces.case = same.line
function test() {
switch (x) {
case 0: 
{
return
}
case 1:
return
default:
{
return
}
}
}
==
function test() {
	switch (x) {
		case 0: {
			return
		}
		case 1:
			return
		default: {
			return
		}
	}
}
==== switch-case-next-line
==> formatter.braces.case = next.line
function test() {
switch (x) {
case 0: 
{
return
}
case 1:
return
default:
{
return
}
}
}
==
function test() {
	switch (x) {
		case 0:
		{
			return
		}
		case 1:
			return
		default:
		{
			return
		}
	}
}
==== switch-case-next-line
==> formatter.braces.case = next.line.indented
function test() {
switch (x) {
case 0: 
{
return
}
case 1:
return
default:
{
return
}
}
}
==
function test() {
	switch (x) {
		case 0:
			{
				return
			}
		case 1:
			return
		default:
			{
				return
			}
	}
}
====
