
import java.io._
class Point1(val xc: Int, val yc: Int) {
   private var x: Int = xc
   private var y: Int = yc
   def getX():Int = x
   def getY():Int= y
   println ("constructor Point1 x location : " + x);
      println ("constructor Point1 y location : " + y);
   def move(dx: Int, dy: Int) {
      x = x + dx
      y = y + dy
      println ("Point1 x location : " + x);
      println ("Point1 y location : " + y);
   }
}

object ClassObjectEx2 {

   def main(args: Array[String]) {
      val point = new Point1(10, 20)
      //Here we are invoking move -- where x nad y values changes here
      point.move(25,65)
      printPoint
      point.move(20,20)
      printPoint
      def printPoint{
         println ("Point1 x location : " + point.getX());
         println ("Point1 y location : " + point.getY());
      }
   }
}