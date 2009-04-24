
function test_deleting()
{

	delete variableName;
	delete objectExpression.property;
	delete objectExpression["property"];
	delete objectExpression[index];
	delete property // legal only within a with statement	
	
	trees=new Array("redwood","bay","cedar","oak","maple")
	delete trees[3]
	if (3 in trees) {
	   // this does not get executed
	}	
	
	with(window)
	{
		delete children;
	}
	
	x = 42;        // assigns as property of global object
	var y = 43;    // declares as variable
	myobj = new Number()
	myobj.h = 4    // create property h
	myobj.k = 5    // create property k
	
	delete x       // returns true (can delete if declared implicitly)
	delete y       // returns false (cannot delete if declared with var, property is DontDelete)
	delete Math.PI // returns false (cannot delete most predefined properties, declared DontDelete)
	delete myobj.h // returns true (can delete user-defined properties)
	with(myobj) { 
	  delete k;    // returns true (equivalent to delete myobj.k)
	} 
	delete myobj   // returns true (can delete if declared implicitly, equivalent to x)
	
	trees=new Array("redwood","bay","cedar","oak","maple")
	trees[3]=undefined
	if (3 in trees) {
	   // this gets executed
	}	
}

function Foo(){}

function FooTest()
{
	Foo.prototype.bar = 42;
	var foo = new Foo();
	delete foo.bar;           // but doesn't do anything
	alert(foo.bar);           // alerts 42, property inherited
	delete Foo.prototype.bar; // deletes property on prototype
	alert(foo.bar);           // alerts "undefined", property no longer inherited
}