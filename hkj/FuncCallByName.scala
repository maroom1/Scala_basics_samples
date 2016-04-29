

object FuncCallByName {

   def main(args: Array[String]) {
        welcome(printMe());
        delayed(time());
        
   }

   def time() = {
     println("Getting time in nano seconds")
      System.nanoTime
   }
   def welcome(k: => Unit){ // When I kept Long instead of Any I got an error during calling saying typemismatch
     // you can use Unit or Any depeneds in the return type
     // you can return type by placing cursor in the method
     k    
   }
   def delayed( t: => Long ) = {
      println("In delayed method")
      println("Param: " + t)
      t //here we called again
   }
   def printMe() ={
     println("Hello world")
     
   }
}