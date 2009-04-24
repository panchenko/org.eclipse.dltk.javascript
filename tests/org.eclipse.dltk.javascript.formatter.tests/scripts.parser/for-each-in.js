
function aaaa()
{

	var sum = 0;
	
	var obj = {prop1: 5, prop2: 13, prop3: 8};
	
	for each (var item in obj) {
	  sum += item;
	}

	for each (item.prop in obj.iterator) {
	  sum += item;
	}

	
	print(sum); // prints "26", which is 5+13+8	
	
	//for each (this in []) { }	
	
	for each(var p in obj)
	{
		alert(p);
	}
	
	for each (var item in obj);

}