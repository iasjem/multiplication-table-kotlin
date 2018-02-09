/*
 * Kotlin version of the Multiplication Table I created on Java
 * See here: https://github.com/iasjem/multiplication-table-java
 * This is my second Kotlin program and I am loving it! :)
 */

fun main(args: Array<String>) {
	var z:Int 
	for (y in 1..12){
		for (x in 1..12){
			z = x*y
			print("$z \t")
		}
		print("\n")
	}
}

// So easy to code! OMG... :O