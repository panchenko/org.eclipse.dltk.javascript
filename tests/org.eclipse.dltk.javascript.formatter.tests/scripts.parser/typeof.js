
function test_typeof()
{
	var myFun = new Function("5+2")
	var shape = "round"
	var size = 1
	var today = new Date()
	
	typeof myFun == 'function'
	typeof shape == 'string'
	typeof size == 'number'
	typeof today == 'object'
	typeof dontExist == 'undefined'
	
	typeof true == 'boolean'
	typeof null == 'object'
	
	typeof 62 == 'number'
	typeof 'Hello world' == 'string'
	
	typeof document.lastModified == 'string'
	typeof window.length == 'number'
	typeof Math.LN2 == 'number'
	
	typeof blur == 'function'
	typeof eval == 'function'
	typeof parseInt == 'function'
	typeof shape.split == 'function'
	
	typeof Date == 'function'
	typeof Function == 'function'
	typeof Math == 'object'
	typeof Object == 'function'
	typeof String == 'function'
}