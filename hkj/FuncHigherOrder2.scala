

object FuncHigherOrder2 {
  def main(args: Array[String]) {
    println("Initial")
    println(sum3(1, 2, 3))
    println(mul3(1, 2, 3))
    println(min3(1, 2, 3))
    println("Higher order func example with anonmyous func")
    println(comb(1, 2, 3, (x, y, z) => x + y + z))
    println(comb(1, 2, 3, (x, y, z) => x * y * z))
    println(comb(1, 2, 3, (x, y, z) => x min y min z)) //4 argument is the anonymous fucntion which dont have name
    println("Higher order func example with defined func")
    println(comb(1, 2, 3, sum3))
    println(comb(1, 2, 3, mul3))
    println(comb(1, 2, 3, min3))
    println("Higher order func example with anonmyous func")
    println(comb3(1, 2, 3, (x, y) => x + y))
    println(comb3(1, 2, 3, (x, y) => x * y))
    println(comb3(1, 2, 3, (x, y) => x min y))
    println(comb3(1, 2, 3, (x, y) => x max y))
    println("Higher order func example with lambda func")
    println(comb3(1, 2, 3, _ + _))
    println(comb3(1, 2, 3, _ * _))
    println(comb3(1, 2, 3, _ min _))
    println(comb3(1, 2, 3, _ max _))
    

  }
  def sum3(x: Double, y: Double, z: Double) = x + y + z;
  def mul3(x: Double, y: Double, z: Double) = x * y * z;
  def min3(x: Double, y: Double, z: Double) = x min y min z;
  def comb(x: Double, y: Double, z: Double, f: (Double, Double, Double) => Double) = f(x, y, z)
  //number of arguments passed and type of arugment as output
  def comb3(x: Double, y: Double, z: Double, f: (Double, Double) => Double) = f(f(x, y), z)
  
 // def comb4(x: Double, y: Double, z: Double, f:(Double*) => Double) = f(x, y, z) we use Double* only for collections
  
 //def comb5(x: any, y: any, z: any, f: (any, any) => any) = f(f(x, y), z) I tried to implement even though I got error

}