

object CollectionOptiongetorelse {

   def main(args: Array[String]) {
      val a:Option[Int] = Some(5)
      val b:Option[Int] = None 
      
      println("a.getOrElse(25): " + a.getOrElse(25) )
      println("b.getOrElse(23): " + b.getOrElse(23) )
      
      println("a.getOrElse(nul): " + a.getOrElse(null) )
      println("b.getOrElse(10): " + b.getOrElse(10) )
      
      println("a.getOrElse(null): " + a.getOrElse(null) )
      println("b.getOrElse(null): " + b.getOrElse(null) )
      println("a.isEmpty: " + a.isEmpty )
      println("b.isEmpty: " + b.isEmpty )
      
   }
}