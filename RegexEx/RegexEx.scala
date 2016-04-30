import scala.util.matching.Regex
//import scala.collection.parallel.ParIterableLike.Foreach

object RegexEx {
   def main(args: Array[String]) {
      val pattern = "Scala".r
      val str = "Scala is Scalable and cool"
      println(pattern)
      println(pattern findFirstIn str)
      pattern.findFirstIn(str).foreach { x => println(x) }
      pattern findFirstIn str foreach println
   }
}