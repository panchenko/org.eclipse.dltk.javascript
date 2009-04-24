
function test_in()
{

	// Arrays
	var trees = new Array("redwood", "bay", "cedar", "oak", "maple");
	0 in trees        // returns true
	3 in trees        // returns true
	6 in trees        // returns false
	"bay" in trees    // returns false (you must specify the index number,
	                  // not the value at that index)
	"length" in trees // returns true (length is an Array property)
	
	// Predefined objects
	"PI" in Math          // returns true
	
	// Custom objects
	var mycar = {make: "Honda", model: "Accord", year: 1998};
	"make" in mycar  // returns true
	"model" in mycar // returns true
	
	
	
	var color1 = new String("green");
	"length" in color1 // returns true
	var color2 = "coral";
	"length" in color2 // generates an error (color is not a String object)
	
	
	var mycar = {make: "Honda", model: "Accord", year: 1998};
	delete mycar.make;
	"make" in mycar;  // returns false
	
	var trees = new Array("redwood", "bay", "cedar", "oak", "maple");
	delete trees[3];
	3 in trees; // returns false
	
	
	var mycar = {make: "Honda", model: "Accord", year: 1998};
	mycar.make = undefined;
	"make" in mycar;  // returns true
	
	
	var trees = new Array("redwood", "bay", "cedar", "oak", "maple");
	trees[3] = undefined;
	3 in trees; // returns true
	
}	