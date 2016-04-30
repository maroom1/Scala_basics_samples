
import scala.util.matching.Regex

object RegexEx1 {
   def main(args: Array[String]) {
      val pattern = new Regex("(S|s)cala")
      val str = "Scala is scalable and cool"
      
      println((pattern findAllIn str).mkString(","))
      pattern findAllIn str foreach println
   }
}