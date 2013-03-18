/**
 * @param {String} errorMessage
 * @constructor
 */
function SvyException(errorMessage) {
}
/**
 * @protected 
 */
var init = function() {
	Object.prototype = new SvyException("No record was given or the foundset is empty");
	Object.prototype = new SvyException("No related record found");
}()