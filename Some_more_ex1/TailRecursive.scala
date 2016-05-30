

object TailRecursive extends App {
  
  def factorial(c:Int)=factTail(c,1)
  
  def factTail(c:Int,acc:Int):Int = {
        if (c==1){  // Here we can 0 or 1 according to our need because at 1 we will getting our full value 
                       println("accumulator :"+acc)
          acc}
    else {
      
                   println("next first arg :"+ (c-1))
                                println("next second arg :"+ (acc*c))
      factTail(c-1,acc*c)
    }  
    }
  
  println(factorial(3))
}