

object ForLoop1 {
    def main(args: Array[String]) {
     println("Type 1")
      var a = 0;
      // for loop execution with a range
      for( a <- 1 to 10){
         println( "Value of a: " + a );
      }
      println("Type 2")
      var b = 0;
      // for loop execution with a range
      for( b <- 1 until 10){
         println( "Value of b: " + b );
      }
   }
}