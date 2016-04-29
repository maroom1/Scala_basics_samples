

object FuncRepeatedVariable {
   def main(args: Array[String]) {
        printStrings("Hello", "Scala", "Python");
   }
   //"String*" is actually Array[String]. there is ++ incrementer in Scala
   def printStrings( args:String* ) = {
      var i : Int = 0;
      for( arg <- args ){
         println("Arg value[" + i + "] = " + arg );
         i = i + 1;
      }
   }
}