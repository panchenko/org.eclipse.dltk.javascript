==== object-initializer-with-comma
/**
 * @type {Object}
 */
var x = {
};


/**
 * @param {Object} args
 */
function test2(args) {
}
==
/**
 * @type {Object}
 */
var x = { };

/**
 * @param {Object} args
 */
function test2 (args) { }
==== object-initializer-without-comma
/**
 * @type {Object}
 */
var x = {
}


/**
 * @param {Object} args
 */
function test2(args) {
}
==
/**
 * @type {Object}
 */
var x = { }

/**
 * @param {Object} args
 */
function test2 (args) { }
