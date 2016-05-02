class A1{
  locally{
    println("A1 locally : it is invoked during object creation")
    println("we cannot create Unamed blocks second when there is locally block frist")
  }
 
}

// unamed block is the first block of code .. 
class A2(x:String){
  
  {
   
   println("Unamed block acts like a constructor")
  }
 locally {
   println("locally block with unamed block")
   
}
def this(){
  
  this("auxilary constructor ")
 new A2("l") // when you write this line see the below output2 
}
   
}
object ConstructorEx extends App {
  val a1=new A1()
  val a2=new A2("1")
  val a3=new A2()  // this is running because of def this()
 }

/*
 * A1 locally : it is invoked during object creation
we cannot create Unamed blocks second when there is locally block frist
Unamed block acts like a constructor
locally block with unamed block
Unamed block acts like a constructor
locally block with unamed block
 * 
 * 
  */

//output2
/*
 A1 locally : it is invoked during object creation
we cannot create Unamed blocks second when there is locally block frist
Unamed block acts like a constructor
locally block with unamed block
Unamed block acts like a constructor
locally block with unamed block
Unamed block acts like a constructor
locally block with unamed block
 
*/