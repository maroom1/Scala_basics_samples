import java.io._
import java.awt.Point

class Point(val xc: Int, val yc: Int) {
   var x: Int = xc
   var y: Int = yc
   def move(dx: Int, dy: Int) {
      x = x + dx
      y = y + dy
      println ("Point x location : " + x);
      println ("Point y location : " + y);
   }
}

class Location(override val xc: Int, override val yc: Int,
   val zc :Int) extends Point(xc, yc){
   var z: Int = zc

   def move(dx: Int, dy: Int, dz: Int) {
      x = x + dx
      y = y + dy
      z = z + dz
      println ("Point x location : " + x);
      println ("Point y location : " + y);
      println ("Point z location : " + z);
   }
}

object Test {
   def main(args: Array[String]) {
     val pon=new Point(20,30)
     pon.move(30, 40)
      val loc = new Location(10, 20, 15);
      // Move to a new location
      loc.move(10, 10, 5);
      loc.move(50, 60, 80)
   }
}