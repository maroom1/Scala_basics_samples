

object FuncRecursion {

   def main(args: Array[String]) {
      for (i <- 1 to 10)
         println( "Factorial of " + i + ": = " + factorial(i) )
   }
   
   def factorial(n: BigInt):BigInt = {  
     
     if (n <= 1)
         1  
      else    
      n * factorial(n - 1) //IF we didnt specify retrun type of the function we get error here
      // when we are using fucntion for calculation we must specify the return type in println it is optional
   }
}