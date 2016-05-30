import scala.io.StdIn._

object ExKeyboardInput extends App{
  
  val a:Int = Console.readInt()
  println(a)
  val b = readLine() //import form stdIn
  println(b)
  
  val c= readLine("Enter ANY value", args)
println(c)

}