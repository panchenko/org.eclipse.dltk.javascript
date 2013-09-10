/**
 * @constructor 
 */
function MyConstructor() {
	this.mypublicfunction = function() {
		
	}
	this.myfunction = function() {
		
	}	
	this.myprop = 10;
	this.myval = 11;
}
/**
 * @constructor 
 * @extends {MyConstructor}
 */
function MySubConstructor() {
	this.mypublicfunction = function() {
	}
	
	this.myprop = 11;
}
function test() {
	var x = new MySubConstructor();
	x.mypublicfunction();
	x.myfunction();  
	x.myprop;
	x.myval;
}