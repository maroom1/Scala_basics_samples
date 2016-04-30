

object ExtractorEx1 {

   def main(args: Array[String]) {
      
      val x = ExtractorEx1(5)
      println("valu x :"+x)
       

      x match
      {
        
          
         case ExtractorEx1(num) => println(x+" is bigger two times than "+num)
         //unapply is invoked
       
         case _ => println("i cannot calculate")
      }

   }
   def apply(x: Int) = x*2
   def unapply(z: Int): Option[Int] = if (z%2==0) Some(z/2) else None
}