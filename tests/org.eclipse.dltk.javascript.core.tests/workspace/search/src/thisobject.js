/**
 * @constructor 
 */
function ReferenceTestObject() {
	this.myfunction = function() {
	}
	this.myfunction;
	
	this.myvariable = 10;
	
	this.myvariable;
}

/**
 * @param {ReferenceTestObject} x
 */
function ReferenceTest(x) {
	x.myfunction();
	x.myvariable;
}