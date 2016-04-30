

object AnonmousClass1 extends App {
  def doSomething = {
    println("hello from the `f1` instance")
    "this is the result of the block of code"
}
 
val f1 = Foo(doSomething)
f1.print1
}