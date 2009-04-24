

function test_arrays()
{
	
	var arr1 = new Array(arrayLength);
	var arr2 = new Array(element0, element1, elementN);
	
	var lit = [element0, element1, elementN];
	
	var coffees = ["Kenyan", "Columbian", "Kona"];
	
	var myArray = new Array("Hello", myVar, 3.14159);
	var myArray2 = new Array("Wind", "Rain", "Fire");

	var billingMethod = new Array(5);
	
	{
		var musicTypes = new Array(25);
		musicTypes[0] = "R&B";
		musicTypes[1] = "Blues";
		musicTypes[2] = "Jazz";
	}
	
	var colors = new Array();
	colors[99] = "midnightblue";
	
	var msgArray = new Array();
	msgArray[0] = "Hello";
	msgArray[99] = "world";

	if (msgArray.length == 100)
	   print("The length is 100.");
	
	var board = 
		[ ['R','N','B','Q','K','B','N','R'],
		  ['P','P','P','P','P','P','P','P'],
		  [' ',' ',' ',' ',' ',' ',' ',' '],
		  [' ',' ',' ',' ',' ',' ',' ',' '],
		  [' ',' ',' ',' ',' ',' ',' ',' '],
		  [' ',' ',' ',' ',' ',' ',' ',' '],
		  ['p','p','p','p','p','p','p','p'],
		  ['r','n','b','q','k','b','n','r']];
		print(board.join('\n') + '\n\n');

		// Move King's Pawn forward 2
		board[3][4] = board[1][4];
		board[1][4] = ' ';
		print(board.join('\n'));	
	
	board[1,2] = "a";
		
}