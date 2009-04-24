function find_min_distance(points) 
{
	/*
	Find the start and end points between all other points are placed and
	distance is minimal 
	Return start, end and distance
	*/
	distance = 360;
	start = null;
	end = null;
	points.sort(function (a, b) {
		return a - b;
	});
	for (x = 0; x < points.length; x++) 
	{
		if (x == 0) 
		{
			prev = points.length - 1;
		} 
		else 
		{
			prev = x - 1;
		}
		
		switch (x) {
			case 0:
				return ["a"];
				break;
			case 1:
				break;
			case 2:
			case 3:
				s = "abc";
				break;
			default:
				b = 200;
		}
		
		test_distance = find_clockwise_distance(points[x], points[prev]);
		if (test_distance < distance) {
			distance = test_distance;
			start = points[x];
			end = points[prev];
		}
	}
	
	return [start, end, distance];
}
