var textFormatters = {
		1: function(node) {
			return 'Deleting deprecated class';
		},
		2: function(node) {
			return 'Error deleting deprecated class';
		},
		3: function(node) {
			return 'Skipping deprecated class';
		}
	};
	
function textFormattersTest() {
	textFormatters[1];
}