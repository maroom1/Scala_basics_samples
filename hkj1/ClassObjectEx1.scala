import java.io._

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

object ClassObjectEx1 {

   def main(args: Array[String]) {
      val loc = new Location(10, 20, 15);
      //here the point class was created in ClassObjectEx scala file.
val pt=new Point(25,30)
      // Move to a new location
      loc.move(10, 10, 5);
   }
}