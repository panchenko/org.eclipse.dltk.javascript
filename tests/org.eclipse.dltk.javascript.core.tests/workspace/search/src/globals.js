/**
 * @param {String} url
 * @param {Boolean} [disableAutoAdjustProtocol]
 *
 * @properties={typeid:24,uuid:"24D6B580-BD8F-4BC6-A5CF-587A9E5AC152"}
 */
function addCSSDependancy(url, disableAutoAdjustProtocol) {
	var x= new String(
 {
 	renderHead: function() {
 		convertToExternalURL(url, disableAutoAdjustProtocol)
 	}
 }
 )
}

/**
 * @private 
 * @param {String} url
 * @param {Boolean} [disableAutoAdjustProtocol]
 *
 * @properties={typeid:24,uuid:"E24144E7-D37C-4EE3-AB9B-442C0D710EC2"}
 */
function convertToExternalURL(url, disableAutoAdjustProtocol) {  
}