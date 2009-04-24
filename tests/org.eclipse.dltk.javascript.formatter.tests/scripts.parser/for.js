

function aaaa()
{

	start:

	for(;;)
	{
		a = 10;
		
		break start;
	}
	
	for(i = 0; i < 10; i++)
	{
		a = 100;
		continue start;
	}

	for(;;);
	
}