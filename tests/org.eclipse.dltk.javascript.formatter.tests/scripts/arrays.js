==== array-simple
	dataSource.addRow (		100			,		 [		200				,	3000		]	);
==
dataSource.addRow(100, [200, 3000]);
==== array-omitted-values-1
var vArray  = [   1      ,2            ,,             ]
==
var vArray = [1, 2, , ]
==== array-omitted-values-2
var vArray  = [    1      ,2            ,,,    3            ]
==
var vArray = [1, 2, , , 3]
====
==> formatter.braces.array = next.line
==== array-brackets-next-line
var vArray  = [    1      ,2  ,  3            ]
==
var vArray =
	[1, 2, 3]
==== return-array-brackets-same-line
return [    1      ,2  ,  3            ]
==
return [1, 2, 3]
====
