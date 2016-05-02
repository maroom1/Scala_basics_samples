

object StringEx4 extends App {


  // #1 just don't forgot about this.
  {
    val name = "Bob"

    val someString = s"Hello, $name!"  // this is much better that: "Hello" + name + "!"

    println (someString)
    println(s"1 + 1 = ${1 + 1}") // s is the string interpolator use it when  ${} is used with complete quotes as ex 

  }

}