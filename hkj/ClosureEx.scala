object ClosureEx {
   def main(args: Array[String]) {
      println( "muliplier(1) value = " +  multiplier(1) )
      println( "muliplier(2) value = " +  multiplier(2) )
      println(ex(8))
   }
   var factor = 3
   var sum=5
   val multiplier = (i:Int) => i * factor
   val ex=(j:Int)=>j+sum
}