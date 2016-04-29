

object FuncNamedPar {

   def main(args: Array[String]) {
        printInt(b=5, a=7); // you can pass values to parameters differently specifying the parameter name
   }
   def printInt( a:Int, b:Int ) = {
      println("Value of a : " + a );
      println("Value of b : " + b );
   }
}