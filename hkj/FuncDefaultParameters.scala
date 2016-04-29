

object FuncDefaultParameters {

   def main(args: Array[String]) {
     println("type 1")
        println( "Returned Value : " + addInt() );
        
        println( "Returned Value : " + addInt(10) );
        
        println( "Returned Value : " + addInt(b=30) );
        
        println( "Returned Value : " + addInt(a=7) );
        
        println( "Returned Value : " + addInt(10,60) );
        println("type 2") // both fucntions are same but different approach
        println( "Returned Value : " + sumInt() );
        
        println( "Returned Value : " + sumInt(10) );
        
        println( "Returned Value : " + sumInt(b=30) );
        
        println( "Returned Value : " + sumInt(a=7) );
        
        println( "Returned Value : " + sumInt(10,60) );
   }
   //If you specify one of the parameters, then first argument will be passed using that parameter 
   //and second will be taken from default value.
   //here 5 and 7 are default values
   def addInt( a:Int=5, b:Int=7 ) = {
      var sum:Int = 0
      a + b

      
   }
   
   def sumInt( a:Int=5, b:Int=7 ) : Int = {
      var sum:Int = 0
      sum = a + b

      return sum
   }
   
}