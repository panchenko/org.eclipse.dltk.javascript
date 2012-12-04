function create(o) {
	return o;
}

var value = {};

var supplier = create({
	get : function() {
		return value;
	}
});
