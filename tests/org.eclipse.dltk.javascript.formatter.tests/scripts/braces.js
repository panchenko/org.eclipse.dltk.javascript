==== braces-object-initializer
var a = { b		 /**/		:		 100, c: '567'};
==
var a = { b/**/ : 100, c: '567' };
==== braces-object-initializer-2
var _size = {width		: 10, height: 20};
==
var _size = { width: 10, height: 20 };
==== braces-object-initializer-3
var size3 = 
	{
		width		:		 10, 
		height		:					 20
	};
==
var size3 = {
		width: 10,
		height: 20
	};
==== braces-object-initializer-with-comment
// aaaaaaa
var a = { 		b		:		 100		, 			c			:			 '567'		};
==
// aaaaaaa
var a = { b: 100, c: '567' };
====
