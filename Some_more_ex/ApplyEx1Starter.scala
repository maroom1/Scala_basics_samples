
class ExObject() {
  
  println("invoking constructor")
  def apply(a:Int,b:Int):Int = a+b
  def apply():Unit=println("no arguments to print")
  
}
object ApplyEx1Starter extends App{
var obj=new ExObject()
var k=obj(3,5)
println(k)
var k1=obj()
//println(k1)
}