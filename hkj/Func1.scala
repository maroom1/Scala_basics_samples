object Func1 {
   def main(args: Array[String]) {
     printme()  
     this.printme()
     Func1.printme();
     
        println( "Returned Value : " + addInt(5,7) );
   }
   def printme(): Unit={
          println("Welcome to scala Functions")
   }
   
   def addInt( a:Int, b:Int ) : Int = {
      var sum:Int = 0
      sum = a + b

      return sum
   }
}