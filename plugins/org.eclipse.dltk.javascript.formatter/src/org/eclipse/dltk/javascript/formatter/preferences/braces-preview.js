
function find_clockwise_distance(a, b) {
	/* Find shortest distance between a and b */
	if (a < b) {
		return b - a;
	}	else {
		return find_distance(a, 180) + find_distance(-180, b);
	}
}

function find_real_distance(distance) {
	
	var coffees = ["Kenyan", "Columbian", "Kona"];
	var cars = [];
	
	return Math.abs(Math.min(distance, 360 - distance)) 
}

function test_find_real_distance() {
	
	switch (x) {
	case 0: 
		return ["a"];
		break;
		
	case 1:
		break;
	case 2:
	case 3: { 
		s = "abc"; 
		break;	
		}
	default:
		b = 200;
		
	}
	
	assertEqual(find_real_distance(10), 10)
	assertEqual(find_real_distance(180), 180)
	assertEqual(find_real_distance(190), 170)
}
