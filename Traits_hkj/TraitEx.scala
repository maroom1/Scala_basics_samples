
trait Equal {
  def isEqual(x: Any): Boolean
  def isNotEqual(x: Any): Boolean = !isEqual(x)
}

class Point2(x1: Int, y1: Int) extends Equal {
  var x: Int = x1
  var y: Int = y1
  def isEqual(obj: Any) =
    obj.isInstanceOf[Point2] &&
    obj.asInstanceOf[Point2].x == x
}

object TraitEx {
   def main(args: Array[String]) {
      val p1 = new Point2(2, 3)
      val p2 = new Point2(2, 3)
      val p3 = new Point2(3, 3)

 val p4=p1
 println(p1.isEqual(p1))
      println(p1.isNotEqual(p4))
      println(p1.isNotEqual(p3))
      println(p1.isNotEqual(2))
   }
}