

object CollectionListTabulate {

   def main(args: Array[String]) {
      // Creates 5 elements using the given function.
      val squares = List.tabulate(6)(n => n * n)
      println( "squares : " + squares  )
      val s = List.tabulate(5,6)(_+_)
      println( "s values : " + s  )

      // 
      val mul = List.tabulate( 4,5 )( _ * _ )      
      println( "mul : " + mul.reverse )
   }
}