
// Find the Kth element of a list.

// #list #loop #stable-identifier #tail #head
object ListKthELe extends App {

  def nth(k:Int, list:List[Int]): Int =  {

    def loopToK(list:List[Int], i:Int = 0): Int = i match {
      case `k` => list.head           // #stable-identifier
      case _ => loopToK(list.tail, i+1)
    }

    loopToK(list)

  }
def nth1(k:Int, list:List[Int]): Int =  {
   
  for(i <- 0 to (list.length-1) ){
       if (i==k)
      return list(k)  
  }
  1
}


  println ( nth(2, List(1, 1, 2, 3, 5, 8)) ) // 2
  println(nth1(3,List(1, 1, 2, 3, 5, 8)))
 

}