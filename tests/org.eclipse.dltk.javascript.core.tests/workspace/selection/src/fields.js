var object = new function() {
	this.aa = 10;
	this.bb = 11;
};

var z = object.aa

function test1() {
	var y = object2.cc;
}

var object2 = new function() {
	this.cc = 10;
};
