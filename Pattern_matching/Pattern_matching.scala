

object Pattern_matching {

   def main(args: Array[String]) {
      println(matchTest(3))
      println(matchTest(2))
      println(matchTest(10))
      println(4 match {
        case 5 => println(5)
        case 4 => println(4)
        case _ => println("default")
      })

   }
   def matchTest(x: Int): String = x match {
      case 1 => "one"
      case 2 => "two"
      case _ => "many"
   }
}