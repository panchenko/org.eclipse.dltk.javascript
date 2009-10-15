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
