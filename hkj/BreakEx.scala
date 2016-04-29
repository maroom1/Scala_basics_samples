import scala.util.control._

/*// import following package
import scala.util.control._

// create a Breaks object as follows
val loop = new Breaks;

// Keep the loop inside breakable as follows
loop.breakable{
    // Loop will go here
    for(...){
       ....
       // Break will go here
       loop.break;
   }
}
 * */

object BreakEx {
   def main(args: Array[String]) {
      var a = 0;
      val numList = List(1,2,3,4,5,6,7,8,9,10);

      val loop = new Breaks;
      loop.breakable {
         for( a <- numList){
            println( "Value of a: " + a );
            if( a == 4 ){
               loop.break;
            } 
         }
      }
      println( "After the loop" );
   }
}