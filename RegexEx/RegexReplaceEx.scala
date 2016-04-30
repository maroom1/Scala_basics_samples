import scala.util.matching.Regex
object RegexReplaceEx {
   def main(args: Array[String]) {
      val pattern = "(S|s)cala".r
      val str = "Scala is scalable and cool"
      val p=new Regex("(S|s)cala")
      println(p replaceFirstIn(str, "Java"))
      println(pattern replaceFirstIn(str, "Java"))
      
      println(p replaceAllIn(str, "Java"))
      
      println(pattern replaceAllIn(str, "Java"))
   }
}