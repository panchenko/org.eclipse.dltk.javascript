function test1(/* params */) {
	test2()
	return 1
}

function test2(/* params */) {
	test3()
	return 2
}

function test3(/* params */) {
	test1()
	return 3
}

function test4(/* params */) {
    var testArgument = "10";
	test1(testArgument)
	test1(testArgument);
	return 3
}
