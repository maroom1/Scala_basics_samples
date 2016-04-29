

object FuncAnonymous {
  def main(args: Array[String]){
    var inc = (x:Int) => x+1
    var dec=(x:Int)=>x-1
    var mul = (x: Int, y: Int) => x*y
    println(inc(7))
    println(dec(7))
    println(mul(3, 4))
    var userDir = () => { System.getProperty("user.dir") }
    println( userDir )
    
  }
}