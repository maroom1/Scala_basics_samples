

object CollectionsEx extends App{
// Define List of integers.
val x = List(1,2,3,4)

// Define a set.
var x1 = Set(1,3,5,7)

// Define a map.
val x2 = Map("one" -> 1, "two" -> 2, "three" -> 3)

// Create a tuple of two elements.
val x3 = (10, "Scala")

// Define an option
val x4:Option[Int] = Some(5)
println(x.toString())
println(x1.toString())
println(x2.toString())
println(x3.toString())

}