

object ForLoop2 {

   def main(args: Array[String]) {
      var a = 0;
      var b = 0;
      var c=0; // if we do not specify c=0(initial declaration) in the start it will produce minimul computations
      // for loop execution with a range AXB result (it will display all possible computations)
      for( a <- 1 to 3; b <- 1 to 3; c<- 1 to 3){
         println( "Value of a: " + a );
         println( "Value of b: " + b );
         println( "Value of c: " + c );
      }
   }
}