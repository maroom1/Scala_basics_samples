
/*
  #apply-method
  related: #factory-method #companion-object
*/
// sequence: #2 (look at #1 first)

// Shows general use case:how to use apply method as factory method

class A(x:Int)

class B(x:Int) {// this class does not have companion object
def apply()=println("B: no arguments")
def apply(x:Int)=println("B: with arguments")

}
// companion object
object A { // why do we use "object" here, but not "class"? because we want to use "()" method as class' constructor has

  def apply(x:Int) = new A(x) // #factory-method related
  

}
class D{
  {
    
    println("D: locally created")
  }
  
  
}

object D{
  println("D: object")
  def apply()=println("D: no arugments")
  def apply(y:Int)=println("D: with arguments")
  
}
class C{
  locally {
    println("C: locally printed")
    
  }
  
  
}

object C{
  
  def apply()={println("c: no arugments")}
  def apply(x:Int):Int={println("c: with arguments");1}
  
}
object ApplyEx2Factory extends App {

  val a1 = A(1)     // create instance of class A by calling apply method on A object 
  //in order to run the below successfully we have to create companion object like A
  val b1 = new B(2)   // this will not able to compile, we can NOT create an object without using "new"
val b11=b1()
val b13=b1(2) // this and the above line based on the previous example 
  val a2 = new A(1) // same result by calling constructor
 
  // why the difference ?

  //  by using A(1) we do not use method "new" to create an object (it make code more precise/short). And an object looks like a function call
val c1=C() //companion object
val c2=C(1)
val c3=new C() // Locally body is invoked when we create a object with new keyword
 
 val d1=new D() // unamed blocks are invoked during creation of object
val d2=D // printes "D object"  // if we give val d2=D() compile error
val d3=D()
val d4=D(1)

}
/*
B: no arguments
B: with arguments
c: no arugments
c: with arguments
C: locally printed
D: locally created
D: object
D: no arugments
D: with arguments
*/
