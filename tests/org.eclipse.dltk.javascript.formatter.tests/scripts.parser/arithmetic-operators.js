

function test_arithmetic_operators()
{

	a++;
	++b;
	
	a = 12/2;
	b = 3 * 4;
	c = 5 % 3;
	
	b--;
	--a;
	
	c = a + b ;
	
	b = c - a;
	
	a = (-b) + (-c);

	sum = ((a + b ) * (c + d)) / round(1.1);

}