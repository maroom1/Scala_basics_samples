

object CollectionTuple {

   def main(args: Array[String]) {
      val t = (4,3,2,1)
      val t1 = (1, "hello", Console)
      val t2 = new Tuple3(1, "hello", Console)
val t3=(3,6)
      val sum = t._1 + t._2 + t._3 + t._4

      println( "Sum of elements: "  + sum )
      t1.productIterator.foreach { x => println("elemement is :"+x) }
      t.productIterator.foreach { x => println("elemement is :"+x) }
       t2.productIterator.foreach { x => println("elemement is :"+x) }
       println(t.toString() + " "+ t1.toString()+" "+t2.toString())
       
       println("Before swapping :"+t3.toString())
       println("Swapped Tuple: " + t3.swap )
              println("After swapping : "+t3.toString())
   }
}