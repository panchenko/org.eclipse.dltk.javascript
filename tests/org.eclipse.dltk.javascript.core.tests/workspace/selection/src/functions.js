var fun1 = function(){};

function test1() {
   fun1();
}
 
function test2() {
	var fun2 = function(){};
	fun2();
}

function test3() {
	var fun3 = function fun4(){};
	fun4();
}

function test4() {
	this.fun5 = function(){};
	fun5();
}

function test5a() {
	this.fun6 = function(){};
}

function test5b() {
	var obj = new test5a();
	obj.fun6();
}

function test6() {
	this.fun7 = function fun8(){};
	fun8();
}

function test7a() {
	this.fun9 = function funA(){};
}

function test7b() {
	var obj = new test7a();
	obj.funA();
}

var initializer1 = {
   funB: function(){}
}

function test8() {
    initializer1.funB();
}


function test8() {
	var initializer2 = {
	   funC: function(){}
	}
    initializer2.funC();
}


