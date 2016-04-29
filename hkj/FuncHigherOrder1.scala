

object FuncHigherOrder1 {
   def main(args: Array[String]) {
      println( apply( layout, 10) )
      println( apply( layout1, 10) )
      println(safeStringOp(null, reverser))
      println(safeStringOp("Ready", reverser))
      

   }
   def safeStringOp(s: String, f: String => String) = {
        if (s != null) f(s) else s
      }
   def reverser(s: String) = s.reverse
   def apply(f: Int => String, v: Int) = f(v)
   def layout[A](x: A) = "[" + x.toString() + "]"
   def layout1[B](x: B) = "[" + x.toString() + "]"
   
}