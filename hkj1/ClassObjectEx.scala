
import java.io._

class Point(val xc: Int, val yc: Int) {
   var x: Int = xc
   var y: Int = yc
   println ("constructor Point x location : " + x);
      println ("COnstructor Point y location : " + y);
   def move(dx: Int, dy: Int) {
      x = x + dx
      y = y + dy
      println ("Point x location : " + x);
      println ("Point y location : " + y);
   }
}

object ClassObjectEx {
   def main(args: Array[String]) {
      val pt = new Point(10, 20);
      // Move to a new location
      pt.move(10, 10);
      pt.move(65,98)
   }
}