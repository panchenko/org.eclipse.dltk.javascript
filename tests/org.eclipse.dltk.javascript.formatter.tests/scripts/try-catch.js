==> formatter.newlines.catch = false
==> formatter.newlines.finally = false
==== try-simple
try {
		throw "Cannot x/0"
} catch(e if e instanceof Error) {
print		("Error")
} catch (e if e instanceof EDivisionByZero) {
			print("Division by zero!")
} catch(e) 
{
	print	("Unknown error")
} finally {
print     ("Successful")
}
==
try {
	throw "Cannot x/0"
} catch (e if e instanceof Error) {
	print("Error")
} catch (e if e instanceof EDivisionByZero) {
	print("Division by zero!")
} catch (e) {
	print("Unknown error")
} finally {
	print("Successful")
}
==> formatter.newlines.catch = true
==> formatter.newlines.finally = true
==== try-simple-new-lines-catch-finally
try {
		throw "Cannot x/0"
} catch(e if e instanceof Error) {
print			("Error")
} catch (e if e instanceof EDivisionByZero) {
			print("Division by zero!")
} catch(e) 
{
	print	("Unknown error")
} finally {
print     ("Successful")
}
==
try {
	throw "Cannot x/0"
}
catch (e if e instanceof Error) {
	print("Error")
}
catch (e if e instanceof EDivisionByZero) {
	print("Division by zero!")
}
catch (e) {
	print("Unknown error")
}
finally {
	print("Successful")
}
====